package a3;

import X2.m;
import android.view.PointerIcon;
import java.util.HashMap;

/* renamed from: a3.a  reason: case insensitive filesystem */
public class C0348a {

    /* renamed from: c  reason: collision with root package name */
    public static HashMap f4001c;

    /* renamed from: a  reason: collision with root package name */
    public final c f4002a;

    /* renamed from: b  reason: collision with root package name */
    public final m f4003b;

    /* renamed from: a3.a$a  reason: collision with other inner class name */
    public class C0080a implements m.b {
        public C0080a() {
        }

        public void a(String str) {
            C0348a.this.f4002a.setPointerIcon(C0348a.this.d(str));
        }
    }

    /* renamed from: a3.a$b */
    public class b extends HashMap {
        public b() {
            put("alias", 1010);
            put("allScroll", 1013);
            put("basic", 1000);
            put("cell", 1006);
            put("click", 1002);
            put("contextMenu", 1001);
            put("copy", 1011);
            put("forbidden", 1012);
            put("grab", 1020);
            put("grabbing", 1021);
            put("help", 1003);
            put("move", 1013);
            put("none", 0);
            put("noDrop", 1012);
            put("precise", 1007);
            put("text", 1008);
            put("resizeColumn", 1014);
            put("resizeDown", 1015);
            put("resizeUpLeft", 1016);
            put("resizeDownRight", 1017);
            put("resizeLeft", 1014);
            put("resizeLeftRight", 1014);
            put("resizeRight", 1014);
            put("resizeRow", 1015);
            put("resizeUp", 1015);
            put("resizeUpDown", 1015);
            put("resizeUpLeft", 1017);
            put("resizeUpRight", 1016);
            put("resizeUpLeftDownRight", 1017);
            put("resizeUpRightDownLeft", 1016);
            put("verticalText", 1009);
            put("wait", 1004);
            put("zoomIn", 1018);
            put("zoomOut", 1019);
        }
    }

    /* renamed from: a3.a$c */
    public interface c {
        PointerIcon b(int i4);

        void setPointerIcon(PointerIcon pointerIcon);
    }

    public C0348a(c cVar, m mVar) {
        this.f4002a = cVar;
        this.f4003b = mVar;
        mVar.b(new C0080a());
    }

    public void c() {
        this.f4003b.b((m.b) null);
    }

    public final PointerIcon d(String str) {
        if (f4001c == null) {
            f4001c = new b();
        }
        return this.f4002a.b(((Integer) f4001c.getOrDefault(str, 1000)).intValue());
    }
}
