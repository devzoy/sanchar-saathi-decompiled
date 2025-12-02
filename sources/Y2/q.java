package Y2;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public final class q implements h {

    /* renamed from: a  reason: collision with root package name */
    public static final Charset f3783a = Charset.forName("UTF8");

    /* renamed from: b  reason: collision with root package name */
    public static final q f3784b = new q();

    /* renamed from: c */
    public String b(ByteBuffer byteBuffer) {
        int i4;
        byte[] bArr;
        if (byteBuffer == null) {
            return null;
        }
        int remaining = byteBuffer.remaining();
        if (byteBuffer.hasArray()) {
            bArr = byteBuffer.array();
            i4 = byteBuffer.arrayOffset();
        } else {
            bArr = new byte[remaining];
            byteBuffer.get(bArr);
            i4 = 0;
        }
        return new String(bArr, i4, remaining, f3783a);
    }

    /* renamed from: d */
    public ByteBuffer a(String str) {
        if (str == null) {
            return null;
        }
        byte[] bytes = str.getBytes(f3783a);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bytes.length);
        allocateDirect.put(bytes);
        return allocateDirect;
    }
}
