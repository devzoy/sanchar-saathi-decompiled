package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.N0;

/* renamed from: com.google.android.gms.internal.vision.j  reason: case insensitive filesystem */
public final class C0515j extends N0 implements C0552v1 {
    /* access modifiers changed from: private */
    public static final C0515j zzf;
    private static volatile E1 zzg;
    private int zzc;
    private String zzd = "";
    private String zze = "";

    /* renamed from: com.google.android.gms.internal.vision.j$a */
    public static final class a extends N0.b implements C0552v1 {
        public a() {
            super(C0515j.zzf);
        }

        public final a t(String str) {
            if (this.f7314g) {
                p();
                this.f7314g = false;
            }
            ((C0515j) this.f7313f).y(str);
            return this;
        }

        public final a u(String str) {
            if (this.f7314g) {
                p();
                this.f7314g = false;
            }
            ((C0515j) this.f7313f).B(str);
            return this;
        }

        public /* synthetic */ a(C0562z zVar) {
            this();
        }
    }

    static {
        C0515j jVar = new C0515j();
        zzf = jVar;
        N0.q(C0515j.class, jVar);
    }

    public static a w() {
        return (a) zzf.s();
    }

    public final void B(String str) {
        str.getClass();
        this.zzc |= 2;
        this.zze = str;
    }

    /* JADX WARNING: type inference failed for: r1v14, types: [com.google.android.gms.internal.vision.E1, com.google.android.gms.internal.vision.N0$a] */
    public final Object n(int i4, Object obj, Object obj2) {
        E1 e12;
        switch (C0562z.f7609a[i4 - 1]) {
            case 1:
                return new C0515j();
            case 2:
                return new a((C0562z) null);
            case 3:
                return N0.o(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzc", "zzd", "zze"});
            case 4:
                return zzf;
            case 5:
                E1 e13 = zzg;
                E1 e14 = e13;
                if (e13 == null) {
                    synchronized (C0515j.class) {
                        try {
                            E1 e15 = zzg;
                            e12 = e15;
                            if (e15 == null) {
                                ? aVar = new N0.a(zzf);
                                zzg = aVar;
                                e12 = aVar;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    e14 = e12;
                }
                return e14;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final void y(String str) {
        str.getClass();
        this.zzc |= 1;
        this.zzd = str;
    }
}
