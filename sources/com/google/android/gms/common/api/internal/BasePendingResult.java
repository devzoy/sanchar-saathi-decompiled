package com.google.android.gms.common.api.internal;

import J1.f;
import android.os.Looper;
import android.os.Message;
import android.support.v4.media.session.b;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import v1.C0952f;
import v1.C0953g;
import v1.C0956j;
import w1.Z;
import z1.C1032o;

public abstract class BasePendingResult<R extends C0956j> extends C0953g {

    /* renamed from: m  reason: collision with root package name */
    public static final ThreadLocal f6649m = new Z();

    /* renamed from: a  reason: collision with root package name */
    public final Object f6650a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final a f6651b;

    /* renamed from: c  reason: collision with root package name */
    public final WeakReference f6652c;

    /* renamed from: d  reason: collision with root package name */
    public final CountDownLatch f6653d = new CountDownLatch(1);

    /* renamed from: e  reason: collision with root package name */
    public final ArrayList f6654e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    public final AtomicReference f6655f = new AtomicReference();

    /* renamed from: g  reason: collision with root package name */
    public C0956j f6656g;

    /* renamed from: h  reason: collision with root package name */
    public Status f6657h;

    /* renamed from: i  reason: collision with root package name */
    public volatile boolean f6658i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f6659j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f6660k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f6661l = false;

    public static class a extends f {
        public a(Looper looper) {
            super(looper);
        }

        public final void handleMessage(Message message) {
            int i4 = message.what;
            if (i4 == 1) {
                Pair pair = (Pair) message.obj;
                b.a(pair.first);
                C0956j jVar = (C0956j) pair.second;
                try {
                    throw null;
                } catch (RuntimeException e4) {
                    BasePendingResult.h(jVar);
                    throw e4;
                }
            } else if (i4 != 2) {
                StringBuilder sb = new StringBuilder(String.valueOf(i4).length() + 34);
                sb.append("Don't know how to handle message: ");
                sb.append(i4);
                Log.wtf("BasePendingResult", sb.toString(), new Exception());
            } else {
                ((BasePendingResult) message.obj).c(Status.f6641m);
            }
        }
    }

    public BasePendingResult(C0952f fVar) {
        this.f6651b = new a(fVar != null ? fVar.a() : Looper.getMainLooper());
        this.f6652c = new WeakReference(fVar);
    }

    public static void h(C0956j jVar) {
    }

    public final void a(C0953g.a aVar) {
        C1032o.b(aVar != null, "Callback cannot be null.");
        synchronized (this.f6650a) {
            try {
                if (d()) {
                    aVar.a(this.f6657h);
                } else {
                    this.f6654e.add(aVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract C0956j b(Status status);

    public final void c(Status status) {
        synchronized (this.f6650a) {
            try {
                if (!d()) {
                    e(b(status));
                    this.f6660k = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean d() {
        return this.f6653d.getCount() == 0;
    }

    public final void e(C0956j jVar) {
        synchronized (this.f6650a) {
            try {
                if (this.f6660k || this.f6659j) {
                    h(jVar);
                    return;
                }
                d();
                C1032o.i(!d(), "Results have already been set");
                C1032o.i(!this.f6658i, "Result has already been consumed");
                f(jVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f(C0956j jVar) {
        this.f6656g = jVar;
        this.f6657h = jVar.c();
        this.f6653d.countDown();
        ArrayList arrayList = this.f6654e;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((C0953g.a) arrayList.get(i4)).a(this.f6657h);
        }
        arrayList.clear();
    }

    public final void g() {
        boolean z4 = true;
        if (!this.f6661l && !((Boolean) f6649m.get()).booleanValue()) {
            z4 = false;
        }
        this.f6661l = z4;
    }
}
