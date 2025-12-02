package K1;

import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class x {
    public static String a(String str, Object... objArr) {
        int length;
        int length2;
        int indexOf;
        String str2;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            length = objArr.length;
            if (i5 >= length) {
                break;
            }
            Object obj = objArr[i5];
            if (obj == null) {
                str2 = "null";
            } else {
                try {
                    str2 = obj.toString();
                } catch (Exception e4) {
                    String name = obj.getClass().getName();
                    String hexString = Integer.toHexString(System.identityHashCode(obj));
                    StringBuilder sb = new StringBuilder(name.length() + 1 + String.valueOf(hexString).length());
                    sb.append(name);
                    sb.append("@");
                    sb.append(hexString);
                    String sb2 = sb.toString();
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(sb2), e4);
                    String name2 = e4.getClass().getName();
                    StringBuilder sb3 = new StringBuilder(sb2.length() + 8 + name2.length() + 1);
                    sb3.append("<");
                    sb3.append(sb2);
                    sb3.append(" threw ");
                    sb3.append(name2);
                    sb3.append(">");
                    str2 = sb3.toString();
                }
            }
            objArr[i5] = str2;
            i5++;
        }
        StringBuilder sb4 = new StringBuilder(str.length() + (length * 16));
        int i6 = 0;
        while (true) {
            length2 = objArr.length;
            if (i4 >= length2 || (indexOf = str.indexOf("%s", i6)) == -1) {
                sb4.append(str, i6, str.length());
            } else {
                sb4.append(str, i6, indexOf);
                sb4.append(objArr[i4]);
                i6 = indexOf + 2;
                i4++;
            }
        }
        sb4.append(str, i6, str.length());
        if (i4 < length2) {
            sb4.append(" [");
            sb4.append(objArr[i4]);
            for (int i7 = i4 + 1; i7 < objArr.length; i7++) {
                sb4.append(", ");
                sb4.append(objArr[i7]);
            }
            sb4.append(']');
        }
        return sb4.toString();
    }
}
