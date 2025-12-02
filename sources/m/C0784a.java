package m;

import android.content.Context;
import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import java.util.Locale;

/* renamed from: m.a  reason: case insensitive filesystem */
public class C0784a implements TransformationMethod {

    /* renamed from: a  reason: collision with root package name */
    public Locale f11132a;

    public C0784a(Context context) {
        this.f11132a = context.getResources().getConfiguration().locale;
    }

    public CharSequence getTransformation(CharSequence charSequence, View view) {
        if (charSequence != null) {
            return charSequence.toString().toUpperCase(this.f11132a);
        }
        return null;
    }

    public void onFocusChanged(View view, CharSequence charSequence, boolean z4, int i4, Rect rect) {
    }
}
