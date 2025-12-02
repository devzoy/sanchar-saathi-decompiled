package com.google.android.material.timepicker;

import S.C;
import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;

class TimePickerView extends ConstraintLayout {

    /* renamed from: A  reason: collision with root package name */
    public final Chip f8258A;

    /* renamed from: B  reason: collision with root package name */
    public final ClockHandView f8259B;

    /* renamed from: C  reason: collision with root package name */
    public final ClockFaceView f8260C;

    /* renamed from: D  reason: collision with root package name */
    public final MaterialButtonToggleGroup f8261D;

    /* renamed from: E  reason: collision with root package name */
    public final View.OnClickListener f8262E;

    /* renamed from: z  reason: collision with root package name */
    public final Chip f8263z;

    public class a implements View.OnClickListener {
        public a() {
        }

        public void onClick(View view) {
            g unused = TimePickerView.this.getClass();
        }
    }

    public class b implements MaterialButtonToggleGroup.e {
        public b() {
        }

        public void a(MaterialButtonToggleGroup materialButtonToggleGroup, int i4, boolean z4) {
            f unused = TimePickerView.this.getClass();
        }
    }

    public class c extends GestureDetector.SimpleOnGestureListener {
        public c() {
        }

        public boolean onDoubleTap(MotionEvent motionEvent) {
            boolean onDoubleTap = super.onDoubleTap(motionEvent);
            e unused = TimePickerView.this.getClass();
            return onDoubleTap;
        }
    }

    public class d implements View.OnTouchListener {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ GestureDetector f8267c;

        public d(GestureDetector gestureDetector) {
            this.f8267c = gestureDetector;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (((Checkable) view).isChecked()) {
                return this.f8267c.onTouchEvent(motionEvent);
            }
            return false;
        }
    }

    public interface e {
    }

    public interface f {
    }

    public interface g {
    }

    public TimePickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        y();
    }

    public void onVisibilityChanged(View view, int i4) {
        super.onVisibilityChanged(view, i4);
        if (view == this && i4 == 0) {
            y();
        }
    }

    public final void w() {
        this.f8263z.setTag(V1.e.f3046C, 12);
        this.f8258A.setTag(V1.e.f3046C, 10);
        this.f8263z.setOnClickListener(this.f8262E);
        this.f8258A.setOnClickListener(this.f8262E);
    }

    public final void x() {
        d dVar = new d(new GestureDetector(getContext(), new c()));
        this.f8263z.setOnTouchListener(dVar);
        this.f8258A.setOnTouchListener(dVar);
    }

    public final void y() {
        if (this.f8261D.getVisibility() == 0) {
            androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
            cVar.g(this);
            cVar.e(V1.e.f3061f, C.x(this) == 0 ? 2 : 1);
            cVar.c(this);
        }
    }

    public TimePickerView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f8262E = new a();
        LayoutInflater.from(context).inflate(V1.g.f3093k, this);
        this.f8260C = (ClockFaceView) findViewById(V1.e.f3062g);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(V1.e.f3064i);
        this.f8261D = materialButtonToggleGroup;
        materialButtonToggleGroup.g(new b());
        this.f8263z = (Chip) findViewById(V1.e.f3067l);
        this.f8258A = (Chip) findViewById(V1.e.f3065j);
        this.f8259B = (ClockHandView) findViewById(V1.e.f3063h);
        x();
        w();
    }
}
