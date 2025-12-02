package K0;

import H0.b;
import O0.a;
import O0.g;
import O0.h;
import S.O;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.inputmethodservice.InputMethodService;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.WindowManager;
import i3.C0738o;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import v3.l;

public final class m implements l {

    /* renamed from: b  reason: collision with root package name */
    public static final m f1677b = new m();

    /* renamed from: c  reason: collision with root package name */
    public static final String f1678c;

    /* renamed from: d  reason: collision with root package name */
    public static final ArrayList f1679d = C0738o.f(Integer.valueOf(O.m.g()), Integer.valueOf(O.m.f()), Integer.valueOf(O.m.a()), Integer.valueOf(O.m.c()), Integer.valueOf(O.m.h()), Integer.valueOf(O.m.e()), Integer.valueOf(O.m.i()), Integer.valueOf(O.m.b()));

    static {
        String simpleName = m.class.getSimpleName();
        l.d(simpleName, "WindowMetricsCalculatorC…at::class.java.simpleName");
        f1678c = simpleName;
    }

    public k a(Activity activity) {
        l.e(activity, "activity");
        return e(activity);
    }

    public k c(Activity activity) {
        O o4;
        l.e(activity, "activity");
        int i4 = Build.VERSION.SDK_INT;
        Rect a4 = i4 >= 30 ? g.f2026a.a(activity) : i4 >= 29 ? g(activity) : f(activity);
        if (i4 >= 30) {
            o4 = h(activity);
        } else {
            o4 = new O.b().a();
            l.d(o4, "{\n            WindowInse…ilder().build()\n        }");
        }
        return new k(new b(a4), o4);
    }

    public k d(Context context) {
        l.e(context, "context");
        if (Build.VERSION.SDK_INT >= 30) {
            return g.f2026a.c(context);
        }
        Context a4 = O0.b.f2025a.a(context);
        if (a4 instanceof Activity) {
            return c((Activity) a4);
        }
        if (a4 instanceof InputMethodService) {
            Object systemService = context.getSystemService("window");
            l.c(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
            l.d(defaultDisplay, "wm.defaultDisplay");
            Point k4 = k(defaultDisplay);
            return new k(new Rect(0, 0, k4.x, k4.y), (O) null, 2, (v3.g) null);
        }
        throw new IllegalArgumentException(context + " is not a UiContext");
    }

    public k e(Context context) {
        Rect rect;
        O o4;
        l.e(context, "context");
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 30) {
            rect = g.f2026a.d(context);
        } else {
            Object systemService = context.getSystemService("window");
            l.c(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
            l.d(defaultDisplay, "display");
            Point k4 = k(defaultDisplay);
            rect = new Rect(0, 0, k4.x, k4.y);
        }
        if (i4 >= 30) {
            o4 = h(context);
        } else {
            o4 = new O.b().a();
            l.d(o4, "{\n            WindowInse…ilder().build()\n        }");
        }
        return new k(new b(rect), o4);
    }

    public final Rect f(Activity activity) {
        l.e(activity, "activity");
        Rect rect = new Rect();
        Configuration configuration = activity.getResources().getConfiguration();
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            if (a.f2024a.a(activity)) {
                Object invoke = obj.getClass().getDeclaredMethod("getBounds", (Class[]) null).invoke(obj, (Object[]) null);
                l.c(invoke, "null cannot be cast to non-null type android.graphics.Rect");
                rect.set((Rect) invoke);
            } else {
                Object invoke2 = obj.getClass().getDeclaredMethod("getAppBounds", (Class[]) null).invoke(obj, (Object[]) null);
                l.c(invoke2, "null cannot be cast to non-null type android.graphics.Rect");
                rect.set((Rect) invoke2);
            }
        } catch (NoSuchFieldException e4) {
            Log.w(f1678c, e4);
            l(activity, rect);
        } catch (NoSuchMethodException e5) {
            Log.w(f1678c, e5);
            l(activity, rect);
        } catch (IllegalAccessException e6) {
            Log.w(f1678c, e6);
            l(activity, rect);
        } catch (InvocationTargetException e7) {
            Log.w(f1678c, e7);
            l(activity, rect);
        }
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        a aVar = a.f2024a;
        if (!aVar.a(activity)) {
            int j4 = j(activity);
            int i4 = rect.bottom;
            if (i4 + j4 == point.y) {
                rect.bottom = i4 + j4;
            } else {
                int i5 = rect.right;
                if (i5 + j4 == point.x) {
                    rect.right = i5 + j4;
                } else if (rect.left == j4) {
                    rect.left = 0;
                }
            }
        }
        if ((rect.width() < point.x || rect.height() < point.y) && !aVar.a(activity)) {
            l.d(defaultDisplay, "currentDisplay");
            DisplayCutout i6 = i(defaultDisplay);
            if (i6 != null) {
                int i7 = rect.left;
                h hVar = h.f2027a;
                if (i7 == hVar.b(i6)) {
                    rect.left = 0;
                }
                if (point.x - rect.right == hVar.c(i6)) {
                    rect.right += hVar.c(i6);
                }
                if (rect.top == hVar.d(i6)) {
                    rect.top = 0;
                }
                if (point.y - rect.bottom == hVar.a(i6)) {
                    rect.bottom += hVar.a(i6);
                }
            }
        }
        return rect;
    }

    public final Rect g(Activity activity) {
        l.e(activity, "activity");
        Configuration configuration = activity.getResources().getConfiguration();
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            Object invoke = obj.getClass().getDeclaredMethod("getBounds", (Class[]) null).invoke(obj, (Object[]) null);
            l.c(invoke, "null cannot be cast to non-null type android.graphics.Rect");
            return new Rect((Rect) invoke);
        } catch (NoSuchFieldException e4) {
            Log.w(f1678c, e4);
            return f(activity);
        } catch (NoSuchMethodException e5) {
            Log.w(f1678c, e5);
            return f(activity);
        } catch (IllegalAccessException e6) {
            Log.w(f1678c, e6);
            return f(activity);
        } catch (InvocationTargetException e7) {
            Log.w(f1678c, e7);
            return f(activity);
        }
    }

    public final O h(Context context) {
        l.e(context, "context");
        if (Build.VERSION.SDK_INT >= 30) {
            return g.f2026a.b(context);
        }
        throw new Exception("Incompatible SDK version");
    }

    public final DisplayCutout i(Display display) {
        try {
            Constructor<?> constructor = Class.forName("android.view.DisplayInfo").getConstructor((Class[]) null);
            constructor.setAccessible(true);
            Object newInstance = constructor.newInstance((Object[]) null);
            Method declaredMethod = display.getClass().getDeclaredMethod("getDisplayInfo", new Class[]{newInstance.getClass()});
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(display, new Object[]{newInstance});
            Field declaredField = newInstance.getClass().getDeclaredField("displayCutout");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(newInstance);
            if (obj instanceof DisplayCutout) {
                return (DisplayCutout) obj;
            }
            return null;
        } catch (ClassNotFoundException e4) {
            Log.w(f1678c, e4);
            return null;
        } catch (NoSuchMethodException e5) {
            Log.w(f1678c, e5);
            return null;
        } catch (NoSuchFieldException e6) {
            Log.w(f1678c, e6);
            return null;
        } catch (IllegalAccessException e7) {
            Log.w(f1678c, e7);
            return null;
        } catch (InvocationTargetException e8) {
            Log.w(f1678c, e8);
            return null;
        } catch (InstantiationException e9) {
            Log.w(f1678c, e9);
            return null;
        }
    }

    public final int j(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public final Point k(Display display) {
        l.e(display, "display");
        Point point = new Point();
        display.getRealSize(point);
        return point;
    }

    public final void l(Activity activity, Rect rect) {
        activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
    }
}
