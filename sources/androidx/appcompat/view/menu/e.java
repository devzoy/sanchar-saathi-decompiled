package androidx.appcompat.view.menu;

import S.C0311b;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class e implements L.a {

    /* renamed from: A  reason: collision with root package name */
    public static final int[] f4260A = {1, 4, 5, 3, 2, 0};

    /* renamed from: a  reason: collision with root package name */
    public final Context f4261a;

    /* renamed from: b  reason: collision with root package name */
    public final Resources f4262b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f4263c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f4264d;

    /* renamed from: e  reason: collision with root package name */
    public a f4265e;

    /* renamed from: f  reason: collision with root package name */
    public ArrayList f4266f;

    /* renamed from: g  reason: collision with root package name */
    public ArrayList f4267g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f4268h;

    /* renamed from: i  reason: collision with root package name */
    public ArrayList f4269i;

    /* renamed from: j  reason: collision with root package name */
    public ArrayList f4270j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f4271k;

    /* renamed from: l  reason: collision with root package name */
    public int f4272l = 0;

    /* renamed from: m  reason: collision with root package name */
    public ContextMenu.ContextMenuInfo f4273m;

    /* renamed from: n  reason: collision with root package name */
    public CharSequence f4274n;

    /* renamed from: o  reason: collision with root package name */
    public Drawable f4275o;

    /* renamed from: p  reason: collision with root package name */
    public View f4276p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f4277q = false;

    /* renamed from: r  reason: collision with root package name */
    public boolean f4278r = false;

    /* renamed from: s  reason: collision with root package name */
    public boolean f4279s = false;

    /* renamed from: t  reason: collision with root package name */
    public boolean f4280t = false;

    /* renamed from: u  reason: collision with root package name */
    public boolean f4281u = false;

    /* renamed from: v  reason: collision with root package name */
    public ArrayList f4282v = new ArrayList();

    /* renamed from: w  reason: collision with root package name */
    public CopyOnWriteArrayList f4283w = new CopyOnWriteArrayList();

    /* renamed from: x  reason: collision with root package name */
    public g f4284x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f4285y = false;

    /* renamed from: z  reason: collision with root package name */
    public boolean f4286z;

    public interface a {
        boolean a(e eVar, MenuItem menuItem);

        void b(e eVar);
    }

    public interface b {
        boolean a(g gVar);
    }

    public e(Context context) {
        this.f4261a = context;
        this.f4262b = context.getResources();
        this.f4266f = new ArrayList();
        this.f4267g = new ArrayList();
        this.f4268h = true;
        this.f4269i = new ArrayList();
        this.f4270j = new ArrayList();
        this.f4271k = true;
        b0(true);
    }

    public static int B(int i4) {
        int i5 = (-65536 & i4) >> 16;
        if (i5 >= 0) {
            int[] iArr = f4260A;
            if (i5 < iArr.length) {
                return (i4 & 65535) | (iArr[i5] << 16);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    public static int n(ArrayList arrayList, int i4) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((g) arrayList.get(size)).f() <= i4) {
                return size + 1;
            }
        }
        return 0;
    }

    public boolean A() {
        return this.f4280t;
    }

    public Resources C() {
        return this.f4262b;
    }

    public e D() {
        return this;
    }

    public ArrayList E() {
        if (!this.f4268h) {
            return this.f4267g;
        }
        this.f4267g.clear();
        int size = this.f4266f.size();
        for (int i4 = 0; i4 < size; i4++) {
            g gVar = (g) this.f4266f.get(i4);
            if (gVar.isVisible()) {
                this.f4267g.add(gVar);
            }
        }
        this.f4268h = false;
        this.f4271k = true;
        return this.f4267g;
    }

    public boolean F() {
        return this.f4285y;
    }

    public boolean G() {
        return this.f4263c;
    }

    public boolean H() {
        return this.f4264d;
    }

    public void I(g gVar) {
        this.f4271k = true;
        K(true);
    }

    public void J(g gVar) {
        this.f4268h = true;
        K(true);
    }

    public void K(boolean z4) {
        if (!this.f4277q) {
            if (z4) {
                this.f4268h = true;
                this.f4271k = true;
            }
            i(z4);
            return;
        }
        this.f4278r = true;
        if (z4) {
            this.f4279s = true;
        }
    }

    public boolean L(MenuItem menuItem, int i4) {
        return M(menuItem, (i) null, i4);
    }

    public boolean M(MenuItem menuItem, i iVar, int i4) {
        g gVar = (g) menuItem;
        if (gVar == null || !gVar.isEnabled()) {
            return false;
        }
        boolean k4 = gVar.k();
        C0311b a4 = gVar.a();
        boolean z4 = a4 != null && a4.a();
        if (gVar.j()) {
            k4 |= gVar.expandActionView();
            if (k4) {
                e(true);
            }
        } else if (gVar.hasSubMenu() || z4) {
            if ((i4 & 4) == 0) {
                e(false);
            }
            if (!gVar.hasSubMenu()) {
                gVar.x(new l(u(), this, gVar));
            }
            l lVar = (l) gVar.getSubMenu();
            if (z4) {
                a4.e(lVar);
            }
            k4 |= j(lVar, iVar);
            if (!k4) {
                e(true);
            }
        } else if ((i4 & 1) == 0) {
            e(true);
        }
        return k4;
    }

    public final void N(int i4, boolean z4) {
        if (i4 >= 0 && i4 < this.f4266f.size()) {
            this.f4266f.remove(i4);
            if (z4) {
                K(true);
            }
        }
    }

    public void O(i iVar) {
        Iterator it = this.f4283w.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            i iVar2 = (i) weakReference.get();
            if (iVar2 == null || iVar2 == iVar) {
                this.f4283w.remove(weakReference);
            }
        }
    }

    public void P(Bundle bundle) {
        MenuItem findItem;
        if (bundle != null) {
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(t());
            int size = size();
            for (int i4 = 0; i4 < size; i4++) {
                MenuItem item = getItem(i4);
                View actionView = item.getActionView();
                if (!(actionView == null || actionView.getId() == -1)) {
                    actionView.restoreHierarchyState(sparseParcelableArray);
                }
                if (item.hasSubMenu()) {
                    ((l) item.getSubMenu()).P(bundle);
                }
            }
            int i5 = bundle.getInt("android:menu:expandedactionview");
            if (i5 > 0 && (findItem = findItem(i5)) != null) {
                findItem.expandActionView();
            }
        }
    }

    public void Q(Bundle bundle) {
        int size = size();
        SparseArray sparseArray = null;
        for (int i4 = 0; i4 < size; i4++) {
            MenuItem item = getItem(i4);
            View actionView = item.getActionView();
            if (!(actionView == null || actionView.getId() == -1)) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((l) item.getSubMenu()).Q(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(t(), sparseArray);
        }
    }

    public void R(a aVar) {
        this.f4265e = aVar;
    }

    public e S(int i4) {
        this.f4272l = i4;
        return this;
    }

    public void T(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.f4266f.size();
        d0();
        for (int i4 = 0; i4 < size; i4++) {
            g gVar = (g) this.f4266f.get(i4);
            if (gVar.getGroupId() == groupId && gVar.m() && gVar.isCheckable()) {
                gVar.s(gVar == menuItem);
            }
        }
        c0();
    }

    public e U(int i4) {
        W(0, (CharSequence) null, i4, (Drawable) null, (View) null);
        return this;
    }

    public e V(Drawable drawable) {
        W(0, (CharSequence) null, 0, drawable, (View) null);
        return this;
    }

    public final void W(int i4, CharSequence charSequence, int i5, Drawable drawable, View view) {
        Resources C4 = C();
        if (view != null) {
            this.f4276p = view;
            this.f4274n = null;
            this.f4275o = null;
        } else {
            if (i4 > 0) {
                this.f4274n = C4.getText(i4);
            } else if (charSequence != null) {
                this.f4274n = charSequence;
            }
            if (i5 > 0) {
                this.f4275o = H.a.d(u(), i5);
            } else if (drawable != null) {
                this.f4275o = drawable;
            }
            this.f4276p = null;
        }
        K(false);
    }

    public e X(int i4) {
        W(i4, (CharSequence) null, 0, (Drawable) null, (View) null);
        return this;
    }

    public e Y(CharSequence charSequence) {
        W(0, charSequence, 0, (Drawable) null, (View) null);
        return this;
    }

    public e Z(View view) {
        W(0, (CharSequence) null, 0, (Drawable) null, view);
        return this;
    }

    public MenuItem a(int i4, int i5, int i6, CharSequence charSequence) {
        int B4 = B(i6);
        g g4 = g(i4, i5, i6, B4, charSequence, this.f4272l);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.f4273m;
        if (contextMenuInfo != null) {
            g4.v(contextMenuInfo);
        }
        ArrayList arrayList = this.f4266f;
        arrayList.add(n(arrayList, B4), g4);
        K(true);
        return g4;
    }

    public void a0(boolean z4) {
        this.f4286z = z4;
    }

    public MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    public int addIntentOptions(int i4, int i5, int i6, ComponentName componentName, Intent[] intentArr, Intent intent, int i7, MenuItem[] menuItemArr) {
        int i8;
        PackageManager packageManager = this.f4261a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i7 & 1) == 0) {
            removeGroup(i4);
        }
        for (int i9 = 0; i9 < size; i9++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i9);
            int i10 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i10 < 0 ? intent : intentArr[i10]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem intent3 = add(i4, i5, i6, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && (i8 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i8] = intent3;
            }
        }
        return size;
    }

    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public void b(i iVar) {
        c(iVar, this.f4261a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0019, code lost:
        if (S.G.j(android.view.ViewConfiguration.get(r2.f4261a), r2.f4261a) != false) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b0(boolean r3) {
        /*
            r2 = this;
            if (r3 == 0) goto L_0x001c
            android.content.res.Resources r3 = r2.f4262b
            android.content.res.Configuration r3 = r3.getConfiguration()
            int r3 = r3.keyboard
            r0 = 1
            if (r3 == r0) goto L_0x001c
            android.content.Context r3 = r2.f4261a
            android.view.ViewConfiguration r3 = android.view.ViewConfiguration.get(r3)
            android.content.Context r1 = r2.f4261a
            boolean r3 = S.G.j(r3, r1)
            if (r3 == 0) goto L_0x001c
            goto L_0x001d
        L_0x001c:
            r0 = 0
        L_0x001d:
            r2.f4264d = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.e.b0(boolean):void");
    }

    public void c(i iVar, Context context) {
        this.f4283w.add(new WeakReference(iVar));
        iVar.d(context, this);
        this.f4271k = true;
    }

    public void c0() {
        this.f4277q = false;
        if (this.f4278r) {
            this.f4278r = false;
            K(this.f4279s);
        }
    }

    public void clear() {
        g gVar = this.f4284x;
        if (gVar != null) {
            f(gVar);
        }
        this.f4266f.clear();
        K(true);
    }

    public void clearHeader() {
        this.f4275o = null;
        this.f4274n = null;
        this.f4276p = null;
        K(false);
    }

    public void close() {
        e(true);
    }

    public void d() {
        a aVar = this.f4265e;
        if (aVar != null) {
            aVar.b(this);
        }
    }

    public void d0() {
        if (!this.f4277q) {
            this.f4277q = true;
            this.f4278r = false;
            this.f4279s = false;
        }
    }

    public final void e(boolean z4) {
        if (!this.f4281u) {
            this.f4281u = true;
            Iterator it = this.f4283w.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                i iVar = (i) weakReference.get();
                if (iVar == null) {
                    this.f4283w.remove(weakReference);
                } else {
                    iVar.b(this, z4);
                }
            }
            this.f4281u = false;
        }
    }

    public boolean f(g gVar) {
        boolean z4 = false;
        if (!this.f4283w.isEmpty() && this.f4284x == gVar) {
            d0();
            Iterator it = this.f4283w.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                i iVar = (i) weakReference.get();
                if (iVar == null) {
                    this.f4283w.remove(weakReference);
                } else {
                    z4 = iVar.i(this, gVar);
                    if (z4) {
                        break;
                    }
                }
            }
            c0();
            if (z4) {
                this.f4284x = null;
            }
        }
        return z4;
    }

    public MenuItem findItem(int i4) {
        MenuItem findItem;
        int size = size();
        for (int i5 = 0; i5 < size; i5++) {
            g gVar = (g) this.f4266f.get(i5);
            if (gVar.getItemId() == i4) {
                return gVar;
            }
            if (gVar.hasSubMenu() && (findItem = gVar.getSubMenu().findItem(i4)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public final g g(int i4, int i5, int i6, int i7, CharSequence charSequence, int i8) {
        return new g(this, i4, i5, i6, i7, charSequence, i8);
    }

    public MenuItem getItem(int i4) {
        return (MenuItem) this.f4266f.get(i4);
    }

    public boolean h(e eVar, MenuItem menuItem) {
        a aVar = this.f4265e;
        return aVar != null && aVar.a(eVar, menuItem);
    }

    public boolean hasVisibleItems() {
        if (this.f4286z) {
            return true;
        }
        int size = size();
        for (int i4 = 0; i4 < size; i4++) {
            if (((g) this.f4266f.get(i4)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i(boolean z4) {
        if (!this.f4283w.isEmpty()) {
            d0();
            Iterator it = this.f4283w.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                i iVar = (i) weakReference.get();
                if (iVar == null) {
                    this.f4283w.remove(weakReference);
                } else {
                    iVar.f(z4);
                }
            }
            c0();
        }
    }

    public boolean isShortcutKey(int i4, KeyEvent keyEvent) {
        return p(i4, keyEvent) != null;
    }

    public final boolean j(l lVar, i iVar) {
        boolean z4 = false;
        if (this.f4283w.isEmpty()) {
            return false;
        }
        if (iVar != null) {
            z4 = iVar.e(lVar);
        }
        Iterator it = this.f4283w.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            i iVar2 = (i) weakReference.get();
            if (iVar2 == null) {
                this.f4283w.remove(weakReference);
            } else if (!z4) {
                z4 = iVar2.e(lVar);
            }
        }
        return z4;
    }

    public boolean k(g gVar) {
        boolean z4 = false;
        if (this.f4283w.isEmpty()) {
            return false;
        }
        d0();
        Iterator it = this.f4283w.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            i iVar = (i) weakReference.get();
            if (iVar == null) {
                this.f4283w.remove(weakReference);
            } else {
                z4 = iVar.j(this, gVar);
                if (z4) {
                    break;
                }
            }
        }
        c0();
        if (z4) {
            this.f4284x = gVar;
        }
        return z4;
    }

    public int l(int i4) {
        return m(i4, 0);
    }

    public int m(int i4, int i5) {
        int size = size();
        if (i5 < 0) {
            i5 = 0;
        }
        while (i5 < size) {
            if (((g) this.f4266f.get(i5)).getGroupId() == i4) {
                return i5;
            }
            i5++;
        }
        return -1;
    }

    public int o(int i4) {
        int size = size();
        for (int i5 = 0; i5 < size; i5++) {
            if (((g) this.f4266f.get(i5)).getItemId() == i4) {
                return i5;
            }
        }
        return -1;
    }

    public g p(int i4, KeyEvent keyEvent) {
        ArrayList arrayList = this.f4282v;
        arrayList.clear();
        q(arrayList, i4, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (g) arrayList.get(0);
        }
        boolean G4 = G();
        for (int i5 = 0; i5 < size; i5++) {
            g gVar = (g) arrayList.get(i5);
            char alphabeticShortcut = G4 ? gVar.getAlphabeticShortcut() : gVar.getNumericShortcut();
            char[] cArr = keyData.meta;
            if ((alphabeticShortcut == cArr[0] && (metaState & 2) == 0) || ((alphabeticShortcut == cArr[2] && (metaState & 2) != 0) || (G4 && alphabeticShortcut == 8 && i4 == 67))) {
                return gVar;
            }
        }
        return null;
    }

    public boolean performIdentifierAction(int i4, int i5) {
        return L(findItem(i4), i5);
    }

    public boolean performShortcut(int i4, KeyEvent keyEvent, int i5) {
        g p4 = p(i4, keyEvent);
        boolean L4 = p4 != null ? L(p4, i5) : false;
        if ((i5 & 2) != 0) {
            e(true);
        }
        return L4;
    }

    public void q(List list, int i4, KeyEvent keyEvent) {
        boolean G4 = G();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i4 == 67) {
            int size = this.f4266f.size();
            for (int i5 = 0; i5 < size; i5++) {
                g gVar = (g) this.f4266f.get(i5);
                if (gVar.hasSubMenu()) {
                    ((e) gVar.getSubMenu()).q(list, i4, keyEvent);
                }
                char alphabeticShortcut = G4 ? gVar.getAlphabeticShortcut() : gVar.getNumericShortcut();
                if ((modifiers & 69647) == ((G4 ? gVar.getAlphabeticModifiers() : gVar.getNumericModifiers()) & 69647) && alphabeticShortcut != 0) {
                    char[] cArr = keyData.meta;
                    if ((alphabeticShortcut == cArr[0] || alphabeticShortcut == cArr[2] || (G4 && alphabeticShortcut == 8 && i4 == 67)) && gVar.isEnabled()) {
                        list.add(gVar);
                    }
                }
            }
        }
    }

    public void r() {
        ArrayList E4 = E();
        if (this.f4271k) {
            Iterator it = this.f4283w.iterator();
            boolean z4 = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                i iVar = (i) weakReference.get();
                if (iVar == null) {
                    this.f4283w.remove(weakReference);
                } else {
                    z4 |= iVar.h();
                }
            }
            if (z4) {
                this.f4269i.clear();
                this.f4270j.clear();
                int size = E4.size();
                for (int i4 = 0; i4 < size; i4++) {
                    g gVar = (g) E4.get(i4);
                    if (gVar.l()) {
                        this.f4269i.add(gVar);
                    } else {
                        this.f4270j.add(gVar);
                    }
                }
            } else {
                this.f4269i.clear();
                this.f4270j.clear();
                this.f4270j.addAll(E());
            }
            this.f4271k = false;
        }
    }

    public void removeGroup(int i4) {
        int l4 = l(i4);
        if (l4 >= 0) {
            int size = this.f4266f.size() - l4;
            int i5 = 0;
            while (true) {
                int i6 = i5 + 1;
                if (i5 >= size || ((g) this.f4266f.get(l4)).getGroupId() != i4) {
                    K(true);
                } else {
                    N(l4, false);
                    i5 = i6;
                }
            }
            K(true);
        }
    }

    public void removeItem(int i4) {
        N(o(i4), true);
    }

    public ArrayList s() {
        r();
        return this.f4269i;
    }

    public void setGroupCheckable(int i4, boolean z4, boolean z5) {
        int size = this.f4266f.size();
        for (int i5 = 0; i5 < size; i5++) {
            g gVar = (g) this.f4266f.get(i5);
            if (gVar.getGroupId() == i4) {
                gVar.t(z5);
                gVar.setCheckable(z4);
            }
        }
    }

    public void setGroupDividerEnabled(boolean z4) {
        this.f4285y = z4;
    }

    public void setGroupEnabled(int i4, boolean z4) {
        int size = this.f4266f.size();
        for (int i5 = 0; i5 < size; i5++) {
            g gVar = (g) this.f4266f.get(i5);
            if (gVar.getGroupId() == i4) {
                gVar.setEnabled(z4);
            }
        }
    }

    public void setGroupVisible(int i4, boolean z4) {
        int size = this.f4266f.size();
        boolean z5 = false;
        for (int i5 = 0; i5 < size; i5++) {
            g gVar = (g) this.f4266f.get(i5);
            if (gVar.getGroupId() == i4 && gVar.y(z4)) {
                z5 = true;
            }
        }
        if (z5) {
            K(true);
        }
    }

    public void setQwertyMode(boolean z4) {
        this.f4263c = z4;
        K(false);
    }

    public int size() {
        return this.f4266f.size();
    }

    public String t() {
        return "android:menu:actionviewstates";
    }

    public Context u() {
        return this.f4261a;
    }

    public g v() {
        return this.f4284x;
    }

    public Drawable w() {
        return this.f4275o;
    }

    public CharSequence x() {
        return this.f4274n;
    }

    public View y() {
        return this.f4276p;
    }

    public ArrayList z() {
        r();
        return this.f4270j;
    }

    public MenuItem add(int i4) {
        return a(0, 0, 0, this.f4262b.getString(i4));
    }

    public SubMenu addSubMenu(int i4) {
        return addSubMenu(0, 0, 0, (CharSequence) this.f4262b.getString(i4));
    }

    public MenuItem add(int i4, int i5, int i6, CharSequence charSequence) {
        return a(i4, i5, i6, charSequence);
    }

    public SubMenu addSubMenu(int i4, int i5, int i6, CharSequence charSequence) {
        g gVar = (g) a(i4, i5, i6, charSequence);
        l lVar = new l(this.f4261a, this, gVar);
        gVar.x(lVar);
        return lVar;
    }

    public MenuItem add(int i4, int i5, int i6, int i7) {
        return a(i4, i5, i6, this.f4262b.getString(i7));
    }

    public SubMenu addSubMenu(int i4, int i5, int i6, int i7) {
        return addSubMenu(i4, i5, i6, (CharSequence) this.f4262b.getString(i7));
    }
}
