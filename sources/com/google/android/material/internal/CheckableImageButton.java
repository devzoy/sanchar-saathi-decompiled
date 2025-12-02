package com.google.android.material.internal;

import S.C;
import S.C0310a;
import T.m;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Checkable;
import h.C0645a;
import p.C0845l;

public class CheckableImageButton extends C0845l implements Checkable {

    /* renamed from: h  reason: collision with root package name */
    public static final int[] f7975h = {16842912};

    /* renamed from: e  reason: collision with root package name */
    public boolean f7976e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f7977f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f7978g;

    public class a extends C0310a {
        public a() {
        }

        public void f(View view, AccessibilityEvent accessibilityEvent) {
            super.f(view, accessibilityEvent);
            accessibilityEvent.setChecked(CheckableImageButton.this.isChecked());
        }

        public void g(View view, m mVar) {
            super.g(view, mVar);
            mVar.a0(CheckableImageButton.this.a());
            mVar.b0(CheckableImageButton.this.isChecked());
        }
    }

    public static class b extends Z.a {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: g  reason: collision with root package name */
        public boolean f7980g;

        public static class a implements Parcelable.ClassLoaderCreator {
            /* renamed from: a */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public b createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new b(parcel, classLoader);
            }

            /* renamed from: c */
            public b[] newArray(int i4) {
                return new b[i4];
            }
        }

        public b(Parcelable parcelable) {
            super(parcelable);
        }

        private void c(Parcel parcel) {
            boolean z4 = true;
            if (parcel.readInt() != 1) {
                z4 = false;
            }
            this.f7980g = z4;
        }

        public void writeToParcel(Parcel parcel, int i4) {
            super.writeToParcel(parcel, i4);
            parcel.writeInt(this.f7980g ? 1 : 0);
        }

        public b(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            c(parcel);
        }
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0645a.f9191y);
    }

    public boolean a() {
        return this.f7977f;
    }

    public boolean isChecked() {
        return this.f7976e;
    }

    public int[] onCreateDrawableState(int i4) {
        if (!this.f7976e) {
            return super.onCreateDrawableState(i4);
        }
        int[] iArr = f7975h;
        return View.mergeDrawableStates(super.onCreateDrawableState(i4 + iArr.length), iArr);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.a());
        setChecked(bVar.f7980g);
    }

    public Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        bVar.f7980g = this.f7976e;
        return bVar;
    }

    public void setCheckable(boolean z4) {
        if (this.f7977f != z4) {
            this.f7977f = z4;
            sendAccessibilityEvent(0);
        }
    }

    public void setChecked(boolean z4) {
        if (this.f7977f && this.f7976e != z4) {
            this.f7976e = z4;
            refreshDrawableState();
            sendAccessibilityEvent(2048);
        }
    }

    public void setPressable(boolean z4) {
        this.f7978g = z4;
    }

    public void setPressed(boolean z4) {
        if (this.f7978g) {
            super.setPressed(z4);
        }
    }

    public void toggle() {
        setChecked(!this.f7976e);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f7977f = true;
        this.f7978g = true;
        C.g0(this, new a());
    }
}
