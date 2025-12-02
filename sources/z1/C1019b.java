package z1;

import com.google.android.gms.common.api.Status;
import v1.C0948b;
import v1.C0955i;

/* renamed from: z1.b  reason: case insensitive filesystem */
public abstract class C1019b {
    public static C0948b a(Status status) {
        return status.h() ? new C0955i(status) : new C0948b(status);
    }
}
