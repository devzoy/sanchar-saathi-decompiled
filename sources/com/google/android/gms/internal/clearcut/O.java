package com.google.android.gms.internal.clearcut;

import java.util.Collections;
import java.util.Map;

public final class O {

    /* renamed from: b  reason: collision with root package name */
    public static final Class f6857b = a();

    /* renamed from: c  reason: collision with root package name */
    public static final O f6858c = new O(true);

    /* renamed from: a  reason: collision with root package name */
    public final Map f6859a = Collections.emptyMap();

    public O(boolean z4) {
    }

    public static Class a() {
        try {
            return Class.forName("com.google.protobuf.Extension");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static O b() {
        return N.b();
    }
}
