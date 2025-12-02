package net.sqlcipher.database;

import android.text.TextUtils;
import android.util.Log;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import net.sqlcipher.Cursor;
import net.sqlcipher.DatabaseUtils;
import net.sqlcipher.database.SQLiteDatabase;

public class SQLiteQueryBuilder {
    private static final String TAG = "SQLiteQueryBuilder";
    private static final Pattern sLimitPattern = Pattern.compile("\\s*\\d+\\s*(,\\s*\\d+\\s*)?");
    private boolean mDistinct = false;
    private SQLiteDatabase.CursorFactory mFactory = null;
    private Map<String, String> mProjectionMap = null;
    private boolean mStrictProjectionMap;
    private String mTables = "";
    private StringBuilder mWhereClause = null;

    private static void appendClause(StringBuilder sb, String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            sb.append(str);
            sb.append(str2);
        }
    }

    private static void appendClauseEscapeClause(StringBuilder sb, String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            sb.append(str);
            DatabaseUtils.appendEscapedSQLString(sb, str2);
        }
    }

    public static void appendColumns(StringBuilder sb, String[] strArr) {
        int length = strArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            String str = strArr[i4];
            if (str != null) {
                if (i4 > 0) {
                    sb.append(", ");
                }
                sb.append(str);
            }
        }
        sb.append(' ');
    }

    public static String buildQueryString(boolean z4, String str, String[] strArr, String str2, String str3, String str4, String str5, String str6) {
        if (TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
            throw new IllegalArgumentException("HAVING clauses are only permitted when using a groupBy clause");
        } else if (TextUtils.isEmpty(str6) || sLimitPattern.matcher(str6).matches()) {
            StringBuilder sb = new StringBuilder(120);
            sb.append("SELECT ");
            if (z4) {
                sb.append("DISTINCT ");
            }
            if (strArr == null || strArr.length == 0) {
                sb.append("* ");
            } else {
                appendColumns(sb, strArr);
            }
            sb.append("FROM ");
            sb.append(str);
            appendClause(sb, " WHERE ", str2);
            appendClause(sb, " GROUP BY ", str3);
            appendClause(sb, " HAVING ", str4);
            appendClause(sb, " ORDER BY ", str5);
            appendClause(sb, " LIMIT ", str6);
            return sb.toString();
        } else {
            throw new IllegalArgumentException("invalid LIMIT clauses:" + str6);
        }
    }

    private String[] computeProjection(String[] strArr) {
        int i4 = 0;
        if (strArr == null || strArr.length <= 0) {
            Map<String, String> map = this.mProjectionMap;
            if (map == null) {
                return null;
            }
            Set<Map.Entry<String, String>> entrySet = map.entrySet();
            String[] strArr2 = new String[entrySet.size()];
            for (Map.Entry next : entrySet) {
                if (!((String) next.getKey()).equals("_count")) {
                    strArr2[i4] = (String) next.getValue();
                    i4++;
                }
            }
            return strArr2;
        } else if (this.mProjectionMap == null) {
            return strArr;
        } else {
            String[] strArr3 = new String[strArr.length];
            int length = strArr.length;
            while (i4 < length) {
                String str = strArr[i4];
                String str2 = this.mProjectionMap.get(str);
                if (str2 != null) {
                    strArr3[i4] = str2;
                } else if (this.mStrictProjectionMap || (!str.contains(" AS ") && !str.contains(" as "))) {
                    throw new IllegalArgumentException("Invalid column " + strArr[i4]);
                } else {
                    strArr3[i4] = str;
                }
                i4++;
            }
            return strArr3;
        }
    }

    public void appendWhere(CharSequence charSequence) {
        if (this.mWhereClause == null) {
            this.mWhereClause = new StringBuilder(charSequence.length() + 16);
        }
        if (this.mWhereClause.length() == 0) {
            this.mWhereClause.append('(');
        }
        this.mWhereClause.append(charSequence);
    }

    public void appendWhereEscapeString(String str) {
        if (this.mWhereClause == null) {
            this.mWhereClause = new StringBuilder(str.length() + 16);
        }
        if (this.mWhereClause.length() == 0) {
            this.mWhereClause.append('(');
        }
        DatabaseUtils.appendEscapedSQLString(this.mWhereClause, str);
    }

    public String buildQuery(String[] strArr, String str, String[] strArr2, String str2, String str3, String str4, String str5) {
        String[] computeProjection = computeProjection(strArr);
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = this.mWhereClause;
        boolean z4 = sb2 != null && sb2.length() > 0;
        if (z4) {
            sb.append(this.mWhereClause.toString());
            sb.append(')');
        }
        if (str != null && str.length() > 0) {
            if (z4) {
                sb.append(" AND ");
            }
            sb.append('(');
            sb.append(str);
            sb.append(')');
        }
        return buildQueryString(this.mDistinct, this.mTables, computeProjection, sb.toString(), str2, str3, str4, str5);
    }

    public String buildUnionQuery(String[] strArr, String str, String str2) {
        StringBuilder sb = new StringBuilder(128);
        int length = strArr.length;
        String str3 = this.mDistinct ? " UNION " : " UNION ALL ";
        for (int i4 = 0; i4 < length; i4++) {
            if (i4 > 0) {
                sb.append(str3);
            }
            sb.append(strArr[i4]);
        }
        appendClause(sb, " ORDER BY ", str);
        appendClause(sb, " LIMIT ", str2);
        return sb.toString();
    }

    public String buildUnionSubQuery(String str, String[] strArr, Set<String> set, int i4, String str2, String str3, String[] strArr2, String str4, String str5) {
        String str6 = str;
        String[] strArr3 = strArr;
        int length = strArr3.length;
        String[] strArr4 = new String[length];
        for (int i5 = 0; i5 < length; i5++) {
            String str7 = strArr3[i5];
            if (str7.equals(str)) {
                strArr4[i5] = "'" + str2 + "' AS " + str;
                Set<String> set2 = set;
                int i6 = i4;
            } else {
                String str8 = str2;
                Set<String> set3 = set;
                if (i5 <= i4 || set.contains(str7)) {
                    strArr4[i5] = str7;
                } else {
                    strArr4[i5] = "NULL AS " + str7;
                }
            }
        }
        return buildQuery(strArr4, str3, strArr2, str4, str5, (String) null, (String) null);
    }

    public String getTables() {
        return this.mTables;
    }

    public Cursor query(SQLiteDatabase sQLiteDatabase, String[] strArr, String str, String[] strArr2, String str2, String str3, String str4) {
        return query(sQLiteDatabase, strArr, str, strArr2, str2, str3, str4, (String) null);
    }

    public void setCursorFactory(SQLiteDatabase.CursorFactory cursorFactory) {
        this.mFactory = cursorFactory;
    }

    public void setDistinct(boolean z4) {
        this.mDistinct = z4;
    }

    public void setProjectionMap(Map<String, String> map) {
        this.mProjectionMap = map;
    }

    public void setStrictProjectionMap(boolean z4) {
        this.mStrictProjectionMap = z4;
    }

    public void setTables(String str) {
        this.mTables = str;
    }

    public Cursor query(SQLiteDatabase sQLiteDatabase, String[] strArr, String str, String[] strArr2, String str2, String str3, String str4, String str5) {
        if (this.mTables == null) {
            return null;
        }
        String buildQuery = buildQuery(strArr, str, strArr2, str2, str3, str4, str5);
        if (Log.isLoggable(TAG, 3)) {
            Log.d(TAG, "Performing query: " + buildQuery);
        }
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        String[] strArr3 = strArr2;
        return sQLiteDatabase.rawQueryWithFactory(this.mFactory, buildQuery, strArr2, SQLiteDatabase.findEditTable(this.mTables));
    }
}
