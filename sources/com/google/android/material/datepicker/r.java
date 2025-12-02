package com.google.android.material.datepicker;

import android.icu.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

public abstract class r {

    /* renamed from: a  reason: collision with root package name */
    public static AtomicReference f7968a = new AtomicReference();

    public static long a(long j4) {
        Calendar i4 = i();
        i4.setTimeInMillis(j4);
        return d(i4).getTimeInMillis();
    }

    public static DateFormat b(Locale locale) {
        return c("MMMEd", locale);
    }

    public static DateFormat c(String str, Locale locale) {
        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton(str, locale);
        instanceForSkeleton.setTimeZone(h());
        return instanceForSkeleton;
    }

    public static Calendar d(Calendar calendar) {
        Calendar j4 = j(calendar);
        Calendar i4 = i();
        i4.set(j4.get(1), j4.get(2), j4.get(5));
        return i4;
    }

    public static q e() {
        q qVar = (q) f7968a.get();
        return qVar == null ? q.c() : qVar;
    }

    public static TimeZone f() {
        return TimeZone.getTimeZone("UTC");
    }

    public static Calendar g() {
        Calendar a4 = e().a();
        a4.set(11, 0);
        a4.set(12, 0);
        a4.set(13, 0);
        a4.set(14, 0);
        a4.setTimeZone(f());
        return a4;
    }

    public static android.icu.util.TimeZone h() {
        return android.icu.util.TimeZone.getTimeZone("UTC");
    }

    public static Calendar i() {
        return j((Calendar) null);
    }

    public static Calendar j(Calendar calendar) {
        Calendar instance = Calendar.getInstance(f());
        if (calendar == null) {
            instance.clear();
        } else {
            instance.setTimeInMillis(calendar.getTimeInMillis());
        }
        return instance;
    }

    public static DateFormat k(Locale locale) {
        return c("yMMMEd", locale);
    }
}
