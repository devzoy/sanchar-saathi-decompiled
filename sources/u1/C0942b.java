package u1;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import z1.C1032o;

/* renamed from: u1.b  reason: case insensitive filesystem */
public class C0942b extends DialogFragment {

    /* renamed from: c  reason: collision with root package name */
    public Dialog f12309c;

    /* renamed from: d  reason: collision with root package name */
    public DialogInterface.OnCancelListener f12310d;

    /* renamed from: e  reason: collision with root package name */
    public Dialog f12311e;

    public static C0942b a(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        C0942b bVar = new C0942b();
        Dialog dialog2 = (Dialog) C1032o.g(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener((DialogInterface.OnCancelListener) null);
        dialog2.setOnDismissListener((DialogInterface.OnDismissListener) null);
        bVar.f12309c = dialog2;
        if (onCancelListener != null) {
            bVar.f12310d = onCancelListener;
        }
        return bVar;
    }

    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f12310d;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    public Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f12309c;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.f12311e == null) {
            this.f12311e = new AlertDialog.Builder((Context) C1032o.f(getActivity())).create();
        }
        return this.f12311e;
    }

    public void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}
