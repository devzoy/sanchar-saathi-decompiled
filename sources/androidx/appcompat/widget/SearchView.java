package androidx.appcompat.widget;

import S.C;
import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import h.C0645a;
import h.C0648d;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import net.sqlcipher.database.SQLiteDatabase;
import p.C0836c;
import p.a0;
import p.f0;
import p.g0;
import p.i0;

public class SearchView extends b implements n.c {

    /* renamed from: p0  reason: collision with root package name */
    public static final n f4452p0 = (Build.VERSION.SDK_INT < 29 ? new n() : null);

    /* renamed from: A  reason: collision with root package name */
    public p f4453A;

    /* renamed from: B  reason: collision with root package name */
    public Rect f4454B;

    /* renamed from: C  reason: collision with root package name */
    public Rect f4455C;

    /* renamed from: D  reason: collision with root package name */
    public int[] f4456D;

    /* renamed from: E  reason: collision with root package name */
    public int[] f4457E;

    /* renamed from: F  reason: collision with root package name */
    public final ImageView f4458F;

    /* renamed from: G  reason: collision with root package name */
    public final Drawable f4459G;

    /* renamed from: H  reason: collision with root package name */
    public final int f4460H;

    /* renamed from: I  reason: collision with root package name */
    public final int f4461I;

    /* renamed from: J  reason: collision with root package name */
    public final Intent f4462J;

    /* renamed from: K  reason: collision with root package name */
    public final Intent f4463K;

    /* renamed from: L  reason: collision with root package name */
    public final CharSequence f4464L;

    /* renamed from: M  reason: collision with root package name */
    public View.OnFocusChangeListener f4465M;

    /* renamed from: N  reason: collision with root package name */
    public View.OnClickListener f4466N;

    /* renamed from: O  reason: collision with root package name */
    public boolean f4467O;

    /* renamed from: P  reason: collision with root package name */
    public boolean f4468P;

    /* renamed from: Q  reason: collision with root package name */
    public Y.a f4469Q;

    /* renamed from: R  reason: collision with root package name */
    public boolean f4470R;

    /* renamed from: S  reason: collision with root package name */
    public CharSequence f4471S;

    /* renamed from: T  reason: collision with root package name */
    public boolean f4472T;

    /* renamed from: U  reason: collision with root package name */
    public boolean f4473U;

    /* renamed from: V  reason: collision with root package name */
    public int f4474V;

    /* renamed from: W  reason: collision with root package name */
    public boolean f4475W;

    /* renamed from: a0  reason: collision with root package name */
    public CharSequence f4476a0;

    /* renamed from: b0  reason: collision with root package name */
    public CharSequence f4477b0;

    /* renamed from: c0  reason: collision with root package name */
    public boolean f4478c0;

    /* renamed from: d0  reason: collision with root package name */
    public int f4479d0;

    /* renamed from: e0  reason: collision with root package name */
    public SearchableInfo f4480e0;

    /* renamed from: f0  reason: collision with root package name */
    public Bundle f4481f0;

    /* renamed from: g0  reason: collision with root package name */
    public final Runnable f4482g0;

    /* renamed from: h0  reason: collision with root package name */
    public Runnable f4483h0;

    /* renamed from: i0  reason: collision with root package name */
    public final WeakHashMap f4484i0;

    /* renamed from: j0  reason: collision with root package name */
    public final View.OnClickListener f4485j0;

    /* renamed from: k0  reason: collision with root package name */
    public View.OnKeyListener f4486k0;

    /* renamed from: l0  reason: collision with root package name */
    public final TextView.OnEditorActionListener f4487l0;

    /* renamed from: m0  reason: collision with root package name */
    public final AdapterView.OnItemClickListener f4488m0;

    /* renamed from: n0  reason: collision with root package name */
    public final AdapterView.OnItemSelectedListener f4489n0;

    /* renamed from: o0  reason: collision with root package name */
    public TextWatcher f4490o0;

    /* renamed from: r  reason: collision with root package name */
    public final SearchAutoComplete f4491r;

    /* renamed from: s  reason: collision with root package name */
    public final View f4492s;

    /* renamed from: t  reason: collision with root package name */
    public final View f4493t;

    /* renamed from: u  reason: collision with root package name */
    public final View f4494u;

    /* renamed from: v  reason: collision with root package name */
    public final ImageView f4495v;

    /* renamed from: w  reason: collision with root package name */
    public final ImageView f4496w;

    /* renamed from: x  reason: collision with root package name */
    public final ImageView f4497x;

    /* renamed from: y  reason: collision with root package name */
    public final ImageView f4498y;

    /* renamed from: z  reason: collision with root package name */
    public final View f4499z;

    public static class SearchAutoComplete extends C0836c {

        /* renamed from: f  reason: collision with root package name */
        public int f4500f;

        /* renamed from: g  reason: collision with root package name */
        public SearchView f4501g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f4502h;

        /* renamed from: i  reason: collision with root package name */
        public final Runnable f4503i;

        public class a implements Runnable {
            public a() {
            }

            public void run() {
                SearchAutoComplete.this.c();
            }
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, C0645a.f9179m);
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i4 = configuration.screenWidthDp;
            int i5 = configuration.screenHeightDp;
            if (i4 >= 960 && i5 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i4 < 600) {
                return (i4 < 640 || i5 < 480) ? 160 : 192;
            }
            return 192;
        }

        public void a() {
            if (Build.VERSION.SDK_INT >= 29) {
                setInputMethodMode(1);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            SearchView.f4452p0.c(this);
        }

        public boolean b() {
            return TextUtils.getTrimmedLength(getText()) == 0;
        }

        public void c() {
            if (this.f4502h) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.f4502h = false;
            }
        }

        public boolean enoughToFilter() {
            return this.f4500f <= 0 || super.enoughToFilter();
        }

        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f4502h) {
                removeCallbacks(this.f4503i);
                post(this.f4503i);
            }
            return onCreateInputConnection;
        }

        public void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, (float) getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        public void onFocusChanged(boolean z4, int i4, Rect rect) {
            super.onFocusChanged(z4, i4, rect);
            this.f4501g.Z();
        }

        public boolean onKeyPreIme(int i4, KeyEvent keyEvent) {
            if (i4 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                } else if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f4501g.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i4, keyEvent);
        }

        public void onWindowFocusChanged(boolean z4) {
            super.onWindowFocusChanged(z4);
            if (z4 && this.f4501g.hasFocus() && getVisibility() == 0) {
                this.f4502h = true;
                if (SearchView.M(getContext())) {
                    a();
                }
            }
        }

        public void performCompletion() {
        }

        public void replaceText(CharSequence charSequence) {
        }

        public void setImeVisibility(boolean z4) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z4) {
                this.f4502h = false;
                removeCallbacks(this.f4503i);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else if (inputMethodManager.isActive(this)) {
                this.f4502h = false;
                removeCallbacks(this.f4503i);
                inputMethodManager.showSoftInput(this, 0);
            } else {
                this.f4502h = true;
            }
        }

        public void setSearchView(SearchView searchView) {
            this.f4501g = searchView;
        }

        public void setThreshold(int i4) {
            super.setThreshold(i4);
            this.f4500f = i4;
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i4) {
            super(context, attributeSet, i4);
            this.f4503i = new a();
            this.f4500f = getThreshold();
        }
    }

    public class a implements TextWatcher {
        public a() {
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
        }

        public void onTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
            SearchView.this.Y(charSequence);
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public void run() {
            SearchView.this.f0();
        }
    }

    public class c implements Runnable {
        public c() {
        }

        public void run() {
            Y.a aVar = SearchView.this.f4469Q;
            if (aVar instanceof a0) {
                aVar.a((Cursor) null);
            }
        }
    }

    public class d implements View.OnFocusChangeListener {
        public d() {
        }

        public void onFocusChange(View view, boolean z4) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.f4465M;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z4);
            }
        }
    }

    public class e implements View.OnLayoutChangeListener {
        public e() {
        }

        public void onLayoutChange(View view, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
            SearchView.this.B();
        }
    }

    public class f implements View.OnClickListener {
        public f() {
        }

        public void onClick(View view) {
            SearchView searchView = SearchView.this;
            if (view == searchView.f4495v) {
                searchView.V();
            } else if (view == searchView.f4497x) {
                searchView.R();
            } else if (view == searchView.f4496w) {
                searchView.W();
            } else if (view == searchView.f4498y) {
                searchView.a0();
            } else if (view == searchView.f4491r) {
                searchView.H();
            }
        }
    }

    public class g implements View.OnKeyListener {
        public g() {
        }

        public boolean onKey(View view, int i4, KeyEvent keyEvent) {
            SearchView searchView = SearchView.this;
            if (searchView.f4480e0 == null) {
                return false;
            }
            if (searchView.f4491r.isPopupShowing() && SearchView.this.f4491r.getListSelection() != -1) {
                return SearchView.this.X(view, i4, keyEvent);
            }
            if (SearchView.this.f4491r.b() || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i4 != 66) {
                return false;
            }
            view.cancelLongPress();
            SearchView searchView2 = SearchView.this;
            searchView2.P(0, (String) null, searchView2.f4491r.getText().toString());
            return true;
        }
    }

    public class h implements TextView.OnEditorActionListener {
        public h() {
        }

        public boolean onEditorAction(TextView textView, int i4, KeyEvent keyEvent) {
            SearchView.this.W();
            return true;
        }
    }

    public class i implements AdapterView.OnItemClickListener {
        public i() {
        }

        public void onItemClick(AdapterView adapterView, View view, int i4, long j4) {
            SearchView.this.S(i4, 0, (String) null);
        }
    }

    public class j implements AdapterView.OnItemSelectedListener {
        public j() {
        }

        public void onItemSelected(AdapterView adapterView, View view, int i4, long j4) {
            SearchView.this.T(i4);
        }

        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public interface k {
    }

    public interface l {
    }

    public interface m {
    }

    public static class n {

        /* renamed from: a  reason: collision with root package name */
        public Method f4515a = null;

        /* renamed from: b  reason: collision with root package name */
        public Method f4516b = null;

        /* renamed from: c  reason: collision with root package name */
        public Method f4517c = null;

        public n() {
            Class<AutoCompleteTextView> cls = AutoCompleteTextView.class;
            d();
            try {
                Method declaredMethod = cls.getDeclaredMethod("doBeforeTextChanged", (Class[]) null);
                this.f4515a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = cls.getDeclaredMethod("doAfterTextChanged", (Class[]) null);
                this.f4516b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = cls.getMethod("ensureImeVisible", new Class[]{Boolean.TYPE});
                this.f4517c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        public static void d() {
            if (Build.VERSION.SDK_INT >= 29) {
                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }

        public void a(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.f4516b;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, (Object[]) null);
                } catch (Exception unused) {
                }
            }
        }

        public void b(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.f4515a;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, (Object[]) null);
                } catch (Exception unused) {
                }
            }
        }

        public void c(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.f4517c;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[]{Boolean.TRUE});
                } catch (Exception unused) {
                }
            }
        }
    }

    public static class o extends Z.a {
        public static final Parcelable.Creator<o> CREATOR = new a();

        /* renamed from: g  reason: collision with root package name */
        public boolean f4518g;

        public class a implements Parcelable.ClassLoaderCreator {
            /* renamed from: a */
            public o createFromParcel(Parcel parcel) {
                return new o(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public o createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new o(parcel, classLoader);
            }

            /* renamed from: c */
            public o[] newArray(int i4) {
                return new o[i4];
            }
        }

        public o(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f4518g + "}";
        }

        public void writeToParcel(Parcel parcel, int i4) {
            super.writeToParcel(parcel, i4);
            parcel.writeValue(Boolean.valueOf(this.f4518g));
        }

        public o(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f4518g = ((Boolean) parcel.readValue((ClassLoader) null)).booleanValue();
        }
    }

    public static class p extends TouchDelegate {

        /* renamed from: a  reason: collision with root package name */
        public final View f4519a;

        /* renamed from: b  reason: collision with root package name */
        public final Rect f4520b = new Rect();

        /* renamed from: c  reason: collision with root package name */
        public final Rect f4521c = new Rect();

        /* renamed from: d  reason: collision with root package name */
        public final Rect f4522d = new Rect();

        /* renamed from: e  reason: collision with root package name */
        public final int f4523e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f4524f;

        public p(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f4523e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            a(rect, rect2);
            this.f4519a = view;
        }

        public void a(Rect rect, Rect rect2) {
            this.f4520b.set(rect);
            this.f4522d.set(rect);
            Rect rect3 = this.f4522d;
            int i4 = this.f4523e;
            rect3.inset(-i4, -i4);
            this.f4521c.set(rect2);
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x0042  */
        /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTouchEvent(android.view.MotionEvent r9) {
            /*
                r8 = this;
                float r0 = r9.getX()
                int r0 = (int) r0
                float r1 = r9.getY()
                int r1 = (int) r1
                int r2 = r9.getAction()
                r3 = 2
                r4 = 0
                r5 = 1
                if (r2 == 0) goto L_0x0032
                if (r2 == r5) goto L_0x0023
                if (r2 == r3) goto L_0x0023
                r6 = 3
                if (r2 == r6) goto L_0x001b
                goto L_0x003e
            L_0x001b:
                boolean r2 = r8.f4524f
                r8.f4524f = r4
            L_0x001f:
                r7 = r5
                r5 = r2
                r2 = r7
                goto L_0x0040
            L_0x0023:
                boolean r2 = r8.f4524f
                if (r2 == 0) goto L_0x001f
                android.graphics.Rect r6 = r8.f4522d
                boolean r6 = r6.contains(r0, r1)
                if (r6 != 0) goto L_0x001f
                r5 = r2
                r2 = r4
                goto L_0x0040
            L_0x0032:
                android.graphics.Rect r2 = r8.f4520b
                boolean r2 = r2.contains(r0, r1)
                if (r2 == 0) goto L_0x003e
                r8.f4524f = r5
                r2 = r5
                goto L_0x0040
            L_0x003e:
                r2 = r5
                r5 = r4
            L_0x0040:
                if (r5 == 0) goto L_0x0073
                if (r2 == 0) goto L_0x0060
                android.graphics.Rect r2 = r8.f4521c
                boolean r2 = r2.contains(r0, r1)
                if (r2 != 0) goto L_0x0060
                android.view.View r0 = r8.f4519a
                int r0 = r0.getWidth()
                int r0 = r0 / r3
                float r0 = (float) r0
                android.view.View r1 = r8.f4519a
                int r1 = r1.getHeight()
                int r1 = r1 / r3
                float r1 = (float) r1
                r9.setLocation(r0, r1)
                goto L_0x006d
            L_0x0060:
                android.graphics.Rect r2 = r8.f4521c
                int r3 = r2.left
                int r0 = r0 - r3
                float r0 = (float) r0
                int r2 = r2.top
                int r1 = r1 - r2
                float r1 = (float) r1
                r9.setLocation(r0, r1)
            L_0x006d:
                android.view.View r0 = r8.f4519a
                boolean r4 = r0.dispatchTouchEvent(r9)
            L_0x0073:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.p.onTouchEvent(android.view.MotionEvent):boolean");
        }
    }

    public SearchView(Context context) {
        this(context, (AttributeSet) null);
    }

    public static boolean M(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(C0648d.f9206e);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(C0648d.f9207f);
    }

    private void setQuery(CharSequence charSequence) {
        this.f4491r.setText(charSequence);
        this.f4491r.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    public void B() {
        if (this.f4499z.getWidth() > 1) {
            Resources resources = getContext().getResources();
            int paddingLeft = this.f4493t.getPaddingLeft();
            Rect rect = new Rect();
            boolean b4 = i0.b(this);
            int dimensionPixelSize = this.f4467O ? resources.getDimensionPixelSize(C0648d.f9204c) + resources.getDimensionPixelSize(C0648d.f9205d) : 0;
            this.f4491r.getDropDownBackground().getPadding(rect);
            this.f4491r.setDropDownHorizontalOffset(b4 ? -rect.left : paddingLeft - (rect.left + dimensionPixelSize));
            this.f4491r.setDropDownWidth((((this.f4499z.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
        }
    }

    public final Intent C(String str, Uri uri, String str2, String str3, int i4, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f4477b0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f4481f0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i4 != 0) {
            intent.putExtra("action_key", i4);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.f4480e0.getSearchActivity());
        return intent;
    }

    public final Intent D(Cursor cursor, int i4, String str) {
        int i5;
        String o4;
        try {
            String o5 = a0.o(cursor, "suggest_intent_action");
            if (o5 == null) {
                o5 = this.f4480e0.getSuggestIntentAction();
            }
            if (o5 == null) {
                o5 = "android.intent.action.SEARCH";
            }
            String str2 = o5;
            String o6 = a0.o(cursor, "suggest_intent_data");
            if (o6 == null) {
                o6 = this.f4480e0.getSuggestIntentData();
            }
            if (!(o6 == null || (o4 = a0.o(cursor, "suggest_intent_data_id")) == null)) {
                o6 = o6 + "/" + Uri.encode(o4);
            }
            return C(str2, o6 == null ? null : Uri.parse(o6), a0.o(cursor, "suggest_intent_extra_data"), a0.o(cursor, "suggest_intent_query"), i4, str);
        } catch (RuntimeException e4) {
            try {
                i5 = cursor.getPosition();
            } catch (RuntimeException unused) {
                i5 = -1;
            }
            Log.w("SearchView", "Search suggestions cursor at row " + i5 + " returned exception.", e4);
            return null;
        }
    }

    public final Intent E(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1073741824);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f4481f0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String str = null;
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        if (searchActivity != null) {
            str = searchActivity.flattenToShortString();
        }
        intent3.putExtra("calling_package", str);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    public final Intent F(Intent intent, SearchableInfo searchableInfo) {
        Intent intent2 = new Intent(intent);
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        intent2.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
        return intent2;
    }

    public final void G() {
        this.f4491r.dismissDropDown();
    }

    public void H() {
        if (Build.VERSION.SDK_INT >= 29) {
            this.f4491r.refreshAutoCompleteResults();
            return;
        }
        n nVar = f4452p0;
        nVar.b(this.f4491r);
        nVar.a(this.f4491r);
    }

    public final void I(View view, Rect rect) {
        view.getLocationInWindow(this.f4456D);
        getLocationInWindow(this.f4457E);
        int[] iArr = this.f4456D;
        int i4 = iArr[1];
        int[] iArr2 = this.f4457E;
        int i5 = i4 - iArr2[1];
        int i6 = iArr[0] - iArr2[0];
        rect.set(i6, i5, view.getWidth() + i6, view.getHeight() + i5);
    }

    public final CharSequence J(CharSequence charSequence) {
        if (!this.f4467O || this.f4459G == null) {
            return charSequence;
        }
        int textSize = (int) (((double) this.f4491r.getTextSize()) * 1.25d);
        this.f4459G.setBounds(0, 0, textSize, textSize);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new ImageSpan(this.f4459G), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    public final boolean K() {
        SearchableInfo searchableInfo = this.f4480e0;
        if (searchableInfo == null || !searchableInfo.getVoiceSearchEnabled()) {
            return false;
        }
        Intent intent = this.f4480e0.getVoiceSearchLaunchWebSearch() ? this.f4462J : this.f4480e0.getVoiceSearchLaunchRecognizer() ? this.f4463K : null;
        return (intent == null || getContext().getPackageManager().resolveActivity(intent, 65536) == null) ? false : true;
    }

    public boolean L() {
        return this.f4468P;
    }

    public final boolean N() {
        return (this.f4470R || this.f4475W) && !L();
    }

    public final void O(Intent intent) {
        if (intent != null) {
            try {
                getContext().startActivity(intent);
            } catch (RuntimeException e4) {
                Log.e("SearchView", "Failed launch activity: " + intent, e4);
            }
        }
    }

    public void P(int i4, String str, String str2) {
        getContext().startActivity(C("android.intent.action.SEARCH", (Uri) null, (String) null, str2, i4, str));
    }

    public final boolean Q(int i4, int i5, String str) {
        Cursor b4 = this.f4469Q.b();
        if (b4 == null || !b4.moveToPosition(i4)) {
            return false;
        }
        O(D(b4, i5, str));
        return true;
    }

    public void R() {
        if (!TextUtils.isEmpty(this.f4491r.getText())) {
            this.f4491r.setText("");
            this.f4491r.requestFocus();
            this.f4491r.setImeVisibility(true);
        } else if (this.f4467O) {
            clearFocus();
            k0(true);
        }
    }

    public boolean S(int i4, int i5, String str) {
        Q(i4, 0, (String) null);
        this.f4491r.setImeVisibility(false);
        G();
        return true;
    }

    public boolean T(int i4) {
        c0(i4);
        return true;
    }

    public void U(CharSequence charSequence) {
        setQuery(charSequence);
    }

    public void V() {
        k0(false);
        this.f4491r.requestFocus();
        this.f4491r.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f4466N;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void W() {
        Editable text = this.f4491r.getText();
        if (text != null && TextUtils.getTrimmedLength(text) > 0) {
            if (this.f4480e0 != null) {
                P(0, (String) null, text.toString());
            }
            this.f4491r.setImeVisibility(false);
            G();
        }
    }

    public boolean X(View view, int i4, KeyEvent keyEvent) {
        if (this.f4480e0 != null && this.f4469Q != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i4 == 66 || i4 == 84 || i4 == 61) {
                return S(this.f4491r.getListSelection(), 0, (String) null);
            }
            if (i4 == 21 || i4 == 22) {
                this.f4491r.setSelection(i4 == 21 ? 0 : this.f4491r.length());
                this.f4491r.setListSelection(0);
                this.f4491r.clearListSelection();
                this.f4491r.a();
                return true;
            } else if (i4 == 19) {
                this.f4491r.getListSelection();
                return false;
            }
        }
        return false;
    }

    public void Y(CharSequence charSequence) {
        Editable text = this.f4491r.getText();
        this.f4477b0 = text;
        boolean isEmpty = TextUtils.isEmpty(text);
        j0(!isEmpty);
        l0(isEmpty);
        e0();
        i0();
        this.f4476a0 = charSequence.toString();
    }

    public void Z() {
        k0(L());
        b0();
        if (this.f4491r.hasFocus()) {
            H();
        }
    }

    public void a0() {
        SearchableInfo searchableInfo = this.f4480e0;
        if (searchableInfo != null) {
            try {
                if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                    getContext().startActivity(F(this.f4462J, searchableInfo));
                } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                    getContext().startActivity(E(this.f4463K, searchableInfo));
                }
            } catch (ActivityNotFoundException unused) {
                Log.w("SearchView", "Could not find voice search activity");
            }
        }
    }

    public final void b0() {
        post(this.f4482g0);
    }

    public void c() {
        if (!this.f4478c0) {
            this.f4478c0 = true;
            int imeOptions = this.f4491r.getImeOptions();
            this.f4479d0 = imeOptions;
            this.f4491r.setImeOptions(imeOptions | 33554432);
            this.f4491r.setText("");
            setIconified(false);
        }
    }

    public final void c0(int i4) {
        Editable text = this.f4491r.getText();
        Cursor b4 = this.f4469Q.b();
        if (b4 != null) {
            if (b4.moveToPosition(i4)) {
                CharSequence c4 = this.f4469Q.c(b4);
                if (c4 != null) {
                    setQuery(c4);
                } else {
                    setQuery(text);
                }
            } else {
                setQuery(text);
            }
        }
    }

    public void clearFocus() {
        this.f4473U = true;
        super.clearFocus();
        this.f4491r.clearFocus();
        this.f4491r.setImeVisibility(false);
        this.f4473U = false;
    }

    public void d0(CharSequence charSequence, boolean z4) {
        this.f4491r.setText(charSequence);
        if (charSequence != null) {
            SearchAutoComplete searchAutoComplete = this.f4491r;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.f4477b0 = charSequence;
        }
        if (z4 && !TextUtils.isEmpty(charSequence)) {
            W();
        }
    }

    public final void e0() {
        boolean isEmpty = TextUtils.isEmpty(this.f4491r.getText());
        int i4 = 0;
        boolean z4 = !isEmpty || (this.f4467O && !this.f4478c0);
        ImageView imageView = this.f4497x;
        if (!z4) {
            i4 = 8;
        }
        imageView.setVisibility(i4);
        Drawable drawable = this.f4497x.getDrawable();
        if (drawable != null) {
            drawable.setState(!isEmpty ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    public void f() {
        d0("", false);
        clearFocus();
        k0(true);
        this.f4491r.setImeOptions(this.f4479d0);
        this.f4478c0 = false;
    }

    public void f0() {
        int[] iArr = this.f4491r.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f4493t.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f4494u.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public final void g0() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.f4491r;
        if (queryHint == null) {
            queryHint = "";
        }
        searchAutoComplete.setHint(J(queryHint));
    }

    public int getImeOptions() {
        return this.f4491r.getImeOptions();
    }

    public int getInputType() {
        return this.f4491r.getInputType();
    }

    public int getMaxWidth() {
        return this.f4474V;
    }

    public CharSequence getQuery() {
        return this.f4491r.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f4471S;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f4480e0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.f4464L : getContext().getText(this.f4480e0.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.f4461I;
    }

    public int getSuggestionRowLayout() {
        return this.f4460H;
    }

    public Y.a getSuggestionsAdapter() {
        return this.f4469Q;
    }

    public final void h0() {
        this.f4491r.setThreshold(this.f4480e0.getSuggestThreshold());
        this.f4491r.setImeOptions(this.f4480e0.getImeOptions());
        int inputType = this.f4480e0.getInputType();
        int i4 = 1;
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.f4480e0.getSuggestAuthority() != null) {
                inputType |= 589824;
            }
        }
        this.f4491r.setInputType(inputType);
        Y.a aVar = this.f4469Q;
        if (aVar != null) {
            aVar.a((Cursor) null);
        }
        if (this.f4480e0.getSuggestAuthority() != null) {
            a0 a0Var = new a0(getContext(), this, this.f4480e0, this.f4484i0);
            this.f4469Q = a0Var;
            this.f4491r.setAdapter(a0Var);
            a0 a0Var2 = (a0) this.f4469Q;
            if (this.f4472T) {
                i4 = 2;
            }
            a0Var2.x(i4);
        }
    }

    public final void i0() {
        this.f4494u.setVisibility((!N() || !(this.f4496w.getVisibility() == 0 || this.f4498y.getVisibility() == 0)) ? 8 : 0);
    }

    public final void j0(boolean z4) {
        this.f4496w.setVisibility((!this.f4470R || !N() || !hasFocus() || (!z4 && this.f4475W)) ? 8 : 0);
    }

    public final void k0(boolean z4) {
        this.f4468P = z4;
        int i4 = 8;
        int i5 = z4 ? 0 : 8;
        boolean isEmpty = TextUtils.isEmpty(this.f4491r.getText());
        this.f4495v.setVisibility(i5);
        j0(!isEmpty);
        this.f4492s.setVisibility(z4 ? 8 : 0);
        if (this.f4458F.getDrawable() != null && !this.f4467O) {
            i4 = 0;
        }
        this.f4458F.setVisibility(i4);
        e0();
        l0(isEmpty);
        i0();
    }

    public final void l0(boolean z4) {
        int i4 = 8;
        if (this.f4475W && !L() && z4) {
            this.f4496w.setVisibility(8);
            i4 = 0;
        }
        this.f4498y.setVisibility(i4);
    }

    public void onDetachedFromWindow() {
        removeCallbacks(this.f4482g0);
        post(this.f4483h0);
        super.onDetachedFromWindow();
    }

    public void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        super.onLayout(z4, i4, i5, i6, i7);
        if (z4) {
            I(this.f4491r, this.f4454B);
            Rect rect = this.f4455C;
            Rect rect2 = this.f4454B;
            rect.set(rect2.left, 0, rect2.right, i7 - i5);
            p pVar = this.f4453A;
            if (pVar == null) {
                p pVar2 = new p(this.f4455C, this.f4454B, this.f4491r);
                this.f4453A = pVar2;
                setTouchDelegate(pVar2);
                return;
            }
            pVar.a(this.f4455C, this.f4454B);
        }
    }

    public void onMeasure(int i4, int i5) {
        int i6;
        if (L()) {
            super.onMeasure(i4, i5);
            return;
        }
        int mode = View.MeasureSpec.getMode(i4);
        int size = View.MeasureSpec.getSize(i4);
        if (mode == Integer.MIN_VALUE) {
            int i7 = this.f4474V;
            size = i7 > 0 ? Math.min(i7, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.f4474V;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i6 = this.f4474V) > 0) {
            size = Math.min(i6, size);
        }
        int mode2 = View.MeasureSpec.getMode(i5);
        int size2 = View.MeasureSpec.getSize(i5);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof o)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        o oVar = (o) parcelable;
        super.onRestoreInstanceState(oVar.a());
        k0(oVar.f4518g);
        requestLayout();
    }

    public Parcelable onSaveInstanceState() {
        o oVar = new o(super.onSaveInstanceState());
        oVar.f4518g = L();
        return oVar;
    }

    public void onWindowFocusChanged(boolean z4) {
        super.onWindowFocusChanged(z4);
        b0();
    }

    public boolean requestFocus(int i4, Rect rect) {
        if (this.f4473U || !isFocusable()) {
            return false;
        }
        if (L()) {
            return super.requestFocus(i4, rect);
        }
        boolean requestFocus = this.f4491r.requestFocus(i4, rect);
        if (requestFocus) {
            k0(false);
        }
        return requestFocus;
    }

    public void setAppSearchData(Bundle bundle) {
        this.f4481f0 = bundle;
    }

    public void setIconified(boolean z4) {
        if (z4) {
            R();
        } else {
            V();
        }
    }

    public void setIconifiedByDefault(boolean z4) {
        if (this.f4467O != z4) {
            this.f4467O = z4;
            k0(z4);
            g0();
        }
    }

    public void setImeOptions(int i4) {
        this.f4491r.setImeOptions(i4);
    }

    public void setInputType(int i4) {
        this.f4491r.setInputType(i4);
    }

    public void setMaxWidth(int i4) {
        this.f4474V = i4;
        requestLayout();
    }

    public void setOnCloseListener(k kVar) {
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f4465M = onFocusChangeListener;
    }

    public void setOnQueryTextListener(l lVar) {
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f4466N = onClickListener;
    }

    public void setOnSuggestionListener(m mVar) {
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f4471S = charSequence;
        g0();
    }

    public void setQueryRefinementEnabled(boolean z4) {
        this.f4472T = z4;
        Y.a aVar = this.f4469Q;
        if (aVar instanceof a0) {
            ((a0) aVar).x(z4 ? 2 : 1);
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.f4480e0 = searchableInfo;
        if (searchableInfo != null) {
            h0();
            g0();
        }
        boolean K4 = K();
        this.f4475W = K4;
        if (K4) {
            this.f4491r.setPrivateImeOptions("nm");
        }
        k0(L());
    }

    public void setSubmitButtonEnabled(boolean z4) {
        this.f4470R = z4;
        k0(L());
    }

    public void setSuggestionsAdapter(Y.a aVar) {
        this.f4469Q = aVar;
        this.f4491r.setAdapter(aVar);
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0645a.f9160E);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f4454B = new Rect();
        this.f4455C = new Rect();
        this.f4456D = new int[2];
        this.f4457E = new int[2];
        this.f4482g0 = new b();
        this.f4483h0 = new c();
        this.f4484i0 = new WeakHashMap();
        f fVar = new f();
        this.f4485j0 = fVar;
        this.f4486k0 = new g();
        h hVar = new h();
        this.f4487l0 = hVar;
        i iVar = new i();
        this.f4488m0 = iVar;
        j jVar = new j();
        this.f4489n0 = jVar;
        this.f4490o0 = new a();
        f0 v4 = f0.v(context, attributeSet, h.j.f9493i2, i4, 0);
        LayoutInflater.from(context).inflate(v4.n(h.j.f9543s2, h.g.f9312r), this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(h.f.f9256C);
        this.f4491r = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f4492s = findViewById(h.f.f9293y);
        View findViewById = findViewById(h.f.f9255B);
        this.f4493t = findViewById;
        View findViewById2 = findViewById(h.f.f9262I);
        this.f4494u = findViewById2;
        ImageView imageView = (ImageView) findViewById(h.f.f9291w);
        this.f4495v = imageView;
        ImageView imageView2 = (ImageView) findViewById(h.f.f9294z);
        this.f4496w = imageView2;
        ImageView imageView3 = (ImageView) findViewById(h.f.f9292x);
        this.f4497x = imageView3;
        ImageView imageView4 = (ImageView) findViewById(h.f.f9257D);
        this.f4498y = imageView4;
        ImageView imageView5 = (ImageView) findViewById(h.f.f9254A);
        this.f4458F = imageView5;
        C.j0(findViewById, v4.g(h.j.f9548t2));
        C.j0(findViewById2, v4.g(h.j.f9568x2));
        imageView.setImageDrawable(v4.g(h.j.f9563w2));
        imageView2.setImageDrawable(v4.g(h.j.f9533q2));
        imageView3.setImageDrawable(v4.g(h.j.f9518n2));
        imageView4.setImageDrawable(v4.g(h.j.f9578z2));
        imageView5.setImageDrawable(v4.g(h.j.f9563w2));
        this.f4459G = v4.g(h.j.f9558v2);
        g0.a(imageView, getResources().getString(h.h.f9325l));
        this.f4460H = v4.n(h.j.f9573y2, h.g.f9311q);
        this.f4461I = v4.n(h.j.f9523o2, 0);
        imageView.setOnClickListener(fVar);
        imageView3.setOnClickListener(fVar);
        imageView2.setOnClickListener(fVar);
        imageView4.setOnClickListener(fVar);
        searchAutoComplete.setOnClickListener(fVar);
        searchAutoComplete.addTextChangedListener(this.f4490o0);
        searchAutoComplete.setOnEditorActionListener(hVar);
        searchAutoComplete.setOnItemClickListener(iVar);
        searchAutoComplete.setOnItemSelectedListener(jVar);
        searchAutoComplete.setOnKeyListener(this.f4486k0);
        searchAutoComplete.setOnFocusChangeListener(new d());
        setIconifiedByDefault(v4.a(h.j.f9538r2, true));
        int f4 = v4.f(h.j.f9503k2, -1);
        if (f4 != -1) {
            setMaxWidth(f4);
        }
        this.f4464L = v4.p(h.j.f9528p2);
        this.f4471S = v4.p(h.j.f9553u2);
        int k4 = v4.k(h.j.f9513m2, -1);
        if (k4 != -1) {
            setImeOptions(k4);
        }
        int k5 = v4.k(h.j.f9508l2, -1);
        if (k5 != -1) {
            setInputType(k5);
        }
        setFocusable(v4.a(h.j.f9498j2, true));
        v4.w();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.f4462J = intent;
        intent.addFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f4463K = intent2;
        intent2.addFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f4499z = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new e());
        }
        k0(this.f4467O);
        g0();
    }
}
