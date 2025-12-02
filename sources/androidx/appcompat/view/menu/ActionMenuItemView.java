package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.ActionMenuView;
import o.C0813f;
import p.C0857y;
import p.N;
import p.g0;

public class ActionMenuItemView extends C0857y implements j.a, View.OnClickListener, ActionMenuView.a {

    /* renamed from: g  reason: collision with root package name */
    public g f4164g;

    /* renamed from: h  reason: collision with root package name */
    public CharSequence f4165h;

    /* renamed from: i  reason: collision with root package name */
    public Drawable f4166i;

    /* renamed from: j  reason: collision with root package name */
    public e.b f4167j;

    /* renamed from: k  reason: collision with root package name */
    public N f4168k;

    /* renamed from: l  reason: collision with root package name */
    public b f4169l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f4170m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f4171n;

    /* renamed from: o  reason: collision with root package name */
    public int f4172o;

    /* renamed from: p  reason: collision with root package name */
    public int f4173p;

    /* renamed from: q  reason: collision with root package name */
    public int f4174q;

    public class a extends N {
        public a() {
            super(ActionMenuItemView.this);
        }

        public C0813f b() {
            b bVar = ActionMenuItemView.this.f4169l;
            if (bVar != null) {
                return bVar.a();
            }
            return null;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x000f, code lost:
            r0 = b();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean c() {
            /*
                r3 = this;
                androidx.appcompat.view.menu.ActionMenuItemView r0 = androidx.appcompat.view.menu.ActionMenuItemView.this
                androidx.appcompat.view.menu.e$b r1 = r0.f4167j
                r2 = 0
                if (r1 == 0) goto L_0x001c
                androidx.appcompat.view.menu.g r0 = r0.f4164g
                boolean r0 = r1.a(r0)
                if (r0 == 0) goto L_0x001c
                o.f r0 = r3.b()
                if (r0 == 0) goto L_0x001c
                boolean r0 = r0.c()
                if (r0 == 0) goto L_0x001c
                r2 = 1
            L_0x001c:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ActionMenuItemView.a.c():boolean");
        }
    }

    public static abstract class b {
        public abstract C0813f a();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public boolean a() {
        return f();
    }

    public boolean b() {
        return f() && this.f4164g.getIcon() == null;
    }

    public boolean d() {
        return true;
    }

    public void e(g gVar, int i4) {
        this.f4164g = gVar;
        setIcon(gVar.getIcon());
        setTitle(gVar.i(this));
        setId(gVar.getItemId());
        setVisibility(gVar.isVisible() ? 0 : 8);
        setEnabled(gVar.isEnabled());
        if (gVar.hasSubMenu() && this.f4168k == null) {
            this.f4168k = new a();
        }
    }

    public boolean f() {
        return !TextUtils.isEmpty(getText());
    }

    public final boolean g() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i4 = configuration.screenWidthDp;
        return i4 >= 480 || (i4 >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    public g getItemData() {
        return this.f4164g;
    }

    public final void h() {
        boolean z4 = true;
        boolean z5 = !TextUtils.isEmpty(this.f4165h);
        if (this.f4166i != null && (!this.f4164g.B() || (!this.f4170m && !this.f4171n))) {
            z4 = false;
        }
        boolean z6 = z5 & z4;
        CharSequence charSequence = null;
        setText(z6 ? this.f4165h : null);
        CharSequence contentDescription = this.f4164g.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            setContentDescription(z6 ? null : this.f4164g.getTitle());
        } else {
            setContentDescription(contentDescription);
        }
        CharSequence tooltipText = this.f4164g.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            if (!z6) {
                charSequence = this.f4164g.getTitle();
            }
            g0.a(this, charSequence);
            return;
        }
        g0.a(this, tooltipText);
    }

    public void onClick(View view) {
        e.b bVar = this.f4167j;
        if (bVar != null) {
            bVar.a(this.f4164g);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f4170m = g();
        h();
    }

    public void onMeasure(int i4, int i5) {
        int i6;
        boolean f4 = f();
        if (f4 && (i6 = this.f4173p) >= 0) {
            super.setPadding(i6, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i4, i5);
        int mode = View.MeasureSpec.getMode(i4);
        int size = View.MeasureSpec.getSize(i4);
        int measuredWidth = getMeasuredWidth();
        int min = mode == Integer.MIN_VALUE ? Math.min(size, this.f4172o) : this.f4172o;
        if (mode != 1073741824 && this.f4172o > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i5);
        }
        if (!f4 && this.f4166i != null) {
            super.setPadding((getMeasuredWidth() - this.f4166i.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState((Parcelable) null);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        N n4;
        if (!this.f4164g.hasSubMenu() || (n4 = this.f4168k) == null || !n4.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public void setCheckable(boolean z4) {
    }

    public void setChecked(boolean z4) {
    }

    public void setExpandedFormat(boolean z4) {
        if (this.f4171n != z4) {
            this.f4171n = z4;
            g gVar = this.f4164g;
            if (gVar != null) {
                gVar.c();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f4166i = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i4 = this.f4174q;
            if (intrinsicWidth > i4) {
                intrinsicHeight = (int) (((float) intrinsicHeight) * (((float) i4) / ((float) intrinsicWidth)));
                intrinsicWidth = i4;
            }
            if (intrinsicHeight > i4) {
                intrinsicWidth = (int) (((float) intrinsicWidth) * (((float) i4) / ((float) intrinsicHeight)));
            } else {
                i4 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i4);
        }
        setCompoundDrawables(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        h();
    }

    public void setItemInvoker(e.b bVar) {
        this.f4167j = bVar;
    }

    public void setPadding(int i4, int i5, int i6, int i7) {
        this.f4173p = i4;
        super.setPadding(i4, i5, i6, i7);
    }

    public void setPopupCallback(b bVar) {
        this.f4169l = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f4165h = charSequence;
        h();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        Resources resources = context.getResources();
        this.f4170m = g();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.j.f9555v, i4, 0);
        this.f4172o = obtainStyledAttributes.getDimensionPixelSize(h.j.f9560w, 0);
        obtainStyledAttributes.recycle();
        this.f4174q = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f4173p = -1;
        setSaveEnabled(false);
    }
}
