package com.google.android.gms.internal.clearcut;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Handler;
import android.support.v4.media.session.b;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.clearcut.c  reason: case insensitive filesystem */
public final class C0412c {

    /* renamed from: h  reason: collision with root package name */
    public static final ConcurrentHashMap f7036h = new ConcurrentHashMap();

    /* renamed from: i  reason: collision with root package name */
    public static final String[] f7037i = {"key", "value"};

    /* renamed from: a  reason: collision with root package name */
    public final ContentResolver f7038a;

    /* renamed from: b  reason: collision with root package name */
    public final Uri f7039b;

    /* renamed from: c  reason: collision with root package name */
    public final ContentObserver f7040c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f7041d = new Object();

    /* renamed from: e  reason: collision with root package name */
    public volatile Map f7042e;

    /* renamed from: f  reason: collision with root package name */
    public final Object f7043f = new Object();

    /* renamed from: g  reason: collision with root package name */
    public final List f7044g = new ArrayList();

    public C0412c(ContentResolver contentResolver, Uri uri) {
        this.f7038a = contentResolver;
        this.f7039b = uri;
        this.f7040c = new C0415d(this, (Handler) null);
    }

    public static C0412c a(ContentResolver contentResolver, Uri uri) {
        ConcurrentHashMap concurrentHashMap = f7036h;
        C0412c cVar = (C0412c) concurrentHashMap.get(uri);
        if (cVar != null) {
            return cVar;
        }
        C0412c cVar2 = new C0412c(contentResolver, uri);
        C0412c cVar3 = (C0412c) concurrentHashMap.putIfAbsent(uri, cVar2);
        if (cVar3 != null) {
            return cVar3;
        }
        cVar2.f7038a.registerContentObserver(cVar2.f7039b, false, cVar2.f7040c);
        return cVar2;
    }

    public final Map c() {
        Map e4 = C0418e.h("gms:phenotype:phenotype_flag:debug_disable_caching", false) ? e() : this.f7042e;
        if (e4 == null) {
            synchronized (this.f7041d) {
                try {
                    Map map = this.f7042e;
                    if (map == null) {
                        map = e();
                        this.f7042e = map;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return e4 != null ? e4 : Collections.emptyMap();
    }

    public final void d() {
        synchronized (this.f7041d) {
            this.f7042e = null;
        }
    }

    public final Map e() {
        Cursor query;
        try {
            HashMap hashMap = new HashMap();
            query = this.f7038a.query(this.f7039b, f7037i, (String) null, (String[]) null, (String) null);
            if (query != null) {
                while (query.moveToNext()) {
                    hashMap.put(query.getString(0), query.getString(1));
                }
                query.close();
            }
            return hashMap;
        } catch (SQLiteException | SecurityException unused) {
            Log.e("ConfigurationContentLoader", "PhenotypeFlag unable to load ContentProvider, using default values");
            return null;
        } catch (Throwable th) {
            query.close();
            throw th;
        }
    }

    public final void f() {
        synchronized (this.f7043f) {
            try {
                Iterator it = this.f7044g.iterator();
                if (it.hasNext()) {
                    b.a(it.next());
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
