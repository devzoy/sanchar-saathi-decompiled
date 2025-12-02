package N2;

import N2.E;
import X2.i;
import android.view.KeyEvent;

public class y implements E.d {

    /* renamed from: a  reason: collision with root package name */
    public final i f1990a;

    /* renamed from: b  reason: collision with root package name */
    public final E.b f1991b = new E.b();

    public y(i iVar) {
        this.f1990a = iVar;
    }

    public void a(KeyEvent keyEvent, E.d.a aVar) {
        int action = keyEvent.getAction();
        boolean z4 = false;
        if (action == 0 || action == 1) {
            i.b bVar = new i.b(keyEvent, this.f1991b.a(keyEvent.getUnicodeChar()));
            if (action != 0) {
                z4 = true;
            }
            this.f1990a.e(bVar, z4, new x(aVar));
            return;
        }
        aVar.a(false);
    }
}
