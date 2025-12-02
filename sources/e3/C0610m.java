package e3;

import Y2.o;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.List;
import v3.l;

/* renamed from: e3.m  reason: case insensitive filesystem */
public class C0610m extends o {
    public Object g(byte b4, ByteBuffer byteBuffer) {
        l.e(byteBuffer, "buffer");
        if (b4 == -127) {
            Long l4 = (Long) f(byteBuffer);
            if (l4 == null) {
                return null;
            }
            return K.f8921f.a((int) l4.longValue());
        } else if (b4 == -126) {
            Object f4 = f(byteBuffer);
            List list = f4 instanceof List ? (List) f4 : null;
            if (list != null) {
                return H.f8791c.a(list);
            }
            return null;
        } else if (b4 != -125) {
            return super.g(b4, byteBuffer);
        } else {
            Object f5 = f(byteBuffer);
            List list2 = f5 instanceof List ? (List) f5 : null;
            if (list2 != null) {
                return M.f8928c.a(list2);
            }
            return null;
        }
    }

    public void p(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
        l.e(byteArrayOutputStream, "stream");
        if (obj instanceof K) {
            byteArrayOutputStream.write(129);
            p(byteArrayOutputStream, Integer.valueOf(((K) obj).f()));
        } else if (obj instanceof H) {
            byteArrayOutputStream.write(130);
            p(byteArrayOutputStream, ((H) obj).b());
        } else if (obj instanceof M) {
            byteArrayOutputStream.write(131);
            p(byteArrayOutputStream, ((M) obj).a());
        } else {
            super.p(byteArrayOutputStream, obj);
        }
    }
}
