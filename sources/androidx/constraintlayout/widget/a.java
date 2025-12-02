package androidx.constraintlayout.widget;

import C.d;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public String f4792a;

    /* renamed from: b  reason: collision with root package name */
    public b f4793b;

    /* renamed from: c  reason: collision with root package name */
    public int f4794c;

    /* renamed from: d  reason: collision with root package name */
    public float f4795d;

    /* renamed from: e  reason: collision with root package name */
    public String f4796e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f4797f;

    /* renamed from: g  reason: collision with root package name */
    public int f4798g;

    /* renamed from: androidx.constraintlayout.widget.a$a  reason: collision with other inner class name */
    public static /* synthetic */ class C0086a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f4799a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                androidx.constraintlayout.widget.a$b[] r0 = androidx.constraintlayout.widget.a.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f4799a = r0
                androidx.constraintlayout.widget.a$b r1 = androidx.constraintlayout.widget.a.b.COLOR_TYPE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f4799a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.constraintlayout.widget.a$b r1 = androidx.constraintlayout.widget.a.b.COLOR_DRAWABLE_TYPE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f4799a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.constraintlayout.widget.a$b r1 = androidx.constraintlayout.widget.a.b.INT_TYPE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f4799a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.constraintlayout.widget.a$b r1 = androidx.constraintlayout.widget.a.b.FLOAT_TYPE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f4799a     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.constraintlayout.widget.a$b r1 = androidx.constraintlayout.widget.a.b.STRING_TYPE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f4799a     // Catch:{ NoSuchFieldError -> 0x0049 }
                androidx.constraintlayout.widget.a$b r1 = androidx.constraintlayout.widget.a.b.BOOLEAN_TYPE     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f4799a     // Catch:{ NoSuchFieldError -> 0x0054 }
                androidx.constraintlayout.widget.a$b r1 = androidx.constraintlayout.widget.a.b.DIMENSION_TYPE     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.a.C0086a.<clinit>():void");
        }
    }

    public enum b {
        INT_TYPE,
        FLOAT_TYPE,
        COLOR_TYPE,
        COLOR_DRAWABLE_TYPE,
        STRING_TYPE,
        BOOLEAN_TYPE,
        DIMENSION_TYPE
    }

    public a(String str, b bVar, Object obj) {
        this.f4792a = str;
        this.f4793b = bVar;
        d(obj);
    }

    public static HashMap a(HashMap hashMap, View view) {
        HashMap hashMap2 = new HashMap();
        Class<?> cls = view.getClass();
        for (String str : hashMap.keySet()) {
            a aVar = (a) hashMap.get(str);
            try {
                if (str.equals("BackgroundColor")) {
                    hashMap2.put(str, new a(aVar, Integer.valueOf(((ColorDrawable) view.getBackground()).getColor())));
                } else {
                    hashMap2.put(str, new a(aVar, cls.getMethod("getMap" + str, (Class[]) null).invoke(view, (Object[]) null)));
                }
            } catch (NoSuchMethodException e4) {
                e4.printStackTrace();
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
            } catch (InvocationTargetException e6) {
                e6.printStackTrace();
            }
        }
        return hashMap2;
    }

    public static void b(Context context, XmlPullParser xmlPullParser, HashMap hashMap) {
        b bVar;
        Object string;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), d.f461n2);
        int indexCount = obtainStyledAttributes.getIndexCount();
        String str = null;
        Object obj = null;
        b bVar2 = null;
        for (int i4 = 0; i4 < indexCount; i4++) {
            int index = obtainStyledAttributes.getIndex(i4);
            if (index == d.f466o2) {
                str = obtainStyledAttributes.getString(index);
                if (str != null && str.length() > 0) {
                    str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
                }
            } else if (index == d.f471p2) {
                obj = Boolean.valueOf(obtainStyledAttributes.getBoolean(index, false));
                bVar2 = b.BOOLEAN_TYPE;
            } else {
                if (index == d.f481r2) {
                    bVar = b.COLOR_TYPE;
                    string = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                } else if (index == d.f476q2) {
                    bVar = b.COLOR_DRAWABLE_TYPE;
                    string = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                } else if (index == d.f501v2) {
                    bVar = b.DIMENSION_TYPE;
                    string = Float.valueOf(TypedValue.applyDimension(1, obtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                } else if (index == d.f486s2) {
                    bVar = b.DIMENSION_TYPE;
                    string = Float.valueOf(obtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == d.f491t2) {
                    bVar = b.FLOAT_TYPE;
                    string = Float.valueOf(obtainStyledAttributes.getFloat(index, Float.NaN));
                } else if (index == d.f496u2) {
                    bVar = b.INT_TYPE;
                    string = Integer.valueOf(obtainStyledAttributes.getInteger(index, -1));
                } else if (index == d.f506w2) {
                    bVar = b.STRING_TYPE;
                    string = obtainStyledAttributes.getString(index);
                }
                Object obj2 = string;
                bVar2 = bVar;
                obj = obj2;
            }
        }
        if (!(str == null || obj == null)) {
            hashMap.put(str, new a(str, bVar2, obj));
        }
        obtainStyledAttributes.recycle();
    }

    public static void c(View view, HashMap hashMap) {
        Class<?> cls = view.getClass();
        for (String str : hashMap.keySet()) {
            a aVar = (a) hashMap.get(str);
            String str2 = "set" + str;
            try {
                switch (C0086a.f4799a[aVar.f4793b.ordinal()]) {
                    case 1:
                        cls.getMethod(str2, new Class[]{Integer.TYPE}).invoke(view, new Object[]{Integer.valueOf(aVar.f4798g)});
                        break;
                    case 2:
                        Method method = cls.getMethod(str2, new Class[]{Drawable.class});
                        ColorDrawable colorDrawable = new ColorDrawable();
                        colorDrawable.setColor(aVar.f4798g);
                        method.invoke(view, new Object[]{colorDrawable});
                        break;
                    case 3:
                        cls.getMethod(str2, new Class[]{Integer.TYPE}).invoke(view, new Object[]{Integer.valueOf(aVar.f4794c)});
                        break;
                    case 4:
                        cls.getMethod(str2, new Class[]{Float.TYPE}).invoke(view, new Object[]{Float.valueOf(aVar.f4795d)});
                        break;
                    case 5:
                        cls.getMethod(str2, new Class[]{CharSequence.class}).invoke(view, new Object[]{aVar.f4796e});
                        break;
                    case 6:
                        cls.getMethod(str2, new Class[]{Boolean.TYPE}).invoke(view, new Object[]{Boolean.valueOf(aVar.f4797f)});
                        break;
                    case 7:
                        cls.getMethod(str2, new Class[]{Float.TYPE}).invoke(view, new Object[]{Float.valueOf(aVar.f4795d)});
                        break;
                }
            } catch (NoSuchMethodException e4) {
                Log.e("TransitionLayout", e4.getMessage());
                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName());
                StringBuilder sb = new StringBuilder();
                sb.append(cls.getName());
                sb.append(" must have a method ");
                sb.append(str2);
                Log.e("TransitionLayout", sb.toString());
            } catch (IllegalAccessException e5) {
                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName());
                e5.printStackTrace();
            } catch (InvocationTargetException e6) {
                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName());
                e6.printStackTrace();
            }
        }
    }

    public void d(Object obj) {
        switch (C0086a.f4799a[this.f4793b.ordinal()]) {
            case 1:
            case 2:
                this.f4798g = ((Integer) obj).intValue();
                return;
            case 3:
                this.f4794c = ((Integer) obj).intValue();
                return;
            case 4:
                this.f4795d = ((Float) obj).floatValue();
                return;
            case 5:
                this.f4796e = (String) obj;
                return;
            case 6:
                this.f4797f = ((Boolean) obj).booleanValue();
                return;
            case 7:
                this.f4795d = ((Float) obj).floatValue();
                return;
            default:
                return;
        }
    }

    public a(a aVar, Object obj) {
        this.f4792a = aVar.f4792a;
        this.f4793b = aVar.f4793b;
        d(obj);
    }
}
