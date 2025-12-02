package D3;

import I3.F;

public abstract class x0 {

    /* renamed from: a  reason: collision with root package name */
    public static final F f858a = new F("COMPLETING_ALREADY");

    /* renamed from: b  reason: collision with root package name */
    public static final F f859b = new F("COMPLETING_WAITING_CHILDREN");

    /* renamed from: c  reason: collision with root package name */
    public static final F f860c = new F("COMPLETING_RETRY");

    /* renamed from: d  reason: collision with root package name */
    public static final F f861d = new F("TOO_LATE_TO_CANCEL");

    /* renamed from: e  reason: collision with root package name */
    public static final F f862e = new F("SEALED");

    /* renamed from: f  reason: collision with root package name */
    public static final Y f863f = new Y(false);

    /* renamed from: g  reason: collision with root package name */
    public static final Y f864g = new Y(true);

    public static final Object g(Object obj) {
        return obj instanceof C0253k0 ? new C0255l0((C0253k0) obj) : obj;
    }

    public static final Object h(Object obj) {
        C0253k0 k0Var;
        C0255l0 l0Var = obj instanceof C0255l0 ? (C0255l0) obj : null;
        return (l0Var == null || (k0Var = l0Var.f826a) == null) ? obj : k0Var;
    }
}
