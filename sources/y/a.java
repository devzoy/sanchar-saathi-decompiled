package Y;

import Y.b;
import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;

public abstract class a extends BaseAdapter implements Filterable, b.a {

    /* renamed from: c  reason: collision with root package name */
    public boolean f3708c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f3709d;

    /* renamed from: e  reason: collision with root package name */
    public Cursor f3710e;

    /* renamed from: f  reason: collision with root package name */
    public Context f3711f;

    /* renamed from: g  reason: collision with root package name */
    public int f3712g;

    /* renamed from: h  reason: collision with root package name */
    public C0068a f3713h;

    /* renamed from: i  reason: collision with root package name */
    public DataSetObserver f3714i;

    /* renamed from: j  reason: collision with root package name */
    public b f3715j;

    /* renamed from: Y.a$a  reason: collision with other inner class name */
    public class C0068a extends ContentObserver {
        public C0068a() {
            super(new Handler());
        }

        public boolean deliverSelfNotifications() {
            return true;
        }

        public void onChange(boolean z4) {
            a.this.i();
        }
    }

    public class b extends DataSetObserver {
        public b() {
        }

        public void onChanged() {
            a aVar = a.this;
            aVar.f3708c = true;
            aVar.notifyDataSetChanged();
        }

        public void onInvalidated() {
            a aVar = a.this;
            aVar.f3708c = false;
            aVar.notifyDataSetInvalidated();
        }
    }

    public a(Context context, Cursor cursor, boolean z4) {
        f(context, cursor, z4 ? 1 : 2);
    }

    public void a(Cursor cursor) {
        Cursor j4 = j(cursor);
        if (j4 != null) {
            j4.close();
        }
    }

    public Cursor b() {
        return this.f3710e;
    }

    public abstract CharSequence c(Cursor cursor);

    public abstract void e(View view, Context context, Cursor cursor);

    public void f(Context context, Cursor cursor, int i4) {
        boolean z4 = false;
        if ((i4 & 1) == 1) {
            i4 |= 2;
            this.f3709d = true;
        } else {
            this.f3709d = false;
        }
        if (cursor != null) {
            z4 = true;
        }
        this.f3710e = cursor;
        this.f3708c = z4;
        this.f3711f = context;
        this.f3712g = z4 ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i4 & 2) == 2) {
            this.f3713h = new C0068a();
            this.f3714i = new b();
        } else {
            this.f3713h = null;
            this.f3714i = null;
        }
        if (z4) {
            C0068a aVar = this.f3713h;
            if (aVar != null) {
                cursor.registerContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.f3714i;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    public abstract View g(Context context, Cursor cursor, ViewGroup viewGroup);

    public int getCount() {
        Cursor cursor;
        if (!this.f3708c || (cursor = this.f3710e) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    public View getDropDownView(int i4, View view, ViewGroup viewGroup) {
        if (!this.f3708c) {
            return null;
        }
        this.f3710e.moveToPosition(i4);
        if (view == null) {
            view = g(this.f3711f, this.f3710e, viewGroup);
        }
        e(view, this.f3711f, this.f3710e);
        return view;
    }

    public Filter getFilter() {
        if (this.f3715j == null) {
            this.f3715j = new b(this);
        }
        return this.f3715j;
    }

    public Object getItem(int i4) {
        Cursor cursor;
        if (!this.f3708c || (cursor = this.f3710e) == null) {
            return null;
        }
        cursor.moveToPosition(i4);
        return this.f3710e;
    }

    public long getItemId(int i4) {
        Cursor cursor;
        if (!this.f3708c || (cursor = this.f3710e) == null || !cursor.moveToPosition(i4)) {
            return 0;
        }
        return this.f3710e.getLong(this.f3712g);
    }

    public View getView(int i4, View view, ViewGroup viewGroup) {
        if (!this.f3708c) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        } else if (this.f3710e.moveToPosition(i4)) {
            if (view == null) {
                view = h(this.f3711f, this.f3710e, viewGroup);
            }
            e(view, this.f3711f, this.f3710e);
            return view;
        } else {
            throw new IllegalStateException("couldn't move cursor to position " + i4);
        }
    }

    public abstract View h(Context context, Cursor cursor, ViewGroup viewGroup);

    public void i() {
        Cursor cursor;
        if (this.f3709d && (cursor = this.f3710e) != null && !cursor.isClosed()) {
            this.f3708c = this.f3710e.requery();
        }
    }

    public Cursor j(Cursor cursor) {
        Cursor cursor2 = this.f3710e;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            C0068a aVar = this.f3713h;
            if (aVar != null) {
                cursor2.unregisterContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.f3714i;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f3710e = cursor;
        if (cursor != null) {
            C0068a aVar2 = this.f3713h;
            if (aVar2 != null) {
                cursor.registerContentObserver(aVar2);
            }
            DataSetObserver dataSetObserver2 = this.f3714i;
            if (dataSetObserver2 != null) {
                cursor.registerDataSetObserver(dataSetObserver2);
            }
            this.f3712g = cursor.getColumnIndexOrThrow("_id");
            this.f3708c = true;
            notifyDataSetChanged();
        } else {
            this.f3712g = -1;
            this.f3708c = false;
            notifyDataSetInvalidated();
        }
        return cursor2;
    }
}
