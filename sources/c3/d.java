package C3;

import java.util.Iterator;
import java.util.NoSuchElementException;
import v3.g;
import v3.l;

public final class d implements Iterator {

    /* renamed from: j  reason: collision with root package name */
    public static final a f540j = new a((g) null);

    /* renamed from: e  reason: collision with root package name */
    public final CharSequence f541e;

    /* renamed from: f  reason: collision with root package name */
    public int f542f;

    /* renamed from: g  reason: collision with root package name */
    public int f543g;

    /* renamed from: h  reason: collision with root package name */
    public int f544h;

    /* renamed from: i  reason: collision with root package name */
    public int f545i;

    public static final class a {
        public /* synthetic */ a(g gVar) {
            this();
        }

        public a() {
        }
    }

    public d(CharSequence charSequence) {
        l.e(charSequence, "string");
        this.f541e = charSequence;
    }

    /* renamed from: c */
    public String next() {
        if (hasNext()) {
            this.f542f = 0;
            int i4 = this.f544h;
            int i5 = this.f543g;
            this.f543g = this.f545i + i4;
            return this.f541e.subSequence(i5, i4).toString();
        }
        throw new NoSuchElementException();
    }

    public boolean hasNext() {
        int i4;
        int i5 = this.f542f;
        if (i5 != 0) {
            return i5 == 1;
        }
        int i6 = 2;
        if (this.f545i < 0) {
            this.f542f = 2;
            return false;
        }
        int length = this.f541e.length();
        int i7 = this.f543g;
        int length2 = this.f541e.length();
        while (true) {
            if (i7 >= length2) {
                i6 = -1;
                break;
            }
            char charAt = this.f541e.charAt(i7);
            if (charAt != 10 && charAt != 13) {
                i7++;
            } else if (!(charAt == 13 && (i4 = i7 + 1) < this.f541e.length() && this.f541e.charAt(i4) == 10)) {
                i6 = 1;
            }
        }
        i6 = 1;
        length = i7;
        this.f542f = 1;
        this.f545i = i6;
        this.f544h = length;
        return true;
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
