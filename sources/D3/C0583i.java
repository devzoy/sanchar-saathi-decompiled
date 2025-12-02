package d3;

import T2.a;
import Y2.b;
import android.content.Context;
import android.util.Log;
import d3.C0582h;
import g3.C0638b;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import net.sqlcipher.IBulkCursor;

/* renamed from: d3.i  reason: case insensitive filesystem */
public class C0583i implements T2.a, C0582h.a {

    /* renamed from: c  reason: collision with root package name */
    public Context f8698c;

    /* renamed from: d3.i$a */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f8699a;

        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|(3:21|22|24)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(24:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|24) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                d3.h$c[] r0 = d3.C0582h.c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f8699a = r0
                d3.h$c r1 = d3.C0582h.c.ROOT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f8699a     // Catch:{ NoSuchFieldError -> 0x001d }
                d3.h$c r1 = d3.C0582h.c.MUSIC     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f8699a     // Catch:{ NoSuchFieldError -> 0x0028 }
                d3.h$c r1 = d3.C0582h.c.PODCASTS     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f8699a     // Catch:{ NoSuchFieldError -> 0x0033 }
                d3.h$c r1 = d3.C0582h.c.RINGTONES     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f8699a     // Catch:{ NoSuchFieldError -> 0x003e }
                d3.h$c r1 = d3.C0582h.c.ALARMS     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f8699a     // Catch:{ NoSuchFieldError -> 0x0049 }
                d3.h$c r1 = d3.C0582h.c.NOTIFICATIONS     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f8699a     // Catch:{ NoSuchFieldError -> 0x0054 }
                d3.h$c r1 = d3.C0582h.c.PICTURES     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f8699a     // Catch:{ NoSuchFieldError -> 0x0060 }
                d3.h$c r1 = d3.C0582h.c.MOVIES     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f8699a     // Catch:{ NoSuchFieldError -> 0x006c }
                d3.h$c r1 = d3.C0582h.c.DOWNLOADS     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f8699a     // Catch:{ NoSuchFieldError -> 0x0078 }
                d3.h$c r1 = d3.C0582h.c.DCIM     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f8699a     // Catch:{ NoSuchFieldError -> 0x0084 }
                d3.h$c r1 = d3.C0582h.c.DOCUMENTS     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: d3.C0583i.a.<clinit>():void");
        }
    }

    private void z(b bVar, Context context) {
        try {
            C0582h.a.p(bVar, this);
        } catch (Exception e4) {
            Log.e("PathProviderPlugin", "Received exception while setting up PathProviderPlugin", e4);
        }
        this.f8698c = context;
    }

    public String f() {
        return this.f8698c.getCacheDir().getPath();
    }

    public String g() {
        return this.f8698c.getCacheDir().getPath();
    }

    public String h() {
        return C0638b.c(this.f8698c);
    }

    public List i(C0582h.c cVar) {
        ArrayList arrayList = new ArrayList();
        for (File file : this.f8698c.getExternalFilesDirs(y(cVar))) {
            if (file != null) {
                arrayList.add(file.getAbsolutePath());
            }
        }
        return arrayList;
    }

    public List j() {
        ArrayList arrayList = new ArrayList();
        for (File file : this.f8698c.getExternalCacheDirs()) {
            if (file != null) {
                arrayList.add(file.getAbsolutePath());
            }
        }
        return arrayList;
    }

    public String o() {
        return C0638b.d(this.f8698c);
    }

    public void onAttachedToEngine(a.b bVar) {
        z(bVar.b(), bVar.a());
    }

    public void onDetachedFromEngine(a.b bVar) {
        C0582h.a.p(bVar.b(), (C0582h.a) null);
    }

    public String v() {
        File externalFilesDir = this.f8698c.getExternalFilesDir((String) null);
        if (externalFilesDir == null) {
            return null;
        }
        return externalFilesDir.getAbsolutePath();
    }

    public String y(C0582h.c cVar) {
        switch (a.f8699a[cVar.ordinal()]) {
            case 1:
                return null;
            case 2:
                return "music";
            case 3:
                return "podcasts";
            case 4:
                return "ringtones";
            case 5:
                return "alarms";
            case 6:
                return "notifications";
            case 7:
                return "pictures";
            case 8:
                return "movies";
            case IBulkCursor.WANTS_ON_MOVE_TRANSACTION /*9*/:
                return "downloads";
            case IBulkCursor.GET_EXTRAS_TRANSACTION /*10*/:
                return "dcim";
            case IBulkCursor.RESPOND_TRANSACTION /*11*/:
                return "documents";
            default:
                throw new RuntimeException("Unrecognized directory: " + cVar);
        }
    }
}
