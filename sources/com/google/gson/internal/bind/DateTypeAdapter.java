package com.google.gson.internal.bind;

import C2.a;
import D2.b;
import D2.c;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.d;
import com.google.gson.internal.i;
import com.google.gson.o;
import com.google.gson.s;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public final class DateTypeAdapter extends TypeAdapter {

    /* renamed from: b  reason: collision with root package name */
    public static final s f8372b = new s() {
        public TypeAdapter create(Gson gson, a aVar) {
            if (aVar.c() == Date.class) {
                return new DateTypeAdapter();
            }
            return null;
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public final List f8373a;

    public DateTypeAdapter() {
        ArrayList arrayList = new ArrayList();
        this.f8373a = arrayList;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (d.e()) {
            arrayList.add(i.c(2, 2));
        }
    }

    public final synchronized Date f(String str) {
        for (DateFormat parse : this.f8373a) {
            try {
                return parse.parse(str);
            } catch (ParseException unused) {
            }
        }
        try {
            return A2.a.c(str, new ParsePosition(0));
        } catch (ParseException e4) {
            throw new o(str, e4);
        }
    }

    /* renamed from: g */
    public Date c(D2.a aVar) {
        if (aVar.F() != b.NULL) {
            return f(aVar.C());
        }
        aVar.z();
        return null;
    }

    /* renamed from: h */
    public synchronized void e(c cVar, Date date) {
        if (date == null) {
            cVar.r();
        } else {
            cVar.K(((DateFormat) this.f8373a.get(0)).format(date));
        }
    }
}
