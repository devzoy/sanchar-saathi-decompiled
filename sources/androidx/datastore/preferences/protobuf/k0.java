package androidx.datastore.preferences.protobuf;

import net.sqlcipher.IBulkCursor;

public abstract class k0 {

    public class a implements b {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ C0355g f5163a;

        public a(C0355g gVar) {
            this.f5163a = gVar;
        }

        public byte a(int i4) {
            return this.f5163a.t(i4);
        }

        public int size() {
            return this.f5163a.size();
        }
    }

    public interface b {
        byte a(int i4);

        int size();
    }

    public static String a(C0355g gVar) {
        return b(new a(gVar));
    }

    public static String b(b bVar) {
        StringBuilder sb = new StringBuilder(bVar.size());
        for (int i4 = 0; i4 < bVar.size(); i4++) {
            byte a4 = bVar.a(i4);
            if (a4 == 34) {
                sb.append("\\\"");
            } else if (a4 == 39) {
                sb.append("\\'");
            } else if (a4 != 92) {
                switch (a4) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case IBulkCursor.WANTS_ON_MOVE_TRANSACTION /*9*/:
                        sb.append("\\t");
                        break;
                    case IBulkCursor.GET_EXTRAS_TRANSACTION /*10*/:
                        sb.append("\\n");
                        break;
                    case IBulkCursor.RESPOND_TRANSACTION /*11*/:
                        sb.append("\\v");
                        break;
                    case IBulkCursor.CLOSE_TRANSACTION /*12*/:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (a4 >= 32 && a4 <= 126) {
                            sb.append((char) a4);
                            break;
                        } else {
                            sb.append('\\');
                            sb.append((char) (((a4 >>> 6) & 3) + 48));
                            sb.append((char) (((a4 >>> 3) & 7) + 48));
                            sb.append((char) ((a4 & 7) + 48));
                            break;
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static String c(String str) {
        return a(C0355g.y(str));
    }
}
