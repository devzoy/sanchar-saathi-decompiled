package w1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import z1.C1032o;

/* renamed from: w1.g  reason: case insensitive filesystem */
public abstract class C0974g {

    /* renamed from: c  reason: collision with root package name */
    public final C0975h f12612c;

    public C0974g(C0975h hVar) {
        this.f12612c = hVar;
    }

    public static C0975h c(Activity activity) {
        return d(new C0973f(activity));
    }

    public static C0975h d(C0973f fVar) {
        if (fVar.a()) {
            return f0.E1(fVar.d());
        }
        if (fVar.b()) {
            return c0.b(fVar.c());
        }
        throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
    }

    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public Activity b() {
        Activity d4 = this.f12612c.d();
        C1032o.f(d4);
        return d4;
    }

    public abstract void e(int i4, int i5, Intent intent);

    public void f(Bundle bundle) {
    }

    public void g() {
    }

    public void h() {
    }

    public void i(Bundle bundle) {
    }

    public void j() {
    }

    public void k() {
    }
}
