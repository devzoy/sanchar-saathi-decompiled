package com.amolg.flutterbarcodescanner;

import S1.b;
import S1.f;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.amolg.flutterbarcodescanner.camera.GraphicOverlay;
import e1.C0588a;

public class a extends f {

    /* renamed from: a  reason: collision with root package name */
    public GraphicOverlay f6539a;

    /* renamed from: b  reason: collision with root package name */
    public C0588a f6540b;

    /* renamed from: c  reason: collision with root package name */
    public int f6541c;

    /* renamed from: d  reason: collision with root package name */
    public b f6542d;

    /* renamed from: e  reason: collision with root package name */
    public Handler f6543e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f6544f = false;

    /* renamed from: com.amolg.flutterbarcodescanner.a$a  reason: collision with other inner class name */
    public class C0124a implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ T1.a f6545e;

        public C0124a(T1.a aVar) {
            this.f6545e = aVar;
        }

        public void run() {
            a.this.f6542d.i(this.f6545e);
            boolean unused = a.this.f6544f = false;
            Log.d("BarcodeGraphicTracker", "Delay completed, barcode processed");
        }
    }

    public interface b {
        void i(T1.a aVar);
    }

    public a(GraphicOverlay graphicOverlay, C0588a aVar, Context context, int i4) {
        this.f6539a = graphicOverlay;
        this.f6540b = aVar;
        this.f6541c = i4;
        this.f6543e = new Handler(Looper.getMainLooper());
        if (context instanceof b) {
            this.f6542d = (b) context;
            return;
        }
        throw new RuntimeException("Hosting activity must implement BarcodeUpdateListener");
    }

    public void a() {
        this.f6539a.c(this.f6540b);
    }

    public void b(b.a aVar) {
        this.f6539a.c(this.f6540b);
    }

    /* renamed from: g */
    public void c(int i4, T1.a aVar) {
        this.f6540b.c(i4);
        i(aVar);
    }

    /* renamed from: h */
    public void d(b.a aVar, T1.a aVar2) {
        this.f6539a.a(this.f6540b);
        this.f6540b.d(aVar2);
        i(aVar2);
    }

    public final void i(T1.a aVar) {
        if (!this.f6544f) {
            this.f6544f = true;
            Log.d("BarcodeGraphicTracker", "Barcode detected, waiting for " + this.f6541c + "ms");
            this.f6543e.postDelayed(new C0124a(aVar), (long) this.f6541c);
            return;
        }
        Log.d("BarcodeGraphicTracker", "Still waiting, ignoring new detection");
    }
}
