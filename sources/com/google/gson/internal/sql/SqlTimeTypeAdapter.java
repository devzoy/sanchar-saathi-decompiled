package com.google.gson.internal.sql;

import C2.a;
import D2.b;
import D2.c;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.o;
import com.google.gson.s;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

final class SqlTimeTypeAdapter extends TypeAdapter {

    /* renamed from: b  reason: collision with root package name */
    public static final s f8560b = new s() {
        public TypeAdapter create(Gson gson, a aVar) {
            if (aVar.c() == Time.class) {
                return new SqlTimeTypeAdapter();
            }
            return null;
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public final DateFormat f8561a;

    /* renamed from: f */
    public synchronized Time c(D2.a aVar) {
        if (aVar.F() == b.NULL) {
            aVar.z();
            return null;
        }
        try {
            return new Time(this.f8561a.parse(aVar.C()).getTime());
        } catch (ParseException e4) {
            throw new o((Throwable) e4);
        }
    }

    /* renamed from: g */
    public synchronized void e(c cVar, Time time) {
        cVar.K(time == null ? null : this.f8561a.format(time));
    }

    private SqlTimeTypeAdapter() {
        this.f8561a = new SimpleDateFormat("hh:mm:ss a");
    }
}
