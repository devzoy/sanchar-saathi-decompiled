package com.google.android.gms.internal.clearcut;

import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;

/* renamed from: com.google.android.gms.internal.clearcut.u1  reason: case insensitive filesystem */
public final class C0467u1 {

    /* renamed from: a  reason: collision with root package name */
    public final ByteBuffer f7170a;

    /* renamed from: b  reason: collision with root package name */
    public K f7171b;

    /* renamed from: c  reason: collision with root package name */
    public int f7172c;

    public C0467u1(ByteBuffer byteBuffer) {
        this.f7170a = byteBuffer;
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
    }

    public static int a(CharSequence charSequence) {
        int length = charSequence.length();
        int i4 = 0;
        int i5 = 0;
        while (i5 < length && charSequence.charAt(i5) < 128) {
            i5++;
        }
        int i6 = length;
        while (true) {
            if (i5 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i5);
            if (charAt < 2048) {
                i6 += (127 - charAt) >>> 31;
                i5++;
            } else {
                int length2 = charSequence.length();
                while (i5 < length2) {
                    char charAt2 = charSequence.charAt(i5);
                    if (charAt2 < 2048) {
                        i4 += (127 - charAt2) >>> 31;
                    } else {
                        i4 += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i5) >= 65536) {
                                i5++;
                            } else {
                                StringBuilder sb = new StringBuilder(39);
                                sb.append("Unpaired surrogate at index ");
                                sb.append(i5);
                                throw new IllegalArgumentException(sb.toString());
                            }
                        }
                    }
                    i5++;
                }
                i6 += i4;
            }
        }
        if (i6 >= length) {
            return i6;
        }
        StringBuilder sb2 = new StringBuilder(54);
        sb2.append("UTF-8 length does not fit in int: ");
        sb2.append(((long) i6) + 4294967296L);
        throw new IllegalArgumentException(sb2.toString());
    }

    public static int f(int i4, String str) {
        return v(i4) + o(str);
    }

    public static int g(int i4, byte[] bArr) {
        return v(i4) + p(bArr);
    }

    public static int k(int i4, long j4) {
        return v(i4) + u(j4);
    }

    public static void l(CharSequence charSequence, ByteBuffer byteBuffer) {
        int i4;
        char charAt;
        CharSequence charSequence2 = charSequence;
        ByteBuffer byteBuffer2 = byteBuffer;
        if (!byteBuffer.isReadOnly()) {
            char c4 = 57343;
            int i5 = 0;
            if (byteBuffer.hasArray()) {
                try {
                    byte[] array = byteBuffer.array();
                    int arrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
                    int remaining = byteBuffer.remaining();
                    int length = charSequence.length();
                    int i6 = remaining + arrayOffset;
                    while (i5 < length) {
                        int i7 = i5 + arrayOffset;
                        if (i7 >= i6 || (charAt = charSequence2.charAt(i5)) >= 128) {
                            break;
                        }
                        array[i7] = (byte) charAt;
                        i5++;
                    }
                    if (i5 == length) {
                        i4 = arrayOffset + length;
                    } else {
                        i4 = arrayOffset + i5;
                        while (i5 < length) {
                            char charAt2 = charSequence2.charAt(i5);
                            if (charAt2 < 128 && i4 < i6) {
                                array[i4] = (byte) charAt2;
                                i4++;
                            } else if (charAt2 < 2048 && i4 <= i6 - 2) {
                                int i8 = i4 + 1;
                                array[i4] = (byte) ((charAt2 >>> 6) | 960);
                                i4 += 2;
                                array[i8] = (byte) ((charAt2 & '?') | 128);
                            } else if ((charAt2 < 55296 || c4 < charAt2) && i4 <= i6 - 3) {
                                array[i4] = (byte) ((charAt2 >>> 12) | 480);
                                int i9 = i4 + 2;
                                array[i4 + 1] = (byte) (((charAt2 >>> 6) & 63) | 128);
                                i4 += 3;
                                array[i9] = (byte) ((charAt2 & '?') | 128);
                            } else if (i4 <= i6 - 4) {
                                int i10 = i5 + 1;
                                if (i10 != charSequence.length()) {
                                    char charAt3 = charSequence2.charAt(i10);
                                    if (Character.isSurrogatePair(charAt2, charAt3)) {
                                        int codePoint = Character.toCodePoint(charAt2, charAt3);
                                        array[i4] = (byte) ((codePoint >>> 18) | 240);
                                        array[i4 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                        int i11 = i4 + 3;
                                        array[i4 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                        i4 += 4;
                                        array[i11] = (byte) ((codePoint & 63) | 128);
                                        i5 = i10;
                                    } else {
                                        i5 = i10;
                                    }
                                }
                                StringBuilder sb = new StringBuilder(39);
                                sb.append("Unpaired surrogate at index ");
                                sb.append(i5 - 1);
                                throw new IllegalArgumentException(sb.toString());
                            } else {
                                StringBuilder sb2 = new StringBuilder(37);
                                sb2.append("Failed writing ");
                                sb2.append(charAt2);
                                sb2.append(" at index ");
                                sb2.append(i4);
                                throw new ArrayIndexOutOfBoundsException(sb2.toString());
                            }
                            i5++;
                            c4 = 57343;
                        }
                    }
                    byteBuffer2.position(i4 - byteBuffer.arrayOffset());
                } catch (ArrayIndexOutOfBoundsException e4) {
                    BufferOverflowException bufferOverflowException = new BufferOverflowException();
                    bufferOverflowException.initCause(e4);
                    throw bufferOverflowException;
                }
            } else {
                int length2 = charSequence.length();
                while (i5 < length2) {
                    char charAt4 = charSequence2.charAt(i5);
                    if (charAt4 >= 128) {
                        if (charAt4 < 2048) {
                            byteBuffer2.put((byte) ((charAt4 >>> 6) | 960));
                            charAt4 = (charAt4 & '?') | 128;
                        } else if (charAt4 < 55296 || 57343 < charAt4) {
                            byteBuffer2.put((byte) ((charAt4 >>> 12) | 480));
                            byteBuffer2.put((byte) (((charAt4 >>> 6) & 63) | 128));
                            byteBuffer2.put((byte) ((charAt4 & '?') | 128));
                            i5++;
                        } else {
                            int i12 = i5 + 1;
                            if (i12 != charSequence.length()) {
                                char charAt5 = charSequence2.charAt(i12);
                                if (Character.isSurrogatePair(charAt4, charAt5)) {
                                    int codePoint2 = Character.toCodePoint(charAt4, charAt5);
                                    byteBuffer2.put((byte) ((codePoint2 >>> 18) | 240));
                                    byteBuffer2.put((byte) (((codePoint2 >>> 12) & 63) | 128));
                                    byteBuffer2.put((byte) (((codePoint2 >>> 6) & 63) | 128));
                                    byteBuffer2.put((byte) ((codePoint2 & 63) | 128));
                                    i5 = i12;
                                    i5++;
                                } else {
                                    i5 = i12;
                                }
                            }
                            StringBuilder sb3 = new StringBuilder(39);
                            sb3.append("Unpaired surrogate at index ");
                            sb3.append(i5 - 1);
                            throw new IllegalArgumentException(sb3.toString());
                        }
                    }
                    byteBuffer2.put((byte) charAt4);
                    i5++;
                }
            }
        } else {
            throw new ReadOnlyBufferException();
        }
    }

    public static int o(String str) {
        int a4 = a(str);
        return x(a4) + a4;
    }

    public static int p(byte[] bArr) {
        return x(bArr.length) + bArr.length;
    }

    public static C0467u1 q(byte[] bArr, int i4, int i5) {
        return new C0467u1(bArr, 0, i5);
    }

    public static long s(long j4) {
        return (j4 >> 63) ^ (j4 << 1);
    }

    public static int u(long j4) {
        if ((-128 & j4) == 0) {
            return 1;
        }
        if ((-16384 & j4) == 0) {
            return 2;
        }
        if ((-2097152 & j4) == 0) {
            return 3;
        }
        if ((-268435456 & j4) == 0) {
            return 4;
        }
        if ((-34359738368L & j4) == 0) {
            return 5;
        }
        if ((-4398046511104L & j4) == 0) {
            return 6;
        }
        if ((-562949953421312L & j4) == 0) {
            return 7;
        }
        if ((-72057594037927936L & j4) == 0) {
            return 8;
        }
        return (j4 & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    public static int v(int i4) {
        return x(i4 << 3);
    }

    public static int w(int i4) {
        if (i4 >= 0) {
            return x(i4);
        }
        return 10;
    }

    public static int x(int i4) {
        if ((i4 & -128) == 0) {
            return 1;
        }
        if ((i4 & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i4) == 0) {
            return 3;
        }
        return (i4 & -268435456) == 0 ? 4 : 5;
    }

    public final void b(int i4, String str) {
        h(i4, 2);
        try {
            int x4 = x(str.length());
            if (x4 == x(str.length() * 3)) {
                int position = this.f7170a.position();
                if (this.f7170a.remaining() >= x4) {
                    this.f7170a.position(position + x4);
                    l(str, this.f7170a);
                    int position2 = this.f7170a.position();
                    this.f7170a.position(position);
                    e((position2 - position) - x4);
                    this.f7170a.position(position2);
                    return;
                }
                throw new C0470v1(position + x4, this.f7170a.limit());
            }
            e(a(str));
            l(str, this.f7170a);
        } catch (BufferOverflowException e4) {
            C0470v1 v1Var = new C0470v1(this.f7170a.position(), this.f7170a.limit());
            v1Var.initCause(e4);
            throw v1Var;
        }
    }

    public final void c(int i4, byte[] bArr) {
        h(i4, 2);
        e(bArr.length);
        int length = bArr.length;
        if (this.f7170a.remaining() >= length) {
            this.f7170a.put(bArr, 0, length);
            return;
        }
        throw new C0470v1(this.f7170a.position(), this.f7170a.limit());
    }

    public final void d(int i4) {
        byte b4 = (byte) i4;
        if (this.f7170a.hasRemaining()) {
            this.f7170a.put(b4);
            return;
        }
        throw new C0470v1(this.f7170a.position(), this.f7170a.limit());
    }

    public final void e(int i4) {
        while ((i4 & -128) != 0) {
            d((i4 & 127) | 128);
            i4 >>>= 7;
        }
        d(i4);
    }

    public final void h(int i4, int i5) {
        e((i4 << 3) | i5);
    }

    public final void i(int i4, boolean z4) {
        h(25, 0);
        byte b4 = z4 ? (byte) 1 : 0;
        if (this.f7170a.hasRemaining()) {
            this.f7170a.put(b4);
            return;
        }
        throw new C0470v1(this.f7170a.position(), this.f7170a.limit());
    }

    public final void j(int i4, int i5) {
        h(i4, 0);
        if (i5 >= 0) {
            e(i5);
        } else {
            t((long) i5);
        }
    }

    public final void m(int i4, B0 b02) {
        if (this.f7171b == null) {
            this.f7171b = K.d(this.f7170a);
        } else {
            if (this.f7172c != this.f7170a.position()) {
                this.f7171b.c(this.f7170a.array(), this.f7172c, this.f7170a.position() - this.f7172c);
            }
            K k4 = this.f7171b;
            k4.l(i4, b02);
            k4.b();
            this.f7172c = this.f7170a.position();
        }
        this.f7172c = this.f7170a.position();
        K k42 = this.f7171b;
        k42.l(i4, b02);
        k42.b();
        this.f7172c = this.f7170a.position();
    }

    public final void n() {
        if (this.f7170a.remaining() != 0) {
            throw new IllegalStateException(String.format("Did not write as much data as expected, %s bytes remaining.", new Object[]{Integer.valueOf(this.f7170a.remaining())}));
        }
    }

    public final void r(int i4, long j4) {
        h(i4, 0);
        t(j4);
    }

    public final void t(long j4) {
        while ((-128 & j4) != 0) {
            d((((int) j4) & 127) | 128);
            j4 >>>= 7;
        }
        d((int) j4);
    }

    public C0467u1(byte[] bArr, int i4, int i5) {
        this(ByteBuffer.wrap(bArr, i4, i5));
    }
}
