package R0;

import java.util.ArrayList;
import java.util.concurrent.Callable;

public final /* synthetic */ class p implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ r f2523a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ArrayList f2524b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f2525c;

    public /* synthetic */ p(r rVar, ArrayList arrayList, String str) {
        this.f2523a = rVar;
        this.f2524b = arrayList;
        this.f2525c = str;
    }

    public final Object call() {
        return this.f2523a.m(this.f2524b, this.f2525c);
    }
}
