package Y;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public abstract class c extends a {

    /* renamed from: k  reason: collision with root package name */
    public int f3719k;

    /* renamed from: l  reason: collision with root package name */
    public int f3720l;

    /* renamed from: m  reason: collision with root package name */
    public LayoutInflater f3721m;

    public c(Context context, int i4, Cursor cursor, boolean z4) {
        super(context, cursor, z4);
        this.f3720l = i4;
        this.f3719k = i4;
        this.f3721m = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    public View g(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f3721m.inflate(this.f3720l, viewGroup, false);
    }

    public View h(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f3721m.inflate(this.f3719k, viewGroup, false);
    }
}
