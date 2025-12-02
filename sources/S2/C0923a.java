package s2;

import com.google.android.gms.common.api.Status;
import java.util.Locale;
import t2.C0933a;
import v1.C0948b;

/* renamed from: s2.a  reason: case insensitive filesystem */
public class C0923a extends C0948b {
    public C0923a(int i4) {
        super(new Status(i4, String.format(Locale.getDefault(), "Install Error(%d): %s", new Object[]{Integer.valueOf(i4), C0933a.a(i4)})));
        if (i4 == 0) {
            throw new IllegalArgumentException("errorCode should not be 0.");
        }
    }
}
