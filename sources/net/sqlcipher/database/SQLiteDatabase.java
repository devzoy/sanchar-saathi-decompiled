package net.sqlcipher.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.CancellationSignal;
import android.os.Debug;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import java.io.File;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Pattern;
import net.sqlcipher.CrossProcessCursorWrapper;
import net.sqlcipher.Cursor;
import net.sqlcipher.CursorWrapper;
import net.sqlcipher.DatabaseErrorHandler;
import net.sqlcipher.DatabaseUtils;
import net.sqlcipher.database.SQLiteDebug;
import y0.g;
import y0.j;

public class SQLiteDatabase extends SQLiteClosable implements g {
    private static final String COMMIT_SQL = "COMMIT;";
    public static final int CONFLICT_ABORT = 2;
    public static final int CONFLICT_FAIL = 3;
    public static final int CONFLICT_IGNORE = 4;
    public static final int CONFLICT_NONE = 0;
    public static final int CONFLICT_REPLACE = 5;
    public static final int CONFLICT_ROLLBACK = 1;
    private static final String[] CONFLICT_VALUES = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};
    public static final int CREATE_IF_NECESSARY = 268435456;
    private static final Pattern EMAIL_IN_DB_PATTERN = Pattern.compile("[\\w\\.\\-]+@[\\w\\.\\-]+");
    private static final int EVENT_DB_CORRUPT = 75004;
    private static final int EVENT_DB_OPERATION = 52000;
    static final String GET_LOCK_LOG_PREFIX = "GETLOCK:";
    private static final String KEY_ENCODING = "UTF-8";
    private static final int LOCK_ACQUIRED_WARNING_THREAD_TIME_IN_MS = 100;
    private static final int LOCK_ACQUIRED_WARNING_TIME_IN_MS = 300;
    private static final int LOCK_ACQUIRED_WARNING_TIME_IN_MS_ALWAYS_PRINT = 2000;
    private static final int LOCK_WARNING_WINDOW_IN_MS = 20000;
    private static final String LOG_SLOW_QUERIES_PROPERTY = "db.log.slow_query_threshold";
    public static final int MAX_SQL_CACHE_SIZE = 250;
    private static final int MAX_WARNINGS_ON_CACHESIZE_CONDITION = 1;
    public static final String MEMORY = ":memory:";
    public static final int NO_LOCALIZED_COLLATORS = 16;
    public static final int OPEN_READONLY = 1;
    public static final int OPEN_READWRITE = 0;
    private static final int OPEN_READ_MASK = 1;
    private static final int QUERY_LOG_SQL_LENGTH = 64;
    private static final int SLEEP_AFTER_YIELD_QUANTUM = 1000;
    public static final String SQLCIPHER_ANDROID_VERSION = "4.5.4";
    public static final int SQLITE_MAX_LIKE_PATTERN_LENGTH = 50000;
    private static final String TAG = "Database";
    private static WeakHashMap<SQLiteDatabase, Object> sActiveDatabases = new WeakHashMap<>();
    private static int sQueryLogTimeInMillis = 0;
    private int mCacheFullWarnings;
    Map<String, SQLiteCompiledSql> mCompiledQueries;
    private final DatabaseErrorHandler mErrorHandler;
    private CursorFactory mFactory;
    private int mFlags;
    private boolean mInnerTransactionIsSuccessful;
    private long mLastLockMessageTime;
    private String mLastSqlStatement;
    private final ReentrantLock mLock;
    private long mLockAcquiredThreadTime;
    private long mLockAcquiredWallTime;
    private boolean mLockingEnabled;
    private int mMaxSqlCacheSize;
    long mNativeHandle;
    private int mNumCacheHits;
    private int mNumCacheMisses;
    private String mPath;
    private String mPathForLogs;
    private WeakHashMap<SQLiteClosable, Object> mPrograms;
    private final int mSlowQueryThreshold;
    private Throwable mStackTrace;
    private final Map<String, SyncUpdateInfo> mSyncUpdateInfo;
    int mTempTableSequence;
    private String mTimeClosed;
    private String mTimeOpened;
    private boolean mTransactionIsSuccessful;
    private SQLiteTransactionListener mTransactionListener;

    public interface CursorFactory {
        Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery);
    }

    public interface LibraryLoader {
        void loadLibraries(String... strArr);
    }

    public enum SQLiteDatabaseTransactionType {
        Deferred,
        Immediate,
        Exclusive
    }

    public static class SyncUpdateInfo {
        String deletedTable;
        String foreignKey;
        String masterTable;

        public SyncUpdateInfo(String str, String str2, String str3) {
            this.masterTable = str;
            this.deletedTable = str2;
            this.foreignKey = str3;
        }
    }

    public SQLiteDatabase(String str, char[] cArr, CursorFactory cursorFactory, int i4) {
        this(str, cursorFactory, i4, (DatabaseErrorHandler) null);
        openDatabaseInternal(cArr, (SQLiteDatabaseHook) null);
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void beginTransactionWithListenerInternal(net.sqlcipher.database.SQLiteTransactionListener r3, net.sqlcipher.database.SQLiteDatabase.SQLiteDatabaseTransactionType r4) {
        /*
            r2 = this;
            r2.lockForced()
            boolean r0 = r2.isOpen()
            if (r0 == 0) goto L_0x0067
            java.util.concurrent.locks.ReentrantLock r0 = r2.mLock     // Catch:{ all -> 0x001f }
            int r0 = r0.getHoldCount()     // Catch:{ all -> 0x001f }
            r1 = 1
            if (r0 <= r1) goto L_0x0021
            boolean r3 = r2.mInnerTransactionIsSuccessful     // Catch:{ all -> 0x001f }
            if (r3 != 0) goto L_0x0017
            return
        L_0x0017:
            java.lang.String r3 = "Cannot call beginTransaction between calling setTransactionSuccessful and endTransaction"
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch:{ all -> 0x001f }
            r4.<init>(r3)     // Catch:{ all -> 0x001f }
            throw r4     // Catch:{ all -> 0x001f }
        L_0x001f:
            r3 = move-exception
            goto L_0x0063
        L_0x0021:
            net.sqlcipher.database.SQLiteDatabase$SQLiteDatabaseTransactionType r0 = net.sqlcipher.database.SQLiteDatabase.SQLiteDatabaseTransactionType.Exclusive     // Catch:{ all -> 0x001f }
            if (r4 != r0) goto L_0x002b
            java.lang.String r4 = "BEGIN EXCLUSIVE;"
            r2.execSQL(r4)     // Catch:{ all -> 0x001f }
            goto L_0x003e
        L_0x002b:
            net.sqlcipher.database.SQLiteDatabase$SQLiteDatabaseTransactionType r0 = net.sqlcipher.database.SQLiteDatabase.SQLiteDatabaseTransactionType.Immediate     // Catch:{ all -> 0x001f }
            if (r4 != r0) goto L_0x0035
            java.lang.String r4 = "BEGIN IMMEDIATE;"
            r2.execSQL(r4)     // Catch:{ all -> 0x001f }
            goto L_0x003e
        L_0x0035:
            net.sqlcipher.database.SQLiteDatabase$SQLiteDatabaseTransactionType r0 = net.sqlcipher.database.SQLiteDatabase.SQLiteDatabaseTransactionType.Deferred     // Catch:{ all -> 0x001f }
            if (r4 != r0) goto L_0x0053
            java.lang.String r4 = "BEGIN DEFERRED;"
            r2.execSQL(r4)     // Catch:{ all -> 0x001f }
        L_0x003e:
            r2.mTransactionListener = r3     // Catch:{ all -> 0x001f }
            r2.mTransactionIsSuccessful = r1     // Catch:{ all -> 0x001f }
            r4 = 0
            r2.mInnerTransactionIsSuccessful = r4     // Catch:{ all -> 0x001f }
            if (r3 == 0) goto L_0x0052
            r3.onBegin()     // Catch:{ RuntimeException -> 0x004b }
            goto L_0x0052
        L_0x004b:
            r3 = move-exception
            java.lang.String r4 = "ROLLBACK;"
            r2.execSQL(r4)     // Catch:{ all -> 0x001f }
            throw r3     // Catch:{ all -> 0x001f }
        L_0x0052:
            return
        L_0x0053:
            java.lang.String r3 = "%s is an unsupported transaction type"
            java.lang.Object[] r4 = new java.lang.Object[]{r4}     // Catch:{ all -> 0x001f }
            java.lang.String r3 = java.lang.String.format(r3, r4)     // Catch:{ all -> 0x001f }
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x001f }
            r4.<init>(r3)     // Catch:{ all -> 0x001f }
            throw r4     // Catch:{ all -> 0x001f }
        L_0x0063:
            r2.unlockForced()
            throw r3
        L_0x0067:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "database not open"
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: net.sqlcipher.database.SQLiteDatabase.beginTransactionWithListenerInternal(net.sqlcipher.database.SQLiteTransactionListener, net.sqlcipher.database.SQLiteDatabase$SQLiteDatabaseTransactionType):void");
    }

    private void checkLockHoldTime() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j4 = elapsedRealtime - this.mLockAcquiredWallTime;
        int i4 = (j4 > 2000 ? 1 : (j4 == 2000 ? 0 : -1));
        if ((i4 < 0 && !Log.isLoggable(TAG, 2) && elapsedRealtime - this.mLastLockMessageTime < 20000) || j4 <= 300) {
            return;
        }
        if (((int) ((Debug.threadCpuTimeNanos() - this.mLockAcquiredThreadTime) / 1000000)) > LOCK_ACQUIRED_WARNING_THREAD_TIME_IN_MS || i4 > 0) {
            this.mLastLockMessageTime = elapsedRealtime;
            boolean z4 = SQLiteDebug.DEBUG_SQL_STATEMENTS;
        }
    }

    private void closeClosable() {
        deallocCachedSqlStatements();
        for (Map.Entry<SQLiteClosable, Object> key : this.mPrograms.entrySet()) {
            SQLiteClosable sQLiteClosable = (SQLiteClosable) key.getKey();
            if (sQLiteClosable != null) {
                sQLiteClosable.onAllReferencesReleasedFromContainer();
            }
        }
    }

    private boolean containsNull(char[] cArr) {
        if (cArr == null || cArr.length <= 0) {
            return false;
        }
        for (char c4 : cArr) {
            if (c4 == 0) {
                return true;
            }
        }
        return false;
    }

    public static SQLiteDatabase create(CursorFactory cursorFactory, String str) {
        return openDatabase(MEMORY, str == null ? null : str.toCharArray(), cursorFactory, (int) CREATE_IF_NECESSARY);
    }

    private native void dbclose();

    private native void dbopen(String str, int i4);

    private void deallocCachedSqlStatements() {
        synchronized (this.mCompiledQueries) {
            try {
                for (SQLiteCompiledSql releaseSqlStatement : this.mCompiledQueries.values()) {
                    releaseSqlStatement.releaseSqlStatement();
                }
                this.mCompiledQueries.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private native void enableSqlProfiling(String str);

    private native void enableSqlTracing(String str);

    public static String findEditTable(String str) {
        if (!TextUtils.isEmpty(str)) {
            int indexOf = str.indexOf(32);
            int indexOf2 = str.indexOf(44);
            return (indexOf <= 0 || (indexOf >= indexOf2 && indexOf2 >= 0)) ? indexOf2 > 0 ? (indexOf2 < indexOf || indexOf < 0) ? str.substring(0, indexOf2) : str : str : str.substring(0, indexOf);
        }
        throw new IllegalStateException("Invalid tables");
    }

    private static ArrayList<SQLiteDatabase> getActiveDatabases() {
        ArrayList<SQLiteDatabase> arrayList = new ArrayList<>();
        synchronized (sActiveDatabases) {
            arrayList.addAll(sActiveDatabases.keySet());
        }
        return arrayList;
    }

    public static byte[] getBytes(char[] cArr) {
        if (cArr == null || cArr.length == 0) {
            return null;
        }
        ByteBuffer encode = Charset.forName(KEY_ENCODING).encode(CharBuffer.wrap(cArr));
        byte[] bArr = new byte[encode.limit()];
        encode.get(bArr);
        return bArr;
    }

    public static char[] getChars(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        CharBuffer decode = Charset.forName(KEY_ENCODING).decode(ByteBuffer.wrap(bArr));
        char[] cArr = new char[decode.limit()];
        decode.get(cArr);
        return cArr;
    }

    public static ArrayList<SQLiteDebug.DbStats> getDbStats() {
        String str;
        ArrayList<SQLiteDebug.DbStats> arrayList = new ArrayList<>();
        Iterator<SQLiteDatabase> it = getActiveDatabases().iterator();
        while (it.hasNext()) {
            SQLiteDatabase next = it.next();
            if (next != null && next.isOpen()) {
                int native_getDbLookaside = next.native_getDbLookaside();
                String path = next.getPath();
                int lastIndexOf = path.lastIndexOf("/");
                String substring = path.substring(lastIndexOf != -1 ? lastIndexOf + 1 : 0);
                ArrayList<Pair<String, String>> attachedDbs = getAttachedDbs(next);
                if (attachedDbs != null) {
                    for (int i4 = 0; i4 < attachedDbs.size(); i4++) {
                        Pair pair = attachedDbs.get(i4);
                        long pragmaVal = getPragmaVal(next, ((String) pair.first) + ".page_count;");
                        if (i4 == 0) {
                            str = substring;
                        } else {
                            String str2 = "  (attached) " + ((String) pair.first);
                            if (((String) pair.second).trim().length() > 0) {
                                int lastIndexOf2 = ((String) pair.second).lastIndexOf("/");
                                StringBuilder sb = new StringBuilder();
                                sb.append(str2);
                                sb.append(" : ");
                                sb.append(((String) pair.second).substring(lastIndexOf2 != -1 ? lastIndexOf2 + 1 : 0));
                                str2 = sb.toString();
                            }
                            str = str2;
                            native_getDbLookaside = 0;
                        }
                        if (pragmaVal > 0) {
                            arrayList.add(new SQLiteDebug.DbStats(str, pragmaVal, next.getPageSize(), native_getDbLookaside));
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    private String getPathForLogs() {
        String str = this.mPathForLogs;
        if (str != null) {
            return str;
        }
        String str2 = this.mPath;
        if (str2 == null) {
            return null;
        }
        if (str2.indexOf(QUERY_LOG_SQL_LENGTH) == -1) {
            this.mPathForLogs = this.mPath;
        } else {
            this.mPathForLogs = EMAIL_IN_DB_PATTERN.matcher(this.mPath).replaceAll("XX@YY");
        }
        return this.mPathForLogs;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static long getPragmaVal(net.sqlcipher.database.SQLiteDatabase r4, java.lang.String r5) {
        /*
            boolean r0 = r4.isOpen()
            if (r0 != 0) goto L_0x0009
            r4 = 0
            return r4
        L_0x0009:
            r0 = 0
            net.sqlcipher.database.SQLiteStatement r1 = new net.sqlcipher.database.SQLiteStatement     // Catch:{ all -> 0x002b }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x002b }
            r2.<init>()     // Catch:{ all -> 0x002b }
            java.lang.String r3 = "PRAGMA "
            r2.append(r3)     // Catch:{ all -> 0x002b }
            r2.append(r5)     // Catch:{ all -> 0x002b }
            java.lang.String r5 = r2.toString()     // Catch:{ all -> 0x002b }
            r1.<init>(r4, r5)     // Catch:{ all -> 0x002b }
            long r4 = r1.simpleQueryForLong()     // Catch:{ all -> 0x0028 }
            r1.close()
            return r4
        L_0x0028:
            r4 = move-exception
            r0 = r1
            goto L_0x002c
        L_0x002b:
            r4 = move-exception
        L_0x002c:
            if (r0 == 0) goto L_0x0031
            r0.close()
        L_0x0031:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: net.sqlcipher.database.SQLiteDatabase.getPragmaVal(net.sqlcipher.database.SQLiteDatabase, java.lang.String):long");
    }

    private Pair<Boolean, String> getResultFromPragma(String str) {
        Pair<Boolean, String> pair = new Pair<>(Boolean.FALSE, "");
        Cursor rawQuery = rawQuery(str, new Object[0]);
        if (rawQuery == null) {
            return pair;
        }
        if (rawQuery.moveToFirst()) {
            pair = new Pair<>(Boolean.TRUE, rawQuery.getString(0));
        }
        rawQuery.close();
        return pair;
    }

    private String getTime() {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS ", Locale.US).format(Long.valueOf(System.currentTimeMillis()));
    }

    /* access modifiers changed from: private */
    public native void key(byte[] bArr);

    private void keyDatabase(SQLiteDatabaseHook sQLiteDatabaseHook, Runnable runnable) {
        if (sQLiteDatabaseHook != null) {
            sQLiteDatabaseHook.preKey(this);
        }
        if (runnable != null) {
            runnable.run();
        }
        if (sQLiteDatabaseHook != null) {
            sQLiteDatabaseHook.postKey(this);
        }
        if (SQLiteDebug.DEBUG_SQL_CACHE) {
            this.mTimeOpened = getTime();
        }
        Cursor rawQuery = rawQuery("select count(*) from sqlite_master;", new String[0]);
        if (rawQuery != null) {
            rawQuery.moveToFirst();
            rawQuery.getInt(0);
            rawQuery.close();
        }
    }

    /* access modifiers changed from: private */
    public native void key_mutf8(char[] cArr);

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.util.zip.ZipInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.util.zip.ZipInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.util.zip.ZipInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: java.util.zip.ZipInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: java.util.zip.ZipInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v13, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: java.util.zip.ZipInputStream} */
    /* JADX WARNING: type inference failed for: r6v2, types: [java.io.OutputStream] */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: type inference failed for: r6v6 */
    /* JADX WARNING: type inference failed for: r6v9 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x007f A[Catch:{ all -> 0x005a }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x008a A[SYNTHETIC, Splitter:B:45:0x008a] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0092 A[Catch:{ IOException -> 0x008e }] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void loadICUData(android.content.Context r5, java.io.File r6) {
        /*
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "icu"
            r0.<init>(r6, r1)
            java.io.File r6 = new java.io.File
            java.lang.String r1 = "icudt46l.dat"
            r6.<init>(r0, r1)
            r1 = 0
            boolean r2 = r0.exists()     // Catch:{ Exception -> 0x001d, all -> 0x0019 }
            if (r2 != 0) goto L_0x0021
            r0.mkdirs()     // Catch:{ Exception -> 0x001d, all -> 0x0019 }
            goto L_0x0021
        L_0x0019:
            r5 = move-exception
            r6 = r1
            goto L_0x0088
        L_0x001d:
            r5 = move-exception
            r0 = r1
            goto L_0x0079
        L_0x0021:
            boolean r0 = r6.exists()     // Catch:{ Exception -> 0x001d, all -> 0x0019 }
            if (r0 != 0) goto L_0x0060
            java.util.zip.ZipInputStream r0 = new java.util.zip.ZipInputStream     // Catch:{ Exception -> 0x001d, all -> 0x0019 }
            android.content.res.AssetManager r5 = r5.getAssets()     // Catch:{ Exception -> 0x001d, all -> 0x0019 }
            java.lang.String r2 = "icudt46l.zip"
            java.io.InputStream r5 = r5.open(r2)     // Catch:{ Exception -> 0x001d, all -> 0x0019 }
            r0.<init>(r5)     // Catch:{ Exception -> 0x001d, all -> 0x0019 }
            r0.getNextEntry()     // Catch:{ Exception -> 0x005e }
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x005e }
            r5.<init>(r6)     // Catch:{ Exception -> 0x005e }
            r1 = 1024(0x400, float:1.435E-42)
            byte[] r1 = new byte[r1]     // Catch:{ Exception -> 0x0053, all -> 0x004d }
        L_0x0042:
            int r2 = r0.read(r1)     // Catch:{ Exception -> 0x0053, all -> 0x004d }
            if (r2 <= 0) goto L_0x0058
            r3 = 0
            r5.write(r1, r3, r2)     // Catch:{ Exception -> 0x0053, all -> 0x004d }
            goto L_0x0042
        L_0x004d:
            r6 = move-exception
            r1 = r0
            r4 = r6
            r6 = r5
            r5 = r4
            goto L_0x0088
        L_0x0053:
            r1 = move-exception
            r4 = r1
            r1 = r5
            r5 = r4
            goto L_0x0079
        L_0x0058:
            r1 = r0
            goto L_0x0061
        L_0x005a:
            r5 = move-exception
            r6 = r1
            r1 = r0
            goto L_0x0088
        L_0x005e:
            r5 = move-exception
            goto L_0x0079
        L_0x0060:
            r5 = r1
        L_0x0061:
            if (r1 == 0) goto L_0x0069
            r1.close()     // Catch:{ IOException -> 0x0067 }
            goto L_0x0069
        L_0x0067:
            r5 = move-exception
            goto L_0x0072
        L_0x0069:
            if (r5 == 0) goto L_0x0078
            r5.flush()     // Catch:{ IOException -> 0x0067 }
            r5.close()     // Catch:{ IOException -> 0x0067 }
            goto L_0x0078
        L_0x0072:
            java.lang.RuntimeException r6 = new java.lang.RuntimeException
            r6.<init>(r5)
            throw r6
        L_0x0078:
            return
        L_0x0079:
            boolean r2 = r6.exists()     // Catch:{ all -> 0x005a }
            if (r2 == 0) goto L_0x0082
            r6.delete()     // Catch:{ all -> 0x005a }
        L_0x0082:
            java.lang.RuntimeException r6 = new java.lang.RuntimeException     // Catch:{ all -> 0x005a }
            r6.<init>(r5)     // Catch:{ all -> 0x005a }
            throw r6     // Catch:{ all -> 0x005a }
        L_0x0088:
            if (r1 == 0) goto L_0x0090
            r1.close()     // Catch:{ IOException -> 0x008e }
            goto L_0x0090
        L_0x008e:
            r5 = move-exception
            goto L_0x0099
        L_0x0090:
            if (r6 == 0) goto L_0x009f
            r6.flush()     // Catch:{ IOException -> 0x008e }
            r6.close()     // Catch:{ IOException -> 0x008e }
            goto L_0x009f
        L_0x0099:
            java.lang.RuntimeException r6 = new java.lang.RuntimeException
            r6.<init>(r5)
            throw r6
        L_0x009f:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: net.sqlcipher.database.SQLiteDatabase.loadICUData(android.content.Context, java.io.File):void");
    }

    public static synchronized void loadLibs(Context context) {
        synchronized (SQLiteDatabase.class) {
            loadLibs(context, context.getFilesDir());
        }
    }

    private void lockForced() {
        this.mLock.lock();
        if (SQLiteDebug.DEBUG_LOCK_TIME_TRACKING && this.mLock.getHoldCount() == 1) {
            this.mLockAcquiredWallTime = SystemClock.elapsedRealtime();
            this.mLockAcquiredThreadTime = Debug.threadCpuTimeNanos();
        }
    }

    private native int native_getDbLookaside();

    private native void native_rawExecSQL(String str);

    private native int native_status(int i4, boolean z4);

    public static SQLiteDatabase openDatabase(String str, String str2, CursorFactory cursorFactory, int i4) {
        return openDatabase(str, str2, cursorFactory, i4, (SQLiteDatabaseHook) null);
    }

    private void openDatabaseInternal(char[] cArr, SQLiteDatabaseHook sQLiteDatabaseHook) {
        openDatabaseInternal(getBytes(cArr), sQLiteDatabaseHook);
    }

    public static SQLiteDatabase openOrCreateDatabase(File file, String str, CursorFactory cursorFactory, SQLiteDatabaseHook sQLiteDatabaseHook) {
        return openOrCreateDatabase(file, str, cursorFactory, sQLiteDatabaseHook, (DatabaseErrorHandler) null);
    }

    private native void rekey(byte[] bArr);

    public static native int releaseMemory();

    public static native void setICURoot(String str);

    private void unlockForced() {
        if (SQLiteDebug.DEBUG_LOCK_TIME_TRACKING && this.mLock.getHoldCount() == 1) {
            checkLockHoldTime();
        }
        this.mLock.unlock();
    }

    private boolean yieldIfContendedHelper(boolean z4, long j4) {
        if (this.mLock.getQueueLength() == 0) {
            this.mLockAcquiredWallTime = SystemClock.elapsedRealtime();
            this.mLockAcquiredThreadTime = Debug.threadCpuTimeNanos();
            return false;
        }
        setTransactionSuccessful();
        SQLiteTransactionListener sQLiteTransactionListener = this.mTransactionListener;
        endTransaction();
        if (!z4 || !isDbLockedByCurrentThread()) {
            if (j4 > 0) {
                while (j4 > 0) {
                    try {
                        Thread.sleep(j4 < 1000 ? j4 : 1000);
                    } catch (InterruptedException unused) {
                        Thread.interrupted();
                    }
                    j4 -= 1000;
                    if (this.mLock.getQueueLength() == 0) {
                        break;
                    }
                }
            }
            beginTransactionWithListener(sQLiteTransactionListener);
            return true;
        }
        throw new IllegalStateException("Db locked more than once. yielfIfContended cannot yield");
    }

    public void addSQLiteClosable(SQLiteClosable sQLiteClosable) {
        lock();
        try {
            this.mPrograms.put(sQLiteClosable, (Object) null);
        } finally {
            unlock();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0031, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void addToCompiledQueries(java.lang.String r4, net.sqlcipher.database.SQLiteCompiledSql r5) {
        /*
            r3 = this;
            int r0 = r3.mMaxSqlCacheSize
            if (r0 != 0) goto L_0x0007
            boolean r4 = net.sqlcipher.database.SQLiteDebug.DEBUG_SQL_STATEMENTS
            return
        L_0x0007:
            java.util.Map<java.lang.String, net.sqlcipher.database.SQLiteCompiledSql> r0 = r3.mCompiledQueries
            monitor-enter(r0)
            java.util.Map<java.lang.String, net.sqlcipher.database.SQLiteCompiledSql> r1 = r3.mCompiledQueries     // Catch:{ all -> 0x0016 }
            java.lang.Object r1 = r1.get(r4)     // Catch:{ all -> 0x0016 }
            net.sqlcipher.database.SQLiteCompiledSql r1 = (net.sqlcipher.database.SQLiteCompiledSql) r1     // Catch:{ all -> 0x0016 }
            if (r1 == 0) goto L_0x0018
            monitor-exit(r0)     // Catch:{ all -> 0x0016 }
            return
        L_0x0016:
            r4 = move-exception
            goto L_0x0032
        L_0x0018:
            java.util.Map<java.lang.String, net.sqlcipher.database.SQLiteCompiledSql> r1 = r3.mCompiledQueries     // Catch:{ all -> 0x0016 }
            int r1 = r1.size()     // Catch:{ all -> 0x0016 }
            int r2 = r3.mMaxSqlCacheSize     // Catch:{ all -> 0x0016 }
            if (r1 != r2) goto L_0x0029
            int r4 = r3.mCacheFullWarnings     // Catch:{ all -> 0x0016 }
            int r4 = r4 + 1
            r3.mCacheFullWarnings = r4     // Catch:{ all -> 0x0016 }
            goto L_0x0030
        L_0x0029:
            java.util.Map<java.lang.String, net.sqlcipher.database.SQLiteCompiledSql> r1 = r3.mCompiledQueries     // Catch:{ all -> 0x0016 }
            r1.put(r4, r5)     // Catch:{ all -> 0x0016 }
            boolean r4 = net.sqlcipher.database.SQLiteDebug.DEBUG_SQL_STATEMENTS     // Catch:{ all -> 0x0016 }
        L_0x0030:
            monitor-exit(r0)     // Catch:{ all -> 0x0016 }
            return
        L_0x0032:
            monitor-exit(r0)     // Catch:{ all -> 0x0016 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: net.sqlcipher.database.SQLiteDatabase.addToCompiledQueries(java.lang.String, net.sqlcipher.database.SQLiteCompiledSql):void");
    }

    public void beginTransaction() {
        beginTransactionWithListener((SQLiteTransactionListener) null);
    }

    public void beginTransactionNonExclusive() {
        beginTransactionWithListenerInternal((SQLiteTransactionListener) null, SQLiteDatabaseTransactionType.Immediate);
    }

    public void beginTransactionWithListener(SQLiteTransactionListener sQLiteTransactionListener) {
        beginTransactionWithListenerInternal(sQLiteTransactionListener, SQLiteDatabaseTransactionType.Exclusive);
    }

    public void beginTransactionWithListenerNonExclusive(SQLiteTransactionListener sQLiteTransactionListener) {
        beginTransactionWithListenerInternal(sQLiteTransactionListener, SQLiteDatabaseTransactionType.Immediate);
    }

    public void changePassword(String str) {
        if (!isOpen()) {
            throw new SQLiteException("database not open");
        } else if (str != null) {
            byte[] bytes = getBytes(str.toCharArray());
            rekey(bytes);
            Arrays.fill(bytes, (byte) 0);
        }
    }

    public void close() {
        if (isOpen()) {
            lock();
            try {
                closeClosable();
                onAllReferencesReleased();
            } finally {
                unlock();
            }
        }
    }

    public int delete(String str, String str2, String[] strArr) {
        return delete(str, str2, (Object[]) strArr);
    }

    public void disableWriteAheadLogging() {
        if (!inTransaction()) {
            rawExecSQL("PRAGMA journal_mode = DELETE;");
            return;
        }
        throw new IllegalStateException("Write Ahead Logging cannot be disabled while in a transaction");
    }

    public boolean enableWriteAheadLogging() {
        if (!inTransaction()) {
            ArrayList<Pair<String, String>> attachedDbs = getAttachedDbs(this);
            if ((attachedDbs != null && attachedDbs.size() > 1) || isReadOnly() || getPath().equals(MEMORY)) {
                return false;
            }
            rawExecSQL("PRAGMA journal_mode = WAL;");
            return true;
        }
        throw new IllegalStateException("Write Ahead Logging cannot be enabled while in a transaction");
    }

    public void endTransaction() {
        RuntimeException e4;
        if (!isOpen()) {
            throw new IllegalStateException("database not open");
        } else if (this.mLock.isHeldByCurrentThread()) {
            try {
                if (this.mInnerTransactionIsSuccessful) {
                    this.mInnerTransactionIsSuccessful = false;
                } else {
                    this.mTransactionIsSuccessful = false;
                }
                if (this.mLock.getHoldCount() != 1) {
                    this.mTransactionListener = null;
                    unlockForced();
                    return;
                }
                SQLiteTransactionListener sQLiteTransactionListener = this.mTransactionListener;
                if (sQLiteTransactionListener != null) {
                    if (this.mTransactionIsSuccessful) {
                        sQLiteTransactionListener.onCommit();
                    } else {
                        sQLiteTransactionListener.onRollback();
                    }
                }
                e4 = null;
                if (this.mTransactionIsSuccessful) {
                    execSQL(COMMIT_SQL);
                } else {
                    try {
                        execSQL("ROLLBACK;");
                        if (e4 != null) {
                            throw e4;
                        }
                    } catch (SQLException unused) {
                    }
                }
                this.mTransactionListener = null;
                unlockForced();
            } catch (RuntimeException e5) {
                e4 = e5;
                this.mTransactionIsSuccessful = false;
            } catch (Throwable th) {
                this.mTransactionListener = null;
                unlockForced();
                throw th;
            }
        } else {
            throw new IllegalStateException("no transaction pending");
        }
    }

    public /* bridge */ /* synthetic */ void execPerConnectionSQL(String str, Object[] objArr) {
        super.execPerConnectionSQL(str, objArr);
    }

    public void execSQL(String str) {
        SystemClock.uptimeMillis();
        lock();
        try {
            if (isOpen()) {
                native_execSQL(str);
                unlock();
                return;
            }
            throw new IllegalStateException("database not open");
        } catch (SQLiteDatabaseCorruptException e4) {
            onCorruption();
            throw e4;
        } catch (Throwable th) {
            unlock();
            throw th;
        }
    }

    public void finalize() {
        if (isOpen()) {
            closeClosable();
            onAllReferencesReleased();
        }
    }

    public List<Pair<String, String>> getAttachedDbs() {
        return getAttachedDbs(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x001d, code lost:
        if (r2 == false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x001f, code lost:
        r3.mNumCacheHits++;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0025, code lost:
        r3.mNumCacheMisses++;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002a, code lost:
        r0 = net.sqlcipher.database.SQLiteDebug.DEBUG_SQL_STATEMENTS;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002c, code lost:
        return r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public net.sqlcipher.database.SQLiteCompiledSql getCompiledStatementForSql(java.lang.String r4) {
        /*
            r3 = this;
            java.util.Map<java.lang.String, net.sqlcipher.database.SQLiteCompiledSql> r0 = r3.mCompiledQueries
            monitor-enter(r0)
            int r1 = r3.mMaxSqlCacheSize     // Catch:{ all -> 0x000c }
            if (r1 != 0) goto L_0x000e
            boolean r4 = net.sqlcipher.database.SQLiteDebug.DEBUG_SQL_STATEMENTS     // Catch:{ all -> 0x000c }
            monitor-exit(r0)     // Catch:{ all -> 0x000c }
            r4 = 0
            return r4
        L_0x000c:
            r4 = move-exception
            goto L_0x002d
        L_0x000e:
            java.util.Map<java.lang.String, net.sqlcipher.database.SQLiteCompiledSql> r1 = r3.mCompiledQueries     // Catch:{ all -> 0x000c }
            java.lang.Object r4 = r1.get(r4)     // Catch:{ all -> 0x000c }
            net.sqlcipher.database.SQLiteCompiledSql r4 = (net.sqlcipher.database.SQLiteCompiledSql) r4     // Catch:{ all -> 0x000c }
            r1 = 1
            if (r4 == 0) goto L_0x001b
            r2 = r1
            goto L_0x001c
        L_0x001b:
            r2 = 0
        L_0x001c:
            monitor-exit(r0)     // Catch:{ all -> 0x000c }
            if (r2 == 0) goto L_0x0025
            int r0 = r3.mNumCacheHits
            int r0 = r0 + r1
            r3.mNumCacheHits = r0
            goto L_0x002a
        L_0x0025:
            int r0 = r3.mNumCacheMisses
            int r0 = r0 + r1
            r3.mNumCacheMisses = r0
        L_0x002a:
            boolean r0 = net.sqlcipher.database.SQLiteDebug.DEBUG_SQL_STATEMENTS
            return r4
        L_0x002d:
            monitor-exit(r0)     // Catch:{ all -> 0x000c }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: net.sqlcipher.database.SQLiteDatabase.getCompiledStatementForSql(java.lang.String):net.sqlcipher.database.SQLiteCompiledSql");
    }

    public synchronized int getMaxSqlCacheSize() {
        return this.mMaxSqlCacheSize;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0032  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long getMaximumSize() {
        /*
            r7 = this;
            r7.lock()
            r0 = 0
            boolean r1 = r7.isOpen()     // Catch:{ all -> 0x0023 }
            if (r1 == 0) goto L_0x0028
            net.sqlcipher.database.SQLiteStatement r1 = new net.sqlcipher.database.SQLiteStatement     // Catch:{ all -> 0x0023 }
            java.lang.String r2 = "PRAGMA max_page_count;"
            r1.<init>(r7, r2)     // Catch:{ all -> 0x0023 }
            long r2 = r1.simpleQueryForLong()     // Catch:{ all -> 0x0021 }
            long r4 = r7.getPageSize()     // Catch:{ all -> 0x0021 }
            long r2 = r2 * r4
            r1.close()
            r7.unlock()
            return r2
        L_0x0021:
            r0 = move-exception
            goto L_0x0030
        L_0x0023:
            r1 = move-exception
            r6 = r1
            r1 = r0
            r0 = r6
            goto L_0x0030
        L_0x0028:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0023 }
            java.lang.String r2 = "database not open"
            r1.<init>(r2)     // Catch:{ all -> 0x0023 }
            throw r1     // Catch:{ all -> 0x0023 }
        L_0x0030:
            if (r1 == 0) goto L_0x0035
            r1.close()
        L_0x0035:
            r7.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: net.sqlcipher.database.SQLiteDatabase.getMaximumSize():long");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x002d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long getPageSize() {
        /*
            r5 = this;
            r5.lock()
            r0 = 0
            boolean r1 = r5.isOpen()     // Catch:{ all -> 0x001e }
            if (r1 == 0) goto L_0x0023
            net.sqlcipher.database.SQLiteStatement r1 = new net.sqlcipher.database.SQLiteStatement     // Catch:{ all -> 0x001e }
            java.lang.String r2 = "PRAGMA page_size;"
            r1.<init>(r5, r2)     // Catch:{ all -> 0x001e }
            long r2 = r1.simpleQueryForLong()     // Catch:{ all -> 0x001c }
            r1.close()
            r5.unlock()
            return r2
        L_0x001c:
            r0 = move-exception
            goto L_0x002b
        L_0x001e:
            r1 = move-exception
            r4 = r1
            r1 = r0
            r0 = r4
            goto L_0x002b
        L_0x0023:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x001e }
            java.lang.String r2 = "database not open"
            r1.<init>(r2)     // Catch:{ all -> 0x001e }
            throw r1     // Catch:{ all -> 0x001e }
        L_0x002b:
            if (r1 == 0) goto L_0x0030
            r1.close()
        L_0x0030:
            r5.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: net.sqlcipher.database.SQLiteDatabase.getPageSize():long");
    }

    public final String getPath() {
        return this.mPath;
    }

    public SQLiteQueryStats getQueryStats(String str, Object[] objArr) {
        try {
            execSQL(String.format("CREATE TABLE tempstat AS %s", new Object[]{str}), objArr);
            Cursor rawQuery = rawQuery("SELECT sum(payload) FROM dbstat WHERE name = 'tempstat';", new Object[0]);
            if (rawQuery == null) {
                return new SQLiteQueryStats(0, 0);
            }
            rawQuery.moveToFirst();
            long j4 = rawQuery.getLong(0);
            rawQuery.close();
            Cursor rawQuery2 = rawQuery("SELECT max(mx_payload) FROM dbstat WHERE name = 'tempstat';", new Object[0]);
            if (rawQuery2 == null) {
                return new SQLiteQueryStats(j4, 0);
            }
            rawQuery2.moveToFirst();
            long j5 = rawQuery2.getLong(0);
            rawQuery2.close();
            execSQL("DROP TABLE tempstat;");
            return new SQLiteQueryStats(j4, j5);
        } catch (SQLiteException e4) {
            execSQL("DROP TABLE IF EXISTS tempstat;");
            throw e4;
        }
    }

    public Map<String, String> getSyncedTables() {
        HashMap hashMap;
        synchronized (this.mSyncUpdateInfo) {
            try {
                hashMap = new HashMap();
                for (String next : this.mSyncUpdateInfo.keySet()) {
                    String str = this.mSyncUpdateInfo.get(next).deletedTable;
                    if (str != null) {
                        hashMap.put(next, str);
                    }
                }
            } finally {
            }
        }
        return hashMap;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x002e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int getVersion() {
        /*
            r5 = this;
            r5.lock()
            r0 = 0
            boolean r1 = r5.isOpen()     // Catch:{ all -> 0x001f }
            if (r1 == 0) goto L_0x0024
            net.sqlcipher.database.SQLiteStatement r1 = new net.sqlcipher.database.SQLiteStatement     // Catch:{ all -> 0x001f }
            java.lang.String r2 = "PRAGMA user_version;"
            r1.<init>(r5, r2)     // Catch:{ all -> 0x001f }
            long r2 = r1.simpleQueryForLong()     // Catch:{ all -> 0x001d }
            int r0 = (int) r2
            r1.close()
            r5.unlock()
            return r0
        L_0x001d:
            r0 = move-exception
            goto L_0x002c
        L_0x001f:
            r1 = move-exception
            r4 = r1
            r1 = r0
            r0 = r4
            goto L_0x002c
        L_0x0024:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x001f }
            java.lang.String r2 = "database not open"
            r1.<init>(r2)     // Catch:{ all -> 0x001f }
            throw r1     // Catch:{ all -> 0x001f }
        L_0x002c:
            if (r1 == 0) goto L_0x0031
            r1.close()
        L_0x0031:
            r5.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: net.sqlcipher.database.SQLiteDatabase.getVersion():int");
    }

    public boolean inTransaction() {
        return this.mLock.getHoldCount() > 0;
    }

    public long insert(String str, String str2, ContentValues contentValues) {
        try {
            return insertWithOnConflict(str, str2, contentValues, 0);
        } catch (SQLException unused) {
            return -1;
        }
    }

    public long insertOrThrow(String str, String str2, ContentValues contentValues) {
        return insertWithOnConflict(str, str2, contentValues, 0);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v9, resolved type: java.util.Set<java.util.Map$Entry<java.lang.String, java.lang.Object>>} */
    /* JADX WARNING: type inference failed for: r6v2, types: [java.util.Set] */
    /* JADX WARNING: type inference failed for: r6v7 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long insertWithOnConflict(java.lang.String r5, java.lang.String r6, android.content.ContentValues r7, int r8) {
        /*
            r4 = this;
            boolean r0 = r4.isOpen()
            if (r0 == 0) goto L_0x00e5
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 152(0x98, float:2.13E-43)
            r0.<init>(r1)
            java.lang.String r1 = "INSERT"
            r0.append(r1)
            java.lang.String[] r1 = CONFLICT_VALUES
            r8 = r1[r8]
            r0.append(r8)
            java.lang.String r8 = " INTO "
            r0.append(r8)
            r0.append(r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r8 = 40
            r5.<init>(r8)
            r1 = 0
            r2 = 0
            if (r7 == 0) goto L_0x006a
            int r3 = r7.size()
            if (r3 <= 0) goto L_0x006a
            java.util.Set r6 = r7.valueSet()
            java.util.Iterator r7 = r6.iterator()
            r0.append(r8)
            r8 = r1
        L_0x003e:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L_0x0064
            if (r8 == 0) goto L_0x004e
            java.lang.String r8 = ", "
            r0.append(r8)
            r5.append(r8)
        L_0x004e:
            java.lang.Object r8 = r7.next()
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8
            java.lang.Object r8 = r8.getKey()
            java.lang.String r8 = (java.lang.String) r8
            r0.append(r8)
            r8 = 63
            r5.append(r8)
            r8 = 1
            goto L_0x003e
        L_0x0064:
            r7 = 41
            r0.append(r7)
            goto L_0x0089
        L_0x006a:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "("
            r7.append(r8)
            r7.append(r6)
            java.lang.String r6 = ") "
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            r0.append(r6)
            java.lang.String r6 = "NULL"
            r5.append(r6)
            r6 = r2
        L_0x0089:
            java.lang.String r7 = " VALUES("
            r0.append(r7)
            r0.append(r5)
            java.lang.String r5 = ");"
            r0.append(r5)
            r4.lock()
            java.lang.String r5 = r0.toString()     // Catch:{ SQLiteDatabaseCorruptException -> 0x00bf }
            net.sqlcipher.database.SQLiteStatement r2 = r4.compileStatement((java.lang.String) r5)     // Catch:{ SQLiteDatabaseCorruptException -> 0x00bf }
            if (r6 == 0) goto L_0x00c1
            int r5 = r6.size()     // Catch:{ SQLiteDatabaseCorruptException -> 0x00bf }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ SQLiteDatabaseCorruptException -> 0x00bf }
        L_0x00ab:
            if (r1 >= r5) goto L_0x00c1
            java.lang.Object r7 = r6.next()     // Catch:{ SQLiteDatabaseCorruptException -> 0x00bf }
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7     // Catch:{ SQLiteDatabaseCorruptException -> 0x00bf }
            int r1 = r1 + 1
            java.lang.Object r7 = r7.getValue()     // Catch:{ SQLiteDatabaseCorruptException -> 0x00bf }
            net.sqlcipher.DatabaseUtils.bindObjectToProgram(r2, r1, r7)     // Catch:{ SQLiteDatabaseCorruptException -> 0x00bf }
            goto L_0x00ab
        L_0x00bd:
            r5 = move-exception
            goto L_0x00dc
        L_0x00bf:
            r5 = move-exception
            goto L_0x00d8
        L_0x00c1:
            r2.execute()     // Catch:{ SQLiteDatabaseCorruptException -> 0x00bf }
            int r5 = r4.lastChangeCount()     // Catch:{ SQLiteDatabaseCorruptException -> 0x00bf }
            if (r5 <= 0) goto L_0x00cf
            long r5 = r4.lastInsertRow()     // Catch:{ SQLiteDatabaseCorruptException -> 0x00bf }
            goto L_0x00d1
        L_0x00cf:
            r5 = -1
        L_0x00d1:
            r2.close()
            r4.unlock()
            return r5
        L_0x00d8:
            r4.onCorruption()     // Catch:{ all -> 0x00bd }
            throw r5     // Catch:{ all -> 0x00bd }
        L_0x00dc:
            if (r2 == 0) goto L_0x00e1
            r2.close()
        L_0x00e1:
            r4.unlock()
            throw r5
        L_0x00e5:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "database not open"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: net.sqlcipher.database.SQLiteDatabase.insertWithOnConflict(java.lang.String, java.lang.String, android.content.ContentValues, int):long");
    }

    public boolean isDatabaseIntegrityOk() {
        Pair<Boolean, String> resultFromPragma = getResultFromPragma("PRAGMA integrity_check;");
        return ((Boolean) resultFromPragma.first).booleanValue() ? ((String) resultFromPragma.second).equals("ok") : ((Boolean) resultFromPragma.first).booleanValue();
    }

    public boolean isDbLockedByCurrentThread() {
        return this.mLock.isHeldByCurrentThread();
    }

    public boolean isDbLockedByOtherThreads() {
        return !this.mLock.isHeldByCurrentThread() && this.mLock.isLocked();
    }

    public /* bridge */ /* synthetic */ boolean isExecPerConnectionSQLSupported() {
        return super.isExecPerConnectionSQLSupported();
    }

    public boolean isInCompiledSqlCache(String str) {
        boolean containsKey;
        synchronized (this.mCompiledQueries) {
            containsKey = this.mCompiledQueries.containsKey(str);
        }
        return containsKey;
    }

    public boolean isOpen() {
        return this.mNativeHandle != 0;
    }

    public boolean isReadOnly() {
        return (this.mFlags & 1) == 1;
    }

    public boolean isWriteAheadLoggingEnabled() {
        Pair<Boolean, String> resultFromPragma = getResultFromPragma("PRAGMA journal_mode;");
        return ((Boolean) resultFromPragma.first).booleanValue() ? ((String) resultFromPragma.second).equals("wal") : ((Boolean) resultFromPragma.first).booleanValue();
    }

    public native int lastChangeCount();

    public native long lastInsertRow();

    public void lock() {
        if (this.mLockingEnabled) {
            this.mLock.lock();
            if (SQLiteDebug.DEBUG_LOCK_TIME_TRACKING && this.mLock.getHoldCount() == 1) {
                this.mLockAcquiredWallTime = SystemClock.elapsedRealtime();
                this.mLockAcquiredThreadTime = Debug.threadCpuTimeNanos();
            }
        }
    }

    public void markTableSyncable(String str, String str2) {
        if (isOpen()) {
            markTableSyncable(str, "_id", str, str2);
            return;
        }
        throw new SQLiteException("database not open");
    }

    public native void native_execSQL(String str);

    public native void native_setLocale(String str, int i4);

    public boolean needUpgrade(int i4) {
        return i4 > getVersion();
    }

    public void onAllReferencesReleased() {
        if (isOpen()) {
            if (SQLiteDebug.DEBUG_SQL_CACHE) {
                this.mTimeClosed = getTime();
            }
            dbclose();
            synchronized (sActiveDatabases) {
                sActiveDatabases.remove(this);
            }
        }
    }

    public void onCorruption() {
        this.mErrorHandler.onCorruption(this);
    }

    public void purgeFromCompiledSqlCache(String str) {
        synchronized (this.mCompiledQueries) {
            this.mCompiledQueries.remove(str);
        }
    }

    public Cursor query(boolean z4, String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5, String str6) {
        return queryWithFactory((CursorFactory) null, z4, str, strArr, str2, strArr2, str3, str4, str5, str6);
    }

    public Cursor queryWithFactory(CursorFactory cursorFactory, boolean z4, String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5, String str6) {
        if (isOpen()) {
            CursorFactory cursorFactory2 = cursorFactory;
            String[] strArr3 = strArr2;
            return rawQueryWithFactory(cursorFactory, SQLiteQueryBuilder.buildQueryString(z4, str, strArr, str2, str3, str4, str5, str6), strArr2, findEditTable(str));
        }
        throw new IllegalStateException("database not open");
    }

    public void rawExecSQL(String str) {
        SystemClock.uptimeMillis();
        lock();
        try {
            if (isOpen()) {
                native_rawExecSQL(str);
                unlock();
                return;
            }
            throw new IllegalStateException("database not open");
        } catch (SQLiteDatabaseCorruptException e4) {
            onCorruption();
            throw e4;
        } catch (Throwable th) {
            unlock();
            throw th;
        }
    }

    public Cursor rawQuery(String str, String[] strArr) {
        return rawQueryWithFactory((CursorFactory) null, str, strArr, (String) null);
    }

    public Cursor rawQueryWithFactory(CursorFactory cursorFactory, String str, String[] strArr, String str2) {
        if (isOpen()) {
            int i4 = -1;
            long currentTimeMillis = this.mSlowQueryThreshold != -1 ? System.currentTimeMillis() : 0;
            SQLiteDirectCursorDriver sQLiteDirectCursorDriver = new SQLiteDirectCursorDriver(this, str, str2);
            if (cursorFactory == null) {
                try {
                    cursorFactory = this.mFactory;
                } catch (Throwable th) {
                    if (this.mSlowQueryThreshold != -1) {
                        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                        if (currentTimeMillis2 >= ((long) this.mSlowQueryThreshold)) {
                            Log.v(TAG, "query (" + currentTimeMillis2 + " ms): " + sQLiteDirectCursorDriver.toString() + ", args are <redacted>, count is " + -1);
                        }
                    }
                    throw th;
                }
            }
            Cursor query = sQLiteDirectCursorDriver.query(cursorFactory, strArr);
            if (this.mSlowQueryThreshold != -1) {
                if (query != null) {
                    i4 = query.getCount();
                }
                long currentTimeMillis3 = System.currentTimeMillis() - currentTimeMillis;
                if (currentTimeMillis3 >= ((long) this.mSlowQueryThreshold)) {
                    Log.v(TAG, "query (" + currentTimeMillis3 + " ms): " + sQLiteDirectCursorDriver.toString() + ", args are <redacted>, count is " + i4);
                }
            }
            return new CrossProcessCursorWrapper(query);
        }
        throw new IllegalStateException("database not open");
    }

    public void removeSQLiteClosable(SQLiteClosable sQLiteClosable) {
        lock();
        try {
            this.mPrograms.remove(sQLiteClosable);
        } finally {
            unlock();
        }
    }

    public long replace(String str, String str2, ContentValues contentValues) {
        try {
            return insertWithOnConflict(str, str2, contentValues, 5);
        } catch (SQLException unused) {
            return -1;
        }
    }

    public long replaceOrThrow(String str, String str2, ContentValues contentValues) {
        return insertWithOnConflict(str, str2, contentValues, 5);
    }

    public void resetCompiledSqlCache() {
        deallocCachedSqlStatements();
    }

    public void rowUpdated(String str, long j4) {
        SyncUpdateInfo syncUpdateInfo;
        synchronized (this.mSyncUpdateInfo) {
            syncUpdateInfo = this.mSyncUpdateInfo.get(str);
        }
        if (syncUpdateInfo != null) {
            execSQL("UPDATE " + syncUpdateInfo.masterTable + " SET _sync_dirty=1 WHERE _id=(SELECT " + syncUpdateInfo.foreignKey + " FROM " + str + " WHERE _id=" + j4 + ")");
        }
    }

    public void setForeignKeyConstraintsEnabled(boolean z4) {
        if (!inTransaction()) {
            execSQL(String.format("PRAGMA foreign_keys = %s;", new Object[]{z4 ? "ON" : "OFF"}));
            return;
        }
        throw new IllegalStateException("Foreign key constraints may not be changed while in a transaction");
    }

    public void setLocale(Locale locale) {
        lock();
        try {
            native_setLocale(locale.toString(), this.mFlags);
        } finally {
            unlock();
        }
    }

    public void setLockingEnabled(boolean z4) {
        this.mLockingEnabled = z4;
    }

    public synchronized void setMaxSqlCacheSize(int i4) {
        if (i4 > 250 || i4 < 0) {
            throw new IllegalStateException("expected value between 0 and 250");
        } else if (i4 >= this.mMaxSqlCacheSize) {
            this.mMaxSqlCacheSize = i4;
        } else {
            throw new IllegalStateException("cannot set cacheSize to a value less than the value set with previous setMaxSqlCacheSize() call.");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x004b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long setMaximumSize(long r8) {
        /*
            r7 = this;
            r7.lock()
            r0 = 0
            boolean r1 = r7.isOpen()     // Catch:{ all -> 0x003f }
            if (r1 == 0) goto L_0x0041
            long r1 = r7.getPageSize()     // Catch:{ all -> 0x003f }
            long r3 = r8 / r1
            long r8 = r8 % r1
            r5 = 0
            int r8 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r8 == 0) goto L_0x001a
            r8 = 1
            long r3 = r3 + r8
        L_0x001a:
            net.sqlcipher.database.SQLiteStatement r8 = new net.sqlcipher.database.SQLiteStatement     // Catch:{ all -> 0x003f }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x003f }
            r9.<init>()     // Catch:{ all -> 0x003f }
            java.lang.String r5 = "PRAGMA max_page_count = "
            r9.append(r5)     // Catch:{ all -> 0x003f }
            r9.append(r3)     // Catch:{ all -> 0x003f }
            java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x003f }
            r8.<init>(r7, r9)     // Catch:{ all -> 0x003f }
            long r3 = r8.simpleQueryForLong()     // Catch:{ all -> 0x003c }
            long r3 = r3 * r1
            r8.close()
            r7.unlock()
            return r3
        L_0x003c:
            r9 = move-exception
            r0 = r8
            goto L_0x0049
        L_0x003f:
            r9 = move-exception
            goto L_0x0049
        L_0x0041:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch:{ all -> 0x003f }
            java.lang.String r9 = "database not open"
            r8.<init>(r9)     // Catch:{ all -> 0x003f }
            throw r8     // Catch:{ all -> 0x003f }
        L_0x0049:
            if (r0 == 0) goto L_0x004e
            r0.close()
        L_0x004e:
            r7.unlock()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: net.sqlcipher.database.SQLiteDatabase.setMaximumSize(long):long");
    }

    public void setPageSize(long j4) {
        execSQL("PRAGMA page_size = " + j4);
    }

    public void setTransactionSuccessful() {
        if (!isOpen()) {
            throw new IllegalStateException("database not open");
        } else if (!this.mLock.isHeldByCurrentThread()) {
            throw new IllegalStateException("no transaction pending");
        } else if (!this.mInnerTransactionIsSuccessful) {
            this.mInnerTransactionIsSuccessful = true;
        } else {
            throw new IllegalStateException("setTransactionSuccessful may only be called once per call to beginTransaction");
        }
    }

    public void setVersion(int i4) {
        execSQL("PRAGMA user_version = " + i4);
    }

    public int status(int i4, boolean z4) {
        return native_status(i4, z4);
    }

    public void unlock() {
        if (this.mLockingEnabled) {
            if (SQLiteDebug.DEBUG_LOCK_TIME_TRACKING && this.mLock.getHoldCount() == 1) {
                checkLockHoldTime();
            }
            this.mLock.unlock();
        }
    }

    public int update(String str, ContentValues contentValues, String str2, String[] strArr) {
        return updateWithOnConflict(str, contentValues, str2, strArr, 0);
    }

    public int updateWithOnConflict(String str, ContentValues contentValues, String str2, String[] strArr, int i4) {
        if (contentValues == null || contentValues.size() == 0) {
            throw new IllegalArgumentException("Empty values");
        }
        StringBuilder sb = new StringBuilder(120);
        sb.append("UPDATE ");
        sb.append(CONFLICT_VALUES[i4]);
        sb.append(str);
        sb.append(" SET ");
        Set<Map.Entry<String, Object>> valueSet = contentValues.valueSet();
        Iterator<Map.Entry<String, Object>> it = valueSet.iterator();
        while (it.hasNext()) {
            sb.append((String) it.next().getKey());
            sb.append("=?");
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        if (!TextUtils.isEmpty(str2)) {
            sb.append(" WHERE ");
            sb.append(str2);
        }
        lock();
        SQLiteProgram sQLiteProgram = null;
        try {
            if (isOpen()) {
                SQLiteStatement compileStatement = compileStatement(sb.toString());
                int size = valueSet.size();
                Iterator<Map.Entry<String, Object>> it2 = valueSet.iterator();
                int i5 = 1;
                for (int i6 = 0; i6 < size; i6++) {
                    DatabaseUtils.bindObjectToProgram(compileStatement, i5, it2.next().getValue());
                    i5++;
                }
                if (strArr != null) {
                    for (String bindString : strArr) {
                        compileStatement.bindString(i5, bindString);
                        i5++;
                    }
                }
                compileStatement.execute();
                int lastChangeCount = lastChangeCount();
                compileStatement.close();
                unlock();
                return lastChangeCount;
            }
            throw new IllegalStateException("database not open");
        } catch (SQLiteDatabaseCorruptException e4) {
            onCorruption();
            throw e4;
        } catch (SQLException e5) {
            throw e5;
        } catch (Throwable th) {
            if (sQLiteProgram != null) {
                sQLiteProgram.close();
            }
            unlock();
            throw th;
        }
    }

    @Deprecated
    public boolean yieldIfContended() {
        if (!isOpen()) {
            return false;
        }
        return yieldIfContendedHelper(false, -1);
    }

    public boolean yieldIfContendedSafely() {
        if (!isOpen()) {
            return false;
        }
        return yieldIfContendedHelper(true, -1);
    }

    public static SQLiteDatabase create(CursorFactory cursorFactory, char[] cArr) {
        return openDatabase(MEMORY, cArr, cursorFactory, (int) CREATE_IF_NECESSARY);
    }

    private static ArrayList<Pair<String, String>> getAttachedDbs(SQLiteDatabase sQLiteDatabase) {
        if (!sQLiteDatabase.isOpen()) {
            return null;
        }
        ArrayList<Pair<String, String>> arrayList = new ArrayList<>();
        Cursor rawQuery = sQLiteDatabase.rawQuery("pragma database_list;", (String[]) null);
        while (rawQuery.moveToNext()) {
            arrayList.add(new Pair(rawQuery.getString(1), rawQuery.getString(2)));
        }
        rawQuery.close();
        return arrayList;
    }

    public static SQLiteDatabase openDatabase(String str, char[] cArr, CursorFactory cursorFactory, int i4) {
        return openDatabase(str, cArr, cursorFactory, i4, (SQLiteDatabaseHook) null, (DatabaseErrorHandler) null);
    }

    public static SQLiteDatabase openOrCreateDatabase(File file, String str, CursorFactory cursorFactory, SQLiteDatabaseHook sQLiteDatabaseHook, DatabaseErrorHandler databaseErrorHandler) {
        return openOrCreateDatabase(file == null ? null : file.getPath(), str, cursorFactory, sQLiteDatabaseHook, databaseErrorHandler);
    }

    public void beginTransactionWithListener(final SQLiteTransactionListener sQLiteTransactionListener) {
        beginTransactionWithListener((SQLiteTransactionListener) new SQLiteTransactionListener() {
            public void onBegin() {
                sQLiteTransactionListener.onBegin();
            }

            public void onCommit() {
                sQLiteTransactionListener.onCommit();
            }

            public void onRollback() {
                sQLiteTransactionListener.onRollback();
            }
        });
    }

    public void beginTransactionWithListenerNonExclusive(final SQLiteTransactionListener sQLiteTransactionListener) {
        beginTransactionWithListenerNonExclusive((SQLiteTransactionListener) new SQLiteTransactionListener() {
            public void onBegin() {
                sQLiteTransactionListener.onBegin();
            }

            public void onCommit() {
                sQLiteTransactionListener.onCommit();
            }

            public void onRollback() {
                sQLiteTransactionListener.onRollback();
            }
        });
    }

    public SQLiteStatement compileStatement(String str) {
        lock();
        try {
            if (isOpen()) {
                return new SQLiteStatement(this, str);
            }
            throw new IllegalStateException("database not open");
        } finally {
            unlock();
        }
    }

    public int delete(String str, String str2, Object[] objArr) {
        String str3;
        lock();
        SQLiteProgram sQLiteProgram = null;
        try {
            if (isOpen()) {
                StringBuilder sb = new StringBuilder();
                sb.append("DELETE FROM ");
                sb.append(str);
                if (!TextUtils.isEmpty(str2)) {
                    str3 = " WHERE " + str2;
                } else {
                    str3 = "";
                }
                sb.append(str3);
                SQLiteStatement compileStatement = compileStatement(sb.toString());
                if (objArr != null) {
                    int length = objArr.length;
                    int i4 = 0;
                    while (i4 < length) {
                        int i5 = i4 + 1;
                        DatabaseUtils.bindObjectToProgram(compileStatement, i5, objArr[i4]);
                        i4 = i5;
                    }
                }
                compileStatement.execute();
                int lastChangeCount = lastChangeCount();
                compileStatement.close();
                unlock();
                return lastChangeCount;
            }
            throw new IllegalStateException("database not open");
        } catch (SQLiteDatabaseCorruptException e4) {
            onCorruption();
            throw e4;
        } catch (Throwable th) {
            if (sQLiteProgram != null) {
                sQLiteProgram.close();
            }
            unlock();
            throw th;
        }
    }

    public long insert(String str, int i4, ContentValues contentValues) {
        return insertWithOnConflict(str, (String) null, contentValues, i4);
    }

    public Cursor query(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
        return query(false, str, strArr, str2, strArr2, str3, str4, str5, (String) null);
    }

    /* JADX INFO: finally extract failed */
    public Cursor rawQuery(String str, Object[] objArr) {
        if (isOpen()) {
            int i4 = -1;
            long currentTimeMillis = this.mSlowQueryThreshold != -1 ? System.currentTimeMillis() : 0;
            SQLiteDirectCursorDriver sQLiteDirectCursorDriver = new SQLiteDirectCursorDriver(this, str, (String) null);
            try {
                Cursor query = sQLiteDirectCursorDriver.query(this.mFactory, objArr);
                if (this.mSlowQueryThreshold != -1) {
                    if (query != null) {
                        i4 = query.getCount();
                    }
                    long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                    if (currentTimeMillis2 >= ((long) this.mSlowQueryThreshold)) {
                        Log.v(TAG, "query (" + currentTimeMillis2 + " ms): " + sQLiteDirectCursorDriver.toString() + ", args are <redacted>, count is " + i4);
                    }
                }
                return new CrossProcessCursorWrapper(query);
            } catch (Throwable th) {
                if (this.mSlowQueryThreshold != -1) {
                    long currentTimeMillis3 = System.currentTimeMillis() - currentTimeMillis;
                    if (currentTimeMillis3 >= ((long) this.mSlowQueryThreshold)) {
                        Log.v(TAG, "query (" + currentTimeMillis3 + " ms): " + sQLiteDirectCursorDriver.toString() + ", args are <redacted>, count is " + -1);
                    }
                }
                throw th;
            }
        } else {
            throw new IllegalStateException("database not open");
        }
    }

    public int update(String str, int i4, ContentValues contentValues, String str2, Object[] objArr) {
        int length = objArr == null ? 0 : objArr.length;
        String[] strArr = new String[length];
        for (int i5 = 0; i5 < length; i5++) {
            strArr[i5] = objArr[i5].toString();
        }
        return updateWithOnConflict(str, contentValues, str2, strArr, i4);
    }

    public SQLiteDatabase(String str, char[] cArr, CursorFactory cursorFactory, int i4, SQLiteDatabaseHook sQLiteDatabaseHook) {
        this(str, cursorFactory, i4, (DatabaseErrorHandler) null);
        openDatabaseInternal(cArr, sQLiteDatabaseHook);
    }

    public static synchronized void loadLibs(Context context, File file) {
        synchronized (SQLiteDatabase.class) {
            loadLibs(context, file, new LibraryLoader() {
                public void loadLibraries(String... strArr) {
                    for (String loadLibrary : strArr) {
                        System.loadLibrary(loadLibrary);
                    }
                }
            });
        }
    }

    public static SQLiteDatabase openDatabase(String str, String str2, CursorFactory cursorFactory, int i4, SQLiteDatabaseHook sQLiteDatabaseHook) {
        return openDatabase(str, str2, cursorFactory, i4, sQLiteDatabaseHook, (DatabaseErrorHandler) null);
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void openDatabaseInternal(final byte[] r5, net.sqlcipher.database.SQLiteDatabaseHook r6) {
        /*
            r4 = this;
            java.lang.String r0 = r4.mPath
            int r1 = r4.mFlags
            r4.dbopen(r0, r1)
            r0 = 1
            net.sqlcipher.database.SQLiteDatabase$2 r1 = new net.sqlcipher.database.SQLiteDatabase$2     // Catch:{ RuntimeException -> 0x0013 }
            r1.<init>(r5)     // Catch:{ RuntimeException -> 0x0013 }
            r4.keyDatabase(r6, r1)     // Catch:{ RuntimeException -> 0x0013 }
            goto L_0x0037
        L_0x0011:
            r5 = move-exception
            goto L_0x0039
        L_0x0013:
            r1 = move-exception
            char[] r2 = getChars(r5)     // Catch:{ all -> 0x0011 }
            boolean r3 = r4.containsNull(r2)     // Catch:{ all -> 0x0011 }
            if (r3 == 0) goto L_0x0038
            net.sqlcipher.database.SQLiteDatabase$3 r1 = new net.sqlcipher.database.SQLiteDatabase$3     // Catch:{ all -> 0x0011 }
            r1.<init>(r5, r2)     // Catch:{ all -> 0x0011 }
            r4.keyDatabase(r6, r1)     // Catch:{ all -> 0x0011 }
            if (r5 == 0) goto L_0x002e
            int r6 = r5.length     // Catch:{ all -> 0x0011 }
            if (r6 <= 0) goto L_0x002e
            r4.rekey(r5)     // Catch:{ all -> 0x0011 }
        L_0x002e:
            if (r2 == 0) goto L_0x0037
            r0 = 0
            int r5 = r2.length     // Catch:{ all -> 0x0011 }
            if (r5 <= 0) goto L_0x0037
            java.util.Arrays.fill(r2, r0)     // Catch:{ all -> 0x0011 }
        L_0x0037:
            return
        L_0x0038:
            throw r1     // Catch:{ all -> 0x0011 }
        L_0x0039:
            if (r0 == 0) goto L_0x0048
            r4.dbclose()
            boolean r6 = net.sqlcipher.database.SQLiteDebug.DEBUG_SQL_CACHE
            if (r6 == 0) goto L_0x0048
            java.lang.String r6 = r4.getTime()
            r4.mTimeClosed = r6
        L_0x0048:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: net.sqlcipher.database.SQLiteDatabase.openDatabaseInternal(byte[], net.sqlcipher.database.SQLiteDatabaseHook):void");
    }

    public static SQLiteDatabase openOrCreateDatabase(String str, String str2, CursorFactory cursorFactory, SQLiteDatabaseHook sQLiteDatabaseHook) {
        return openDatabase(str, str2, cursorFactory, (int) CREATE_IF_NECESSARY, sQLiteDatabaseHook);
    }

    public Cursor query(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5, String str6) {
        return query(false, str, strArr, str2, strArr2, str3, str4, str5, str6);
    }

    public boolean yieldIfContendedSafely(long j4) {
        if (!isOpen()) {
            return false;
        }
        return yieldIfContendedHelper(true, j4);
    }

    public static SQLiteDatabase openDatabase(String str, char[] cArr, CursorFactory cursorFactory, int i4, SQLiteDatabaseHook sQLiteDatabaseHook) {
        return openDatabase(str, cArr, cursorFactory, i4, sQLiteDatabaseHook, (DatabaseErrorHandler) null);
    }

    public static SQLiteDatabase openOrCreateDatabase(String str, String str2, CursorFactory cursorFactory, SQLiteDatabaseHook sQLiteDatabaseHook, DatabaseErrorHandler databaseErrorHandler) {
        return openDatabase(str, str2 == null ? null : str2.toCharArray(), cursorFactory, (int) CREATE_IF_NECESSARY, sQLiteDatabaseHook, databaseErrorHandler);
    }

    public void markTableSyncable(String str, String str2, String str3) {
        if (isOpen()) {
            markTableSyncable(str, str2, str3, (String) null);
            return;
        }
        throw new SQLiteException("database not open");
    }

    public android.database.Cursor query(String str) {
        return rawQuery(str, (String[]) null);
    }

    public SQLiteDatabase(String str, byte[] bArr, CursorFactory cursorFactory, int i4, SQLiteDatabaseHook sQLiteDatabaseHook) {
        this(str, cursorFactory, i4, (DatabaseErrorHandler) null);
        openDatabaseInternal(bArr, sQLiteDatabaseHook);
    }

    public static synchronized void loadLibs(Context context, LibraryLoader libraryLoader) {
        synchronized (SQLiteDatabase.class) {
            loadLibs(context, context.getFilesDir(), libraryLoader);
        }
    }

    public static SQLiteDatabase openDatabase(String str, String str2, CursorFactory cursorFactory, int i4, SQLiteDatabaseHook sQLiteDatabaseHook, DatabaseErrorHandler databaseErrorHandler) {
        return openDatabase(str, str2 == null ? null : str2.toCharArray(), cursorFactory, i4, sQLiteDatabaseHook, databaseErrorHandler);
    }

    public static SQLiteDatabase openOrCreateDatabase(String str, char[] cArr, CursorFactory cursorFactory, SQLiteDatabaseHook sQLiteDatabaseHook) {
        return openDatabase(str, cArr, cursorFactory, (int) CREATE_IF_NECESSARY, sQLiteDatabaseHook);
    }

    public android.database.Cursor query(String str, Object[] objArr) {
        return rawQuery(str, objArr);
    }

    public static SQLiteDatabase openDatabase(String str, char[] cArr, CursorFactory cursorFactory, int i4, SQLiteDatabaseHook sQLiteDatabaseHook, DatabaseErrorHandler databaseErrorHandler) {
        return openDatabase(str, getBytes(cArr), cursorFactory, i4, sQLiteDatabaseHook, databaseErrorHandler);
    }

    public static SQLiteDatabase openOrCreateDatabase(String str, char[] cArr, CursorFactory cursorFactory, SQLiteDatabaseHook sQLiteDatabaseHook, DatabaseErrorHandler databaseErrorHandler) {
        return openDatabase(str, cArr, cursorFactory, (int) CREATE_IF_NECESSARY, sQLiteDatabaseHook, databaseErrorHandler);
    }

    public void changePassword(char[] cArr) {
        if (!isOpen()) {
            throw new SQLiteException("database not open");
        } else if (cArr != null) {
            byte[] bytes = getBytes(cArr);
            rekey(bytes);
            Arrays.fill(bytes, (byte) 0);
        }
    }

    public android.database.Cursor query(j jVar) {
        return query(jVar, (CancellationSignal) null);
    }

    private SQLiteDatabase(String str, CursorFactory cursorFactory, int i4, DatabaseErrorHandler databaseErrorHandler) {
        this.mLock = new ReentrantLock(true);
        this.mLockAcquiredWallTime = 0;
        this.mLockAcquiredThreadTime = 0;
        this.mLastLockMessageTime = 0;
        this.mLastSqlStatement = null;
        this.mNativeHandle = 0;
        this.mTempTableSequence = 0;
        this.mPathForLogs = null;
        this.mCompiledQueries = new HashMap();
        this.mMaxSqlCacheSize = MAX_SQL_CACHE_SIZE;
        this.mTimeOpened = null;
        this.mTimeClosed = null;
        this.mStackTrace = null;
        this.mLockingEnabled = true;
        this.mSyncUpdateInfo = new HashMap();
        if (str != null) {
            this.mFlags = i4;
            this.mPath = str;
            this.mSlowQueryThreshold = -1;
            this.mStackTrace = new DatabaseObjectNotClosedException().fillInStackTrace();
            this.mFactory = cursorFactory;
            this.mPrograms = new WeakHashMap<>();
            this.mErrorHandler = databaseErrorHandler;
            return;
        }
        throw new IllegalArgumentException("path should not be null");
    }

    public static synchronized void loadLibs(Context context, File file, LibraryLoader libraryLoader) {
        synchronized (SQLiteDatabase.class) {
            libraryLoader.loadLibraries("sqlcipher");
        }
    }

    /* JADX INFO: finally extract failed */
    private void markTableSyncable(String str, String str2, String str3, String str4) {
        lock();
        try {
            native_execSQL("SELECT _sync_dirty FROM " + str3 + " LIMIT 0");
            native_execSQL("SELECT " + str2 + " FROM " + str + " LIMIT 0");
            unlock();
            SyncUpdateInfo syncUpdateInfo = new SyncUpdateInfo(str3, str4, str2);
            synchronized (this.mSyncUpdateInfo) {
                this.mSyncUpdateInfo.put(str, syncUpdateInfo);
            }
        } catch (Throwable th) {
            unlock();
            throw th;
        }
    }

    public static SQLiteDatabase openOrCreateDatabase(String str, byte[] bArr, CursorFactory cursorFactory, SQLiteDatabaseHook sQLiteDatabaseHook) {
        return openDatabase(str, bArr, cursorFactory, (int) CREATE_IF_NECESSARY, sQLiteDatabaseHook, (DatabaseErrorHandler) null);
    }

    public android.database.Cursor query(j jVar, CancellationSignal cancellationSignal) {
        String b4 = jVar.b();
        SQLiteDirectCursorDriver sQLiteDirectCursorDriver = new SQLiteDirectCursorDriver(this, b4, (String) null);
        SQLiteQuery sQLiteQuery = new SQLiteQuery(this, b4, 0, new Object[jVar.c()]);
        jVar.d(sQLiteQuery);
        return new CrossProcessCursorWrapper(new SQLiteCursor(this, sQLiteDirectCursorDriver, (String) null, sQLiteQuery));
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processExcHandler(RegionMaker.java:1043)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:975)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0022  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0029  */
    public static net.sqlcipher.database.SQLiteDatabase openDatabase(java.lang.String r2, byte[] r3, net.sqlcipher.database.SQLiteDatabase.CursorFactory r4, int r5, net.sqlcipher.database.SQLiteDatabaseHook r6, net.sqlcipher.DatabaseErrorHandler r7) {
        /*
            if (r7 == 0) goto L_0x0003
            goto L_0x0008
        L_0x0003:
            net.sqlcipher.DefaultDatabaseErrorHandler r7 = new net.sqlcipher.DefaultDatabaseErrorHandler
            r7.<init>()
        L_0x0008:
            r0 = 0
            net.sqlcipher.database.SQLiteDatabase r1 = new net.sqlcipher.database.SQLiteDatabase     // Catch:{ SQLiteDatabaseCorruptException -> 0x0012 }
            r1.<init>((java.lang.String) r2, (net.sqlcipher.database.SQLiteDatabase.CursorFactory) r4, (int) r5, (net.sqlcipher.DatabaseErrorHandler) r7)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0012 }
            r1.openDatabaseInternal((byte[]) r3, (net.sqlcipher.database.SQLiteDatabaseHook) r6)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0013 }
            goto L_0x001e
        L_0x0012:
            r1 = r0
        L_0x0013:
            r7.onCorruption(r1)
            net.sqlcipher.database.SQLiteDatabase r1 = new net.sqlcipher.database.SQLiteDatabase
            r1.<init>((java.lang.String) r2, (net.sqlcipher.database.SQLiteDatabase.CursorFactory) r4, (int) r5, (net.sqlcipher.DatabaseErrorHandler) r7)
            r1.openDatabaseInternal((byte[]) r3, (net.sqlcipher.database.SQLiteDatabaseHook) r6)
        L_0x001e:
            boolean r3 = net.sqlcipher.database.SQLiteDebug.DEBUG_SQL_STATEMENTS
            if (r3 == 0) goto L_0x0025
            r1.enableSqlTracing(r2)
        L_0x0025:
            boolean r3 = net.sqlcipher.database.SQLiteDebug.DEBUG_SQL_TIME
            if (r3 == 0) goto L_0x002c
            r1.enableSqlProfiling(r2)
        L_0x002c:
            java.util.WeakHashMap<net.sqlcipher.database.SQLiteDatabase, java.lang.Object> r2 = sActiveDatabases
            monitor-enter(r2)
            java.util.WeakHashMap<net.sqlcipher.database.SQLiteDatabase, java.lang.Object> r3 = sActiveDatabases     // Catch:{ all -> 0x0036 }
            r3.put(r1, r0)     // Catch:{ all -> 0x0036 }
            monitor-exit(r2)     // Catch:{ all -> 0x0036 }
            return r1
        L_0x0036:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0036 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: net.sqlcipher.database.SQLiteDatabase.openDatabase(java.lang.String, byte[], net.sqlcipher.database.SQLiteDatabase$CursorFactory, int, net.sqlcipher.database.SQLiteDatabaseHook, net.sqlcipher.DatabaseErrorHandler):net.sqlcipher.database.SQLiteDatabase");
    }

    public static SQLiteDatabase openOrCreateDatabase(String str, byte[] bArr, CursorFactory cursorFactory, SQLiteDatabaseHook sQLiteDatabaseHook, DatabaseErrorHandler databaseErrorHandler) {
        return openDatabase(str, bArr, cursorFactory, (int) CREATE_IF_NECESSARY, sQLiteDatabaseHook, databaseErrorHandler);
    }

    public static SQLiteDatabase openOrCreateDatabase(File file, String str, CursorFactory cursorFactory) {
        return openOrCreateDatabase(file, str, cursorFactory, (SQLiteDatabaseHook) null);
    }

    public static SQLiteDatabase openOrCreateDatabase(String str, String str2, CursorFactory cursorFactory) {
        return openDatabase(str, str2, cursorFactory, (int) CREATE_IF_NECESSARY, (SQLiteDatabaseHook) null);
    }

    public static SQLiteDatabase openOrCreateDatabase(String str, char[] cArr, CursorFactory cursorFactory) {
        return openDatabase(str, cArr, cursorFactory, (int) CREATE_IF_NECESSARY, (SQLiteDatabaseHook) null);
    }

    public void execSQL(String str, Object[] objArr) {
        if (objArr != null) {
            SystemClock.uptimeMillis();
            lock();
            SQLiteProgram sQLiteProgram = null;
            try {
                if (isOpen()) {
                    SQLiteStatement compileStatement = compileStatement(str);
                    int length = objArr.length;
                    int i4 = 0;
                    while (i4 < length) {
                        int i5 = i4 + 1;
                        DatabaseUtils.bindObjectToProgram(compileStatement, i5, objArr[i4]);
                        i4 = i5;
                    }
                    compileStatement.execute();
                    compileStatement.close();
                    unlock();
                    return;
                }
                throw new IllegalStateException("database not open");
            } catch (SQLiteDatabaseCorruptException e4) {
                onCorruption();
                throw e4;
            } catch (Throwable th) {
                if (sQLiteProgram != null) {
                    sQLiteProgram.close();
                }
                unlock();
                throw th;
            }
        } else {
            throw new IllegalArgumentException("Empty bindArgs");
        }
    }

    public static SQLiteDatabase openOrCreateDatabase(String str, byte[] bArr, CursorFactory cursorFactory) {
        return openDatabase(str, bArr, cursorFactory, (int) CREATE_IF_NECESSARY, (SQLiteDatabaseHook) null, (DatabaseErrorHandler) null);
    }

    public Cursor rawQuery(String str, String[] strArr, int i4, int i5) {
        CursorWrapper cursorWrapper = (CursorWrapper) rawQueryWithFactory((CursorFactory) null, str, strArr, (String) null);
        ((SQLiteCursor) cursorWrapper.getWrappedCursor()).setLoadStyle(i4, i5);
        return cursorWrapper;
    }
}
