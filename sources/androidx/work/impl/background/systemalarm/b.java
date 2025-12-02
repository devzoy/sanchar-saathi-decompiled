package androidx.work.impl.background.systemalarm;

import Q0.i;
import V0.c;
import V0.e;
import Z0.u;
import Z0.x;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.d;
import java.util.ArrayList;
import java.util.List;

public class b {

    /* renamed from: e  reason: collision with root package name */
    public static final String f6160e = i.i("ConstraintsCmdHandler");

    /* renamed from: a  reason: collision with root package name */
    public final Context f6161a;

    /* renamed from: b  reason: collision with root package name */
    public final int f6162b;

    /* renamed from: c  reason: collision with root package name */
    public final d f6163c;

    /* renamed from: d  reason: collision with root package name */
    public final e f6164d;

    public b(Context context, int i4, d dVar) {
        this.f6161a = context;
        this.f6162b = i4;
        this.f6163c = dVar;
        this.f6164d = new e(dVar.g().p(), (c) null);
    }

    public void a() {
        List<u> s4 = this.f6163c.g().q().J().s();
        ConstraintProxy.a(this.f6161a, s4);
        this.f6164d.a(s4);
        ArrayList<u> arrayList = new ArrayList<>(s4.size());
        long currentTimeMillis = System.currentTimeMillis();
        for (u uVar : s4) {
            String str = uVar.f3834a;
            if (currentTimeMillis >= uVar.a() && (!uVar.f() || this.f6164d.e(str))) {
                arrayList.add(uVar);
            }
        }
        for (u uVar2 : arrayList) {
            String str2 = uVar2.f3834a;
            Intent b4 = a.b(this.f6161a, x.a(uVar2));
            i e4 = i.e();
            String str3 = f6160e;
            e4.a(str3, "Creating a delay_met command for workSpec with id (" + str2 + ")");
            this.f6163c.f().a().execute(new d.b(this.f6163c, b4, this.f6162b));
        }
        this.f6164d.d();
    }
}
