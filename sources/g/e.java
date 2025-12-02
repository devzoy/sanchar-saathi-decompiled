package G;

import S.C0318i;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.C0380g;
import androidx.lifecycle.C0384k;
import androidx.lifecycle.l;
import androidx.lifecycle.x;
import v.g;

public abstract class e extends Activity implements C0384k, C0318i.a {

    /* renamed from: c  reason: collision with root package name */
    public final g f1092c = new g();

    /* renamed from: d  reason: collision with root package name */
    public final l f1093d = new l(this);

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        v3.l.e(keyEvent, "event");
        View decorView = getWindow().getDecorView();
        v3.l.d(decorView, "window.decorView");
        if (C0318i.a(decorView, keyEvent)) {
            return true;
        }
        return C0318i.b(this, decorView, this, keyEvent);
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        v3.l.e(keyEvent, "event");
        View decorView = getWindow().getDecorView();
        v3.l.d(decorView, "window.decorView");
        if (C0318i.a(decorView, keyEvent)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    public boolean f(KeyEvent keyEvent) {
        v3.l.e(keyEvent, "event");
        return super.dispatchKeyEvent(keyEvent);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        x.f5434d.c(this);
    }

    public void onSaveInstanceState(Bundle bundle) {
        v3.l.e(bundle, "outState");
        this.f1093d.m(C0380g.b.CREATED);
        super.onSaveInstanceState(bundle);
    }

    public final boolean x(String[] strArr) {
        return !y(strArr);
    }

    public final boolean y(String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            return false;
        }
        String str = strArr[0];
        switch (str.hashCode()) {
            case -645125871:
                return str.equals("--translation") && Build.VERSION.SDK_INT >= 31;
            case 100470631:
                if (!str.equals("--dump-dumpable")) {
                    return false;
                }
                break;
            case 472614934:
                if (!str.equals("--list-dumpables")) {
                    return false;
                }
                break;
            case 1159329357:
                return str.equals("--contentcapture") && Build.VERSION.SDK_INT >= 29;
            case 1455016274:
                return str.equals("--autofill");
            default:
                return false;
        }
        return Build.VERSION.SDK_INT >= 33;
    }
}
