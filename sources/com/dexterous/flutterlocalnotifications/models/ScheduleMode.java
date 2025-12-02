package com.dexterous.flutterlocalnotifications.models;

import com.google.gson.f;
import com.google.gson.g;
import com.google.gson.h;
import java.lang.reflect.Type;

public enum ScheduleMode {
    alarmClock,
    exact,
    exactAllowWhileIdle,
    inexact,
    inexactAllowWhileIdle;

    public static class Deserializer implements g {
        /* renamed from: b */
        public ScheduleMode a(h hVar, Type type, f fVar) {
            try {
                return ScheduleMode.valueOf(hVar.w());
            } catch (Exception unused) {
                return hVar.s() ? ScheduleMode.exactAllowWhileIdle : ScheduleMode.exact;
            }
        }
    }

    public boolean useAlarmClock() {
        return this == alarmClock;
    }

    public boolean useAllowWhileIdle() {
        return this == exactAllowWhileIdle || this == inexactAllowWhileIdle;
    }

    public boolean useExactAlarm() {
        return this == exact || this == exactAllowWhileIdle;
    }
}
