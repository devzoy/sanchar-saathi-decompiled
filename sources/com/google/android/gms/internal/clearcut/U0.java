package com.google.android.gms.internal.clearcut;

import net.sqlcipher.IBulkCursor;

public abstract class U0 {
    public static String a(C0477y yVar) {
        String str;
        V0 v02 = new V0(yVar);
        StringBuilder sb = new StringBuilder(v02.size());
        for (int i4 = 0; i4 < v02.size(); i4++) {
            int a4 = v02.a(i4);
            if (a4 == 34) {
                str = "\\\"";
            } else if (a4 == 39) {
                str = "\\'";
            } else if (a4 != 92) {
                switch (a4) {
                    case 7:
                        str = "\\a";
                        break;
                    case 8:
                        str = "\\b";
                        break;
                    case IBulkCursor.WANTS_ON_MOVE_TRANSACTION /*9*/:
                        str = "\\t";
                        break;
                    case IBulkCursor.GET_EXTRAS_TRANSACTION /*10*/:
                        str = "\\n";
                        break;
                    case IBulkCursor.RESPOND_TRANSACTION /*11*/:
                        str = "\\v";
                        break;
                    case IBulkCursor.CLOSE_TRANSACTION /*12*/:
                        str = "\\f";
                        break;
                    case 13:
                        str = "\\r";
                        break;
                    default:
                        if (a4 < 32 || a4 > 126) {
                            sb.append('\\');
                            sb.append((char) (((a4 >>> 6) & 3) + 48));
                            sb.append((char) (((a4 >>> 3) & 7) + 48));
                            a4 = (a4 & 7) + 48;
                        }
                        sb.append((char) a4);
                        continue;
                }
            } else {
                str = "\\\\";
            }
            sb.append(str);
        }
        return sb.toString();
    }
}
