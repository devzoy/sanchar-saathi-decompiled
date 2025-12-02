package com.google.android.gms.internal.clearcut;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.clearcut.g0  reason: case insensitive filesystem */
public class C0425g0 extends IOException {

    /* renamed from: e  reason: collision with root package name */
    public B0 f7097e = null;

    public C0425g0(String str) {
        super(str);
    }

    public static C0425g0 a() {
        return new C0425g0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static C0425g0 b() {
        return new C0425g0("Protocol message contained an invalid tag (zero).");
    }

    public static C0428h0 c() {
        return new C0428h0("Protocol message tag had invalid wire type.");
    }

    public static C0425g0 d() {
        return new C0425g0("Failed to parse the message.");
    }

    public static C0425g0 e() {
        return new C0425g0("Protocol message had invalid UTF-8.");
    }

    public final C0425g0 f(B0 b02) {
        this.f7097e = b02;
        return this;
    }
}
