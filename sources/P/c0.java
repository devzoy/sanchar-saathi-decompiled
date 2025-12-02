package p;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public class c0 extends ContextWrapper {

    /* renamed from: c  reason: collision with root package name */
    public static final Object f11517c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public static ArrayList f11518d;

    /* renamed from: a  reason: collision with root package name */
    public final Resources f11519a;

    /* renamed from: b  reason: collision with root package name */
    public final Resources.Theme f11520b;

    public c0(Context context) {
        super(context);
        if (h0.b()) {
            h0 h0Var = new h0(this, context.getResources());
            this.f11519a = h0Var;
            Resources.Theme newTheme = h0Var.newTheme();
            this.f11520b = newTheme;
            newTheme.setTo(context.getTheme());
            return;
        }
        this.f11519a = new e0(this, context.getResources());
        this.f11520b = null;
    }

    public static boolean a(Context context) {
        if ((context instanceof c0) || (context.getResources() instanceof e0) || (context.getResources() instanceof h0)) {
            return false;
        }
        return h0.b();
    }

    public static Context b(Context context) {
        if (!a(context)) {
            return context;
        }
        synchronized (f11517c) {
            try {
                ArrayList arrayList = f11518d;
                if (arrayList == null) {
                    f11518d = new ArrayList();
                } else {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        WeakReference weakReference = (WeakReference) f11518d.get(size);
                        if (weakReference == null || weakReference.get() == null) {
                            f11518d.remove(size);
                        }
                    }
                    for (int size2 = f11518d.size() - 1; size2 >= 0; size2--) {
                        WeakReference weakReference2 = (WeakReference) f11518d.get(size2);
                        c0 c0Var = weakReference2 != null ? (c0) weakReference2.get() : null;
                        if (c0Var != null && c0Var.getBaseContext() == context) {
                            return c0Var;
                        }
                    }
                }
                c0 c0Var2 = new c0(context);
                f11518d.add(new WeakReference(c0Var2));
                return c0Var2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public AssetManager getAssets() {
        return this.f11519a.getAssets();
    }

    public Resources getResources() {
        return this.f11519a;
    }

    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f11520b;
        return theme == null ? super.getTheme() : theme;
    }

    public void setTheme(int i4) {
        Resources.Theme theme = this.f11520b;
        if (theme == null) {
            super.setTheme(i4);
        } else {
            theme.applyStyle(i4, true);
        }
    }
}
