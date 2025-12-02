package com.google.android.gms.internal.clearcut;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public abstract class Q1 {
    public static int a(byte[] bArr, int i4) {
        return ((bArr[i4 + 3] & 255) << 24) | (bArr[i4] & 255) | ((bArr[i4 + 1] & 255) << 8) | ((bArr[i4 + 2] & 255) << 16);
    }

    public static long b(long j4, long j5, long j6) {
        long j7 = (j4 ^ j5) * j6;
        long j8 = ((j7 ^ (j7 >>> 47)) ^ j5) * j6;
        return (j8 ^ (j8 >>> 47)) * j6;
    }

    public static long c(byte[] bArr) {
        byte[] bArr2 = bArr;
        int length = bArr2.length;
        if (length < 0 || length > bArr2.length) {
            StringBuilder sb = new StringBuilder(67);
            sb.append("Out of bound index with offput: 0 and length: ");
            sb.append(length);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        char c4 = 0;
        if (length <= 32) {
            if (length > 16) {
                long j4 = ((long) (length << 1)) - 7286425919675154353L;
                long e4 = e(bArr2, 0) * -5435081209227447693L;
                long e5 = e(bArr2, 8);
                long e6 = e(bArr2, length - 8) * j4;
                return b(Long.rotateRight(e4 + e5, 43) + Long.rotateRight(e6, 30) + (e(bArr2, length - 16) * -7286425919675154353L), e4 + Long.rotateRight(e5 - 7286425919675154353L, 18) + e6, j4);
            } else if (length >= 8) {
                long j5 = ((long) (length << 1)) - 7286425919675154353L;
                long e7 = e(bArr2, 0) - 7286425919675154353L;
                long e8 = e(bArr2, length - 8);
                return b((Long.rotateRight(e8, 37) * j5) + e7, (Long.rotateRight(e7, 25) + e8) * j5, j5);
            } else if (length >= 4) {
                return b(((((long) a(bArr2, 0)) & 4294967295L) << 3) + ((long) length), ((long) a(bArr2, length - 4)) & 4294967295L, ((long) (length << 1)) - 7286425919675154353L);
            } else if (length <= 0) {
                return -7286425919675154353L;
            } else {
                long j6 = (((long) ((bArr2[0] & 255) + ((bArr2[length >> 1] & 255) << 8))) * -7286425919675154353L) ^ (((long) (length + ((bArr2[length - 1] & 255) << 2))) * -4348849565147123417L);
                return (j6 ^ (j6 >>> 47)) * -7286425919675154353L;
            }
        } else if (length <= 64) {
            long j7 = ((long) (length << 1)) - 7286425919675154353L;
            long e9 = e(bArr2, 0) * -7286425919675154353L;
            long e10 = e(bArr2, 8);
            long e11 = e(bArr2, length - 8) * j7;
            long rotateRight = Long.rotateRight(e9 + e10, 43) + Long.rotateRight(e11, 30) + (e(bArr2, length - 16) * -7286425919675154353L);
            long b4 = b(rotateRight, e11 + e9 + Long.rotateRight(e10 - 7286425919675154353L, 18), j7);
            byte[] bArr3 = bArr;
            long e12 = e(bArr3, 16) * j7;
            long e13 = e(bArr3, 24);
            long e14 = (rotateRight + e(bArr3, length - 32)) * j7;
            return b(Long.rotateRight(e12 + e13, 43) + Long.rotateRight(e14, 30) + ((b4 + e(bArr3, length - 24)) * j7), e12 + Long.rotateRight(e13 + e9, 18) + e14, j7);
        } else {
            byte[] bArr4 = bArr2;
            long[] jArr = new long[2];
            long[] jArr2 = new long[2];
            long e15 = e(bArr4, 0) + 95310865018149119L;
            int i4 = length - 1;
            int i5 = (i4 / 64) << 6;
            int i6 = i4 & 63;
            int i7 = i5 + i6;
            int i8 = i7 - 63;
            long j8 = 2480279821605975764L;
            long j9 = 1390051526045402406L;
            int i9 = 0;
            while (true) {
                long rotateRight2 = (Long.rotateRight(((e15 + j8) + jArr[c4]) + e(bArr4, i9 + 8), 37) * -5435081209227447693L) ^ jArr2[1];
                long rotateRight3 = (Long.rotateRight(j8 + jArr[1] + e(bArr4, i9 + 48), 42) * -5435081209227447693L) + jArr[c4] + e(bArr4, i9 + 40);
                long rotateRight4 = Long.rotateRight(j9 + jArr2[c4], 33) * -5435081209227447693L;
                char c5 = c4;
                int i10 = i6;
                int i11 = i5;
                d(bArr, i9, jArr[1] * -5435081209227447693L, rotateRight2 + jArr2[c4], jArr);
                d(bArr, i9 + 32, rotateRight4 + jArr2[1], rotateRight3 + e(bArr4, i9 + 16), jArr2);
                int i12 = i9 + 64;
                if (i12 == i11) {
                    long j10 = -5435081209227447693L + ((rotateRight2 & 255) << 1);
                    long j11 = jArr2[c5] + ((long) i10);
                    jArr2[c5] = j11;
                    long j12 = jArr[c5] + j11;
                    jArr[c5] = j12;
                    jArr2[c5] = jArr2[c5] + j12;
                    long rotateRight5 = (Long.rotateRight(((rotateRight4 + rotateRight3) + jArr[c5]) + e(bArr4, i7 - 55), 37) * j10) ^ (jArr2[1] * 9);
                    long rotateRight6 = (Long.rotateRight(rotateRight3 + jArr[1] + e(bArr4, i7 - 15), 42) * j10) + (jArr[c5] * 9) + e(bArr4, i7 - 23);
                    long rotateRight7 = Long.rotateRight(rotateRight2 + jArr2[c5], 33) * j10;
                    d(bArr, i8, jArr[1] * j10, rotateRight5 + jArr2[c5], jArr);
                    d(bArr, i7 - 31, rotateRight7 + jArr2[1], e(bArr4, i7 - 47) + rotateRight6, jArr2);
                    long j13 = j10;
                    return b(b(jArr[c5], jArr2[c5], j13) + (((rotateRight6 >>> 47) ^ rotateRight6) * -4348849565147123417L) + rotateRight5, b(jArr[1], jArr2[1], j13) + rotateRight7, j13);
                }
                i9 = i12;
                i6 = i10;
                i5 = i11;
                c4 = c5;
                j8 = rotateRight3;
                long j14 = rotateRight2;
                e15 = rotateRight4;
                j9 = j14;
            }
        }
    }

    public static void d(byte[] bArr, int i4, long j4, long j5, long[] jArr) {
        long e4 = e(bArr, i4);
        long e5 = e(bArr, i4 + 8);
        long e6 = e(bArr, i4 + 16);
        long e7 = e(bArr, i4 + 24);
        long j6 = j4 + e4;
        long j7 = e5 + j6 + e6;
        jArr[0] = j7 + e7;
        jArr[1] = Long.rotateRight(j5 + j6 + e7, 21) + Long.rotateRight(j7, 44) + j6;
    }

    public static long e(byte[] bArr, int i4) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr, i4, 8);
        wrap.order(ByteOrder.LITTLE_ENDIAN);
        return wrap.getLong();
    }
}
