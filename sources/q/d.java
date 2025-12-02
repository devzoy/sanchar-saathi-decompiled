package Q;

import java.util.Locale;
import net.sqlcipher.database.SQLiteDatabase;

public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    public static final c f2329a = new e((c) null, false);

    /* renamed from: b  reason: collision with root package name */
    public static final c f2330b = new e((c) null, true);

    /* renamed from: c  reason: collision with root package name */
    public static final c f2331c;

    /* renamed from: d  reason: collision with root package name */
    public static final c f2332d;

    /* renamed from: e  reason: collision with root package name */
    public static final c f2333e = new e(a.f2335b, false);

    /* renamed from: f  reason: collision with root package name */
    public static final c f2334f = f.f2340b;

    public static class a implements c {

        /* renamed from: b  reason: collision with root package name */
        public static final a f2335b = new a(true);

        /* renamed from: a  reason: collision with root package name */
        public final boolean f2336a;

        public a(boolean z4) {
            this.f2336a = z4;
        }

        public int a(CharSequence charSequence, int i4, int i5) {
            int i6 = i5 + i4;
            boolean z4 = false;
            while (i4 < i6) {
                int a4 = d.a(Character.getDirectionality(charSequence.charAt(i4)));
                if (a4 != 0) {
                    if (a4 != 1) {
                        continue;
                        i4++;
                    } else if (!this.f2336a) {
                        return 1;
                    }
                } else if (this.f2336a) {
                    return 0;
                }
                z4 = true;
                i4++;
            }
            if (z4) {
                return this.f2336a ? 1 : 0;
            }
            return 2;
        }
    }

    public static class b implements c {

        /* renamed from: a  reason: collision with root package name */
        public static final b f2337a = new b();

        public int a(CharSequence charSequence, int i4, int i5) {
            int i6 = i5 + i4;
            int i7 = 2;
            while (i4 < i6 && i7 == 2) {
                i7 = d.b(Character.getDirectionality(charSequence.charAt(i4)));
                i4++;
            }
            return i7;
        }
    }

    public interface c {
        int a(CharSequence charSequence, int i4, int i5);
    }

    /* renamed from: Q.d$d  reason: collision with other inner class name */
    public static abstract class C0051d implements c {

        /* renamed from: a  reason: collision with root package name */
        public final c f2338a;

        public C0051d(c cVar) {
            this.f2338a = cVar;
        }

        public boolean a(CharSequence charSequence, int i4, int i5) {
            if (charSequence != null && i4 >= 0 && i5 >= 0 && charSequence.length() - i5 >= i4) {
                return this.f2338a == null ? b() : c(charSequence, i4, i5);
            }
            throw new IllegalArgumentException();
        }

        public abstract boolean b();

        public final boolean c(CharSequence charSequence, int i4, int i5) {
            int a4 = this.f2338a.a(charSequence, i4, i5);
            if (a4 == 0) {
                return true;
            }
            if (a4 != 1) {
                return b();
            }
            return false;
        }
    }

    public static class e extends C0051d {

        /* renamed from: b  reason: collision with root package name */
        public final boolean f2339b;

        public e(c cVar, boolean z4) {
            super(cVar);
            this.f2339b = z4;
        }

        public boolean b() {
            return this.f2339b;
        }
    }

    public static class f extends C0051d {

        /* renamed from: b  reason: collision with root package name */
        public static final f f2340b = new f();

        public f() {
            super((c) null);
        }

        public boolean b() {
            return e.a(Locale.getDefault()) == 1;
        }
    }

    static {
        b bVar = b.f2337a;
        f2331c = new e(bVar, false);
        f2332d = new e(bVar, true);
    }

    public static int a(int i4) {
        if (i4 != 0) {
            return (i4 == 1 || i4 == 2) ? 0 : 2;
        }
        return 1;
    }

    public static int b(int i4) {
        if (i4 != 0) {
            if (i4 == 1 || i4 == 2) {
                return 0;
            }
            switch (i4) {
                case 14:
                case 15:
                    break;
                case SQLiteDatabase.NO_LOCALIZED_COLLATORS /*16*/:
                case 17:
                    return 0;
                default:
                    return 2;
            }
        }
        return 1;
    }
}
