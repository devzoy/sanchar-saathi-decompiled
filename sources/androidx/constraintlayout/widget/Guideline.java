package androidx.constraintlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

public class Guideline extends View {
    public Guideline(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public void draw(Canvas canvas) {
    }

    public void onMeasure(int i4, int i5) {
        setMeasuredDimension(0, 0);
    }

    public void setGuidelineBegin(int i4) {
        ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
        bVar.f4742a = i4;
        setLayoutParams(bVar);
    }

    public void setGuidelineEnd(int i4) {
        ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
        bVar.f4744b = i4;
        setLayoutParams(bVar);
    }

    public void setGuidelinePercent(float f4) {
        ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
        bVar.f4746c = f4;
        setLayoutParams(bVar);
    }

    public void setVisibility(int i4) {
    }

    public Guideline(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }
}
