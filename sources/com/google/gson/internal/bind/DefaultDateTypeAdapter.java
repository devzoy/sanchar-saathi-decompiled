package com.google.gson.internal.bind;

import D2.c;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.d;
import com.google.gson.internal.i;
import com.google.gson.o;
import com.google.gson.s;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public final class DefaultDateTypeAdapter<T extends Date> extends TypeAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final b f8374a;

    /* renamed from: b  reason: collision with root package name */
    public final List f8375b;

    public static abstract class b {

        /* renamed from: b  reason: collision with root package name */
        public static final b f8376b = new a(Date.class);

        /* renamed from: a  reason: collision with root package name */
        public final Class f8377a;

        public class a extends b {
            public a(Class cls) {
                super(cls);
            }

            public Date d(Date date) {
                return date;
            }
        }

        public b(Class cls) {
            this.f8377a = cls;
        }

        public final s a(int i4, int i5) {
            return c(new DefaultDateTypeAdapter(this, i4, i5));
        }

        public final s b(String str) {
            return c(new DefaultDateTypeAdapter(this, str));
        }

        public final s c(DefaultDateTypeAdapter defaultDateTypeAdapter) {
            return TypeAdapters.b(this.f8377a, defaultDateTypeAdapter);
        }

        public abstract Date d(Date date);
    }

    private Date f(String str) {
        synchronized (this.f8375b) {
            try {
                for (DateFormat parse : this.f8375b) {
                    try {
                        Date parse2 = parse.parse(str);
                        return parse2;
                    } catch (ParseException unused) {
                    }
                }
                try {
                    return A2.a.c(str, new ParsePosition(0));
                } catch (ParseException e4) {
                    throw new o(str, e4);
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
    }

    /* renamed from: g */
    public Date c(D2.a aVar) {
        if (aVar.F() == D2.b.NULL) {
            aVar.z();
            return null;
        }
        return this.f8374a.d(f(aVar.C()));
    }

    /* renamed from: h */
    public void e(c cVar, Date date) {
        if (date == null) {
            cVar.r();
            return;
        }
        synchronized (this.f8375b) {
            cVar.K(((DateFormat) this.f8375b.get(0)).format(date));
        }
    }

    public String toString() {
        DateFormat dateFormat = (DateFormat) this.f8375b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            return "DefaultDateTypeAdapter(" + ((SimpleDateFormat) dateFormat).toPattern() + ')';
        }
        return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + ')';
    }

    public DefaultDateTypeAdapter(b bVar, String str) {
        ArrayList arrayList = new ArrayList();
        this.f8375b = arrayList;
        this.f8374a = (b) com.google.gson.internal.a.b(bVar);
        Locale locale = Locale.US;
        arrayList.add(new SimpleDateFormat(str, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(new SimpleDateFormat(str));
        }
    }

    public DefaultDateTypeAdapter(b bVar, int i4, int i5) {
        ArrayList arrayList = new ArrayList();
        this.f8375b = arrayList;
        this.f8374a = (b) com.google.gson.internal.a.b(bVar);
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(i4, i5, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(i4, i5));
        }
        if (d.e()) {
            arrayList.add(i.c(i4, i5));
        }
    }
}
