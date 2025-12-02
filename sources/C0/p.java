package c0;

import D3.C0266u;
import l3.i;
import v3.g;
import v3.l;

public abstract class p {

    public static final class a extends p {

        /* renamed from: a  reason: collision with root package name */
        public final u3.p f6462a;

        /* renamed from: b  reason: collision with root package name */
        public final C0266u f6463b;

        /* renamed from: c  reason: collision with root package name */
        public final v f6464c;

        /* renamed from: d  reason: collision with root package name */
        public final i f6465d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(u3.p pVar, C0266u uVar, v vVar, i iVar) {
            super((g) null);
            l.e(pVar, "transform");
            l.e(uVar, "ack");
            l.e(iVar, "callerContext");
            this.f6462a = pVar;
            this.f6463b = uVar;
            this.f6464c = vVar;
            this.f6465d = iVar;
        }

        public final C0266u a() {
            return this.f6463b;
        }

        public final i b() {
            return this.f6465d;
        }

        public v c() {
            return this.f6464c;
        }

        public final u3.p d() {
            return this.f6462a;
        }
    }

    public /* synthetic */ p(g gVar) {
        this();
    }

    public p() {
    }
}
