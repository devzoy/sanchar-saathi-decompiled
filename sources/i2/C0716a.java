package i2;

import android.graphics.Typeface;

/* renamed from: i2.a  reason: case insensitive filesystem */
public final class C0716a extends f {

    /* renamed from: a  reason: collision with root package name */
    public final Typeface f10261a;

    /* renamed from: b  reason: collision with root package name */
    public final C0171a f10262b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f10263c;

    /* renamed from: i2.a$a  reason: collision with other inner class name */
    public interface C0171a {
        void a(Typeface typeface);
    }

    public C0716a(C0171a aVar, Typeface typeface) {
        this.f10261a = typeface;
        this.f10262b = aVar;
    }

    public void a(int i4) {
        d(this.f10261a);
    }

    public void b(Typeface typeface, boolean z4) {
        d(typeface);
    }

    public void c() {
        this.f10263c = true;
    }

    public final void d(Typeface typeface) {
        if (!this.f10263c) {
            this.f10262b.a(typeface);
        }
    }
}
