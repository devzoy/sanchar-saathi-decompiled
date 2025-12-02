package com.google.android.material.datepicker;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.g;

public abstract class p extends LinearLayoutManager {

    public class a extends g {
        public a(Context context) {
            super(context);
        }

        public float v(DisplayMetrics displayMetrics) {
            return 100.0f / ((float) displayMetrics.densityDpi);
        }
    }

    public p(Context context, int i4, boolean z4) {
        super(context, i4, z4);
    }

    public void I1(RecyclerView recyclerView, RecyclerView.z zVar, int i4) {
        a aVar = new a(recyclerView.getContext());
        aVar.p(i4);
        J1(aVar);
    }
}
