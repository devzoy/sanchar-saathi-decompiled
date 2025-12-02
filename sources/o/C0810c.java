package o;

import S.C0311b;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.reflect.Method;
import n.c;

/* renamed from: o.c  reason: case insensitive filesystem */
public class C0810c extends C0809b implements MenuItem {

    /* renamed from: d  reason: collision with root package name */
    public final L.b f11302d;

    /* renamed from: e  reason: collision with root package name */
    public Method f11303e;

    /* renamed from: o.c$a */
    public class a extends C0311b {

        /* renamed from: d  reason: collision with root package name */
        public final ActionProvider f11304d;

        public a(Context context, ActionProvider actionProvider) {
            super(context);
            this.f11304d = actionProvider;
        }

        public boolean a() {
            return this.f11304d.hasSubMenu();
        }

        public boolean d() {
            return this.f11304d.onPerformDefaultAction();
        }

        public void e(SubMenu subMenu) {
            this.f11304d.onPrepareSubMenu(C0810c.this.d(subMenu));
        }
    }

    /* renamed from: o.c$b */
    public class b extends a implements ActionProvider.VisibilityListener {

        /* renamed from: f  reason: collision with root package name */
        public C0311b.C0055b f11306f;

        public b(Context context, ActionProvider actionProvider) {
            super(context, actionProvider);
        }

        public boolean b() {
            return this.f11304d.isVisible();
        }

        public View c(MenuItem menuItem) {
            return this.f11304d.onCreateActionView(menuItem);
        }

        public boolean f() {
            return this.f11304d.overridesItemVisibility();
        }

        public void i(C0311b.C0055b bVar) {
            this.f11306f = bVar;
            this.f11304d.setVisibilityListener(bVar != null ? this : null);
        }

        public void onActionProviderVisibilityChanged(boolean z4) {
            C0311b.C0055b bVar = this.f11306f;
            if (bVar != null) {
                bVar.onActionProviderVisibilityChanged(z4);
            }
        }
    }

    /* renamed from: o.c$c  reason: collision with other inner class name */
    public static class C0186c extends FrameLayout implements c {

        /* renamed from: c  reason: collision with root package name */
        public final CollapsibleActionView f11308c;

        public C0186c(View view) {
            super(view.getContext());
            this.f11308c = (CollapsibleActionView) view;
            addView(view);
        }

        public View a() {
            return (View) this.f11308c;
        }

        public void c() {
            this.f11308c.onActionViewExpanded();
        }

        public void f() {
            this.f11308c.onActionViewCollapsed();
        }
    }

    /* renamed from: o.c$d */
    public class d implements MenuItem.OnActionExpandListener {

        /* renamed from: a  reason: collision with root package name */
        public final MenuItem.OnActionExpandListener f11309a;

        public d(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.f11309a = onActionExpandListener;
        }

        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f11309a.onMenuItemActionCollapse(C0810c.this.c(menuItem));
        }

        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f11309a.onMenuItemActionExpand(C0810c.this.c(menuItem));
        }
    }

    /* renamed from: o.c$e */
    public class e implements MenuItem.OnMenuItemClickListener {

        /* renamed from: a  reason: collision with root package name */
        public final MenuItem.OnMenuItemClickListener f11311a;

        public e(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.f11311a = onMenuItemClickListener;
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            return this.f11311a.onMenuItemClick(C0810c.this.c(menuItem));
        }
    }

    public C0810c(Context context, L.b bVar) {
        super(context);
        if (bVar != null) {
            this.f11302d = bVar;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    public boolean collapseActionView() {
        return this.f11302d.collapseActionView();
    }

    public boolean expandActionView() {
        return this.f11302d.expandActionView();
    }

    public ActionProvider getActionProvider() {
        C0311b a4 = this.f11302d.a();
        if (a4 instanceof a) {
            return ((a) a4).f11304d;
        }
        return null;
    }

    public View getActionView() {
        View actionView = this.f11302d.getActionView();
        return actionView instanceof C0186c ? ((C0186c) actionView).a() : actionView;
    }

    public int getAlphabeticModifiers() {
        return this.f11302d.getAlphabeticModifiers();
    }

    public char getAlphabeticShortcut() {
        return this.f11302d.getAlphabeticShortcut();
    }

    public CharSequence getContentDescription() {
        return this.f11302d.getContentDescription();
    }

    public int getGroupId() {
        return this.f11302d.getGroupId();
    }

    public Drawable getIcon() {
        return this.f11302d.getIcon();
    }

    public ColorStateList getIconTintList() {
        return this.f11302d.getIconTintList();
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f11302d.getIconTintMode();
    }

    public Intent getIntent() {
        return this.f11302d.getIntent();
    }

    public int getItemId() {
        return this.f11302d.getItemId();
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f11302d.getMenuInfo();
    }

    public int getNumericModifiers() {
        return this.f11302d.getNumericModifiers();
    }

    public char getNumericShortcut() {
        return this.f11302d.getNumericShortcut();
    }

    public int getOrder() {
        return this.f11302d.getOrder();
    }

    public SubMenu getSubMenu() {
        return d(this.f11302d.getSubMenu());
    }

    public CharSequence getTitle() {
        return this.f11302d.getTitle();
    }

    public CharSequence getTitleCondensed() {
        return this.f11302d.getTitleCondensed();
    }

    public CharSequence getTooltipText() {
        return this.f11302d.getTooltipText();
    }

    public void h(boolean z4) {
        try {
            if (this.f11303e == null) {
                this.f11303e = this.f11302d.getClass().getDeclaredMethod("setExclusiveCheckable", new Class[]{Boolean.TYPE});
            }
            this.f11303e.invoke(this.f11302d, new Object[]{Boolean.valueOf(z4)});
        } catch (Exception e4) {
            Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e4);
        }
    }

    public boolean hasSubMenu() {
        return this.f11302d.hasSubMenu();
    }

    public boolean isActionViewExpanded() {
        return this.f11302d.isActionViewExpanded();
    }

    public boolean isCheckable() {
        return this.f11302d.isCheckable();
    }

    public boolean isChecked() {
        return this.f11302d.isChecked();
    }

    public boolean isEnabled() {
        return this.f11302d.isEnabled();
    }

    public boolean isVisible() {
        return this.f11302d.isVisible();
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        b bVar = new b(this.f11299a, actionProvider);
        L.b bVar2 = this.f11302d;
        if (actionProvider == null) {
            bVar = null;
        }
        bVar2.b(bVar);
        return this;
    }

    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new C0186c(view);
        }
        this.f11302d.setActionView(view);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c4) {
        this.f11302d.setAlphabeticShortcut(c4);
        return this;
    }

    public MenuItem setCheckable(boolean z4) {
        this.f11302d.setCheckable(z4);
        return this;
    }

    public MenuItem setChecked(boolean z4) {
        this.f11302d.setChecked(z4);
        return this;
    }

    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f11302d.setContentDescription(charSequence);
        return this;
    }

    public MenuItem setEnabled(boolean z4) {
        this.f11302d.setEnabled(z4);
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.f11302d.setIcon(drawable);
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f11302d.setIconTintList(colorStateList);
        return this;
    }

    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f11302d.setIconTintMode(mode);
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f11302d.setIntent(intent);
        return this;
    }

    public MenuItem setNumericShortcut(char c4) {
        this.f11302d.setNumericShortcut(c4);
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f11302d.setOnActionExpandListener(onActionExpandListener != null ? new d(onActionExpandListener) : null);
        return this;
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f11302d.setOnMenuItemClickListener(onMenuItemClickListener != null ? new e(onMenuItemClickListener) : null);
        return this;
    }

    public MenuItem setShortcut(char c4, char c5) {
        this.f11302d.setShortcut(c4, c5);
        return this;
    }

    public void setShowAsAction(int i4) {
        this.f11302d.setShowAsAction(i4);
    }

    public MenuItem setShowAsActionFlags(int i4) {
        this.f11302d.setShowAsActionFlags(i4);
        return this;
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.f11302d.setTitle(charSequence);
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f11302d.setTitleCondensed(charSequence);
        return this;
    }

    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f11302d.setTooltipText(charSequence);
        return this;
    }

    public MenuItem setVisible(boolean z4) {
        return this.f11302d.setVisible(z4);
    }

    public MenuItem setAlphabeticShortcut(char c4, int i4) {
        this.f11302d.setAlphabeticShortcut(c4, i4);
        return this;
    }

    public MenuItem setIcon(int i4) {
        this.f11302d.setIcon(i4);
        return this;
    }

    public MenuItem setNumericShortcut(char c4, int i4) {
        this.f11302d.setNumericShortcut(c4, i4);
        return this;
    }

    public MenuItem setShortcut(char c4, char c5, int i4, int i5) {
        this.f11302d.setShortcut(c4, c5, i4, i5);
        return this;
    }

    public MenuItem setTitle(int i4) {
        this.f11302d.setTitle(i4);
        return this;
    }

    public MenuItem setActionView(int i4) {
        this.f11302d.setActionView(i4);
        View actionView = this.f11302d.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.f11302d.setActionView((View) new C0186c(actionView));
        }
        return this;
    }
}
