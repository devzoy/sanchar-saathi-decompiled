package com.google.gson.internal.sql;

import com.google.gson.internal.bind.DefaultDateTypeAdapter;
import com.google.gson.s;
import java.sql.Date;
import java.sql.Timestamp;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f8564a;

    /* renamed from: b  reason: collision with root package name */
    public static final DefaultDateTypeAdapter.b f8565b;

    /* renamed from: c  reason: collision with root package name */
    public static final DefaultDateTypeAdapter.b f8566c;

    /* renamed from: d  reason: collision with root package name */
    public static final s f8567d;

    /* renamed from: e  reason: collision with root package name */
    public static final s f8568e;

    /* renamed from: f  reason: collision with root package name */
    public static final s f8569f;

    /* renamed from: com.google.gson.internal.sql.a$a  reason: collision with other inner class name */
    public class C0142a extends DefaultDateTypeAdapter.b {
        public C0142a(Class cls) {
            super(cls);
        }

        /* renamed from: e */
        public Date d(java.util.Date date) {
            return new Date(date.getTime());
        }
    }

    public class b extends DefaultDateTypeAdapter.b {
        public b(Class cls) {
            super(cls);
        }

        /* renamed from: e */
        public Timestamp d(java.util.Date date) {
            return new Timestamp(date.getTime());
        }
    }

    static {
        boolean z4;
        try {
            Class.forName("java.sql.Date");
            z4 = true;
        } catch (ClassNotFoundException unused) {
            z4 = false;
        }
        f8564a = z4;
        if (z4) {
            f8565b = new C0142a(Date.class);
            f8566c = new b(Timestamp.class);
            f8567d = SqlDateTypeAdapter.f8558b;
            f8568e = SqlTimeTypeAdapter.f8560b;
            f8569f = SqlTimestampTypeAdapter.f8562b;
            return;
        }
        f8565b = null;
        f8566c = null;
        f8567d = null;
        f8568e = null;
        f8569f = null;
    }
}
