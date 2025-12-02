package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.a;
import androidx.appcompat.view.menu.i;
import h.g;

public class f implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, i.a {

    /* renamed from: c  reason: collision with root package name */
    public e f4287c;

    /* renamed from: d  reason: collision with root package name */
    public a f4288d;

    /* renamed from: e  reason: collision with root package name */
    public c f4289e;

    /* renamed from: f  reason: collision with root package name */
    public i.a f4290f;

    public f(e eVar) {
        this.f4287c = eVar;
    }

    public void a() {
        a aVar = this.f4288d;
        if (aVar != null) {
            aVar.dismiss();
        }
    }

    public void b(e eVar, boolean z4) {
        if (z4 || eVar == this.f4287c) {
            a();
        }
        i.a aVar = this.f4290f;
        if (aVar != null) {
            aVar.b(eVar, z4);
        }
    }

    public boolean c(e eVar) {
        i.a aVar = this.f4290f;
        if (aVar != null) {
            return aVar.c(eVar);
        }
        return false;
    }

    public void d(IBinder iBinder) {
        e eVar = this.f4287c;
        a.C0082a aVar = new a.C0082a(eVar.u());
        c cVar = new c(aVar.b(), g.f9304j);
        this.f4289e = cVar;
        cVar.k(this);
        this.f4287c.b(this.f4289e);
        aVar.c(this.f4289e.a(), this);
        View y4 = eVar.y();
        if (y4 != null) {
            aVar.d(y4);
        } else {
            aVar.e(eVar.w()).h(eVar.x());
        }
        aVar.f(this);
        a a4 = aVar.a();
        this.f4288d = a4;
        a4.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.f4288d.getWindow().getAttributes();
        attributes.type = 1003;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.f4288d.show();
    }

    public void onClick(DialogInterface dialogInterface, int i4) {
        this.f4287c.L((g) this.f4289e.a().getItem(i4), 0);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        this.f4289e.b(this.f4287c, true);
    }

    public boolean onKey(DialogInterface dialogInterface, int i4, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i4 == 82 || i4 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f4288d.getWindow();
                if (!(window2 == null || (decorView2 = window2.getDecorView()) == null || (keyDispatcherState2 = decorView2.getKeyDispatcherState()) == null)) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f4288d.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f4287c.e(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f4287c.performShortcut(i4, keyEvent, 0);
    }
}
