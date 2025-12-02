package i0;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class P {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f9922a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f9923b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f9924c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public L f9925d;

    public void A(L l4) {
        this.f9925d = l4;
    }

    public Bundle B(String str, Bundle bundle) {
        return bundle != null ? (Bundle) this.f9924c.put(str, bundle) : (Bundle) this.f9924c.remove(str);
    }

    public void a(C0695p pVar) {
        if (!this.f9922a.contains(pVar)) {
            synchronized (this.f9922a) {
                this.f9922a.add(pVar);
            }
            pVar.f10175n = true;
            return;
        }
        throw new IllegalStateException("Fragment already added: " + pVar);
    }

    public void b() {
        this.f9923b.values().removeAll(Collections.singleton((Object) null));
    }

    public boolean c(String str) {
        return this.f9923b.get(str) != null;
    }

    public void d(int i4) {
        for (O o4 : this.f9923b.values()) {
            if (o4 != null) {
                o4.s(i4);
            }
        }
    }

    public void e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2 = str + "    ";
        if (!this.f9923b.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (O o4 : this.f9923b.values()) {
                printWriter.print(str);
                if (o4 != null) {
                    C0695p k4 = o4.k();
                    printWriter.println(k4);
                    k4.h(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size = this.f9922a.size();
        if (size > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i4 = 0; i4 < size; i4++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i4);
                printWriter.print(": ");
                printWriter.println(((C0695p) this.f9922a.get(i4)).toString());
            }
        }
    }

    public C0695p f(String str) {
        O o4 = (O) this.f9923b.get(str);
        if (o4 != null) {
            return o4.k();
        }
        return null;
    }

    public C0695p g(int i4) {
        for (int size = this.f9922a.size() - 1; size >= 0; size--) {
            C0695p pVar = (C0695p) this.f9922a.get(size);
            if (pVar != null && pVar.f10133A == i4) {
                return pVar;
            }
        }
        for (O o4 : this.f9923b.values()) {
            if (o4 != null) {
                C0695p k4 = o4.k();
                if (k4.f10133A == i4) {
                    return k4;
                }
            }
        }
        return null;
    }

    public C0695p h(String str) {
        if (str != null) {
            for (int size = this.f9922a.size() - 1; size >= 0; size--) {
                C0695p pVar = (C0695p) this.f9922a.get(size);
                if (pVar != null && str.equals(pVar.f10135C)) {
                    return pVar;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (O o4 : this.f9923b.values()) {
            if (o4 != null) {
                C0695p k4 = o4.k();
                if (str.equals(k4.f10135C)) {
                    return k4;
                }
            }
        }
        return null;
    }

    public C0695p i(String str) {
        C0695p j4;
        for (O o4 : this.f9923b.values()) {
            if (o4 != null && (j4 = o4.k().j(str)) != null) {
                return j4;
            }
        }
        return null;
    }

    public int j(C0695p pVar) {
        View view;
        View view2;
        ViewGroup viewGroup = pVar.f10143K;
        if (viewGroup == null) {
            return -1;
        }
        int indexOf = this.f9922a.indexOf(pVar);
        for (int i4 = indexOf - 1; i4 >= 0; i4--) {
            C0695p pVar2 = (C0695p) this.f9922a.get(i4);
            if (pVar2.f10143K == viewGroup && (view2 = pVar2.f10144L) != null) {
                return viewGroup.indexOfChild(view2) + 1;
            }
        }
        while (true) {
            indexOf++;
            if (indexOf >= this.f9922a.size()) {
                return -1;
            }
            C0695p pVar3 = (C0695p) this.f9922a.get(indexOf);
            if (pVar3.f10143K == viewGroup && (view = pVar3.f10144L) != null) {
                return viewGroup.indexOfChild(view);
            }
        }
    }

    public List k() {
        ArrayList arrayList = new ArrayList();
        for (O o4 : this.f9923b.values()) {
            if (o4 != null) {
                arrayList.add(o4);
            }
        }
        return arrayList;
    }

    public List l() {
        ArrayList arrayList = new ArrayList();
        for (O o4 : this.f9923b.values()) {
            if (o4 != null) {
                arrayList.add(o4.k());
            } else {
                arrayList.add((Object) null);
            }
        }
        return arrayList;
    }

    public HashMap m() {
        return this.f9924c;
    }

    public O n(String str) {
        return (O) this.f9923b.get(str);
    }

    public List o() {
        ArrayList arrayList;
        if (this.f9922a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f9922a) {
            arrayList = new ArrayList(this.f9922a);
        }
        return arrayList;
    }

    public L p() {
        return this.f9925d;
    }

    public Bundle q(String str) {
        return (Bundle) this.f9924c.get(str);
    }

    public void r(O o4) {
        C0695p k4 = o4.k();
        if (!c(k4.f10169h)) {
            this.f9923b.put(k4.f10169h, o4);
            if (k4.f10139G) {
                if (k4.f10138F) {
                    this.f9925d.c(k4);
                } else {
                    this.f9925d.m(k4);
                }
                k4.f10139G = false;
            }
            if (I.I0(2)) {
                Log.v("FragmentManager", "Added fragment to active set " + k4);
            }
        }
    }

    public void s(O o4) {
        C0695p k4 = o4.k();
        if (k4.f10138F) {
            this.f9925d.m(k4);
        }
        if (this.f9923b.get(k4.f10169h) == o4 && ((O) this.f9923b.put(k4.f10169h, (Object) null)) != null && I.I0(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + k4);
        }
    }

    public void t() {
        Iterator it = this.f9922a.iterator();
        while (it.hasNext()) {
            O o4 = (O) this.f9923b.get(((C0695p) it.next()).f10169h);
            if (o4 != null) {
                o4.m();
            }
        }
        for (O o5 : this.f9923b.values()) {
            if (o5 != null) {
                o5.m();
                C0695p k4 = o5.k();
                if (k4.f10176o && !k4.c0()) {
                    if (k4.f10178q && !this.f9924c.containsKey(k4.f10169h)) {
                        B(k4.f10169h, o5.q());
                    }
                    s(o5);
                }
            }
        }
    }

    public void u(C0695p pVar) {
        synchronized (this.f9922a) {
            this.f9922a.remove(pVar);
        }
        pVar.f10175n = false;
    }

    public void v() {
        this.f9923b.clear();
    }

    public void w(List list) {
        this.f9922a.clear();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                C0695p f4 = f(str);
                if (f4 != null) {
                    if (I.I0(2)) {
                        Log.v("FragmentManager", "restoreSaveState: added (" + str + "): " + f4);
                    }
                    a(f4);
                } else {
                    throw new IllegalStateException("No instantiated fragment for (" + str + ")");
                }
            }
        }
    }

    public void x(HashMap hashMap) {
        this.f9924c.clear();
        this.f9924c.putAll(hashMap);
    }

    public ArrayList y() {
        ArrayList arrayList = new ArrayList(this.f9923b.size());
        for (O o4 : this.f9923b.values()) {
            if (o4 != null) {
                C0695p k4 = o4.k();
                B(k4.f10169h, o4.q());
                arrayList.add(k4.f10169h);
                if (I.I0(2)) {
                    Log.v("FragmentManager", "Saved state of " + k4 + ": " + k4.f10163d);
                }
            }
        }
        return arrayList;
    }

    public ArrayList z() {
        synchronized (this.f9922a) {
            try {
                if (this.f9922a.isEmpty()) {
                    return null;
                }
                ArrayList arrayList = new ArrayList(this.f9922a.size());
                Iterator it = this.f9922a.iterator();
                while (it.hasNext()) {
                    C0695p pVar = (C0695p) it.next();
                    arrayList.add(pVar.f10169h);
                    if (I.I0(2)) {
                        Log.v("FragmentManager", "saveAllState: adding fragment (" + pVar.f10169h + "): " + pVar);
                    }
                }
                return arrayList;
            } finally {
            }
        }
    }
}
