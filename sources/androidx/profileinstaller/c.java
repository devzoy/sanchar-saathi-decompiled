package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.util.Log;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.Executor;
import net.sqlcipher.IBulkCursor;
import r0.C0907e;
import r0.C0908f;

public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    public static final C0096c f5551a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static final C0096c f5552b = new b();

    public class a implements C0096c {
        public void a(int i4, Object obj) {
        }

        public void b(int i4, Object obj) {
        }
    }

    public class b implements C0096c {
        public void a(int i4, Object obj) {
            Log.d("ProfileInstaller", i4 != 1 ? i4 != 2 ? i4 != 3 ? i4 != 4 ? i4 != 5 ? "" : "DIAGNOSTIC_PROFILE_IS_COMPRESSED" : "DIAGNOSTIC_REF_PROFILE_DOES_NOT_EXIST" : "DIAGNOSTIC_REF_PROFILE_EXISTS" : "DIAGNOSTIC_CURRENT_PROFILE_DOES_NOT_EXIST" : "DIAGNOSTIC_CURRENT_PROFILE_EXISTS");
        }

        public void b(int i4, Object obj) {
            String str;
            switch (i4) {
                case 1:
                    str = "RESULT_INSTALL_SUCCESS";
                    break;
                case 2:
                    str = "RESULT_ALREADY_INSTALLED";
                    break;
                case 3:
                    str = "RESULT_UNSUPPORTED_ART_VERSION";
                    break;
                case 4:
                    str = "RESULT_NOT_WRITABLE";
                    break;
                case 5:
                    str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                    break;
                case 6:
                    str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                    break;
                case 7:
                    str = "RESULT_IO_EXCEPTION";
                    break;
                case 8:
                    str = "RESULT_PARSE_EXCEPTION";
                    break;
                case IBulkCursor.GET_EXTRAS_TRANSACTION /*10*/:
                    str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                    break;
                case IBulkCursor.RESPOND_TRANSACTION /*11*/:
                    str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                    break;
                default:
                    str = "";
                    break;
            }
            if (i4 == 6 || i4 == 7 || i4 == 8) {
                Log.e("ProfileInstaller", str, (Throwable) obj);
            } else {
                Log.d("ProfileInstaller", str);
            }
        }
    }

    /* renamed from: androidx.profileinstaller.c$c  reason: collision with other inner class name */
    public interface C0096c {
        void a(int i4, Object obj);

        void b(int i4, Object obj);
    }

    public static boolean b(File file) {
        return new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
    }

    public static void c(Context context, Executor executor, C0096c cVar) {
        b(context.getFilesDir());
        g(executor, cVar, 11, (Object) null);
    }

    public static boolean d(PackageInfo packageInfo, File file, C0096c cVar) {
        DataInputStream dataInputStream;
        File file2 = new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
        boolean z4 = false;
        if (!file2.exists()) {
            return false;
        }
        try {
            dataInputStream = new DataInputStream(new FileInputStream(file2));
            long readLong = dataInputStream.readLong();
            dataInputStream.close();
            if (readLong == packageInfo.lastUpdateTime) {
                z4 = true;
            }
            if (z4) {
                cVar.b(2, (Object) null);
            }
            return z4;
        } catch (IOException unused) {
            return false;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public static void f(PackageInfo packageInfo, File file) {
        DataOutputStream dataOutputStream;
        try {
            dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            dataOutputStream.writeLong(packageInfo.lastUpdateTime);
            dataOutputStream.close();
            return;
        } catch (IOException unused) {
            return;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public static void g(Executor executor, C0096c cVar, int i4, Object obj) {
        executor.execute(new C0908f(cVar, i4, obj));
    }

    public static boolean h(AssetManager assetManager, String str, PackageInfo packageInfo, File file, String str2, Executor executor, C0096c cVar) {
        b bVar = new b(assetManager, executor, cVar, str2, "dexopt/baseline.prof", "dexopt/baseline.profm", new File(new File("/data/misc/profiles/cur/0", str), "primary.prof"));
        if (!bVar.e()) {
            return false;
        }
        boolean n4 = bVar.i().m().n();
        if (n4) {
            f(packageInfo, file);
        }
        return n4;
    }

    public static void i(Context context) {
        j(context, new C0907e(), f5551a);
    }

    public static void j(Context context, Executor executor, C0096c cVar) {
        k(context, executor, cVar, false);
    }

    public static void k(Context context, Executor executor, C0096c cVar, boolean z4) {
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        boolean z5 = false;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (z4 || !d(packageInfo, filesDir, cVar)) {
                Log.d("ProfileInstaller", "Installing profile for " + context.getPackageName());
                if (h(assets, packageName, packageInfo, filesDir, name, executor, cVar) && z4) {
                    z5 = true;
                }
                d.c(context, z5);
                return;
            }
            Log.d("ProfileInstaller", "Skipping profile installation for " + context.getPackageName());
            d.c(context, false);
        } catch (PackageManager.NameNotFoundException e4) {
            cVar.b(7, e4);
            d.c(context, false);
        }
    }

    public static void l(Context context, Executor executor, C0096c cVar) {
        try {
            f(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
            g(executor, cVar, 10, (Object) null);
        } catch (PackageManager.NameNotFoundException e4) {
            g(executor, cVar, 7, e4);
        }
    }
}
