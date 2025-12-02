package X2;

import Y2.a;
import Y2.e;
import android.os.Build;
import android.util.DisplayMetrics;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;

public class u {

    /* renamed from: b  reason: collision with root package name */
    public static final a f3637b = new a();

    /* renamed from: a  reason: collision with root package name */
    public final Y2.a f3638a;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final ConcurrentLinkedQueue f3639a = new ConcurrentLinkedQueue();

        /* renamed from: b  reason: collision with root package name */
        public b f3640b;

        /* renamed from: c  reason: collision with root package name */
        public b f3641c;

        /* renamed from: X2.u$a$a  reason: collision with other inner class name */
        public class C0067a implements a.e {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ b f3642a;

            public C0067a(b bVar) {
                this.f3642a = bVar;
            }

            public void a(Object obj) {
                a.this.f3639a.remove(this.f3642a);
                if (!a.this.f3639a.isEmpty()) {
                    M2.b.b("SettingsChannel", "The queue becomes empty after removing config generation " + String.valueOf(this.f3642a.f3645a));
                }
            }
        }

        public static class b {

            /* renamed from: c  reason: collision with root package name */
            public static int f3644c = Integer.MIN_VALUE;

            /* renamed from: a  reason: collision with root package name */
            public final int f3645a;

            /* renamed from: b  reason: collision with root package name */
            public final DisplayMetrics f3646b;

            public b(DisplayMetrics displayMetrics) {
                int i4 = f3644c;
                f3644c = i4 + 1;
                this.f3645a = i4;
                this.f3646b = displayMetrics;
            }
        }

        public a.e b(b bVar) {
            this.f3639a.add(bVar);
            b bVar2 = this.f3641c;
            this.f3641c = bVar;
            if (bVar2 == null) {
                return null;
            }
            return new C0067a(bVar2);
        }

        public b c(int i4) {
            b bVar;
            if (this.f3640b == null) {
                this.f3640b = (b) this.f3639a.poll();
            }
            while (true) {
                bVar = this.f3640b;
                if (bVar != null && bVar.f3645a < i4) {
                    this.f3640b = (b) this.f3639a.poll();
                }
            }
            if (bVar == null) {
                M2.b.b("SettingsChannel", "Cannot find config with generation: " + String.valueOf(i4) + ", after exhausting the queue.");
                return null;
            } else if (bVar.f3645a == i4) {
                return bVar;
            } else {
                M2.b.b("SettingsChannel", "Cannot find config with generation: " + String.valueOf(i4) + ", the oldest config is now: " + String.valueOf(this.f3640b.f3645a));
                return null;
            }
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final Y2.a f3647a;

        /* renamed from: b  reason: collision with root package name */
        public Map f3648b = new HashMap();

        /* renamed from: c  reason: collision with root package name */
        public DisplayMetrics f3649c;

        public b(Y2.a aVar) {
            this.f3647a = aVar;
        }

        public void a() {
            M2.b.f("SettingsChannel", "Sending message: \ntextScaleFactor: " + this.f3648b.get("textScaleFactor") + "\nalwaysUse24HourFormat: " + this.f3648b.get("alwaysUse24HourFormat") + "\nplatformBrightness: " + this.f3648b.get("platformBrightness"));
            DisplayMetrics displayMetrics = this.f3649c;
            if (!u.c() || displayMetrics == null) {
                this.f3647a.c(this.f3648b);
                return;
            }
            a.b bVar = new a.b(displayMetrics);
            a.e b4 = u.f3637b.b(bVar);
            this.f3648b.put("configurationId", Integer.valueOf(bVar.f3645a));
            this.f3647a.d(this.f3648b, b4);
        }

        public b b(boolean z4) {
            this.f3648b.put("brieflyShowPassword", Boolean.valueOf(z4));
            return this;
        }

        public b c(DisplayMetrics displayMetrics) {
            this.f3649c = displayMetrics;
            return this;
        }

        public b d(boolean z4) {
            this.f3648b.put("nativeSpellCheckServiceDefined", Boolean.valueOf(z4));
            return this;
        }

        public b e(c cVar) {
            this.f3648b.put("platformBrightness", cVar.f3653e);
            return this;
        }

        public b f(float f4) {
            this.f3648b.put("textScaleFactor", Float.valueOf(f4));
            return this;
        }

        public b g(boolean z4) {
            this.f3648b.put("alwaysUse24HourFormat", Boolean.valueOf(z4));
            return this;
        }
    }

    public enum c {
        light("light"),
        dark("dark");
        

        /* renamed from: e  reason: collision with root package name */
        public String f3653e;

        /* access modifiers changed from: public */
        c(String str) {
            this.f3653e = str;
        }
    }

    public u(P2.a aVar) {
        this.f3638a = new Y2.a(aVar, "flutter/settings", e.f3764a);
    }

    public static DisplayMetrics b(int i4) {
        a.b c4 = f3637b.c(i4);
        if (c4 == null) {
            return null;
        }
        return c4.f3646b;
    }

    public static boolean c() {
        return Build.VERSION.SDK_INT >= 34;
    }

    public b d() {
        return new b(this.f3638a);
    }
}
