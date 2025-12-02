package i;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import v.b;

/* renamed from: i.d  reason: case insensitive filesystem */
public abstract class C0677d {

    /* renamed from: c  reason: collision with root package name */
    public static int f9643c = -100;

    /* renamed from: d  reason: collision with root package name */
    public static final b f9644d = new b();

    /* renamed from: e  reason: collision with root package name */
    public static final Object f9645e = new Object();

    public static void c(C0677d dVar) {
        synchronized (f9645e) {
            y(dVar);
            f9644d.add(new WeakReference(dVar));
        }
    }

    public static C0677d g(Activity activity, C0676c cVar) {
        return new C0678e(activity, cVar);
    }

    public static C0677d h(Dialog dialog, C0676c cVar) {
        return new C0678e(dialog, cVar);
    }

    public static int j() {
        return f9643c;
    }

    public static void x(C0677d dVar) {
        synchronized (f9645e) {
            y(dVar);
        }
    }

    public static void y(C0677d dVar) {
        synchronized (f9645e) {
            try {
                Iterator it = f9644d.iterator();
                while (it.hasNext()) {
                    C0677d dVar2 = (C0677d) ((WeakReference) it.next()).get();
                    if (dVar2 == dVar || dVar2 == null) {
                        it.remove();
                    }
                }
            } finally {
            }
        }
    }

    public abstract void A(int i4);

    public abstract void B(View view);

    public abstract void C(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void D(int i4);

    public abstract void E(CharSequence charSequence);

    public abstract void d(View view, ViewGroup.LayoutParams layoutParams);

    public void e(Context context) {
    }

    public Context f(Context context) {
        e(context);
        return context;
    }

    public abstract View i(int i4);

    public abstract int k();

    public abstract MenuInflater l();

    public abstract C0674a m();

    public abstract void n();

    public abstract void o();

    public abstract void p(Configuration configuration);

    public abstract void q(Bundle bundle);

    public abstract void r();

    public abstract void s(Bundle bundle);

    public abstract void t();

    public abstract void u(Bundle bundle);

    public abstract void v();

    public abstract void w();

    public abstract boolean z(int i4);
}
