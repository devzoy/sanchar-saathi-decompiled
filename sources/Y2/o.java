package Y2;

import java.io.ByteArrayOutputStream;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Map;

public class o implements h {

    /* renamed from: a  reason: collision with root package name */
    public static final o f3778a = new o();

    /* renamed from: b  reason: collision with root package name */
    public static final boolean f3779b = (ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN);

    /* renamed from: c  reason: collision with root package name */
    public static final Charset f3780c = Charset.forName("UTF8");

    public static final class a extends ByteArrayOutputStream {
        public byte[] b() {
            return this.buf;
        }
    }

    public static final void c(ByteBuffer byteBuffer, int i4) {
        int position = byteBuffer.position() % i4;
        if (position != 0) {
            byteBuffer.position((byteBuffer.position() + i4) - position);
        }
    }

    public static final byte[] d(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[e(byteBuffer)];
        byteBuffer.get(bArr);
        return bArr;
    }

    public static final int e(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            byte b4 = byteBuffer.get() & 255;
            return b4 < 254 ? b4 : b4 == 254 ? byteBuffer.getChar() : byteBuffer.getInt();
        }
        throw new IllegalArgumentException("Message corrupted");
    }

    public static final void h(ByteArrayOutputStream byteArrayOutputStream, int i4) {
        int size = byteArrayOutputStream.size() % i4;
        if (size != 0) {
            for (int i5 = 0; i5 < i4 - size; i5++) {
                byteArrayOutputStream.write(0);
            }
        }
    }

    public static final void i(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr) {
        o(byteArrayOutputStream, bArr.length);
        byteArrayOutputStream.write(bArr, 0, bArr.length);
    }

    public static final void j(ByteArrayOutputStream byteArrayOutputStream, int i4) {
        if (f3779b) {
            byteArrayOutputStream.write(i4);
            byteArrayOutputStream.write(i4 >>> 8);
            return;
        }
        byteArrayOutputStream.write(i4 >>> 8);
        byteArrayOutputStream.write(i4);
    }

    public static final void k(ByteArrayOutputStream byteArrayOutputStream, double d4) {
        n(byteArrayOutputStream, Double.doubleToLongBits(d4));
    }

    public static final void l(ByteArrayOutputStream byteArrayOutputStream, float f4) {
        m(byteArrayOutputStream, Float.floatToIntBits(f4));
    }

    public static final void m(ByteArrayOutputStream byteArrayOutputStream, int i4) {
        if (f3779b) {
            byteArrayOutputStream.write(i4);
            byteArrayOutputStream.write(i4 >>> 8);
            byteArrayOutputStream.write(i4 >>> 16);
            byteArrayOutputStream.write(i4 >>> 24);
            return;
        }
        byteArrayOutputStream.write(i4 >>> 24);
        byteArrayOutputStream.write(i4 >>> 16);
        byteArrayOutputStream.write(i4 >>> 8);
        byteArrayOutputStream.write(i4);
    }

    public static final void n(ByteArrayOutputStream byteArrayOutputStream, long j4) {
        if (f3779b) {
            byteArrayOutputStream.write((byte) ((int) j4));
            byteArrayOutputStream.write((byte) ((int) (j4 >>> 8)));
            byteArrayOutputStream.write((byte) ((int) (j4 >>> 16)));
            byteArrayOutputStream.write((byte) ((int) (j4 >>> 24)));
            byteArrayOutputStream.write((byte) ((int) (j4 >>> 32)));
            byteArrayOutputStream.write((byte) ((int) (j4 >>> 40)));
            byteArrayOutputStream.write((byte) ((int) (j4 >>> 48)));
            byteArrayOutputStream.write((byte) ((int) (j4 >>> 56)));
            return;
        }
        byteArrayOutputStream.write((byte) ((int) (j4 >>> 56)));
        byteArrayOutputStream.write((byte) ((int) (j4 >>> 48)));
        byteArrayOutputStream.write((byte) ((int) (j4 >>> 40)));
        byteArrayOutputStream.write((byte) ((int) (j4 >>> 32)));
        byteArrayOutputStream.write((byte) ((int) (j4 >>> 24)));
        byteArrayOutputStream.write((byte) ((int) (j4 >>> 16)));
        byteArrayOutputStream.write((byte) ((int) (j4 >>> 8)));
        byteArrayOutputStream.write((byte) ((int) j4));
    }

    public static final void o(ByteArrayOutputStream byteArrayOutputStream, int i4) {
        if (i4 < 254) {
            byteArrayOutputStream.write(i4);
        } else if (i4 <= 65535) {
            byteArrayOutputStream.write(254);
            j(byteArrayOutputStream, i4);
        } else {
            byteArrayOutputStream.write(255);
            m(byteArrayOutputStream, i4);
        }
    }

    public ByteBuffer a(Object obj) {
        if (obj == null) {
            return null;
        }
        a aVar = new a();
        p(aVar, obj);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(aVar.size());
        allocateDirect.put(aVar.b(), 0, aVar.size());
        return allocateDirect;
    }

    public Object b(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        byteBuffer.order(ByteOrder.nativeOrder());
        Object f4 = f(byteBuffer);
        if (!byteBuffer.hasRemaining()) {
            return f4;
        }
        throw new IllegalArgumentException("Message corrupted");
    }

    public final Object f(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            return g(byteBuffer.get(), byteBuffer);
        }
        throw new IllegalArgumentException("Message corrupted");
    }

    /* JADX WARNING: type inference failed for: r1v10, types: [java.util.Map, java.util.HashMap] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object g(byte r5, java.nio.ByteBuffer r6) {
        /*
            r4 = this;
            r0 = 0
            r1 = 4
            r2 = 8
            switch(r5) {
                case 0: goto L_0x00f2;
                case 1: goto L_0x00ef;
                case 2: goto L_0x00ec;
                case 3: goto L_0x00e3;
                case 4: goto L_0x00da;
                case 5: goto L_0x00c7;
                case 6: goto L_0x00bb;
                case 7: goto L_0x00af;
                case 8: goto L_0x00aa;
                case 9: goto L_0x0090;
                case 10: goto L_0x0076;
                case 11: goto L_0x005b;
                case 12: goto L_0x0046;
                case 13: goto L_0x002a;
                case 14: goto L_0x000f;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Message corrupted"
            r5.<init>(r6)
            throw r5
        L_0x000f:
            int r5 = e(r6)
            float[] r0 = new float[r5]
            c(r6, r1)
            java.nio.FloatBuffer r2 = r6.asFloatBuffer()
            r2.get(r0)
            int r2 = r6.position()
            int r5 = r5 * r1
            int r2 = r2 + r5
            r6.position(r2)
            goto L_0x00f3
        L_0x002a:
            int r5 = e(r6)
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
        L_0x0033:
            if (r0 >= r5) goto L_0x0043
            java.lang.Object r2 = r4.f(r6)
            java.lang.Object r3 = r4.f(r6)
            r1.put(r2, r3)
            int r0 = r0 + 1
            goto L_0x0033
        L_0x0043:
            r0 = r1
            goto L_0x00f3
        L_0x0046:
            int r5 = e(r6)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r5)
        L_0x004f:
            if (r0 >= r5) goto L_0x0043
            java.lang.Object r2 = r4.f(r6)
            r1.add(r2)
            int r0 = r0 + 1
            goto L_0x004f
        L_0x005b:
            int r5 = e(r6)
            double[] r0 = new double[r5]
            c(r6, r2)
            java.nio.DoubleBuffer r1 = r6.asDoubleBuffer()
            r1.get(r0)
            int r1 = r6.position()
            int r5 = r5 * r2
            int r1 = r1 + r5
            r6.position(r1)
            goto L_0x00f3
        L_0x0076:
            int r5 = e(r6)
            long[] r0 = new long[r5]
            c(r6, r2)
            java.nio.LongBuffer r1 = r6.asLongBuffer()
            r1.get(r0)
            int r1 = r6.position()
            int r5 = r5 * r2
            int r1 = r1 + r5
            r6.position(r1)
            goto L_0x00f3
        L_0x0090:
            int r5 = e(r6)
            int[] r0 = new int[r5]
            c(r6, r1)
            java.nio.IntBuffer r2 = r6.asIntBuffer()
            r2.get(r0)
            int r2 = r6.position()
            int r5 = r5 * r1
            int r2 = r2 + r5
            r6.position(r2)
            goto L_0x00f3
        L_0x00aa:
            byte[] r0 = d(r6)
            goto L_0x00f3
        L_0x00af:
            byte[] r5 = d(r6)
            java.lang.String r0 = new java.lang.String
            java.nio.charset.Charset r6 = f3780c
            r0.<init>(r5, r6)
            goto L_0x00f3
        L_0x00bb:
            c(r6, r2)
            double r5 = r6.getDouble()
            java.lang.Double r0 = java.lang.Double.valueOf(r5)
            goto L_0x00f3
        L_0x00c7:
            byte[] r5 = d(r6)
            java.math.BigInteger r0 = new java.math.BigInteger
            java.lang.String r6 = new java.lang.String
            java.nio.charset.Charset r1 = f3780c
            r6.<init>(r5, r1)
            r5 = 16
            r0.<init>(r6, r5)
            goto L_0x00f3
        L_0x00da:
            long r5 = r6.getLong()
            java.lang.Long r0 = java.lang.Long.valueOf(r5)
            goto L_0x00f3
        L_0x00e3:
            int r5 = r6.getInt()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            goto L_0x00f3
        L_0x00ec:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            goto L_0x00f3
        L_0x00ef:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            goto L_0x00f3
        L_0x00f2:
            r0 = 0
        L_0x00f3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Y2.o.g(byte, java.nio.ByteBuffer):java.lang.Object");
    }

    public void p(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
        int i4 = 0;
        if (obj == null || obj.equals((Object) null)) {
            byteArrayOutputStream.write(0);
        } else if (obj instanceof Boolean) {
            byteArrayOutputStream.write(((Boolean) obj).booleanValue() ? 1 : 2);
        } else if (obj instanceof Number) {
            if ((obj instanceof Integer) || (obj instanceof Short) || (obj instanceof Byte)) {
                byteArrayOutputStream.write(3);
                m(byteArrayOutputStream, ((Number) obj).intValue());
            } else if (obj instanceof Long) {
                byteArrayOutputStream.write(4);
                n(byteArrayOutputStream, ((Long) obj).longValue());
            } else if ((obj instanceof Float) || (obj instanceof Double)) {
                byteArrayOutputStream.write(6);
                h(byteArrayOutputStream, 8);
                k(byteArrayOutputStream, ((Number) obj).doubleValue());
            } else if (obj instanceof BigInteger) {
                byteArrayOutputStream.write(5);
                i(byteArrayOutputStream, ((BigInteger) obj).toString(16).getBytes(f3780c));
            } else {
                throw new IllegalArgumentException("Unsupported Number type: " + obj.getClass());
            }
        } else if (obj instanceof CharSequence) {
            byteArrayOutputStream.write(7);
            i(byteArrayOutputStream, obj.toString().getBytes(f3780c));
        } else if (obj instanceof byte[]) {
            byteArrayOutputStream.write(8);
            i(byteArrayOutputStream, (byte[]) obj);
        } else if (obj instanceof int[]) {
            byteArrayOutputStream.write(9);
            int[] iArr = (int[]) obj;
            o(byteArrayOutputStream, iArr.length);
            h(byteArrayOutputStream, 4);
            int length = iArr.length;
            while (i4 < length) {
                m(byteArrayOutputStream, iArr[i4]);
                i4++;
            }
        } else if (obj instanceof long[]) {
            byteArrayOutputStream.write(10);
            long[] jArr = (long[]) obj;
            o(byteArrayOutputStream, jArr.length);
            h(byteArrayOutputStream, 8);
            int length2 = jArr.length;
            while (i4 < length2) {
                n(byteArrayOutputStream, jArr[i4]);
                i4++;
            }
        } else if (obj instanceof double[]) {
            byteArrayOutputStream.write(11);
            double[] dArr = (double[]) obj;
            o(byteArrayOutputStream, dArr.length);
            h(byteArrayOutputStream, 8);
            int length3 = dArr.length;
            while (i4 < length3) {
                k(byteArrayOutputStream, dArr[i4]);
                i4++;
            }
        } else if (obj instanceof List) {
            byteArrayOutputStream.write(12);
            List<Object> list = (List) obj;
            o(byteArrayOutputStream, list.size());
            for (Object p4 : list) {
                p(byteArrayOutputStream, p4);
            }
        } else if (obj instanceof Map) {
            byteArrayOutputStream.write(13);
            Map map = (Map) obj;
            o(byteArrayOutputStream, map.size());
            for (Map.Entry entry : map.entrySet()) {
                p(byteArrayOutputStream, entry.getKey());
                p(byteArrayOutputStream, entry.getValue());
            }
        } else if (obj instanceof float[]) {
            byteArrayOutputStream.write(14);
            float[] fArr = (float[]) obj;
            o(byteArrayOutputStream, fArr.length);
            h(byteArrayOutputStream, 4);
            int length4 = fArr.length;
            while (i4 < length4) {
                l(byteArrayOutputStream, fArr[i4]);
                i4++;
            }
        } else {
            throw new IllegalArgumentException("Unsupported value: '" + obj + "' of type '" + obj.getClass() + "'");
        }
    }
}
