package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.IBinder;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.j;
import h.g;
import java.util.ArrayList;

public class c implements i, AdapterView.OnItemClickListener {

    /* renamed from: c  reason: collision with root package name */
    public Context f4243c;

    /* renamed from: d  reason: collision with root package name */
    public LayoutInflater f4244d;

    /* renamed from: e  reason: collision with root package name */
    public e f4245e;

    /* renamed from: f  reason: collision with root package name */
    public ExpandedMenuView f4246f;

    /* renamed from: g  reason: collision with root package name */
    public int f4247g;

    /* renamed from: h  reason: collision with root package name */
    public int f4248h;

    /* renamed from: i  reason: collision with root package name */
    public int f4249i;

    /* renamed from: j  reason: collision with root package name */
    public i.a f4250j;

    /* renamed from: k  reason: collision with root package name */
    public a f4251k;

    public class a extends BaseAdapter {

        /* renamed from: c  reason: collision with root package name */
        public int f4252c = -1;

        public a() {
            a();
        }

        public void a() {
            g v4 = c.this.f4245e.v();
            if (v4 != null) {
                ArrayList z4 = c.this.f4245e.z();
                int size = z4.size();
                for (int i4 = 0; i4 < size; i4++) {
                    if (((g) z4.get(i4)) == v4) {
                        this.f4252c = i4;
                        return;
                    }
                }
            }
            this.f4252c = -1;
        }

        /* renamed from: b */
        public g getItem(int i4) {
            ArrayList z4 = c.this.f4245e.z();
            int i5 = i4 + c.this.f4247g;
            int i6 = this.f4252c;
            if (i6 >= 0 && i5 >= i6) {
                i5++;
            }
            return (g) z4.get(i5);
        }

        public int getCount() {
            int size = c.this.f4245e.z().size() - c.this.f4247g;
            return this.f4252c < 0 ? size : size - 1;
        }

        public long getItemId(int i4) {
            return (long) i4;
        }

        public View getView(int i4, View view, ViewGroup viewGroup) {
            if (view == null) {
                c cVar = c.this;
                view = cVar.f4244d.inflate(cVar.f4249i, viewGroup, false);
            }
            ((j.a) view).e(getItem(i4), 0);
            return view;
        }

        public void notifyDataSetChanged() {
            a();
            super.notifyDataSetChanged();
        }
    }

    public c(Context context, int i4) {
        this(i4, 0);
        this.f4243c = context;
        this.f4244d = LayoutInflater.from(context);
    }

    public ListAdapter a() {
        if (this.f4251k == null) {
            this.f4251k = new a();
        }
        return this.f4251k;
    }

    public void b(e eVar, boolean z4) {
        i.a aVar = this.f4250j;
        if (aVar != null) {
            aVar.b(eVar, z4);
        }
    }

    public j c(ViewGroup viewGroup) {
        if (this.f4246f == null) {
            this.f4246f = (ExpandedMenuView) this.f4244d.inflate(g.f9301g, viewGroup, false);
            if (this.f4251k == null) {
                this.f4251k = new a();
            }
            this.f4246f.setAdapter(this.f4251k);
            this.f4246f.setOnItemClickListener(this);
        }
        return this.f4246f;
    }

    public void d(Context context, e eVar) {
        if (this.f4248h != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, this.f4248h);
            this.f4243c = contextThemeWrapper;
            this.f4244d = LayoutInflater.from(contextThemeWrapper);
        } else if (this.f4243c != null) {
            this.f4243c = context;
            if (this.f4244d == null) {
                this.f4244d = LayoutInflater.from(context);
            }
        }
        this.f4245e = eVar;
        a aVar = this.f4251k;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    public boolean e(l lVar) {
        if (!lVar.hasVisibleItems()) {
            return false;
        }
        new f(lVar).d((IBinder) null);
        i.a aVar = this.f4250j;
        if (aVar == null) {
            return true;
        }
        aVar.c(lVar);
        return true;
    }

    public void f(boolean z4) {
        a aVar = this.f4251k;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    public boolean h() {
        return false;
    }

    public boolean i(e eVar, g gVar) {
        return false;
    }

    public boolean j(e eVar, g gVar) {
        return false;
    }

    public void k(i.a aVar) {
        this.f4250j = aVar;
    }

    public void onItemClick(AdapterView adapterView, View view, int i4, long j4) {
        this.f4245e.M(this.f4251k.getItem(i4), this, 0);
    }

    public c(int i4, int i5) {
        this.f4249i = i4;
        this.f4248h = i5;
    }
}
