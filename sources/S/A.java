package S;

import android.view.MotionEvent;

public class A {

    /* renamed from: a  reason: collision with root package name */
    public final float[] f2615a = new float[20];

    /* renamed from: b  reason: collision with root package name */
    public final long[] f2616b = new long[20];

    /* renamed from: c  reason: collision with root package name */
    public float f2617c = 0.0f;

    /* renamed from: d  reason: collision with root package name */
    public int f2618d = 0;

    /* renamed from: e  reason: collision with root package name */
    public int f2619e = 0;

    public static float f(float f4) {
        return (f4 < 0.0f ? -1.0f : 1.0f) * ((float) Math.sqrt((double) (Math.abs(f4) * 2.0f)));
    }

    public void a(MotionEvent motionEvent) {
        long eventTime = motionEvent.getEventTime();
        if (this.f2618d != 0 && eventTime - this.f2616b[this.f2619e] > 40) {
            b();
        }
        int i4 = (this.f2619e + 1) % 20;
        this.f2619e = i4;
        int i5 = this.f2618d;
        if (i5 != 20) {
            this.f2618d = i5 + 1;
        }
        this.f2615a[i4] = motionEvent.getAxisValue(26);
        this.f2616b[this.f2619e] = eventTime;
    }

    public final void b() {
        this.f2618d = 0;
        this.f2617c = 0.0f;
    }

    public void c(int i4, float f4) {
        float e4 = e() * ((float) i4);
        this.f2617c = e4;
        if (e4 < (-Math.abs(f4))) {
            this.f2617c = -Math.abs(f4);
        } else if (this.f2617c > Math.abs(f4)) {
            this.f2617c = Math.abs(f4);
        }
    }

    public float d(int i4) {
        if (i4 != 26) {
            return 0.0f;
        }
        return this.f2617c;
    }

    public final float e() {
        long[] jArr;
        long j4;
        int i4 = this.f2618d;
        if (i4 < 2) {
            return 0.0f;
        }
        int i5 = this.f2619e;
        int i6 = ((i5 + 20) - (i4 - 1)) % 20;
        long j5 = this.f2616b[i5];
        while (true) {
            jArr = this.f2616b;
            j4 = jArr[i6];
            if (j5 - j4 <= 100) {
                break;
            }
            this.f2618d--;
            i6 = (i6 + 1) % 20;
        }
        int i7 = this.f2618d;
        if (i7 < 2) {
            return 0.0f;
        }
        if (i7 == 2) {
            int i8 = (i6 + 1) % 20;
            long j6 = jArr[i8];
            if (j4 == j6) {
                return 0.0f;
            }
            return this.f2615a[i8] / ((float) (j6 - j4));
        }
        float f4 = 0.0f;
        int i9 = 0;
        for (int i10 = 0; i10 < this.f2618d - 1; i10++) {
            int i11 = i10 + i6;
            long[] jArr2 = this.f2616b;
            long j7 = jArr2[i11 % 20];
            int i12 = (i11 + 1) % 20;
            if (jArr2[i12] != j7) {
                i9++;
                float f5 = f(f4);
                float f6 = this.f2615a[i12] / ((float) (this.f2616b[i12] - j7));
                f4 += (f6 - f5) * Math.abs(f6);
                if (i9 == 1) {
                    f4 *= 0.5f;
                }
            }
        }
        return f(f4);
    }
}
