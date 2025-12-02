package com.google.android.material.datepicker;

import java.util.Calendar;
import java.util.TimeZone;

public class q {

    /* renamed from: c  reason: collision with root package name */
    public static final q f7965c = new q((Long) null, (TimeZone) null);

    /* renamed from: a  reason: collision with root package name */
    public final Long f7966a;

    /* renamed from: b  reason: collision with root package name */
    public final TimeZone f7967b;

    public q(Long l4, TimeZone timeZone) {
        this.f7966a = l4;
        this.f7967b = timeZone;
    }

    public static q c() {
        return f7965c;
    }

    public Calendar a() {
        return b(this.f7967b);
    }

    public Calendar b(TimeZone timeZone) {
        Calendar instance = timeZone == null ? Calendar.getInstance() : Calendar.getInstance(timeZone);
        Long l4 = this.f7966a;
        if (l4 != null) {
            instance.setTimeInMillis(l4.longValue());
        }
        return instance;
    }
}
