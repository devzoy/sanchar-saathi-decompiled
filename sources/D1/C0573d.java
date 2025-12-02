package d1;

import Q0.i;
import Z0.j;
import Z0.o;
import Z0.u;
import Z0.x;
import Z0.z;
import i3.C0746w;
import java.util.Iterator;
import java.util.List;
import v3.l;

/* renamed from: d1.d  reason: case insensitive filesystem */
public abstract class C0573d {

    /* renamed from: a  reason: collision with root package name */
    public static final String f8676a;

    static {
        String i4 = i.i("DiagnosticsWrkr");
        l.d(i4, "tagWithPrefix(\"DiagnosticsWrkr\")");
        f8676a = i4;
    }

    public static final String c(u uVar, String str, Integer num, String str2) {
        return 10 + uVar.f3834a + "\t " + uVar.f3836c + "\t " + num + "\t " + uVar.f3835b.name() + "\t " + str + "\t " + str2 + 9;
    }

    public static final String d(o oVar, z zVar, j jVar, List list) {
        StringBuilder sb = new StringBuilder();
        sb.append("\n Id \t Class Name\t " + "Job Id" + "\t State\t Unique Name\t Tags\t");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            u uVar = (u) it.next();
            Z0.i e4 = jVar.e(x.a(uVar));
            sb.append(c(uVar, C0746w.A(oVar.b(uVar.f3834a), ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (u3.l) null, 62, (Object) null), e4 != null ? Integer.valueOf(e4.f3809c) : null, C0746w.A(zVar.d(uVar.f3834a), ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (u3.l) null, 62, (Object) null)));
        }
        String sb2 = sb.toString();
        l.d(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
