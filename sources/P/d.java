package P;

import P.g;
import android.content.ContentProviderClient;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    public static final Comparator f2164a = new c();

    public interface a {
        static a a(Context context, Uri uri) {
            return new b(context, uri);
        }

        Cursor b(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal);

        void close();
    }

    public static class b implements a {

        /* renamed from: a  reason: collision with root package name */
        public final ContentProviderClient f2165a;

        public b(Context context, Uri uri) {
            this.f2165a = context.getContentResolver().acquireUnstableContentProviderClient(uri);
        }

        public Cursor b(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal) {
            ContentProviderClient contentProviderClient = this.f2165a;
            if (contentProviderClient == null) {
                return null;
            }
            try {
                return contentProviderClient.query(uri, strArr, str, strArr2, str2, cancellationSignal);
            } catch (RemoteException e4) {
                Log.w("FontsProvider", "Unable to query the content provider", e4);
                return null;
            }
        }

        public void close() {
            ContentProviderClient contentProviderClient = this.f2165a;
            if (contentProviderClient != null) {
                contentProviderClient.close();
            }
        }
    }

    public static List b(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature byteArray : signatureArr) {
            arrayList.add(byteArray.toByteArray());
        }
        return arrayList;
    }

    public static boolean c(List list, List list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i4 = 0; i4 < list.size(); i4++) {
            if (!Arrays.equals((byte[]) list.get(i4), (byte[]) list2.get(i4))) {
                return false;
            }
        }
        return true;
    }

    public static List d(e eVar, Resources resources) {
        return eVar.b() != null ? eVar.b() : I.a.c(resources, eVar.c());
    }

    public static g.a e(Context context, e eVar, CancellationSignal cancellationSignal) {
        ProviderInfo f4 = f(context.getPackageManager(), eVar, context.getResources());
        return f4 == null ? g.a.a(1, (g.b[]) null) : g.a.a(0, h(context, eVar, f4.authority, cancellationSignal));
    }

    public static ProviderInfo f(PackageManager packageManager, e eVar, Resources resources) {
        String e4 = eVar.e();
        ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(e4, 0);
        if (resolveContentProvider == null) {
            throw new PackageManager.NameNotFoundException("No package found for authority: " + e4);
        } else if (resolveContentProvider.packageName.equals(eVar.f())) {
            List b4 = b(packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures);
            Collections.sort(b4, f2164a);
            List d4 = d(eVar, resources);
            for (int i4 = 0; i4 < d4.size(); i4++) {
                ArrayList arrayList = new ArrayList((Collection) d4.get(i4));
                Collections.sort(arrayList, f2164a);
                if (c(b4, arrayList)) {
                    return resolveContentProvider;
                }
            }
            return null;
        } else {
            throw new PackageManager.NameNotFoundException("Found content provider " + e4 + ", but package was not " + eVar.f());
        }
    }

    public static /* synthetic */ int g(byte[] bArr, byte[] bArr2) {
        if (bArr.length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        for (int i4 = 0; i4 < bArr.length; i4++) {
            byte b4 = bArr[i4];
            byte b5 = bArr2[i4];
            if (b4 != b5) {
                return b4 - b5;
            }
        }
        return 0;
    }

    public static g.b[] h(Context context, e eVar, String str, CancellationSignal cancellationSignal) {
        ArrayList arrayList;
        Uri uri;
        boolean z4;
        String str2 = str;
        ArrayList arrayList2 = new ArrayList();
        Uri build = new Uri.Builder().scheme("content").authority(str2).build();
        Uri build2 = new Uri.Builder().scheme("content").authority(str2).appendPath("file").build();
        a a4 = a.a(context, build);
        Cursor cursor = null;
        try {
            Cursor b4 = a4.b(build, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{eVar.g()}, (String) null, cancellationSignal);
            if (b4 != null && b4.getCount() > 0) {
                int columnIndex = b4.getColumnIndex("result_code");
                ArrayList arrayList3 = new ArrayList();
                int columnIndex2 = b4.getColumnIndex("_id");
                int columnIndex3 = b4.getColumnIndex("file_id");
                int columnIndex4 = b4.getColumnIndex("font_ttc_index");
                int columnIndex5 = b4.getColumnIndex("font_weight");
                int columnIndex6 = b4.getColumnIndex("font_italic");
                while (b4.moveToNext()) {
                    int i4 = columnIndex != -1 ? b4.getInt(columnIndex) : 0;
                    int i5 = columnIndex4 != -1 ? b4.getInt(columnIndex4) : 0;
                    if (columnIndex3 == -1) {
                        arrayList = arrayList3;
                        uri = ContentUris.withAppendedId(build, b4.getLong(columnIndex2));
                    } else {
                        arrayList = arrayList3;
                        uri = ContentUris.withAppendedId(build2, b4.getLong(columnIndex3));
                    }
                    int i6 = columnIndex5 != -1 ? b4.getInt(columnIndex5) : 400;
                    if (columnIndex6 != -1) {
                        z4 = true;
                        if (b4.getInt(columnIndex6) == 1) {
                            g.b a5 = g.b.a(uri, i5, i6, z4, i4);
                            arrayList3 = arrayList;
                            arrayList3.add(a5);
                        }
                    }
                    z4 = false;
                    g.b a52 = g.b.a(uri, i5, i6, z4, i4);
                    arrayList3 = arrayList;
                    arrayList3.add(a52);
                }
                arrayList2 = arrayList3;
            }
            if (b4 != null) {
                b4.close();
            }
            a4.close();
            return (g.b[]) arrayList2.toArray(new g.b[0]);
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            a4.close();
            throw th;
        }
    }
}
