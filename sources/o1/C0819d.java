package o1;

import android.content.Context;
import java.io.File;
import java.io.FilenameFilter;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import o1.C0818c;

/* renamed from: o1.d  reason: case insensitive filesystem */
public class C0819d {

    /* renamed from: a  reason: collision with root package name */
    public final Set f11322a;

    /* renamed from: b  reason: collision with root package name */
    public final C0818c.b f11323b;

    /* renamed from: c  reason: collision with root package name */
    public final C0818c.a f11324c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f11325d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f11326e;

    /* renamed from: o1.d$a */
    public class a implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ Context f11327e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ String f11328f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ String f11329g;

        public a(Context context, String str, String str2, C0818c.C0189c cVar) {
            this.f11327e = context;
            this.f11328f = str;
            this.f11329g = str2;
        }

        public void run() {
            try {
                C0819d.this.g(this.f11327e, this.f11328f, this.f11329g);
                throw null;
            } catch (UnsatisfiedLinkError unused) {
                throw null;
            } catch (C0817b unused2) {
                throw null;
            }
        }
    }

    /* renamed from: o1.d$b */
    public class b implements FilenameFilter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f11331a;

        public b(String str) {
            this.f11331a = str;
        }

        public boolean accept(File file, String str) {
            return str.startsWith(this.f11331a);
        }
    }

    public C0819d() {
        this(new C0820e(), new C0816a());
    }

    public void b(Context context, String str, String str2) {
        File c4 = c(context);
        File d4 = d(context, str, str2);
        File[] listFiles = c4.listFiles(new b(this.f11323b.a(str)));
        if (listFiles != null) {
            for (File file : listFiles) {
                if (this.f11325d || !file.getAbsolutePath().equals(d4.getAbsolutePath())) {
                    file.delete();
                }
            }
        }
    }

    public File c(Context context) {
        return context.getDir("lib", 0);
    }

    public File d(Context context, String str, String str2) {
        String a4 = this.f11323b.a(str);
        if (C0821f.a(str2)) {
            return new File(c(context), a4);
        }
        File c4 = c(context);
        return new File(c4, a4 + "." + str2);
    }

    public void e(Context context, String str) {
        f(context, str, (String) null, (C0818c.C0189c) null);
    }

    public void f(Context context, String str, String str2, C0818c.C0189c cVar) {
        if (context == null) {
            throw new IllegalArgumentException("Given context is null");
        } else if (!C0821f.a(str)) {
            i("Beginning load of %s...", str);
            if (cVar == null) {
                g(context, str, str2);
            } else {
                new Thread(new a(context, str, str2, cVar)).start();
            }
        } else {
            throw new IllegalArgumentException("Given library is either null or empty");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a4 A[Catch:{ IOException -> 0x00a8 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g(android.content.Context r9, java.lang.String r10, java.lang.String r11) {
        /*
            r8 = this;
            java.util.Set r0 = r8.f11322a
            boolean r0 = r0.contains(r10)
            if (r0 == 0) goto L_0x0016
            boolean r0 = r8.f11325d
            if (r0 != 0) goto L_0x0016
            java.lang.String r9 = "%s already loaded previously!"
            java.lang.Object[] r10 = new java.lang.Object[]{r10}
            r8.i(r9, r10)
            return
        L_0x0016:
            o1.c$b r0 = r8.f11323b     // Catch:{ UnsatisfiedLinkError -> 0x002a }
            r0.c(r10)     // Catch:{ UnsatisfiedLinkError -> 0x002a }
            java.util.Set r0 = r8.f11322a     // Catch:{ UnsatisfiedLinkError -> 0x002a }
            r0.add(r10)     // Catch:{ UnsatisfiedLinkError -> 0x002a }
            java.lang.String r0 = "%s (%s) was loaded normally!"
            java.lang.Object[] r1 = new java.lang.Object[]{r10, r11}     // Catch:{ UnsatisfiedLinkError -> 0x002a }
            r8.i(r0, r1)     // Catch:{ UnsatisfiedLinkError -> 0x002a }
            return
        L_0x002a:
            r0 = move-exception
            java.lang.String r0 = android.util.Log.getStackTraceString(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r1 = "Loading the library normally failed: %s"
            r8.i(r1, r0)
            java.lang.String r0 = "%s (%s) was not loaded normally, re-linking..."
            java.lang.Object[] r1 = new java.lang.Object[]{r10, r11}
            r8.i(r0, r1)
            java.io.File r0 = r8.d(r9, r10, r11)
            boolean r1 = r0.exists()
            if (r1 == 0) goto L_0x004f
            boolean r1 = r8.f11325d
            if (r1 == 0) goto L_0x0073
        L_0x004f:
            boolean r1 = r8.f11325d
            if (r1 == 0) goto L_0x005c
            java.lang.String r1 = "Forcing a re-link of %s (%s)..."
            java.lang.Object[] r2 = new java.lang.Object[]{r10, r11}
            r8.i(r1, r2)
        L_0x005c:
            r8.b(r9, r10, r11)
            o1.c$a r2 = r8.f11324c
            o1.c$b r1 = r8.f11323b
            java.lang.String[] r4 = r1.d()
            o1.c$b r1 = r8.f11323b
            java.lang.String r5 = r1.a(r10)
            r3 = r9
            r6 = r0
            r7 = r8
            r2.a(r3, r4, r5, r6, r7)
        L_0x0073:
            boolean r1 = r8.f11326e     // Catch:{ IOException -> 0x00a8 }
            if (r1 == 0) goto L_0x00a8
            r1 = 0
            p1.i r2 = new p1.i     // Catch:{ all -> 0x00a1 }
            r2.<init>(r0)     // Catch:{ all -> 0x00a1 }
            java.util.List r1 = r2.d()     // Catch:{ all -> 0x009e }
            r2.close()     // Catch:{ IOException -> 0x00a8 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ IOException -> 0x00a8 }
        L_0x0088:
            boolean r2 = r1.hasNext()     // Catch:{ IOException -> 0x00a8 }
            if (r2 == 0) goto L_0x00a8
            java.lang.Object r2 = r1.next()     // Catch:{ IOException -> 0x00a8 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ IOException -> 0x00a8 }
            o1.c$b r3 = r8.f11323b     // Catch:{ IOException -> 0x00a8 }
            java.lang.String r2 = r3.b(r2)     // Catch:{ IOException -> 0x00a8 }
            r8.e(r9, r2)     // Catch:{ IOException -> 0x00a8 }
            goto L_0x0088
        L_0x009e:
            r9 = move-exception
            r1 = r2
            goto L_0x00a2
        L_0x00a1:
            r9 = move-exception
        L_0x00a2:
            if (r1 == 0) goto L_0x00a7
            r1.close()     // Catch:{ IOException -> 0x00a8 }
        L_0x00a7:
            throw r9     // Catch:{ IOException -> 0x00a8 }
        L_0x00a8:
            o1.c$b r9 = r8.f11323b
            java.lang.String r0 = r0.getAbsolutePath()
            r9.e(r0)
            java.util.Set r9 = r8.f11322a
            r9.add(r10)
            java.lang.String r9 = "%s (%s) was re-linked!"
            java.lang.Object[] r10 = new java.lang.Object[]{r10, r11}
            r8.i(r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o1.C0819d.g(android.content.Context, java.lang.String, java.lang.String):void");
    }

    public void h(String str) {
    }

    public void i(String str, Object... objArr) {
        h(String.format(Locale.US, str, objArr));
    }

    public C0819d(C0818c.b bVar, C0818c.a aVar) {
        this.f11322a = new HashSet();
        if (bVar == null) {
            throw new IllegalArgumentException("Cannot pass null library loader");
        } else if (aVar != null) {
            this.f11323b = bVar;
            this.f11324c = aVar;
        } else {
            throw new IllegalArgumentException("Cannot pass null library installer");
        }
    }
}
