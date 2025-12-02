package androidx.datastore.preferences.protobuf;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;

/* renamed from: androidx.datastore.preferences.protobuf.g  reason: case insensitive filesystem */
public abstract class C0355g implements Iterable, Serializable {

    /* renamed from: f  reason: collision with root package name */
    public static final C0355g f5093f = new i(C0372y.f5332d);

    /* renamed from: g  reason: collision with root package name */
    public static final f f5094g = (C0352d.c() ? new j((a) null) : new d((a) null));

    /* renamed from: h  reason: collision with root package name */
    public static final Comparator f5095h = new b();

    /* renamed from: e  reason: collision with root package name */
    public int f5096e = 0;

    /* renamed from: androidx.datastore.preferences.protobuf.g$a */
    public class a extends c {

        /* renamed from: e  reason: collision with root package name */
        public int f5097e = 0;

        /* renamed from: f  reason: collision with root package name */
        public final int f5098f;

        public a() {
            this.f5098f = C0355g.this.size();
        }

        public byte b() {
            int i4 = this.f5097e;
            if (i4 < this.f5098f) {
                this.f5097e = i4 + 1;
                return C0355g.this.A(i4);
            }
            throw new NoSuchElementException();
        }

        public boolean hasNext() {
            return this.f5097e < this.f5098f;
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.g$b */
    public class b implements Comparator {
        /* renamed from: a */
        public int compare(C0355g gVar, C0355g gVar2) {
            C0089g B4 = gVar.B();
            C0089g B5 = gVar2.B();
            while (B4.hasNext() && B5.hasNext()) {
                int compareTo = Integer.valueOf(C0355g.G(B4.b())).compareTo(Integer.valueOf(C0355g.G(B5.b())));
                if (compareTo != 0) {
                    return compareTo;
                }
            }
            return Integer.valueOf(gVar.size()).compareTo(Integer.valueOf(gVar2.size()));
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.g$c */
    public static abstract class c implements C0089g {
        /* renamed from: c */
        public final Byte next() {
            return Byte.valueOf(b());
        }

        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.g$d */
    public static final class d implements f {
        public d() {
        }

        public byte[] a(byte[] bArr, int i4, int i5) {
            return Arrays.copyOfRange(bArr, i4, i5 + i4);
        }

        public /* synthetic */ d(a aVar) {
            this();
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.g$e */
    public static final class e extends i {

        /* renamed from: j  reason: collision with root package name */
        public final int f5100j;

        /* renamed from: k  reason: collision with root package name */
        public final int f5101k;

        public e(byte[] bArr, int i4, int i5) {
            super(bArr);
            C0355g.v(i4, i4 + i5, bArr.length);
            this.f5100j = i4;
            this.f5101k = i5;
        }

        public byte A(int i4) {
            return this.f5102i[this.f5100j + i4];
        }

        public int M() {
            return this.f5100j;
        }

        public int size() {
            return this.f5101k;
        }

        public byte t(int i4) {
            C0355g.u(i4, size());
            return this.f5102i[this.f5100j + i4];
        }

        public void z(byte[] bArr, int i4, int i5, int i6) {
            System.arraycopy(this.f5102i, M() + i4, bArr, i5, i6);
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.g$f */
    public interface f {
        byte[] a(byte[] bArr, int i4, int i5);
    }

    /* renamed from: androidx.datastore.preferences.protobuf.g$g  reason: collision with other inner class name */
    public interface C0089g extends Iterator {
        byte b();
    }

    /* renamed from: androidx.datastore.preferences.protobuf.g$h */
    public static abstract class h extends C0355g {
        public /* synthetic */ h(a aVar) {
            this();
        }

        public /* bridge */ /* synthetic */ Iterator iterator() {
            return C0355g.super.B();
        }

        public h() {
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.g$i */
    public static class i extends h {

        /* renamed from: i  reason: collision with root package name */
        public final byte[] f5102i;

        public i(byte[] bArr) {
            super((a) null);
            bArr.getClass();
            this.f5102i = bArr;
        }

        public byte A(int i4) {
            return this.f5102i[i4];
        }

        public final int C(int i4, int i5, int i6) {
            return C0372y.g(i4, this.f5102i, M() + i5, i6);
        }

        public final C0355g E(int i4, int i5) {
            int v4 = C0355g.v(i4, i5, size());
            return v4 == 0 ? C0355g.f5093f : new e(this.f5102i, M() + i4, v4);
        }

        public final void K(C0354f fVar) {
            fVar.a(this.f5102i, M(), size());
        }

        public final boolean L(C0355g gVar, int i4, int i5) {
            if (i5 <= gVar.size()) {
                int i6 = i4 + i5;
                if (i6 > gVar.size()) {
                    throw new IllegalArgumentException("Ran off end of other: " + i4 + ", " + i5 + ", " + gVar.size());
                } else if (!(gVar instanceof i)) {
                    return gVar.E(i4, i6).equals(E(0, i5));
                } else {
                    i iVar = (i) gVar;
                    byte[] bArr = this.f5102i;
                    byte[] bArr2 = iVar.f5102i;
                    int M4 = M() + i5;
                    int M5 = M();
                    int M6 = iVar.M() + i4;
                    while (M5 < M4) {
                        if (bArr[M5] != bArr2[M6]) {
                            return false;
                        }
                        M5++;
                        M6++;
                    }
                    return true;
                }
            } else {
                throw new IllegalArgumentException("Length too large: " + i5 + size());
            }
        }

        public int M() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C0355g) || size() != ((C0355g) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof i)) {
                return obj.equals(this);
            }
            i iVar = (i) obj;
            int D4 = D();
            int D5 = iVar.D();
            if (D4 == 0 || D5 == 0 || D4 == D5) {
                return L(iVar, 0, size());
            }
            return false;
        }

        public int size() {
            return this.f5102i.length;
        }

        public byte t(int i4) {
            return this.f5102i[i4];
        }

        public void z(byte[] bArr, int i4, int i5, int i6) {
            System.arraycopy(this.f5102i, i4, bArr, i5, i6);
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.g$j */
    public static final class j implements f {
        public j() {
        }

        public byte[] a(byte[] bArr, int i4, int i5) {
            byte[] bArr2 = new byte[i5];
            System.arraycopy(bArr, i4, bArr2, 0, i5);
            return bArr2;
        }

        public /* synthetic */ j(a aVar) {
            this();
        }
    }

    public static int G(byte b4) {
        return b4 & 255;
    }

    public static C0355g I(byte[] bArr) {
        return new i(bArr);
    }

    public static C0355g J(byte[] bArr, int i4, int i5) {
        return new e(bArr, i4, i5);
    }

    public static void u(int i4, int i5) {
        if (((i5 - (i4 + 1)) | i4) >= 0) {
            return;
        }
        if (i4 < 0) {
            throw new ArrayIndexOutOfBoundsException("Index < 0: " + i4);
        }
        throw new ArrayIndexOutOfBoundsException("Index > length: " + i4 + ", " + i5);
    }

    public static int v(int i4, int i5, int i6) {
        int i7 = i5 - i4;
        if ((i4 | i5 | i7 | (i6 - i5)) >= 0) {
            return i7;
        }
        if (i4 < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i4 + " < 0");
        } else if (i5 < i4) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i4 + ", " + i5);
        } else {
            throw new IndexOutOfBoundsException("End index: " + i5 + " >= " + i6);
        }
    }

    public static C0355g w(byte[] bArr) {
        return x(bArr, 0, bArr.length);
    }

    public static C0355g x(byte[] bArr, int i4, int i5) {
        v(i4, i4 + i5, bArr.length);
        return new i(f5094g.a(bArr, i4, i5));
    }

    public static C0355g y(String str) {
        return new i(str.getBytes(C0372y.f5330b));
    }

    public abstract byte A(int i4);

    public C0089g B() {
        return new a();
    }

    public abstract int C(int i4, int i5, int i6);

    public final int D() {
        return this.f5096e;
    }

    public abstract C0355g E(int i4, int i5);

    public final byte[] F() {
        int size = size();
        if (size == 0) {
            return C0372y.f5332d;
        }
        byte[] bArr = new byte[size];
        z(bArr, 0, 0, size);
        return bArr;
    }

    public final String H() {
        if (size() <= 50) {
            return k0.a(this);
        }
        return k0.a(E(0, 47)) + "...";
    }

    public abstract void K(C0354f fVar);

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i4 = this.f5096e;
        if (i4 == 0) {
            int size = size();
            i4 = C(size, 0, size);
            if (i4 == 0) {
                i4 = 1;
            }
            this.f5096e = i4;
        }
        return i4;
    }

    public abstract int size();

    public abstract byte t(int i4);

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", new Object[]{Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()), H()});
    }

    public abstract void z(byte[] bArr, int i4, int i5, int i6);
}
