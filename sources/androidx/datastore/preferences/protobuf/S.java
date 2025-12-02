package androidx.datastore.preferences.protobuf;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public abstract class S {

    /* renamed from: a  reason: collision with root package name */
    public static final char[] f5047a;

    static {
        char[] cArr = new char[80];
        f5047a = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void a(int i4, StringBuilder sb) {
        while (i4 > 0) {
            char[] cArr = f5047a;
            int length = i4 > cArr.length ? cArr.length : i4;
            sb.append(cArr, 0, length);
            i4 -= length;
        }
    }

    public static boolean b(Object obj) {
        if (obj instanceof Boolean) {
            return !((Boolean) obj).booleanValue();
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue() == 0;
        }
        if (obj instanceof Float) {
            return Float.floatToRawIntBits(((Float) obj).floatValue()) == 0;
        }
        if (obj instanceof Double) {
            return Double.doubleToRawLongBits(((Double) obj).doubleValue()) == 0;
        }
        if (obj instanceof String) {
            return obj.equals("");
        }
        if (obj instanceof C0355g) {
            return obj.equals(C0355g.f5093f);
        }
        if (obj instanceof P) {
            return obj == ((P) obj).b();
        }
        if (obj instanceof Enum) {
            return ((Enum) obj).ordinal() == 0;
        }
        return false;
    }

    public static String c(String str) {
        if (str.isEmpty()) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(Character.toLowerCase(str.charAt(0)));
        for (int i4 = 1; i4 < str.length(); i4++) {
            char charAt = str.charAt(i4);
            if (Character.isUpperCase(charAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(charAt));
        }
        return sb.toString();
    }

    public static void d(StringBuilder sb, int i4, String str, Object obj) {
        if (obj instanceof List) {
            for (Object d4 : (List) obj) {
                d(sb, i4, str, d4);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry d5 : ((Map) obj).entrySet()) {
                d(sb, i4, str, d5);
            }
        } else {
            sb.append(10);
            a(i4, sb);
            sb.append(c(str));
            if (obj instanceof String) {
                sb.append(": \"");
                sb.append(k0.c((String) obj));
                sb.append('\"');
            } else if (obj instanceof C0355g) {
                sb.append(": \"");
                sb.append(k0.a((C0355g) obj));
                sb.append('\"');
            } else if (obj instanceof C0370w) {
                sb.append(" {");
                e((C0370w) obj, sb, i4 + 2);
                sb.append("\n");
                a(i4, sb);
                sb.append("}");
            } else if (obj instanceof Map.Entry) {
                sb.append(" {");
                Map.Entry entry = (Map.Entry) obj;
                int i5 = i4 + 2;
                d(sb, i5, "key", entry.getKey());
                d(sb, i5, "value", entry.getValue());
                sb.append("\n");
                a(i4, sb);
                sb.append("}");
            } else {
                sb.append(": ");
                sb.append(obj);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x016f, code lost:
        if (r5.containsKey("get" + r9.substring(0, r9.length() - 5)) != false) goto L_0x0130;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void e(androidx.datastore.preferences.protobuf.P r16, java.lang.StringBuilder r17, int r18) {
        /*
            r0 = r16
            r1 = r17
            r2 = r18
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            java.util.TreeMap r5 = new java.util.TreeMap
            r5.<init>()
            java.lang.Class r6 = r16.getClass()
            java.lang.reflect.Method[] r6 = r6.getDeclaredMethods()
            int r7 = r6.length
            r8 = 0
            r9 = r8
        L_0x0020:
            java.lang.String r10 = "get"
            java.lang.String r11 = "has"
            java.lang.String r12 = "set"
            r13 = 3
            if (r9 >= r7) goto L_0x008c
            r14 = r6[r9]
            int r15 = r14.getModifiers()
            boolean r15 = java.lang.reflect.Modifier.isStatic(r15)
            if (r15 == 0) goto L_0x0036
            goto L_0x0089
        L_0x0036:
            java.lang.String r15 = r14.getName()
            int r15 = r15.length()
            if (r15 >= r13) goto L_0x0041
            goto L_0x0089
        L_0x0041:
            java.lang.String r13 = r14.getName()
            boolean r12 = r13.startsWith(r12)
            if (r12 == 0) goto L_0x0053
            java.lang.String r10 = r14.getName()
            r3.add(r10)
            goto L_0x0089
        L_0x0053:
            int r12 = r14.getModifiers()
            boolean r12 = java.lang.reflect.Modifier.isPublic(r12)
            if (r12 != 0) goto L_0x005e
            goto L_0x0089
        L_0x005e:
            java.lang.Class[] r12 = r14.getParameterTypes()
            int r12 = r12.length
            if (r12 == 0) goto L_0x0066
            goto L_0x0089
        L_0x0066:
            java.lang.String r12 = r14.getName()
            boolean r11 = r12.startsWith(r11)
            if (r11 == 0) goto L_0x0078
            java.lang.String r10 = r14.getName()
            r4.put(r10, r14)
            goto L_0x0089
        L_0x0078:
            java.lang.String r11 = r14.getName()
            boolean r10 = r11.startsWith(r10)
            if (r10 == 0) goto L_0x0089
            java.lang.String r10 = r14.getName()
            r5.put(r10, r14)
        L_0x0089:
            int r9 = r9 + 1
            goto L_0x0020
        L_0x008c:
            java.util.Set r6 = r5.entrySet()
            java.util.Iterator r6 = r6.iterator()
        L_0x0094:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x01b4
            java.lang.Object r7 = r6.next()
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7
            java.lang.Object r9 = r7.getKey()
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r9 = r9.substring(r13)
            java.lang.String r14 = "List"
            boolean r15 = r9.endsWith(r14)
            if (r15 == 0) goto L_0x00e9
            java.lang.String r15 = "OrBuilderList"
            boolean r15 = r9.endsWith(r15)
            if (r15 != 0) goto L_0x00e9
            boolean r14 = r9.equals(r14)
            if (r14 != 0) goto L_0x00e9
            java.lang.Object r14 = r7.getValue()
            java.lang.reflect.Method r14 = (java.lang.reflect.Method) r14
            if (r14 == 0) goto L_0x00e9
            java.lang.Class r15 = r14.getReturnType()
            java.lang.Class<java.util.List> r13 = java.util.List.class
            boolean r13 = r15.equals(r13)
            if (r13 == 0) goto L_0x00e9
            int r7 = r9.length()
            int r7 = r7 + -4
            java.lang.String r7 = r9.substring(r8, r7)
            java.lang.Object[] r9 = new java.lang.Object[r8]
            java.lang.Object r9 = androidx.datastore.preferences.protobuf.C0370w.z(r14, r0, r9)
            d(r1, r2, r7, r9)
            r13 = 3
            goto L_0x0094
        L_0x00e9:
            java.lang.String r13 = "Map"
            boolean r14 = r9.endsWith(r13)
            if (r14 == 0) goto L_0x0133
            boolean r13 = r9.equals(r13)
            if (r13 != 0) goto L_0x0133
            java.lang.Object r13 = r7.getValue()
            java.lang.reflect.Method r13 = (java.lang.reflect.Method) r13
            if (r13 == 0) goto L_0x0133
            java.lang.Class r14 = r13.getReturnType()
            java.lang.Class<java.util.Map> r15 = java.util.Map.class
            boolean r14 = r14.equals(r15)
            if (r14 == 0) goto L_0x0133
            java.lang.Class<java.lang.Deprecated> r14 = java.lang.Deprecated.class
            boolean r14 = r13.isAnnotationPresent(r14)
            if (r14 != 0) goto L_0x0133
            int r14 = r13.getModifiers()
            boolean r14 = java.lang.reflect.Modifier.isPublic(r14)
            if (r14 == 0) goto L_0x0133
            int r7 = r9.length()
            r14 = 3
            int r7 = r7 - r14
            java.lang.String r7 = r9.substring(r8, r7)
            java.lang.Object[] r9 = new java.lang.Object[r8]
            java.lang.Object r9 = androidx.datastore.preferences.protobuf.C0370w.z(r13, r0, r9)
            d(r1, r2, r7, r9)
        L_0x0130:
            r13 = r14
            goto L_0x0094
        L_0x0133:
            r14 = 3
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r12)
            r13.append(r9)
            java.lang.String r13 = r13.toString()
            boolean r13 = r3.contains(r13)
            if (r13 != 0) goto L_0x014a
        L_0x0149:
            goto L_0x0130
        L_0x014a:
            java.lang.String r13 = "Bytes"
            boolean r13 = r9.endsWith(r13)
            if (r13 == 0) goto L_0x0172
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r10)
            int r15 = r9.length()
            int r15 = r15 + -5
            java.lang.String r15 = r9.substring(r8, r15)
            r13.append(r15)
            java.lang.String r13 = r13.toString()
            boolean r13 = r5.containsKey(r13)
            if (r13 == 0) goto L_0x0172
            goto L_0x0149
        L_0x0172:
            java.lang.Object r7 = r7.getValue()
            java.lang.reflect.Method r7 = (java.lang.reflect.Method) r7
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r11)
            r13.append(r9)
            java.lang.String r13 = r13.toString()
            java.lang.Object r13 = r4.get(r13)
            java.lang.reflect.Method r13 = (java.lang.reflect.Method) r13
            if (r7 == 0) goto L_0x0130
            java.lang.Object[] r15 = new java.lang.Object[r8]
            java.lang.Object r7 = androidx.datastore.preferences.protobuf.C0370w.z(r7, r0, r15)
            if (r13 != 0) goto L_0x01a1
            boolean r13 = b(r7)
            if (r13 != 0) goto L_0x019f
            r13 = 1
            goto L_0x01ad
        L_0x019f:
            r13 = r8
            goto L_0x01ad
        L_0x01a1:
            java.lang.Object[] r15 = new java.lang.Object[r8]
            java.lang.Object r13 = androidx.datastore.preferences.protobuf.C0370w.z(r13, r0, r15)
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
        L_0x01ad:
            if (r13 == 0) goto L_0x0130
            d(r1, r2, r9, r7)
            goto L_0x0130
        L_0x01b4:
            androidx.datastore.preferences.protobuf.w r0 = (androidx.datastore.preferences.protobuf.C0370w) r0
            androidx.datastore.preferences.protobuf.n0 r0 = r0.unknownFields
            if (r0 == 0) goto L_0x01bd
            r0.m(r1, r2)
        L_0x01bd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.S.e(androidx.datastore.preferences.protobuf.P, java.lang.StringBuilder, int):void");
    }

    public static String f(P p4, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        e(p4, sb, 0);
        return sb.toString();
    }
}
