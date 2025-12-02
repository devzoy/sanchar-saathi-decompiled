package i;

import S.C;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import h.j;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import n.d;
import net.sqlcipher.IBulkCursor;
import p.C0828C;
import p.C0836c;
import p.C0838e;
import p.C0839f;
import p.C0840g;
import p.C0843j;
import p.C0845l;
import p.C0847n;
import p.C0848o;
import p.C0851s;
import p.C0852t;
import p.C0854v;
import p.C0857y;
import p.c0;
import p.r;

public class g {

    /* renamed from: b  reason: collision with root package name */
    public static final Class[] f9742b = {Context.class, AttributeSet.class};

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f9743c = {16843375};

    /* renamed from: d  reason: collision with root package name */
    public static final String[] f9744d = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: e  reason: collision with root package name */
    public static final v.g f9745e = new v.g();

    /* renamed from: a  reason: collision with root package name */
    public final Object[] f9746a = new Object[2];

    public static class a implements View.OnClickListener {

        /* renamed from: c  reason: collision with root package name */
        public final View f9747c;

        /* renamed from: d  reason: collision with root package name */
        public final String f9748d;

        /* renamed from: e  reason: collision with root package name */
        public Method f9749e;

        /* renamed from: f  reason: collision with root package name */
        public Context f9750f;

        public a(View view, String str) {
            this.f9747c = view;
            this.f9748d = str;
        }

        public final void a(Context context) {
            String str;
            Method method;
            while (context != null) {
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(this.f9748d, new Class[]{View.class})) != null) {
                        this.f9749e = method;
                        this.f9750f = context;
                        return;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
            int id = this.f9747c.getId();
            if (id == -1) {
                str = "";
            } else {
                str = " with id '" + this.f9747c.getContext().getResources().getResourceEntryName(id) + "'";
            }
            throw new IllegalStateException("Could not find method " + this.f9748d + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + this.f9747c.getClass() + str);
        }

        public void onClick(View view) {
            if (this.f9749e == null) {
                a(this.f9747c.getContext());
            }
            try {
                this.f9749e.invoke(this.f9750f, new Object[]{view});
            } catch (IllegalAccessException e4) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e4);
            } catch (InvocationTargetException e5) {
                throw new IllegalStateException("Could not execute method for android:onClick", e5);
            }
        }
    }

    public static Context t(Context context, AttributeSet attributeSet, boolean z4, boolean z5) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.f9393M3, 0, 0);
        int resourceId = z4 ? obtainStyledAttributes.getResourceId(j.f9398N3, 0) : 0;
        if (z5 && resourceId == 0 && (resourceId = obtainStyledAttributes.getResourceId(j.f9403O3, 0)) != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        obtainStyledAttributes.recycle();
        return resourceId != 0 ? (!(context instanceof d) || ((d) context).c() != resourceId) ? new d(context, resourceId) : context : context;
    }

    public final void a(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if ((context instanceof ContextWrapper) && C.H(view)) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f9743c);
            String string = obtainStyledAttributes.getString(0);
            if (string != null) {
                view.setOnClickListener(new a(view, string));
            }
            obtainStyledAttributes.recycle();
        }
    }

    public C0836c b(Context context, AttributeSet attributeSet) {
        return new C0836c(context, attributeSet);
    }

    public C0838e c(Context context, AttributeSet attributeSet) {
        return new C0838e(context, attributeSet);
    }

    public C0839f d(Context context, AttributeSet attributeSet) {
        return new C0839f(context, attributeSet);
    }

    public C0840g e(Context context, AttributeSet attributeSet) {
        return new C0840g(context, attributeSet);
    }

    public C0843j f(Context context, AttributeSet attributeSet) {
        return new C0843j(context, attributeSet);
    }

    public C0845l g(Context context, AttributeSet attributeSet) {
        return new C0845l(context, attributeSet);
    }

    public C0847n h(Context context, AttributeSet attributeSet) {
        return new C0847n(context, attributeSet);
    }

    public C0848o i(Context context, AttributeSet attributeSet) {
        return new C0848o(context, attributeSet);
    }

    public r j(Context context, AttributeSet attributeSet) {
        return new r(context, attributeSet);
    }

    public C0851s k(Context context, AttributeSet attributeSet) {
        return new C0851s(context, attributeSet);
    }

    public C0852t l(Context context, AttributeSet attributeSet) {
        return new C0852t(context, attributeSet);
    }

    public C0854v m(Context context, AttributeSet attributeSet) {
        return new C0854v(context, attributeSet);
    }

    public C0857y n(Context context, AttributeSet attributeSet) {
        return new C0857y(context, attributeSet);
    }

    public C0828C o(Context context, AttributeSet attributeSet) {
        return new C0828C(context, attributeSet);
    }

    public View p(Context context, String str, AttributeSet attributeSet) {
        return null;
    }

    public final View q(View view, String str, Context context, AttributeSet attributeSet, boolean z4, boolean z5, boolean z6, boolean z7) {
        View view2;
        Context context2 = (!z4 || view == null) ? context : view.getContext();
        if (z5 || z6) {
            context2 = t(context2, attributeSet, z5, z6);
        }
        if (z7) {
            context2 = c0.b(context2);
        }
        str.hashCode();
        char c4 = 65535;
        switch (str.hashCode()) {
            case -1946472170:
                if (str.equals("RatingBar")) {
                    c4 = 0;
                    break;
                }
                break;
            case -1455429095:
                if (str.equals("CheckedTextView")) {
                    c4 = 1;
                    break;
                }
                break;
            case -1346021293:
                if (str.equals("MultiAutoCompleteTextView")) {
                    c4 = 2;
                    break;
                }
                break;
            case -938935918:
                if (str.equals("TextView")) {
                    c4 = 3;
                    break;
                }
                break;
            case -937446323:
                if (str.equals("ImageButton")) {
                    c4 = 4;
                    break;
                }
                break;
            case -658531749:
                if (str.equals("SeekBar")) {
                    c4 = 5;
                    break;
                }
                break;
            case -339785223:
                if (str.equals("Spinner")) {
                    c4 = 6;
                    break;
                }
                break;
            case 776382189:
                if (str.equals("RadioButton")) {
                    c4 = 7;
                    break;
                }
                break;
            case 799298502:
                if (str.equals("ToggleButton")) {
                    c4 = 8;
                    break;
                }
                break;
            case 1125864064:
                if (str.equals("ImageView")) {
                    c4 = 9;
                    break;
                }
                break;
            case 1413872058:
                if (str.equals("AutoCompleteTextView")) {
                    c4 = 10;
                    break;
                }
                break;
            case 1601505219:
                if (str.equals("CheckBox")) {
                    c4 = 11;
                    break;
                }
                break;
            case 1666676343:
                if (str.equals("EditText")) {
                    c4 = 12;
                    break;
                }
                break;
            case 2001146706:
                if (str.equals("Button")) {
                    c4 = 13;
                    break;
                }
                break;
        }
        switch (c4) {
            case 0:
                view2 = k(context2, attributeSet);
                u(view2, str);
                break;
            case 1:
                view2 = e(context2, attributeSet);
                u(view2, str);
                break;
            case 2:
                view2 = i(context2, attributeSet);
                u(view2, str);
                break;
            case 3:
                view2 = n(context2, attributeSet);
                u(view2, str);
                break;
            case 4:
                view2 = g(context2, attributeSet);
                u(view2, str);
                break;
            case 5:
                view2 = l(context2, attributeSet);
                u(view2, str);
                break;
            case 6:
                view2 = m(context2, attributeSet);
                u(view2, str);
                break;
            case 7:
                view2 = j(context2, attributeSet);
                u(view2, str);
                break;
            case 8:
                view2 = o(context2, attributeSet);
                u(view2, str);
                break;
            case IBulkCursor.WANTS_ON_MOVE_TRANSACTION /*9*/:
                view2 = h(context2, attributeSet);
                u(view2, str);
                break;
            case IBulkCursor.GET_EXTRAS_TRANSACTION /*10*/:
                view2 = b(context2, attributeSet);
                u(view2, str);
                break;
            case IBulkCursor.RESPOND_TRANSACTION /*11*/:
                view2 = d(context2, attributeSet);
                u(view2, str);
                break;
            case IBulkCursor.CLOSE_TRANSACTION /*12*/:
                view2 = f(context2, attributeSet);
                u(view2, str);
                break;
            case 13:
                view2 = c(context2, attributeSet);
                u(view2, str);
                break;
            default:
                view2 = p(context2, str, attributeSet);
                break;
        }
        if (view2 == null && context != context2) {
            view2 = s(context2, str, attributeSet);
        }
        if (view2 != null) {
            a(view2, attributeSet);
        }
        return view2;
    }

    public final View r(Context context, String str, String str2) {
        String str3;
        v.g gVar = f9745e;
        Constructor<? extends U> constructor = (Constructor) gVar.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    str3 = str2 + str;
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            constructor = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f9742b);
            gVar.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f9746a);
    }

    public final View s(Context context, String str, AttributeSet attributeSet) {
        if (str.equals("view")) {
            str = attributeSet.getAttributeValue((String) null, "class");
        }
        try {
            Object[] objArr = this.f9746a;
            objArr[0] = context;
            objArr[1] = attributeSet;
            if (-1 == str.indexOf(46)) {
                int i4 = 0;
                while (true) {
                    String[] strArr = f9744d;
                    if (i4 < strArr.length) {
                        View r4 = r(context, str, strArr[i4]);
                        if (r4 != null) {
                            return r4;
                        }
                        i4++;
                    } else {
                        Object[] objArr2 = this.f9746a;
                        objArr2[0] = null;
                        objArr2[1] = null;
                        return null;
                    }
                }
            } else {
                View r5 = r(context, str, (String) null);
                Object[] objArr3 = this.f9746a;
                objArr3[0] = null;
                objArr3[1] = null;
                return r5;
            }
        } catch (Exception unused) {
            return null;
        } finally {
            Object[] objArr4 = this.f9746a;
            objArr4[0] = null;
            objArr4[1] = null;
        }
    }

    public final void u(View view, String str) {
        if (view == null) {
            throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
        }
    }
}
