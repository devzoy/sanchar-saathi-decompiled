package w0;

import android.database.Cursor;
import i3.C0720D;
import i3.C0721E;
import i3.C0722F;
import i3.C0737n;
import i3.C0746w;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import s3.b;
import v3.l;
import w0.C0962d;
import y0.g;

/* renamed from: w0.e  reason: case insensitive filesystem */
public abstract class C0963e {
    public static final Map a(g gVar, String str) {
        Throwable th;
        Cursor query = gVar.query("PRAGMA table_info(`" + str + "`)");
        try {
            if (query.getColumnCount() <= 0) {
                Map g4 = C0721E.g();
                b.a(query, (Throwable) null);
                return g4;
            }
            int columnIndex = query.getColumnIndex("name");
            int columnIndex2 = query.getColumnIndex("type");
            int columnIndex3 = query.getColumnIndex("notnull");
            int columnIndex4 = query.getColumnIndex("pk");
            int columnIndex5 = query.getColumnIndex("dflt_value");
            Map c4 = C0720D.c();
            while (query.moveToNext()) {
                String string = query.getString(columnIndex);
                String string2 = query.getString(columnIndex2);
                boolean z4 = query.getInt(columnIndex3) != 0;
                int i4 = query.getInt(columnIndex4);
                String string3 = query.getString(columnIndex5);
                l.d(string, "name");
                l.d(string2, "type");
                C0962d.a aVar = r11;
                C0962d.a aVar2 = new C0962d.a(string, string2, z4, i4, string3, 2);
                c4.put(string, aVar);
            }
            Map b4 = C0720D.b(c4);
            b.a(query, (Throwable) null);
            return b4;
        } catch (Throwable th2) {
            Throwable th3 = th2;
            b.a(query, th);
            throw th3;
        }
    }

    public static final List b(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        List c4 = C0737n.c();
        while (cursor.moveToNext()) {
            int i4 = cursor.getInt(columnIndex);
            int i5 = cursor.getInt(columnIndex2);
            String string = cursor.getString(columnIndex3);
            l.d(string, "cursor.getString(fromColumnIndex)");
            String string2 = cursor.getString(columnIndex4);
            l.d(string2, "cursor.getString(toColumnIndex)");
            c4.add(new C0962d.C0208d(i4, i5, string, string2));
        }
        return C0746w.E(C0737n.a(c4));
    }

    public static final Set c(g gVar, String str) {
        Cursor query = gVar.query("PRAGMA foreign_key_list(`" + str + "`)");
        try {
            int columnIndex = query.getColumnIndex("id");
            int columnIndex2 = query.getColumnIndex("seq");
            int columnIndex3 = query.getColumnIndex("table");
            int columnIndex4 = query.getColumnIndex("on_delete");
            int columnIndex5 = query.getColumnIndex("on_update");
            List b4 = b(query);
            query.moveToPosition(-1);
            Set b5 = C0722F.b();
            while (query.moveToNext()) {
                if (query.getInt(columnIndex2) == 0) {
                    int i4 = query.getInt(columnIndex);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList<C0962d.C0208d> arrayList3 = new ArrayList<>();
                    for (Object next : b4) {
                        if (((C0962d.C0208d) next).k() == i4) {
                            arrayList3.add(next);
                        }
                    }
                    for (C0962d.C0208d dVar : arrayList3) {
                        arrayList.add(dVar.f());
                        arrayList2.add(dVar.l());
                    }
                    String string = query.getString(columnIndex3);
                    l.d(string, "cursor.getString(tableColumnIndex)");
                    String string2 = query.getString(columnIndex4);
                    l.d(string2, "cursor.getString(onDeleteColumnIndex)");
                    String string3 = query.getString(columnIndex5);
                    l.d(string3, "cursor.getString(onUpdateColumnIndex)");
                    b5.add(new C0962d.c(string, string2, string3, arrayList, arrayList2));
                }
            }
            Set a4 = C0722F.a(b5);
            b.a(query, (Throwable) null);
            return a4;
        } catch (Throwable th) {
            b.a(query, th);
            throw th;
        }
    }

    public static final C0962d.e d(g gVar, String str, boolean z4) {
        Cursor query = gVar.query("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndex = query.getColumnIndex("seqno");
            int columnIndex2 = query.getColumnIndex("cid");
            int columnIndex3 = query.getColumnIndex("name");
            int columnIndex4 = query.getColumnIndex("desc");
            if (!(columnIndex == -1 || columnIndex2 == -1 || columnIndex3 == -1)) {
                if (columnIndex4 != -1) {
                    TreeMap treeMap = new TreeMap();
                    TreeMap treeMap2 = new TreeMap();
                    while (query.moveToNext()) {
                        if (query.getInt(columnIndex2) >= 0) {
                            int i4 = query.getInt(columnIndex);
                            String string = query.getString(columnIndex3);
                            String str2 = query.getInt(columnIndex4) > 0 ? "DESC" : "ASC";
                            Integer valueOf = Integer.valueOf(i4);
                            l.d(string, "columnName");
                            treeMap.put(valueOf, string);
                            treeMap2.put(Integer.valueOf(i4), str2);
                        }
                    }
                    Collection values = treeMap.values();
                    l.d(values, "columnsMap.values");
                    List I4 = C0746w.I(values);
                    Collection values2 = treeMap2.values();
                    l.d(values2, "ordersMap.values");
                    C0962d.e eVar = new C0962d.e(str, z4, I4, C0746w.I(values2));
                    b.a(query, (Throwable) null);
                    return eVar;
                }
            }
            b.a(query, (Throwable) null);
            return null;
        } catch (Throwable th) {
            b.a(query, th);
            throw th;
        }
    }

    public static final Set e(g gVar, String str) {
        Cursor query = gVar.query("PRAGMA index_list(`" + str + "`)");
        try {
            int columnIndex = query.getColumnIndex("name");
            int columnIndex2 = query.getColumnIndex("origin");
            int columnIndex3 = query.getColumnIndex("unique");
            if (!(columnIndex == -1 || columnIndex2 == -1)) {
                if (columnIndex3 != -1) {
                    Set b4 = C0722F.b();
                    while (query.moveToNext()) {
                        if (l.a("c", query.getString(columnIndex2))) {
                            String string = query.getString(columnIndex);
                            boolean z4 = true;
                            if (query.getInt(columnIndex3) != 1) {
                                z4 = false;
                            }
                            l.d(string, "name");
                            C0962d.e d4 = d(gVar, string, z4);
                            if (d4 == null) {
                                b.a(query, (Throwable) null);
                                return null;
                            }
                            b4.add(d4);
                        }
                    }
                    Set a4 = C0722F.a(b4);
                    b.a(query, (Throwable) null);
                    return a4;
                }
            }
            b.a(query, (Throwable) null);
            return null;
        } catch (Throwable th) {
            b.a(query, th);
            throw th;
        }
    }

    public static final C0962d f(g gVar, String str) {
        l.e(gVar, "database");
        l.e(str, "tableName");
        return new C0962d(str, a(gVar, str), c(gVar, str), e(gVar, str));
    }
}
