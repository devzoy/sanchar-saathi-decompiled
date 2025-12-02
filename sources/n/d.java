package n;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import h.i;

public class d extends ContextWrapper {

    /* renamed from: a  reason: collision with root package name */
    public int f11156a;

    /* renamed from: b  reason: collision with root package name */
    public Resources.Theme f11157b;

    /* renamed from: c  reason: collision with root package name */
    public LayoutInflater f11158c;

    /* renamed from: d  reason: collision with root package name */
    public Configuration f11159d;

    /* renamed from: e  reason: collision with root package name */
    public Resources f11160e;

    public d(Context context, int i4) {
        super(context);
        this.f11156a = i4;
    }

    public void a(Configuration configuration) {
        if (this.f11160e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        } else if (this.f11159d == null) {
            this.f11159d = new Configuration(configuration);
        } else {
            throw new IllegalStateException("Override configuration has already been set");
        }
    }

    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public final Resources b() {
        if (this.f11160e == null) {
            Configuration configuration = this.f11159d;
            if (configuration == null) {
                this.f11160e = super.getResources();
            } else {
                this.f11160e = createConfigurationContext(configuration).getResources();
            }
        }
        return this.f11160e;
    }

    public int c() {
        return this.f11156a;
    }

    public final void d() {
        boolean z4 = this.f11157b == null;
        if (z4) {
            this.f11157b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f11157b.setTo(theme);
            }
        }
        e(this.f11157b, this.f11156a, z4);
    }

    public void e(Resources.Theme theme, int i4, boolean z4) {
        theme.applyStyle(i4, true);
    }

    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    public Resources getResources() {
        return b();
    }

    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f11158c == null) {
            this.f11158c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f11158c;
    }

    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f11157b;
        if (theme != null) {
            return theme;
        }
        if (this.f11156a == 0) {
            this.f11156a = i.f9328c;
        }
        d();
        return this.f11157b;
    }

    public void setTheme(int i4) {
        if (this.f11156a != i4) {
            this.f11156a = i4;
            d();
        }
    }

    public d(Context context, Resources.Theme theme) {
        super(context);
        this.f11157b = theme;
    }
}
