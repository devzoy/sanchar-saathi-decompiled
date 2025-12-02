package j;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import java.util.WeakHashMap;
import p.V;

/* renamed from: j.a  reason: case insensitive filesystem */
public abstract class C0754a {

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadLocal f10803a = new ThreadLocal();

    /* renamed from: b  reason: collision with root package name */
    public static final WeakHashMap f10804b = new WeakHashMap(0);

    /* renamed from: c  reason: collision with root package name */
    public static final Object f10805c = new Object();

    public static ColorStateList a(Context context, int i4) {
        return context.getColorStateList(i4);
    }

    public static Drawable b(Context context, int i4) {
        return V.g().i(context, i4);
    }
}
