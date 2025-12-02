package F3;

import A3.e;
import D3.C0254l;
import I3.F;
import I3.I;
import u3.l;
import u3.p;
import v3.j;

public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    public static final j f1055a = new j(-1, (j) null, (b) null, 0);

    /* renamed from: b  reason: collision with root package name */
    public static final int f1056b = I.e("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12, (Object) null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f1057c = I.e("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 10000, 0, 0, 12, (Object) null);

    /* renamed from: d  reason: collision with root package name */
    public static final F f1058d = new F("BUFFERED");

    /* renamed from: e  reason: collision with root package name */
    public static final F f1059e = new F("SHOULD_BUFFER");

    /* renamed from: f  reason: collision with root package name */
    public static final F f1060f = new F("S_RESUMING_BY_RCV");

    /* renamed from: g  reason: collision with root package name */
    public static final F f1061g = new F("RESUMING_BY_EB");

    /* renamed from: h  reason: collision with root package name */
    public static final F f1062h = new F("POISONED");

    /* renamed from: i  reason: collision with root package name */
    public static final F f1063i = new F("DONE_RCV");

    /* renamed from: j  reason: collision with root package name */
    public static final F f1064j = new F("INTERRUPTED_SEND");

    /* renamed from: k  reason: collision with root package name */
    public static final F f1065k = new F("INTERRUPTED_RCV");

    /* renamed from: l  reason: collision with root package name */
    public static final F f1066l = new F("CHANNEL_CLOSED");

    /* renamed from: m  reason: collision with root package name */
    public static final F f1067m = new F("SUSPEND");

    /* renamed from: n  reason: collision with root package name */
    public static final F f1068n = new F("SUSPEND_NO_WAITER");

    /* renamed from: o  reason: collision with root package name */
    public static final F f1069o = new F("FAILED");

    /* renamed from: p  reason: collision with root package name */
    public static final F f1070p = new F("NO_RECEIVE_RESULT");

    /* renamed from: q  reason: collision with root package name */
    public static final F f1071q = new F("CLOSE_HANDLER_CLOSED");

    /* renamed from: r  reason: collision with root package name */
    public static final F f1072r = new F("CLOSE_HANDLER_INVOKED");

    /* renamed from: s  reason: collision with root package name */
    public static final F f1073s = new F("NO_CLOSE_CAUSE");

    public /* synthetic */ class a extends j implements p {

        /* renamed from: n  reason: collision with root package name */
        public static final a f1074n = new a();

        public a() {
            super(2, c.class, "createSegment", "createSegment(JLkotlinx/coroutines/channels/ChannelSegment;)Lkotlinx/coroutines/channels/ChannelSegment;", 1);
        }

        public /* bridge */ /* synthetic */ Object g(Object obj, Object obj2) {
            return o(((Number) obj).longValue(), (j) obj2);
        }

        public final j o(long j4, j jVar) {
            return c.x(j4, jVar);
        }
    }

    public static final long A(int i4) {
        if (i4 == 0) {
            return 0;
        }
        if (i4 != Integer.MAX_VALUE) {
            return (long) i4;
        }
        return Long.MAX_VALUE;
    }

    public static final boolean B(C0254l lVar, Object obj, l lVar2) {
        Object u4 = lVar.u(obj, (Object) null, lVar2);
        if (u4 == null) {
            return false;
        }
        lVar.K(u4);
        return true;
    }

    public static /* synthetic */ boolean C(C0254l lVar, Object obj, l lVar2, int i4, Object obj2) {
        if ((i4 & 2) != 0) {
            lVar2 = null;
        }
        return B(lVar, obj, lVar2);
    }

    public static final long v(long j4, boolean z4) {
        return (z4 ? 4611686018427387904L : 0) + j4;
    }

    public static final long w(long j4, int i4) {
        return (((long) i4) << 60) + j4;
    }

    public static final j x(long j4, j jVar) {
        return new j(j4, jVar, jVar.u(), 0);
    }

    public static final e y() {
        return a.f1074n;
    }

    public static final F z() {
        return f1066l;
    }
}
