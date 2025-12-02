package z3;

import i3.C0718B;
import java.util.NoSuchElementException;

public final class b extends C0718B {

    /* renamed from: e  reason: collision with root package name */
    public final int f13036e;

    /* renamed from: f  reason: collision with root package name */
    public final int f13037f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f13038g;

    /* renamed from: h  reason: collision with root package name */
    public int f13039h;

    public b(int i4, int i5, int i6) {
        this.f13036e = i6;
        this.f13037f = i5;
        boolean z4 = false;
        if (i6 <= 0 ? i4 >= i5 : i4 <= i5) {
            z4 = true;
        }
        this.f13038g = z4;
        this.f13039h = !z4 ? i5 : i4;
    }

    public int c() {
        int i4 = this.f13039h;
        if (i4 != this.f13037f) {
            this.f13039h = this.f13036e + i4;
        } else if (this.f13038g) {
            this.f13038g = false;
        } else {
            throw new NoSuchElementException();
        }
        return i4;
    }

    public boolean hasNext() {
        return this.f13038g;
    }
}
