package androidx.work;

import Q0.i;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public final class b {

    /* renamed from: b  reason: collision with root package name */
    public static final String f6126b = i.i("Data");

    /* renamed from: c  reason: collision with root package name */
    public static final b f6127c = new a().a();

    /* renamed from: a  reason: collision with root package name */
    public Map f6128a;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public Map f6129a = new HashMap();

        public b a() {
            b bVar = new b(this.f6129a);
            b.k(bVar);
            return bVar;
        }

        public a b(String str, Object obj) {
            if (obj == null) {
                this.f6129a.put(str, (Object) null);
            } else {
                Class<?> cls = obj.getClass();
                if (cls == Boolean.class || cls == Byte.class || cls == Integer.class || cls == Long.class || cls == Float.class || cls == Double.class || cls == String.class || cls == Boolean[].class || cls == Byte[].class || cls == Integer[].class || cls == Long[].class || cls == Float[].class || cls == Double[].class || cls == String[].class) {
                    this.f6129a.put(str, obj);
                } else if (cls == boolean[].class) {
                    this.f6129a.put(str, b.a((boolean[]) obj));
                } else if (cls == byte[].class) {
                    this.f6129a.put(str, b.b((byte[]) obj));
                } else if (cls == int[].class) {
                    this.f6129a.put(str, b.e((int[]) obj));
                } else if (cls == long[].class) {
                    this.f6129a.put(str, b.f((long[]) obj));
                } else if (cls == float[].class) {
                    this.f6129a.put(str, b.d((float[]) obj));
                } else if (cls == double[].class) {
                    this.f6129a.put(str, b.c((double[]) obj));
                } else {
                    throw new IllegalArgumentException("Key " + str + "has invalid type " + cls);
                }
            }
            return this;
        }

        public a c(Map map) {
            for (Map.Entry entry : map.entrySet()) {
                b((String) entry.getKey(), entry.getValue());
            }
            return this;
        }
    }

    public b(b bVar) {
        this.f6128a = new HashMap(bVar.f6128a);
    }

    public static Boolean[] a(boolean[] zArr) {
        Boolean[] boolArr = new Boolean[zArr.length];
        for (int i4 = 0; i4 < zArr.length; i4++) {
            boolArr[i4] = Boolean.valueOf(zArr[i4]);
        }
        return boolArr;
    }

    public static Byte[] b(byte[] bArr) {
        Byte[] bArr2 = new Byte[bArr.length];
        for (int i4 = 0; i4 < bArr.length; i4++) {
            bArr2[i4] = Byte.valueOf(bArr[i4]);
        }
        return bArr2;
    }

    public static Double[] c(double[] dArr) {
        Double[] dArr2 = new Double[dArr.length];
        for (int i4 = 0; i4 < dArr.length; i4++) {
            dArr2[i4] = Double.valueOf(dArr[i4]);
        }
        return dArr2;
    }

    public static Float[] d(float[] fArr) {
        Float[] fArr2 = new Float[fArr.length];
        for (int i4 = 0; i4 < fArr.length; i4++) {
            fArr2[i4] = Float.valueOf(fArr[i4]);
        }
        return fArr2;
    }

    public static Integer[] e(int[] iArr) {
        Integer[] numArr = new Integer[iArr.length];
        for (int i4 = 0; i4 < iArr.length; i4++) {
            numArr[i4] = Integer.valueOf(iArr[i4]);
        }
        return numArr;
    }

    public static Long[] f(long[] jArr) {
        Long[] lArr = new Long[jArr.length];
        for (int i4 = 0; i4 < jArr.length; i4++) {
            lArr[i4] = Long.valueOf(jArr[i4]);
        }
        return lArr;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0058 A[SYNTHETIC, Splitter:B:27:0x0058] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006d A[SYNTHETIC, Splitter:B:36:0x006d] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:31:0x0062=Splitter:B:31:0x0062, B:16:0x003b=Splitter:B:16:0x003b} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static androidx.work.b g(byte[] r7) {
        /*
            java.lang.String r0 = "Error in Data#fromByteArray: "
            int r1 = r7.length
            r2 = 10240(0x2800, float:1.4349E-41)
            if (r1 > r2) goto L_0x0082
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream
            r2.<init>(r7)
            r7 = 0
            java.io.ObjectInputStream r3 = new java.io.ObjectInputStream     // Catch:{ IOException -> 0x004f, ClassNotFoundException -> 0x004a, all -> 0x0046 }
            r3.<init>(r2)     // Catch:{ IOException -> 0x004f, ClassNotFoundException -> 0x004a, all -> 0x0046 }
            int r7 = r3.readInt()     // Catch:{ IOException -> 0x002f, ClassNotFoundException -> 0x002d }
        L_0x001b:
            if (r7 <= 0) goto L_0x0031
            java.lang.String r4 = r3.readUTF()     // Catch:{ IOException -> 0x002f, ClassNotFoundException -> 0x002d }
            java.lang.Object r5 = r3.readObject()     // Catch:{ IOException -> 0x002f, ClassNotFoundException -> 0x002d }
            r1.put(r4, r5)     // Catch:{ IOException -> 0x002f, ClassNotFoundException -> 0x002d }
            int r7 = r7 + -1
            goto L_0x001b
        L_0x002b:
            r7 = move-exception
            goto L_0x006b
        L_0x002d:
            r7 = move-exception
            goto L_0x0051
        L_0x002f:
            r7 = move-exception
            goto L_0x0051
        L_0x0031:
            r3.close()     // Catch:{ IOException -> 0x0035 }
            goto L_0x003b
        L_0x0035:
            r7 = move-exception
            java.lang.String r3 = f6126b
            android.util.Log.e(r3, r0, r7)
        L_0x003b:
            r2.close()     // Catch:{ IOException -> 0x003f }
            goto L_0x0065
        L_0x003f:
            r7 = move-exception
            java.lang.String r2 = f6126b
            android.util.Log.e(r2, r0, r7)
            goto L_0x0065
        L_0x0046:
            r1 = move-exception
            r3 = r7
            r7 = r1
            goto L_0x006b
        L_0x004a:
            r3 = move-exception
        L_0x004b:
            r6 = r3
            r3 = r7
            r7 = r6
            goto L_0x0051
        L_0x004f:
            r3 = move-exception
            goto L_0x004b
        L_0x0051:
            java.lang.String r4 = f6126b     // Catch:{ all -> 0x002b }
            android.util.Log.e(r4, r0, r7)     // Catch:{ all -> 0x002b }
            if (r3 == 0) goto L_0x0062
            r3.close()     // Catch:{ IOException -> 0x005c }
            goto L_0x0062
        L_0x005c:
            r7 = move-exception
            java.lang.String r3 = f6126b
            android.util.Log.e(r3, r0, r7)
        L_0x0062:
            r2.close()     // Catch:{ IOException -> 0x003f }
        L_0x0065:
            androidx.work.b r7 = new androidx.work.b
            r7.<init>((java.util.Map) r1)
            return r7
        L_0x006b:
            if (r3 == 0) goto L_0x0077
            r3.close()     // Catch:{ IOException -> 0x0071 }
            goto L_0x0077
        L_0x0071:
            r1 = move-exception
            java.lang.String r3 = f6126b
            android.util.Log.e(r3, r0, r1)
        L_0x0077:
            r2.close()     // Catch:{ IOException -> 0x007b }
            goto L_0x0081
        L_0x007b:
            r1 = move-exception
            java.lang.String r2 = f6126b
            android.util.Log.e(r2, r0, r1)
        L_0x0081:
            throw r7
        L_0x0082:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "Data cannot occupy more than 10240 bytes when serialized"
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.b.g(byte[]):androidx.work.b");
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0078 A[SYNTHETIC, Splitter:B:31:0x0078] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x008f A[SYNTHETIC, Splitter:B:41:0x008f] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] k(androidx.work.b r5) {
        /*
            java.lang.String r0 = "Error in Data#toByteArray: "
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream
            r1.<init>()
            r2 = 0
            java.io.ObjectOutputStream r3 = new java.io.ObjectOutputStream     // Catch:{ IOException -> 0x006c }
            r3.<init>(r1)     // Catch:{ IOException -> 0x006c }
            int r2 = r5.j()     // Catch:{ IOException -> 0x003e, all -> 0x003b }
            r3.writeInt(r2)     // Catch:{ IOException -> 0x003e, all -> 0x003b }
            java.util.Map r5 = r5.f6128a     // Catch:{ IOException -> 0x003e, all -> 0x003b }
            java.util.Set r5 = r5.entrySet()     // Catch:{ IOException -> 0x003e, all -> 0x003b }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ IOException -> 0x003e, all -> 0x003b }
        L_0x001e:
            boolean r2 = r5.hasNext()     // Catch:{ IOException -> 0x003e, all -> 0x003b }
            if (r2 == 0) goto L_0x0041
            java.lang.Object r2 = r5.next()     // Catch:{ IOException -> 0x003e, all -> 0x003b }
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch:{ IOException -> 0x003e, all -> 0x003b }
            java.lang.Object r4 = r2.getKey()     // Catch:{ IOException -> 0x003e, all -> 0x003b }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ IOException -> 0x003e, all -> 0x003b }
            r3.writeUTF(r4)     // Catch:{ IOException -> 0x003e, all -> 0x003b }
            java.lang.Object r2 = r2.getValue()     // Catch:{ IOException -> 0x003e, all -> 0x003b }
            r3.writeObject(r2)     // Catch:{ IOException -> 0x003e, all -> 0x003b }
            goto L_0x001e
        L_0x003b:
            r5 = move-exception
            r2 = r3
            goto L_0x008d
        L_0x003e:
            r5 = move-exception
            r2 = r3
            goto L_0x006d
        L_0x0041:
            r3.close()     // Catch:{ IOException -> 0x0045 }
            goto L_0x004b
        L_0x0045:
            r5 = move-exception
            java.lang.String r2 = f6126b
            android.util.Log.e(r2, r0, r5)
        L_0x004b:
            r1.close()     // Catch:{ IOException -> 0x004f }
            goto L_0x0055
        L_0x004f:
            r5 = move-exception
            java.lang.String r2 = f6126b
            android.util.Log.e(r2, r0, r5)
        L_0x0055:
            int r5 = r1.size()
            r0 = 10240(0x2800, float:1.4349E-41)
            if (r5 > r0) goto L_0x0062
            byte[] r5 = r1.toByteArray()
            return r5
        L_0x0062:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Data cannot occupy more than 10240 bytes when serialized"
            r5.<init>(r0)
            throw r5
        L_0x006a:
            r5 = move-exception
            goto L_0x008d
        L_0x006c:
            r5 = move-exception
        L_0x006d:
            java.lang.String r3 = f6126b     // Catch:{ all -> 0x006a }
            android.util.Log.e(r3, r0, r5)     // Catch:{ all -> 0x006a }
            byte[] r5 = r1.toByteArray()     // Catch:{ all -> 0x006a }
            if (r2 == 0) goto L_0x0082
            r2.close()     // Catch:{ IOException -> 0x007c }
            goto L_0x0082
        L_0x007c:
            r2 = move-exception
            java.lang.String r3 = f6126b
            android.util.Log.e(r3, r0, r2)
        L_0x0082:
            r1.close()     // Catch:{ IOException -> 0x0086 }
            goto L_0x008c
        L_0x0086:
            r1 = move-exception
            java.lang.String r2 = f6126b
            android.util.Log.e(r2, r0, r1)
        L_0x008c:
            return r5
        L_0x008d:
            if (r2 == 0) goto L_0x0099
            r2.close()     // Catch:{ IOException -> 0x0093 }
            goto L_0x0099
        L_0x0093:
            r2 = move-exception
            java.lang.String r3 = f6126b
            android.util.Log.e(r3, r0, r2)
        L_0x0099:
            r1.close()     // Catch:{ IOException -> 0x009d }
            goto L_0x00a3
        L_0x009d:
            r1 = move-exception
            java.lang.String r2 = f6126b
            android.util.Log.e(r2, r0, r1)
        L_0x00a3:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.b.k(androidx.work.b):byte[]");
    }

    public boolean equals(Object obj) {
        boolean z4;
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        Set<String> keySet = this.f6128a.keySet();
        if (!keySet.equals(bVar.f6128a.keySet())) {
            return false;
        }
        for (String str : keySet) {
            Object obj2 = this.f6128a.get(str);
            Object obj3 = bVar.f6128a.get(str);
            if (obj2 == null || obj3 == null) {
                if (obj2 == obj3) {
                    z4 = true;
                    continue;
                } else {
                    z4 = false;
                    continue;
                }
            } else if (!(obj2 instanceof Object[]) || !(obj3 instanceof Object[])) {
                z4 = obj2.equals(obj3);
                continue;
            } else {
                z4 = Arrays.deepEquals((Object[]) obj2, (Object[]) obj3);
                continue;
            }
            if (!z4) {
                return false;
            }
        }
        return true;
    }

    public Map h() {
        return Collections.unmodifiableMap(this.f6128a);
    }

    public int hashCode() {
        return this.f6128a.hashCode() * 31;
    }

    public String i(String str) {
        Object obj = this.f6128a.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public int j() {
        return this.f6128a.size();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Data {");
        if (!this.f6128a.isEmpty()) {
            for (String str : this.f6128a.keySet()) {
                sb.append(str);
                sb.append(" : ");
                Object obj = this.f6128a.get(str);
                if (obj instanceof Object[]) {
                    sb.append(Arrays.toString((Object[]) obj));
                } else {
                    sb.append(obj);
                }
                sb.append(", ");
            }
        }
        sb.append("}");
        return sb.toString();
    }

    public b(Map map) {
        this.f6128a = new HashMap(map);
    }
}
