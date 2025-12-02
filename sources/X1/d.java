package X1;

import S.C;
import android.view.View;

public class d {

    /* renamed from: a  reason: collision with root package name */
    public final View f3479a;

    /* renamed from: b  reason: collision with root package name */
    public int f3480b;

    /* renamed from: c  reason: collision with root package name */
    public int f3481c;

    /* renamed from: d  reason: collision with root package name */
    public int f3482d;

    /* renamed from: e  reason: collision with root package name */
    public int f3483e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f3484f = true;

    /* renamed from: g  reason: collision with root package name */
    public boolean f3485g = true;

    public d(View view) {
        this.f3479a = view;
    }

    public void a() {
        View view = this.f3479a;
        C.S(view, this.f3482d - (view.getTop() - this.f3480b));
        View view2 = this.f3479a;
        C.R(view2, this.f3483e - (view2.getLeft() - this.f3481c));
    }

    public int b() {
        return this.f3482d;
    }

    public void c() {
        this.f3480b = this.f3479a.getTop();
        this.f3481c = this.f3479a.getLeft();
    }

    public boolean d(int i4) {
        if (!this.f3485g || this.f3483e == i4) {
            return false;
        }
        this.f3483e = i4;
        a();
        return true;
    }

    public boolean e(int i4) {
        if (!this.f3484f || this.f3482d == i4) {
            return false;
        }
        this.f3482d = i4;
        a();
        return true;
    }
}
