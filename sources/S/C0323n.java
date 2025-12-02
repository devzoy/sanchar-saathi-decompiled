package S;

import L.b;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.util.Log;
import android.view.MenuItem;

/* renamed from: S.n  reason: case insensitive filesystem */
public abstract class C0323n {

    /* renamed from: S.n$a */
    public static class a {
        public static int a(MenuItem menuItem) {
            return menuItem.getAlphabeticModifiers();
        }

        public static CharSequence b(MenuItem menuItem) {
            return menuItem.getContentDescription();
        }

        public static ColorStateList c(MenuItem menuItem) {
            return menuItem.getIconTintList();
        }

        public static PorterDuff.Mode d(MenuItem menuItem) {
            return menuItem.getIconTintMode();
        }

        public static int e(MenuItem menuItem) {
            return menuItem.getNumericModifiers();
        }

        public static CharSequence f(MenuItem menuItem) {
            return menuItem.getTooltipText();
        }

        public static MenuItem g(MenuItem menuItem, char c4, int i4) {
            return menuItem.setAlphabeticShortcut(c4, i4);
        }

        public static MenuItem h(MenuItem menuItem, CharSequence charSequence) {
            return menuItem.setContentDescription(charSequence);
        }

        public static MenuItem i(MenuItem menuItem, ColorStateList colorStateList) {
            return menuItem.setIconTintList(colorStateList);
        }

        public static MenuItem j(MenuItem menuItem, PorterDuff.Mode mode) {
            return menuItem.setIconTintMode(mode);
        }

        public static MenuItem k(MenuItem menuItem, char c4, int i4) {
            return menuItem.setNumericShortcut(c4, i4);
        }

        public static MenuItem l(MenuItem menuItem, char c4, char c5, int i4, int i5) {
            return menuItem.setShortcut(c4, c5, i4, i5);
        }

        public static MenuItem m(MenuItem menuItem, CharSequence charSequence) {
            return menuItem.setTooltipText(charSequence);
        }
    }

    public static MenuItem a(MenuItem menuItem, C0311b bVar) {
        if (menuItem instanceof b) {
            return ((b) menuItem).b(bVar);
        }
        Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
        return menuItem;
    }

    public static void b(MenuItem menuItem, char c4, int i4) {
        if (menuItem instanceof b) {
            ((b) menuItem).setAlphabeticShortcut(c4, i4);
        } else {
            a.g(menuItem, c4, i4);
        }
    }

    public static void c(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof b) {
            ((b) menuItem).setContentDescription(charSequence);
        } else {
            a.h(menuItem, charSequence);
        }
    }

    public static void d(MenuItem menuItem, ColorStateList colorStateList) {
        if (menuItem instanceof b) {
            ((b) menuItem).setIconTintList(colorStateList);
        } else {
            a.i(menuItem, colorStateList);
        }
    }

    public static void e(MenuItem menuItem, PorterDuff.Mode mode) {
        if (menuItem instanceof b) {
            ((b) menuItem).setIconTintMode(mode);
        } else {
            a.j(menuItem, mode);
        }
    }

    public static void f(MenuItem menuItem, char c4, int i4) {
        if (menuItem instanceof b) {
            ((b) menuItem).setNumericShortcut(c4, i4);
        } else {
            a.k(menuItem, c4, i4);
        }
    }

    public static void g(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof b) {
            ((b) menuItem).setTooltipText(charSequence);
        } else {
            a.m(menuItem, charSequence);
        }
    }
}
