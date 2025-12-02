package com.google.gson.internal;

import D2.c;
import com.google.gson.h;
import com.google.gson.internal.bind.TypeAdapters;
import java.io.Writer;

public abstract class k {
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001a, code lost:
        throw new com.google.gson.o((java.lang.Throwable) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0020, code lost:
        throw new com.google.gson.i((java.lang.Throwable) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0026, code lost:
        throw new com.google.gson.o((java.lang.Throwable) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0027, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0028, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002d, code lost:
        return com.google.gson.j.f8570e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0033, code lost:
        throw new com.google.gson.o((java.lang.Throwable) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000d, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000f, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0011, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x000d A[ExcHandler: NumberFormatException (r2v6 'e' java.lang.NumberFormatException A[CUSTOM_DECLARE]), Splitter:B:0:0x0000] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x000f A[ExcHandler: IOException (r2v5 'e' java.io.IOException A[CUSTOM_DECLARE]), Splitter:B:0:0x0000] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0011 A[ExcHandler: d (r2v4 'e' D2.d A[CUSTOM_DECLARE]), Splitter:B:0:0x0000] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.gson.h a(D2.a r2) {
        /*
            r2.F()     // Catch:{ EOFException -> 0x0027, d -> 0x0011, IOException -> 0x000f, NumberFormatException -> 0x000d }
            r0 = 0
            com.google.gson.TypeAdapter r1 = com.google.gson.internal.bind.TypeAdapters.f8445U     // Catch:{ EOFException -> 0x0013, d -> 0x0011, IOException -> 0x000f, NumberFormatException -> 0x000d }
            java.lang.Object r2 = r1.c(r2)     // Catch:{ EOFException -> 0x0013, d -> 0x0011, IOException -> 0x000f, NumberFormatException -> 0x000d }
            com.google.gson.h r2 = (com.google.gson.h) r2     // Catch:{ EOFException -> 0x0013, d -> 0x0011, IOException -> 0x000f, NumberFormatException -> 0x000d }
            return r2
        L_0x000d:
            r2 = move-exception
            goto L_0x0015
        L_0x000f:
            r2 = move-exception
            goto L_0x001b
        L_0x0011:
            r2 = move-exception
            goto L_0x0021
        L_0x0013:
            r2 = move-exception
            goto L_0x0029
        L_0x0015:
            com.google.gson.o r0 = new com.google.gson.o
            r0.<init>((java.lang.Throwable) r2)
            throw r0
        L_0x001b:
            com.google.gson.i r0 = new com.google.gson.i
            r0.<init>((java.lang.Throwable) r2)
            throw r0
        L_0x0021:
            com.google.gson.o r0 = new com.google.gson.o
            r0.<init>((java.lang.Throwable) r2)
            throw r0
        L_0x0027:
            r2 = move-exception
            r0 = 1
        L_0x0029:
            if (r0 == 0) goto L_0x002e
            com.google.gson.j r2 = com.google.gson.j.f8570e
            return r2
        L_0x002e:
            com.google.gson.o r0 = new com.google.gson.o
            r0.<init>((java.lang.Throwable) r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.k.a(D2.a):com.google.gson.h");
    }

    public static void b(h hVar, c cVar) {
        TypeAdapters.f8445U.e(cVar, hVar);
    }

    public static Writer c(Appendable appendable) {
        return appendable instanceof Writer ? (Writer) appendable : new a(appendable);
    }

    public static final class a extends Writer {

        /* renamed from: e  reason: collision with root package name */
        public final Appendable f8550e;

        /* renamed from: f  reason: collision with root package name */
        public final C0141a f8551f = new C0141a();

        /* renamed from: com.google.gson.internal.k$a$a  reason: collision with other inner class name */
        public static class C0141a implements CharSequence {

            /* renamed from: e  reason: collision with root package name */
            public char[] f8552e;

            public char charAt(int i4) {
                return this.f8552e[i4];
            }

            public int length() {
                return this.f8552e.length;
            }

            public CharSequence subSequence(int i4, int i5) {
                return new String(this.f8552e, i4, i5 - i4);
            }
        }

        public a(Appendable appendable) {
            this.f8550e = appendable;
        }

        public void close() {
        }

        public void flush() {
        }

        public void write(char[] cArr, int i4, int i5) {
            C0141a aVar = this.f8551f;
            aVar.f8552e = cArr;
            this.f8550e.append(aVar, i4, i5 + i4);
        }

        public void write(int i4) {
            this.f8550e.append((char) i4);
        }
    }
}
