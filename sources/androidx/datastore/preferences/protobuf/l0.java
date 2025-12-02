package androidx.datastore.preferences.protobuf;

import java.util.List;

public class l0 extends RuntimeException {

    /* renamed from: e  reason: collision with root package name */
    public final List f5164e = null;

    public l0(P p4) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public C0373z a() {
        return new C0373z(getMessage());
    }
}
