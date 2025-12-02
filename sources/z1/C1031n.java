package z1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: z1.n  reason: case insensitive filesystem */
public abstract class C1031n {

    /* renamed from: z1.n$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final List f13010a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        public final Object f13011b;

        public /* synthetic */ a(Object obj, byte[] bArr) {
            C1032o.f(obj);
            this.f13011b = obj;
        }

        public a a(String str, Object obj) {
            C1032o.f(str);
            int length = str.length();
            String valueOf = String.valueOf(obj);
            StringBuilder sb = new StringBuilder(length + 1 + valueOf.length());
            sb.append(str);
            sb.append("=");
            sb.append(valueOf);
            this.f13010a.add(sb.toString());
            return this;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(100);
            sb.append(this.f13011b.getClass().getSimpleName());
            sb.append('{');
            List list = this.f13010a;
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                sb.append((String) list.get(i4));
                if (i4 < size - 1) {
                    sb.append(", ");
                }
            }
            sb.append('}');
            return sb.toString();
        }
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj != null) {
            return obj.equals(obj2);
        }
        return false;
    }

    public static int b(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    public static a c(Object obj) {
        return new a(obj, (byte[]) null);
    }
}
