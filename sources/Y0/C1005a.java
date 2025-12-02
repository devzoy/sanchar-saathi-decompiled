package y0;

import v3.g;
import v3.l;

/* renamed from: y0.a  reason: case insensitive filesystem */
public final class C1005a implements j {

    /* renamed from: g  reason: collision with root package name */
    public static final C0209a f12707g = new C0209a((g) null);

    /* renamed from: e  reason: collision with root package name */
    public final String f12708e;

    /* renamed from: f  reason: collision with root package name */
    public final Object[] f12709f;

    /* renamed from: y0.a$a  reason: collision with other inner class name */
    public static final class C0209a {
        public /* synthetic */ C0209a(g gVar) {
            this();
        }

        public final void a(i iVar, int i4, Object obj) {
            if (obj == null) {
                iVar.bindNull(i4);
            } else if (obj instanceof byte[]) {
                iVar.bindBlob(i4, (byte[]) obj);
            } else if (obj instanceof Float) {
                iVar.bindDouble(i4, (double) ((Number) obj).floatValue());
            } else if (obj instanceof Double) {
                iVar.bindDouble(i4, ((Number) obj).doubleValue());
            } else if (obj instanceof Long) {
                iVar.bindLong(i4, ((Number) obj).longValue());
            } else if (obj instanceof Integer) {
                iVar.bindLong(i4, (long) ((Number) obj).intValue());
            } else if (obj instanceof Short) {
                iVar.bindLong(i4, (long) ((Number) obj).shortValue());
            } else if (obj instanceof Byte) {
                iVar.bindLong(i4, (long) ((Number) obj).byteValue());
            } else if (obj instanceof String) {
                iVar.bindString(i4, (String) obj);
            } else if (obj instanceof Boolean) {
                iVar.bindLong(i4, ((Boolean) obj).booleanValue() ? 1 : 0);
            } else {
                throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i4 + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
            }
        }

        public final void b(i iVar, Object[] objArr) {
            l.e(iVar, "statement");
            if (objArr != null) {
                int length = objArr.length;
                int i4 = 0;
                while (i4 < length) {
                    Object obj = objArr[i4];
                    i4++;
                    a(iVar, i4, obj);
                }
            }
        }

        public C0209a() {
        }
    }

    public C1005a(String str, Object[] objArr) {
        l.e(str, "query");
        this.f12708e = str;
        this.f12709f = objArr;
    }

    public String b() {
        return this.f12708e;
    }

    public int c() {
        Object[] objArr = this.f12709f;
        if (objArr != null) {
            return objArr.length;
        }
        return 0;
    }

    public void d(i iVar) {
        l.e(iVar, "statement");
        f12707g.b(iVar, this.f12709f);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C1005a(String str) {
        this(str, (Object[]) null);
        l.e(str, "query");
    }
}
