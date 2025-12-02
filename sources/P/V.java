package p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import l.C0772a;
import org.xmlpull.v1.XmlPullParser;
import v.d;
import v.e;
import v.g;
import v.h;

public final class V {

    /* renamed from: h  reason: collision with root package name */
    public static final PorterDuff.Mode f11454h = PorterDuff.Mode.SRC_IN;

    /* renamed from: i  reason: collision with root package name */
    public static V f11455i;

    /* renamed from: j  reason: collision with root package name */
    public static final a f11456j = new a(6);

    /* renamed from: a  reason: collision with root package name */
    public WeakHashMap f11457a;

    /* renamed from: b  reason: collision with root package name */
    public g f11458b;

    /* renamed from: c  reason: collision with root package name */
    public h f11459c;

    /* renamed from: d  reason: collision with root package name */
    public final WeakHashMap f11460d = new WeakHashMap(0);

    /* renamed from: e  reason: collision with root package name */
    public TypedValue f11461e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f11462f;

    /* renamed from: g  reason: collision with root package name */
    public c f11463g;

    public static class a extends e {
        public a(int i4) {
            super(i4);
        }

        public static int h(int i4, PorterDuff.Mode mode) {
            return ((i4 + 31) * 31) + mode.hashCode();
        }

        public PorterDuffColorFilter i(int i4, PorterDuff.Mode mode) {
            return (PorterDuffColorFilter) c(Integer.valueOf(h(i4, mode)));
        }

        public PorterDuffColorFilter j(int i4, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return (PorterDuffColorFilter) d(Integer.valueOf(h(i4, mode)), porterDuffColorFilter);
        }
    }

    public interface b {
        Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    public interface c {
        boolean a(Context context, int i4, Drawable drawable);

        Drawable b(V v4, Context context, int i4);

        PorterDuff.Mode c(int i4);

        ColorStateList d(Context context, int i4);

        boolean e(Context context, int i4, Drawable drawable);
    }

    public static long d(TypedValue typedValue) {
        return (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
    }

    public static PorterDuffColorFilter f(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return k(colorStateList.getColorForState(iArr, 0), mode);
    }

    public static synchronized V g() {
        V v4;
        synchronized (V.class) {
            try {
                if (f11455i == null) {
                    V v5 = new V();
                    f11455i = v5;
                    o(v5);
                }
                v4 = f11455i;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return v4;
    }

    public static synchronized PorterDuffColorFilter k(int i4, PorterDuff.Mode mode) {
        PorterDuffColorFilter i5;
        synchronized (V.class) {
            a aVar = f11456j;
            i5 = aVar.i(i4, mode);
            if (i5 == null) {
                i5 = new PorterDuffColorFilter(i4, mode);
                aVar.j(i4, mode, i5);
            }
        }
        return i5;
    }

    public static void o(V v4) {
    }

    public static boolean p(Drawable drawable) {
        return (drawable instanceof E0.b) || "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName());
    }

    public static void v(Drawable drawable, d0 d0Var, int[] iArr) {
        if (!K.a(drawable) || drawable.mutate() == drawable) {
            boolean z4 = d0Var.f11530d;
            if (z4 || d0Var.f11529c) {
                drawable.setColorFilter(f(z4 ? d0Var.f11527a : null, d0Var.f11529c ? d0Var.f11528b : f11454h, iArr));
            } else {
                drawable.clearColorFilter();
            }
        } else {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
        }
    }

    public final synchronized boolean a(Context context, long j4, Drawable drawable) {
        try {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState == null) {
                return false;
            }
            d dVar = (d) this.f11460d.get(context);
            if (dVar == null) {
                dVar = new d();
                this.f11460d.put(context, dVar);
            }
            dVar.m(j4, new WeakReference(constantState));
            return true;
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    public final void b(Context context, int i4, ColorStateList colorStateList) {
        if (this.f11457a == null) {
            this.f11457a = new WeakHashMap();
        }
        h hVar = (h) this.f11457a.get(context);
        if (hVar == null) {
            hVar = new h();
            this.f11457a.put(context, hVar);
        }
        hVar.a(i4, colorStateList);
    }

    public final void c(Context context) {
        if (!this.f11462f) {
            this.f11462f = true;
            Drawable i4 = i(context, C0772a.f10982a);
            if (i4 == null || !p(i4)) {
                this.f11462f = false;
                throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
            }
        }
    }

    public final Drawable e(Context context, int i4) {
        if (this.f11461e == null) {
            this.f11461e = new TypedValue();
        }
        TypedValue typedValue = this.f11461e;
        context.getResources().getValue(i4, typedValue, true);
        long d4 = d(typedValue);
        Drawable h4 = h(context, d4);
        if (h4 != null) {
            return h4;
        }
        c cVar = this.f11463g;
        Drawable b4 = cVar == null ? null : cVar.b(this, context, i4);
        if (b4 != null) {
            b4.setChangingConfigurations(typedValue.changingConfigurations);
            a(context, d4, b4);
        }
        return b4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002e, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized android.graphics.drawable.Drawable h(android.content.Context r4, long r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.WeakHashMap r0 = r3.f11460d     // Catch:{ all -> 0x0028 }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x0028 }
            v.d r0 = (v.d) r0     // Catch:{ all -> 0x0028 }
            r1 = 0
            if (r0 != 0) goto L_0x000e
            monitor-exit(r3)
            return r1
        L_0x000e:
            java.lang.Object r2 = r0.g(r5)     // Catch:{ all -> 0x0028 }
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2     // Catch:{ all -> 0x0028 }
            if (r2 == 0) goto L_0x002d
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x0028 }
            android.graphics.drawable.Drawable$ConstantState r2 = (android.graphics.drawable.Drawable.ConstantState) r2     // Catch:{ all -> 0x0028 }
            if (r2 == 0) goto L_0x002a
            android.content.res.Resources r4 = r4.getResources()     // Catch:{ all -> 0x0028 }
            android.graphics.drawable.Drawable r4 = r2.newDrawable(r4)     // Catch:{ all -> 0x0028 }
            monitor-exit(r3)
            return r4
        L_0x0028:
            r4 = move-exception
            goto L_0x002f
        L_0x002a:
            r0.n(r5)     // Catch:{ all -> 0x0028 }
        L_0x002d:
            monitor-exit(r3)
            return r1
        L_0x002f:
            monitor-exit(r3)     // Catch:{ all -> 0x0028 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p.V.h(android.content.Context, long):android.graphics.drawable.Drawable");
    }

    public synchronized Drawable i(Context context, int i4) {
        return j(context, i4, false);
    }

    public synchronized Drawable j(Context context, int i4, boolean z4) {
        Drawable q4;
        try {
            c(context);
            q4 = q(context, i4);
            if (q4 == null) {
                q4 = e(context, i4);
            }
            if (q4 == null) {
                q4 = H.a.d(context, i4);
            }
            if (q4 != null) {
                q4 = u(context, i4, z4, q4);
            }
            if (q4 != null) {
                K.b(q4);
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
        return q4;
    }

    public synchronized ColorStateList l(Context context, int i4) {
        ColorStateList m4;
        m4 = m(context, i4);
        if (m4 == null) {
            c cVar = this.f11463g;
            m4 = cVar == null ? null : cVar.d(context, i4);
            if (m4 != null) {
                b(context, i4, m4);
            }
        }
        return m4;
    }

    public final ColorStateList m(Context context, int i4) {
        h hVar;
        WeakHashMap weakHashMap = this.f11457a;
        if (weakHashMap == null || (hVar = (h) weakHashMap.get(context)) == null) {
            return null;
        }
        return (ColorStateList) hVar.h(i4);
    }

    public PorterDuff.Mode n(int i4) {
        c cVar = this.f11463g;
        if (cVar == null) {
            return null;
        }
        return cVar.c(i4);
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0073 A[Catch:{ Exception -> 0x008f }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x009c A[Catch:{ Exception -> 0x008f }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.drawable.Drawable q(android.content.Context r11, int r12) {
        /*
            r10 = this;
            v.g r0 = r10.f11458b
            r1 = 0
            if (r0 == 0) goto L_0x00b3
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00b3
            v.h r0 = r10.f11459c
            java.lang.String r2 = "appcompat_skip_skip"
            if (r0 == 0) goto L_0x0028
            java.lang.Object r0 = r0.h(r12)
            java.lang.String r0 = (java.lang.String) r0
            boolean r3 = r2.equals(r0)
            if (r3 != 0) goto L_0x0027
            if (r0 == 0) goto L_0x002f
            v.g r3 = r10.f11458b
            java.lang.Object r0 = r3.get(r0)
            if (r0 != 0) goto L_0x002f
        L_0x0027:
            return r1
        L_0x0028:
            v.h r0 = new v.h
            r0.<init>()
            r10.f11459c = r0
        L_0x002f:
            android.util.TypedValue r0 = r10.f11461e
            if (r0 != 0) goto L_0x003a
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r10.f11461e = r0
        L_0x003a:
            android.util.TypedValue r0 = r10.f11461e
            android.content.res.Resources r1 = r11.getResources()
            r3 = 1
            r1.getValue(r12, r0, r3)
            long r4 = d(r0)
            android.graphics.drawable.Drawable r6 = r10.h(r11, r4)
            if (r6 == 0) goto L_0x004f
            return r6
        L_0x004f:
            java.lang.CharSequence r7 = r0.string
            if (r7 == 0) goto L_0x00ab
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = ".xml"
            boolean r7 = r7.endsWith(r8)
            if (r7 == 0) goto L_0x00ab
            android.content.res.XmlResourceParser r1 = r1.getXml(r12)     // Catch:{ Exception -> 0x008f }
            android.util.AttributeSet r7 = android.util.Xml.asAttributeSet(r1)     // Catch:{ Exception -> 0x008f }
        L_0x0067:
            int r8 = r1.next()     // Catch:{ Exception -> 0x008f }
            r9 = 2
            if (r8 == r9) goto L_0x0071
            if (r8 == r3) goto L_0x0071
            goto L_0x0067
        L_0x0071:
            if (r8 != r9) goto L_0x009c
            java.lang.String r3 = r1.getName()     // Catch:{ Exception -> 0x008f }
            v.h r8 = r10.f11459c     // Catch:{ Exception -> 0x008f }
            r8.a(r12, r3)     // Catch:{ Exception -> 0x008f }
            v.g r8 = r10.f11458b     // Catch:{ Exception -> 0x008f }
            java.lang.Object r3 = r8.get(r3)     // Catch:{ Exception -> 0x008f }
            p.V$b r3 = (p.V.b) r3     // Catch:{ Exception -> 0x008f }
            if (r3 == 0) goto L_0x0091
            android.content.res.Resources$Theme r8 = r11.getTheme()     // Catch:{ Exception -> 0x008f }
            android.graphics.drawable.Drawable r6 = r3.a(r11, r1, r7, r8)     // Catch:{ Exception -> 0x008f }
            goto L_0x0091
        L_0x008f:
            r11 = move-exception
            goto L_0x00a4
        L_0x0091:
            if (r6 == 0) goto L_0x00ab
            int r0 = r0.changingConfigurations     // Catch:{ Exception -> 0x008f }
            r6.setChangingConfigurations(r0)     // Catch:{ Exception -> 0x008f }
            r10.a(r11, r4, r6)     // Catch:{ Exception -> 0x008f }
            goto L_0x00ab
        L_0x009c:
            org.xmlpull.v1.XmlPullParserException r11 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ Exception -> 0x008f }
            java.lang.String r0 = "No start tag found"
            r11.<init>(r0)     // Catch:{ Exception -> 0x008f }
            throw r11     // Catch:{ Exception -> 0x008f }
        L_0x00a4:
            java.lang.String r0 = "ResourceManagerInternal"
            java.lang.String r1 = "Exception while inflating drawable"
            android.util.Log.e(r0, r1, r11)
        L_0x00ab:
            if (r6 != 0) goto L_0x00b2
            v.h r11 = r10.f11459c
            r11.a(r12, r2)
        L_0x00b2:
            return r6
        L_0x00b3:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p.V.q(android.content.Context, int):android.graphics.drawable.Drawable");
    }

    public synchronized void r(Context context) {
        d dVar = (d) this.f11460d.get(context);
        if (dVar != null) {
            dVar.a();
        }
    }

    public synchronized Drawable s(Context context, h0 h0Var, int i4) {
        try {
            Drawable q4 = q(context, i4);
            if (q4 == null) {
                q4 = h0Var.c(i4);
            }
            if (q4 == null) {
                return null;
            }
            return u(context, i4, false, q4);
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    public synchronized void t(c cVar) {
        this.f11463g = cVar;
    }

    public final Drawable u(Context context, int i4, boolean z4, Drawable drawable) {
        ColorStateList l4 = l(context, i4);
        if (l4 != null) {
            if (K.a(drawable)) {
                drawable = drawable.mutate();
            }
            Drawable l5 = K.a.l(drawable);
            K.a.i(l5, l4);
            PorterDuff.Mode n4 = n(i4);
            if (n4 == null) {
                return l5;
            }
            K.a.j(l5, n4);
            return l5;
        }
        c cVar = this.f11463g;
        if ((cVar == null || !cVar.e(context, i4, drawable)) && !w(context, i4, drawable) && z4) {
            return null;
        }
        return drawable;
    }

    public boolean w(Context context, int i4, Drawable drawable) {
        c cVar = this.f11463g;
        return cVar != null && cVar.a(context, i4, drawable);
    }
}
