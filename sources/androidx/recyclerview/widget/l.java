package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

public abstract class l {
    public static int a(RecyclerView.z zVar, i iVar, View view, View view2, RecyclerView.o oVar, boolean z4) {
        if (oVar.J() == 0 || zVar.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z4) {
            return Math.abs(oVar.h0(view) - oVar.h0(view2)) + 1;
        }
        return Math.min(iVar.n(), iVar.d(view2) - iVar.g(view));
    }

    public static int b(RecyclerView.z zVar, i iVar, View view, View view2, RecyclerView.o oVar, boolean z4, boolean z5) {
        if (oVar.J() == 0 || zVar.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int max = z5 ? Math.max(0, (zVar.b() - Math.max(oVar.h0(view), oVar.h0(view2))) - 1) : Math.max(0, Math.min(oVar.h0(view), oVar.h0(view2)));
        if (!z4) {
            return max;
        }
        return Math.round((((float) max) * (((float) Math.abs(iVar.d(view2) - iVar.g(view))) / ((float) (Math.abs(oVar.h0(view) - oVar.h0(view2)) + 1)))) + ((float) (iVar.m() - iVar.g(view))));
    }

    public static int c(RecyclerView.z zVar, i iVar, View view, View view2, RecyclerView.o oVar, boolean z4) {
        if (oVar.J() == 0 || zVar.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z4) {
            return zVar.b();
        }
        return (int) ((((float) (iVar.d(view2) - iVar.g(view))) / ((float) (Math.abs(oVar.h0(view) - oVar.h0(view2)) + 1))) * ((float) zVar.b()));
    }
}
