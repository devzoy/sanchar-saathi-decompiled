package o1;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import o1.C0818c;

/* renamed from: o1.a  reason: case insensitive filesystem */
public class C0816a implements C0818c.a {

    /* renamed from: o1.a$a  reason: collision with other inner class name */
    public static class C0188a {

        /* renamed from: a  reason: collision with root package name */
        public ZipFile f11320a;

        /* renamed from: b  reason: collision with root package name */
        public ZipEntry f11321b;

        public C0188a(ZipFile zipFile, ZipEntry zipEntry) {
            this.f11320a = zipFile;
            this.f11321b = zipEntry;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: o1.a$a} */
    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r0v2 */
    /* JADX WARNING: type inference failed for: r0v3, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r0v4 */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0025, code lost:
        r9 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0026, code lost:
        r0 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x009f, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:?, code lost:
        r9 = new java.lang.String[]{r9.toString()};
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:?, code lost:
        r10 = r0.f11320a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x00b3, code lost:
        if (r10 != null) goto L_0x00b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x00b5, code lost:
        r10.close();
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:8:0x0010, B:63:0x009a] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00b1 A[SYNTHETIC, Splitter:B:72:0x00b1] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(android.content.Context r9, java.lang.String[] r10, java.lang.String r11, java.io.File r12, o1.C0819d r13) {
        /*
            r8 = this;
            r0 = 0
            o1.a$a r1 = r8.d(r9, r10, r11, r13)     // Catch:{ all -> 0x00ae }
            if (r1 == 0) goto L_0x009a
            r9 = 0
            r10 = r9
        L_0x0009:
            int r2 = r10 + 1
            r3 = 5
            if (r10 >= r3) goto L_0x008d
            java.lang.String r10 = "Found %s! Extracting..."
            java.lang.Object[] r3 = new java.lang.Object[]{r11}     // Catch:{ all -> 0x0025 }
            r13.i(r10, r3)     // Catch:{ all -> 0x0025 }
            boolean r10 = r12.exists()     // Catch:{ IOException -> 0x008a }
            if (r10 != 0) goto L_0x0029
            boolean r10 = r12.createNewFile()     // Catch:{ IOException -> 0x008a }
            if (r10 != 0) goto L_0x0029
            goto L_0x008a
        L_0x0025:
            r9 = move-exception
            r0 = r1
            goto L_0x00af
        L_0x0029:
            java.util.zip.ZipFile r10 = r1.f11320a     // Catch:{ FileNotFoundException -> 0x0078, IOException -> 0x0075, all -> 0x0072 }
            java.util.zip.ZipEntry r3 = r1.f11321b     // Catch:{ FileNotFoundException -> 0x0078, IOException -> 0x0075, all -> 0x0072 }
            java.io.InputStream r10 = r10.getInputStream(r3)     // Catch:{ FileNotFoundException -> 0x0078, IOException -> 0x0075, all -> 0x0072 }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x0070, IOException -> 0x006e, all -> 0x006b }
            r3.<init>(r12)     // Catch:{ FileNotFoundException -> 0x0070, IOException -> 0x006e, all -> 0x006b }
            long r4 = r8.c(r10, r3)     // Catch:{ FileNotFoundException -> 0x0086, IOException -> 0x0082, all -> 0x0068 }
            java.io.FileDescriptor r6 = r3.getFD()     // Catch:{ FileNotFoundException -> 0x0086, IOException -> 0x0082, all -> 0x0068 }
            r6.sync()     // Catch:{ FileNotFoundException -> 0x0086, IOException -> 0x0082, all -> 0x0068 }
            long r6 = r12.length()     // Catch:{ FileNotFoundException -> 0x0086, IOException -> 0x0082, all -> 0x0068 }
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x0050
            r8.b(r10)     // Catch:{ all -> 0x0025 }
        L_0x004c:
            r8.b(r3)     // Catch:{ all -> 0x0025 }
            goto L_0x008a
        L_0x0050:
            r8.b(r10)     // Catch:{ all -> 0x0025 }
            r8.b(r3)     // Catch:{ all -> 0x0025 }
            r10 = 1
            r12.setReadable(r10, r9)     // Catch:{ all -> 0x0025 }
            r12.setExecutable(r10, r9)     // Catch:{ all -> 0x0025 }
            r12.setWritable(r10)     // Catch:{ all -> 0x0025 }
            java.util.zip.ZipFile r9 = r1.f11320a     // Catch:{ IOException -> 0x0067 }
            if (r9 == 0) goto L_0x0067
            r9.close()     // Catch:{ IOException -> 0x0067 }
        L_0x0067:
            return
        L_0x0068:
            r9 = move-exception
        L_0x0069:
            r0 = r10
            goto L_0x007b
        L_0x006b:
            r9 = move-exception
            r3 = r0
            goto L_0x0069
        L_0x006e:
            r3 = r0
            goto L_0x0082
        L_0x0070:
            r3 = r0
            goto L_0x0086
        L_0x0072:
            r9 = move-exception
            r3 = r0
            goto L_0x007b
        L_0x0075:
            r10 = r0
            r3 = r10
            goto L_0x0082
        L_0x0078:
            r10 = r0
            r3 = r10
            goto L_0x0086
        L_0x007b:
            r8.b(r0)     // Catch:{ all -> 0x0025 }
            r8.b(r3)     // Catch:{ all -> 0x0025 }
            throw r9     // Catch:{ all -> 0x0025 }
        L_0x0082:
            r8.b(r10)     // Catch:{ all -> 0x0025 }
            goto L_0x004c
        L_0x0086:
            r8.b(r10)     // Catch:{ all -> 0x0025 }
            goto L_0x004c
        L_0x008a:
            r10 = r2
            goto L_0x0009
        L_0x008d:
            java.lang.String r9 = "FATAL! Couldn't extract the library from the APK!"
            r13.h(r9)     // Catch:{ all -> 0x0025 }
            java.util.zip.ZipFile r9 = r1.f11320a     // Catch:{ IOException -> 0x0099 }
            if (r9 == 0) goto L_0x0099
            r9.close()     // Catch:{ IOException -> 0x0099 }
        L_0x0099:
            return
        L_0x009a:
            java.lang.String[] r9 = r8.e(r9, r11)     // Catch:{ Exception -> 0x009f }
            goto L_0x00a8
        L_0x009f:
            r9 = move-exception
            java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x0025 }
            java.lang.String[] r9 = new java.lang.String[]{r9}     // Catch:{ all -> 0x0025 }
        L_0x00a8:
            o1.b r12 = new o1.b     // Catch:{ all -> 0x0025 }
            r12.<init>(r11, r10, r9)     // Catch:{ all -> 0x0025 }
            throw r12     // Catch:{ all -> 0x0025 }
        L_0x00ae:
            r9 = move-exception
        L_0x00af:
            if (r0 == 0) goto L_0x00b8
            java.util.zip.ZipFile r10 = r0.f11320a     // Catch:{ IOException -> 0x00b8 }
            if (r10 == 0) goto L_0x00b8
            r10.close()     // Catch:{ IOException -> 0x00b8 }
        L_0x00b8:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: o1.C0816a.a(android.content.Context, java.lang.String[], java.lang.String, java.io.File, o1.d):void");
    }

    public final void b(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public final long c(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[4096];
        long j4 = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                outputStream.flush();
                return j4;
            }
            outputStream.write(bArr, 0, read);
            j4 += (long) read;
        }
    }

    public final C0188a d(Context context, String[] strArr, String str, C0819d dVar) {
        String[] strArr2 = strArr;
        String[] f4 = f(context);
        int length = f4.length;
        int i4 = 0;
        while (true) {
            ZipFile zipFile = null;
            if (i4 >= length) {
                return null;
            }
            String str2 = f4[i4];
            int i5 = 0;
            while (true) {
                int i6 = i5 + 1;
                if (i5 >= 5) {
                    break;
                }
                try {
                    zipFile = new ZipFile(new File(str2), 1);
                    break;
                } catch (IOException unused) {
                    i5 = i6;
                }
            }
            if (zipFile == null) {
                String str3 = str;
                C0819d dVar2 = dVar;
            } else {
                int i7 = 0;
                while (true) {
                    int i8 = i7 + 1;
                    if (i7 < 5) {
                        for (String append : strArr2) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("lib");
                            char c4 = File.separatorChar;
                            sb.append(c4);
                            sb.append(append);
                            sb.append(c4);
                            sb.append(str);
                            String sb2 = sb.toString();
                            dVar.i("Looking for %s in APK %s...", sb2, str2);
                            ZipEntry entry = zipFile.getEntry(sb2);
                            if (entry != null) {
                                return new C0188a(zipFile, entry);
                            }
                        }
                        String str4 = str;
                        C0819d dVar3 = dVar;
                        i7 = i8;
                    } else {
                        String str5 = str;
                        C0819d dVar4 = dVar;
                        try {
                            zipFile.close();
                            break;
                        } catch (IOException unused2) {
                        }
                    }
                }
            }
            i4++;
        }
    }

    public final String[] e(Context context, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("lib");
        char c4 = File.separatorChar;
        sb.append(c4);
        sb.append("([^\\");
        sb.append(c4);
        sb.append("]*)");
        sb.append(c4);
        sb.append(str);
        Pattern compile = Pattern.compile(sb.toString());
        HashSet hashSet = new HashSet();
        for (String file : f(context)) {
            try {
                Enumeration<? extends ZipEntry> entries = new ZipFile(new File(file), 1).entries();
                while (entries.hasMoreElements()) {
                    Matcher matcher = compile.matcher(((ZipEntry) entries.nextElement()).getName());
                    if (matcher.matches()) {
                        hashSet.add(matcher.group(1));
                    }
                }
            } catch (IOException unused) {
            }
        }
        return (String[]) hashSet.toArray(new String[hashSet.size()]);
    }

    public final String[] f(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        String[] strArr = applicationInfo.splitSourceDirs;
        if (strArr == null || strArr.length == 0) {
            return new String[]{applicationInfo.sourceDir};
        }
        String[] strArr2 = new String[(strArr.length + 1)];
        strArr2[0] = applicationInfo.sourceDir;
        System.arraycopy(strArr, 0, strArr2, 1, strArr.length);
        return strArr2;
    }
}
