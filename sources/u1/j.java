package u1;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import i0.C0693n;
import i0.I;
import z1.C1032o;

public class j extends C0693n {

    /* renamed from: w0  reason: collision with root package name */
    public Dialog f12328w0;

    /* renamed from: x0  reason: collision with root package name */
    public DialogInterface.OnCancelListener f12329x0;

    /* renamed from: y0  reason: collision with root package name */
    public Dialog f12330y0;

    public static j S1(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        j jVar = new j();
        Dialog dialog2 = (Dialog) C1032o.g(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener((DialogInterface.OnCancelListener) null);
        dialog2.setOnDismissListener((DialogInterface.OnDismissListener) null);
        jVar.f12328w0 = dialog2;
        if (onCancelListener != null) {
            jVar.f12329x0 = onCancelListener;
        }
        return jVar;
    }

    public Dialog K1(Bundle bundle) {
        Dialog dialog = this.f12328w0;
        if (dialog != null) {
            return dialog;
        }
        P1(false);
        if (this.f12330y0 == null) {
            this.f12330y0 = new AlertDialog.Builder((Context) C1032o.f(u())).create();
        }
        return this.f12330y0;
    }

    public void R1(I i4, String str) {
        super.R1(i4, str);
    }

    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f12329x0;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
