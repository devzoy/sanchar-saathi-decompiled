package n;

import S.C0311b;
import S.C0323n;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import h.j;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import o.C0810c;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p.K;
import p.f0;

public class g extends MenuInflater {

    /* renamed from: e  reason: collision with root package name */
    public static final Class[] f11174e;

    /* renamed from: f  reason: collision with root package name */
    public static final Class[] f11175f;

    /* renamed from: a  reason: collision with root package name */
    public final Object[] f11176a;

    /* renamed from: b  reason: collision with root package name */
    public final Object[] f11177b;

    /* renamed from: c  reason: collision with root package name */
    public Context f11178c;

    /* renamed from: d  reason: collision with root package name */
    public Object f11179d;

    public static class a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: c  reason: collision with root package name */
        public static final Class[] f11180c = {MenuItem.class};

        /* renamed from: a  reason: collision with root package name */
        public Object f11181a;

        /* renamed from: b  reason: collision with root package name */
        public Method f11182b;

        public a(Object obj, String str) {
            this.f11181a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f11182b = cls.getMethod(str, f11180c);
            } catch (Exception e4) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e4);
                throw inflateException;
            }
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f11182b.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f11182b.invoke(this.f11181a, new Object[]{menuItem})).booleanValue();
                }
                this.f11182b.invoke(this.f11181a, new Object[]{menuItem});
                return true;
            } catch (Exception e4) {
                throw new RuntimeException(e4);
            }
        }
    }

    public class b {

        /* renamed from: A  reason: collision with root package name */
        public C0311b f11183A;

        /* renamed from: B  reason: collision with root package name */
        public CharSequence f11184B;

        /* renamed from: C  reason: collision with root package name */
        public CharSequence f11185C;

        /* renamed from: D  reason: collision with root package name */
        public ColorStateList f11186D = null;

        /* renamed from: E  reason: collision with root package name */
        public PorterDuff.Mode f11187E = null;

        /* renamed from: a  reason: collision with root package name */
        public Menu f11189a;

        /* renamed from: b  reason: collision with root package name */
        public int f11190b;

        /* renamed from: c  reason: collision with root package name */
        public int f11191c;

        /* renamed from: d  reason: collision with root package name */
        public int f11192d;

        /* renamed from: e  reason: collision with root package name */
        public int f11193e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f11194f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f11195g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f11196h;

        /* renamed from: i  reason: collision with root package name */
        public int f11197i;

        /* renamed from: j  reason: collision with root package name */
        public int f11198j;

        /* renamed from: k  reason: collision with root package name */
        public CharSequence f11199k;

        /* renamed from: l  reason: collision with root package name */
        public CharSequence f11200l;

        /* renamed from: m  reason: collision with root package name */
        public int f11201m;

        /* renamed from: n  reason: collision with root package name */
        public char f11202n;

        /* renamed from: o  reason: collision with root package name */
        public int f11203o;

        /* renamed from: p  reason: collision with root package name */
        public char f11204p;

        /* renamed from: q  reason: collision with root package name */
        public int f11205q;

        /* renamed from: r  reason: collision with root package name */
        public int f11206r;

        /* renamed from: s  reason: collision with root package name */
        public boolean f11207s;

        /* renamed from: t  reason: collision with root package name */
        public boolean f11208t;

        /* renamed from: u  reason: collision with root package name */
        public boolean f11209u;

        /* renamed from: v  reason: collision with root package name */
        public int f11210v;

        /* renamed from: w  reason: collision with root package name */
        public int f11211w;

        /* renamed from: x  reason: collision with root package name */
        public String f11212x;

        /* renamed from: y  reason: collision with root package name */
        public String f11213y;

        /* renamed from: z  reason: collision with root package name */
        public String f11214z;

        public b(Menu menu) {
            this.f11189a = menu;
            h();
        }

        public void a() {
            this.f11196h = true;
            i(this.f11189a.add(this.f11190b, this.f11197i, this.f11198j, this.f11199k));
        }

        public SubMenu b() {
            this.f11196h = true;
            SubMenu addSubMenu = this.f11189a.addSubMenu(this.f11190b, this.f11197i, this.f11198j, this.f11199k);
            i(addSubMenu.getItem());
            return addSubMenu;
        }

        public final char c(String str) {
            if (str == null) {
                return 0;
            }
            return str.charAt(0);
        }

        public boolean d() {
            return this.f11196h;
        }

        public final Object e(String str, Class[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, g.this.f11178c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return constructor.newInstance(objArr);
            } catch (Exception e4) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e4);
                return null;
            }
        }

        public void f(AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = g.this.f11178c.obtainStyledAttributes(attributeSet, j.f9537r1);
            this.f11190b = obtainStyledAttributes.getResourceId(j.f9547t1, 0);
            this.f11191c = obtainStyledAttributes.getInt(j.f9557v1, 0);
            this.f11192d = obtainStyledAttributes.getInt(j.f9562w1, 0);
            this.f11193e = obtainStyledAttributes.getInt(j.f9567x1, 0);
            this.f11194f = obtainStyledAttributes.getBoolean(j.f9552u1, true);
            this.f11195g = obtainStyledAttributes.getBoolean(j.f9542s1, true);
            obtainStyledAttributes.recycle();
        }

        public void g(AttributeSet attributeSet) {
            f0 u4 = f0.u(g.this.f11178c, attributeSet, j.f9572y1);
            this.f11197i = u4.n(j.f9336B1, 0);
            this.f11198j = (u4.k(j.f9351E1, this.f11191c) & -65536) | (u4.k(j.f9356F1, this.f11192d) & 65535);
            this.f11199k = u4.p(j.f9361G1);
            this.f11200l = u4.p(j.f9366H1);
            this.f11201m = u4.n(j.f9577z1, 0);
            this.f11202n = c(u4.o(j.f9371I1));
            this.f11203o = u4.k(j.f9406P1, 4096);
            this.f11204p = c(u4.o(j.f9376J1));
            this.f11205q = u4.k(j.f9424T1, 4096);
            if (u4.s(j.f9381K1)) {
                this.f11206r = u4.a(j.f9381K1, false) ? 1 : 0;
            } else {
                this.f11206r = this.f11193e;
            }
            this.f11207s = u4.a(j.f9341C1, false);
            this.f11208t = u4.a(j.f9346D1, this.f11194f);
            this.f11209u = u4.a(j.f9331A1, this.f11195g);
            this.f11210v = u4.k(j.f9428U1, -1);
            this.f11214z = u4.o(j.f9386L1);
            this.f11211w = u4.n(j.f9391M1, 0);
            this.f11212x = u4.o(j.f9401O1);
            String o4 = u4.o(j.f9396N1);
            this.f11213y = o4;
            boolean z4 = o4 != null;
            if (z4 && this.f11211w == 0 && this.f11212x == null) {
                this.f11183A = (C0311b) e(o4, g.f11175f, g.this.f11177b);
            } else {
                if (z4) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.f11183A = null;
            }
            this.f11184B = u4.p(j.f9411Q1);
            this.f11185C = u4.p(j.f9432V1);
            if (u4.s(j.f9420S1)) {
                this.f11187E = K.d(u4.k(j.f9420S1, -1), this.f11187E);
            } else {
                this.f11187E = null;
            }
            if (u4.s(j.f9416R1)) {
                this.f11186D = u4.c(j.f9416R1);
            } else {
                this.f11186D = null;
            }
            u4.w();
            this.f11196h = false;
        }

        public void h() {
            this.f11190b = 0;
            this.f11191c = 0;
            this.f11192d = 0;
            this.f11193e = 0;
            this.f11194f = true;
            this.f11195g = true;
        }

        public final void i(MenuItem menuItem) {
            boolean z4 = false;
            menuItem.setChecked(this.f11207s).setVisible(this.f11208t).setEnabled(this.f11209u).setCheckable(this.f11206r >= 1).setTitleCondensed(this.f11200l).setIcon(this.f11201m);
            int i4 = this.f11210v;
            if (i4 >= 0) {
                menuItem.setShowAsAction(i4);
            }
            if (this.f11214z != null) {
                if (!g.this.f11178c.isRestricted()) {
                    menuItem.setOnMenuItemClickListener(new a(g.this.b(), this.f11214z));
                } else {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
            }
            if (this.f11206r >= 2) {
                if (menuItem instanceof androidx.appcompat.view.menu.g) {
                    ((androidx.appcompat.view.menu.g) menuItem).t(true);
                } else if (menuItem instanceof C0810c) {
                    ((C0810c) menuItem).h(true);
                }
            }
            String str = this.f11212x;
            if (str != null) {
                menuItem.setActionView((View) e(str, g.f11174e, g.this.f11176a));
                z4 = true;
            }
            int i5 = this.f11211w;
            if (i5 > 0) {
                if (!z4) {
                    menuItem.setActionView(i5);
                } else {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                }
            }
            C0311b bVar = this.f11183A;
            if (bVar != null) {
                C0323n.a(menuItem, bVar);
            }
            C0323n.c(menuItem, this.f11184B);
            C0323n.g(menuItem, this.f11185C);
            C0323n.b(menuItem, this.f11202n, this.f11203o);
            C0323n.f(menuItem, this.f11204p, this.f11205q);
            PorterDuff.Mode mode = this.f11187E;
            if (mode != null) {
                C0323n.e(menuItem, mode);
            }
            ColorStateList colorStateList = this.f11186D;
            if (colorStateList != null) {
                C0323n.d(menuItem, colorStateList);
            }
        }
    }

    static {
        Class[] clsArr = {Context.class};
        f11174e = clsArr;
        f11175f = clsArr;
    }

    public g(Context context) {
        super(context);
        this.f11178c = context;
        Object[] objArr = {context};
        this.f11176a = objArr;
        this.f11177b = objArr;
    }

    public final Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    public Object b() {
        if (this.f11179d == null) {
            this.f11179d = a(this.f11178c);
        }
        return this.f11179d;
    }

    public final void c(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) {
        b bVar = new b(menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType != 2) {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            } else {
                String name = xmlPullParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlPullParser.next();
                } else {
                    throw new RuntimeException("Expecting menu, got " + name);
                }
            }
        }
        boolean z4 = false;
        boolean z5 = false;
        String str = null;
        while (!z4) {
            if (eventType != 1) {
                if (eventType != 2) {
                    if (eventType == 3) {
                        String name2 = xmlPullParser.getName();
                        if (z5 && name2.equals(str)) {
                            z5 = false;
                            str = null;
                        } else if (name2.equals("group")) {
                            bVar.h();
                        } else if (name2.equals("item")) {
                            if (!bVar.d()) {
                                C0311b bVar2 = bVar.f11183A;
                                if (bVar2 == null || !bVar2.a()) {
                                    bVar.a();
                                } else {
                                    bVar.b();
                                }
                            }
                        } else if (name2.equals("menu")) {
                            z4 = true;
                        }
                    }
                } else if (!z5) {
                    String name3 = xmlPullParser.getName();
                    if (name3.equals("group")) {
                        bVar.f(attributeSet);
                    } else if (name3.equals("item")) {
                        bVar.g(attributeSet);
                    } else if (name3.equals("menu")) {
                        c(xmlPullParser, attributeSet, bVar.b());
                    } else {
                        str = name3;
                        z5 = true;
                    }
                }
                eventType = xmlPullParser.next();
            } else {
                throw new RuntimeException("Unexpected end of document");
            }
        }
    }

    public void inflate(int i4, Menu menu) {
        if (!(menu instanceof L.a)) {
            super.inflate(i4, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            xmlResourceParser = this.f11178c.getResources().getLayout(i4);
            c(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        } catch (XmlPullParserException e4) {
            throw new InflateException("Error inflating menu XML", e4);
        } catch (IOException e5) {
            throw new InflateException("Error inflating menu XML", e5);
        } catch (Throwable th) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
