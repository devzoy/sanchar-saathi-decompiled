package E2;

import E2.a;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.storage.StorageManager;
import android.provider.DocumentsContract;
import android.util.Log;
import android.webkit.MimeTypeMap;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public abstract class e {
    public static boolean a(Context context) {
        try {
            n(new File(context.getCacheDir() + "/file_picker/"));
            return true;
        } catch (Exception e4) {
            Log.e("FilePickerUtils", "There was an error while clearing cached files: " + e4.toString());
            return false;
        }
    }

    public static Uri b(Uri uri, int i4, Context context) {
        InputStream openInputStream;
        try {
            openInputStream = context.getContentResolver().openInputStream(uri);
            File c4 = c();
            Bitmap decodeStream = BitmapFactory.decodeStream(openInputStream);
            FileOutputStream fileOutputStream = new FileOutputStream(c4);
            decodeStream.compress(Bitmap.CompressFormat.JPEG, i4, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
            Uri fromFile = Uri.fromFile(c4);
            if (openInputStream != null) {
                openInputStream.close();
            }
            return fromFile;
        } catch (FileNotFoundException e4) {
            throw new RuntimeException(e4);
        } catch (IOException e5) {
            throw new RuntimeException(e5);
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public static File c() {
        String format = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        return File.createTempFile("JPEG_" + format + "_", ".jpg", Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES));
    }

    public static String d(Class cls, Object obj) {
        try {
            if (Build.VERSION.SDK_INT < 30) {
                return (String) cls.getMethod("getPath", (Class[]) null).invoke(obj, (Object[]) null);
            }
            File file = (File) cls.getMethod("getDirectory", (Class[]) null).invoke(obj, (Object[]) null);
            if (file != null) {
                return file.getPath();
            }
            return null;
        } catch (Exception unused) {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000e, code lost:
        r2 = r2[1];
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String e(android.net.Uri r2) {
        /*
            java.lang.String r2 = android.provider.DocumentsContract.getTreeDocumentId(r2)
            java.lang.String r0 = ":"
            java.lang.String[] r2 = r2.split(r0)
            int r0 = r2.length
            r1 = 2
            if (r0 < r1) goto L_0x0014
            r0 = 1
            r2 = r2[r0]
            if (r2 == 0) goto L_0x0014
            return r2
        L_0x0014:
            java.lang.String r2 = java.io.File.separator
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: E2.e.e(android.net.Uri):java.lang.String");
    }

    public static String f(Uri uri, Context context) {
        Cursor query;
        String str = null;
        try {
            if (uri.getScheme().equals("content")) {
                query = context.getContentResolver().query(uri, new String[]{"_display_name"}, (String) null, (String[]) null, (String) null);
                if (query != null) {
                    if (query.moveToFirst()) {
                        str = query.getString(query.getColumnIndexOrThrow("_display_name"));
                    }
                }
                query.close();
            }
            if (str != null) {
                return str;
            }
            String path = uri.getPath();
            int lastIndexOf = path.lastIndexOf(47);
            return lastIndexOf != -1 ? path.substring(lastIndexOf + 1) : path;
        } catch (Exception e4) {
            Log.e("FilePickerUtils", "Failed to handle file name: " + e4.toString());
            return null;
        } catch (Throwable th) {
            query.close();
            throw th;
        }
    }

    public static String g(Uri uri, Context context) {
        if (uri == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 30 || !k(uri)) {
            String j4 = j(i(uri), context);
            new a.C0009a();
            if (j4 == null) {
                return File.separator;
            }
            String str = File.separator;
            if (j4.endsWith(str)) {
                j4 = j4.substring(0, j4.length() - 1);
            }
            String e4 = e(uri);
            if (e4.endsWith(str)) {
                e4 = e4.substring(0, e4.length() - 1);
            }
            if (e4.length() <= 0) {
                return j4;
            }
            if (e4.startsWith(str)) {
                return j4 + e4;
            }
            return j4 + str + e4;
        }
        String documentId = DocumentsContract.getDocumentId(uri);
        String path = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getPath();
        if (documentId.equals("downloads")) {
            return path;
        }
        if (documentId.matches("^ms[df]\\:.*")) {
            String f4 = f(uri, context);
            return path + "/" + f4;
        } else if (documentId.startsWith("raw:")) {
            return documentId.split(":")[1];
        } else {
            return null;
        }
    }

    public static String[] h(ArrayList arrayList) {
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension((String) arrayList.get(i4));
            if (mimeTypeFromExtension == null) {
                Log.w("FilePickerUtils", "Custom file type " + ((String) arrayList.get(i4)) + " is unsupported and will be ignored.");
            } else {
                arrayList2.add(mimeTypeFromExtension);
            }
        }
        Log.d("FilePickerUtils", "Allowed file extensions mimes: " + arrayList2);
        return (String[]) arrayList2.toArray(new String[0]);
    }

    public static String i(Uri uri) {
        String[] split = DocumentsContract.getTreeDocumentId(uri).split(":");
        if (split.length > 0) {
            return split[0];
        }
        return null;
    }

    public static String j(String str, Context context) {
        try {
            StorageManager storageManager = (StorageManager) context.getSystemService("storage");
            Class<?> cls = Class.forName("android.os.storage.StorageVolume");
            Method method = storageManager.getClass().getMethod("getVolumeList", (Class[]) null);
            Method method2 = cls.getMethod("getUuid", (Class[]) null);
            Method method3 = cls.getMethod("isPrimary", (Class[]) null);
            Object invoke = method.invoke(storageManager, (Object[]) null);
            if (invoke == null) {
                return null;
            }
            int length = Array.getLength(invoke);
            for (int i4 = 0; i4 < length; i4++) {
                Object obj = Array.get(invoke, i4);
                String str2 = (String) method2.invoke(obj, (Object[]) null);
                if (((Boolean) method3.invoke(obj, (Object[]) null)) != null && "primary".equals(str)) {
                    return d(cls, obj);
                }
                if (str2 != null && str2.equals(str)) {
                    return d(cls, obj);
                }
            }
            return null;
        } catch (Exception unused) {
        }
    }

    public static boolean k(Uri uri) {
        return "com.android.providers.downloads.documents".equals(uri.getAuthority());
    }

    public static void l(File file, a.C0009a aVar) {
        try {
            int length = (int) file.length();
            byte[] bArr = new byte[length];
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                bufferedInputStream.read(bArr, 0, length);
                bufferedInputStream.close();
            } catch (FileNotFoundException e4) {
                Log.e("FilePickerUtils", "File not found: " + e4.getMessage(), (Throwable) null);
            } catch (IOException e5) {
                Log.e("FilePickerUtils", "Failed to close file streams: " + e5.getMessage(), (Throwable) null);
            }
            aVar.b(bArr);
        } catch (Exception e6) {
            Log.e("FilePickerUtils", "Failed to load bytes into memory with error " + e6.toString() + ". Probably the file is too big to fit device memory. Bytes won't be added to the file this time.");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x00fb A[SYNTHETIC, Splitter:B:44:0x00fb] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0118 A[SYNTHETIC, Splitter:B:49:0x0118] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0136 A[SYNTHETIC, Splitter:B:55:0x0136] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0153 A[SYNTHETIC, Splitter:B:60:0x0153] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static E2.a m(android.content.Context r12, android.net.Uri r13, boolean r14) {
        /*
            java.lang.String r0 = "Failed to close file streams: "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Caching from URI: "
            r1.append(r2)
            java.lang.String r2 = r13.toString()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "FilePickerUtils"
            android.util.Log.i(r2, r1)
            E2.a$a r1 = new E2.a$a
            r1.<init>()
            java.lang.String r3 = f(r13, r12)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.io.File r5 = r12.getCacheDir()
            java.lang.String r5 = r5.getAbsolutePath()
            r4.append(r5)
            java.lang.String r5 = "/file_picker/"
            r4.append(r5)
            long r5 = java.lang.System.currentTimeMillis()
            r4.append(r5)
            java.lang.String r5 = "/"
            r4.append(r5)
            if (r3 == 0) goto L_0x004a
            r5 = r3
            goto L_0x004c
        L_0x004a:
            java.lang.String r5 = "unamed"
        L_0x004c:
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.io.File r5 = new java.io.File
            r5.<init>(r4)
            boolean r6 = r5.exists()
            if (r6 != 0) goto L_0x016f
            r6 = 0
            java.io.File r7 = r5.getParentFile()     // Catch:{ Exception -> 0x00de, all -> 0x00da }
            r7.mkdirs()     // Catch:{ Exception -> 0x00de, all -> 0x00da }
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x00de, all -> 0x00da }
            r7.<init>(r4)     // Catch:{ Exception -> 0x00de, all -> 0x00da }
            java.io.BufferedOutputStream r8 = new java.io.BufferedOutputStream     // Catch:{ all -> 0x00d0 }
            r8.<init>(r7)     // Catch:{ all -> 0x00d0 }
            android.content.ContentResolver r12 = r12.getContentResolver()     // Catch:{ all -> 0x00d0 }
            java.io.InputStream r12 = r12.openInputStream(r13)     // Catch:{ all -> 0x00d0 }
            r9 = 8192(0x2000, float:1.14794E-41)
            byte[] r9 = new byte[r9]     // Catch:{ all -> 0x0087 }
        L_0x007c:
            int r10 = r12.read(r9)     // Catch:{ all -> 0x0087 }
            if (r10 < 0) goto L_0x0089
            r11 = 0
            r8.write(r9, r11, r10)     // Catch:{ all -> 0x0087 }
            goto L_0x007c
        L_0x0087:
            r13 = move-exception
            goto L_0x00d2
        L_0x0089:
            r8.flush()     // Catch:{ all -> 0x0087 }
            java.io.FileDescriptor r8 = r7.getFD()     // Catch:{ Exception -> 0x00ce }
            r8.sync()     // Catch:{ Exception -> 0x00ce }
            r7.close()     // Catch:{ IOException -> 0x0097 }
            goto L_0x00ae
        L_0x0097:
            r7 = move-exception
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r0)
            java.lang.String r7 = r7.getMessage()
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            android.util.Log.e(r2, r7, r6)
        L_0x00ae:
            r12.close()     // Catch:{ IOException -> 0x00b3 }
            goto L_0x016f
        L_0x00b3:
            r12 = move-exception
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r0)
            java.lang.String r12 = r12.getMessage()
            r7.append(r12)
            java.lang.String r12 = r7.toString()
            android.util.Log.e(r2, r12, r6)
            goto L_0x016f
        L_0x00cc:
            r13 = move-exception
            goto L_0x0134
        L_0x00ce:
            r13 = move-exception
            goto L_0x00e1
        L_0x00d0:
            r13 = move-exception
            r12 = r6
        L_0x00d2:
            java.io.FileDescriptor r14 = r7.getFD()     // Catch:{ Exception -> 0x00ce }
            r14.sync()     // Catch:{ Exception -> 0x00ce }
            throw r13     // Catch:{ Exception -> 0x00ce }
        L_0x00da:
            r13 = move-exception
            r12 = r6
            r7 = r12
            goto L_0x0134
        L_0x00de:
            r13 = move-exception
            r12 = r6
            r7 = r12
        L_0x00e1:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ all -> 0x00cc }
            r14.<init>()     // Catch:{ all -> 0x00cc }
            java.lang.String r1 = "Failed to retrieve path: "
            r14.append(r1)     // Catch:{ all -> 0x00cc }
            java.lang.String r13 = r13.getMessage()     // Catch:{ all -> 0x00cc }
            r14.append(r13)     // Catch:{ all -> 0x00cc }
            java.lang.String r13 = r14.toString()     // Catch:{ all -> 0x00cc }
            android.util.Log.e(r2, r13, r6)     // Catch:{ all -> 0x00cc }
            if (r7 == 0) goto L_0x0116
            r7.close()     // Catch:{ IOException -> 0x00ff }
            goto L_0x0116
        L_0x00ff:
            r13 = move-exception
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r0)
            java.lang.String r13 = r13.getMessage()
            r14.append(r13)
            java.lang.String r13 = r14.toString()
            android.util.Log.e(r2, r13, r6)
        L_0x0116:
            if (r12 == 0) goto L_0x0133
            r12.close()     // Catch:{ IOException -> 0x011c }
            goto L_0x0133
        L_0x011c:
            r12 = move-exception
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r0)
            java.lang.String r12 = r12.getMessage()
            r13.append(r12)
            java.lang.String r12 = r13.toString()
            android.util.Log.e(r2, r12, r6)
        L_0x0133:
            return r6
        L_0x0134:
            if (r7 == 0) goto L_0x0151
            r7.close()     // Catch:{ IOException -> 0x013a }
            goto L_0x0151
        L_0x013a:
            r14 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r14 = r14.getMessage()
            r1.append(r14)
            java.lang.String r14 = r1.toString()
            android.util.Log.e(r2, r14, r6)
        L_0x0151:
            if (r12 == 0) goto L_0x016e
            r12.close()     // Catch:{ IOException -> 0x0157 }
            goto L_0x016e
        L_0x0157:
            r12 = move-exception
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r0)
            java.lang.String r12 = r12.getMessage()
            r14.append(r12)
            java.lang.String r12 = r14.toString()
            android.util.Log.e(r2, r12, r6)
        L_0x016e:
            throw r13
        L_0x016f:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r0 = "File loaded and cached at:"
            r12.append(r0)
            r12.append(r4)
            java.lang.String r12 = r12.toString()
            android.util.Log.d(r2, r12)
            if (r14 == 0) goto L_0x0188
            l(r5, r1)
        L_0x0188:
            E2.a$a r12 = r1.d(r4)
            E2.a$a r12 = r12.c(r3)
            E2.a$a r12 = r12.f(r13)
            long r13 = r5.length()
            java.lang.String r13 = java.lang.String.valueOf(r13)
            long r13 = java.lang.Long.parseLong(r13)
            r12.e(r13)
            E2.a r12 = r1.a()
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: E2.e.m(android.content.Context, android.net.Uri, boolean):E2.a");
    }

    public static void n(File file) {
        if (file != null && file.exists()) {
            if (file.isDirectory()) {
                for (File n4 : file.listFiles()) {
                    n(n4);
                }
            }
            file.delete();
        }
    }
}
