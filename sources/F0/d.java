package f0;

import androidx.datastore.preferences.protobuf.C0373z;
import c0.C0401c;
import java.io.InputStream;
import v3.g;
import v3.l;

public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    public static final a f8985a = new a((g) null);

    public static final class a {
        public /* synthetic */ a(g gVar) {
            this();
        }

        public final f a(InputStream inputStream) {
            l.e(inputStream, "input");
            try {
                f V3 = f.V(inputStream);
                l.d(V3, "{\n                Prefer…From(input)\n            }");
                return V3;
            } catch (C0373z e4) {
                throw new C0401c("Unable to parse preferences proto.", e4);
            }
        }

        public a() {
        }
    }
}
