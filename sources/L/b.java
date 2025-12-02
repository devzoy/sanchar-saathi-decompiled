package L;

import S.C0311b;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.MenuItem;
import android.view.View;

public interface b extends MenuItem {
    C0311b a();

    b b(C0311b bVar);

    boolean collapseActionView();

    boolean expandActionView();

    View getActionView();

    int getAlphabeticModifiers();

    CharSequence getContentDescription();

    ColorStateList getIconTintList();

    PorterDuff.Mode getIconTintMode();

    int getNumericModifiers();

    CharSequence getTooltipText();

    boolean isActionViewExpanded();

    MenuItem setActionView(int i4);

    MenuItem setActionView(View view);

    MenuItem setAlphabeticShortcut(char c4, int i4);

    b setContentDescription(CharSequence charSequence);

    MenuItem setIconTintList(ColorStateList colorStateList);

    MenuItem setIconTintMode(PorterDuff.Mode mode);

    MenuItem setNumericShortcut(char c4, int i4);

    MenuItem setShortcut(char c4, char c5, int i4, int i5);

    void setShowAsAction(int i4);

    MenuItem setShowAsActionFlags(int i4);

    b setTooltipText(CharSequence charSequence);
}
