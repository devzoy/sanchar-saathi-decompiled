package o;

import K.a;
import L.b;
import S.C0311b;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: o.a  reason: case insensitive filesystem */
public class C0808a implements b {

    /* renamed from: a  reason: collision with root package name */
    public final int f11279a;

    /* renamed from: b  reason: collision with root package name */
    public final int f11280b;

    /* renamed from: c  reason: collision with root package name */
    public final int f11281c;

    /* renamed from: d  reason: collision with root package name */
    public CharSequence f11282d;

    /* renamed from: e  reason: collision with root package name */
    public CharSequence f11283e;

    /* renamed from: f  reason: collision with root package name */
    public Intent f11284f;

    /* renamed from: g  reason: collision with root package name */
    public char f11285g;

    /* renamed from: h  reason: collision with root package name */
    public int f11286h = 4096;

    /* renamed from: i  reason: collision with root package name */
    public char f11287i;

    /* renamed from: j  reason: collision with root package name */
    public int f11288j = 4096;

    /* renamed from: k  reason: collision with root package name */
    public Drawable f11289k;

    /* renamed from: l  reason: collision with root package name */
    public Context f11290l;

    /* renamed from: m  reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f11291m;

    /* renamed from: n  reason: collision with root package name */
    public CharSequence f11292n;

    /* renamed from: o  reason: collision with root package name */
    public CharSequence f11293o;

    /* renamed from: p  reason: collision with root package name */
    public ColorStateList f11294p = null;

    /* renamed from: q  reason: collision with root package name */
    public PorterDuff.Mode f11295q = null;

    /* renamed from: r  reason: collision with root package name */
    public boolean f11296r = false;

    /* renamed from: s  reason: collision with root package name */
    public boolean f11297s = false;

    /* renamed from: t  reason: collision with root package name */
    public int f11298t = 16;

    public C0808a(Context context, int i4, int i5, int i6, int i7, CharSequence charSequence) {
        this.f11290l = context;
        this.f11279a = i5;
        this.f11280b = i4;
        this.f11281c = i7;
        this.f11282d = charSequence;
    }

    public C0311b a() {
        return null;
    }

    public b b(C0311b bVar) {
        throw new UnsupportedOperationException();
    }

    public final void c() {
        Drawable drawable = this.f11289k;
        if (drawable == null) {
            return;
        }
        if (this.f11296r || this.f11297s) {
            Drawable l4 = a.l(drawable);
            this.f11289k = l4;
            Drawable mutate = l4.mutate();
            this.f11289k = mutate;
            if (this.f11296r) {
                a.i(mutate, this.f11294p);
            }
            if (this.f11297s) {
                a.j(this.f11289k, this.f11295q);
            }
        }
    }

    public boolean collapseActionView() {
        return false;
    }

    /* renamed from: d */
    public b setActionView(int i4) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: e */
    public b setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    public boolean expandActionView() {
        return false;
    }

    /* renamed from: f */
    public b setShowAsActionFlags(int i4) {
        setShowAsAction(i4);
        return this;
    }

    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    public View getActionView() {
        return null;
    }

    public int getAlphabeticModifiers() {
        return this.f11288j;
    }

    public char getAlphabeticShortcut() {
        return this.f11287i;
    }

    public CharSequence getContentDescription() {
        return this.f11292n;
    }

    public int getGroupId() {
        return this.f11280b;
    }

    public Drawable getIcon() {
        return this.f11289k;
    }

    public ColorStateList getIconTintList() {
        return this.f11294p;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f11295q;
    }

    public Intent getIntent() {
        return this.f11284f;
    }

    public int getItemId() {
        return this.f11279a;
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    public int getNumericModifiers() {
        return this.f11286h;
    }

    public char getNumericShortcut() {
        return this.f11285g;
    }

    public int getOrder() {
        return this.f11281c;
    }

    public SubMenu getSubMenu() {
        return null;
    }

    public CharSequence getTitle() {
        return this.f11282d;
    }

    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f11283e;
        return charSequence != null ? charSequence : this.f11282d;
    }

    public CharSequence getTooltipText() {
        return this.f11293o;
    }

    public boolean hasSubMenu() {
        return false;
    }

    public boolean isActionViewExpanded() {
        return false;
    }

    public boolean isCheckable() {
        return (this.f11298t & 1) != 0;
    }

    public boolean isChecked() {
        return (this.f11298t & 2) != 0;
    }

    public boolean isEnabled() {
        return (this.f11298t & 16) != 0;
    }

    public boolean isVisible() {
        return (this.f11298t & 8) == 0;
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setAlphabeticShortcut(char c4) {
        this.f11287i = Character.toLowerCase(c4);
        return this;
    }

    public MenuItem setCheckable(boolean z4) {
        this.f11298t = z4 | (this.f11298t & true) ? 1 : 0;
        return this;
    }

    public MenuItem setChecked(boolean z4) {
        this.f11298t = (z4 ? 2 : 0) | (this.f11298t & -3);
        return this;
    }

    public MenuItem setEnabled(boolean z4) {
        this.f11298t = (z4 ? 16 : 0) | (this.f11298t & -17);
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.f11289k = drawable;
        c();
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f11294p = colorStateList;
        this.f11296r = true;
        c();
        return this;
    }

    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f11295q = mode;
        this.f11297s = true;
        c();
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f11284f = intent;
        return this;
    }

    public MenuItem setNumericShortcut(char c4) {
        this.f11285g = c4;
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f11291m = onMenuItemClickListener;
        return this;
    }

    public MenuItem setShortcut(char c4, char c5) {
        this.f11285g = c4;
        this.f11287i = Character.toLowerCase(c5);
        return this;
    }

    public void setShowAsAction(int i4) {
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.f11282d = charSequence;
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f11283e = charSequence;
        return this;
    }

    public MenuItem setVisible(boolean z4) {
        int i4 = 8;
        int i5 = this.f11298t & 8;
        if (z4) {
            i4 = 0;
        }
        this.f11298t = i5 | i4;
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c4, int i4) {
        this.f11287i = Character.toLowerCase(c4);
        this.f11288j = KeyEvent.normalizeMetaState(i4);
        return this;
    }

    public b setContentDescription(CharSequence charSequence) {
        this.f11292n = charSequence;
        return this;
    }

    public MenuItem setNumericShortcut(char c4, int i4) {
        this.f11285g = c4;
        this.f11286h = KeyEvent.normalizeMetaState(i4);
        return this;
    }

    public MenuItem setTitle(int i4) {
        this.f11282d = this.f11290l.getResources().getString(i4);
        return this;
    }

    public b setTooltipText(CharSequence charSequence) {
        this.f11293o = charSequence;
        return this;
    }

    public MenuItem setIcon(int i4) {
        this.f11289k = H.a.d(this.f11290l, i4);
        c();
        return this;
    }

    public MenuItem setShortcut(char c4, char c5, int i4, int i5) {
        this.f11285g = c4;
        this.f11286h = KeyEvent.normalizeMetaState(i4);
        this.f11287i = Character.toLowerCase(c5);
        this.f11288j = KeyEvent.normalizeMetaState(i5);
        return this;
    }
}
