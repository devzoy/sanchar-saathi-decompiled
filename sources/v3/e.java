package v3;

import A3.b;
import h3.C0666g;
import h3.C0670k;
import i3.C0720D;
import i3.C0721E;
import i3.C0738o;
import i3.C0739p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import u3.c;
import u3.d;
import u3.f;
import u3.g;
import u3.h;
import u3.i;
import u3.j;
import u3.k;
import u3.l;
import u3.m;
import u3.n;
import u3.o;
import u3.p;
import u3.q;
import u3.r;
import u3.s;
import u3.t;
import u3.u;
import u3.v;
import u3.w;

public final class e implements b, d {

    /* renamed from: b  reason: collision with root package name */
    public static final a f12452b = new a((g) null);

    /* renamed from: c  reason: collision with root package name */
    public static final Map f12453c;

    /* renamed from: d  reason: collision with root package name */
    public static final HashMap f12454d;

    /* renamed from: e  reason: collision with root package name */
    public static final HashMap f12455e;

    /* renamed from: f  reason: collision with root package name */
    public static final HashMap f12456f;

    /* renamed from: g  reason: collision with root package name */
    public static final Map f12457g;

    /* renamed from: a  reason: collision with root package name */
    public final Class f12458a;

    public static final class a {
        public /* synthetic */ a(g gVar) {
            this();
        }

        public final String a(Class cls) {
            String str;
            l.e(cls, "jClass");
            String str2 = null;
            if (cls.isAnonymousClass() || cls.isLocalClass()) {
                return null;
            }
            if (cls.isArray()) {
                Class<?> componentType = cls.getComponentType();
                if (componentType.isPrimitive() && (str = (String) e.f12456f.get(componentType.getName())) != null) {
                    str2 = str + "Array";
                }
                return str2 == null ? "kotlin.Array" : str2;
            }
            String str3 = (String) e.f12456f.get(cls.getName());
            return str3 == null ? cls.getCanonicalName() : str3;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:7:0x003b, code lost:
            if (r2 == null) goto L_0x0041;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.String b(java.lang.Class r7) {
            /*
                r6 = this;
                java.lang.String r0 = "jClass"
                v3.l.e(r7, r0)
                boolean r0 = r7.isAnonymousClass()
                r1 = 0
                if (r0 == 0) goto L_0x000e
                goto L_0x00b3
            L_0x000e:
                boolean r0 = r7.isLocalClass()
                if (r0 == 0) goto L_0x006a
                java.lang.String r0 = r7.getSimpleName()
                java.lang.reflect.Method r2 = r7.getEnclosingMethod()
                r3 = 2
                r4 = 36
                if (r2 == 0) goto L_0x0041
                v3.l.b(r0)
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r2 = r2.getName()
                r5.append(r2)
                r5.append(r4)
                java.lang.String r2 = r5.toString()
                java.lang.String r2 = C3.p.U(r0, r2, r1, r3, r1)
                if (r2 != 0) goto L_0x003e
                goto L_0x0041
            L_0x003e:
                r1 = r2
                goto L_0x00b3
            L_0x0041:
                java.lang.reflect.Constructor r7 = r7.getEnclosingConstructor()
                if (r7 == 0) goto L_0x0062
                v3.l.b(r0)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r7 = r7.getName()
                r2.append(r7)
                r2.append(r4)
                java.lang.String r7 = r2.toString()
                java.lang.String r1 = C3.p.U(r0, r7, r1, r3, r1)
                goto L_0x00b3
            L_0x0062:
                v3.l.b(r0)
                java.lang.String r1 = C3.p.T(r0, r4, r1, r3, r1)
                goto L_0x00b3
            L_0x006a:
                boolean r0 = r7.isArray()
                if (r0 == 0) goto L_0x009e
                java.lang.Class r7 = r7.getComponentType()
                boolean r0 = r7.isPrimitive()
                java.lang.String r2 = "Array"
                if (r0 == 0) goto L_0x009b
                java.util.Map r0 = v3.e.f12457g
                java.lang.String r7 = r7.getName()
                java.lang.Object r7 = r0.get(r7)
                java.lang.String r7 = (java.lang.String) r7
                if (r7 == 0) goto L_0x009b
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r7)
                r0.append(r2)
                java.lang.String r1 = r0.toString()
            L_0x009b:
                if (r1 != 0) goto L_0x00b3
                goto L_0x003e
            L_0x009e:
                java.util.Map r0 = v3.e.f12457g
                java.lang.String r1 = r7.getName()
                java.lang.Object r0 = r0.get(r1)
                r1 = r0
                java.lang.String r1 = (java.lang.String) r1
                if (r1 != 0) goto L_0x00b3
                java.lang.String r1 = r7.getSimpleName()
            L_0x00b3:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: v3.e.a.b(java.lang.Class):java.lang.String");
        }

        public final boolean c(Object obj, Class cls) {
            l.e(cls, "jClass");
            Map f4 = e.f12453c;
            l.c(f4, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
            Integer num = (Integer) f4.get(cls);
            if (num != null) {
                return z.c(obj, num.intValue());
            }
            if (cls.isPrimitive()) {
                cls = t3.a.b(t3.a.c(cls));
            }
            return cls.isInstance(obj);
        }

        public a() {
        }
    }

    static {
        Iterable j4 = C0738o.j(u3.a.class, l.class, p.class, q.class, r.class, s.class, t.class, u.class, v.class, w.class, u3.b.class, c.class, d.class, u3.e.class, f.class, g.class, h.class, i.class, j.class, k.class, m.class, n.class, o.class);
        ArrayList arrayList = new ArrayList(C0739p.m(j4, 10));
        int i4 = 0;
        for (Object next : j4) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                C0738o.l();
            }
            arrayList.add(C0670k.a((Class) next, Integer.valueOf(i4)));
            i4 = i5;
        }
        f12453c = C0721E.o(arrayList);
        HashMap hashMap = new HashMap();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        f12454d = hashMap;
        HashMap hashMap2 = new HashMap();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        f12455e = hashMap2;
        HashMap hashMap3 = new HashMap();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        Collection<String> values = hashMap.values();
        l.d(values, "<get-values>(...)");
        for (String str : values) {
            StringBuilder sb = new StringBuilder();
            sb.append("kotlin.jvm.internal.");
            l.b(str);
            sb.append(C3.p.W(str, '.', (String) null, 2, (Object) null));
            sb.append("CompanionObject");
            String sb2 = sb.toString();
            C0666g a4 = C0670k.a(sb2, str + ".Companion");
            hashMap3.put(a4.c(), a4.d());
        }
        for (Map.Entry entry : f12453c.entrySet()) {
            int intValue = ((Number) entry.getValue()).intValue();
            String name = ((Class) entry.getKey()).getName();
            hashMap3.put(name, "kotlin.Function" + intValue);
        }
        f12456f = hashMap3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C0720D.d(hashMap3.size()));
        for (Map.Entry entry2 : hashMap3.entrySet()) {
            Object key = entry2.getKey();
            String str2 = (String) entry2.getValue();
            l.b(str2);
            linkedHashMap.put(key, C3.p.W(str2, '.', (String) null, 2, (Object) null));
        }
        f12457g = linkedHashMap;
    }

    public e(Class cls) {
        l.e(cls, "jClass");
        this.f12458a = cls;
    }

    public String a() {
        return f12452b.a(d());
    }

    public boolean b(Object obj) {
        return f12452b.c(obj, d());
    }

    public String c() {
        return f12452b.b(d());
    }

    public Class d() {
        return this.f12458a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof e) && l.a(t3.a.b(this), t3.a.b((b) obj));
    }

    public int hashCode() {
        return t3.a.b(this).hashCode();
    }

    public String toString() {
        return d() + " (Kotlin reflection is not available)";
    }
}
