package o;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.d;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.i;

/* renamed from: o.d  reason: case insensitive filesystem */
public abstract class C0811d implements C0813f, i, AdapterView.OnItemClickListener {

    /* renamed from: c  reason: collision with root package name */
    public Rect f11313c;

    public static int o(ListAdapter listAdapter, ViewGroup viewGroup, Context context, int i4) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i5 = 0;
        int i6 = 0;
        View view = null;
        for (int i7 = 0; i7 < count; i7++) {
            int itemViewType = listAdapter.getItemViewType(i7);
            if (itemViewType != i6) {
                view = null;
                i6 = itemViewType;
            }
            if (viewGroup == null) {
                viewGroup = new FrameLayout(context);
            }
            view = listAdapter.getView(i7, view, viewGroup);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i4) {
                return i4;
            }
            if (measuredWidth > i5) {
                i5 = measuredWidth;
            }
        }
        return i5;
    }

    public static boolean x(e eVar) {
        int size = eVar.size();
        for (int i4 = 0; i4 < size; i4++) {
            MenuItem item = eVar.getItem(i4);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    public static d y(ListAdapter listAdapter) {
        return listAdapter instanceof HeaderViewListAdapter ? (d) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (d) listAdapter;
    }

    public void d(Context context, e eVar) {
    }

    public boolean i(e eVar, g gVar) {
        return false;
    }

    public boolean j(e eVar, g gVar) {
        return false;
    }

    public abstract void l(e eVar);

    public boolean m() {
        return true;
    }

    public Rect n() {
        return this.f11313c;
    }

    public void onItemClick(AdapterView adapterView, View view, int i4, long j4) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        y(listAdapter).f4254c.M((MenuItem) listAdapter.getItem(i4), this, m() ? 0 : 4);
    }

    public abstract void p(View view);

    public void q(Rect rect) {
        this.f11313c = rect;
    }

    public abstract void r(boolean z4);

    public abstract void s(int i4);

    public abstract void t(int i4);

    public abstract void u(PopupWindow.OnDismissListener onDismissListener);

    public abstract void v(boolean z4);

    public abstract void w(int i4);
}
