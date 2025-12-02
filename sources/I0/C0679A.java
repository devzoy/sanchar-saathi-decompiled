package i0;

import H.a;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import v3.l;

/* renamed from: i0.A  reason: case insensitive filesystem */
public abstract class C0679A extends C0701w {

    /* renamed from: c  reason: collision with root package name */
    public final Activity f9804c;

    /* renamed from: d  reason: collision with root package name */
    public final Context f9805d;

    /* renamed from: e  reason: collision with root package name */
    public final Handler f9806e;

    /* renamed from: f  reason: collision with root package name */
    public final int f9807f;

    /* renamed from: g  reason: collision with root package name */
    public final I f9808g;

    public C0679A(Activity activity, Context context, Handler handler, int i4) {
        l.e(context, "context");
        l.e(handler, "handler");
        this.f9804c = activity;
        this.f9805d = context;
        this.f9806e = handler;
        this.f9807f = i4;
        this.f9808g = new J();
    }

    public void A(C0695p pVar, Intent intent, int i4, Bundle bundle) {
        l.e(pVar, "fragment");
        l.e(intent, "intent");
        if (i4 == -1) {
            a.l(this.f9805d, intent, bundle);
            return;
        }
        throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
    }

    public abstract void B();

    public final Activity n() {
        return this.f9804c;
    }

    public final Context o() {
        return this.f9805d;
    }

    public final I q() {
        return this.f9808g;
    }

    public final Handler v() {
        return this.f9806e;
    }

    public abstract void x(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract Object y();

    public abstract LayoutInflater z();

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C0679A(C0699u uVar) {
        this(uVar, uVar, new Handler(), 0);
        l.e(uVar, "activity");
    }
}
