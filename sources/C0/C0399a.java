package c0;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: c0.a  reason: case insensitive filesystem */
public final class C0399a {

    /* renamed from: a  reason: collision with root package name */
    public final AtomicInteger f6289a;

    public C0399a(int i4) {
        this.f6289a = new AtomicInteger(i4);
    }

    public final int a() {
        return this.f6289a.decrementAndGet();
    }

    public final int b() {
        return this.f6289a.get();
    }

    public final int c() {
        return this.f6289a.getAndIncrement();
    }

    public final int d() {
        return this.f6289a.incrementAndGet();
    }
}
