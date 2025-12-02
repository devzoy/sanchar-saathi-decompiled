package p;

import android.content.res.AssetFileDescriptor;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Movie;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import java.io.InputStream;

public abstract class W extends Resources {

    /* renamed from: a  reason: collision with root package name */
    public final Resources f11464a;

    public W(Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.f11464a = resources;
    }

    public XmlResourceParser getAnimation(int i4) {
        return this.f11464a.getAnimation(i4);
    }

    public boolean getBoolean(int i4) {
        return this.f11464a.getBoolean(i4);
    }

    public int getColor(int i4) {
        return this.f11464a.getColor(i4);
    }

    public ColorStateList getColorStateList(int i4) {
        return this.f11464a.getColorStateList(i4);
    }

    public Configuration getConfiguration() {
        return this.f11464a.getConfiguration();
    }

    public float getDimension(int i4) {
        return this.f11464a.getDimension(i4);
    }

    public int getDimensionPixelOffset(int i4) {
        return this.f11464a.getDimensionPixelOffset(i4);
    }

    public int getDimensionPixelSize(int i4) {
        return this.f11464a.getDimensionPixelSize(i4);
    }

    public DisplayMetrics getDisplayMetrics() {
        return this.f11464a.getDisplayMetrics();
    }

    public Drawable getDrawable(int i4) {
        return this.f11464a.getDrawable(i4);
    }

    public Drawable getDrawableForDensity(int i4, int i5) {
        return this.f11464a.getDrawableForDensity(i4, i5);
    }

    public float getFraction(int i4, int i5, int i6) {
        return this.f11464a.getFraction(i4, i5, i6);
    }

    public int getIdentifier(String str, String str2, String str3) {
        return this.f11464a.getIdentifier(str, str2, str3);
    }

    public int[] getIntArray(int i4) {
        return this.f11464a.getIntArray(i4);
    }

    public int getInteger(int i4) {
        return this.f11464a.getInteger(i4);
    }

    public XmlResourceParser getLayout(int i4) {
        return this.f11464a.getLayout(i4);
    }

    public Movie getMovie(int i4) {
        return this.f11464a.getMovie(i4);
    }

    public String getQuantityString(int i4, int i5, Object... objArr) {
        return this.f11464a.getQuantityString(i4, i5, objArr);
    }

    public CharSequence getQuantityText(int i4, int i5) {
        return this.f11464a.getQuantityText(i4, i5);
    }

    public String getResourceEntryName(int i4) {
        return this.f11464a.getResourceEntryName(i4);
    }

    public String getResourceName(int i4) {
        return this.f11464a.getResourceName(i4);
    }

    public String getResourcePackageName(int i4) {
        return this.f11464a.getResourcePackageName(i4);
    }

    public String getResourceTypeName(int i4) {
        return this.f11464a.getResourceTypeName(i4);
    }

    public String getString(int i4) {
        return this.f11464a.getString(i4);
    }

    public String[] getStringArray(int i4) {
        return this.f11464a.getStringArray(i4);
    }

    public CharSequence getText(int i4) {
        return this.f11464a.getText(i4);
    }

    public CharSequence[] getTextArray(int i4) {
        return this.f11464a.getTextArray(i4);
    }

    public void getValue(int i4, TypedValue typedValue, boolean z4) {
        this.f11464a.getValue(i4, typedValue, z4);
    }

    public void getValueForDensity(int i4, int i5, TypedValue typedValue, boolean z4) {
        this.f11464a.getValueForDensity(i4, i5, typedValue, z4);
    }

    public XmlResourceParser getXml(int i4) {
        return this.f11464a.getXml(i4);
    }

    public TypedArray obtainAttributes(AttributeSet attributeSet, int[] iArr) {
        return this.f11464a.obtainAttributes(attributeSet, iArr);
    }

    public TypedArray obtainTypedArray(int i4) {
        return this.f11464a.obtainTypedArray(i4);
    }

    public InputStream openRawResource(int i4) {
        return this.f11464a.openRawResource(i4);
    }

    public AssetFileDescriptor openRawResourceFd(int i4) {
        return this.f11464a.openRawResourceFd(i4);
    }

    public void parseBundleExtra(String str, AttributeSet attributeSet, Bundle bundle) {
        this.f11464a.parseBundleExtra(str, attributeSet, bundle);
    }

    public void parseBundleExtras(XmlResourceParser xmlResourceParser, Bundle bundle) {
        this.f11464a.parseBundleExtras(xmlResourceParser, bundle);
    }

    public void updateConfiguration(Configuration configuration, DisplayMetrics displayMetrics) {
        super.updateConfiguration(configuration, displayMetrics);
        Resources resources = this.f11464a;
        if (resources != null) {
            resources.updateConfiguration(configuration, displayMetrics);
        }
    }

    public Drawable getDrawable(int i4, Resources.Theme theme) {
        return this.f11464a.getDrawable(i4, theme);
    }

    public Drawable getDrawableForDensity(int i4, int i5, Resources.Theme theme) {
        return this.f11464a.getDrawableForDensity(i4, i5, theme);
    }

    public String getQuantityString(int i4, int i5) {
        return this.f11464a.getQuantityString(i4, i5);
    }

    public String getString(int i4, Object... objArr) {
        return this.f11464a.getString(i4, objArr);
    }

    public CharSequence getText(int i4, CharSequence charSequence) {
        return this.f11464a.getText(i4, charSequence);
    }

    public void getValue(String str, TypedValue typedValue, boolean z4) {
        this.f11464a.getValue(str, typedValue, z4);
    }

    public InputStream openRawResource(int i4, TypedValue typedValue) {
        return this.f11464a.openRawResource(i4, typedValue);
    }
}
