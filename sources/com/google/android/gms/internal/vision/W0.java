package com.google.android.gms.internal.vision;

import java.io.IOException;

public class W0 extends IOException {

    /* renamed from: e  reason: collision with root package name */
    public C0546t1 f7387e = null;

    public W0(String str) {
        super(str);
    }

    public static W0 a() {
        return new W0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static W0 b() {
        return new W0("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static W0 c() {
        return new W0("Protocol message contained an invalid tag (zero).");
    }

    public static Z0 d() {
        return new Z0("Protocol message tag had invalid wire type.");
    }

    public static W0 e() {
        return new W0("Failed to parse the message.");
    }

    public static W0 f() {
        return new W0("Protocol message had invalid UTF-8.");
    }
}
