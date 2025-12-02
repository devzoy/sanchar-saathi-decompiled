package I;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;

public abstract class e {
    public static int a(Context context, int i4, int i5) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i4, typedValue, true);
        return typedValue.resourceId != 0 ? i4 : i5;
    }

    public static boolean b(TypedArray typedArray, int i4, int i5, boolean z4) {
        return typedArray.getBoolean(i4, typedArray.getBoolean(i5, z4));
    }

    public static Drawable c(TypedArray typedArray, int i4, int i5) {
        Drawable drawable = typedArray.getDrawable(i4);
        return drawable == null ? typedArray.getDrawable(i5) : drawable;
    }

    public static int d(TypedArray typedArray, int i4, int i5, int i6) {
        return typedArray.getInt(i4, typedArray.getInt(i5, i6));
    }

    public static int e(TypedArray typedArray, int i4, int i5, int i6) {
        return typedArray.getResourceId(i4, typedArray.getResourceId(i5, i6));
    }

    public static String f(TypedArray typedArray, int i4, int i5) {
        String string = typedArray.getString(i4);
        return string == null ? typedArray.getString(i5) : string;
    }

    public static CharSequence g(TypedArray typedArray, int i4, int i5) {
        CharSequence text = typedArray.getText(i4);
        return text == null ? typedArray.getText(i5) : text;
    }

    public static CharSequence[] h(TypedArray typedArray, int i4, int i5) {
        CharSequence[] textArray = typedArray.getTextArray(i4);
        return textArray == null ? typedArray.getTextArray(i5) : textArray;
    }
}
