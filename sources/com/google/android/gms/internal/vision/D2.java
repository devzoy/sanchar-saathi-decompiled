package com.google.android.gms.internal.vision;

import S1.d;
import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;

public abstract class D2 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f7207a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f7208b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public final String f7209c;

    /* renamed from: d  reason: collision with root package name */
    public final String f7210d;

    /* renamed from: e  reason: collision with root package name */
    public final String f7211e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f7212f = false;

    /* renamed from: g  reason: collision with root package name */
    public boolean f7213g = false;

    /* renamed from: h  reason: collision with root package name */
    public Object f7214h;

    public D2(Context context, String str, String str2) {
        this.f7207a = context;
        this.f7209c = str;
        String valueOf = String.valueOf(str2);
        this.f7210d = valueOf.length() != 0 ? "com.google.android.gms.vision.dynamite.".concat(valueOf) : new String("com.google.android.gms.vision.dynamite.");
        this.f7211e = str2;
    }

    public abstract Object a(DynamiteModule dynamiteModule, Context context);

    public abstract void b();

    public final boolean c() {
        return e() != null;
    }

    public final void d() {
        synchronized (this.f7208b) {
            if (this.f7214h != null) {
                try {
                    b();
                } catch (RemoteException e4) {
                    Log.e(this.f7209c, "Could not finalize native handle", e4);
                }
            }
        }
    }

    public final Object e() {
        DynamiteModule dynamiteModule;
        synchronized (this.f7208b) {
            Object obj = this.f7214h;
            if (obj != null) {
                return obj;
            }
            try {
                dynamiteModule = DynamiteModule.c(this.f7207a, DynamiteModule.f6683g, this.f7210d);
            } catch (DynamiteModule.a unused) {
                String format = String.format("%s.%s", new Object[]{"com.google.android.gms.vision", this.f7211e});
                d.a("Cannot load thick client module, fall back to load optional module %s", format);
                try {
                    dynamiteModule = DynamiteModule.c(this.f7207a, DynamiteModule.f6678b, format);
                } catch (DynamiteModule.a e4) {
                    d.c(e4, "Error loading optional module %s", format);
                    if (!this.f7212f) {
                        d.a("Broadcasting download intent for dependency %s", this.f7211e);
                        String str = this.f7211e;
                        Intent intent = new Intent();
                        intent.setClassName("com.google.android.gms", "com.google.android.gms.vision.DependencyBroadcastReceiverProxy");
                        intent.putExtra("com.google.android.gms.vision.DEPENDENCIES", str);
                        intent.setAction("com.google.android.gms.vision.DEPENDENCY");
                        this.f7207a.sendBroadcast(intent);
                        this.f7212f = true;
                    }
                    dynamiteModule = null;
                }
            }
            if (dynamiteModule != null) {
                try {
                    this.f7214h = a(dynamiteModule, this.f7207a);
                } catch (RemoteException | DynamiteModule.a e5) {
                    Log.e(this.f7209c, "Error creating remote native handle", e5);
                }
            }
            boolean z4 = this.f7213g;
            if (!z4 && this.f7214h == null) {
                Log.w(this.f7209c, "Native handle not yet available. Reverting to no-op handle.");
                this.f7213g = true;
            } else if (z4 && this.f7214h != null) {
                Log.w(this.f7209c, "Native handle is now available.");
            }
            Object obj2 = this.f7214h;
            return obj2;
        }
    }
}
