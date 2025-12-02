package androidx.appcompat.view.menu;

import L.b;
import S.C0311b;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.j;
import h.h;
import j.C0754a;

public final class g implements b {

    /* renamed from: A  reason: collision with root package name */
    public View f4291A;

    /* renamed from: B  reason: collision with root package name */
    public C0311b f4292B;

    /* renamed from: C  reason: collision with root package name */
    public MenuItem.OnActionExpandListener f4293C;

    /* renamed from: D  reason: collision with root package name */
    public boolean f4294D = false;

    /* renamed from: E  reason: collision with root package name */
    public ContextMenu.ContextMenuInfo f4295E;

    /* renamed from: a  reason: collision with root package name */
    public final int f4296a;

    /* renamed from: b  reason: collision with root package name */
    public final int f4297b;

    /* renamed from: c  reason: collision with root package name */
    public final int f4298c;

    /* renamed from: d  reason: collision with root package name */
    public final int f4299d;

    /* renamed from: e  reason: collision with root package name */
    public CharSequence f4300e;

    /* renamed from: f  reason: collision with root package name */
    public CharSequence f4301f;

    /* renamed from: g  reason: collision with root package name */
    public Intent f4302g;

    /* renamed from: h  reason: collision with root package name */
    public char f4303h;

    /* renamed from: i  reason: collision with root package name */
    public int f4304i = 4096;

    /* renamed from: j  reason: collision with root package name */
    public char f4305j;

    /* renamed from: k  reason: collision with root package name */
    public int f4306k = 4096;

    /* renamed from: l  reason: collision with root package name */
    public Drawable f4307l;

    /* renamed from: m  reason: collision with root package name */
    public int f4308m = 0;

    /* renamed from: n  reason: collision with root package name */
    public e f4309n;

    /* renamed from: o  reason: collision with root package name */
    public l f4310o;

    /* renamed from: p  reason: collision with root package name */
    public Runnable f4311p;

    /* renamed from: q  reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f4312q;

    /* renamed from: r  reason: collision with root package name */
    public CharSequence f4313r;

    /* renamed from: s  reason: collision with root package name */
    public CharSequence f4314s;

    /* renamed from: t  reason: collision with root package name */
    public ColorStateList f4315t = null;

    /* renamed from: u  reason: collision with root package name */
    public PorterDuff.Mode f4316u = null;

    /* renamed from: v  reason: collision with root package name */
    public boolean f4317v = false;

    /* renamed from: w  reason: collision with root package name */
    public boolean f4318w = false;

    /* renamed from: x  reason: collision with root package name */
    public boolean f4319x = false;

    /* renamed from: y  reason: collision with root package name */
    public int f4320y = 16;

    /* renamed from: z  reason: collision with root package name */
    public int f4321z;

    public class a implements C0311b.C0055b {
        public a() {
        }

        public void onActionProviderVisibilityChanged(boolean z4) {
            g gVar = g.this;
            gVar.f4309n.J(gVar);
        }
    }

    public g(e eVar, int i4, int i5, int i6, int i7, CharSequence charSequence, int i8) {
        this.f4309n = eVar;
        this.f4296a = i5;
        this.f4297b = i4;
        this.f4298c = i6;
        this.f4299d = i7;
        this.f4300e = charSequence;
        this.f4321z = i8;
    }

    public static void d(StringBuilder sb, int i4, int i5, String str) {
        if ((i4 & i5) == i5) {
            sb.append(str);
        }
    }

    public boolean A() {
        return this.f4309n.H() && g() != 0;
    }

    public boolean B() {
        return (this.f4321z & 4) == 4;
    }

    public C0311b a() {
        return this.f4292B;
    }

    public b b(C0311b bVar) {
        C0311b bVar2 = this.f4292B;
        if (bVar2 != null) {
            bVar2.g();
        }
        this.f4291A = null;
        this.f4292B = bVar;
        this.f4309n.K(true);
        C0311b bVar3 = this.f4292B;
        if (bVar3 != null) {
            bVar3.i(new a());
        }
        return this;
    }

    public void c() {
        this.f4309n.I(this);
    }

    public boolean collapseActionView() {
        if ((this.f4321z & 8) == 0) {
            return false;
        }
        if (this.f4291A == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f4293C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f4309n.f(this);
        }
        return false;
    }

    public final Drawable e(Drawable drawable) {
        if (drawable != null && this.f4319x && (this.f4317v || this.f4318w)) {
            drawable = K.a.l(drawable).mutate();
            if (this.f4317v) {
                K.a.i(drawable, this.f4315t);
            }
            if (this.f4318w) {
                K.a.j(drawable, this.f4316u);
            }
            this.f4319x = false;
        }
        return drawable;
    }

    public boolean expandActionView() {
        if (!j()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f4293C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f4309n.k(this);
        }
        return false;
    }

    public int f() {
        return this.f4299d;
    }

    public char g() {
        return this.f4309n.G() ? this.f4305j : this.f4303h;
    }

    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    public View getActionView() {
        View view = this.f4291A;
        if (view != null) {
            return view;
        }
        C0311b bVar = this.f4292B;
        if (bVar == null) {
            return null;
        }
        View c4 = bVar.c(this);
        this.f4291A = c4;
        return c4;
    }

    public int getAlphabeticModifiers() {
        return this.f4306k;
    }

    public char getAlphabeticShortcut() {
        return this.f4305j;
    }

    public CharSequence getContentDescription() {
        return this.f4313r;
    }

    public int getGroupId() {
        return this.f4297b;
    }

    public Drawable getIcon() {
        Drawable drawable = this.f4307l;
        if (drawable != null) {
            return e(drawable);
        }
        if (this.f4308m == 0) {
            return null;
        }
        Drawable b4 = C0754a.b(this.f4309n.u(), this.f4308m);
        this.f4308m = 0;
        this.f4307l = b4;
        return e(b4);
    }

    public ColorStateList getIconTintList() {
        return this.f4315t;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f4316u;
    }

    public Intent getIntent() {
        return this.f4302g;
    }

    public int getItemId() {
        return this.f4296a;
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f4295E;
    }

    public int getNumericModifiers() {
        return this.f4304i;
    }

    public char getNumericShortcut() {
        return this.f4303h;
    }

    public int getOrder() {
        return this.f4298c;
    }

    public SubMenu getSubMenu() {
        return this.f4310o;
    }

    public CharSequence getTitle() {
        return this.f4300e;
    }

    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f4301f;
        return charSequence != null ? charSequence : this.f4300e;
    }

    public CharSequence getTooltipText() {
        return this.f4314s;
    }

    public String h() {
        char g4 = g();
        if (g4 == 0) {
            return "";
        }
        Resources resources = this.f4309n.u().getResources();
        StringBuilder sb = new StringBuilder();
        if (ViewConfiguration.get(this.f4309n.u()).hasPermanentMenuKey()) {
            sb.append(resources.getString(h.f9324k));
        }
        int i4 = this.f4309n.G() ? this.f4306k : this.f4304i;
        d(sb, i4, 65536, resources.getString(h.f9320g));
        d(sb, i4, 4096, resources.getString(h.f9316c));
        d(sb, i4, 2, resources.getString(h.f9315b));
        d(sb, i4, 1, resources.getString(h.f9321h));
        d(sb, i4, 4, resources.getString(h.f9323j));
        d(sb, i4, 8, resources.getString(h.f9319f));
        if (g4 == 8) {
            sb.append(resources.getString(h.f9317d));
        } else if (g4 == 10) {
            sb.append(resources.getString(h.f9318e));
        } else if (g4 != ' ') {
            sb.append(g4);
        } else {
            sb.append(resources.getString(h.f9322i));
        }
        return sb.toString();
    }

    public boolean hasSubMenu() {
        return this.f4310o != null;
    }

    public CharSequence i(j.a aVar) {
        return (aVar == null || !aVar.d()) ? getTitle() : getTitleCondensed();
    }

    public boolean isActionViewExpanded() {
        return this.f4294D;
    }

    public boolean isCheckable() {
        return (this.f4320y & 1) == 1;
    }

    public boolean isChecked() {
        return (this.f4320y & 2) == 2;
    }

    public boolean isEnabled() {
        return (this.f4320y & 16) != 0;
    }

    public boolean isVisible() {
        C0311b bVar = this.f4292B;
        return (bVar == null || !bVar.f()) ? (this.f4320y & 8) == 0 : (this.f4320y & 8) == 0 && this.f4292B.b();
    }

    public boolean j() {
        C0311b bVar;
        if ((this.f4321z & 8) == 0) {
            return false;
        }
        if (this.f4291A == null && (bVar = this.f4292B) != null) {
            this.f4291A = bVar.c(this);
        }
        return this.f4291A != null;
    }

    public boolean k() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f4312q;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        e eVar = this.f4309n;
        if (eVar.h(eVar, this)) {
            return true;
        }
        Runnable runnable = this.f4311p;
        if (runnable != null) {
            runnable.run();
            return true;
        }
        if (this.f4302g != null) {
            try {
                this.f4309n.u().startActivity(this.f4302g);
                return true;
            } catch (ActivityNotFoundException e4) {
                Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e4);
            }
        }
        C0311b bVar = this.f4292B;
        return bVar != null && bVar.d();
    }

    public boolean l() {
        return (this.f4320y & 32) == 32;
    }

    public boolean m() {
        return (this.f4320y & 4) != 0;
    }

    public boolean n() {
        return (this.f4321z & 1) == 1;
    }

    public boolean o() {
        return (this.f4321z & 2) == 2;
    }

    /* renamed from: p */
    public b setActionView(int i4) {
        Context u4 = this.f4309n.u();
        setActionView(LayoutInflater.from(u4).inflate(i4, new LinearLayout(u4), false));
        return this;
    }

    /* renamed from: q */
    public b setActionView(View view) {
        int i4;
        this.f4291A = view;
        this.f4292B = null;
        if (view != null && view.getId() == -1 && (i4 = this.f4296a) > 0) {
            view.setId(i4);
        }
        this.f4309n.I(this);
        return this;
    }

    public void r(boolean z4) {
        this.f4294D = z4;
        this.f4309n.K(false);
    }

    public void s(boolean z4) {
        int i4 = this.f4320y;
        int i5 = (z4 ? 2 : 0) | (i4 & -3);
        this.f4320y = i5;
        if (i4 != i5) {
            this.f4309n.K(false);
        }
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    public MenuItem setAlphabeticShortcut(char c4) {
        if (this.f4305j == c4) {
            return this;
        }
        this.f4305j = Character.toLowerCase(c4);
        this.f4309n.K(false);
        return this;
    }

    public MenuItem setCheckable(boolean z4) {
        int i4 = this.f4320y;
        boolean z5 = z4 | (i4 & true);
        this.f4320y = z5 ? 1 : 0;
        if (i4 != z5) {
            this.f4309n.K(false);
        }
        return this;
    }

    public MenuItem setChecked(boolean z4) {
        if ((this.f4320y & 4) != 0) {
            this.f4309n.T(this);
        } else {
            s(z4);
        }
        return this;
    }

    public MenuItem setEnabled(boolean z4) {
        if (z4) {
            this.f4320y |= 16;
        } else {
            this.f4320y &= -17;
        }
        this.f4309n.K(false);
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.f4308m = 0;
        this.f4307l = drawable;
        this.f4319x = true;
        this.f4309n.K(false);
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f4315t = colorStateList;
        this.f4317v = true;
        this.f4319x = true;
        this.f4309n.K(false);
        return this;
    }

    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f4316u = mode;
        this.f4318w = true;
        this.f4319x = true;
        this.f4309n.K(false);
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f4302g = intent;
        return this;
    }

    public MenuItem setNumericShortcut(char c4) {
        if (this.f4303h == c4) {
            return this;
        }
        this.f4303h = c4;
        this.f4309n.K(false);
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f4293C = onActionExpandListener;
        return this;
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f4312q = onMenuItemClickListener;
        return this;
    }

    public MenuItem setShortcut(char c4, char c5) {
        this.f4303h = c4;
        this.f4305j = Character.toLowerCase(c5);
        this.f4309n.K(false);
        return this;
    }

    public void setShowAsAction(int i4) {
        int i5 = i4 & 3;
        if (i5 == 0 || i5 == 1 || i5 == 2) {
            this.f4321z = i4;
            this.f4309n.I(this);
            return;
        }
        throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.f4300e = charSequence;
        this.f4309n.K(false);
        l lVar = this.f4310o;
        if (lVar != null) {
            lVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f4301f = charSequence;
        this.f4309n.K(false);
        return this;
    }

    public MenuItem setVisible(boolean z4) {
        if (y(z4)) {
            this.f4309n.J(this);
        }
        return this;
    }

    public void t(boolean z4) {
        this.f4320y = (z4 ? 4 : 0) | (this.f4320y & -5);
    }

    public String toString() {
        CharSequence charSequence = this.f4300e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public void u(boolean z4) {
        if (z4) {
            this.f4320y |= 32;
        } else {
            this.f4320y &= -33;
        }
    }

    public void v(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.f4295E = contextMenuInfo;
    }

    /* renamed from: w */
    public b setShowAsActionFlags(int i4) {
        setShowAsAction(i4);
        return this;
    }

    public void x(l lVar) {
        this.f4310o = lVar;
        lVar.setHeaderTitle(getTitle());
    }

    public boolean y(boolean z4) {
        int i4 = this.f4320y;
        int i5 = (z4 ? 0 : 8) | (i4 & -9);
        this.f4320y = i5;
        return i4 != i5;
    }

    public boolean z() {
        return this.f4309n.A();
    }

    public b setContentDescription(CharSequence charSequence) {
        this.f4313r = charSequence;
        this.f4309n.K(false);
        return this;
    }

    public b setTooltipText(CharSequence charSequence) {
        this.f4314s = charSequence;
        this.f4309n.K(false);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c4, int i4) {
        if (this.f4305j == c4 && this.f4306k == i4) {
            return this;
        }
        this.f4305j = Character.toLowerCase(c4);
        this.f4306k = KeyEvent.normalizeMetaState(i4);
        this.f4309n.K(false);
        return this;
    }

    public MenuItem setNumericShortcut(char c4, int i4) {
        if (this.f4303h == c4 && this.f4304i == i4) {
            return this;
        }
        this.f4303h = c4;
        this.f4304i = KeyEvent.normalizeMetaState(i4);
        this.f4309n.K(false);
        return this;
    }

    public MenuItem setShortcut(char c4, char c5, int i4, int i5) {
        this.f4303h = c4;
        this.f4304i = KeyEvent.normalizeMetaState(i4);
        this.f4305j = Character.toLowerCase(c5);
        this.f4306k = KeyEvent.normalizeMetaState(i5);
        this.f4309n.K(false);
        return this;
    }

    public MenuItem setIcon(int i4) {
        this.f4307l = null;
        this.f4308m = i4;
        this.f4319x = true;
        this.f4309n.K(false);
        return this;
    }

    public MenuItem setTitle(int i4) {
        return setTitle((CharSequence) this.f4309n.u().getString(i4));
    }
}
