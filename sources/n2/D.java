package N2;

import N2.E;
import N2.F;
import N2.z;
import Y2.b;
import android.view.KeyEvent;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class D implements E.d {

    /* renamed from: a  reason: collision with root package name */
    public final b f1858a;

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f1859b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f1860c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public final E.b f1861d = new E.b();

    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f1862a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                N2.z$b[] r0 = N2.z.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f1862a = r0
                N2.z$b r1 = N2.z.b.kDown     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f1862a     // Catch:{ NoSuchFieldError -> 0x001d }
                N2.z$b r1 = N2.z.b.kUp     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f1862a     // Catch:{ NoSuchFieldError -> 0x0028 }
                N2.z$b r1 = N2.z.b.kRepeat     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: N2.D.a.<clinit>():void");
        }
    }

    public D(b bVar) {
        this.f1858a = bVar;
        for (F.e eVar : F.a()) {
            this.f1860c.put(Long.valueOf(eVar.f1882c), eVar);
        }
    }

    public static z.b e(KeyEvent keyEvent) {
        boolean z4 = keyEvent.getRepeatCount() > 0;
        int action = keyEvent.getAction();
        if (action == 0) {
            return z4 ? z.b.kRepeat : z.b.kDown;
        }
        if (action == 1) {
            return z.b.kUp;
        }
        throw new AssertionError("Unexpected event type");
    }

    public static long j(long j4, long j5) {
        return (j4 & 4294967295L) | j5;
    }

    public static /* synthetic */ void k(E.d.a aVar, ByteBuffer byteBuffer) {
        Boolean bool = Boolean.FALSE;
        if (byteBuffer != null) {
            byteBuffer.rewind();
            if (byteBuffer.capacity() != 0) {
                bool = Boolean.valueOf(byteBuffer.get() != 0);
            }
        } else {
            M2.b.g("KeyEmbedderResponder", "A null reply was received when sending a key event to the framework.");
        }
        aVar.a(bool.booleanValue());
    }

    public void a(KeyEvent keyEvent, E.d.a aVar) {
        if (!i(keyEvent, aVar)) {
            q(true, 0L, 0L, 0);
            aVar.a(true);
        }
    }

    public final Long f(KeyEvent keyEvent) {
        Long l4 = (Long) F.f1874b.get(Long.valueOf((long) keyEvent.getKeyCode()));
        return l4 != null ? l4 : Long.valueOf(j((long) keyEvent.getKeyCode(), 73014444032L));
    }

    public final Long g(KeyEvent keyEvent) {
        long scanCode = (long) keyEvent.getScanCode();
        if (scanCode == 0) {
            return Long.valueOf(j((long) keyEvent.getKeyCode(), 73014444032L));
        }
        Long l4 = (Long) F.f1873a.get(Long.valueOf(scanCode));
        return l4 != null ? l4 : Long.valueOf(j((long) keyEvent.getScanCode(), 73014444032L));
    }

    public Map h() {
        return Collections.unmodifiableMap(this.f1859b);
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0148 A[LOOP:2: B:66:0x0142->B:68:0x0148, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean i(android.view.KeyEvent r18, N2.E.d.a r19) {
        /*
            r17 = this;
            r9 = r17
            int r0 = r18.getScanCode()
            r10 = 0
            if (r0 != 0) goto L_0x0010
            int r0 = r18.getKeyCode()
            if (r0 != 0) goto L_0x0010
            return r10
        L_0x0010:
            java.lang.Long r11 = r17.g(r18)
            java.lang.Long r12 = r17.f(r18)
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            N2.F$d[] r14 = N2.F.f1875c
            int r15 = r14.length
            r8 = r10
        L_0x0021:
            r6 = 1
            if (r8 >= r15) goto L_0x0047
            r1 = r14[r8]
            int r0 = r18.getMetaState()
            int r2 = r1.f1878a
            r0 = r0 & r2
            if (r0 == 0) goto L_0x0031
            r2 = r6
            goto L_0x0032
        L_0x0031:
            r2 = r10
        L_0x0032:
            long r3 = r12.longValue()
            long r5 = r11.longValue()
            r0 = r17
            r7 = r18
            r16 = r8
            r8 = r13
            r0.o(r1, r2, r3, r5, r7, r8)
            int r8 = r16 + 1
            goto L_0x0021
        L_0x0047:
            java.util.HashMap r0 = r9.f1860c
            java.util.Collection r0 = r0.values()
            java.util.Iterator r7 = r0.iterator()
        L_0x0051:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0076
            java.lang.Object r0 = r7.next()
            r1 = r0
            N2.F$e r1 = (N2.F.e) r1
            int r0 = r18.getMetaState()
            int r2 = r1.f1880a
            r0 = r0 & r2
            if (r0 == 0) goto L_0x0069
            r2 = r6
            goto L_0x006a
        L_0x0069:
            r2 = r10
        L_0x006a:
            long r3 = r12.longValue()
            r0 = r17
            r5 = r18
            r0.p(r1, r2, r3, r5)
            goto L_0x0051
        L_0x0076:
            int r0 = r18.getAction()
            if (r0 == 0) goto L_0x0081
            if (r0 == r6) goto L_0x007f
            return r10
        L_0x007f:
            r7 = r10
            goto L_0x0082
        L_0x0081:
            r7 = r6
        L_0x0082:
            java.util.HashMap r0 = r9.f1859b
            java.lang.Object r0 = r0.get(r11)
            r2 = r0
            java.lang.Long r2 = (java.lang.Long) r2
            r8 = 0
            if (r7 == 0) goto L_0x00cb
            if (r2 != 0) goto L_0x0093
            N2.z$b r0 = N2.z.b.kDown
            goto L_0x00a9
        L_0x0093:
            int r0 = r18.getRepeatCount()
            if (r0 <= 0) goto L_0x009c
            N2.z$b r0 = N2.z.b.kRepeat
            goto L_0x00a9
        L_0x009c:
            r1 = 0
            long r4 = r18.getEventTime()
            r0 = r17
            r3 = r11
            r0.q(r1, r2, r3, r4)
            N2.z$b r0 = N2.z.b.kDown
        L_0x00a9:
            N2.E$b r1 = r9.f1861d
            int r2 = r18.getUnicodeChar()
            java.lang.Character r1 = r1.a(r2)
            char r1 = r1.charValue()
            if (r1 == 0) goto L_0x00d0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = ""
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            goto L_0x00d1
        L_0x00cb:
            if (r2 != 0) goto L_0x00ce
            return r10
        L_0x00ce:
            N2.z$b r0 = N2.z.b.kUp
        L_0x00d0:
            r1 = r8
        L_0x00d1:
            N2.z$b r2 = N2.z.b.kRepeat
            if (r0 == r2) goto L_0x00db
            if (r7 == 0) goto L_0x00d8
            r8 = r12
        L_0x00d8:
            r9.r(r11, r8)
        L_0x00db:
            N2.z$b r2 = N2.z.b.kDown
            if (r0 != r2) goto L_0x00ee
            java.util.HashMap r2 = r9.f1860c
            java.lang.Object r2 = r2.get(r12)
            N2.F$e r2 = (N2.F.e) r2
            if (r2 == 0) goto L_0x00ee
            boolean r3 = r2.f1883d
            r3 = r3 ^ r6
            r2.f1883d = r3
        L_0x00ee:
            N2.z r2 = new N2.z
            r2.<init>()
            int r3 = r18.getSource()
            r4 = 513(0x201, float:7.19E-43)
            if (r3 == r4) goto L_0x011d
            r4 = 1025(0x401, float:1.436E-42)
            if (r3 == r4) goto L_0x0118
            r4 = 16777232(0x1000010, float:2.3509932E-38)
            if (r3 == r4) goto L_0x0113
            r4 = 33554433(0x2000001, float:9.403956E-38)
            if (r3 == r4) goto L_0x010e
            N2.z$a r3 = N2.z.a.kKeyboard
            r2.f1997f = r3
            goto L_0x0121
        L_0x010e:
            N2.z$a r3 = N2.z.a.kHdmi
            r2.f1997f = r3
            goto L_0x0121
        L_0x0113:
            N2.z$a r3 = N2.z.a.kJoystick
            r2.f1997f = r3
            goto L_0x0121
        L_0x0118:
            N2.z$a r3 = N2.z.a.kGamepad
            r2.f1997f = r3
            goto L_0x0121
        L_0x011d:
            N2.z$a r3 = N2.z.a.kDirectionalPad
            r2.f1997f = r3
        L_0x0121:
            long r3 = r18.getEventTime()
            r2.f1992a = r3
            r2.f1993b = r0
            long r3 = r12.longValue()
            r2.f1995d = r3
            long r3 = r11.longValue()
            r2.f1994c = r3
            r2.f1998g = r1
            r2.f1996e = r10
            r0 = r19
            r9.n(r2, r0)
            java.util.Iterator r0 = r13.iterator()
        L_0x0142:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0152
            java.lang.Object r1 = r0.next()
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            r1.run()
            goto L_0x0142
        L_0x0152:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: N2.D.i(android.view.KeyEvent, N2.E$d$a):boolean");
    }

    public final /* synthetic */ void l(F.c cVar, long j4, KeyEvent keyEvent) {
        q(false, Long.valueOf(cVar.f1877b), Long.valueOf(j4), keyEvent.getEventTime());
    }

    public final /* synthetic */ void m(F.c cVar, KeyEvent keyEvent) {
        q(false, Long.valueOf(cVar.f1877b), Long.valueOf(cVar.f1876a), keyEvent.getEventTime());
    }

    public final void n(z zVar, E.d.a aVar) {
        this.f1858a.c("flutter/keydata", zVar.a(), aVar == null ? null : new A(aVar));
    }

    public void o(F.d dVar, boolean z4, long j4, long j5, KeyEvent keyEvent, ArrayList arrayList) {
        F.d dVar2 = dVar;
        ArrayList arrayList2 = arrayList;
        F.c[] cVarArr = dVar2.f1879b;
        boolean[] zArr = new boolean[cVarArr.length];
        Boolean[] boolArr = new Boolean[cVarArr.length];
        boolean z5 = false;
        int i4 = 0;
        while (true) {
            F.c[] cVarArr2 = dVar2.f1879b;
            boolean z6 = true;
            if (i4 >= cVarArr2.length) {
                break;
            }
            F.c cVar = cVarArr2[i4];
            boolean containsKey = this.f1859b.containsKey(Long.valueOf(cVar.f1876a));
            zArr[i4] = containsKey;
            if (cVar.f1877b == j4) {
                int i5 = a.f1862a[e(keyEvent).ordinal()];
                if (i5 != 1) {
                    if (i5 == 2) {
                        KeyEvent keyEvent2 = keyEvent;
                        boolArr[i4] = Boolean.valueOf(zArr[i4]);
                    } else if (i5 != 3) {
                        KeyEvent keyEvent3 = keyEvent;
                    } else {
                        if (!z4) {
                            arrayList2.add(new C(this, cVar, keyEvent));
                        } else {
                            KeyEvent keyEvent4 = keyEvent;
                        }
                        boolArr[i4] = Boolean.valueOf(zArr[i4]);
                    }
                    i4++;
                } else {
                    KeyEvent keyEvent5 = keyEvent;
                    boolArr[i4] = Boolean.FALSE;
                    if (!z4) {
                        arrayList2.add(new B(this, cVar, j5, keyEvent));
                    }
                }
            } else {
                KeyEvent keyEvent6 = keyEvent;
                if (!z5 && !containsKey) {
                    z6 = false;
                }
            }
            z5 = z6;
            i4++;
        }
        KeyEvent keyEvent7 = keyEvent;
        if (z4) {
            for (int i6 = 0; i6 < dVar2.f1879b.length; i6++) {
                if (boolArr[i6] == null) {
                    if (z5) {
                        boolArr[i6] = Boolean.valueOf(zArr[i6]);
                    } else {
                        boolArr[i6] = Boolean.TRUE;
                        z5 = true;
                    }
                }
            }
            if (!z5) {
                boolArr[0] = Boolean.TRUE;
            }
        } else {
            for (int i7 = 0; i7 < dVar2.f1879b.length; i7++) {
                if (boolArr[i7] == null) {
                    boolArr[i7] = Boolean.FALSE;
                }
            }
        }
        for (int i8 = 0; i8 < dVar2.f1879b.length; i8++) {
            if (zArr[i8] != boolArr[i8].booleanValue()) {
                F.c cVar2 = dVar2.f1879b[i8];
                q(boolArr[i8].booleanValue(), Long.valueOf(cVar2.f1877b), Long.valueOf(cVar2.f1876a), keyEvent.getEventTime());
            }
        }
    }

    public void p(F.e eVar, boolean z4, long j4, KeyEvent keyEvent) {
        if (eVar.f1882c != j4 && eVar.f1883d != z4) {
            boolean containsKey = this.f1859b.containsKey(Long.valueOf(eVar.f1881b));
            boolean z5 = !containsKey;
            if (!containsKey) {
                eVar.f1883d = !eVar.f1883d;
            }
            q(z5, Long.valueOf(eVar.f1882c), Long.valueOf(eVar.f1881b), keyEvent.getEventTime());
            if (containsKey) {
                eVar.f1883d = !eVar.f1883d;
            }
            q(containsKey, Long.valueOf(eVar.f1882c), Long.valueOf(eVar.f1881b), keyEvent.getEventTime());
        }
    }

    public final void q(boolean z4, Long l4, Long l5, long j4) {
        z zVar = new z();
        zVar.f1992a = j4;
        zVar.f1993b = z4 ? z.b.kDown : z.b.kUp;
        zVar.f1995d = l4.longValue();
        zVar.f1994c = l5.longValue();
        zVar.f1998g = null;
        zVar.f1996e = true;
        zVar.f1997f = z.a.kKeyboard;
        if (!(l5.longValue() == 0 || l4.longValue() == 0)) {
            if (!z4) {
                l4 = null;
            }
            r(l5, l4);
        }
        n(zVar, (E.d.a) null);
    }

    public void r(Long l4, Long l5) {
        if (l5 != null) {
            if (((Long) this.f1859b.put(l4, l5)) != null) {
                throw new AssertionError("The key was not empty");
            }
        } else if (((Long) this.f1859b.remove(l4)) == null) {
            throw new AssertionError("The key was empty");
        }
    }
}
