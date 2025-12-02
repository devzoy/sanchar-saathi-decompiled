package r1;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;
import z1.C1032o;

/* renamed from: r1.a  reason: case insensitive filesystem */
public class C0916a {

    /* renamed from: c  reason: collision with root package name */
    public static final Lock f11979c = new ReentrantLock();

    /* renamed from: d  reason: collision with root package name */
    public static C0916a f11980d;

    /* renamed from: a  reason: collision with root package name */
    public final Lock f11981a = new ReentrantLock();

    /* renamed from: b  reason: collision with root package name */
    public final SharedPreferences f11982b;

    public C0916a(Context context) {
        this.f11982b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public static C0916a a(Context context) {
        C1032o.f(context);
        Lock lock = f11979c;
        lock.lock();
        try {
            if (f11980d == null) {
                f11980d = new C0916a(context.getApplicationContext());
            }
            C0916a aVar = f11980d;
            lock.unlock();
            return aVar;
        } catch (Throwable th) {
            f11979c.unlock();
            throw th;
        }
    }

    public static final String d(String str, String str2) {
        StringBuilder sb = new StringBuilder(str.length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        return sb.toString();
    }

    public GoogleSignInAccount b() {
        String c4;
        String c5 = c("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(c5) || (c4 = c(d("googleSignInAccount", c5))) == null) {
            return null;
        }
        try {
            return GoogleSignInAccount.r(c4);
        } catch (JSONException unused) {
            return null;
        }
    }

    public final String c(String str) {
        this.f11981a.lock();
        try {
            return this.f11982b.getString(str, (String) null);
        } finally {
            this.f11981a.unlock();
        }
    }
}
