package a1;

import java.util.concurrent.Callable;

public final /* synthetic */ class j implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ k f3963a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f3964b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f3965c;

    public /* synthetic */ j(k kVar, int i4, int i5) {
        this.f3963a = kVar;
        this.f3964b = i4;
        this.f3965c = i5;
    }

    public final Object call() {
        return k.f(this.f3963a, this.f3964b, this.f3965c);
    }
}
