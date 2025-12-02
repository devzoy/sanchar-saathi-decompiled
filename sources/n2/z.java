package N2;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class z {

    /* renamed from: a  reason: collision with root package name */
    public long f1992a;

    /* renamed from: b  reason: collision with root package name */
    public b f1993b;

    /* renamed from: c  reason: collision with root package name */
    public long f1994c;

    /* renamed from: d  reason: collision with root package name */
    public long f1995d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f1996e;

    /* renamed from: f  reason: collision with root package name */
    public a f1997f;

    /* renamed from: g  reason: collision with root package name */
    public String f1998g;

    public enum a {
        kKeyboard(0),
        kDirectionalPad(1),
        kGamepad(2),
        kJoystick(3),
        kHdmi(4);
        

        /* renamed from: e  reason: collision with root package name */
        public final long f2005e;

        /* access modifiers changed from: public */
        a(long j4) {
            this.f2005e = j4;
        }

        public long f() {
            return this.f2005e;
        }
    }

    public enum b {
        kDown(0),
        kUp(1),
        kRepeat(2);
        

        /* renamed from: e  reason: collision with root package name */
        public long f2010e;

        /* access modifiers changed from: public */
        b(long j4) {
            this.f2010e = j4;
        }

        public long f() {
            return this.f2010e;
        }
    }

    public ByteBuffer a() {
        try {
            String str = this.f1998g;
            byte[] bytes = str == null ? null : str.getBytes("UTF-8");
            int length = bytes == null ? 0 : bytes.length;
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(length + 56);
            allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
            allocateDirect.putLong((long) length);
            allocateDirect.putLong(this.f1992a);
            allocateDirect.putLong(this.f1993b.f());
            allocateDirect.putLong(this.f1994c);
            allocateDirect.putLong(this.f1995d);
            allocateDirect.putLong(this.f1996e ? 1 : 0);
            allocateDirect.putLong(this.f1997f.f());
            if (bytes != null) {
                allocateDirect.put(bytes);
            }
            return allocateDirect;
        } catch (UnsupportedEncodingException unused) {
            throw new AssertionError("UTF-8 not supported");
        }
    }
}
