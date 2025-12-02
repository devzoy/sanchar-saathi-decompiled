package j1;

import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import k1.C0769a;

/* renamed from: j1.d  reason: case insensitive filesystem */
public class C0759d {

    /* renamed from: a  reason: collision with root package name */
    public final String f10898a;

    /* renamed from: b  reason: collision with root package name */
    public final List f10899b;

    public C0759d(String str, List list) {
        this.f10898a = str;
        this.f10899b = list == null ? new ArrayList() : list;
    }

    public static Map a(Map map) {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            Object value = entry.getValue();
            hashMap.put(j(entry.getKey()), value instanceof Map ? a((Map) value) : j(value));
        }
        return hashMap;
    }

    public static String j(Object obj) {
        if (obj == null) {
            return null;
        }
        if (!(obj instanceof byte[])) {
            return obj instanceof Map ? a((Map) obj).toString() : obj.toString();
        }
        ArrayList arrayList = new ArrayList();
        for (byte valueOf : (byte[]) obj) {
            arrayList.add(Integer.valueOf(valueOf));
        }
        return arrayList.toString();
    }

    public static Object k(Object obj) {
        if (obj == null) {
            return null;
        }
        if (C0769a.f10969c) {
            Log.d("Sqflite", "arg " + obj.getClass().getCanonicalName() + " " + j(obj));
        }
        if (obj instanceof List) {
            List list = (List) obj;
            byte[] bArr = new byte[list.size()];
            for (int i4 = 0; i4 < list.size(); i4++) {
                bArr[i4] = (byte) ((Integer) list.get(i4)).intValue();
            }
            obj = bArr;
        }
        if (C0769a.f10969c) {
            Log.d("Sqflite", "arg " + obj.getClass().getCanonicalName() + " " + j(obj));
        }
        return obj;
    }

    public String[] b() {
        return c(this.f10899b);
    }

    public final String[] c(List list) {
        return (String[]) h(list).toArray(new String[0]);
    }

    public List d() {
        return this.f10899b;
    }

    public String e() {
        return this.f10898a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0759d)) {
            return false;
        }
        C0759d dVar = (C0759d) obj;
        String str = this.f10898a;
        if (str != null) {
            if (!str.equals(dVar.f10898a)) {
                return false;
            }
        } else if (dVar.f10898a != null) {
            return false;
        }
        if (this.f10899b.size() != dVar.f10899b.size()) {
            return false;
        }
        for (int i4 = 0; i4 < this.f10899b.size(); i4++) {
            if (!(this.f10899b.get(i4) instanceof byte[]) || !(dVar.f10899b.get(i4) instanceof byte[])) {
                if (!this.f10899b.get(i4).equals(dVar.f10899b.get(i4))) {
                    return false;
                }
            } else if (!Arrays.equals((byte[]) this.f10899b.get(i4), (byte[]) dVar.f10899b.get(i4))) {
                return false;
            }
        }
        return true;
    }

    public Object[] f() {
        return g(this.f10899b);
    }

    public final Object[] g(List list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (Object k4 : list) {
                arrayList.add(k(k4));
            }
        }
        return arrayList.toArray(new Object[0]);
    }

    public final List h(List list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (Object j4 : list) {
                arrayList.add(j(j4));
            }
        }
        return arrayList;
    }

    public int hashCode() {
        String str = this.f10898a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public C0759d i() {
        if (this.f10899b.size() == 0) {
            return this;
        }
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = new ArrayList();
        int length = this.f10898a.length();
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < length; i6++) {
            char charAt = this.f10898a.charAt(i6);
            if (charAt == '?') {
                int i7 = i6 + 1;
                if (i7 < length && Character.isDigit(this.f10898a.charAt(i7))) {
                    return this;
                }
                i4++;
                if (i5 >= this.f10899b.size()) {
                    return this;
                }
                int i8 = i5 + 1;
                Object obj = this.f10899b.get(i5);
                if ((obj instanceof Integer) || (obj instanceof Long)) {
                    sb.append(obj.toString());
                    i5 = i8;
                } else {
                    arrayList.add(obj);
                    i5 = i8;
                }
            }
            sb.append(charAt);
        }
        return i4 != this.f10899b.size() ? this : new C0759d(sb.toString(), arrayList);
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f10898a);
        List list = this.f10899b;
        if (list == null || list.isEmpty()) {
            str = "";
        } else {
            str = " " + h(this.f10899b);
        }
        sb.append(str);
        return sb.toString();
    }
}
