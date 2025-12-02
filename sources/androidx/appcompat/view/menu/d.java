package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.j;
import java.util.ArrayList;

public class d extends BaseAdapter {

    /* renamed from: c  reason: collision with root package name */
    public e f4254c;

    /* renamed from: d  reason: collision with root package name */
    public int f4255d = -1;

    /* renamed from: e  reason: collision with root package name */
    public boolean f4256e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f4257f;

    /* renamed from: g  reason: collision with root package name */
    public final LayoutInflater f4258g;

    /* renamed from: h  reason: collision with root package name */
    public final int f4259h;

    public d(e eVar, LayoutInflater layoutInflater, boolean z4, int i4) {
        this.f4257f = z4;
        this.f4258g = layoutInflater;
        this.f4254c = eVar;
        this.f4259h = i4;
        a();
    }

    public void a() {
        g v4 = this.f4254c.v();
        if (v4 != null) {
            ArrayList z4 = this.f4254c.z();
            int size = z4.size();
            for (int i4 = 0; i4 < size; i4++) {
                if (((g) z4.get(i4)) == v4) {
                    this.f4255d = i4;
                    return;
                }
            }
        }
        this.f4255d = -1;
    }

    public e b() {
        return this.f4254c;
    }

    /* renamed from: c */
    public g getItem(int i4) {
        ArrayList z4 = this.f4257f ? this.f4254c.z() : this.f4254c.E();
        int i5 = this.f4255d;
        if (i5 >= 0 && i4 >= i5) {
            i4++;
        }
        return (g) z4.get(i4);
    }

    public void d(boolean z4) {
        this.f4256e = z4;
    }

    public int getCount() {
        ArrayList z4 = this.f4257f ? this.f4254c.z() : this.f4254c.E();
        return this.f4255d < 0 ? z4.size() : z4.size() - 1;
    }

    public long getItemId(int i4) {
        return (long) i4;
    }

    public View getView(int i4, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f4258g.inflate(this.f4259h, viewGroup, false);
        }
        int groupId = getItem(i4).getGroupId();
        int i5 = i4 - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f4254c.F() && groupId != (i5 >= 0 ? getItem(i5).getGroupId() : groupId));
        j.a aVar = (j.a) view;
        if (this.f4256e) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.e(getItem(i4), 0);
        return view;
    }

    public void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
