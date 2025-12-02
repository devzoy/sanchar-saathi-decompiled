package com.google.gson.internal.sql;

import C2.a;
import D2.b;
import D2.c;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.o;
import com.google.gson.s;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

final class SqlDateTypeAdapter extends TypeAdapter {

    /* renamed from: b  reason: collision with root package name */
    public static final s f8558b = new s() {
        public TypeAdapter create(Gson gson, a aVar) {
            if (aVar.c() == Date.class) {
                return new SqlDateTypeAdapter();
            }
            return null;
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public final DateFormat f8559a;

    /* renamed from: f */
    public synchronized Date c(D2.a aVar) {
        if (aVar.F() == b.NULL) {
            aVar.z();
            return null;
        }
        try {
            return new Date(this.f8559a.parse(aVar.C()).getTime());
        } catch (ParseException e4) {
            throw new o((Throwable) e4);
        }
    }

    /* renamed from: g */
    public synchronized void e(c cVar, Date date) {
        cVar.K(date == null ? null : this.f8559a.format(date));
    }

    private SqlDateTypeAdapter() {
        this.f8559a = new SimpleDateFormat("MMM d, yyyy");
    }
}
