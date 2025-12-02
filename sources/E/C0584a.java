package e;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import v3.l;

/* renamed from: e.a  reason: case insensitive filesystem */
public final class C0584a {

    /* renamed from: a  reason: collision with root package name */
    public final Set f8706a = new CopyOnWriteArraySet();

    /* renamed from: b  reason: collision with root package name */
    public volatile Context f8707b;

    public final void a(C0585b bVar) {
        l.e(bVar, "listener");
        Context context = this.f8707b;
        if (context != null) {
            bVar.a(context);
        }
        this.f8706a.add(bVar);
    }

    public final void b() {
        this.f8707b = null;
    }

    public final void c(Context context) {
        l.e(context, "context");
        this.f8707b = context;
        for (C0585b a4 : this.f8706a) {
            a4.a(context);
        }
    }
}
