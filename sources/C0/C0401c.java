package c0;

import java.io.IOException;
import v3.g;
import v3.l;

/* renamed from: c0.c  reason: case insensitive filesystem */
public final class C0401c extends IOException {
    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0401c(String str, Throwable th, int i4, g gVar) {
        this(str, (i4 & 2) != 0 ? null : th);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0401c(String str, Throwable th) {
        super(str, th);
        l.e(str, "message");
    }
}
