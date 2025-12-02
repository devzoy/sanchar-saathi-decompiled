package androidx.appcompat.view.menu;

import S.C;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.view.menu.j;
import h.C0645a;
import h.f;
import h.g;
import p.f0;

public class ListMenuItemView extends LinearLayout implements j.a, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: c  reason: collision with root package name */
    public g f4179c;

    /* renamed from: d  reason: collision with root package name */
    public ImageView f4180d;

    /* renamed from: e  reason: collision with root package name */
    public RadioButton f4181e;

    /* renamed from: f  reason: collision with root package name */
    public TextView f4182f;

    /* renamed from: g  reason: collision with root package name */
    public CheckBox f4183g;

    /* renamed from: h  reason: collision with root package name */
    public TextView f4184h;

    /* renamed from: i  reason: collision with root package name */
    public ImageView f4185i;

    /* renamed from: j  reason: collision with root package name */
    public ImageView f4186j;

    /* renamed from: k  reason: collision with root package name */
    public LinearLayout f4187k;

    /* renamed from: l  reason: collision with root package name */
    public Drawable f4188l;

    /* renamed from: m  reason: collision with root package name */
    public int f4189m;

    /* renamed from: n  reason: collision with root package name */
    public Context f4190n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f4191o;

    /* renamed from: p  reason: collision with root package name */
    public Drawable f4192p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f4193q;

    /* renamed from: r  reason: collision with root package name */
    public LayoutInflater f4194r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f4195s;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0645a.f9192z);
    }

    private LayoutInflater getInflater() {
        if (this.f4194r == null) {
            this.f4194r = LayoutInflater.from(getContext());
        }
        return this.f4194r;
    }

    private void setSubMenuArrowVisible(boolean z4) {
        ImageView imageView = this.f4185i;
        if (imageView != null) {
            imageView.setVisibility(z4 ? 0 : 8);
        }
    }

    public final void a(View view) {
        b(view, -1);
    }

    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f4186j;
        if (imageView != null && imageView.getVisibility() == 0) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f4186j.getLayoutParams();
            rect.top += this.f4186j.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
        }
    }

    public final void b(View view, int i4) {
        LinearLayout linearLayout = this.f4187k;
        if (linearLayout != null) {
            linearLayout.addView(view, i4);
        } else {
            addView(view, i4);
        }
    }

    public final void c() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(g.f9302h, this, false);
        this.f4183g = checkBox;
        a(checkBox);
    }

    public boolean d() {
        return false;
    }

    public void e(g gVar, int i4) {
        this.f4179c = gVar;
        setVisibility(gVar.isVisible() ? 0 : 8);
        setTitle(gVar.i(this));
        setCheckable(gVar.isCheckable());
        h(gVar.A(), gVar.g());
        setIcon(gVar.getIcon());
        setEnabled(gVar.isEnabled());
        setSubMenuArrowVisible(gVar.hasSubMenu());
        setContentDescription(gVar.getContentDescription());
    }

    public final void f() {
        ImageView imageView = (ImageView) getInflater().inflate(g.f9303i, this, false);
        this.f4180d = imageView;
        b(imageView, 0);
    }

    public final void g() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(g.f9305k, this, false);
        this.f4181e = radioButton;
        a(radioButton);
    }

    public g getItemData() {
        return this.f4179c;
    }

    public void h(boolean z4, char c4) {
        int i4 = (!z4 || !this.f4179c.A()) ? 8 : 0;
        if (i4 == 0) {
            this.f4184h.setText(this.f4179c.h());
        }
        if (this.f4184h.getVisibility() != i4) {
            this.f4184h.setVisibility(i4);
        }
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        C.j0(this, this.f4188l);
        TextView textView = (TextView) findViewById(f.f9265L);
        this.f4182f = textView;
        int i4 = this.f4189m;
        if (i4 != -1) {
            textView.setTextAppearance(this.f4190n, i4);
        }
        this.f4184h = (TextView) findViewById(f.f9258E);
        ImageView imageView = (ImageView) findViewById(f.f9261H);
        this.f4185i = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f4192p);
        }
        this.f4186j = (ImageView) findViewById(f.f9286r);
        this.f4187k = (LinearLayout) findViewById(f.f9280l);
    }

    public void onMeasure(int i4, int i5) {
        if (this.f4180d != null && this.f4191o) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f4180d.getLayoutParams();
            int i6 = layoutParams.height;
            if (i6 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i6;
            }
        }
        super.onMeasure(i4, i5);
    }

    public void setCheckable(boolean z4) {
        View view;
        CompoundButton compoundButton;
        if (z4 || this.f4181e != null || this.f4183g != null) {
            if (this.f4179c.m()) {
                if (this.f4181e == null) {
                    g();
                }
                compoundButton = this.f4181e;
                view = this.f4183g;
            } else {
                if (this.f4183g == null) {
                    c();
                }
                compoundButton = this.f4183g;
                view = this.f4181e;
            }
            if (z4) {
                compoundButton.setChecked(this.f4179c.isChecked());
                if (compoundButton.getVisibility() != 0) {
                    compoundButton.setVisibility(0);
                }
                if (view != null && view.getVisibility() != 8) {
                    view.setVisibility(8);
                    return;
                }
                return;
            }
            CheckBox checkBox = this.f4183g;
            if (checkBox != null) {
                checkBox.setVisibility(8);
            }
            RadioButton radioButton = this.f4181e;
            if (radioButton != null) {
                radioButton.setVisibility(8);
            }
        }
    }

    public void setChecked(boolean z4) {
        CompoundButton compoundButton;
        if (this.f4179c.m()) {
            if (this.f4181e == null) {
                g();
            }
            compoundButton = this.f4181e;
        } else {
            if (this.f4183g == null) {
                c();
            }
            compoundButton = this.f4183g;
        }
        compoundButton.setChecked(z4);
    }

    public void setForceShowIcon(boolean z4) {
        this.f4195s = z4;
        this.f4191o = z4;
    }

    public void setGroupDividerEnabled(boolean z4) {
        ImageView imageView = this.f4186j;
        if (imageView != null) {
            imageView.setVisibility((this.f4193q || !z4) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z4 = this.f4179c.z() || this.f4195s;
        if (z4 || this.f4191o) {
            ImageView imageView = this.f4180d;
            if (imageView != null || drawable != null || this.f4191o) {
                if (imageView == null) {
                    f();
                }
                if (drawable != null || this.f4191o) {
                    ImageView imageView2 = this.f4180d;
                    if (!z4) {
                        drawable = null;
                    }
                    imageView2.setImageDrawable(drawable);
                    if (this.f4180d.getVisibility() != 0) {
                        this.f4180d.setVisibility(0);
                        return;
                    }
                    return;
                }
                this.f4180d.setVisibility(8);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence != null) {
            this.f4182f.setText(charSequence);
            if (this.f4182f.getVisibility() != 0) {
                this.f4182f.setVisibility(0);
            }
        } else if (this.f4182f.getVisibility() != 8) {
            this.f4182f.setVisibility(8);
        }
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet);
        f0 v4 = f0.v(getContext(), attributeSet, h.j.f9436W1, i4, 0);
        this.f4188l = v4.g(h.j.f9444Y1);
        this.f4189m = v4.n(h.j.f9440X1, -1);
        this.f4191o = v4.a(h.j.f9448Z1, false);
        this.f4190n = context;
        this.f4192p = v4.g(h.j.f9453a2);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes((AttributeSet) null, new int[]{16843049}, C0645a.f9189w, 0);
        this.f4193q = obtainStyledAttributes.hasValue(0);
        v4.w();
        obtainStyledAttributes.recycle();
    }
}
