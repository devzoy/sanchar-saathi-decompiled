package o;

import L.a;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

/* renamed from: o.e  reason: case insensitive filesystem */
public class C0812e extends C0809b implements Menu {

    /* renamed from: d  reason: collision with root package name */
    public final a f11314d;

    public C0812e(Context context, a aVar) {
        super(context);
        if (aVar != null) {
            this.f11314d = aVar;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    public MenuItem add(CharSequence charSequence) {
        return c(this.f11314d.add(charSequence));
    }

    public int addIntentOptions(int i4, int i5, int i6, ComponentName componentName, Intent[] intentArr, Intent intent, int i7, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr;
        MenuItem[] menuItemArr3 = menuItemArr2 != null ? new MenuItem[menuItemArr2.length] : null;
        int addIntentOptions = this.f11314d.addIntentOptions(i4, i5, i6, componentName, intentArr, intent, i7, menuItemArr3);
        if (menuItemArr3 != null) {
            int length = menuItemArr3.length;
            for (int i8 = 0; i8 < length; i8++) {
                menuItemArr2[i8] = c(menuItemArr3[i8]);
            }
        }
        return addIntentOptions;
    }

    public SubMenu addSubMenu(CharSequence charSequence) {
        return d(this.f11314d.addSubMenu(charSequence));
    }

    public void clear() {
        e();
        this.f11314d.clear();
    }

    public void close() {
        this.f11314d.close();
    }

    public MenuItem findItem(int i4) {
        return c(this.f11314d.findItem(i4));
    }

    public MenuItem getItem(int i4) {
        return c(this.f11314d.getItem(i4));
    }

    public boolean hasVisibleItems() {
        return this.f11314d.hasVisibleItems();
    }

    public boolean isShortcutKey(int i4, KeyEvent keyEvent) {
        return this.f11314d.isShortcutKey(i4, keyEvent);
    }

    public boolean performIdentifierAction(int i4, int i5) {
        return this.f11314d.performIdentifierAction(i4, i5);
    }

    public boolean performShortcut(int i4, KeyEvent keyEvent, int i5) {
        return this.f11314d.performShortcut(i4, keyEvent, i5);
    }

    public void removeGroup(int i4) {
        f(i4);
        this.f11314d.removeGroup(i4);
    }

    public void removeItem(int i4) {
        g(i4);
        this.f11314d.removeItem(i4);
    }

    public void setGroupCheckable(int i4, boolean z4, boolean z5) {
        this.f11314d.setGroupCheckable(i4, z4, z5);
    }

    public void setGroupEnabled(int i4, boolean z4) {
        this.f11314d.setGroupEnabled(i4, z4);
    }

    public void setGroupVisible(int i4, boolean z4) {
        this.f11314d.setGroupVisible(i4, z4);
    }

    public void setQwertyMode(boolean z4) {
        this.f11314d.setQwertyMode(z4);
    }

    public int size() {
        return this.f11314d.size();
    }

    public MenuItem add(int i4) {
        return c(this.f11314d.add(i4));
    }

    public SubMenu addSubMenu(int i4) {
        return d(this.f11314d.addSubMenu(i4));
    }

    public MenuItem add(int i4, int i5, int i6, CharSequence charSequence) {
        return c(this.f11314d.add(i4, i5, i6, charSequence));
    }

    public SubMenu addSubMenu(int i4, int i5, int i6, CharSequence charSequence) {
        return d(this.f11314d.addSubMenu(i4, i5, i6, charSequence));
    }

    public MenuItem add(int i4, int i5, int i6, int i7) {
        return c(this.f11314d.add(i4, i5, i6, i7));
    }

    public SubMenu addSubMenu(int i4, int i5, int i6, int i7) {
        return d(this.f11314d.addSubMenu(i4, i5, i6, i7));
    }
}
