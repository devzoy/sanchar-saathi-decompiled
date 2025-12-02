package com.google.android.gms.internal.clearcut;

import java.nio.ByteBuffer;

/* renamed from: com.google.android.gms.internal.clearcut.i1  reason: case insensitive filesystem */
public abstract class C0432i1 {
    public static void d(CharSequence charSequence, ByteBuffer byteBuffer) {
        int i4;
        int length = charSequence.length();
        int position = byteBuffer.position();
        int i5 = 0;
        while (i5 < length) {
            try {
                char charAt = charSequence.charAt(i5);
                if (charAt >= 128) {
                    break;
                }
                byteBuffer.put(position + i5, (byte) charAt);
                i5++;
            } catch (IndexOutOfBoundsException unused) {
                char charAt2 = charSequence.charAt(i5);
                StringBuilder sb = new StringBuilder(37);
                sb.append("Failed writing ");
                sb.append(charAt2);
                sb.append(" at index ");
                sb.append(byteBuffer.position() + Math.max(i5, (position - byteBuffer.position()) + 1));
                throw new ArrayIndexOutOfBoundsException(sb.toString());
            }
        }
        if (i5 == length) {
            byteBuffer.position(position + i5);
            return;
        }
        position += i5;
        while (i5 < length) {
            char charAt3 = charSequence.charAt(i5);
            if (charAt3 < 128) {
                byteBuffer.put(position, (byte) charAt3);
            } else if (charAt3 < 2048) {
                i4 = position + 1;
                try {
                    byteBuffer.put(position, (byte) ((charAt3 >>> 6) | 192));
                    byteBuffer.put(i4, (byte) ((charAt3 & '?') | 128));
                    position = i4;
                } catch (IndexOutOfBoundsException unused2) {
                    position = i4;
                    char charAt22 = charSequence.charAt(i5);
                    StringBuilder sb2 = new StringBuilder(37);
                    sb2.append("Failed writing ");
                    sb2.append(charAt22);
                    sb2.append(" at index ");
                    sb2.append(byteBuffer.position() + Math.max(i5, (position - byteBuffer.position()) + 1));
                    throw new ArrayIndexOutOfBoundsException(sb2.toString());
                }
            } else if (charAt3 < 55296 || 57343 < charAt3) {
                i4 = position + 1;
                byteBuffer.put(position, (byte) ((charAt3 >>> 12) | 224));
                position += 2;
                byteBuffer.put(i4, (byte) (((charAt3 >>> 6) & 63) | 128));
                byteBuffer.put(position, (byte) ((charAt3 & '?') | 128));
            } else {
                int i6 = i5 + 1;
                if (i6 != length) {
                    try {
                        char charAt4 = charSequence.charAt(i6);
                        if (Character.isSurrogatePair(charAt3, charAt4)) {
                            int codePoint = Character.toCodePoint(charAt3, charAt4);
                            int i7 = position + 1;
                            try {
                                byteBuffer.put(position, (byte) ((codePoint >>> 18) | 240));
                                int i8 = position + 2;
                                try {
                                    byteBuffer.put(i7, (byte) (((codePoint >>> 12) & 63) | 128));
                                    position += 3;
                                    byteBuffer.put(i8, (byte) (((codePoint >>> 6) & 63) | 128));
                                    byteBuffer.put(position, (byte) ((codePoint & 63) | 128));
                                    i5 = i6;
                                } catch (IndexOutOfBoundsException unused3) {
                                    i5 = i6;
                                    position = i8;
                                    char charAt222 = charSequence.charAt(i5);
                                    StringBuilder sb22 = new StringBuilder(37);
                                    sb22.append("Failed writing ");
                                    sb22.append(charAt222);
                                    sb22.append(" at index ");
                                    sb22.append(byteBuffer.position() + Math.max(i5, (position - byteBuffer.position()) + 1));
                                    throw new ArrayIndexOutOfBoundsException(sb22.toString());
                                }
                            } catch (IndexOutOfBoundsException unused4) {
                                position = i7;
                                i5 = i6;
                                char charAt2222 = charSequence.charAt(i5);
                                StringBuilder sb222 = new StringBuilder(37);
                                sb222.append("Failed writing ");
                                sb222.append(charAt2222);
                                sb222.append(" at index ");
                                sb222.append(byteBuffer.position() + Math.max(i5, (position - byteBuffer.position()) + 1));
                                throw new ArrayIndexOutOfBoundsException(sb222.toString());
                            }
                        } else {
                            i5 = i6;
                        }
                    } catch (IndexOutOfBoundsException unused5) {
                        i5 = i6;
                        char charAt22222 = charSequence.charAt(i5);
                        StringBuilder sb2222 = new StringBuilder(37);
                        sb2222.append("Failed writing ");
                        sb2222.append(charAt22222);
                        sb2222.append(" at index ");
                        sb2222.append(byteBuffer.position() + Math.max(i5, (position - byteBuffer.position()) + 1));
                        throw new ArrayIndexOutOfBoundsException(sb2222.toString());
                    }
                }
                throw new C0438k1(i5, length);
            }
            i5++;
            position++;
        }
        byteBuffer.position(position);
    }

    public abstract int a(int i4, byte[] bArr, int i5, int i6);

    public abstract int b(CharSequence charSequence, byte[] bArr, int i4, int i5);

    public abstract void c(CharSequence charSequence, ByteBuffer byteBuffer);

    public final boolean e(byte[] bArr, int i4, int i5) {
        return a(0, bArr, i4, i5) == 0;
    }
}
