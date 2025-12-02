package Q;

import android.text.SpannableStringBuilder;
import java.util.Locale;
import net.sqlcipher.database.SQLiteDatabase;

public final class a {

    /* renamed from: d  reason: collision with root package name */
    public static final c f2307d;

    /* renamed from: e  reason: collision with root package name */
    public static final String f2308e = Character.toString(8206);

    /* renamed from: f  reason: collision with root package name */
    public static final String f2309f = Character.toString(8207);

    /* renamed from: g  reason: collision with root package name */
    public static final a f2310g;

    /* renamed from: h  reason: collision with root package name */
    public static final a f2311h;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f2312a;

    /* renamed from: b  reason: collision with root package name */
    public final int f2313b;

    /* renamed from: c  reason: collision with root package name */
    public final c f2314c;

    /* renamed from: Q.a$a  reason: collision with other inner class name */
    public static final class C0050a {

        /* renamed from: a  reason: collision with root package name */
        public boolean f2315a;

        /* renamed from: b  reason: collision with root package name */
        public int f2316b;

        /* renamed from: c  reason: collision with root package name */
        public c f2317c;

        public C0050a() {
            c(a.e(Locale.getDefault()));
        }

        public static a b(boolean z4) {
            return z4 ? a.f2311h : a.f2310g;
        }

        public a a() {
            return (this.f2316b == 2 && this.f2317c == a.f2307d) ? b(this.f2315a) : new a(this.f2315a, this.f2316b, this.f2317c);
        }

        public final void c(boolean z4) {
            this.f2315a = z4;
            this.f2317c = a.f2307d;
            this.f2316b = 2;
        }
    }

    public static class b {

        /* renamed from: f  reason: collision with root package name */
        public static final byte[] f2318f = new byte[1792];

        /* renamed from: a  reason: collision with root package name */
        public final CharSequence f2319a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f2320b;

        /* renamed from: c  reason: collision with root package name */
        public final int f2321c;

        /* renamed from: d  reason: collision with root package name */
        public int f2322d;

        /* renamed from: e  reason: collision with root package name */
        public char f2323e;

        static {
            for (int i4 = 0; i4 < 1792; i4++) {
                f2318f[i4] = Character.getDirectionality(i4);
            }
        }

        public b(CharSequence charSequence, boolean z4) {
            this.f2319a = charSequence;
            this.f2320b = z4;
            this.f2321c = charSequence.length();
        }

        public static byte c(char c4) {
            return c4 < 1792 ? f2318f[c4] : Character.getDirectionality(c4);
        }

        public byte a() {
            char charAt = this.f2319a.charAt(this.f2322d - 1);
            this.f2323e = charAt;
            if (Character.isLowSurrogate(charAt)) {
                int codePointBefore = Character.codePointBefore(this.f2319a, this.f2322d);
                this.f2322d -= Character.charCount(codePointBefore);
                return Character.getDirectionality(codePointBefore);
            }
            this.f2322d--;
            byte c4 = c(this.f2323e);
            if (!this.f2320b) {
                return c4;
            }
            char c5 = this.f2323e;
            return c5 == '>' ? h() : c5 == ';' ? f() : c4;
        }

        public byte b() {
            char charAt = this.f2319a.charAt(this.f2322d);
            this.f2323e = charAt;
            if (Character.isHighSurrogate(charAt)) {
                int codePointAt = Character.codePointAt(this.f2319a, this.f2322d);
                this.f2322d += Character.charCount(codePointAt);
                return Character.getDirectionality(codePointAt);
            }
            this.f2322d++;
            byte c4 = c(this.f2323e);
            if (!this.f2320b) {
                return c4;
            }
            char c5 = this.f2323e;
            return c5 == '<' ? i() : c5 == '&' ? g() : c4;
        }

        public int d() {
            this.f2322d = 0;
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            while (this.f2322d < this.f2321c && i4 == 0) {
                byte b4 = b();
                if (b4 != 0) {
                    if (b4 == 1 || b4 == 2) {
                        if (i6 == 0) {
                            return 1;
                        }
                    } else if (b4 != 9) {
                        switch (b4) {
                            case 14:
                            case 15:
                                i6++;
                                i5 = -1;
                                continue;
                            case SQLiteDatabase.NO_LOCALIZED_COLLATORS /*16*/:
                            case 17:
                                i6++;
                                i5 = 1;
                                continue;
                            case 18:
                                i6--;
                                i5 = 0;
                                continue;
                        }
                    }
                } else if (i6 == 0) {
                    return -1;
                }
                i4 = i6;
            }
            if (i4 == 0) {
                return 0;
            }
            if (i5 != 0) {
                return i5;
            }
            while (this.f2322d > 0) {
                switch (a()) {
                    case 14:
                    case 15:
                        if (i4 == i6) {
                            return -1;
                        }
                        break;
                    case SQLiteDatabase.NO_LOCALIZED_COLLATORS /*16*/:
                    case 17:
                        if (i4 == i6) {
                            return 1;
                        }
                        break;
                    case 18:
                        i6++;
                        continue;
                }
                i6--;
            }
            return 0;
        }

        public int e() {
            this.f2322d = this.f2321c;
            int i4 = 0;
            while (true) {
                int i5 = i4;
                while (this.f2322d > 0) {
                    byte a4 = a();
                    if (a4 != 0) {
                        if (a4 == 1 || a4 == 2) {
                            if (i4 == 0) {
                                return 1;
                            }
                            if (i5 == 0) {
                            }
                        } else if (a4 != 9) {
                            switch (a4) {
                                case 14:
                                case 15:
                                    if (i5 == i4) {
                                        return -1;
                                    }
                                    break;
                                case SQLiteDatabase.NO_LOCALIZED_COLLATORS /*16*/:
                                case 17:
                                    if (i5 == i4) {
                                        return 1;
                                    }
                                    break;
                                case 18:
                                    i4++;
                                    break;
                                default:
                                    if (i5 != 0) {
                                        break;
                                    } else {
                                        continue;
                                    }
                            }
                            i4--;
                        } else {
                            continue;
                        }
                    } else if (i4 == 0) {
                        return -1;
                    } else {
                        if (i5 == 0) {
                        }
                    }
                }
                return 0;
            }
        }

        public final byte f() {
            char charAt;
            int i4 = this.f2322d;
            do {
                int i5 = this.f2322d;
                if (i5 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f2319a;
                int i6 = i5 - 1;
                this.f2322d = i6;
                charAt = charSequence.charAt(i6);
                this.f2323e = charAt;
                if (charAt == '&') {
                    return 12;
                }
            } while (charAt != ';');
            this.f2322d = i4;
            this.f2323e = ';';
            return 13;
        }

        public final byte g() {
            char charAt;
            do {
                int i4 = this.f2322d;
                if (i4 >= this.f2321c) {
                    return 12;
                }
                CharSequence charSequence = this.f2319a;
                this.f2322d = i4 + 1;
                charAt = charSequence.charAt(i4);
                this.f2323e = charAt;
            } while (charAt != ';');
            return 12;
        }

        public final byte h() {
            char charAt;
            int i4 = this.f2322d;
            while (true) {
                int i5 = this.f2322d;
                if (i5 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f2319a;
                int i6 = i5 - 1;
                this.f2322d = i6;
                char charAt2 = charSequence.charAt(i6);
                this.f2323e = charAt2;
                if (charAt2 == '<') {
                    return 12;
                }
                if (charAt2 == '>') {
                    break;
                } else if (charAt2 == '\"' || charAt2 == '\'') {
                    do {
                        int i7 = this.f2322d;
                        if (i7 <= 0) {
                            break;
                        }
                        CharSequence charSequence2 = this.f2319a;
                        int i8 = i7 - 1;
                        this.f2322d = i8;
                        charAt = charSequence2.charAt(i8);
                        this.f2323e = charAt;
                    } while (charAt != charAt2);
                }
            }
            this.f2322d = i4;
            this.f2323e = '>';
            return 13;
        }

        public final byte i() {
            char charAt;
            int i4 = this.f2322d;
            while (true) {
                int i5 = this.f2322d;
                if (i5 < this.f2321c) {
                    CharSequence charSequence = this.f2319a;
                    this.f2322d = i5 + 1;
                    char charAt2 = charSequence.charAt(i5);
                    this.f2323e = charAt2;
                    if (charAt2 == '>') {
                        return 12;
                    }
                    if (charAt2 == '\"' || charAt2 == '\'') {
                        do {
                            int i6 = this.f2322d;
                            if (i6 >= this.f2321c) {
                                break;
                            }
                            CharSequence charSequence2 = this.f2319a;
                            this.f2322d = i6 + 1;
                            charAt = charSequence2.charAt(i6);
                            this.f2323e = charAt;
                        } while (charAt != charAt2);
                    }
                } else {
                    this.f2322d = i4;
                    this.f2323e = '<';
                    return 13;
                }
            }
        }
    }

    static {
        c cVar = d.f2331c;
        f2307d = cVar;
        f2310g = new a(false, 2, cVar);
        f2311h = new a(true, 2, cVar);
    }

    public a(boolean z4, int i4, c cVar) {
        this.f2312a = z4;
        this.f2313b = i4;
        this.f2314c = cVar;
    }

    public static int a(CharSequence charSequence) {
        return new b(charSequence, false).d();
    }

    public static int b(CharSequence charSequence) {
        return new b(charSequence, false).e();
    }

    public static a c() {
        return new C0050a().a();
    }

    public static boolean e(Locale locale) {
        return e.a(locale) == 1;
    }

    public boolean d() {
        return (this.f2313b & 2) != 0;
    }

    public final String f(CharSequence charSequence, c cVar) {
        boolean a4 = cVar.a(charSequence, 0, charSequence.length());
        return (this.f2312a || (!a4 && b(charSequence) != 1)) ? this.f2312a ? (!a4 || b(charSequence) == -1) ? f2309f : "" : "" : f2308e;
    }

    public final String g(CharSequence charSequence, c cVar) {
        boolean a4 = cVar.a(charSequence, 0, charSequence.length());
        return (this.f2312a || (!a4 && a(charSequence) != 1)) ? this.f2312a ? (!a4 || a(charSequence) == -1) ? f2309f : "" : "" : f2308e;
    }

    public CharSequence h(CharSequence charSequence) {
        return i(charSequence, this.f2314c, true);
    }

    public CharSequence i(CharSequence charSequence, c cVar, boolean z4) {
        if (charSequence == null) {
            return null;
        }
        boolean a4 = cVar.a(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (d() && z4) {
            spannableStringBuilder.append(g(charSequence, a4 ? d.f2330b : d.f2329a));
        }
        if (a4 != this.f2312a) {
            spannableStringBuilder.append(a4 ? (char) 8235 : 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append(8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z4) {
            spannableStringBuilder.append(f(charSequence, a4 ? d.f2330b : d.f2329a));
        }
        return spannableStringBuilder;
    }

    public String j(String str) {
        return k(str, this.f2314c, true);
    }

    public String k(String str, c cVar, boolean z4) {
        if (str == null) {
            return null;
        }
        return i(str, cVar, z4).toString();
    }
}
