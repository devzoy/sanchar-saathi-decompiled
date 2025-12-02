package com.google.android.gms.internal.vision;

import net.sqlcipher.IBulkCursor;

public abstract class X1 {
    public static String a(C0507g0 g0Var) {
        Z1 z12 = new Z1(g0Var);
        StringBuilder sb = new StringBuilder(z12.a());
        for (int i4 = 0; i4 < z12.a(); i4++) {
            byte b4 = z12.b(i4);
            if (b4 == 34) {
                sb.append("\\\"");
            } else if (b4 == 39) {
                sb.append("\\'");
            } else if (b4 != 92) {
                switch (b4) {
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
                        if (b4 >= 32 && b4 <= 126) {
                            sb.append((char) b4);
                            break;
                        } else {
                            sb.append('\\');
                            sb.append((char) (((b4 >>> 6) & 3) + 48));
                            sb.append((char) (((b4 >>> 3) & 7) + 48));
                            sb.append((char) ((b4 & 7) + 48));
                            break;
                        }
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }
}
