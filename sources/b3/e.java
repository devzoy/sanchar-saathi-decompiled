package B3;

import java.util.Iterator;
import v3.l;

public abstract class e extends d {

    public static final class a implements b {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Iterator f256a;

        public a(Iterator it) {
            this.f256a = it;
        }

        public Iterator iterator() {
            return this.f256a;
        }
    }

    public static b a(Iterator it) {
        l.e(it, "<this>");
        return b(new a(it));
    }

    public static final b b(b bVar) {
        l.e(bVar, "<this>");
        return bVar instanceof a ? bVar : new a(bVar);
    }
}
