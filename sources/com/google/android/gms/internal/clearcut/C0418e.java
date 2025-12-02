package com.google.android.gms.internal.clearcut;

import H.e;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Binder;
import android.os.UserManager;
import android.util.Log;

/* renamed from: com.google.android.gms.internal.clearcut.e  reason: case insensitive filesystem */
public abstract class C0418e {

    /* renamed from: h  reason: collision with root package name */
    public static final Object f7055h = new Object();

    /* renamed from: i  reason: collision with root package name */
    public static Context f7056i = null;

    /* renamed from: j  reason: collision with root package name */
    public static boolean f7057j = false;

    /* renamed from: k  reason: collision with root package name */
    public static volatile Boolean f7058k;

    /* renamed from: l  reason: collision with root package name */
    public static volatile Boolean f7059l;

    /* renamed from: a  reason: collision with root package name */
    public final C0448o f7060a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7061b;

    /* renamed from: c  reason: collision with root package name */
    public final String f7062c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f7063d;

    /* renamed from: e  reason: collision with root package name */
    public Object f7064e;

    /* renamed from: f  reason: collision with root package name */
    public volatile C0412c f7065f;

    /* renamed from: g  reason: collision with root package name */
    public volatile SharedPreferences f7066g;

    public C0418e(C0448o oVar, String str, Object obj) {
        this.f7064e = null;
        this.f7065f = null;
        this.f7066g = null;
        if (oVar.f7146a == null && oVar.f7147b == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        } else if (oVar.f7146a == null || oVar.f7147b == null) {
            this.f7060a = oVar;
            String valueOf = String.valueOf(oVar.f7148c);
            String valueOf2 = String.valueOf(str);
            this.f7062c = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
            String valueOf3 = String.valueOf(oVar.f7149d);
            String valueOf4 = String.valueOf(str);
            this.f7061b = valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3);
            this.f7063d = obj;
        } else {
            throw new IllegalArgumentException("Must pass one of SharedPreferences file name or ContentProvider URI");
        }
    }

    public static void b(Context context) {
        if (f7056i == null) {
            synchronized (f7055h) {
                try {
                    if (!context.isDeviceProtectedStorage()) {
                        Context applicationContext = context.getApplicationContext();
                        if (applicationContext != null) {
                            context = applicationContext;
                        }
                    }
                    if (f7056i != context) {
                        f7058k = null;
                    }
                    f7056i = context;
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
            f7057j = false;
        }
    }

    public static C0418e c(C0448o oVar, String str, Object obj, C0445n nVar) {
        return new C0439l(oVar, str, obj, nVar);
    }

    public static C0418e d(C0448o oVar, String str, String str2) {
        return new C0436k(oVar, str, str2);
    }

    public static C0418e e(C0448o oVar, String str, boolean z4) {
        return new C0433j(oVar, str, Boolean.valueOf(z4));
    }

    public static Object g(C0442m mVar) {
        long clearCallingIdentity;
        try {
            return mVar.a();
        } catch (SecurityException unused) {
            clearCallingIdentity = Binder.clearCallingIdentity();
            Object a4 = mVar.a();
            Binder.restoreCallingIdentity(clearCallingIdentity);
            return a4;
        } catch (Throwable th) {
            Binder.restoreCallingIdentity(clearCallingIdentity);
            throw th;
        }
    }

    public static boolean h(String str, boolean z4) {
        if (p()) {
            return ((Boolean) g(new C0427h(str, false))).booleanValue();
        }
        return false;
    }

    public static boolean p() {
        if (f7058k == null) {
            Context context = f7056i;
            boolean z4 = false;
            if (context == null) {
                return false;
            }
            if (e.a(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0) {
                z4 = true;
            }
            f7058k = Boolean.valueOf(z4);
        }
        return f7058k.booleanValue();
    }

    public final Object a() {
        if (f7056i != null) {
            if (this.f7060a.f7151f) {
                Object o4 = o();
                if (o4 != null) {
                    return o4;
                }
                Object n4 = n();
                if (n4 != null) {
                    return n4;
                }
            } else {
                Object n5 = n();
                if (n5 != null) {
                    return n5;
                }
                Object o5 = o();
                if (o5 != null) {
                    return o5;
                }
            }
            return this.f7063d;
        }
        throw new IllegalStateException("Must call PhenotypeFlag.init() first");
    }

    public abstract Object f(SharedPreferences sharedPreferences);

    public abstract Object m(String str);

    public final Object n() {
        boolean z4;
        if (h("gms:phenotype:phenotype_flag:debug_bypass_phenotype", false)) {
            String valueOf = String.valueOf(this.f7061b);
            Log.w("PhenotypeFlag", valueOf.length() != 0 ? "Bypass reading Phenotype values for flag: ".concat(valueOf) : new String("Bypass reading Phenotype values for flag: "));
        } else if (this.f7060a.f7147b != null) {
            if (this.f7065f == null) {
                this.f7065f = C0412c.a(f7056i.getContentResolver(), this.f7060a.f7147b);
            }
            String str = (String) g(new C0421f(this, this.f7065f));
            if (str != null) {
                return m(str);
            }
        } else if (this.f7060a.f7146a != null) {
            if (!f7056i.isDeviceProtectedStorage()) {
                if (f7059l == null || !f7059l.booleanValue()) {
                    f7059l = Boolean.valueOf(((UserManager) f7056i.getSystemService(UserManager.class)).isUserUnlocked());
                }
                z4 = f7059l.booleanValue();
            } else {
                z4 = true;
            }
            if (!z4) {
                return null;
            }
            if (this.f7066g == null) {
                this.f7066g = f7056i.getSharedPreferences(this.f7060a.f7146a, 0);
            }
            SharedPreferences sharedPreferences = this.f7066g;
            if (sharedPreferences.contains(this.f7061b)) {
                return f(sharedPreferences);
            }
        }
        return null;
    }

    public final Object o() {
        String str;
        if (this.f7060a.f7150e || !p() || (str = (String) g(new C0424g(this))) == null) {
            return null;
        }
        return m(str);
    }

    public final /* synthetic */ String q() {
        return Z1.c(f7056i.getContentResolver(), this.f7062c, (String) null);
    }

    public /* synthetic */ C0418e(C0448o oVar, String str, Object obj, C0430i iVar) {
        this(oVar, str, obj);
    }
}
