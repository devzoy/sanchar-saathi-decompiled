package r0;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: r0.k  reason: case insensitive filesystem */
public abstract class C0913k {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f11966a = {112, 114, 111, 0};

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f11967b = {112, 114, 109, 0};

    public static void A(InputStream inputStream) {
        C0905c.h(inputStream);
        int j4 = C0905c.j(inputStream);
        if (j4 != 6 && j4 != 7) {
            while (j4 > 0) {
                C0905c.j(inputStream);
                for (int j5 = C0905c.j(inputStream); j5 > 0; j5--) {
                    C0905c.h(inputStream);
                }
                j4--;
            }
        }
    }

    public static boolean B(OutputStream outputStream, byte[] bArr, C0904b[] bVarArr) {
        if (Arrays.equals(bArr, C0914l.f11968a)) {
            N(outputStream, bVarArr);
            return true;
        } else if (Arrays.equals(bArr, C0914l.f11969b)) {
            M(outputStream, bVarArr);
            return true;
        } else if (Arrays.equals(bArr, C0914l.f11971d)) {
            K(outputStream, bVarArr);
            return true;
        } else if (Arrays.equals(bArr, C0914l.f11970c)) {
            L(outputStream, bVarArr);
            return true;
        } else if (!Arrays.equals(bArr, C0914l.f11972e)) {
            return false;
        } else {
            J(outputStream, bVarArr);
            return true;
        }
    }

    public static void C(OutputStream outputStream, C0904b bVar) {
        int[] iArr = bVar.f11949h;
        int length = iArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            int i6 = iArr[i4];
            C0905c.p(outputStream, i6 - i5);
            i4++;
            i5 = i6;
        }
    }

    public static C0915m D(C0904b[] bVarArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            C0905c.p(byteArrayOutputStream, bVarArr.length);
            int i4 = 2;
            for (C0904b bVar : bVarArr) {
                C0905c.q(byteArrayOutputStream, bVar.f11944c);
                C0905c.q(byteArrayOutputStream, bVar.f11945d);
                C0905c.q(byteArrayOutputStream, (long) bVar.f11948g);
                String j4 = j(bVar.f11942a, bVar.f11943b, C0914l.f11968a);
                int k4 = C0905c.k(j4);
                C0905c.p(byteArrayOutputStream, k4);
                i4 = i4 + 14 + k4;
                C0905c.n(byteArrayOutputStream, j4);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (i4 == byteArray.length) {
                C0915m mVar = new C0915m(C0906d.DEX_FILES, i4, byteArray, false);
                byteArrayOutputStream.close();
                return mVar;
            }
            throw C0905c.c("Expected size " + i4 + ", does not match actual size " + byteArray.length);
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public static void E(OutputStream outputStream, byte[] bArr) {
        outputStream.write(f11966a);
        outputStream.write(bArr);
    }

    public static void F(OutputStream outputStream, C0904b bVar) {
        I(outputStream, bVar);
        C(outputStream, bVar);
        H(outputStream, bVar);
    }

    public static void G(OutputStream outputStream, C0904b bVar, String str) {
        C0905c.p(outputStream, C0905c.k(str));
        C0905c.p(outputStream, bVar.f11946e);
        C0905c.q(outputStream, (long) bVar.f11947f);
        C0905c.q(outputStream, bVar.f11944c);
        C0905c.q(outputStream, (long) bVar.f11948g);
        C0905c.n(outputStream, str);
    }

    public static void H(OutputStream outputStream, C0904b bVar) {
        byte[] bArr = new byte[k(bVar.f11948g)];
        for (Map.Entry entry : bVar.f11950i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            if ((intValue2 & 2) != 0) {
                z(bArr, 2, intValue, bVar);
            }
            if ((intValue2 & 4) != 0) {
                z(bArr, 4, intValue, bVar);
            }
        }
        outputStream.write(bArr);
    }

    public static void I(OutputStream outputStream, C0904b bVar) {
        int i4 = 0;
        for (Map.Entry entry : bVar.f11950i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                C0905c.p(outputStream, intValue - i4);
                C0905c.p(outputStream, 0);
                i4 = intValue;
            }
        }
    }

    public static void J(OutputStream outputStream, C0904b[] bVarArr) {
        C0905c.p(outputStream, bVarArr.length);
        for (C0904b bVar : bVarArr) {
            String j4 = j(bVar.f11942a, bVar.f11943b, C0914l.f11972e);
            C0905c.p(outputStream, C0905c.k(j4));
            C0905c.p(outputStream, bVar.f11950i.size());
            C0905c.p(outputStream, bVar.f11949h.length);
            C0905c.q(outputStream, bVar.f11944c);
            C0905c.n(outputStream, j4);
            for (Integer intValue : bVar.f11950i.keySet()) {
                C0905c.p(outputStream, intValue.intValue());
            }
            for (int p4 : bVar.f11949h) {
                C0905c.p(outputStream, p4);
            }
        }
    }

    public static void K(OutputStream outputStream, C0904b[] bVarArr) {
        C0905c.r(outputStream, bVarArr.length);
        for (C0904b bVar : bVarArr) {
            String j4 = j(bVar.f11942a, bVar.f11943b, C0914l.f11971d);
            C0905c.p(outputStream, C0905c.k(j4));
            C0905c.p(outputStream, bVar.f11949h.length);
            C0905c.q(outputStream, (long) (bVar.f11950i.size() * 4));
            C0905c.q(outputStream, bVar.f11944c);
            C0905c.n(outputStream, j4);
            for (Integer intValue : bVar.f11950i.keySet()) {
                C0905c.p(outputStream, intValue.intValue());
                C0905c.p(outputStream, 0);
            }
            for (int p4 : bVar.f11949h) {
                C0905c.p(outputStream, p4);
            }
        }
    }

    public static void L(OutputStream outputStream, C0904b[] bVarArr) {
        byte[] b4 = b(bVarArr, C0914l.f11970c);
        C0905c.r(outputStream, bVarArr.length);
        C0905c.m(outputStream, b4);
    }

    public static void M(OutputStream outputStream, C0904b[] bVarArr) {
        byte[] b4 = b(bVarArr, C0914l.f11969b);
        C0905c.r(outputStream, bVarArr.length);
        C0905c.m(outputStream, b4);
    }

    public static void N(OutputStream outputStream, C0904b[] bVarArr) {
        O(outputStream, bVarArr);
    }

    public static void O(OutputStream outputStream, C0904b[] bVarArr) {
        int length;
        ArrayList arrayList = new ArrayList(3);
        ArrayList arrayList2 = new ArrayList(3);
        arrayList.add(D(bVarArr));
        arrayList.add(c(bVarArr));
        arrayList.add(d(bVarArr));
        long length2 = ((long) C0914l.f11968a.length) + ((long) f11966a.length) + 4 + ((long) (arrayList.size() * 16));
        C0905c.q(outputStream, (long) arrayList.size());
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            C0915m mVar = (C0915m) arrayList.get(i4);
            C0905c.q(outputStream, mVar.f11975a.f());
            C0905c.q(outputStream, length2);
            if (mVar.f11978d) {
                byte[] bArr = mVar.f11977c;
                byte[] b4 = C0905c.b(bArr);
                arrayList2.add(b4);
                C0905c.q(outputStream, (long) b4.length);
                C0905c.q(outputStream, (long) bArr.length);
                length = b4.length;
            } else {
                arrayList2.add(mVar.f11977c);
                C0905c.q(outputStream, (long) mVar.f11977c.length);
                C0905c.q(outputStream, 0);
                length = mVar.f11977c.length;
            }
            length2 += (long) length;
        }
        for (int i5 = 0; i5 < arrayList2.size(); i5++) {
            outputStream.write((byte[]) arrayList2.get(i5));
        }
    }

    public static int a(C0904b bVar) {
        int i4 = 0;
        for (Map.Entry value : bVar.f11950i.entrySet()) {
            i4 |= ((Integer) value.getValue()).intValue();
        }
        return i4;
    }

    public static byte[] b(C0904b[] bVarArr, byte[] bArr) {
        int i4 = 0;
        int i5 = 0;
        for (C0904b bVar : bVarArr) {
            i5 += C0905c.k(j(bVar.f11942a, bVar.f11943b, bArr)) + 16 + (bVar.f11946e * 2) + bVar.f11947f + k(bVar.f11948g);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i5);
        if (Arrays.equals(bArr, C0914l.f11970c)) {
            int length = bVarArr.length;
            while (i4 < length) {
                C0904b bVar2 = bVarArr[i4];
                G(byteArrayOutputStream, bVar2, j(bVar2.f11942a, bVar2.f11943b, bArr));
                F(byteArrayOutputStream, bVar2);
                i4++;
            }
        } else {
            for (C0904b bVar3 : bVarArr) {
                G(byteArrayOutputStream, bVar3, j(bVar3.f11942a, bVar3.f11943b, bArr));
            }
            int length2 = bVarArr.length;
            while (i4 < length2) {
                F(byteArrayOutputStream, bVarArr[i4]);
                i4++;
            }
        }
        if (byteArrayOutputStream.size() == i5) {
            return byteArrayOutputStream.toByteArray();
        }
        throw C0905c.c("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i5);
    }

    public static C0915m c(C0904b[] bVarArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i4 = 0;
        int i5 = 0;
        while (i4 < bVarArr.length) {
            try {
                C0904b bVar = bVarArr[i4];
                C0905c.p(byteArrayOutputStream, i4);
                C0905c.p(byteArrayOutputStream, bVar.f11946e);
                i5 = i5 + 4 + (bVar.f11946e * 2);
                C(byteArrayOutputStream, bVar);
                i4++;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (i5 == byteArray.length) {
            C0915m mVar = new C0915m(C0906d.CLASSES, i5, byteArray, true);
            byteArrayOutputStream.close();
            return mVar;
        }
        throw C0905c.c("Expected size " + i5 + ", does not match actual size " + byteArray.length);
        throw th;
    }

    public static C0915m d(C0904b[] bVarArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i4 = 0;
        int i5 = 0;
        while (i4 < bVarArr.length) {
            try {
                C0904b bVar = bVarArr[i4];
                int a4 = a(bVar);
                byte[] e4 = e(bVar);
                byte[] f4 = f(bVar);
                C0905c.p(byteArrayOutputStream, i4);
                int length = e4.length + 2 + f4.length;
                C0905c.q(byteArrayOutputStream, (long) length);
                C0905c.p(byteArrayOutputStream, a4);
                byteArrayOutputStream.write(e4);
                byteArrayOutputStream.write(f4);
                i5 = i5 + 6 + length;
                i4++;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (i5 == byteArray.length) {
            C0915m mVar = new C0915m(C0906d.METHODS, i5, byteArray, true);
            byteArrayOutputStream.close();
            return mVar;
        }
        throw C0905c.c("Expected size " + i5 + ", does not match actual size " + byteArray.length);
        throw th;
    }

    public static byte[] e(C0904b bVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            H(byteArrayOutputStream, bVar);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public static byte[] f(C0904b bVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            I(byteArrayOutputStream, bVar);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public static String g(String str, String str2) {
        return "!".equals(str2) ? str.replace(":", "!") : ":".equals(str2) ? str.replace("!", ":") : str;
    }

    public static String h(String str) {
        int indexOf = str.indexOf("!");
        if (indexOf < 0) {
            indexOf = str.indexOf(":");
        }
        return indexOf > 0 ? str.substring(indexOf + 1) : str;
    }

    public static C0904b i(C0904b[] bVarArr, String str) {
        if (bVarArr.length <= 0) {
            return null;
        }
        String h4 = h(str);
        for (int i4 = 0; i4 < bVarArr.length; i4++) {
            if (bVarArr[i4].f11943b.equals(h4)) {
                return bVarArr[i4];
            }
        }
        return null;
    }

    public static String j(String str, String str2, byte[] bArr) {
        String a4 = C0914l.a(bArr);
        if (str.length() <= 0) {
            return g(str2, a4);
        }
        if (str2.equals("classes.dex")) {
            return str;
        }
        if (str2.contains("!") || str2.contains(":")) {
            return g(str2, a4);
        }
        if (str2.endsWith(".apk")) {
            return str2;
        }
        return str + C0914l.a(bArr) + str2;
    }

    public static int k(int i4) {
        return y(i4 * 2) / 8;
    }

    public static int l(int i4, int i5, int i6) {
        if (i4 == 1) {
            throw C0905c.c("HOT methods are not stored in the bitmap");
        } else if (i4 == 2) {
            return i5;
        } else {
            if (i4 == 4) {
                return i5 + i6;
            }
            throw C0905c.c("Unexpected flag: " + i4);
        }
    }

    public static int[] m(InputStream inputStream, int i4) {
        int[] iArr = new int[i4];
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            i5 += C0905c.h(inputStream);
            iArr[i6] = i5;
        }
        return iArr;
    }

    public static int n(BitSet bitSet, int i4, int i5) {
        int i6 = 2;
        if (!bitSet.get(l(2, i4, i5))) {
            i6 = 0;
        }
        return bitSet.get(l(4, i4, i5)) ? i6 | 4 : i6;
    }

    public static byte[] o(InputStream inputStream, byte[] bArr) {
        if (Arrays.equals(bArr, C0905c.d(inputStream, bArr.length))) {
            return C0905c.d(inputStream, C0914l.f11969b.length);
        }
        throw C0905c.c("Invalid magic");
    }

    public static void p(InputStream inputStream, C0904b bVar) {
        int available = inputStream.available() - bVar.f11947f;
        int i4 = 0;
        while (inputStream.available() > available) {
            i4 += C0905c.h(inputStream);
            bVar.f11950i.put(Integer.valueOf(i4), 1);
            for (int h4 = C0905c.h(inputStream); h4 > 0; h4--) {
                A(inputStream);
            }
        }
        if (inputStream.available() != available) {
            throw C0905c.c("Read too much data during profile line parse");
        }
    }

    public static C0904b[] q(InputStream inputStream, byte[] bArr, byte[] bArr2, C0904b[] bVarArr) {
        if (Arrays.equals(bArr, C0914l.f11973f)) {
            if (!Arrays.equals(C0914l.f11968a, bArr2)) {
                return r(inputStream, bArr, bVarArr);
            }
            throw C0905c.c("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        } else if (Arrays.equals(bArr, C0914l.f11974g)) {
            return t(inputStream, bArr2, bVarArr);
        } else {
            throw C0905c.c("Unsupported meta version");
        }
    }

    public static C0904b[] r(InputStream inputStream, byte[] bArr, C0904b[] bVarArr) {
        if (Arrays.equals(bArr, C0914l.f11973f)) {
            int j4 = C0905c.j(inputStream);
            byte[] e4 = C0905c.e(inputStream, (int) C0905c.i(inputStream), (int) C0905c.i(inputStream));
            if (inputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(e4);
                try {
                    C0904b[] s4 = s(byteArrayInputStream, j4, bVarArr);
                    byteArrayInputStream.close();
                    return s4;
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
            } else {
                throw C0905c.c("Content found after the end of file");
            }
        } else {
            throw C0905c.c("Unsupported meta version");
        }
        throw th;
    }

    public static C0904b[] s(InputStream inputStream, int i4, C0904b[] bVarArr) {
        int i5 = 0;
        if (inputStream.available() == 0) {
            return new C0904b[0];
        }
        if (i4 == bVarArr.length) {
            String[] strArr = new String[i4];
            int[] iArr = new int[i4];
            for (int i6 = 0; i6 < i4; i6++) {
                int h4 = C0905c.h(inputStream);
                iArr[i6] = C0905c.h(inputStream);
                strArr[i6] = C0905c.f(inputStream, h4);
            }
            while (i5 < i4) {
                C0904b bVar = bVarArr[i5];
                if (bVar.f11943b.equals(strArr[i5])) {
                    int i7 = iArr[i5];
                    bVar.f11946e = i7;
                    bVar.f11949h = m(inputStream, i7);
                    i5++;
                } else {
                    throw C0905c.c("Order of dexfiles in metadata did not match baseline");
                }
            }
            return bVarArr;
        }
        throw C0905c.c("Mismatched number of dex files found in metadata");
    }

    public static C0904b[] t(InputStream inputStream, byte[] bArr, C0904b[] bVarArr) {
        int h4 = C0905c.h(inputStream);
        byte[] e4 = C0905c.e(inputStream, (int) C0905c.i(inputStream), (int) C0905c.i(inputStream));
        if (inputStream.read() <= 0) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(e4);
            try {
                C0904b[] u4 = u(byteArrayInputStream, bArr, h4, bVarArr);
                byteArrayInputStream.close();
                return u4;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        } else {
            throw C0905c.c("Content found after the end of file");
        }
        throw th;
    }

    public static C0904b[] u(InputStream inputStream, byte[] bArr, int i4, C0904b[] bVarArr) {
        int i5 = 0;
        if (inputStream.available() == 0) {
            return new C0904b[0];
        }
        if (i4 == bVarArr.length) {
            while (i5 < i4) {
                C0905c.h(inputStream);
                String f4 = C0905c.f(inputStream, C0905c.h(inputStream));
                long i6 = C0905c.i(inputStream);
                int h4 = C0905c.h(inputStream);
                C0904b i7 = i(bVarArr, f4);
                if (i7 != null) {
                    i7.f11945d = i6;
                    int[] m4 = m(inputStream, h4);
                    if (Arrays.equals(bArr, C0914l.f11972e)) {
                        i7.f11946e = h4;
                        i7.f11949h = m4;
                    }
                    i5++;
                } else {
                    throw C0905c.c("Missing profile key: " + f4);
                }
            }
            return bVarArr;
        }
        throw C0905c.c("Mismatched number of dex files found in metadata");
    }

    public static void v(InputStream inputStream, C0904b bVar) {
        BitSet valueOf = BitSet.valueOf(C0905c.d(inputStream, C0905c.a(bVar.f11948g * 2)));
        int i4 = 0;
        while (true) {
            int i5 = bVar.f11948g;
            if (i4 < i5) {
                int n4 = n(valueOf, i4, i5);
                if (n4 != 0) {
                    Integer num = (Integer) bVar.f11950i.get(Integer.valueOf(i4));
                    if (num == null) {
                        num = 0;
                    }
                    bVar.f11950i.put(Integer.valueOf(i4), Integer.valueOf(n4 | num.intValue()));
                }
                i4++;
            } else {
                return;
            }
        }
    }

    public static C0904b[] w(InputStream inputStream, byte[] bArr, String str) {
        if (Arrays.equals(bArr, C0914l.f11969b)) {
            int j4 = C0905c.j(inputStream);
            byte[] e4 = C0905c.e(inputStream, (int) C0905c.i(inputStream), (int) C0905c.i(inputStream));
            if (inputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(e4);
                try {
                    C0904b[] x4 = x(byteArrayInputStream, str, j4);
                    byteArrayInputStream.close();
                    return x4;
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
            } else {
                throw C0905c.c("Content found after the end of file");
            }
        } else {
            throw C0905c.c("Unsupported version");
        }
        throw th;
    }

    public static C0904b[] x(InputStream inputStream, String str, int i4) {
        InputStream inputStream2 = inputStream;
        int i5 = i4;
        if (inputStream.available() == 0) {
            return new C0904b[0];
        }
        C0904b[] bVarArr = new C0904b[i5];
        for (int i6 = 0; i6 < i5; i6++) {
            int h4 = C0905c.h(inputStream);
            int h5 = C0905c.h(inputStream);
            String str2 = str;
            int[] iArr = new int[h5];
            bVarArr[i6] = new C0904b(str2, C0905c.f(inputStream2, h4), C0905c.i(inputStream), 0, h5, (int) C0905c.i(inputStream), (int) C0905c.i(inputStream), iArr, new TreeMap());
        }
        for (int i7 = 0; i7 < i5; i7++) {
            C0904b bVar = bVarArr[i7];
            p(inputStream2, bVar);
            bVar.f11949h = m(inputStream2, bVar.f11946e);
            v(inputStream2, bVar);
        }
        return bVarArr;
    }

    public static int y(int i4) {
        return (i4 + 7) & -8;
    }

    public static void z(byte[] bArr, int i4, int i5, C0904b bVar) {
        int l4 = l(i4, i5, bVar.f11948g);
        int i6 = l4 / 8;
        bArr[i6] = (byte) ((1 << (l4 % 8)) | bArr[i6]);
    }
}
