package androidx.datastore.preferences.protobuf;

import java.io.IOException;

/* renamed from: androidx.datastore.preferences.protobuf.z  reason: case insensitive filesystem */
public class C0373z extends IOException {

    /* renamed from: e  reason: collision with root package name */
    public P f5335e = null;

    /* renamed from: f  reason: collision with root package name */
    public boolean f5336f;

    /* renamed from: androidx.datastore.preferences.protobuf.z$a */
    public static class a extends C0373z {
        public a(String str) {
            super(str);
        }
    }

    public C0373z(String str) {
        super(str);
    }

    public static C0373z b() {
        return new C0373z("Protocol message end-group tag did not match expected tag.");
    }

    public static C0373z c() {
        return new C0373z("Protocol message contained an invalid tag (zero).");
    }

    public static C0373z d() {
        return new C0373z("Protocol message had invalid UTF-8.");
    }

    public static a e() {
        return new a("Protocol message tag had invalid wire type.");
    }

    public static C0373z f() {
        return new C0373z("CodedInputStream encountered a malformed varint.");
    }

    public static C0373z g() {
        return new C0373z("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static C0373z h() {
        return new C0373z("Failed to parse the message.");
    }

    public static C0373z i() {
        return new C0373z("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
    }

    public static C0373z l() {
        return new C0373z("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    public static C0373z m() {
        return new C0373z("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public boolean a() {
        return this.f5336f;
    }

    public void j() {
        this.f5336f = true;
    }

    public C0373z k(P p4) {
        this.f5335e = p4;
        return this;
    }

    public C0373z(IOException iOException) {
        super(iOException.getMessage(), iOException);
    }
}
