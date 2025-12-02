package p;

public class X {

    /* renamed from: a  reason: collision with root package name */
    public int f11465a = 0;

    /* renamed from: b  reason: collision with root package name */
    public int f11466b = 0;

    /* renamed from: c  reason: collision with root package name */
    public int f11467c = Integer.MIN_VALUE;

    /* renamed from: d  reason: collision with root package name */
    public int f11468d = Integer.MIN_VALUE;

    /* renamed from: e  reason: collision with root package name */
    public int f11469e = 0;

    /* renamed from: f  reason: collision with root package name */
    public int f11470f = 0;

    /* renamed from: g  reason: collision with root package name */
    public boolean f11471g = false;

    /* renamed from: h  reason: collision with root package name */
    public boolean f11472h = false;

    public int a() {
        return this.f11471g ? this.f11465a : this.f11466b;
    }

    public int b() {
        return this.f11465a;
    }

    public int c() {
        return this.f11466b;
    }

    public int d() {
        return this.f11471g ? this.f11466b : this.f11465a;
    }

    public void e(int i4, int i5) {
        this.f11472h = false;
        if (i4 != Integer.MIN_VALUE) {
            this.f11469e = i4;
            this.f11465a = i4;
        }
        if (i5 != Integer.MIN_VALUE) {
            this.f11470f = i5;
            this.f11466b = i5;
        }
    }

    public void f(boolean z4) {
        if (z4 != this.f11471g) {
            this.f11471g = z4;
            if (!this.f11472h) {
                this.f11465a = this.f11469e;
                this.f11466b = this.f11470f;
            } else if (z4) {
                int i4 = this.f11468d;
                if (i4 == Integer.MIN_VALUE) {
                    i4 = this.f11469e;
                }
                this.f11465a = i4;
                int i5 = this.f11467c;
                if (i5 == Integer.MIN_VALUE) {
                    i5 = this.f11470f;
                }
                this.f11466b = i5;
            } else {
                int i6 = this.f11467c;
                if (i6 == Integer.MIN_VALUE) {
                    i6 = this.f11469e;
                }
                this.f11465a = i6;
                int i7 = this.f11468d;
                if (i7 == Integer.MIN_VALUE) {
                    i7 = this.f11470f;
                }
                this.f11466b = i7;
            }
        }
    }

    public void g(int i4, int i5) {
        this.f11467c = i4;
        this.f11468d = i5;
        this.f11472h = true;
        if (this.f11471g) {
            if (i5 != Integer.MIN_VALUE) {
                this.f11465a = i5;
            }
            if (i4 != Integer.MIN_VALUE) {
                this.f11466b = i4;
                return;
            }
            return;
        }
        if (i4 != Integer.MIN_VALUE) {
            this.f11465a = i4;
        }
        if (i5 != Integer.MIN_VALUE) {
            this.f11466b = i5;
        }
    }
}
