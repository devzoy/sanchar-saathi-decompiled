package u1;

import F1.a;
import F1.b;
import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import z1.C1032o;
import z1.g0;
import z1.h0;

public abstract class t extends g0 {

    /* renamed from: c  reason: collision with root package name */
    public final int f12333c;

    public t(byte[] bArr) {
        C1032o.a(bArr.length == 25);
        this.f12333c = Arrays.hashCode(bArr);
    }

    public static byte[] J(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e4) {
            throw new AssertionError(e4);
        }
    }

    public abstract byte[] I();

    public final int c() {
        return this.f12333c;
    }

    public final a e() {
        return b.K(I());
    }

    public final boolean equals(Object obj) {
        a e4;
        if (obj != null && (obj instanceof h0)) {
            try {
                h0 h0Var = (h0) obj;
                if (h0Var.c() != this.f12333c || (e4 = h0Var.e()) == null) {
                    return false;
                }
                return Arrays.equals(I(), (byte[]) b.J(e4));
            } catch (RemoteException e5) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e5);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f12333c;
    }
}
