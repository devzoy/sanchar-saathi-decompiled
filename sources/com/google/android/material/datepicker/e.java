package com.google.android.material.datepicker;

import android.content.Context;
import android.text.format.DateUtils;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public abstract class e {
    public static String a(long j4) {
        return b(j4, Locale.getDefault());
    }

    public static String b(long j4, Locale locale) {
        return r.b(locale).format(new Date(j4));
    }

    public static String c(Context context, long j4) {
        return DateUtils.formatDateTime(context, j4 - ((long) TimeZone.getDefault().getOffset(j4)), 36);
    }

    public static String d(long j4) {
        return e(j4, Locale.getDefault());
    }

    public static String e(long j4, Locale locale) {
        return r.k(locale).format(new Date(j4));
    }
}
