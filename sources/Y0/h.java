package y0;

import C3.o;
import android.content.Context;
import android.util.Log;
import java.io.Closeable;
import java.io.File;
import net.sqlcipher.database.SQLiteDatabase;
import v3.g;
import v3.l;

public interface h extends Closeable {

    public static abstract class a {

        /* renamed from: b  reason: collision with root package name */
        public static final C0210a f12715b = new C0210a((g) null);

        /* renamed from: a  reason: collision with root package name */
        public final int f12716a;

        /* renamed from: y0.h$a$a  reason: collision with other inner class name */
        public static final class C0210a {
            public /* synthetic */ C0210a(g gVar) {
                this();
            }

            public C0210a() {
            }
        }

        public a(int i4) {
            this.f12716a = i4;
        }

        public final void a(String str) {
            if (!o.o(str, SQLiteDatabase.MEMORY, true)) {
                int length = str.length() - 1;
                int i4 = 0;
                boolean z4 = false;
                while (i4 <= length) {
                    boolean z5 = l.f(str.charAt(!z4 ? i4 : length), 32) <= 0;
                    if (!z4) {
                        if (!z5) {
                            z4 = true;
                        } else {
                            i4++;
                        }
                    } else if (!z5) {
                        break;
                    } else {
                        length--;
                    }
                }
                if (str.subSequence(i4, length + 1).toString().length() != 0) {
                    Log.w("SupportSQLite", "deleting the database file: " + str);
                    try {
                        b.a(new File(str));
                    } catch (Exception e4) {
                        Log.w("SupportSQLite", "delete failed: ", e4);
                    }
                }
            }
        }

        public void b(g gVar) {
            l.e(gVar, "db");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x003e, code lost:
            if (r1 != null) goto L_0x0040;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0040, code lost:
            r4 = r1.iterator();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x004a, code lost:
            if (r4.hasNext() != false) goto L_0x004c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x004c, code lost:
            r1 = ((android.util.Pair) r4.next()).second;
            v3.l.d(r1, "p.second");
            a((java.lang.String) r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x005d, code lost:
            r4 = r4.getPath();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0061, code lost:
            if (r4 != null) goto L_0x0063;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0063, code lost:
            a(r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0066, code lost:
            throw r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0038, code lost:
            r2 = move-exception;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x003a */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x0069  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x0086  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0038 A[ExcHandler: all (r2v3 'th' java.lang.Throwable A[CUSTOM_DECLARE]), PHI: r1 
          PHI: (r1v12 java.util.List) = (r1v4 java.util.List), (r1v5 java.util.List), (r1v5 java.util.List) binds: [B:6:0x0033, B:9:0x003a, B:10:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:6:0x0033] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void c(y0.g r4) {
            /*
                r3 = this;
                java.lang.String r0 = "p.second"
                java.lang.String r1 = "db"
                v3.l.e(r4, r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Corruption reported by sqlite on database: "
                r1.append(r2)
                r1.append(r4)
                java.lang.String r2 = ".path"
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                java.lang.String r2 = "SupportSQLite"
                android.util.Log.e(r2, r1)
                boolean r1 = r4.isOpen()
                if (r1 != 0) goto L_0x0032
                java.lang.String r4 = r4.getPath()
                if (r4 == 0) goto L_0x0031
                r3.a(r4)
            L_0x0031:
                return
            L_0x0032:
                r1 = 0
                java.util.List r1 = r4.getAttachedDbs()     // Catch:{ SQLiteException -> 0x003a, all -> 0x0038 }
                goto L_0x003a
            L_0x0038:
                r2 = move-exception
                goto L_0x003e
            L_0x003a:
                r4.close()     // Catch:{ IOException -> 0x0067, all -> 0x0038 }
                goto L_0x0067
            L_0x003e:
                if (r1 == 0) goto L_0x005d
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.util.Iterator r4 = r1.iterator()
            L_0x0046:
                boolean r1 = r4.hasNext()
                if (r1 == 0) goto L_0x0066
                java.lang.Object r1 = r4.next()
                android.util.Pair r1 = (android.util.Pair) r1
                java.lang.Object r1 = r1.second
                v3.l.d(r1, r0)
                java.lang.String r1 = (java.lang.String) r1
                r3.a(r1)
                goto L_0x0046
            L_0x005d:
                java.lang.String r4 = r4.getPath()
                if (r4 == 0) goto L_0x0066
                r3.a(r4)
            L_0x0066:
                throw r2
            L_0x0067:
                if (r1 == 0) goto L_0x0086
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.util.Iterator r4 = r1.iterator()
            L_0x006f:
                boolean r1 = r4.hasNext()
                if (r1 == 0) goto L_0x008f
                java.lang.Object r1 = r4.next()
                android.util.Pair r1 = (android.util.Pair) r1
                java.lang.Object r1 = r1.second
                v3.l.d(r1, r0)
                java.lang.String r1 = (java.lang.String) r1
                r3.a(r1)
                goto L_0x006f
            L_0x0086:
                java.lang.String r4 = r4.getPath()
                if (r4 == 0) goto L_0x008f
                r3.a(r4)
            L_0x008f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: y0.h.a.c(y0.g):void");
        }

        public abstract void d(g gVar);

        public abstract void e(g gVar, int i4, int i5);

        public void f(g gVar) {
            l.e(gVar, "db");
        }

        public abstract void g(g gVar, int i4, int i5);
    }

    public static final class b {

        /* renamed from: f  reason: collision with root package name */
        public static final C0211b f12717f = new C0211b((g) null);

        /* renamed from: a  reason: collision with root package name */
        public final Context f12718a;

        /* renamed from: b  reason: collision with root package name */
        public final String f12719b;

        /* renamed from: c  reason: collision with root package name */
        public final a f12720c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f12721d;

        /* renamed from: e  reason: collision with root package name */
        public final boolean f12722e;

        public static class a {

            /* renamed from: a  reason: collision with root package name */
            public final Context f12723a;

            /* renamed from: b  reason: collision with root package name */
            public String f12724b;

            /* renamed from: c  reason: collision with root package name */
            public a f12725c;

            /* renamed from: d  reason: collision with root package name */
            public boolean f12726d;

            /* renamed from: e  reason: collision with root package name */
            public boolean f12727e;

            public a(Context context) {
                l.e(context, "context");
                this.f12723a = context;
            }

            public a a(boolean z4) {
                this.f12727e = z4;
                return this;
            }

            public b b() {
                String str;
                a aVar = this.f12725c;
                if (aVar == null) {
                    throw new IllegalArgumentException("Must set a callback to create the configuration.");
                } else if (!this.f12726d || ((str = this.f12724b) != null && str.length() != 0)) {
                    return new b(this.f12723a, this.f12724b, aVar, this.f12726d, this.f12727e);
                } else {
                    throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
                }
            }

            public a c(a aVar) {
                l.e(aVar, "callback");
                this.f12725c = aVar;
                return this;
            }

            public a d(String str) {
                this.f12724b = str;
                return this;
            }

            public a e(boolean z4) {
                this.f12726d = z4;
                return this;
            }
        }

        /* renamed from: y0.h$b$b  reason: collision with other inner class name */
        public static final class C0211b {
            public /* synthetic */ C0211b(g gVar) {
                this();
            }

            public final a a(Context context) {
                l.e(context, "context");
                return new a(context);
            }

            public C0211b() {
            }
        }

        public b(Context context, String str, a aVar, boolean z4, boolean z5) {
            l.e(context, "context");
            l.e(aVar, "callback");
            this.f12718a = context;
            this.f12719b = str;
            this.f12720c = aVar;
            this.f12721d = z4;
            this.f12722e = z5;
        }

        public static final a a(Context context) {
            return f12717f.a(context);
        }
    }

    public interface c {
        h create(b bVar);
    }

    void close();

    String getDatabaseName();

    g getWritableDatabase();

    void setWriteAheadLoggingEnabled(boolean z4);
}
