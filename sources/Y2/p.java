package Y2;

import M2.b;
import Y2.o;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public final class p implements k {

    /* renamed from: b  reason: collision with root package name */
    public static final p f3781b = new p(o.f3778a);

    /* renamed from: a  reason: collision with root package name */
    public final o f3782a;

    public p(o oVar) {
        this.f3782a = oVar;
    }

    public ByteBuffer a(Object obj) {
        o.a aVar = new o.a();
        aVar.write(0);
        this.f3782a.p(aVar, obj);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(aVar.size());
        allocateDirect.put(aVar.b(), 0, aVar.size());
        return allocateDirect;
    }

    public ByteBuffer b(String str, String str2, Object obj, String str3) {
        o.a aVar = new o.a();
        aVar.write(1);
        this.f3782a.p(aVar, str);
        this.f3782a.p(aVar, str2);
        if (obj instanceof Throwable) {
            this.f3782a.p(aVar, b.d((Throwable) obj));
        } else {
            this.f3782a.p(aVar, obj);
        }
        this.f3782a.p(aVar, str3);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(aVar.size());
        allocateDirect.put(aVar.b(), 0, aVar.size());
        return allocateDirect;
    }

    public ByteBuffer c(i iVar) {
        o.a aVar = new o.a();
        this.f3782a.p(aVar, iVar.f3766a);
        this.f3782a.p(aVar, iVar.f3767b);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(aVar.size());
        allocateDirect.put(aVar.b(), 0, aVar.size());
        return allocateDirect;
    }

    public ByteBuffer d(String str, String str2, Object obj) {
        o.a aVar = new o.a();
        aVar.write(1);
        this.f3782a.p(aVar, str);
        this.f3782a.p(aVar, str2);
        if (obj instanceof Throwable) {
            this.f3782a.p(aVar, b.d((Throwable) obj));
        } else {
            this.f3782a.p(aVar, obj);
        }
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(aVar.size());
        allocateDirect.put(aVar.b(), 0, aVar.size());
        return allocateDirect;
    }

    public i e(ByteBuffer byteBuffer) {
        byteBuffer.order(ByteOrder.nativeOrder());
        Object f4 = this.f3782a.f(byteBuffer);
        Object f5 = this.f3782a.f(byteBuffer);
        if ((f4 instanceof String) && !byteBuffer.hasRemaining()) {
            return new i((String) f4, f5);
        }
        throw new IllegalArgumentException("Method call corrupted");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (r0 == 1) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object f(java.nio.ByteBuffer r5) {
        /*
            r4 = this;
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            r5.order(r0)
            byte r0 = r5.get()
            if (r0 == 0) goto L_0x0011
            r1 = 1
            if (r0 != r1) goto L_0x004a
            goto L_0x001e
        L_0x0011:
            Y2.o r0 = r4.f3782a
            java.lang.Object r0 = r0.f(r5)
            boolean r1 = r5.hasRemaining()
            if (r1 != 0) goto L_0x001e
            return r0
        L_0x001e:
            Y2.o r0 = r4.f3782a
            java.lang.Object r0 = r0.f(r5)
            Y2.o r1 = r4.f3782a
            java.lang.Object r1 = r1.f(r5)
            Y2.o r2 = r4.f3782a
            java.lang.Object r2 = r2.f(r5)
            boolean r3 = r0 instanceof java.lang.String
            if (r3 == 0) goto L_0x004a
            if (r1 == 0) goto L_0x003a
            boolean r3 = r1 instanceof java.lang.String
            if (r3 == 0) goto L_0x004a
        L_0x003a:
            boolean r5 = r5.hasRemaining()
            if (r5 != 0) goto L_0x004a
            Y2.d r5 = new Y2.d
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = (java.lang.String) r1
            r5.<init>(r0, r1, r2)
            throw r5
        L_0x004a:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Envelope corrupted"
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: Y2.p.f(java.nio.ByteBuffer):java.lang.Object");
    }
}
