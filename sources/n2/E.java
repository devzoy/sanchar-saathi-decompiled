package N2;

import X2.i;
import X2.j;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import io.flutter.plugin.editing.h;
import java.util.HashSet;
import java.util.Map;

public class E implements h.a, j.b {

    /* renamed from: a  reason: collision with root package name */
    public final d[] f1863a;

    /* renamed from: b  reason: collision with root package name */
    public final HashSet f1864b = new HashSet();

    /* renamed from: c  reason: collision with root package name */
    public final e f1865c;

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public int f1866a = 0;

        public Character a(int i4) {
            char c4 = (char) i4;
            if ((Integer.MIN_VALUE & i4) != 0) {
                int i5 = i4 & Integer.MAX_VALUE;
                int i6 = this.f1866a;
                if (i6 != 0) {
                    this.f1866a = KeyCharacterMap.getDeadChar(i6, i5);
                } else {
                    this.f1866a = i5;
                }
            } else {
                int i7 = this.f1866a;
                if (i7 != 0) {
                    int deadChar = KeyCharacterMap.getDeadChar(i7, i4);
                    if (deadChar > 0) {
                        c4 = (char) deadChar;
                    }
                    this.f1866a = 0;
                }
            }
            return Character.valueOf(c4);
        }
    }

    public class c {

        /* renamed from: a  reason: collision with root package name */
        public final KeyEvent f1867a;

        /* renamed from: b  reason: collision with root package name */
        public int f1868b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f1869c = false;

        public class a implements d.a {

            /* renamed from: a  reason: collision with root package name */
            public boolean f1871a;

            public a() {
                this.f1871a = false;
            }

            public void a(boolean z4) {
                if (!this.f1871a) {
                    this.f1871a = true;
                    c cVar = c.this;
                    int i4 = cVar.f1868b - 1;
                    cVar.f1868b = i4;
                    boolean z5 = z4 | cVar.f1869c;
                    cVar.f1869c = z5;
                    if (i4 == 0 && !z5) {
                        E.this.e(cVar.f1867a);
                        return;
                    }
                    return;
                }
                throw new IllegalStateException("The onKeyEventHandledCallback should be called exactly once.");
            }
        }

        public c(KeyEvent keyEvent) {
            this.f1868b = E.this.f1863a.length;
            this.f1867a = keyEvent;
        }

        public d.a a() {
            return new a();
        }
    }

    public interface d {

        public interface a {
            void a(boolean z4);
        }

        void a(KeyEvent keyEvent, a aVar);
    }

    public interface e {
        void a(KeyEvent keyEvent);

        boolean c(KeyEvent keyEvent);

        Y2.b getBinaryMessenger();
    }

    public E(e eVar) {
        this.f1865c = eVar;
        this.f1863a = new d[]{new D(eVar.getBinaryMessenger()), new y(new i(eVar.getBinaryMessenger()))};
        new j(eVar.getBinaryMessenger()).b(this);
    }

    public Map a() {
        return ((D) this.f1863a[0]).h();
    }

    public boolean b(KeyEvent keyEvent) {
        if (this.f1864b.remove(keyEvent)) {
            return false;
        }
        if (this.f1863a.length > 0) {
            c cVar = new c(keyEvent);
            for (d a4 : this.f1863a) {
                a4.a(keyEvent, cVar.a());
            }
            return true;
        }
        e(keyEvent);
        return true;
    }

    public void d() {
        int size = this.f1864b.size();
        if (size > 0) {
            M2.b.g("KeyboardManager", "A KeyboardManager was destroyed with " + String.valueOf(size) + " unhandled redispatch event(s).");
        }
    }

    public final void e(KeyEvent keyEvent) {
        e eVar = this.f1865c;
        if (eVar != null && !eVar.c(keyEvent)) {
            this.f1864b.add(keyEvent);
            this.f1865c.a(keyEvent);
            if (this.f1864b.remove(keyEvent)) {
                M2.b.g("KeyboardManager", "A redispatched key event was consumed before reaching KeyboardManager");
            }
        }
    }
}
