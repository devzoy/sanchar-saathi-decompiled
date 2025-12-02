package N2;

import android.content.Context;
import android.graphics.Matrix;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;
import java.util.Map;

/* renamed from: N2.a  reason: case insensitive filesystem */
public class C0287a {

    /* renamed from: e  reason: collision with root package name */
    public static final Matrix f1897e = new Matrix();

    /* renamed from: a  reason: collision with root package name */
    public final FlutterRenderer f1898a;

    /* renamed from: b  reason: collision with root package name */
    public final G f1899b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f1900c;

    /* renamed from: d  reason: collision with root package name */
    public final Map f1901d = new HashMap();

    public C0287a(FlutterRenderer flutterRenderer, boolean z4) {
        this.f1898a = flutterRenderer;
        this.f1899b = G.a();
        this.f1900c = z4;
    }

    public final void a(MotionEvent motionEvent, int i4, int i5, int i6, Matrix matrix, ByteBuffer byteBuffer) {
        b(motionEvent, i4, i5, i6, matrix, byteBuffer, (Context) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x018f  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x019c  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x01ab  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x01d2  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01db  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01fe  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(android.view.MotionEvent r26, int r27, int r28, int r29, android.graphics.Matrix r30, java.nio.ByteBuffer r31, android.content.Context r32) {
        /*
            r25 = this;
            r0 = r25
            r1 = r26
            r2 = r27
            r3 = r28
            r4 = r31
            r5 = r32
            r6 = 1
            r7 = 0
            r8 = 2
            r9 = -1
            if (r3 != r9) goto L_0x0013
            return
        L_0x0013:
            int r10 = r26.getPointerId(r27)
            int r11 = r26.getToolType(r27)
            int r11 = r0.f(r11)
            float r12 = r26.getX(r27)
            float r13 = r26.getY(r27)
            float[] r14 = new float[r8]
            r14[r7] = r12
            r14[r6] = r13
            r12 = r30
            r12.mapPoints(r14)
            r12 = 4
            r7 = 0
            if (r11 != r6) goto L_0x0058
            int r16 = r26.getButtonState()
            r13 = r16 & 31
            r17 = r10
            long r9 = (long) r13
            int r13 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r13 != 0) goto L_0x0067
            int r13 = r26.getSource()
            r15 = 8194(0x2002, float:1.1482E-41)
            if (r13 != r15) goto L_0x0067
            if (r3 != r12) goto L_0x0067
            java.util.Map r12 = r0.f1901d
            java.lang.Integer r13 = java.lang.Integer.valueOf(r17)
            r12.put(r13, r14)
            goto L_0x0067
        L_0x0058:
            r17 = r10
            r9 = 2
            if (r11 != r9) goto L_0x0066
            int r9 = r26.getButtonState()
            int r9 = r9 >> r12
            r9 = r9 & 15
            long r9 = (long) r9
            goto L_0x0067
        L_0x0066:
            r9 = r7
        L_0x0067:
            java.util.Map r12 = r0.f1901d
            java.lang.Integer r13 = java.lang.Integer.valueOf(r17)
            boolean r12 = r12.containsKey(r13)
            if (r12 == 0) goto L_0x007d
            int r13 = r0.e(r3)
            r15 = -1
            if (r13 != r15) goto L_0x007b
            return
        L_0x007b:
            r15 = r13
            goto L_0x007e
        L_0x007d:
            r15 = -1
        L_0x007e:
            boolean r13 = r0.f1900c
            if (r13 == 0) goto L_0x008f
            N2.G r13 = r0.f1899b
            N2.G$a r13 = r13.c(r1)
            long r18 = r13.d()
            r6 = r18
            goto L_0x0090
        L_0x008f:
            r6 = r7
        L_0x0090:
            int r8 = r26.getActionMasked()
            r13 = 8
            if (r8 != r13) goto L_0x009a
            r8 = 1
            goto L_0x009b
        L_0x009a:
            r8 = 0
        L_0x009b:
            long r20 = r26.getEventTime()
            r22 = 1000(0x3e8, double:4.94E-321)
            r24 = r14
            long r13 = r20 * r22
            r4.putLong(r6)
            r4.putLong(r13)
            if (r12 == 0) goto L_0x00b7
            long r6 = (long) r15
            r4.putLong(r6)
            r6 = 4
            r4.putLong(r6)
            goto L_0x00bf
        L_0x00b7:
            long r6 = (long) r3
            r4.putLong(r6)
            long r6 = (long) r11
            r4.putLong(r6)
        L_0x00bf:
            long r6 = (long) r8
            r4.putLong(r6)
            r3 = r17
            long r6 = (long) r3
            r4.putLong(r6)
            r6 = 0
            r4.putLong(r6)
            if (r12 == 0) goto L_0x00ef
            java.util.Map r6 = r0.f1901d
            java.lang.Integer r7 = java.lang.Integer.valueOf(r3)
            java.lang.Object r6 = r6.get(r7)
            float[] r6 = (float[]) r6
            r7 = 0
            r13 = r6[r7]
            double r13 = (double) r13
            r4.putDouble(r13)
            r14 = 1
            r6 = r6[r14]
            r17 = r15
            double r14 = (double) r6
            r4.putDouble(r14)
            r7 = 8
            goto L_0x0101
        L_0x00ef:
            r17 = r15
            r7 = 0
            r6 = r24[r7]
            r7 = 8
            double r14 = (double) r6
            r4.putDouble(r14)
            r6 = 1
            r14 = r24[r6]
            double r14 = (double) r14
            r4.putDouble(r14)
        L_0x0101:
            r14 = 0
            r4.putDouble(r14)
            r4.putDouble(r14)
            r4.putLong(r9)
            r9 = 0
            r4.putLong(r9)
            r4.putLong(r9)
            float r6 = r26.getPressure(r27)
            double r9 = (double) r6
            r4.putDouble(r9)
            android.view.InputDevice r6 = r26.getDevice()
            if (r6 == 0) goto L_0x0140
            android.view.InputDevice r6 = r26.getDevice()
            r13 = 2
            android.view.InputDevice$MotionRange r6 = r6.getMotionRange(r13)
            r13 = r14
            r15 = r17
            if (r6 == 0) goto L_0x013d
            float r9 = r6.getMin()
            double r9 = (double) r9
            float r6 = r6.getMax()
            r17 = r8
            double r7 = (double) r6
            goto L_0x0147
        L_0x013d:
            r17 = r8
            goto L_0x0144
        L_0x0140:
            r13 = r14
            r15 = r17
            goto L_0x013d
        L_0x0144:
            r9 = r13
            r7 = 4607182418800017408(0x3ff0000000000000, double:1.0)
        L_0x0147:
            r4.putDouble(r9)
            r4.putDouble(r7)
            r6 = 2
            if (r11 != r6) goto L_0x015e
            r7 = 24
            float r7 = r1.getAxisValue(r7, r2)
            double r7 = (double) r7
            r4.putDouble(r7)
            r4.putDouble(r13)
            goto L_0x0164
        L_0x015e:
            r4.putDouble(r13)
            r4.putDouble(r13)
        L_0x0164:
            float r7 = r26.getSize(r27)
            double r7 = (double) r7
            r4.putDouble(r7)
            float r7 = r26.getToolMajor(r27)
            double r7 = (double) r7
            r4.putDouble(r7)
            float r7 = r26.getToolMinor(r27)
            double r7 = (double) r7
            r4.putDouble(r7)
            r4.putDouble(r13)
            r4.putDouble(r13)
            r7 = 8
            float r7 = r1.getAxisValue(r7, r2)
            double r7 = (double) r7
            r4.putDouble(r7)
            r6 = 2
            if (r11 != r6) goto L_0x019c
            r6 = 25
            float r6 = r1.getAxisValue(r6, r2)
            double r6 = (double) r6
            r4.putDouble(r6)
        L_0x0199:
            r6 = r29
            goto L_0x01a0
        L_0x019c:
            r4.putDouble(r13)
            goto L_0x0199
        L_0x01a0:
            long r6 = (long) r6
            r4.putLong(r6)
            r6 = 9
            r7 = r17
            r8 = 1
            if (r7 != r8) goto L_0x01d2
            if (r5 == 0) goto L_0x01b8
            float r7 = r0.c(r5)
            double r7 = (double) r7
            float r5 = r0.g(r5)
            double r9 = (double) r5
            goto L_0x01bb
        L_0x01b8:
            r7 = 4631952216750555136(0x4048000000000000, double:48.0)
            r9 = r7
        L_0x01bb:
            r5 = 10
            float r5 = r1.getAxisValue(r5, r2)
            float r5 = -r5
            double r13 = (double) r5
            double r7 = r7 * r13
            float r1 = r1.getAxisValue(r6, r2)
            float r1 = -r1
            double r1 = (double) r1
            double r9 = r9 * r1
            r4.putDouble(r7)
            r4.putDouble(r9)
            goto L_0x01d9
        L_0x01d2:
            r1 = r13
            r4.putDouble(r1)
            r4.putDouble(r1)
        L_0x01d9:
            if (r12 == 0) goto L_0x01fe
            java.util.Map r1 = r0.f1901d
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            java.lang.Object r1 = r1.get(r2)
            float[] r1 = (float[]) r1
            r2 = 0
            r5 = r24[r2]
            r2 = r1[r2]
            float r5 = r5 - r2
            double r7 = (double) r5
            r4.putDouble(r7)
            r2 = 1
            r5 = r24[r2]
            r1 = r1[r2]
            float r5 = r5 - r1
            double r1 = (double) r5
            r4.putDouble(r1)
            r1 = 0
            goto L_0x0206
        L_0x01fe:
            r1 = 0
            r4.putDouble(r1)
            r4.putDouble(r1)
        L_0x0206:
            r4.putDouble(r1)
            r4.putDouble(r1)
            r7 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r4.putDouble(r7)
            r4.putDouble(r1)
            r1 = 0
            r4.putLong(r1)
            if (r12 == 0) goto L_0x0226
            if (r15 != r6) goto L_0x0226
            java.util.Map r1 = r0.f1901d
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            r1.remove(r2)
        L_0x0226:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: N2.C0287a.b(android.view.MotionEvent, int, int, int, android.graphics.Matrix, java.nio.ByteBuffer, android.content.Context):void");
    }

    public final float c(Context context) {
        return ViewConfiguration.get(context).getScaledHorizontalScrollFactor();
    }

    public final int d(int i4) {
        if (i4 == 0) {
            return 4;
        }
        if (i4 == 1) {
            return 6;
        }
        if (i4 == 5) {
            return 4;
        }
        if (i4 == 6) {
            return 6;
        }
        if (i4 == 2) {
            return 5;
        }
        if (i4 == 7) {
            return 3;
        }
        if (i4 == 3) {
            return 0;
        }
        return i4 == 8 ? 3 : -1;
    }

    public final int e(int i4) {
        if (i4 == 4) {
            return 7;
        }
        if (i4 == 5) {
            return 8;
        }
        return (i4 == 6 || i4 == 0) ? 9 : -1;
    }

    public final int f(int i4) {
        if (i4 == 1) {
            return 0;
        }
        if (i4 == 2) {
            return 2;
        }
        if (i4 != 3) {
            return i4 != 4 ? 5 : 3;
        }
        return 1;
    }

    public final float g(Context context) {
        return h(context);
    }

    public final float h(Context context) {
        return ViewConfiguration.get(context).getScaledVerticalScrollFactor();
    }

    public boolean i(MotionEvent motionEvent, Context context) {
        boolean isFromSource = motionEvent.isFromSource(2);
        boolean z4 = motionEvent.getActionMasked() == 7 || motionEvent.getActionMasked() == 8;
        if (!isFromSource || !z4) {
            return false;
        }
        int d4 = d(motionEvent.getActionMasked());
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(motionEvent.getPointerCount() * 288);
        allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
        b(motionEvent, motionEvent.getActionIndex(), d4, 0, f1897e, allocateDirect, context);
        if (allocateDirect.position() % 288 == 0) {
            this.f1898a.l(allocateDirect, allocateDirect.position());
            return true;
        }
        throw new AssertionError("Packet position is not on field boundary.");
    }

    public boolean j(MotionEvent motionEvent) {
        return k(motionEvent, f1897e);
    }

    public boolean k(MotionEvent motionEvent, Matrix matrix) {
        MotionEvent motionEvent2 = motionEvent;
        int actionMasked = motionEvent.getActionMasked();
        int d4 = d(motionEvent.getActionMasked());
        boolean z4 = actionMasked == 0 || actionMasked == 5;
        boolean z5 = !z4 && (actionMasked == 1 || actionMasked == 6);
        int i4 = (!z5 || f(motionEvent2.getToolType(motionEvent.getActionIndex())) != 0) ? 0 : 1;
        int pointerCount = motionEvent.getPointerCount();
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect((pointerCount + i4) * 288);
        allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
        if (z4) {
            a(motionEvent, motionEvent.getActionIndex(), d4, 0, matrix, allocateDirect);
        } else if (z5) {
            for (int i5 = 0; i5 < pointerCount; i5++) {
                if (i5 != motionEvent.getActionIndex() && motionEvent2.getToolType(i5) == 1) {
                    a(motionEvent, i5, 5, 1, matrix, allocateDirect);
                }
            }
            a(motionEvent, motionEvent.getActionIndex(), d4, 0, matrix, allocateDirect);
            if (i4 != 0) {
                a(motionEvent, motionEvent.getActionIndex(), 2, 0, matrix, allocateDirect);
            }
        } else {
            for (int i6 = 0; i6 < pointerCount; i6++) {
                a(motionEvent, i6, d4, 0, matrix, allocateDirect);
            }
        }
        if (allocateDirect.position() % 288 == 0) {
            this.f1898a.l(allocateDirect, allocateDirect.position());
            return true;
        }
        throw new AssertionError("Packet position is not on field boundary");
    }
}
