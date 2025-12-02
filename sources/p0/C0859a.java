package p0;

import G.h;
import G.i;
import android.app.Notification;
import android.media.session.MediaSession;
import android.support.v4.media.session.MediaSessionCompat;
import android.widget.RemoteViews;

/* renamed from: p0.a  reason: case insensitive filesystem */
public class C0859a extends i.j {

    /* renamed from: e  reason: collision with root package name */
    public int[] f11655e = null;

    /* renamed from: f  reason: collision with root package name */
    public MediaSessionCompat.Token f11656f;

    public void b(h hVar) {
        hVar.a().setStyle(n(new Notification.MediaStyle()));
    }

    public RemoteViews i(h hVar) {
        return null;
    }

    public RemoteViews j(h hVar) {
        return null;
    }

    public Notification.MediaStyle n(Notification.MediaStyle mediaStyle) {
        int[] iArr = this.f11655e;
        if (iArr != null) {
            mediaStyle.setShowActionsInCompactView(iArr);
        }
        MediaSessionCompat.Token token = this.f11656f;
        if (token != null) {
            mediaStyle.setMediaSession((MediaSession.Token) token.a());
        }
        return mediaStyle;
    }
}
