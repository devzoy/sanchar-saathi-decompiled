package H;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import net.sqlcipher.database.SQLiteDatabase;
import org.xmlpull.v1.XmlPullParserException;

public abstract class b extends ContentProvider {

    /* renamed from: g  reason: collision with root package name */
    public static final String[] f1349g = {"_display_name", "_size"};

    /* renamed from: h  reason: collision with root package name */
    public static final File f1350h = new File("/");

    /* renamed from: i  reason: collision with root package name */
    public static final HashMap f1351i = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public final Object f1352c;

    /* renamed from: d  reason: collision with root package name */
    public String f1353d;

    /* renamed from: e  reason: collision with root package name */
    public C0020b f1354e;

    /* renamed from: f  reason: collision with root package name */
    public final int f1355f;

    public static class a {
        public static File[] a(Context context) {
            return context.getExternalMediaDirs();
        }
    }

    /* renamed from: H.b$b  reason: collision with other inner class name */
    public interface C0020b {
        File a(Uri uri);

        Uri b(File file);
    }

    public static class c implements C0020b {

        /* renamed from: a  reason: collision with root package name */
        public final String f1356a;

        /* renamed from: b  reason: collision with root package name */
        public final HashMap f1357b = new HashMap();

        public c(String str) {
            this.f1356a = str;
        }

        public File a(Uri uri) {
            String encodedPath = uri.getEncodedPath();
            int indexOf = encodedPath.indexOf(47, 1);
            String decode = Uri.decode(encodedPath.substring(1, indexOf));
            String decode2 = Uri.decode(encodedPath.substring(indexOf + 1));
            File file = (File) this.f1357b.get(decode);
            if (file != null) {
                File file2 = new File(file, decode2);
                try {
                    File canonicalFile = file2.getCanonicalFile();
                    if (d(canonicalFile.getPath(), file.getPath())) {
                        return canonicalFile;
                    }
                    throw new SecurityException("Resolved path jumped beyond configured root");
                } catch (IOException unused) {
                    throw new IllegalArgumentException("Failed to resolve canonical path for " + file2);
                }
            } else {
                throw new IllegalArgumentException("Unable to find configured root for " + uri);
            }
        }

        public Uri b(File file) {
            try {
                String canonicalPath = file.getCanonicalPath();
                Map.Entry entry = null;
                for (Map.Entry entry2 : this.f1357b.entrySet()) {
                    String path = ((File) entry2.getValue()).getPath();
                    if (d(canonicalPath, path) && (entry == null || path.length() > ((File) entry.getValue()).getPath().length())) {
                        entry = entry2;
                    }
                }
                if (entry != null) {
                    String path2 = ((File) entry.getValue()).getPath();
                    String substring = path2.endsWith("/") ? canonicalPath.substring(path2.length()) : canonicalPath.substring(path2.length() + 1);
                    return new Uri.Builder().scheme("content").authority(this.f1356a).encodedPath(Uri.encode((String) entry.getKey()) + '/' + Uri.encode(substring, "/")).build();
                }
                throw new IllegalArgumentException("Failed to find configured root that contains " + canonicalPath);
            } catch (IOException unused) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file);
            }
        }

        public void c(String str, File file) {
            if (!TextUtils.isEmpty(str)) {
                try {
                    this.f1357b.put(str, file.getCanonicalFile());
                } catch (IOException e4) {
                    throw new IllegalArgumentException("Failed to resolve canonical path for " + file, e4);
                }
            } else {
                throw new IllegalArgumentException("Name must not be empty");
            }
        }

        public final boolean d(String str, String str2) {
            String a4 = b.k(str);
            String a5 = b.k(str2);
            if (!a4.equals(a5)) {
                StringBuilder sb = new StringBuilder();
                sb.append(a5);
                sb.append('/');
                return a4.startsWith(sb.toString());
            }
        }
    }

    public b() {
        this(0);
    }

    public static File b(File file, String... strArr) {
        for (String str : strArr) {
            if (str != null) {
                file = new File(file, str);
            }
        }
        return file;
    }

    public static Object[] c(Object[] objArr, int i4) {
        Object[] objArr2 = new Object[i4];
        System.arraycopy(objArr, 0, objArr2, 0, i4);
        return objArr2;
    }

    public static String[] d(String[] strArr, int i4) {
        String[] strArr2 = new String[i4];
        System.arraycopy(strArr, 0, strArr2, 0, i4);
        return strArr2;
    }

    public static XmlResourceParser e(Context context, String str, ProviderInfo providerInfo, int i4) {
        if (providerInfo != null) {
            if (providerInfo.metaData == null && i4 != 0) {
                Bundle bundle = new Bundle(1);
                providerInfo.metaData = bundle;
                bundle.putInt("android.support.FILE_PROVIDER_PATHS", i4);
            }
            XmlResourceParser loadXmlMetaData = providerInfo.loadXmlMetaData(context.getPackageManager(), "android.support.FILE_PROVIDER_PATHS");
            if (loadXmlMetaData != null) {
                return loadXmlMetaData;
            }
            throw new IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
        }
        throw new IllegalArgumentException("Couldn't find meta-data for provider with authority " + str);
    }

    public static C0020b g(Context context, String str, int i4) {
        C0020b bVar;
        HashMap hashMap = f1351i;
        synchronized (hashMap) {
            try {
                bVar = (C0020b) hashMap.get(str);
                if (bVar == null) {
                    bVar = j(context, str, i4);
                    hashMap.put(str, bVar);
                }
            } catch (IOException e4) {
                throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e4);
            } catch (XmlPullParserException e5) {
                throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e5);
            } catch (Throwable th) {
                throw th;
            }
        }
        return bVar;
    }

    public static Uri h(Context context, String str, File file) {
        return g(context, str, 0).b(file);
    }

    public static int i(String str) {
        if ("r".equals(str)) {
            return SQLiteDatabase.CREATE_IF_NECESSARY;
        }
        if ("w".equals(str) || "wt".equals(str)) {
            return 738197504;
        }
        if ("wa".equals(str)) {
            return 704643072;
        }
        if ("rw".equals(str)) {
            return 939524096;
        }
        if ("rwt".equals(str)) {
            return 1006632960;
        }
        throw new IllegalArgumentException("Invalid mode: " + str);
    }

    public static C0020b j(Context context, String str, int i4) {
        c cVar = new c(str);
        XmlResourceParser e4 = e(context, str, context.getPackageManager().resolveContentProvider(str, 128), i4);
        while (true) {
            int next = e4.next();
            if (next == 1) {
                return cVar;
            }
            if (next == 2) {
                String name = e4.getName();
                File file = null;
                String attributeValue = e4.getAttributeValue((String) null, "name");
                String attributeValue2 = e4.getAttributeValue((String) null, "path");
                if ("root-path".equals(name)) {
                    file = f1350h;
                } else if ("files-path".equals(name)) {
                    file = context.getFilesDir();
                } else if ("cache-path".equals(name)) {
                    file = context.getCacheDir();
                } else if ("external-path".equals(name)) {
                    file = Environment.getExternalStorageDirectory();
                } else if ("external-files-path".equals(name)) {
                    File[] f4 = a.f(context, (String) null);
                    if (f4.length > 0) {
                        file = f4[0];
                    }
                } else if ("external-cache-path".equals(name)) {
                    File[] e5 = a.e(context);
                    if (e5.length > 0) {
                        file = e5[0];
                    }
                } else if ("external-media-path".equals(name)) {
                    File[] a4 = a.a(context);
                    if (a4.length > 0) {
                        file = a4[0];
                    }
                }
                if (file != null) {
                    cVar.c(attributeValue, b(file, attributeValue2));
                }
            }
        }
    }

    public static String k(String str) {
        return (str.length() <= 0 || str.charAt(str.length() + -1) != '/') ? str : str.substring(0, str.length() - 1);
    }

    public void attachInfo(Context context, ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (providerInfo.exported) {
            throw new SecurityException("Provider must not be exported");
        } else if (providerInfo.grantUriPermissions) {
            String str = providerInfo.authority.split(";")[0];
            synchronized (this.f1352c) {
                this.f1353d = str;
            }
            HashMap hashMap = f1351i;
            synchronized (hashMap) {
                hashMap.remove(str);
            }
        } else {
            throw new SecurityException("Provider must grant uri permissions");
        }
    }

    public int delete(Uri uri, String str, String[] strArr) {
        return f().a(uri).delete() ? 1 : 0;
    }

    public final C0020b f() {
        C0020b bVar;
        synchronized (this.f1352c) {
            try {
                R.c.d(this.f1353d, "mAuthority is null. Did you override attachInfo and did not call super.attachInfo()?");
                if (this.f1354e == null) {
                    this.f1354e = g(getContext(), this.f1353d, this.f1355f);
                }
                bVar = this.f1354e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return bVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0014, code lost:
        r3 = android.webkit.MimeTypeMap.getSingleton().getMimeTypeFromExtension(r3.getName().substring(r0 + 1));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String getType(android.net.Uri r3) {
        /*
            r2 = this;
            H.b$b r0 = r2.f()
            java.io.File r3 = r0.a(r3)
            java.lang.String r0 = r3.getName()
            r1 = 46
            int r0 = r0.lastIndexOf(r1)
            if (r0 < 0) goto L_0x0029
            java.lang.String r3 = r3.getName()
            int r0 = r0 + 1
            java.lang.String r3 = r3.substring(r0)
            android.webkit.MimeTypeMap r0 = android.webkit.MimeTypeMap.getSingleton()
            java.lang.String r3 = r0.getMimeTypeFromExtension(r3)
            if (r3 == 0) goto L_0x0029
            return r3
        L_0x0029:
            java.lang.String r3 = "application/octet-stream"
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: H.b.getType(android.net.Uri):java.lang.String");
    }

    public String getTypeAnonymous(Uri uri) {
        return "application/octet-stream";
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("No external inserts");
    }

    public boolean onCreate() {
        return true;
    }

    public ParcelFileDescriptor openFile(Uri uri, String str) {
        return ParcelFileDescriptor.open(f().a(uri), i(str));
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int i4;
        File a4 = f().a(uri);
        String queryParameter = uri.getQueryParameter("displayName");
        if (strArr == null) {
            strArr = f1349g;
        }
        String[] strArr3 = new String[strArr.length];
        Object[] objArr = new Object[strArr.length];
        int i5 = 0;
        for (String str3 : strArr) {
            if ("_display_name".equals(str3)) {
                strArr3[i5] = "_display_name";
                i4 = i5 + 1;
                objArr[i5] = queryParameter == null ? a4.getName() : queryParameter;
            } else if ("_size".equals(str3)) {
                strArr3[i5] = "_size";
                i4 = i5 + 1;
                objArr[i5] = Long.valueOf(a4.length());
            }
            i5 = i4;
        }
        String[] d4 = d(strArr3, i5);
        Object[] c4 = c(objArr, i5);
        MatrixCursor matrixCursor = new MatrixCursor(d4, 1);
        matrixCursor.addRow(c4);
        return matrixCursor;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("No external updates");
    }

    public b(int i4) {
        this.f1352c = new Object();
        this.f1355f = i4;
    }
}
