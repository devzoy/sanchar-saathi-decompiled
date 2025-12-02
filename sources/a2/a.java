package A2;

import java.util.TimeZone;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final TimeZone f164a = TimeZone.getTimeZone("UTC");

    public static boolean a(String str, int i4, char c4) {
        return i4 < str.length() && str.charAt(i4) == c4;
    }

    public static int b(String str, int i4) {
        while (i4 < str.length()) {
            char charAt = str.charAt(i4);
            if (charAt < '0' || charAt > '9') {
                return i4;
            }
            i4++;
        }
        return str.length();
    }

    /* JADX WARNING: Removed duplicated region for block: B:84:0x01cf  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01d1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.Date c(java.lang.String r19, java.text.ParsePosition r20) {
        /*
            r1 = r19
            r2 = r20
            int r0 = r20.getIndex()     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
            int r3 = r0 + 4
            int r4 = d(r1, r0, r3)     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
            r5 = 45
            boolean r6 = a(r1, r3, r5)     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
            r7 = 5
            if (r6 == 0) goto L_0x0019
            int r3 = r0 + 5
        L_0x0019:
            int r0 = r3 + 2
            int r6 = d(r1, r3, r0)     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
            boolean r8 = a(r1, r0, r5)     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
            if (r8 == 0) goto L_0x0027
            int r0 = r3 + 3
        L_0x0027:
            int r3 = r0 + 2
            int r8 = d(r1, r0, r3)     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
            r9 = 84
            boolean r9 = a(r1, r3, r9)     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
            r10 = 1
            if (r9 != 0) goto L_0x0053
            int r11 = r19.length()     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
            if (r11 > r3) goto L_0x0053
            java.util.GregorianCalendar r0 = new java.util.GregorianCalendar     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
            int r6 = r6 - r10
            r0.<init>(r4, r6, r8)     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
            r2.setIndex(r3)     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
            java.util.Date r0 = r0.getTime()     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
            return r0
        L_0x004a:
            r0 = move-exception
            goto L_0x01cd
        L_0x004d:
            r0 = move-exception
            goto L_0x01cd
        L_0x0050:
            r0 = move-exception
            goto L_0x01cd
        L_0x0053:
            r11 = 43
            r12 = 90
            r14 = 2
            if (r9 == 0) goto L_0x00d7
            int r3 = r0 + 3
            int r9 = r0 + 5
            int r3 = d(r1, r3, r9)     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
            r15 = 58
            boolean r16 = a(r1, r9, r15)     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
            if (r16 == 0) goto L_0x006c
            int r9 = r0 + 6
        L_0x006c:
            int r0 = r9 + 2
            int r16 = d(r1, r9, r0)     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
            boolean r15 = a(r1, r0, r15)     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
            if (r15 == 0) goto L_0x007b
            int r9 = r9 + 3
            r0 = r9
        L_0x007b:
            int r9 = r19.length()     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
            if (r9 <= r0) goto L_0x00cd
            char r9 = r1.charAt(r0)     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
            if (r9 == r12) goto L_0x00cd
            if (r9 == r11) goto L_0x00cd
            if (r9 == r5) goto L_0x00cd
            int r9 = r0 + 2
            int r15 = d(r1, r0, r9)     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
            r13 = 59
            if (r15 <= r13) goto L_0x009b
            r13 = 63
            if (r15 >= r13) goto L_0x009b
            r15 = 59
        L_0x009b:
            r13 = 46
            boolean r13 = a(r1, r9, r13)     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
            if (r13 == 0) goto L_0x00c7
            int r9 = r0 + 3
            int r13 = r0 + 4
            int r13 = b(r1, r13)     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
            int r0 = r0 + 6
            int r0 = java.lang.Math.min(r13, r0)     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
            int r17 = d(r1, r9, r0)     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
            int r0 = r0 - r9
            if (r0 == r10) goto L_0x00be
            if (r0 == r14) goto L_0x00bb
            goto L_0x00c0
        L_0x00bb:
            int r17 = r17 * 10
            goto L_0x00c0
        L_0x00be:
            int r17 = r17 * 100
        L_0x00c0:
            r0 = r3
            r3 = r13
            r9 = r16
            r13 = r17
            goto L_0x00db
        L_0x00c7:
            r0 = r3
            r3 = r9
            r9 = r16
            r13 = 0
            goto L_0x00db
        L_0x00cd:
            r9 = r16
            r13 = 0
            r15 = 0
            r18 = r3
            r3 = r0
            r0 = r18
            goto L_0x00db
        L_0x00d7:
            r0 = 0
            r9 = 0
            r13 = 0
            r15 = 0
        L_0x00db:
            int r14 = r19.length()     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
            if (r14 <= r3) goto L_0x01c5
            char r14 = r1.charAt(r3)     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
            if (r14 != r12) goto L_0x00ec
            java.util.TimeZone r5 = f164a     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
            int r3 = r3 + r10
            goto L_0x0194
        L_0x00ec:
            if (r14 == r11) goto L_0x010d
            if (r14 != r5) goto L_0x00f1
            goto L_0x010d
        L_0x00f1:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
            r3.<init>()     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
            java.lang.String r4 = "Invalid time zone indicator '"
            r3.append(r4)     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
            r3.append(r14)     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
            java.lang.String r4 = "'"
            r3.append(r4)     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
            java.lang.String r3 = r3.toString()     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
            r0.<init>(r3)     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
            throw r0     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
        L_0x010d:
            java.lang.String r5 = r1.substring(r3)     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
            int r11 = r5.length()     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
            if (r11 < r7) goto L_0x0118
            goto L_0x0129
        L_0x0118:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
            r11.<init>()     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
            r11.append(r5)     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
            java.lang.String r5 = "00"
            r11.append(r5)     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
            java.lang.String r5 = r11.toString()     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
        L_0x0129:
            int r11 = r5.length()     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
            int r3 = r3 + r11
            java.lang.String r11 = "+0000"
            boolean r11 = r11.equals(r5)     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
            if (r11 != 0) goto L_0x0192
            java.lang.String r11 = "+00:00"
            boolean r11 = r11.equals(r5)     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
            if (r11 == 0) goto L_0x013f
            goto L_0x0192
        L_0x013f:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
            r11.<init>()     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
            java.lang.String r12 = "GMT"
            r11.append(r12)     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
            r11.append(r5)     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
            java.lang.String r5 = r11.toString()     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
            java.util.TimeZone r11 = java.util.TimeZone.getTimeZone(r5)     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
            java.lang.String r12 = r11.getID()     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
            boolean r14 = r12.equals(r5)     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
            if (r14 != 0) goto L_0x0190
            java.lang.String r14 = ":"
            java.lang.String r7 = ""
            java.lang.String r7 = r12.replace(r14, r7)     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
            boolean r7 = r7.equals(r5)     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
            if (r7 == 0) goto L_0x016d
            goto L_0x0190
        L_0x016d:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
            r3.<init>()     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
            java.lang.String r4 = "Mismatching time zone indicator: "
            r3.append(r4)     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
            r3.append(r5)     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
            java.lang.String r4 = " given, resolves to "
            r3.append(r4)     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
            java.lang.String r4 = r11.getID()     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
            r3.append(r4)     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
            java.lang.String r3 = r3.toString()     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
            r0.<init>(r3)     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
            throw r0     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
        L_0x0190:
            r5 = r11
            goto L_0x0194
        L_0x0192:
            java.util.TimeZone r5 = f164a     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
        L_0x0194:
            java.util.GregorianCalendar r7 = new java.util.GregorianCalendar     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
            r7.<init>(r5)     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
            r5 = 0
            r7.setLenient(r5)     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
            r7.set(r10, r4)     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
            int r6 = r6 - r10
            r4 = 2
            r7.set(r4, r6)     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
            r4 = 5
            r7.set(r4, r8)     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
            r4 = 11
            r7.set(r4, r0)     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
            r0 = 12
            r7.set(r0, r9)     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
            r0 = 13
            r7.set(r0, r15)     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
            r0 = 14
            r7.set(r0, r13)     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
            r2.setIndex(r3)     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
            java.util.Date r0 = r7.getTime()     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
            return r0
        L_0x01c5:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
            java.lang.String r3 = "No time zone indicator"
            r0.<init>(r3)     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
            throw r0     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
        L_0x01cd:
            if (r1 != 0) goto L_0x01d1
            r1 = 0
            goto L_0x01e5
        L_0x01d1:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r4 = 34
            r3.append(r4)
            r3.append(r1)
            r3.append(r4)
            java.lang.String r1 = r3.toString()
        L_0x01e5:
            java.lang.String r3 = r0.getMessage()
            if (r3 == 0) goto L_0x01f1
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L_0x020f
        L_0x01f1:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "("
            r3.append(r4)
            java.lang.Class r4 = r0.getClass()
            java.lang.String r4 = r4.getName()
            r3.append(r4)
            java.lang.String r4 = ")"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
        L_0x020f:
            java.text.ParseException r4 = new java.text.ParseException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Failed to parse date ["
            r5.append(r6)
            r5.append(r1)
            java.lang.String r1 = "]: "
            r5.append(r1)
            r5.append(r3)
            java.lang.String r1 = r5.toString()
            int r2 = r20.getIndex()
            r4.<init>(r1, r2)
            r4.initCause(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: A2.a.c(java.lang.String, java.text.ParsePosition):java.util.Date");
    }

    public static int d(String str, int i4, int i5) {
        int i6;
        int i7;
        if (i4 < 0 || i5 > str.length() || i4 > i5) {
            throw new NumberFormatException(str);
        }
        if (i4 < i5) {
            i7 = i4 + 1;
            int digit = Character.digit(str.charAt(i4), 10);
            if (digit >= 0) {
                i6 = -digit;
            } else {
                throw new NumberFormatException("Invalid number: " + str.substring(i4, i5));
            }
        } else {
            i6 = 0;
            i7 = i4;
        }
        while (i7 < i5) {
            int i8 = i7 + 1;
            int digit2 = Character.digit(str.charAt(i7), 10);
            if (digit2 >= 0) {
                i6 = (i6 * 10) - digit2;
                i7 = i8;
            } else {
                throw new NumberFormatException("Invalid number: " + str.substring(i4, i5));
            }
        }
        return -i6;
    }
}
