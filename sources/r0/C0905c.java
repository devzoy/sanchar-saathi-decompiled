package r0;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;

/* renamed from: r0.c  reason: case insensitive filesystem */
public abstract class C0905c {
    public static int a(int i4) {
        return ((i4 + 7) & -8) / 8;
    }

    public static byte[] b(byte[] bArr) {
        DeflaterOutputStream deflaterOutputStream;
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            deflaterOutputStream.write(bArr);
            deflaterOutputStream.close();
            deflater.end();
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
        throw th;
    }

    public static RuntimeException c(String str) {
        return new IllegalStateException(str);
    }

    public static byte[] d(InputStream inputStream, int i4) {
        byte[] bArr = new byte[i4];
        int i5 = 0;
        while (i5 < i4) {
            int read = inputStream.read(bArr, i5, i4 - i5);
            if (read >= 0) {
                i5 += read;
            } else {
                throw c("Not enough bytes to read: " + i4);
            }
        }
        return bArr;
    }

    public static byte[] e(InputStream inputStream, int i4, int i5) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i5];
            byte[] bArr2 = new byte[2048];
            int i6 = 0;
            int i7 = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i6 < i4) {
                int read = inputStream.read(bArr2);
                if (read >= 0) {
                    inflater.setInput(bArr2, 0, read);
                    i7 += inflater.inflate(bArr, i7, i5 - i7);
                    i6 += read;
                } else {
                    throw c("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i4 + " bytes");
                }
            }
            if (i6 != i4) {
                throw c("Didn't read enough bytes during decompression. expected=" + i4 + " actual=" + i6);
            } else if (inflater.finished()) {
                inflater.end();
                return bArr;
            } else {
                throw c("Inflater did not finish");
            }
        } catch (DataFormatException e4) {
            throw c(e4.getMessage());
        } catch (Throwable th) {
            inflater.end();
            throw th;
        }
    }

    public static String f(InputStream inputStream, int i4) {
        return new String(d(inputStream, i4), StandardCharsets.UTF_8);
    }

    public static long g(InputStream inputStream, int i4) {
        byte[] d4 = d(inputStream, i4);
        long j4 = 0;
        for (int i5 = 0; i5 < i4; i5++) {
            j4 += ((long) (d4[i5] & 255)) << (i5 * 8);
        }
        return j4;
    }

    public static int h(InputStream inputStream) {
        return (int) g(inputStream, 2);
    }

    public static long i(InputStream inputStream) {
        return g(inputStream, 4);
    }

    public static int j(InputStream inputStream) {
        return (int) g(inputStream, 1);
    }

    public static int k(String str) {
        return str.getBytes(StandardCharsets.UTF_8).length;
    }

    public static void l(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[512];
        while (true) {
            int read = inputStream.read(bArr);
            if (read > 0) {
                outputStream.write(bArr, 0, read);
            } else {
                return;
            }
        }
    }

    public static void m(OutputStream outputStream, byte[] bArr) {
        q(outputStream, (long) bArr.length);
        byte[] b4 = b(bArr);
        q(outputStream, (long) b4.length);
        outputStream.write(b4);
    }

    public static void n(OutputStream outputStream, String str) {
        outputStream.write(str.getBytes(StandardCharsets.UTF_8));
    }

    public static void o(OutputStream outputStream, long j4, int i4) {
        byte[] bArr = new byte[i4];
        for (int i5 = 0; i5 < i4; i5++) {
            bArr[i5] = (byte) ((int) ((j4 >> (i5 * 8)) & 255));
        }
        outputStream.write(bArr);
    }

    public static void p(OutputStream outputStream, int i4) {
        o(outputStream, (long) i4, 2);
    }

    public static void q(OutputStream outputStream, long j4) {
        o(outputStream, j4, 4);
    }

    public static void r(OutputStream outputStream, int i4) {
        o(outputStream, (long) i4, 1);
    }
}
