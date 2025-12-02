package i0;

import android.util.Log;
import java.io.Writer;

public final class W extends Writer {

    /* renamed from: e  reason: collision with root package name */
    public final String f9984e;

    /* renamed from: f  reason: collision with root package name */
    public StringBuilder f9985f = new StringBuilder(128);

    public W(String str) {
        this.f9984e = str;
    }

    public final void b() {
        if (this.f9985f.length() > 0) {
            Log.d(this.f9984e, this.f9985f.toString());
            StringBuilder sb = this.f9985f;
            sb.delete(0, sb.length());
        }
    }

    public void close() {
        b();
    }

    public void flush() {
        b();
    }

    public void write(char[] cArr, int i4, int i5) {
        for (int i6 = 0; i6 < i5; i6++) {
            char c4 = cArr[i4 + i6];
            if (c4 == 10) {
                b();
            } else {
                this.f9985f.append(c4);
            }
        }
    }
}
