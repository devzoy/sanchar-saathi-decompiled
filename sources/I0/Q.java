package i0;

import android.view.ViewGroup;
import androidx.lifecycle.C0380g;
import j0.c;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

public abstract class Q {

    /* renamed from: a  reason: collision with root package name */
    public final C0704z f9926a;

    /* renamed from: b  reason: collision with root package name */
    public final ClassLoader f9927b;

    /* renamed from: c  reason: collision with root package name */
    public ArrayList f9928c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public int f9929d;

    /* renamed from: e  reason: collision with root package name */
    public int f9930e;

    /* renamed from: f  reason: collision with root package name */
    public int f9931f;

    /* renamed from: g  reason: collision with root package name */
    public int f9932g;

    /* renamed from: h  reason: collision with root package name */
    public int f9933h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f9934i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f9935j = true;

    /* renamed from: k  reason: collision with root package name */
    public String f9936k;

    /* renamed from: l  reason: collision with root package name */
    public int f9937l;

    /* renamed from: m  reason: collision with root package name */
    public CharSequence f9938m;

    /* renamed from: n  reason: collision with root package name */
    public int f9939n;

    /* renamed from: o  reason: collision with root package name */
    public CharSequence f9940o;

    /* renamed from: p  reason: collision with root package name */
    public ArrayList f9941p;

    /* renamed from: q  reason: collision with root package name */
    public ArrayList f9942q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f9943r = false;

    /* renamed from: s  reason: collision with root package name */
    public ArrayList f9944s;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public int f9945a;

        /* renamed from: b  reason: collision with root package name */
        public C0695p f9946b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f9947c;

        /* renamed from: d  reason: collision with root package name */
        public int f9948d;

        /* renamed from: e  reason: collision with root package name */
        public int f9949e;

        /* renamed from: f  reason: collision with root package name */
        public int f9950f;

        /* renamed from: g  reason: collision with root package name */
        public int f9951g;

        /* renamed from: h  reason: collision with root package name */
        public C0380g.b f9952h;

        /* renamed from: i  reason: collision with root package name */
        public C0380g.b f9953i;

        public a() {
        }

        public a(int i4, C0695p pVar) {
            this.f9945a = i4;
            this.f9946b = pVar;
            this.f9947c = false;
            C0380g.b bVar = C0380g.b.RESUMED;
            this.f9952h = bVar;
            this.f9953i = bVar;
        }

        public a(int i4, C0695p pVar, boolean z4) {
            this.f9945a = i4;
            this.f9946b = pVar;
            this.f9947c = z4;
            C0380g.b bVar = C0380g.b.RESUMED;
            this.f9952h = bVar;
            this.f9953i = bVar;
        }
    }

    public Q(C0704z zVar, ClassLoader classLoader) {
        this.f9926a = zVar;
        this.f9927b = classLoader;
    }

    public Q b(int i4, C0695p pVar, String str) {
        k(i4, pVar, str, 1);
        return this;
    }

    public Q c(ViewGroup viewGroup, C0695p pVar, String str) {
        pVar.f10143K = viewGroup;
        return b(viewGroup.getId(), pVar, str);
    }

    public Q d(C0695p pVar, String str) {
        k(0, pVar, str, 1);
        return this;
    }

    public void e(a aVar) {
        this.f9928c.add(aVar);
        aVar.f9948d = this.f9929d;
        aVar.f9949e = this.f9930e;
        aVar.f9950f = this.f9931f;
        aVar.f9951g = this.f9932g;
    }

    public abstract int f();

    public abstract int g();

    public abstract void h();

    public abstract void i();

    public Q j() {
        if (!this.f9934i) {
            this.f9935j = false;
            return this;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }

    public void k(int i4, C0695p pVar, String str, int i5) {
        String str2 = pVar.f10153U;
        if (str2 != null) {
            c.f(pVar, str2);
        }
        Class<?> cls = pVar.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = pVar.f10135C;
            if (str3 == null || str.equals(str3)) {
                pVar.f10135C = str;
            } else {
                throw new IllegalStateException("Can't change tag of fragment " + pVar + ": was " + pVar.f10135C + " now " + str);
            }
        }
        if (i4 != 0) {
            if (i4 != -1) {
                int i6 = pVar.f10133A;
                if (i6 == 0 || i6 == i4) {
                    pVar.f10133A = i4;
                    pVar.f10134B = i4;
                } else {
                    throw new IllegalStateException("Can't change container ID of fragment " + pVar + ": was " + pVar.f10133A + " now " + i4);
                }
            } else {
                throw new IllegalArgumentException("Can't add fragment " + pVar + " with tag " + str + " to container view with no id");
            }
        }
        e(new a(i5, pVar));
    }

    public Q l(C0695p pVar) {
        e(new a(3, pVar));
        return this;
    }

    public Q m(int i4, C0695p pVar) {
        return n(i4, pVar, (String) null);
    }

    public Q n(int i4, C0695p pVar, String str) {
        if (i4 != 0) {
            k(i4, pVar, str, 2);
            return this;
        }
        throw new IllegalArgumentException("Must use non-zero containerViewId");
    }

    public Q o(boolean z4) {
        this.f9943r = z4;
        return this;
    }
}
