package T1;

import S1.c;
import android.content.Context;
import android.graphics.Bitmap;
import android.media.Image;
import android.util.SparseArray;
import com.google.android.gms.internal.vision.C0514i1;
import com.google.android.gms.internal.vision.C2;
import com.google.android.gms.internal.vision.g2;
import java.nio.ByteBuffer;
import z1.C1032o;

public final class b extends S1.b {

    /* renamed from: c  reason: collision with root package name */
    public final g2 f2931c;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public Context f2932a;

        /* renamed from: b  reason: collision with root package name */
        public C0514i1 f2933b = new C0514i1();

        public a(Context context) {
            this.f2932a = context;
        }

        public b a() {
            return new b(new g2(this.f2932a, this.f2933b));
        }

        public a b(int i4) {
            this.f2933b.f7477e = i4;
            return this;
        }
    }

    public b(g2 g2Var) {
        this.f2931c = g2Var;
    }

    public final SparseArray a(c cVar) {
        a[] aVarArr;
        if (cVar != null) {
            C2 d4 = C2.d(cVar);
            if (cVar.a() != null) {
                aVarArr = this.f2931c.f((Bitmap) C1032o.f(cVar.a()), d4);
                if (aVarArr == null) {
                    throw new IllegalArgumentException("Internal barcode detector error; check logcat output.");
                }
            } else if (cVar.d() != null) {
                aVarArr = this.f2931c.g((ByteBuffer) C1032o.f(((Image.Plane[]) C1032o.f(cVar.d()))[0].getBuffer()), new C2(((Image.Plane[]) C1032o.f(cVar.d()))[0].getRowStride(), d4.f7200f, d4.f7201g, d4.f7202h, d4.f7203i));
            } else {
                aVarArr = this.f2931c.g((ByteBuffer) C1032o.f(cVar.b()), d4);
            }
            SparseArray sparseArray = new SparseArray(aVarArr.length);
            for (a aVar : aVarArr) {
                sparseArray.append(aVar.f2856f.hashCode(), aVar);
            }
            return sparseArray;
        }
        throw new IllegalArgumentException("No frame supplied.");
    }

    public final boolean b() {
        return this.f2931c.c();
    }

    public final void d() {
        super.d();
        this.f2931c.d();
    }
}
