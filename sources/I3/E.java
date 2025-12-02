package I3;

import a.C0337a;
import h3.C0667h;
import h3.C0668i;
import n3.C0807a;

public abstract class E {

    /* renamed from: a  reason: collision with root package name */
    public static final StackTraceElement f1527a = new C0337a().a();

    /* renamed from: b  reason: collision with root package name */
    public static final String f1528b;

    /* renamed from: c  reason: collision with root package name */
    public static final String f1529c;

    static {
        Object obj;
        Object obj2;
        try {
            C0667h.a aVar = C0667h.f9633e;
            obj = C0667h.a(C0807a.class.getCanonicalName());
        } catch (Throwable th) {
            C0667h.a aVar2 = C0667h.f9633e;
            obj = C0667h.a(C0668i.a(th));
        }
        if (C0667h.b(obj) != null) {
            obj = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        f1528b = (String) obj;
        try {
            obj2 = C0667h.a(E.class.getCanonicalName());
        } catch (Throwable th2) {
            C0667h.a aVar3 = C0667h.f9633e;
            obj2 = C0667h.a(C0668i.a(th2));
        }
        if (C0667h.b(obj2) != null) {
            obj2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        f1529c = (String) obj2;
    }

    public static final Throwable a(Throwable th) {
        return th;
    }
}
