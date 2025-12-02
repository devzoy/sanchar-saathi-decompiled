package com.google.gson.internal.sql;

import C2.a;
import D2.c;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.s;
import java.sql.Timestamp;
import java.util.Date;

class SqlTimestampTypeAdapter extends TypeAdapter {

    /* renamed from: b  reason: collision with root package name */
    public static final s f8562b = new s() {
        public TypeAdapter create(Gson gson, a aVar) {
            if (aVar.c() == Timestamp.class) {
                return new SqlTimestampTypeAdapter(gson.k(Date.class));
            }
            return null;
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public final TypeAdapter f8563a;

    /* renamed from: f */
    public Timestamp c(D2.a aVar) {
        Date date = (Date) this.f8563a.c(aVar);
        if (date != null) {
            return new Timestamp(date.getTime());
        }
        return null;
    }

    /* renamed from: g */
    public void e(c cVar, Timestamp timestamp) {
        this.f8563a.e(cVar, timestamp);
    }

    public SqlTimestampTypeAdapter(TypeAdapter typeAdapter) {
        this.f8563a = typeAdapter;
    }
}
