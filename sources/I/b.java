package I;

import R.g;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.TypedValue;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadLocal f1492a = new ThreadLocal();

    /* renamed from: b  reason: collision with root package name */
    public static final WeakHashMap f1493b = new WeakHashMap(0);

    /* renamed from: c  reason: collision with root package name */
    public static final Object f1494c = new Object();

    public static class a {
        public static Drawable a(Resources resources, int i4, Resources.Theme theme) {
            return resources.getDrawable(i4, theme);
        }

        public static Drawable b(Resources resources, int i4, int i5, Resources.Theme theme) {
            return resources.getDrawableForDensity(i4, i5, theme);
        }
    }

    /* renamed from: I.b$b  reason: collision with other inner class name */
    public static abstract class C0023b {
        public static Handler e(Handler handler) {
            return handler == null ? new Handler(Looper.getMainLooper()) : handler;
        }

        public final void c(int i4, Handler handler) {
            e(handler).post(new d(this, i4));
        }

        public final void d(Typeface typeface, Handler handler) {
            e(handler).post(new c(this, typeface));
        }

        /* renamed from: h */
        public abstract void f(int i4);

        /* renamed from: i */
        public abstract void g(Typeface typeface);
    }

    public static final class c {

        public static class a {

            /* renamed from: a  reason: collision with root package name */
            public static final Object f1495a = new Object();

            /* renamed from: b  reason: collision with root package name */
            public static Method f1496b;

            /* renamed from: c  reason: collision with root package name */
            public static boolean f1497c;

            public static void a(Resources.Theme theme) {
                synchronized (f1495a) {
                    if (!f1497c) {
                        try {
                            Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", (Class[]) null);
                            f1496b = declaredMethod;
                            declaredMethod.setAccessible(true);
                        } catch (NoSuchMethodException e4) {
                            Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e4);
                        }
                        f1497c = true;
                    }
                    Method method = f1496b;
                    if (method != null) {
                        try {
                            method.invoke(theme, (Object[]) null);
                        } catch (IllegalAccessException | InvocationTargetException e5) {
                            Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e5);
                            f1496b = null;
                        }
                    }
                }
            }
        }

        /* renamed from: I.b$c$b  reason: collision with other inner class name */
        public static class C0024b {
            public static void a(Resources.Theme theme) {
                theme.rebase();
            }
        }

        public static void a(Resources.Theme theme) {
            if (Build.VERSION.SDK_INT >= 29) {
                C0024b.a(theme);
            } else {
                a.a(theme);
            }
        }
    }

    public static Drawable a(Resources resources, int i4, Resources.Theme theme) {
        return a.a(resources, i4, theme);
    }

    public static Typeface b(Context context, int i4) {
        if (context.isRestricted()) {
            return null;
        }
        return e(context, i4, new TypedValue(), 0, (C0023b) null, (Handler) null, false, false);
    }

    public static Typeface c(Context context, int i4, TypedValue typedValue, int i5, C0023b bVar) {
        if (context.isRestricted()) {
            return null;
        }
        return e(context, i4, typedValue, i5, bVar, (Handler) null, true, false);
    }

    public static void d(Context context, int i4, C0023b bVar, Handler handler) {
        g.c(bVar);
        if (context.isRestricted()) {
            bVar.c(-4, handler);
            return;
        }
        e(context, i4, new TypedValue(), 0, bVar, handler, false, false);
    }

    public static Typeface e(Context context, int i4, TypedValue typedValue, int i5, C0023b bVar, Handler handler, boolean z4, boolean z5) {
        Resources resources = context.getResources();
        int i6 = i4;
        resources.getValue(i4, typedValue, true);
        Typeface f4 = f(context, resources, typedValue, i4, i5, bVar, handler, z4, z5);
        if (f4 != null || bVar != null || z5) {
            return f4;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i4) + " could not be retrieved.");
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Typeface f(android.content.Context r16, android.content.res.Resources r17, android.util.TypedValue r18, int r19, int r20, I.b.C0023b r21, android.os.Handler r22, boolean r23, boolean r24) {
        /*
            r0 = r17
            r1 = r18
            r4 = r19
            r11 = r21
            r12 = r22
            java.lang.String r13 = "ResourcesCompat"
            java.lang.CharSequence r2 = r1.string
            if (r2 == 0) goto L_0x00c6
            java.lang.String r14 = r2.toString()
            java.lang.String r2 = "res/"
            boolean r2 = r14.startsWith(r2)
            r15 = 0
            r10 = -3
            if (r2 != 0) goto L_0x0024
            if (r11 == 0) goto L_0x0023
            r11.c(r10, r12)
        L_0x0023:
            return r15
        L_0x0024:
            int r2 = r1.assetCookie
            r7 = r20
            android.graphics.Typeface r2 = J.c.f(r0, r4, r14, r2, r7)
            if (r2 == 0) goto L_0x0034
            if (r11 == 0) goto L_0x0033
            r11.d(r2, r12)
        L_0x0033:
            return r2
        L_0x0034:
            if (r24 == 0) goto L_0x0037
            return r15
        L_0x0037:
            java.lang.String r2 = r14.toLowerCase()     // Catch:{ XmlPullParserException -> 0x005b, IOException -> 0x0058 }
            java.lang.String r3 = ".xml"
            boolean r2 = r2.endsWith(r3)     // Catch:{ XmlPullParserException -> 0x005b, IOException -> 0x0058 }
            if (r2 == 0) goto L_0x007a
            android.content.res.XmlResourceParser r2 = r0.getXml(r4)     // Catch:{ XmlPullParserException -> 0x005b, IOException -> 0x0058 }
            I.a$b r2 = I.a.b(r2, r0)     // Catch:{ XmlPullParserException -> 0x005b, IOException -> 0x0058 }
            if (r2 != 0) goto L_0x005f
            java.lang.String r0 = "Failed to find font-family tag"
            android.util.Log.e(r13, r0)     // Catch:{ XmlPullParserException -> 0x005b, IOException -> 0x0058 }
            if (r11 == 0) goto L_0x005e
            r11.c(r10, r12)     // Catch:{ XmlPullParserException -> 0x005b, IOException -> 0x0058 }
            goto L_0x005e
        L_0x0058:
            r0 = move-exception
            r15 = r10
            goto L_0x0096
        L_0x005b:
            r0 = move-exception
            r15 = r10
            goto L_0x00ab
        L_0x005e:
            return r15
        L_0x005f:
            int r6 = r1.assetCookie     // Catch:{ XmlPullParserException -> 0x005b, IOException -> 0x0058 }
            r1 = r16
            r3 = r17
            r4 = r19
            r5 = r14
            r7 = r20
            r8 = r21
            r9 = r22
            r15 = r10
            r10 = r23
            android.graphics.Typeface r0 = J.c.c(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ XmlPullParserException -> 0x0078, IOException -> 0x0076 }
            return r0
        L_0x0076:
            r0 = move-exception
            goto L_0x0096
        L_0x0078:
            r0 = move-exception
            goto L_0x00ab
        L_0x007a:
            r15 = r10
            int r5 = r1.assetCookie     // Catch:{ XmlPullParserException -> 0x0078, IOException -> 0x0076 }
            r1 = r16
            r2 = r17
            r3 = r19
            r4 = r14
            r6 = r20
            android.graphics.Typeface r0 = J.c.d(r1, r2, r3, r4, r5, r6)     // Catch:{ XmlPullParserException -> 0x0078, IOException -> 0x0076 }
            if (r11 == 0) goto L_0x0095
            if (r0 == 0) goto L_0x0092
            r11.d(r0, r12)     // Catch:{ XmlPullParserException -> 0x0078, IOException -> 0x0076 }
            goto L_0x0095
        L_0x0092:
            r11.c(r15, r12)     // Catch:{ XmlPullParserException -> 0x0078, IOException -> 0x0076 }
        L_0x0095:
            return r0
        L_0x0096:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to read xml resource "
            r1.append(r2)
            r1.append(r14)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r13, r1, r0)
            goto L_0x00bf
        L_0x00ab:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to parse xml resource "
            r1.append(r2)
            r1.append(r14)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r13, r1, r0)
        L_0x00bf:
            if (r11 == 0) goto L_0x00c4
            r11.c(r15, r12)
        L_0x00c4:
            r1 = 0
            return r1
        L_0x00c6:
            android.content.res.Resources$NotFoundException r2 = new android.content.res.Resources$NotFoundException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "Resource \""
            r3.append(r5)
            java.lang.String r0 = r0.getResourceName(r4)
            r3.append(r0)
            java.lang.String r0 = "\" ("
            r3.append(r0)
            java.lang.String r0 = java.lang.Integer.toHexString(r19)
            r3.append(r0)
            java.lang.String r0 = ") is not a Font: "
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: I.b.f(android.content.Context, android.content.res.Resources, android.util.TypedValue, int, int, I.b$b, android.os.Handler, boolean, boolean):android.graphics.Typeface");
    }
}
