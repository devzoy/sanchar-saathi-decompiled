package p;

import S.C;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.app.a;
import h.C0645a;
import j.C0754a;
import o.C0813f;

/* renamed from: p.v  reason: case insensitive filesystem */
public class C0854v extends Spinner {

    /* renamed from: k  reason: collision with root package name */
    public static final int[] f11590k = {16843505};

    /* renamed from: c  reason: collision with root package name */
    public final C0837d f11591c;

    /* renamed from: d  reason: collision with root package name */
    public final Context f11592d;

    /* renamed from: e  reason: collision with root package name */
    public N f11593e;

    /* renamed from: f  reason: collision with root package name */
    public SpinnerAdapter f11594f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f11595g;

    /* renamed from: h  reason: collision with root package name */
    public g f11596h;

    /* renamed from: i  reason: collision with root package name */
    public int f11597i;

    /* renamed from: j  reason: collision with root package name */
    public final Rect f11598j;

    /* renamed from: p.v$a */
    public class a extends N {

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ e f11599l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(View view, e eVar) {
            super(view);
            this.f11599l = eVar;
        }

        public C0813f b() {
            return this.f11599l;
        }

        public boolean c() {
            if (C0854v.this.getInternalPopup().c()) {
                return true;
            }
            C0854v.this.b();
            return true;
        }
    }

    /* renamed from: p.v$b */
    public class b implements ViewTreeObserver.OnGlobalLayoutListener {
        public b() {
        }

        public void onGlobalLayout() {
            if (!C0854v.this.getInternalPopup().c()) {
                C0854v.this.b();
            }
            ViewTreeObserver viewTreeObserver = C0854v.this.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            }
        }
    }

    /* renamed from: p.v$c */
    public class c implements g, DialogInterface.OnClickListener {

        /* renamed from: c  reason: collision with root package name */
        public androidx.appcompat.app.a f11602c;

        /* renamed from: d  reason: collision with root package name */
        public ListAdapter f11603d;

        /* renamed from: e  reason: collision with root package name */
        public CharSequence f11604e;

        public c() {
        }

        public int b() {
            return 0;
        }

        public boolean c() {
            androidx.appcompat.app.a aVar = this.f11602c;
            if (aVar != null) {
                return aVar.isShowing();
            }
            return false;
        }

        public void dismiss() {
            androidx.appcompat.app.a aVar = this.f11602c;
            if (aVar != null) {
                aVar.dismiss();
                this.f11602c = null;
            }
        }

        public Drawable f() {
            return null;
        }

        public void h(CharSequence charSequence) {
            this.f11604e = charSequence;
        }

        public void i(Drawable drawable) {
            Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
        }

        public void j(int i4) {
            Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        public void k(int i4) {
            Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }

        public void l(int i4) {
            Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        public void m(int i4, int i5) {
            if (this.f11603d != null) {
                a.C0082a aVar = new a.C0082a(C0854v.this.getPopupContext());
                CharSequence charSequence = this.f11604e;
                if (charSequence != null) {
                    aVar.h(charSequence);
                }
                androidx.appcompat.app.a a4 = aVar.g(this.f11603d, C0854v.this.getSelectedItemPosition(), this).a();
                this.f11602c = a4;
                ListView e4 = a4.e();
                e4.setTextDirection(i4);
                e4.setTextAlignment(i5);
                this.f11602c.show();
            }
        }

        public int n() {
            return 0;
        }

        public CharSequence o() {
            return this.f11604e;
        }

        public void onClick(DialogInterface dialogInterface, int i4) {
            C0854v.this.setSelection(i4);
            if (C0854v.this.getOnItemClickListener() != null) {
                C0854v.this.performItemClick((View) null, i4, this.f11603d.getItemId(i4));
            }
            dismiss();
        }

        public void p(ListAdapter listAdapter) {
            this.f11603d = listAdapter;
        }
    }

    /* renamed from: p.v$d */
    public static class d implements ListAdapter, SpinnerAdapter {

        /* renamed from: c  reason: collision with root package name */
        public SpinnerAdapter f11606c;

        /* renamed from: d  reason: collision with root package name */
        public ListAdapter f11607d;

        public d(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.f11606c = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f11607d = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
                if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
                    themedSpinnerAdapter.setDropDownViewTheme(theme);
                }
            }
        }

        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f11607d;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f11606c;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        public View getDropDownView(int i4, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f11606c;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i4, view, viewGroup);
        }

        public Object getItem(int i4) {
            SpinnerAdapter spinnerAdapter = this.f11606c;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i4);
        }

        public long getItemId(int i4) {
            SpinnerAdapter spinnerAdapter = this.f11606c;
            if (spinnerAdapter == null) {
                return -1;
            }
            return spinnerAdapter.getItemId(i4);
        }

        public int getItemViewType(int i4) {
            return 0;
        }

        public View getView(int i4, View view, ViewGroup viewGroup) {
            return getDropDownView(i4, view, viewGroup);
        }

        public int getViewTypeCount() {
            return 1;
        }

        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f11606c;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        public boolean isEmpty() {
            return getCount() == 0;
        }

        public boolean isEnabled(int i4) {
            ListAdapter listAdapter = this.f11607d;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i4);
            }
            return true;
        }

        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f11606c;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f11606c;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    /* renamed from: p.v$e */
    public class e extends Q implements g {

        /* renamed from: K  reason: collision with root package name */
        public CharSequence f11608K;

        /* renamed from: L  reason: collision with root package name */
        public ListAdapter f11609L;

        /* renamed from: M  reason: collision with root package name */
        public final Rect f11610M = new Rect();

        /* renamed from: N  reason: collision with root package name */
        public int f11611N;

        /* renamed from: p.v$e$a */
        public class a implements AdapterView.OnItemClickListener {

            /* renamed from: c  reason: collision with root package name */
            public final /* synthetic */ C0854v f11613c;

            public a(C0854v vVar) {
                this.f11613c = vVar;
            }

            public void onItemClick(AdapterView adapterView, View view, int i4, long j4) {
                C0854v.this.setSelection(i4);
                if (C0854v.this.getOnItemClickListener() != null) {
                    e eVar = e.this;
                    C0854v.this.performItemClick(view, i4, eVar.f11609L.getItemId(i4));
                }
                e.this.dismiss();
            }
        }

        /* renamed from: p.v$e$b */
        public class b implements ViewTreeObserver.OnGlobalLayoutListener {
            public b() {
            }

            public void onGlobalLayout() {
                e eVar = e.this;
                if (!eVar.U(C0854v.this)) {
                    e.this.dismiss();
                    return;
                }
                e.this.S();
                e.super.a();
            }
        }

        /* renamed from: p.v$e$c */
        public class c implements PopupWindow.OnDismissListener {

            /* renamed from: c  reason: collision with root package name */
            public final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f11616c;

            public c(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.f11616c = onGlobalLayoutListener;
            }

            public void onDismiss() {
                ViewTreeObserver viewTreeObserver = C0854v.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f11616c);
                }
            }
        }

        public e(Context context, AttributeSet attributeSet, int i4) {
            super(context, attributeSet, i4);
            D(C0854v.this);
            J(true);
            O(0);
            L(new a(C0854v.this));
        }

        public void S() {
            int i4;
            Drawable f4 = f();
            if (f4 != null) {
                f4.getPadding(C0854v.this.f11598j);
                i4 = i0.b(C0854v.this) ? C0854v.this.f11598j.right : -C0854v.this.f11598j.left;
            } else {
                Rect rect = C0854v.this.f11598j;
                rect.right = 0;
                rect.left = 0;
                i4 = 0;
            }
            int paddingLeft = C0854v.this.getPaddingLeft();
            int paddingRight = C0854v.this.getPaddingRight();
            int width = C0854v.this.getWidth();
            C0854v vVar = C0854v.this;
            int i5 = vVar.f11597i;
            if (i5 == -2) {
                int a4 = vVar.a((SpinnerAdapter) this.f11609L, f());
                int i6 = C0854v.this.getContext().getResources().getDisplayMetrics().widthPixels;
                Rect rect2 = C0854v.this.f11598j;
                int i7 = (i6 - rect2.left) - rect2.right;
                if (a4 > i7) {
                    a4 = i7;
                }
                F(Math.max(a4, (width - paddingLeft) - paddingRight));
            } else if (i5 == -1) {
                F((width - paddingLeft) - paddingRight);
            } else {
                F(i5);
            }
            l(i0.b(C0854v.this) ? i4 + (((width - paddingRight) - z()) - T()) : i4 + paddingLeft + T());
        }

        public int T() {
            return this.f11611N;
        }

        public boolean U(View view) {
            return C.L(view) && view.getGlobalVisibleRect(this.f11610M);
        }

        public void h(CharSequence charSequence) {
            this.f11608K = charSequence;
        }

        public void k(int i4) {
            this.f11611N = i4;
        }

        public void m(int i4, int i5) {
            ViewTreeObserver viewTreeObserver;
            boolean c4 = c();
            S();
            I(2);
            super.a();
            ListView g4 = g();
            g4.setChoiceMode(1);
            g4.setTextDirection(i4);
            g4.setTextAlignment(i5);
            P(C0854v.this.getSelectedItemPosition());
            if (!c4 && (viewTreeObserver = C0854v.this.getViewTreeObserver()) != null) {
                b bVar = new b();
                viewTreeObserver.addOnGlobalLayoutListener(bVar);
                K(new c(bVar));
            }
        }

        public CharSequence o() {
            return this.f11608K;
        }

        public void p(ListAdapter listAdapter) {
            super.p(listAdapter);
            this.f11609L = listAdapter;
        }
    }

    /* renamed from: p.v$f */
    public static class f extends View.BaseSavedState {
        public static final Parcelable.Creator<f> CREATOR = new a();

        /* renamed from: e  reason: collision with root package name */
        public boolean f11618e;

        /* renamed from: p.v$f$a */
        public class a implements Parcelable.Creator {
            /* renamed from: a */
            public f createFromParcel(Parcel parcel) {
                return new f(parcel);
            }

            /* renamed from: b */
            public f[] newArray(int i4) {
                return new f[i4];
            }
        }

        public f(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i4) {
            super.writeToParcel(parcel, i4);
            parcel.writeByte(this.f11618e ? (byte) 1 : 0);
        }

        public f(Parcel parcel) {
            super(parcel);
            this.f11618e = parcel.readByte() != 0;
        }
    }

    /* renamed from: p.v$g */
    public interface g {
        int b();

        boolean c();

        void dismiss();

        Drawable f();

        void h(CharSequence charSequence);

        void i(Drawable drawable);

        void j(int i4);

        void k(int i4);

        void l(int i4);

        void m(int i4, int i5);

        int n();

        CharSequence o();

        void p(ListAdapter listAdapter);
    }

    public C0854v(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0645a.f9162G);
    }

    public int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i4 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i5 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i4) {
                view = null;
                i4 = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i5 = Math.max(i5, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return i5;
        }
        drawable.getPadding(this.f11598j);
        Rect rect = this.f11598j;
        return i5 + rect.left + rect.right;
    }

    public void b() {
        this.f11596h.m(getTextDirection(), getTextAlignment());
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0837d dVar = this.f11591c;
        if (dVar != null) {
            dVar.b();
        }
    }

    public int getDropDownHorizontalOffset() {
        g gVar = this.f11596h;
        return gVar != null ? gVar.b() : super.getDropDownHorizontalOffset();
    }

    public int getDropDownVerticalOffset() {
        g gVar = this.f11596h;
        return gVar != null ? gVar.n() : super.getDropDownVerticalOffset();
    }

    public int getDropDownWidth() {
        return this.f11596h != null ? this.f11597i : super.getDropDownWidth();
    }

    public final g getInternalPopup() {
        return this.f11596h;
    }

    public Drawable getPopupBackground() {
        g gVar = this.f11596h;
        return gVar != null ? gVar.f() : super.getPopupBackground();
    }

    public Context getPopupContext() {
        return this.f11592d;
    }

    public CharSequence getPrompt() {
        g gVar = this.f11596h;
        return gVar != null ? gVar.o() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0837d dVar = this.f11591c;
        if (dVar != null) {
            return dVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0837d dVar = this.f11591c;
        if (dVar != null) {
            return dVar.d();
        }
        return null;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        g gVar = this.f11596h;
        if (gVar != null && gVar.c()) {
            this.f11596h.dismiss();
        }
    }

    public void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
        if (this.f11596h != null && View.MeasureSpec.getMode(i4) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i4)), getMeasuredHeight());
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        f fVar = (f) parcelable;
        super.onRestoreInstanceState(fVar.getSuperState());
        if (fVar.f11618e && (viewTreeObserver = getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new b());
        }
    }

    public Parcelable onSaveInstanceState() {
        f fVar = new f(super.onSaveInstanceState());
        g gVar = this.f11596h;
        fVar.f11618e = gVar != null && gVar.c();
        return fVar;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        N n4 = this.f11593e;
        if (n4 == null || !n4.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public boolean performClick() {
        g gVar = this.f11596h;
        if (gVar == null) {
            return super.performClick();
        }
        if (gVar.c()) {
            return true;
        }
        b();
        return true;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0837d dVar = this.f11591c;
        if (dVar != null) {
            dVar.f(drawable);
        }
    }

    public void setBackgroundResource(int i4) {
        super.setBackgroundResource(i4);
        C0837d dVar = this.f11591c;
        if (dVar != null) {
            dVar.g(i4);
        }
    }

    public void setDropDownHorizontalOffset(int i4) {
        g gVar = this.f11596h;
        if (gVar != null) {
            gVar.k(i4);
            this.f11596h.l(i4);
            return;
        }
        super.setDropDownHorizontalOffset(i4);
    }

    public void setDropDownVerticalOffset(int i4) {
        g gVar = this.f11596h;
        if (gVar != null) {
            gVar.j(i4);
        } else {
            super.setDropDownVerticalOffset(i4);
        }
    }

    public void setDropDownWidth(int i4) {
        if (this.f11596h != null) {
            this.f11597i = i4;
        } else {
            super.setDropDownWidth(i4);
        }
    }

    public void setPopupBackgroundDrawable(Drawable drawable) {
        g gVar = this.f11596h;
        if (gVar != null) {
            gVar.i(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    public void setPopupBackgroundResource(int i4) {
        setPopupBackgroundDrawable(C0754a.b(getPopupContext(), i4));
    }

    public void setPrompt(CharSequence charSequence) {
        g gVar = this.f11596h;
        if (gVar != null) {
            gVar.h(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0837d dVar = this.f11591c;
        if (dVar != null) {
            dVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0837d dVar = this.f11591c;
        if (dVar != null) {
            dVar.j(mode);
        }
    }

    public C0854v(Context context, AttributeSet attributeSet, int i4) {
        this(context, attributeSet, i4, -1);
    }

    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f11595g) {
            this.f11594f = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f11596h != null) {
            Context context = this.f11592d;
            if (context == null) {
                context = getContext();
            }
            this.f11596h.p(new d(spinnerAdapter, context.getTheme()));
        }
    }

    public C0854v(Context context, AttributeSet attributeSet, int i4, int i5) {
        this(context, attributeSet, i4, i5, (Resources.Theme) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0064, code lost:
        if (r11 != null) goto L_0x0055;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0069  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C0854v(android.content.Context r7, android.util.AttributeSet r8, int r9, int r10, android.content.res.Resources.Theme r11) {
        /*
            r6 = this;
            r6.<init>(r7, r8, r9)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r6.f11598j = r0
            android.content.Context r0 = r6.getContext()
            p.b0.a(r6, r0)
            int[] r0 = h.j.f9332A2
            r1 = 0
            p.f0 r0 = p.f0.v(r7, r8, r0, r9, r1)
            p.d r2 = new p.d
            r2.<init>(r6)
            r6.f11591c = r2
            if (r11 == 0) goto L_0x0029
            n.d r2 = new n.d
            r2.<init>((android.content.Context) r7, (android.content.res.Resources.Theme) r11)
            r6.f11592d = r2
            goto L_0x003b
        L_0x0029:
            int r11 = h.j.f9357F2
            int r11 = r0.n(r11, r1)
            if (r11 == 0) goto L_0x0039
            n.d r2 = new n.d
            r2.<init>((android.content.Context) r7, (int) r11)
            r6.f11592d = r2
            goto L_0x003b
        L_0x0039:
            r6.f11592d = r7
        L_0x003b:
            r11 = -1
            r2 = 0
            if (r10 != r11) goto L_0x006d
            int[] r11 = f11590k     // Catch:{ Exception -> 0x005b, all -> 0x0059 }
            android.content.res.TypedArray r11 = r7.obtainStyledAttributes(r8, r11, r9, r1)     // Catch:{ Exception -> 0x005b, all -> 0x0059 }
            boolean r3 = r11.hasValue(r1)     // Catch:{ Exception -> 0x0053 }
            if (r3 == 0) goto L_0x0055
            int r10 = r11.getInt(r1, r1)     // Catch:{ Exception -> 0x0053 }
            goto L_0x0055
        L_0x0050:
            r7 = move-exception
            r2 = r11
            goto L_0x0067
        L_0x0053:
            r3 = move-exception
            goto L_0x005d
        L_0x0055:
            r11.recycle()
            goto L_0x006d
        L_0x0059:
            r7 = move-exception
            goto L_0x0067
        L_0x005b:
            r3 = move-exception
            r11 = r2
        L_0x005d:
            java.lang.String r4 = "AppCompatSpinner"
            java.lang.String r5 = "Could not read android:spinnerMode"
            android.util.Log.i(r4, r5, r3)     // Catch:{ all -> 0x0050 }
            if (r11 == 0) goto L_0x006d
            goto L_0x0055
        L_0x0067:
            if (r2 == 0) goto L_0x006c
            r2.recycle()
        L_0x006c:
            throw r7
        L_0x006d:
            r11 = 1
            if (r10 == 0) goto L_0x00aa
            if (r10 == r11) goto L_0x0073
            goto L_0x00ba
        L_0x0073:
            p.v$e r10 = new p.v$e
            android.content.Context r3 = r6.f11592d
            r10.<init>(r3, r8, r9)
            android.content.Context r3 = r6.f11592d
            int[] r4 = h.j.f9332A2
            p.f0 r1 = p.f0.v(r3, r8, r4, r9, r1)
            int r3 = h.j.f9352E2
            r4 = -2
            int r3 = r1.m(r3, r4)
            r6.f11597i = r3
            int r3 = h.j.f9342C2
            android.graphics.drawable.Drawable r3 = r1.g(r3)
            r10.i(r3)
            int r3 = h.j.f9347D2
            java.lang.String r3 = r0.o(r3)
            r10.h(r3)
            r1.w()
            r6.f11596h = r10
            p.v$a r1 = new p.v$a
            r1.<init>(r6, r10)
            r6.f11593e = r1
            goto L_0x00ba
        L_0x00aa:
            p.v$c r10 = new p.v$c
            r10.<init>()
            r6.f11596h = r10
            int r1 = h.j.f9347D2
            java.lang.String r1 = r0.o(r1)
            r10.h(r1)
        L_0x00ba:
            int r10 = h.j.f9337B2
            java.lang.CharSequence[] r10 = r0.q(r10)
            if (r10 == 0) goto L_0x00d2
            android.widget.ArrayAdapter r1 = new android.widget.ArrayAdapter
            r3 = 17367048(0x1090008, float:2.5162948E-38)
            r1.<init>(r7, r3, r10)
            int r7 = h.g.f9313s
            r1.setDropDownViewResource(r7)
            r6.setAdapter((android.widget.SpinnerAdapter) r1)
        L_0x00d2:
            r0.w()
            r6.f11595g = r11
            android.widget.SpinnerAdapter r7 = r6.f11594f
            if (r7 == 0) goto L_0x00e0
            r6.setAdapter((android.widget.SpinnerAdapter) r7)
            r6.f11594f = r2
        L_0x00e0:
            p.d r7 = r6.f11591c
            r7.e(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p.C0854v.<init>(android.content.Context, android.util.AttributeSet, int, int, android.content.res.Resources$Theme):void");
    }
}
