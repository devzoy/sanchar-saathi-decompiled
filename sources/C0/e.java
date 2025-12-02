package c0;

import v3.g;

public final class e extends v {

    /* renamed from: b  reason: collision with root package name */
    public final Object f6290b;

    /* renamed from: c  reason: collision with root package name */
    public final int f6291c;

    public e(Object obj, int i4, int i5) {
        super(i5, (g) null);
        this.f6290b = obj;
        this.f6291c = i4;
    }

    public final void b() {
        Object obj = this.f6290b;
        if ((obj != null ? obj.hashCode() : 0) != this.f6291c) {
            throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
        }
    }

    public final Object c() {
        return this.f6290b;
    }
}
