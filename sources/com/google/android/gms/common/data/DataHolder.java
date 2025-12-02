package com.google.android.gms.common.data;

import A1.c;
import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;
import x1.C1002a;
import z1.C1032o;

public final class DataHolder extends A1.a implements Closeable {
    public static final Parcelable.Creator<DataHolder> CREATOR = new C1002a();

    /* renamed from: o  reason: collision with root package name */
    public static final a f6664o = new a(new String[0], (String) null);

    /* renamed from: e  reason: collision with root package name */
    public final int f6665e;

    /* renamed from: f  reason: collision with root package name */
    public final String[] f6666f;

    /* renamed from: g  reason: collision with root package name */
    public Bundle f6667g;

    /* renamed from: h  reason: collision with root package name */
    public final CursorWindow[] f6668h;

    /* renamed from: i  reason: collision with root package name */
    public final int f6669i;

    /* renamed from: j  reason: collision with root package name */
    public final Bundle f6670j;

    /* renamed from: k  reason: collision with root package name */
    public int[] f6671k;

    /* renamed from: l  reason: collision with root package name */
    public int f6672l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f6673m = false;

    /* renamed from: n  reason: collision with root package name */
    public boolean f6674n = true;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final String[] f6675a;

        /* renamed from: b  reason: collision with root package name */
        public final ArrayList f6676b = new ArrayList();

        /* renamed from: c  reason: collision with root package name */
        public final HashMap f6677c = new HashMap();

        public /* synthetic */ a(String[] strArr, String str, byte[] bArr) {
            this.f6675a = (String[]) C1032o.f(strArr);
        }
    }

    public DataHolder(int i4, String[] strArr, CursorWindow[] cursorWindowArr, int i5, Bundle bundle) {
        this.f6665e = i4;
        this.f6666f = strArr;
        this.f6668h = cursorWindowArr;
        this.f6669i = i5;
        this.f6670j = bundle;
    }

    public void close() {
        synchronized (this) {
            try {
                if (!this.f6673m) {
                    this.f6673m = true;
                    int i4 = 0;
                    while (true) {
                        CursorWindow[] cursorWindowArr = this.f6668h;
                        if (i4 >= cursorWindowArr.length) {
                            break;
                        }
                        cursorWindowArr[i4].close();
                        i4++;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Bundle d() {
        return this.f6670j;
    }

    public int e() {
        return this.f6669i;
    }

    public final void finalize() {
        try {
            if (this.f6674n && this.f6668h.length > 0 && !isClosed()) {
                close();
                String obj = toString();
                StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 178);
                sb.append("Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: ");
                sb.append(obj);
                sb.append(")");
                Log.e("DataBuffer", sb.toString());
            }
        } finally {
            super.finalize();
        }
    }

    public final void g() {
        this.f6667g = new Bundle();
        int i4 = 0;
        while (true) {
            String[] strArr = this.f6666f;
            if (i4 >= strArr.length) {
                break;
            }
            this.f6667g.putInt(strArr[i4], i4);
            i4++;
        }
        CursorWindow[] cursorWindowArr = this.f6668h;
        this.f6671k = new int[cursorWindowArr.length];
        int i5 = 0;
        for (int i6 = 0; i6 < cursorWindowArr.length; i6++) {
            this.f6671k[i6] = i5;
            i5 += cursorWindowArr[i6].getNumRows() - (i5 - cursorWindowArr[i6].getStartPosition());
        }
        this.f6672l = i5;
    }

    public boolean isClosed() {
        boolean z4;
        synchronized (this) {
            z4 = this.f6673m;
        }
        return z4;
    }

    public final void writeToParcel(Parcel parcel, int i4) {
        String[] strArr = this.f6666f;
        int a4 = c.a(parcel);
        c.n(parcel, 1, strArr, false);
        c.p(parcel, 2, this.f6668h, i4, false);
        c.i(parcel, 3, e());
        c.d(parcel, 4, d(), false);
        c.i(parcel, 1000, this.f6665e);
        c.b(parcel, a4);
        if ((i4 & 1) != 0) {
            close();
        }
    }
}
