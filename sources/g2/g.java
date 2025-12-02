package g2;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import i2.d;
import i2.f;
import java.lang.ref.WeakReference;

public class g {

    /* renamed from: a  reason: collision with root package name */
    public final TextPaint f9140a = new TextPaint(1);

    /* renamed from: b  reason: collision with root package name */
    public final f f9141b = new a();

    /* renamed from: c  reason: collision with root package name */
    public float f9142c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f9143d = true;

    /* renamed from: e  reason: collision with root package name */
    public WeakReference f9144e = new WeakReference((Object) null);

    /* renamed from: f  reason: collision with root package name */
    public d f9145f;

    public class a extends f {
        public a() {
        }

        public void a(int i4) {
            boolean unused = g.this.f9143d = true;
            b bVar = (b) g.this.f9144e.get();
            if (bVar != null) {
                bVar.a();
            }
        }

        public void b(Typeface typeface, boolean z4) {
            if (!z4) {
                boolean unused = g.this.f9143d = true;
                b bVar = (b) g.this.f9144e.get();
                if (bVar != null) {
                    bVar.a();
                }
            }
        }
    }

    public interface b {
        void a();

        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public g(b bVar) {
        g(bVar);
    }

    public final float c(CharSequence charSequence) {
        if (charSequence == null) {
            return 0.0f;
        }
        return this.f9140a.measureText(charSequence, 0, charSequence.length());
    }

    public d d() {
        return this.f9145f;
    }

    public TextPaint e() {
        return this.f9140a;
    }

    public float f(String str) {
        if (!this.f9143d) {
            return this.f9142c;
        }
        float c4 = c(str);
        this.f9142c = c4;
        this.f9143d = false;
        return c4;
    }

    public void g(b bVar) {
        this.f9144e = new WeakReference(bVar);
    }

    public void h(d dVar, Context context) {
        if (this.f9145f != dVar) {
            this.f9145f = dVar;
            if (dVar != null) {
                dVar.k(context, this.f9140a, this.f9141b);
                b bVar = (b) this.f9144e.get();
                if (bVar != null) {
                    this.f9140a.drawableState = bVar.getState();
                }
                dVar.j(context, this.f9140a, this.f9141b);
                this.f9143d = true;
            }
            b bVar2 = (b) this.f9144e.get();
            if (bVar2 != null) {
                bVar2.a();
                bVar2.onStateChange(bVar2.getState());
            }
        }
    }

    public void i(boolean z4) {
        this.f9143d = z4;
    }

    public void j(Context context) {
        this.f9145f.j(context, this.f9140a, this.f9141b);
    }
}
