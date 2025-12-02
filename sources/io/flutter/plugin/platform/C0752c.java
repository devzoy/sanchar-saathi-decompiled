package io.flutter.plugin.platform;

import N2.l;
import android.content.Context;
import android.view.MotionEvent;

/* renamed from: io.flutter.plugin.platform.c  reason: case insensitive filesystem */
public class C0752c extends l {

    /* renamed from: i  reason: collision with root package name */
    public C0750a f10537i;

    public C0752c(Context context, int i4, int i5, C0750a aVar) {
        super(context, i4, i5, l.b.overlay);
        this.f10537i = aVar;
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        C0750a aVar = this.f10537i;
        if (aVar == null || !aVar.a(motionEvent, true)) {
            return super.onHoverEvent(motionEvent);
        }
        return true;
    }
}
