package i0;

import android.util.Log;
import i0.I;
import i0.Q;
import java.io.PrintWriter;
import java.util.ArrayList;
import net.sqlcipher.IBulkCursor;

/* renamed from: i0.a  reason: case insensitive filesystem */
public final class C0680a extends Q implements I.l {

    /* renamed from: t  reason: collision with root package name */
    public final I f10024t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f10025u;

    /* renamed from: v  reason: collision with root package name */
    public int f10026v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f10027w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0680a(I i4) {
        super(i4.t0(), i4.v0() != null ? i4.v0().o().getClassLoader() : null);
        this.f10026v = -1;
        this.f10027w = false;
        this.f10024t = i4;
    }

    public boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (I.I0(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f9934i) {
            return true;
        }
        this.f10024t.h(this);
        return true;
    }

    public int f() {
        return q(false);
    }

    public int g() {
        return q(true);
    }

    public void h() {
        j();
        this.f10024t.b0(this, false);
    }

    public void i() {
        j();
        this.f10024t.b0(this, true);
    }

    public void k(int i4, C0695p pVar, String str, int i5) {
        super.k(i4, pVar, str, i5);
        pVar.f10184w = this.f10024t;
    }

    public Q l(C0695p pVar) {
        I i4 = pVar.f10184w;
        if (i4 == null || i4 == this.f10024t) {
            return super.l(pVar);
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + pVar.toString() + " is already attached to a FragmentManager.");
    }

    public void p(int i4) {
        if (this.f9934i) {
            if (I.I0(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i4);
            }
            int size = this.f9928c.size();
            for (int i5 = 0; i5 < size; i5++) {
                Q.a aVar = (Q.a) this.f9928c.get(i5);
                C0695p pVar = aVar.f9946b;
                if (pVar != null) {
                    pVar.f10183v += i4;
                    if (I.I0(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + aVar.f9946b + " to " + aVar.f9946b.f10183v);
                    }
                }
            }
        }
    }

    public int q(boolean z4) {
        if (!this.f10025u) {
            if (I.I0(2)) {
                Log.v("FragmentManager", "Commit: " + this);
                PrintWriter printWriter = new PrintWriter(new W("FragmentManager"));
                r("  ", printWriter);
                printWriter.close();
            }
            this.f10025u = true;
            if (this.f9934i) {
                this.f10026v = this.f10024t.k();
            } else {
                this.f10026v = -1;
            }
            this.f10024t.Y(this, z4);
            return this.f10026v;
        }
        throw new IllegalStateException("commit already called");
    }

    public void r(String str, PrintWriter printWriter) {
        s(str, printWriter, true);
    }

    public void s(String str, PrintWriter printWriter, boolean z4) {
        String str2;
        if (z4) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f9936k);
            printWriter.print(" mIndex=");
            printWriter.print(this.f10026v);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f10025u);
            if (this.f9933h != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f9933h));
            }
            if (!(this.f9929d == 0 && this.f9930e == 0)) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f9929d));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f9930e));
            }
            if (!(this.f9931f == 0 && this.f9932g == 0)) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f9931f));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f9932g));
            }
            if (!(this.f9937l == 0 && this.f9938m == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f9937l));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f9938m);
            }
            if (!(this.f9939n == 0 && this.f9940o == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f9939n));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f9940o);
            }
        }
        if (!this.f9928c.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            int size = this.f9928c.size();
            for (int i4 = 0; i4 < size; i4++) {
                Q.a aVar = (Q.a) this.f9928c.get(i4);
                switch (aVar.f9945a) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    case 8:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case IBulkCursor.WANTS_ON_MOVE_TRANSACTION /*9*/:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    case IBulkCursor.GET_EXTRAS_TRANSACTION /*10*/:
                        str2 = "OP_SET_MAX_LIFECYCLE";
                        break;
                    default:
                        str2 = "cmd=" + aVar.f9945a;
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i4);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(aVar.f9946b);
                if (z4) {
                    if (!(aVar.f9948d == 0 && aVar.f9949e == 0)) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f9948d));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f9949e));
                    }
                    if (aVar.f9950f != 0 || aVar.f9951g != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f9950f));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f9951g));
                    }
                }
            }
        }
    }

    public void t() {
        int size = this.f9928c.size();
        for (int i4 = 0; i4 < size; i4++) {
            Q.a aVar = (Q.a) this.f9928c.get(i4);
            C0695p pVar = aVar.f9946b;
            if (pVar != null) {
                pVar.f10178q = this.f10027w;
                pVar.z1(false);
                pVar.y1(this.f9933h);
                pVar.B1(this.f9941p, this.f9942q);
            }
            switch (aVar.f9945a) {
                case 1:
                    pVar.v1(aVar.f9948d, aVar.f9949e, aVar.f9950f, aVar.f9951g);
                    this.f10024t.o1(pVar, false);
                    this.f10024t.i(pVar);
                    break;
                case 3:
                    pVar.v1(aVar.f9948d, aVar.f9949e, aVar.f9950f, aVar.f9951g);
                    this.f10024t.h1(pVar);
                    break;
                case 4:
                    pVar.v1(aVar.f9948d, aVar.f9949e, aVar.f9950f, aVar.f9951g);
                    this.f10024t.F0(pVar);
                    break;
                case 5:
                    pVar.v1(aVar.f9948d, aVar.f9949e, aVar.f9950f, aVar.f9951g);
                    this.f10024t.o1(pVar, false);
                    this.f10024t.s1(pVar);
                    break;
                case 6:
                    pVar.v1(aVar.f9948d, aVar.f9949e, aVar.f9950f, aVar.f9951g);
                    this.f10024t.w(pVar);
                    break;
                case 7:
                    pVar.v1(aVar.f9948d, aVar.f9949e, aVar.f9950f, aVar.f9951g);
                    this.f10024t.o1(pVar, false);
                    this.f10024t.m(pVar);
                    break;
                case 8:
                    this.f10024t.q1(pVar);
                    break;
                case IBulkCursor.WANTS_ON_MOVE_TRANSACTION /*9*/:
                    this.f10024t.q1((C0695p) null);
                    break;
                case IBulkCursor.GET_EXTRAS_TRANSACTION /*10*/:
                    this.f10024t.p1(pVar, aVar.f9953i);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f9945a);
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f10026v >= 0) {
            sb.append(" #");
            sb.append(this.f10026v);
        }
        if (this.f9936k != null) {
            sb.append(" ");
            sb.append(this.f9936k);
        }
        sb.append("}");
        return sb.toString();
    }

    public void u() {
        for (int size = this.f9928c.size() - 1; size >= 0; size--) {
            Q.a aVar = (Q.a) this.f9928c.get(size);
            C0695p pVar = aVar.f9946b;
            if (pVar != null) {
                pVar.f10178q = this.f10027w;
                pVar.z1(true);
                pVar.y1(I.l1(this.f9933h));
                pVar.B1(this.f9942q, this.f9941p);
            }
            switch (aVar.f9945a) {
                case 1:
                    pVar.v1(aVar.f9948d, aVar.f9949e, aVar.f9950f, aVar.f9951g);
                    this.f10024t.o1(pVar, true);
                    this.f10024t.h1(pVar);
                    break;
                case 3:
                    pVar.v1(aVar.f9948d, aVar.f9949e, aVar.f9950f, aVar.f9951g);
                    this.f10024t.i(pVar);
                    break;
                case 4:
                    pVar.v1(aVar.f9948d, aVar.f9949e, aVar.f9950f, aVar.f9951g);
                    this.f10024t.s1(pVar);
                    break;
                case 5:
                    pVar.v1(aVar.f9948d, aVar.f9949e, aVar.f9950f, aVar.f9951g);
                    this.f10024t.o1(pVar, true);
                    this.f10024t.F0(pVar);
                    break;
                case 6:
                    pVar.v1(aVar.f9948d, aVar.f9949e, aVar.f9950f, aVar.f9951g);
                    this.f10024t.m(pVar);
                    break;
                case 7:
                    pVar.v1(aVar.f9948d, aVar.f9949e, aVar.f9950f, aVar.f9951g);
                    this.f10024t.o1(pVar, true);
                    this.f10024t.w(pVar);
                    break;
                case 8:
                    this.f10024t.q1((C0695p) null);
                    break;
                case IBulkCursor.WANTS_ON_MOVE_TRANSACTION /*9*/:
                    this.f10024t.q1(pVar);
                    break;
                case IBulkCursor.GET_EXTRAS_TRANSACTION /*10*/:
                    this.f10024t.p1(pVar, aVar.f9952h);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f9945a);
            }
        }
    }

    public C0695p v(ArrayList arrayList, C0695p pVar) {
        ArrayList arrayList2 = arrayList;
        C0695p pVar2 = pVar;
        int i4 = 0;
        while (i4 < this.f9928c.size()) {
            Q.a aVar = (Q.a) this.f9928c.get(i4);
            int i5 = aVar.f9945a;
            if (i5 != 1) {
                if (i5 == 2) {
                    C0695p pVar3 = aVar.f9946b;
                    int i6 = pVar3.f10134B;
                    boolean z4 = false;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        C0695p pVar4 = (C0695p) arrayList2.get(size);
                        if (pVar4.f10134B == i6) {
                            if (pVar4 == pVar3) {
                                z4 = true;
                            } else {
                                if (pVar4 == pVar2) {
                                    this.f9928c.add(i4, new Q.a(9, pVar4, true));
                                    i4++;
                                    pVar2 = null;
                                }
                                Q.a aVar2 = new Q.a(3, pVar4, true);
                                aVar2.f9948d = aVar.f9948d;
                                aVar2.f9950f = aVar.f9950f;
                                aVar2.f9949e = aVar.f9949e;
                                aVar2.f9951g = aVar.f9951g;
                                this.f9928c.add(i4, aVar2);
                                arrayList2.remove(pVar4);
                                i4++;
                            }
                        }
                    }
                    if (z4) {
                        this.f9928c.remove(i4);
                        i4--;
                    } else {
                        aVar.f9945a = 1;
                        aVar.f9947c = true;
                        arrayList2.add(pVar3);
                    }
                } else if (i5 == 3 || i5 == 6) {
                    arrayList2.remove(aVar.f9946b);
                    C0695p pVar5 = aVar.f9946b;
                    if (pVar5 == pVar2) {
                        this.f9928c.add(i4, new Q.a(9, pVar5));
                        i4++;
                        pVar2 = null;
                    }
                } else if (i5 != 7) {
                    if (i5 == 8) {
                        this.f9928c.add(i4, new Q.a(9, pVar2, true));
                        aVar.f9947c = true;
                        i4++;
                        pVar2 = aVar.f9946b;
                    }
                }
                i4++;
            }
            arrayList2.add(aVar.f9946b);
            i4++;
        }
        return pVar2;
    }

    public String w() {
        return this.f9936k;
    }

    public void x() {
        if (this.f9944s != null) {
            for (int i4 = 0; i4 < this.f9944s.size(); i4++) {
                ((Runnable) this.f9944s.get(i4)).run();
            }
            this.f9944s = null;
        }
    }

    public C0695p y(ArrayList arrayList, C0695p pVar) {
        for (int size = this.f9928c.size() - 1; size >= 0; size--) {
            Q.a aVar = (Q.a) this.f9928c.get(size);
            int i4 = aVar.f9945a;
            if (i4 != 1) {
                if (i4 != 3) {
                    switch (i4) {
                        case 6:
                            break;
                        case 7:
                            break;
                        case 8:
                            pVar = null;
                            break;
                        case IBulkCursor.WANTS_ON_MOVE_TRANSACTION /*9*/:
                            pVar = aVar.f9946b;
                            break;
                        case IBulkCursor.GET_EXTRAS_TRANSACTION /*10*/:
                            aVar.f9953i = aVar.f9952h;
                            break;
                    }
                }
                arrayList.add(aVar.f9946b);
            }
            arrayList.remove(aVar.f9946b);
        }
        return pVar;
    }
}
