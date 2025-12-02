package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.e;

public class l extends e implements SubMenu {

    /* renamed from: B  reason: collision with root package name */
    public e f4359B;

    /* renamed from: C  reason: collision with root package name */
    public g f4360C;

    public l(Context context, e eVar, g gVar) {
        super(context);
        this.f4359B = eVar;
        this.f4360C = gVar;
    }

    public e D() {
        return this.f4359B.D();
    }

    public boolean F() {
        return this.f4359B.F();
    }

    public boolean G() {
        return this.f4359B.G();
    }

    public boolean H() {
        return this.f4359B.H();
    }

    public void R(e.a aVar) {
        this.f4359B.R(aVar);
    }

    public Menu e0() {
        return this.f4359B;
    }

    public boolean f(g gVar) {
        return this.f4359B.f(gVar);
    }

    public MenuItem getItem() {
        return this.f4360C;
    }

    public boolean h(e eVar, MenuItem menuItem) {
        return super.h(eVar, menuItem) || this.f4359B.h(eVar, menuItem);
    }

    public boolean k(g gVar) {
        return this.f4359B.k(gVar);
    }

    public void setGroupDividerEnabled(boolean z4) {
        this.f4359B.setGroupDividerEnabled(z4);
    }

    public SubMenu setHeaderIcon(Drawable drawable) {
        return (SubMenu) super.V(drawable);
    }

    public SubMenu setHeaderTitle(CharSequence charSequence) {
        return (SubMenu) super.Y(charSequence);
    }

    public SubMenu setHeaderView(View view) {
        return (SubMenu) super.Z(view);
    }

    public SubMenu setIcon(Drawable drawable) {
        this.f4360C.setIcon(drawable);
        return this;
    }

    public void setQwertyMode(boolean z4) {
        this.f4359B.setQwertyMode(z4);
    }

    public String t() {
        g gVar = this.f4360C;
        int itemId = gVar != null ? gVar.getItemId() : 0;
        if (itemId == 0) {
            return null;
        }
        return super.t() + ":" + itemId;
    }

    public SubMenu setHeaderIcon(int i4) {
        return (SubMenu) super.U(i4);
    }

    public SubMenu setHeaderTitle(int i4) {
        return (SubMenu) super.X(i4);
    }

    public SubMenu setIcon(int i4) {
        this.f4360C.setIcon(i4);
        return this;
    }
}
