package I3;

import D3.H;
import h3.C0660a;
import h3.C0673n;
import l3.i;
import u3.l;
import v3.m;

public abstract class x {

    public static final class a extends m implements l {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ l f1585f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ Object f1586g;

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ i f1587h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(l lVar, Object obj, i iVar) {
            super(1);
            this.f1585f = lVar;
            this.f1586g = obj;
            this.f1587h = iVar;
        }

        public final void a(Throwable th) {
            x.b(this.f1585f, this.f1586g, this.f1587h);
        }

        public /* bridge */ /* synthetic */ Object i(Object obj) {
            a((Throwable) obj);
            return C0673n.f9639a;
        }
    }

    public static final l a(l lVar, Object obj, i iVar) {
        return new a(lVar, obj, iVar);
    }

    public static final void b(l lVar, Object obj, i iVar) {
        O c4 = c(lVar, obj, (O) null);
        if (c4 != null) {
            H.a(iVar, c4);
        }
    }

    public static final O c(l lVar, Object obj, O o4) {
        try {
            lVar.i(obj);
        } catch (Throwable th) {
            if (o4 == null || o4.getCause() == th) {
                return new O("Exception in undelivered element handler for " + obj, th);
            }
            C0660a.a(o4, th);
        }
        return o4;
    }

    public static /* synthetic */ O d(l lVar, Object obj, O o4, int i4, Object obj2) {
        if ((i4 & 2) != 0) {
            o4 = null;
        }
        return c(lVar, obj, o4);
    }
}
