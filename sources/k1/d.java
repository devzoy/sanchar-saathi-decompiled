package K1;

import java.util.Arrays;

public abstract class d extends e {

    /* renamed from: a  reason: collision with root package name */
    public Object[] f1684a = new Object[4];

    /* renamed from: b  reason: collision with root package name */
    public int f1685b = 0;

    /* renamed from: c  reason: collision with root package name */
    public boolean f1686c;

    public d(int i4) {
    }

    public final d a(Object obj) {
        int i4;
        obj.getClass();
        int length = this.f1684a.length;
        int i5 = this.f1685b;
        int i6 = i5 + 1;
        if (i6 >= 0) {
            if (i6 <= length) {
                i4 = length;
            } else {
                i4 = (length >> 1) + length + 1;
                if (i4 < i6) {
                    int highestOneBit = Integer.highestOneBit(i5);
                    i4 = highestOneBit + highestOneBit;
                }
                if (i4 < 0) {
                    i4 = Integer.MAX_VALUE;
                }
            }
            if (i4 > length || this.f1686c) {
                this.f1684a = Arrays.copyOf(this.f1684a, i4);
                this.f1686c = false;
            }
            Object[] objArr = this.f1684a;
            int i7 = this.f1685b;
            this.f1685b = i7 + 1;
            objArr[i7] = obj;
            return this;
        }
        throw new IllegalArgumentException("cannot store more than Integer.MAX_VALUE elements");
    }
}
