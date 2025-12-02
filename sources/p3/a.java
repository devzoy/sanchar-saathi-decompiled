package P3;

import O3.C0298b;
import O3.e;
import v3.l;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final char[] f2270a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x005b, code lost:
        return -1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final int b(byte[] r18, int r19) {
        /*
            r0 = r18
            r1 = r19
            r3 = 1
            int r4 = r0.length
            r5 = 0
            r6 = r5
            r7 = r6
        L_0x0009:
            if (r5 >= r4) goto L_0x01a6
            byte r8 = r0[r5]
            r9 = 65533(0xfffd, float:9.1831E-41)
            r10 = 160(0xa0, float:2.24E-43)
            r11 = 127(0x7f, float:1.78E-43)
            r12 = 32
            r13 = 13
            r14 = 10
            r15 = 65536(0x10000, float:9.18355E-41)
            r16 = -1
            if (r8 < 0) goto L_0x0063
            int r17 = r7 + 1
            if (r7 != r1) goto L_0x0025
            return r6
        L_0x0025:
            if (r8 == r14) goto L_0x0033
            if (r8 == r13) goto L_0x0033
            if (r8 < 0) goto L_0x002e
            if (r8 >= r12) goto L_0x002e
            goto L_0x0035
        L_0x002e:
            if (r11 > r8) goto L_0x0033
            if (r8 >= r10) goto L_0x0033
            goto L_0x0035
        L_0x0033:
            if (r8 != r9) goto L_0x0036
        L_0x0035:
            return r16
        L_0x0036:
            if (r8 >= r15) goto L_0x003a
            r7 = r3
            goto L_0x003b
        L_0x003a:
            r7 = 2
        L_0x003b:
            int r6 = r6 + r7
            int r5 = r5 + r3
        L_0x003d:
            r7 = r17
            if (r5 >= r4) goto L_0x0009
            byte r8 = r0[r5]
            if (r8 < 0) goto L_0x0009
            int r5 = r5 + r3
            int r17 = r7 + 1
            if (r7 != r1) goto L_0x004b
            return r6
        L_0x004b:
            if (r8 == r14) goto L_0x0059
            if (r8 == r13) goto L_0x0059
            if (r8 < 0) goto L_0x0054
            if (r8 >= r12) goto L_0x0054
            goto L_0x005b
        L_0x0054:
            if (r11 > r8) goto L_0x0059
            if (r8 >= r10) goto L_0x0059
            goto L_0x005b
        L_0x0059:
            if (r8 != r9) goto L_0x005c
        L_0x005b:
            return r16
        L_0x005c:
            if (r8 >= r15) goto L_0x0060
            r7 = r3
            goto L_0x0061
        L_0x0060:
            r7 = 2
        L_0x0061:
            int r6 = r6 + r7
            goto L_0x003d
        L_0x0063:
            int r2 = r8 >> 5
            r15 = -2
            r9 = 128(0x80, float:1.794E-43)
            if (r2 != r15) goto L_0x00af
            int r2 = r5 + 1
            if (r4 > r2) goto L_0x0072
            if (r7 != r1) goto L_0x0071
            return r6
        L_0x0071:
            return r16
        L_0x0072:
            byte r2 = r0[r2]
            r15 = r2 & 192(0xc0, float:2.69E-43)
            if (r15 != r9) goto L_0x00ab
            r2 = r2 ^ 3968(0xf80, float:5.56E-42)
            int r8 = r8 << 6
            r2 = r2 ^ r8
            if (r2 >= r9) goto L_0x0083
            if (r7 != r1) goto L_0x0082
            return r6
        L_0x0082:
            return r16
        L_0x0083:
            int r8 = r7 + 1
            if (r7 != r1) goto L_0x0088
            return r6
        L_0x0088:
            if (r2 == r14) goto L_0x0096
            if (r2 == r13) goto L_0x0096
            if (r2 < 0) goto L_0x0091
            if (r2 >= r12) goto L_0x0091
            goto L_0x009b
        L_0x0091:
            if (r11 > r2) goto L_0x0096
            if (r2 >= r10) goto L_0x0096
            goto L_0x009b
        L_0x0096:
            r7 = 65533(0xfffd, float:9.1831E-41)
            if (r2 != r7) goto L_0x009c
        L_0x009b:
            return r16
        L_0x009c:
            r7 = 65536(0x10000, float:9.18355E-41)
            if (r2 >= r7) goto L_0x00a2
            r2 = r3
            goto L_0x00a3
        L_0x00a2:
            r2 = 2
        L_0x00a3:
            int r6 = r6 + r2
            h3.n r2 = h3.C0673n.f9639a
            r2 = 2
            int r5 = r5 + r2
        L_0x00a8:
            r7 = r8
            goto L_0x0009
        L_0x00ab:
            if (r7 != r1) goto L_0x00ae
            return r6
        L_0x00ae:
            return r16
        L_0x00af:
            r2 = 2
            int r10 = r8 >> 4
            r11 = 57344(0xe000, float:8.0356E-41)
            r12 = 55296(0xd800, float:7.7486E-41)
            if (r10 != r15) goto L_0x011e
            int r10 = r5 + 2
            if (r4 > r10) goto L_0x00c2
            if (r7 != r1) goto L_0x00c1
            return r6
        L_0x00c1:
            return r16
        L_0x00c2:
            int r2 = r5 + 1
            byte r2 = r0[r2]
            r15 = r2 & 192(0xc0, float:2.69E-43)
            if (r15 != r9) goto L_0x011a
            byte r10 = r0[r10]
            r15 = r10 & 192(0xc0, float:2.69E-43)
            if (r15 != r9) goto L_0x0116
            r9 = -123008(0xfffffffffffe1f80, float:NaN)
            r9 = r9 ^ r10
            int r2 = r2 << 6
            r2 = r2 ^ r9
            int r8 = r8 << 12
            r2 = r2 ^ r8
            r8 = 2048(0x800, float:2.87E-42)
            if (r2 >= r8) goto L_0x00e2
            if (r7 != r1) goto L_0x00e1
            return r6
        L_0x00e1:
            return r16
        L_0x00e2:
            if (r12 > r2) goto L_0x00ea
            if (r2 >= r11) goto L_0x00ea
            if (r7 != r1) goto L_0x00e9
            return r6
        L_0x00e9:
            return r16
        L_0x00ea:
            int r8 = r7 + 1
            if (r7 != r1) goto L_0x00ef
            return r6
        L_0x00ef:
            if (r2 == r14) goto L_0x0103
            if (r2 == r13) goto L_0x0103
            if (r2 < 0) goto L_0x00fa
            r7 = 32
            if (r2 >= r7) goto L_0x00fa
            goto L_0x0108
        L_0x00fa:
            r7 = 127(0x7f, float:1.78E-43)
            if (r7 > r2) goto L_0x0103
            r7 = 160(0xa0, float:2.24E-43)
            if (r2 >= r7) goto L_0x0103
            goto L_0x0108
        L_0x0103:
            r7 = 65533(0xfffd, float:9.1831E-41)
            if (r2 != r7) goto L_0x0109
        L_0x0108:
            return r16
        L_0x0109:
            r7 = 65536(0x10000, float:9.18355E-41)
            if (r2 >= r7) goto L_0x010f
            r2 = r3
            goto L_0x0110
        L_0x010f:
            r2 = 2
        L_0x0110:
            int r6 = r6 + r2
            h3.n r2 = h3.C0673n.f9639a
            int r5 = r5 + 3
            goto L_0x00a8
        L_0x0116:
            if (r7 != r1) goto L_0x0119
            return r6
        L_0x0119:
            return r16
        L_0x011a:
            if (r7 != r1) goto L_0x011d
            return r6
        L_0x011d:
            return r16
        L_0x011e:
            int r2 = r8 >> 3
            if (r2 != r15) goto L_0x01a2
            int r2 = r5 + 3
            if (r4 > r2) goto L_0x012a
            if (r7 != r1) goto L_0x0129
            return r6
        L_0x0129:
            return r16
        L_0x012a:
            int r10 = r5 + 1
            byte r10 = r0[r10]
            r15 = r10 & 192(0xc0, float:2.69E-43)
            if (r15 != r9) goto L_0x019e
            r15 = 2
            int r17 = r5 + 2
            byte r15 = r0[r17]
            r13 = r15 & 192(0xc0, float:2.69E-43)
            if (r13 != r9) goto L_0x019a
            byte r2 = r0[r2]
            r13 = r2 & 192(0xc0, float:2.69E-43)
            if (r13 != r9) goto L_0x0196
            r9 = 3678080(0x381f80, float:5.154088E-39)
            r2 = r2 ^ r9
            int r9 = r15 << 6
            r2 = r2 ^ r9
            int r9 = r10 << 12
            r2 = r2 ^ r9
            int r8 = r8 << 18
            r2 = r2 ^ r8
            r8 = 1114111(0x10ffff, float:1.561202E-39)
            if (r2 <= r8) goto L_0x0157
            if (r7 != r1) goto L_0x0156
            return r6
        L_0x0156:
            return r16
        L_0x0157:
            if (r12 > r2) goto L_0x015f
            if (r2 >= r11) goto L_0x015f
            if (r7 != r1) goto L_0x015e
            return r6
        L_0x015e:
            return r16
        L_0x015f:
            r8 = 65536(0x10000, float:9.18355E-41)
            if (r2 >= r8) goto L_0x0167
            if (r7 != r1) goto L_0x0166
            return r6
        L_0x0166:
            return r16
        L_0x0167:
            int r8 = r7 + 1
            if (r7 != r1) goto L_0x016c
            return r6
        L_0x016c:
            if (r2 == r14) goto L_0x0182
            r7 = 13
            if (r2 == r7) goto L_0x0182
            if (r2 < 0) goto L_0x0179
            r7 = 32
            if (r2 >= r7) goto L_0x0179
            goto L_0x0187
        L_0x0179:
            r7 = 127(0x7f, float:1.78E-43)
            if (r7 > r2) goto L_0x0182
            r7 = 160(0xa0, float:2.24E-43)
            if (r2 >= r7) goto L_0x0182
            goto L_0x0187
        L_0x0182:
            r7 = 65533(0xfffd, float:9.1831E-41)
            if (r2 != r7) goto L_0x0188
        L_0x0187:
            return r16
        L_0x0188:
            r7 = 65536(0x10000, float:9.18355E-41)
            if (r2 >= r7) goto L_0x018e
            r2 = r3
            goto L_0x018f
        L_0x018e:
            r2 = 2
        L_0x018f:
            int r6 = r6 + r2
            h3.n r2 = h3.C0673n.f9639a
            int r5 = r5 + 4
            goto L_0x00a8
        L_0x0196:
            if (r7 != r1) goto L_0x0199
            return r6
        L_0x0199:
            return r16
        L_0x019a:
            if (r7 != r1) goto L_0x019d
            return r6
        L_0x019d:
            return r16
        L_0x019e:
            if (r7 != r1) goto L_0x01a1
            return r6
        L_0x01a1:
            return r16
        L_0x01a2:
            if (r7 != r1) goto L_0x01a5
            return r6
        L_0x01a5:
            return r16
        L_0x01a6:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: P3.a.b(byte[], int):int");
    }

    public static final void c(e eVar, C0298b bVar, int i4, int i5) {
        l.e(eVar, "<this>");
        l.e(bVar, "buffer");
        bVar.N(eVar.l(), i4, i5);
    }

    public static final char[] d() {
        return f2270a;
    }
}
