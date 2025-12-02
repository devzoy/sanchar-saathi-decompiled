package com.amolg.flutterbarcodescanner;

import S1.e;
import T1.b;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;
import com.amolg.flutterbarcodescanner.a;
import com.amolg.flutterbarcodescanner.camera.CameraSourcePreview;
import com.amolg.flutterbarcodescanner.camera.GraphicOverlay;
import com.google.android.material.snackbar.Snackbar;
import e1.C0588a;
import e1.C0589b;
import e1.C0590c;
import e1.C0591d;
import f1.C0620a;
import i.C0675b;
import java.io.IOException;
import java.util.Iterator;
import java.util.Objects;

public final class BarcodeCaptureActivity extends C0675b implements a.b, View.OnClickListener {

    /* renamed from: M  reason: collision with root package name */
    public static d f6511M = d.ALL_FORMATS;

    /* renamed from: N  reason: collision with root package name */
    public static int f6512N = e.QR.ordinal();

    /* renamed from: D  reason: collision with root package name */
    public C0620a f6513D;

    /* renamed from: E  reason: collision with root package name */
    public CameraSourcePreview f6514E;

    /* renamed from: F  reason: collision with root package name */
    public GraphicOverlay f6515F;

    /* renamed from: G  reason: collision with root package name */
    public ScaleGestureDetector f6516G;

    /* renamed from: H  reason: collision with root package name */
    public GestureDetector f6517H;

    /* renamed from: I  reason: collision with root package name */
    public ImageView f6518I;

    /* renamed from: J  reason: collision with root package name */
    public ImageView f6519J;

    /* renamed from: K  reason: collision with root package name */
    public int f6520K = 0;

    /* renamed from: L  reason: collision with root package name */
    public int f6521L = g.OFF.ordinal();

    public class a implements View.OnClickListener {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ Activity f6522c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ String[] f6523d;

        public a(Activity activity, String[] strArr) {
            this.f6522c = activity;
            this.f6523d = strArr;
        }

        public void onClick(View view) {
            G.a.p(this.f6522c, this.f6523d, 2);
        }
    }

    public class b implements DialogInterface.OnClickListener {
        public b() {
        }

        public void onClick(DialogInterface dialogInterface, int i4) {
            BarcodeCaptureActivity.this.finish();
        }
    }

    public class c extends GestureDetector.SimpleOnGestureListener {
        public c() {
        }

        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            return BarcodeCaptureActivity.this.s0(motionEvent.getRawX(), motionEvent.getRawY()) || super.onSingleTapConfirmed(motionEvent);
        }

        public /* synthetic */ c(BarcodeCaptureActivity barcodeCaptureActivity, a aVar) {
            this();
        }
    }

    public enum d {
        ALL_FORMATS,
        ONLY_QR_CODE,
        ONLY_BARCODE
    }

    public enum e {
        QR,
        BARCODE,
        DEFAULT
    }

    public class f implements ScaleGestureDetector.OnScaleGestureListener {
        public f() {
        }

        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            return false;
        }

        public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
            return true;
        }

        public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
            BarcodeCaptureActivity.this.f6513D.p(scaleGestureDetector.getScaleFactor());
        }

        public /* synthetic */ f(BarcodeCaptureActivity barcodeCaptureActivity, a aVar) {
            this();
        }
    }

    public enum g {
        ON,
        OFF
    }

    public static int q0() {
        int i4 = f6511M == d.ONLY_QR_CODE ? 256 : 0;
        if (f6511M == d.ONLY_BARCODE) {
            return 3823;
        }
        return i4;
    }

    public void i(T1.a aVar) {
        if (aVar == null) {
            return;
        }
        if (b.f6552p) {
            b.e(aVar);
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("Barcode", aVar);
        setResult(0, intent);
        finish();
    }

    public void onBackPressed() {
        T1.a aVar = new T1.a();
        aVar.f2856f = "-2";
        aVar.f2857g = "-2";
        b.e(aVar);
        finish();
    }

    public void onClick(View view) {
        int id = view.getId();
        boolean z4 = true;
        if (id == C0591d.f8768c && getPackageManager().hasSystemFeature("android.hardware.camera.flash")) {
            try {
                int i4 = this.f6521L;
                g gVar = g.OFF;
                if (i4 == gVar.ordinal()) {
                    this.f6521L = g.ON.ordinal();
                    this.f6518I.setImageResource(C0590c.f8765b);
                    v0(true);
                    return;
                }
                this.f6521L = gVar.ordinal();
                this.f6518I.setImageResource(C0590c.f8764a);
                v0(false);
            } catch (Exception e4) {
                Toast.makeText(this, "Unable to turn on flash", 0).show();
                Log.e("BarcodeCaptureActivity", "FlashOnFailure: " + e4.getLocalizedMessage());
            }
        } else if (id == C0591d.f8766a) {
            onBackPressed();
        } else if (id == C0591d.f8769d) {
            this.f6520K = this.f6513D.q();
            boolean z5 = this.f6513D.r() != null;
            if (this.f6521L != g.ON.ordinal()) {
                z4 = false;
            }
            p0(z5, z4, r0(this.f6520K));
            u0();
        }
    }

    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        try {
            setContentView(e1.e.f8772a);
            String str2 = "";
            try {
                str = getIntent().getStringExtra("cancelButtonText");
                str2 = getIntent().getStringExtra("cameraFacingText");
            } catch (Exception e4) {
                Log.e("BCActivity:onCreate()", "onCreate: " + e4.getLocalizedMessage());
                str = "Cancel";
            }
            Button button = (Button) findViewById(C0591d.f8766a);
            button.setText(str);
            button.setOnClickListener(this);
            ImageView imageView = (ImageView) findViewById(C0591d.f8768c);
            this.f6518I = imageView;
            imageView.setOnClickListener(this);
            this.f6518I.setVisibility(b.f6551o ? 0 : 8);
            ImageView imageView2 = (ImageView) findViewById(C0591d.f8769d);
            this.f6519J = imageView2;
            imageView2.setOnClickListener(this);
            this.f6514E = (CameraSourcePreview) findViewById(C0591d.f8770e);
            this.f6515F = (GraphicOverlay) findViewById(C0591d.f8767b);
            this.f6520K = Objects.equals(str2, "FRONT") ? 1 : 0;
            if (H.a.a(this, "android.permission.CAMERA") == 0) {
                p0(true, false, this.f6520K);
            } else {
                t0();
            }
            this.f6517H = new GestureDetector(this, new c(this, (a) null));
            this.f6516G = new ScaleGestureDetector(this, new f(this, (a) null));
        } catch (Exception unused) {
        }
    }

    public void onDestroy() {
        super.onDestroy();
        CameraSourcePreview cameraSourcePreview = this.f6514E;
        if (cameraSourcePreview != null) {
            cameraSourcePreview.d();
        }
    }

    public void onPause() {
        super.onPause();
        CameraSourcePreview cameraSourcePreview = this.f6514E;
        if (cameraSourcePreview != null) {
            cameraSourcePreview.h();
        }
    }

    public void onRequestPermissionsResult(int i4, String[] strArr, int[] iArr) {
        if (i4 != 2) {
            super.onRequestPermissionsResult(i4, strArr, iArr);
        } else if (iArr.length == 0 || iArr[0] != 0) {
            new AlertDialog.Builder(this).setTitle("Allow permissions").setMessage(e1.f.f8774b).setPositiveButton(e1.f.f8775c, new b()).show();
        } else {
            p0(true, false, this.f6520K);
        }
    }

    public void onResume() {
        super.onResume();
        u0();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f6516G.onTouchEvent(motionEvent) || this.f6517H.onTouchEvent(motionEvent) || super.onTouchEvent(motionEvent);
    }

    public final void p0(boolean z4, boolean z5, int i4) {
        Context applicationContext = getApplicationContext();
        int intExtra = getIntent().getIntExtra("delayMillis", 0);
        T1.b a4 = new b.a(applicationContext).b(q0()).a();
        Log.d("BarcodeCaptureActivity", "Barcode detector set up:" + intExtra);
        a4.e(new e.a(new C0589b(this.f6515F, this, intExtra)).a());
        String str = null;
        if (!a4.b() && registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.DEVICE_STORAGE_LOW")) != null) {
            Toast.makeText(this, e1.f.f8773a, 1).show();
        }
        C0620a.b c4 = new C0620a.b(getApplicationContext(), a4).b(i4).f(1600, 1024).e(30.0f).c(z5 ? "torch" : null);
        if (z4) {
            str = "continuous-picture";
        }
        C0620a.b d4 = c4.d(str);
        C0620a aVar = this.f6513D;
        if (aVar != null) {
            aVar.B();
            this.f6513D.v();
        }
        this.f6513D = d4.a();
    }

    public final int r0(int i4) {
        return (i4 != 1 && i4 == 0) ? 1 : 0;
    }

    public final boolean s0(float f4, float f5) {
        int[] iArr = new int[2];
        this.f6515F.getLocationOnScreen(iArr);
        float widthScaleFactor = (f4 - ((float) iArr[0])) / this.f6515F.getWidthScaleFactor();
        float heightScaleFactor = (f5 - ((float) iArr[1])) / this.f6515F.getHeightScaleFactor();
        Iterator it = this.f6515F.getGraphics().iterator();
        T1.a aVar = null;
        float f6 = Float.MAX_VALUE;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            T1.a b4 = ((C0588a) it.next()).b();
            if (b4.d().contains((int) widthScaleFactor, (int) heightScaleFactor)) {
                aVar = b4;
                break;
            }
            float centerX = widthScaleFactor - ((float) b4.d().centerX());
            float centerY = heightScaleFactor - ((float) b4.d().centerY());
            float f7 = (centerX * centerX) + (centerY * centerY);
            if (f7 < f6) {
                aVar = b4;
                f6 = f7;
            }
        }
        if (aVar == null) {
            return false;
        }
        Intent intent = new Intent();
        intent.putExtra("Barcode", aVar);
        setResult(0, intent);
        finish();
        return true;
    }

    public final void t0() {
        String[] strArr = {"android.permission.CAMERA"};
        if (!G.a.q(this, "android.permission.CAMERA")) {
            G.a.p(this, strArr, 2);
            return;
        }
        a aVar = new a(this, strArr);
        findViewById(C0591d.f8771f).setOnClickListener(aVar);
        Snackbar.a0(this.f6515F, e1.f.f8776d, -2).d0(e1.f.f8775c, aVar).Q();
    }

    public final void u0() {
        int f4 = u1.d.m().f(getApplicationContext());
        if (f4 != 0) {
            u1.d.m().j(this, f4, 9001).show();
        }
        C0620a aVar = this.f6513D;
        if (aVar != null) {
            try {
                this.f6514E.f(aVar, this.f6515F);
            } catch (IOException unused) {
                this.f6513D.v();
                this.f6513D = null;
            }
        }
        System.gc();
    }

    public final void v0(boolean z4) {
        try {
            if (getPackageManager().hasSystemFeature("android.hardware.camera.flash")) {
                this.f6513D.y(z4 ? "torch" : "off");
            } else {
                Toast.makeText(getBaseContext(), "Unable to access flashlight as flashlight not available", 0).show();
            }
        } catch (Exception unused) {
            Toast.makeText(getBaseContext(), "Unable to access flashlight.", 0).show();
        }
    }
}
