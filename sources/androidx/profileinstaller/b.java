package androidx.profileinstaller;

import android.content.res.AssetManager;
import android.os.Build;
import androidx.profileinstaller.c;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;
import r0.C0903a;
import r0.C0904b;
import r0.C0905c;
import r0.C0913k;
import r0.C0914l;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public final AssetManager f5540a;

    /* renamed from: b  reason: collision with root package name */
    public final Executor f5541b;

    /* renamed from: c  reason: collision with root package name */
    public final c.C0096c f5542c;

    /* renamed from: d  reason: collision with root package name */
    public final byte[] f5543d;

    /* renamed from: e  reason: collision with root package name */
    public final File f5544e;

    /* renamed from: f  reason: collision with root package name */
    public final String f5545f;

    /* renamed from: g  reason: collision with root package name */
    public final String f5546g;

    /* renamed from: h  reason: collision with root package name */
    public final String f5547h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f5548i = false;

    /* renamed from: j  reason: collision with root package name */
    public C0904b[] f5549j;

    /* renamed from: k  reason: collision with root package name */
    public byte[] f5550k;

    public b(AssetManager assetManager, Executor executor, c.C0096c cVar, String str, String str2, String str3, File file) {
        this.f5540a = assetManager;
        this.f5541b = executor;
        this.f5542c = cVar;
        this.f5545f = str;
        this.f5546g = str2;
        this.f5547h = str3;
        this.f5544e = file;
        this.f5543d = d();
    }

    public static byte[] d() {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 > 34) {
            return null;
        }
        switch (i4) {
            case 28:
            case 29:
            case 30:
                return C0914l.f11969b;
            case 31:
            case 32:
            case 33:
            case 34:
                return C0914l.f11968a;
            default:
                return null;
        }
    }

    public static boolean k() {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 > 34) {
            return false;
        }
        switch (i4) {
            case 31:
            case 32:
            case 33:
            case 34:
                return true;
            default:
                return false;
        }
    }

    public final b b(C0904b[] bVarArr, byte[] bArr) {
        InputStream h4;
        try {
            h4 = h(this.f5540a, this.f5547h);
            if (h4 != null) {
                this.f5549j = C0913k.q(h4, C0913k.o(h4, C0913k.f11967b), bArr, bVarArr);
                h4.close();
                return this;
            }
            if (h4 != null) {
                h4.close();
            }
            return null;
        } catch (FileNotFoundException e4) {
            this.f5542c.b(9, e4);
        } catch (IOException e5) {
            this.f5542c.b(7, e5);
        } catch (IllegalStateException e6) {
            this.f5549j = null;
            this.f5542c.b(8, e6);
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public final void c() {
        if (!this.f5548i) {
            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
        }
    }

    public boolean e() {
        if (this.f5543d == null) {
            l(3, Integer.valueOf(Build.VERSION.SDK_INT));
            return false;
        }
        if (!this.f5544e.exists()) {
            try {
                this.f5544e.createNewFile();
            } catch (IOException unused) {
                l(4, (Object) null);
                return false;
            }
        } else if (!this.f5544e.canWrite()) {
            l(4, (Object) null);
            return false;
        }
        this.f5548i = true;
        return true;
    }

    public final InputStream f(AssetManager assetManager) {
        try {
            return h(assetManager, this.f5546g);
        } catch (FileNotFoundException e4) {
            this.f5542c.b(6, e4);
            return null;
        } catch (IOException e5) {
            this.f5542c.b(7, e5);
            return null;
        }
    }

    public final /* synthetic */ void g(int i4, Object obj) {
        this.f5542c.b(i4, obj);
    }

    public final InputStream h(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e4) {
            String message = e4.getMessage();
            if (message != null && message.contains("compressed")) {
                this.f5542c.a(5, (Object) null);
            }
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0020, code lost:
        r0 = b(r0, r2.f5543d);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.profileinstaller.b i() {
        /*
            r2 = this;
            r2.c()
            byte[] r0 = r2.f5543d
            if (r0 != 0) goto L_0x0008
            return r2
        L_0x0008:
            android.content.res.AssetManager r0 = r2.f5540a
            java.io.InputStream r0 = r2.f(r0)
            if (r0 == 0) goto L_0x0016
            r0.b[] r0 = r2.j(r0)
            r2.f5549j = r0
        L_0x0016:
            r0.b[] r0 = r2.f5549j
            if (r0 == 0) goto L_0x0029
            boolean r1 = k()
            if (r1 == 0) goto L_0x0029
            byte[] r1 = r2.f5543d
            androidx.profileinstaller.b r0 = r2.b(r0, r1)
            if (r0 == 0) goto L_0x0029
            return r0
        L_0x0029:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.profileinstaller.b.i():androidx.profileinstaller.b");
    }

    public final C0904b[] j(InputStream inputStream) {
        try {
            C0904b[] w4 = C0913k.w(inputStream, C0913k.o(inputStream, C0913k.f11966a), this.f5545f);
            try {
                inputStream.close();
                return w4;
            } catch (IOException e4) {
                this.f5542c.b(7, e4);
                return w4;
            }
        } catch (IOException e5) {
            this.f5542c.b(7, e5);
            inputStream.close();
            return null;
        } catch (IllegalStateException e6) {
            this.f5542c.b(8, e6);
            try {
                inputStream.close();
            } catch (IOException e7) {
                this.f5542c.b(7, e7);
            }
            return null;
        } catch (Throwable th) {
            try {
                inputStream.close();
            } catch (IOException e8) {
                this.f5542c.b(7, e8);
            }
            throw th;
        }
    }

    public final void l(int i4, Object obj) {
        this.f5541b.execute(new C0903a(this, i4, obj));
    }

    public b m() {
        ByteArrayOutputStream byteArrayOutputStream;
        C0904b[] bVarArr = this.f5549j;
        byte[] bArr = this.f5543d;
        if (!(bVarArr == null || bArr == null)) {
            c();
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                C0913k.E(byteArrayOutputStream, bArr);
                if (!C0913k.B(byteArrayOutputStream, bArr, bVarArr)) {
                    this.f5542c.b(5, (Object) null);
                    this.f5549j = null;
                    byteArrayOutputStream.close();
                    return this;
                }
                this.f5550k = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                this.f5549j = null;
            } catch (IOException e4) {
                this.f5542c.b(7, e4);
            } catch (IllegalStateException e5) {
                this.f5542c.b(8, e5);
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        }
        return this;
        throw th;
    }

    public boolean n() {
        ByteArrayInputStream byteArrayInputStream;
        FileOutputStream fileOutputStream;
        byte[] bArr = this.f5550k;
        if (bArr == null) {
            return false;
        }
        c();
        try {
            byteArrayInputStream = new ByteArrayInputStream(bArr);
            fileOutputStream = new FileOutputStream(this.f5544e);
            C0905c.l(byteArrayInputStream, fileOutputStream);
            l(1, (Object) null);
            fileOutputStream.close();
            byteArrayInputStream.close();
            this.f5550k = null;
            this.f5549j = null;
            return true;
        } catch (FileNotFoundException e4) {
            l(6, e4);
            this.f5550k = null;
            this.f5549j = null;
            return false;
        } catch (IOException e5) {
            l(7, e5);
            this.f5550k = null;
            this.f5549j = null;
            return false;
        } catch (Throwable th) {
            this.f5550k = null;
            this.f5549j = null;
            throw th;
        }
        throw th;
        throw th;
    }
}
