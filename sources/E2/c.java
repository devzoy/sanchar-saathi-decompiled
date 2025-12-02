package E2;

import Y2.c;
import Y2.j;
import Y2.l;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcelable;
import android.provider.MediaStore;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;

public class c implements l {

    /* renamed from: m  reason: collision with root package name */
    public static final int f895m;

    /* renamed from: n  reason: collision with root package name */
    public static final int f896n;

    /* renamed from: c  reason: collision with root package name */
    public final Activity f897c;

    /* renamed from: d  reason: collision with root package name */
    public j.d f898d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f899e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f900f;

    /* renamed from: g  reason: collision with root package name */
    public String f901g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f902h;

    /* renamed from: i  reason: collision with root package name */
    public int f903i;

    /* renamed from: j  reason: collision with root package name */
    public String[] f904j;

    /* renamed from: k  reason: collision with root package name */
    public c.b f905k;

    /* renamed from: l  reason: collision with root package name */
    public byte[] f906l;

    public class a implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ Intent f907e;

        public a(Intent intent) {
            this.f907e = intent;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:51:0x01a4, code lost:
            r2 = (android.net.Uri) r2;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r10 = this;
                android.content.Intent r0 = r10.f907e
                java.lang.String r1 = "Unknown activity error, please fill an issue."
                java.lang.String r2 = "unknown_activity"
                if (r0 == 0) goto L_0x01ee
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                android.content.Intent r3 = r10.f907e
                android.content.ClipData r3 = r3.getClipData()
                java.lang.String r4 = " - URI: "
                java.lang.String r5 = "[MultiFilePick] File #"
                java.lang.String r6 = "image/*"
                r7 = 0
                java.lang.String r8 = "FilePickerDelegate"
                if (r3 == 0) goto L_0x00a3
                android.content.Intent r1 = r10.f907e
                android.content.ClipData r1 = r1.getClipData()
                int r1 = r1.getItemCount()
            L_0x0028:
                if (r7 >= r1) goto L_0x009c
                android.content.Intent r2 = r10.f907e
                android.content.ClipData r2 = r2.getClipData()
                android.content.ClipData$Item r2 = r2.getItemAt(r7)
                android.net.Uri r2 = r2.getUri()
                E2.c r3 = E2.c.this
                java.lang.String r3 = r3.f901g
                boolean r3 = java.util.Objects.equals(r3, r6)
                if (r3 == 0) goto L_0x0068
                E2.c r3 = E2.c.this
                boolean r3 = r3.f902h
                if (r3 == 0) goto L_0x0068
                E2.c r3 = E2.c.this
                int r3 = r3.f903i
                if (r3 <= 0) goto L_0x0068
                E2.c r3 = E2.c.this
                int r3 = r3.f903i
                E2.c r9 = E2.c.this
                android.app.Activity r9 = r9.f897c
                android.content.Context r9 = r9.getApplicationContext()
                android.net.Uri r2 = E2.e.b(r2, r3, r9)
            L_0x0068:
                E2.c r3 = E2.c.this
                android.app.Activity r3 = r3.f897c
                E2.c r9 = E2.c.this
                boolean r9 = r9.f900f
                E2.a r3 = E2.e.m(r3, r2, r9)
                if (r3 == 0) goto L_0x0099
                r0.add(r3)
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r3.append(r5)
                r3.append(r7)
                r3.append(r4)
                java.lang.String r2 = r2.getPath()
                r3.append(r2)
                java.lang.String r2 = r3.toString()
                android.util.Log.d(r8, r2)
            L_0x0099:
                int r7 = r7 + 1
                goto L_0x0028
            L_0x009c:
                E2.c r1 = E2.c.this
                r1.n(r0)
                goto L_0x01f3
            L_0x00a3:
                android.content.Intent r3 = r10.f907e
                android.net.Uri r3 = r3.getData()
                java.lang.String r9 = "unknown_path"
                if (r3 == 0) goto L_0x016e
                android.content.Intent r1 = r10.f907e
                android.net.Uri r1 = r1.getData()
                E2.c r2 = E2.c.this
                java.lang.String r2 = r2.f901g
                boolean r2 = java.util.Objects.equals(r2, r6)
                if (r2 == 0) goto L_0x00e3
                E2.c r2 = E2.c.this
                boolean r2 = r2.f902h
                if (r2 == 0) goto L_0x00e3
                E2.c r2 = E2.c.this
                int r2 = r2.f903i
                if (r2 <= 0) goto L_0x00e3
                E2.c r2 = E2.c.this
                int r2 = r2.f903i
                E2.c r3 = E2.c.this
                android.app.Activity r3 = r3.f897c
                android.content.Context r3 = r3.getApplicationContext()
                android.net.Uri r1 = E2.e.b(r1, r2, r3)
            L_0x00e3:
                E2.c r2 = E2.c.this
                java.lang.String r2 = r2.f901g
                java.lang.String r3 = "dir"
                boolean r2 = r2.equals(r3)
                if (r2 == 0) goto L_0x012b
                java.lang.String r0 = android.provider.DocumentsContract.getTreeDocumentId(r1)
                android.net.Uri r0 = android.provider.DocumentsContract.buildDocumentUriUsingTree(r1, r0)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "[SingleFilePick] File URI:"
                r1.append(r2)
                java.lang.String r2 = r0.toString()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                android.util.Log.d(r8, r1)
                E2.c r1 = E2.c.this
                android.app.Activity r1 = r1.f897c
                java.lang.String r0 = E2.e.g(r0, r1)
                if (r0 == 0) goto L_0x0123
                E2.c r1 = E2.c.this
                r1.n(r0)
                goto L_0x012a
            L_0x0123:
                E2.c r0 = E2.c.this
                java.lang.String r1 = "Failed to retrieve directory path."
                r0.m(r9, r1)
            L_0x012a:
                return
            L_0x012b:
                E2.c r2 = E2.c.this
                android.app.Activity r2 = r2.f897c
                E2.c r3 = E2.c.this
                boolean r3 = r3.f900f
                E2.a r1 = E2.e.m(r2, r1, r3)
                if (r1 == 0) goto L_0x0140
                r0.add(r1)
            L_0x0140:
                boolean r1 = r0.isEmpty()
                if (r1 != 0) goto L_0x0165
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "File path:"
                r1.append(r2)
                java.lang.String r2 = r0.toString()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                android.util.Log.d(r8, r1)
                E2.c r1 = E2.c.this
                r1.n(r0)
                goto L_0x01f3
            L_0x0165:
                E2.c r0 = E2.c.this
                java.lang.String r1 = "Failed to retrieve path."
                r0.m(r9, r1)
                goto L_0x01f3
            L_0x016e:
                android.content.Intent r3 = r10.f907e
                android.os.Bundle r3 = r3.getExtras()
                if (r3 == 0) goto L_0x01e8
                android.content.Intent r1 = r10.f907e
                android.os.Bundle r1 = r1.getExtras()
                java.util.Set r2 = r1.keySet()
                java.lang.String r3 = "selectedItems"
                boolean r2 = r2.contains(r3)
                if (r2 == 0) goto L_0x01e0
                E2.c r2 = E2.c.this
                java.util.ArrayList r1 = r2.o(r1)
                if (r1 == 0) goto L_0x01da
                java.util.Iterator r1 = r1.iterator()
            L_0x0194:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L_0x01da
                java.lang.Object r2 = r1.next()
                android.os.Parcelable r2 = (android.os.Parcelable) r2
                boolean r3 = r2 instanceof android.net.Uri
                if (r3 == 0) goto L_0x01d7
                android.net.Uri r2 = (android.net.Uri) r2
                E2.c r3 = E2.c.this
                android.app.Activity r3 = r3.f897c
                E2.c r6 = E2.c.this
                boolean r6 = r6.f900f
                E2.a r3 = E2.e.m(r3, r2, r6)
                if (r3 == 0) goto L_0x01d7
                r0.add(r3)
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r3.append(r5)
                r3.append(r7)
                r3.append(r4)
                java.lang.String r2 = r2.getPath()
                r3.append(r2)
                java.lang.String r2 = r3.toString()
                android.util.Log.d(r8, r2)
            L_0x01d7:
                int r7 = r7 + 1
                goto L_0x0194
            L_0x01da:
                E2.c r1 = E2.c.this
                r1.n(r0)
                goto L_0x01f3
            L_0x01e0:
                E2.c r0 = E2.c.this
                java.lang.String r1 = "Failed to retrieve path from bundle."
                r0.m(r9, r1)
                goto L_0x01f3
            L_0x01e8:
                E2.c r0 = E2.c.this
                r0.m(r2, r1)
                goto L_0x01f3
            L_0x01ee:
                E2.c r0 = E2.c.this
                r0.m(r2, r1)
            L_0x01f3:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: E2.c.a.run():void");
        }
    }

    public class b extends Handler {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f909a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(Looper looper, boolean z4) {
            super(looper);
            this.f909a = z4;
        }

        public void handleMessage(Message message) {
            c.this.f905k.a(Boolean.valueOf(this.f909a));
        }
    }

    static {
        Class<d> cls = d.class;
        f895m = (cls.hashCode() + 43) & 65535;
        f896n = (cls.hashCode() + 83) & 65535;
    }

    public c(Activity activity) {
        this(activity, (j.d) null);
    }

    public static void l(j.d dVar) {
        dVar.b("already_active", "File picker is already active", (Object) null);
    }

    public final void j() {
        this.f898d = null;
    }

    public final void k(boolean z4) {
        if (this.f905k != null && !this.f901g.equals("dir")) {
            new b(Looper.getMainLooper(), z4).obtainMessage().sendToTarget();
        }
    }

    public final void m(String str, String str2) {
        if (this.f898d != null) {
            k(false);
            this.f898d.b(str, str2, (Object) null);
            j();
        }
    }

    public final void n(Object obj) {
        k(false);
        if (this.f898d != null) {
            if (obj != null && !(obj instanceof String)) {
                ArrayList arrayList = new ArrayList();
                Iterator it = ((ArrayList) obj).iterator();
                while (it.hasNext()) {
                    arrayList.add(((a) it.next()).a());
                }
                obj = arrayList;
            }
            this.f898d.a(obj);
            j();
        }
    }

    public final ArrayList o(Bundle bundle) {
        return Build.VERSION.SDK_INT >= 33 ? bundle.getParcelableArrayList("selectedItems", Parcelable.class) : bundle.getParcelableArrayList("selectedItems");
    }

    public boolean onActivityResult(int i4, int i5, Intent intent) {
        if (i4 == f896n) {
            if (i5 == -1) {
                if (intent == null) {
                    return false;
                }
                k(true);
                Uri data = intent.getData();
                if (data != null) {
                    String str = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getAbsolutePath() + File.separator + e.f(data, this.f897c);
                    try {
                        OutputStream openOutputStream = this.f897c.getContentResolver().openOutputStream(data);
                        if (openOutputStream != null) {
                            openOutputStream.write(this.f906l);
                            openOutputStream.flush();
                            openOutputStream.close();
                        }
                        n(str);
                        return true;
                    } catch (IOException e4) {
                        Log.i("FilePickerDelegate", "Error while saving file", e4);
                        m("Error while saving file", e4.getMessage());
                    }
                }
            }
            if (i5 == 0) {
                Log.i("FilePickerDelegate", "User cancelled the save request");
                n((Object) null);
            }
            return false;
        } else if (this.f901g == null) {
            return false;
        } else {
            int i6 = f895m;
            if (i4 == i6 && i5 == -1) {
                k(true);
                new Thread(new a(intent)).start();
                return true;
            } else if (i4 == i6 && i5 == 0) {
                Log.i("FilePickerDelegate", "User cancelled the picker request");
                n((Object) null);
                return true;
            } else {
                if (i4 == i6) {
                    m("unknown_activity", "Unknown activity error, please fill an issue.");
                }
                return false;
            }
        }
    }

    public void p(String str, String str2, String str3, String[] strArr, byte[] bArr, j.d dVar) {
        if (!r(dVar)) {
            l(dVar);
            return;
        }
        Intent intent = new Intent("android.intent.action.CREATE_DOCUMENT");
        intent.addCategory("android.intent.category.OPENABLE");
        if (str != null && !str.isEmpty()) {
            intent.putExtra("android.intent.extra.TITLE", str);
        }
        this.f906l = bArr;
        if (str2 == null || "dir".equals(str2) || str2.split(",").length != 1) {
            intent.setType("*/*");
        } else {
            intent.setType(str2);
        }
        if (str3 != null && !str3.isEmpty()) {
            intent.putExtra("android.provider.extra.INITIAL_URI", Uri.parse(str3));
        }
        if (strArr != null && strArr.length > 0) {
            intent.putExtra("android.intent.extra.MIME_TYPES", strArr);
        }
        if (intent.resolveActivity(this.f897c.getPackageManager()) != null) {
            this.f897c.startActivityForResult(intent, f896n);
            return;
        }
        Log.e("FilePickerDelegate", "Can't find a valid activity to handle the request. Make sure you've a file explorer installed.");
        m("invalid_format_type", "Can't handle the provided file type.");
    }

    public void q(c.b bVar) {
        this.f905k = bVar;
    }

    public final boolean r(j.d dVar) {
        if (this.f898d != null) {
            return false;
        }
        this.f898d = dVar;
        return true;
    }

    public final void s() {
        Intent intent;
        String str = this.f901g;
        if (str != null) {
            if (str.equals("dir")) {
                intent = new Intent("android.intent.action.OPEN_DOCUMENT_TREE");
            } else {
                if (this.f901g.equals("image/*")) {
                    intent = new Intent("android.intent.action.PICK", MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                } else {
                    intent = new Intent("android.intent.action.OPEN_DOCUMENT");
                    intent.addCategory("android.intent.category.OPENABLE");
                }
                Uri parse = Uri.parse(Environment.getExternalStorageDirectory().getPath() + File.separator);
                Log.d("FilePickerDelegate", "Selected type " + this.f901g);
                intent.setDataAndType(parse, this.f901g);
                intent.setType(this.f901g);
                intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", this.f899e);
                intent.putExtra("multi-pick", this.f899e);
                if (this.f901g.contains(",")) {
                    this.f904j = this.f901g.split(",");
                }
                String[] strArr = this.f904j;
                if (strArr != null) {
                    intent.putExtra("android.intent.extra.MIME_TYPES", strArr);
                }
            }
            if (intent.resolveActivity(this.f897c.getPackageManager()) != null) {
                this.f897c.startActivityForResult(intent, f895m);
                return;
            }
            Log.e("FilePickerDelegate", "Can't find a valid activity to handle the request. Make sure you've a file explorer installed.");
            m("invalid_format_type", "Can't handle the provided file type.");
        }
    }

    public void t(String str, boolean z4, boolean z5, String[] strArr, boolean z6, int i4, j.d dVar) {
        if (!r(dVar)) {
            l(dVar);
            return;
        }
        this.f901g = str;
        this.f899e = z4;
        this.f900f = z5;
        this.f904j = strArr;
        this.f903i = i4;
        this.f902h = z6;
        s();
    }

    public c(Activity activity, j.d dVar) {
        this.f899e = false;
        this.f900f = false;
        this.f902h = true;
        this.f903i = 20;
        this.f897c = activity;
        this.f898d = dVar;
    }
}
