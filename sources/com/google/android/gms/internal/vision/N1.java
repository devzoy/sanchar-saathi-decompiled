package com.google.android.gms.internal.vision;

import android.support.v4.media.session.b;
import java.util.Iterator;
import java.util.Map;

public final class N1 extends O1 {
    public N1(int i4) {
        super(i4, (N1) null);
    }

    public final void e() {
        if (!i()) {
            if (j() <= 0) {
                Iterator it = m().iterator();
                if (it.hasNext()) {
                    b.a(((Map.Entry) it.next()).getKey());
                    throw null;
                }
            } else {
                b.a(h(0).getKey());
                throw null;
            }
        }
        super.e();
    }
}
