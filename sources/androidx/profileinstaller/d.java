package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    public static final w.c f5553a = w.c.q();

    /* renamed from: b  reason: collision with root package name */
    public static final Object f5554b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public static c f5555c = null;

    public static class a {
        public static PackageInfo a(PackageManager packageManager, Context context) {
            return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0));
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f5556a;

        /* renamed from: b  reason: collision with root package name */
        public final int f5557b;

        /* renamed from: c  reason: collision with root package name */
        public final long f5558c;

        /* renamed from: d  reason: collision with root package name */
        public final long f5559d;

        public b(int i4, int i5, long j4, long j5) {
            this.f5556a = i4;
            this.f5557b = i5;
            this.f5558c = j4;
            this.f5559d = j5;
        }

        public static b a(File file) {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
            try {
                b bVar = new b(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
                dataInputStream.close();
                return bVar;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
            throw th;
        }

        public void b(File file) {
            file.delete();
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
            try {
                dataOutputStream.writeInt(this.f5556a);
                dataOutputStream.writeInt(this.f5557b);
                dataOutputStream.writeLong(this.f5558c);
                dataOutputStream.writeLong(this.f5559d);
                dataOutputStream.close();
                return;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
            throw th;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f5557b == bVar.f5557b && this.f5558c == bVar.f5558c && this.f5556a == bVar.f5556a && this.f5559d == bVar.f5559d;
        }

        public int hashCode() {
            return Objects.hash(new Object[]{Integer.valueOf(this.f5557b), Long.valueOf(this.f5558c), Integer.valueOf(this.f5556a), Long.valueOf(this.f5559d)});
        }
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final int f5560a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f5561b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f5562c;

        public c(int i4, boolean z4, boolean z5) {
            this.f5560a = i4;
            this.f5562c = z5;
            this.f5561b = z4;
        }
    }

    public static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? a.a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    public static c b(int i4, boolean z4, boolean z5) {
        c cVar = new c(i4, z4, z5);
        f5555c = cVar;
        f5553a.o(cVar);
        return f5555c;
    }

    public static c c(Context context, boolean z4) {
        boolean z5;
        boolean z6;
        b bVar;
        c cVar;
        if (!z4 && (cVar = f5555c) != null) {
            return cVar;
        }
        synchronized (f5554b) {
            if (!z4) {
                try {
                    c cVar2 = f5555c;
                    if (cVar2 != null) {
                        return cVar2;
                    }
                } catch (IOException unused) {
                    return b(131072, z5, z6);
                } catch (Throwable th) {
                    throw th;
                }
            }
            int i4 = 0;
            if (Build.VERSION.SDK_INT == 30) {
                c b4 = b(262144, false, false);
                return b4;
            }
            File file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
            long length = file.length();
            z5 = file.exists() && length > 0;
            File file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
            long length2 = file2.length();
            z6 = file2.exists() && length2 > 0;
            try {
                long a4 = a(context);
                File file3 = new File(context.getFilesDir(), "profileInstalled");
                b a5 = file3.exists() ? b.a(file3) : null;
                if (a5 != null && a5.f5558c == a4) {
                    int i5 = a5.f5557b;
                    if (i5 != 2) {
                        i4 = i5;
                        if (z4 && z6 && i4 != 1) {
                            i4 = 2;
                        }
                        if (a5 != null && a5.f5557b == 2 && i4 == 1 && length < a5.f5559d) {
                            i4 = 3;
                        }
                        bVar = new b(1, i4, a4, length2);
                        if (a5 == null || !a5.equals(bVar)) {
                            bVar.b(file3);
                        }
                        c b5 = b(i4, z5, z6);
                        return b5;
                    }
                }
                if (z5) {
                    i4 = 1;
                } else if (z6) {
                    i4 = 2;
                }
                i4 = 2;
                i4 = 3;
                bVar = new b(1, i4, a4, length2);
                try {
                    bVar.b(file3);
                } catch (IOException unused2) {
                    i4 = 196608;
                }
                c b52 = b(i4, z5, z6);
                return b52;
            } catch (PackageManager.NameNotFoundException unused3) {
                return b(65536, z5, z6);
            }
        }
    }
}
