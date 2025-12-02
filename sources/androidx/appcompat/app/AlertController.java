package androidx.appcompat.app;

import S.C;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.widget.b;
import androidx.core.widget.NestedScrollView;
import h.C0645a;
import h.j;
import i.f;
import java.lang.ref.WeakReference;

public class AlertController {

    /* renamed from: A  reason: collision with root package name */
    public NestedScrollView f4059A;

    /* renamed from: B  reason: collision with root package name */
    public int f4060B = 0;

    /* renamed from: C  reason: collision with root package name */
    public Drawable f4061C;

    /* renamed from: D  reason: collision with root package name */
    public ImageView f4062D;

    /* renamed from: E  reason: collision with root package name */
    public TextView f4063E;

    /* renamed from: F  reason: collision with root package name */
    public TextView f4064F;

    /* renamed from: G  reason: collision with root package name */
    public View f4065G;

    /* renamed from: H  reason: collision with root package name */
    public ListAdapter f4066H;

    /* renamed from: I  reason: collision with root package name */
    public int f4067I = -1;

    /* renamed from: J  reason: collision with root package name */
    public int f4068J;

    /* renamed from: K  reason: collision with root package name */
    public int f4069K;

    /* renamed from: L  reason: collision with root package name */
    public int f4070L;

    /* renamed from: M  reason: collision with root package name */
    public int f4071M;

    /* renamed from: N  reason: collision with root package name */
    public int f4072N;

    /* renamed from: O  reason: collision with root package name */
    public int f4073O;

    /* renamed from: P  reason: collision with root package name */
    public boolean f4074P;

    /* renamed from: Q  reason: collision with root package name */
    public int f4075Q = 0;

    /* renamed from: R  reason: collision with root package name */
    public Handler f4076R;

    /* renamed from: S  reason: collision with root package name */
    public final View.OnClickListener f4077S = new a();

    /* renamed from: a  reason: collision with root package name */
    public final Context f4078a;

    /* renamed from: b  reason: collision with root package name */
    public final f f4079b;

    /* renamed from: c  reason: collision with root package name */
    public final Window f4080c;

    /* renamed from: d  reason: collision with root package name */
    public final int f4081d;

    /* renamed from: e  reason: collision with root package name */
    public CharSequence f4082e;

    /* renamed from: f  reason: collision with root package name */
    public CharSequence f4083f;

    /* renamed from: g  reason: collision with root package name */
    public ListView f4084g;

    /* renamed from: h  reason: collision with root package name */
    public View f4085h;

    /* renamed from: i  reason: collision with root package name */
    public int f4086i;

    /* renamed from: j  reason: collision with root package name */
    public int f4087j;

    /* renamed from: k  reason: collision with root package name */
    public int f4088k;

    /* renamed from: l  reason: collision with root package name */
    public int f4089l;

    /* renamed from: m  reason: collision with root package name */
    public int f4090m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f4091n = false;

    /* renamed from: o  reason: collision with root package name */
    public Button f4092o;

    /* renamed from: p  reason: collision with root package name */
    public CharSequence f4093p;

    /* renamed from: q  reason: collision with root package name */
    public Message f4094q;

    /* renamed from: r  reason: collision with root package name */
    public Drawable f4095r;

    /* renamed from: s  reason: collision with root package name */
    public Button f4096s;

    /* renamed from: t  reason: collision with root package name */
    public CharSequence f4097t;

    /* renamed from: u  reason: collision with root package name */
    public Message f4098u;

    /* renamed from: v  reason: collision with root package name */
    public Drawable f4099v;

    /* renamed from: w  reason: collision with root package name */
    public Button f4100w;

    /* renamed from: x  reason: collision with root package name */
    public CharSequence f4101x;

    /* renamed from: y  reason: collision with root package name */
    public Message f4102y;

    /* renamed from: z  reason: collision with root package name */
    public Drawable f4103z;

    public static class RecycleListView extends ListView {

        /* renamed from: c  reason: collision with root package name */
        public final int f4104c;

        /* renamed from: d  reason: collision with root package name */
        public final int f4105d;

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.f9478f2);
            this.f4105d = obtainStyledAttributes.getDimensionPixelOffset(j.f9483g2, -1);
            this.f4104c = obtainStyledAttributes.getDimensionPixelOffset(j.f9488h2, -1);
        }

        public void a(boolean z4, boolean z5) {
            if (!z5 || !z4) {
                setPadding(getPaddingLeft(), z4 ? getPaddingTop() : this.f4104c, getPaddingRight(), z5 ? getPaddingBottom() : this.f4105d);
            }
        }
    }

    public class a implements View.OnClickListener {
        public a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
            r3 = r0.f4102y;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onClick(android.view.View r3) {
            /*
                r2 = this;
                androidx.appcompat.app.AlertController r0 = androidx.appcompat.app.AlertController.this
                android.widget.Button r1 = r0.f4092o
                if (r3 != r1) goto L_0x000f
                android.os.Message r1 = r0.f4094q
                if (r1 == 0) goto L_0x000f
                android.os.Message r3 = android.os.Message.obtain(r1)
                goto L_0x002a
            L_0x000f:
                android.widget.Button r1 = r0.f4096s
                if (r3 != r1) goto L_0x001c
                android.os.Message r1 = r0.f4098u
                if (r1 == 0) goto L_0x001c
                android.os.Message r3 = android.os.Message.obtain(r1)
                goto L_0x002a
            L_0x001c:
                android.widget.Button r1 = r0.f4100w
                if (r3 != r1) goto L_0x0029
                android.os.Message r3 = r0.f4102y
                if (r3 == 0) goto L_0x0029
                android.os.Message r3 = android.os.Message.obtain(r3)
                goto L_0x002a
            L_0x0029:
                r3 = 0
            L_0x002a:
                if (r3 == 0) goto L_0x002f
                r3.sendToTarget()
            L_0x002f:
                androidx.appcompat.app.AlertController r3 = androidx.appcompat.app.AlertController.this
                android.os.Handler r0 = r3.f4076R
                r1 = 1
                i.f r3 = r3.f4079b
                android.os.Message r3 = r0.obtainMessage(r1, r3)
                r3.sendToTarget()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AlertController.a.onClick(android.view.View):void");
        }
    }

    public static class b {

        /* renamed from: A  reason: collision with root package name */
        public int f4107A;

        /* renamed from: B  reason: collision with root package name */
        public int f4108B;

        /* renamed from: C  reason: collision with root package name */
        public int f4109C;

        /* renamed from: D  reason: collision with root package name */
        public int f4110D;

        /* renamed from: E  reason: collision with root package name */
        public boolean f4111E = false;

        /* renamed from: F  reason: collision with root package name */
        public boolean[] f4112F;

        /* renamed from: G  reason: collision with root package name */
        public boolean f4113G;

        /* renamed from: H  reason: collision with root package name */
        public boolean f4114H;

        /* renamed from: I  reason: collision with root package name */
        public int f4115I = -1;

        /* renamed from: J  reason: collision with root package name */
        public DialogInterface.OnMultiChoiceClickListener f4116J;

        /* renamed from: K  reason: collision with root package name */
        public Cursor f4117K;

        /* renamed from: L  reason: collision with root package name */
        public String f4118L;

        /* renamed from: M  reason: collision with root package name */
        public String f4119M;

        /* renamed from: N  reason: collision with root package name */
        public AdapterView.OnItemSelectedListener f4120N;

        /* renamed from: O  reason: collision with root package name */
        public boolean f4121O = true;

        /* renamed from: a  reason: collision with root package name */
        public final Context f4122a;

        /* renamed from: b  reason: collision with root package name */
        public final LayoutInflater f4123b;

        /* renamed from: c  reason: collision with root package name */
        public int f4124c = 0;

        /* renamed from: d  reason: collision with root package name */
        public Drawable f4125d;

        /* renamed from: e  reason: collision with root package name */
        public int f4126e = 0;

        /* renamed from: f  reason: collision with root package name */
        public CharSequence f4127f;

        /* renamed from: g  reason: collision with root package name */
        public View f4128g;

        /* renamed from: h  reason: collision with root package name */
        public CharSequence f4129h;

        /* renamed from: i  reason: collision with root package name */
        public CharSequence f4130i;

        /* renamed from: j  reason: collision with root package name */
        public Drawable f4131j;

        /* renamed from: k  reason: collision with root package name */
        public DialogInterface.OnClickListener f4132k;

        /* renamed from: l  reason: collision with root package name */
        public CharSequence f4133l;

        /* renamed from: m  reason: collision with root package name */
        public Drawable f4134m;

        /* renamed from: n  reason: collision with root package name */
        public DialogInterface.OnClickListener f4135n;

        /* renamed from: o  reason: collision with root package name */
        public CharSequence f4136o;

        /* renamed from: p  reason: collision with root package name */
        public Drawable f4137p;

        /* renamed from: q  reason: collision with root package name */
        public DialogInterface.OnClickListener f4138q;

        /* renamed from: r  reason: collision with root package name */
        public boolean f4139r;

        /* renamed from: s  reason: collision with root package name */
        public DialogInterface.OnCancelListener f4140s;

        /* renamed from: t  reason: collision with root package name */
        public DialogInterface.OnDismissListener f4141t;

        /* renamed from: u  reason: collision with root package name */
        public DialogInterface.OnKeyListener f4142u;

        /* renamed from: v  reason: collision with root package name */
        public CharSequence[] f4143v;

        /* renamed from: w  reason: collision with root package name */
        public ListAdapter f4144w;

        /* renamed from: x  reason: collision with root package name */
        public DialogInterface.OnClickListener f4145x;

        /* renamed from: y  reason: collision with root package name */
        public int f4146y;

        /* renamed from: z  reason: collision with root package name */
        public View f4147z;

        public class a extends ArrayAdapter {

            /* renamed from: c  reason: collision with root package name */
            public final /* synthetic */ RecycleListView f4148c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(Context context, int i4, int i5, CharSequence[] charSequenceArr, RecycleListView recycleListView) {
                super(context, i4, i5, charSequenceArr);
                this.f4148c = recycleListView;
            }

            public View getView(int i4, View view, ViewGroup viewGroup) {
                View view2 = super.getView(i4, view, viewGroup);
                boolean[] zArr = b.this.f4112F;
                if (zArr != null && zArr[i4]) {
                    this.f4148c.setItemChecked(i4, true);
                }
                return view2;
            }
        }

        /* renamed from: androidx.appcompat.app.AlertController$b$b  reason: collision with other inner class name */
        public class C0081b extends CursorAdapter {

            /* renamed from: c  reason: collision with root package name */
            public final int f4150c;

            /* renamed from: d  reason: collision with root package name */
            public final int f4151d;

            /* renamed from: e  reason: collision with root package name */
            public final /* synthetic */ RecycleListView f4152e;

            /* renamed from: f  reason: collision with root package name */
            public final /* synthetic */ AlertController f4153f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0081b(Context context, Cursor cursor, boolean z4, RecycleListView recycleListView, AlertController alertController) {
                super(context, cursor, z4);
                this.f4152e = recycleListView;
                this.f4153f = alertController;
                Cursor cursor2 = getCursor();
                this.f4150c = cursor2.getColumnIndexOrThrow(b.this.f4118L);
                this.f4151d = cursor2.getColumnIndexOrThrow(b.this.f4119M);
            }

            public void bindView(View view, Context context, Cursor cursor) {
                ((CheckedTextView) view.findViewById(16908308)).setText(cursor.getString(this.f4150c));
                RecycleListView recycleListView = this.f4152e;
                int position = cursor.getPosition();
                boolean z4 = true;
                if (cursor.getInt(this.f4151d) != 1) {
                    z4 = false;
                }
                recycleListView.setItemChecked(position, z4);
            }

            public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                return b.this.f4123b.inflate(this.f4153f.f4071M, viewGroup, false);
            }
        }

        public class c implements AdapterView.OnItemClickListener {

            /* renamed from: c  reason: collision with root package name */
            public final /* synthetic */ AlertController f4155c;

            public c(AlertController alertController) {
                this.f4155c = alertController;
            }

            public void onItemClick(AdapterView adapterView, View view, int i4, long j4) {
                b.this.f4145x.onClick(this.f4155c.f4079b, i4);
                if (!b.this.f4114H) {
                    this.f4155c.f4079b.dismiss();
                }
            }
        }

        public class d implements AdapterView.OnItemClickListener {

            /* renamed from: c  reason: collision with root package name */
            public final /* synthetic */ RecycleListView f4157c;

            /* renamed from: d  reason: collision with root package name */
            public final /* synthetic */ AlertController f4158d;

            public d(RecycleListView recycleListView, AlertController alertController) {
                this.f4157c = recycleListView;
                this.f4158d = alertController;
            }

            public void onItemClick(AdapterView adapterView, View view, int i4, long j4) {
                boolean[] zArr = b.this.f4112F;
                if (zArr != null) {
                    zArr[i4] = this.f4157c.isItemChecked(i4);
                }
                b.this.f4116J.onClick(this.f4158d.f4079b, i4, this.f4157c.isItemChecked(i4));
            }
        }

        public b(Context context) {
            this.f4122a = context;
            this.f4139r = true;
            this.f4123b = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        public void a(AlertController alertController) {
            View view = this.f4128g;
            if (view != null) {
                alertController.k(view);
            } else {
                CharSequence charSequence = this.f4127f;
                if (charSequence != null) {
                    alertController.p(charSequence);
                }
                Drawable drawable = this.f4125d;
                if (drawable != null) {
                    alertController.m(drawable);
                }
                int i4 = this.f4124c;
                if (i4 != 0) {
                    alertController.l(i4);
                }
                int i5 = this.f4126e;
                if (i5 != 0) {
                    alertController.l(alertController.c(i5));
                }
            }
            CharSequence charSequence2 = this.f4129h;
            if (charSequence2 != null) {
                alertController.n(charSequence2);
            }
            CharSequence charSequence3 = this.f4130i;
            if (!(charSequence3 == null && this.f4131j == null)) {
                alertController.j(-1, charSequence3, this.f4132k, (Message) null, this.f4131j);
            }
            CharSequence charSequence4 = this.f4133l;
            if (!(charSequence4 == null && this.f4134m == null)) {
                alertController.j(-2, charSequence4, this.f4135n, (Message) null, this.f4134m);
            }
            CharSequence charSequence5 = this.f4136o;
            if (!(charSequence5 == null && this.f4137p == null)) {
                alertController.j(-3, charSequence5, this.f4138q, (Message) null, this.f4137p);
            }
            if (!(this.f4143v == null && this.f4117K == null && this.f4144w == null)) {
                b(alertController);
            }
            View view2 = this.f4147z;
            if (view2 == null) {
                int i6 = this.f4146y;
                if (i6 != 0) {
                    alertController.q(i6);
                }
            } else if (this.f4111E) {
                alertController.s(view2, this.f4107A, this.f4108B, this.f4109C, this.f4110D);
            } else {
                alertController.r(view2);
            }
        }

        /* JADX WARNING: type inference failed for: r8v0, types: [android.widget.ListAdapter] */
        /* JADX WARNING: type inference failed for: r8v3 */
        /* JADX WARNING: type inference failed for: r8v4 */
        /* JADX WARNING: type inference failed for: r2v5, types: [android.widget.SimpleCursorAdapter] */
        /* JADX WARNING: type inference failed for: r1v22, types: [androidx.appcompat.app.AlertController$b$b] */
        /* JADX WARNING: type inference failed for: r1v23, types: [androidx.appcompat.app.AlertController$b$a] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(androidx.appcompat.app.AlertController r10) {
            /*
                r9 = this;
                android.view.LayoutInflater r0 = r9.f4123b
                int r1 = r10.f4070L
                r2 = 0
                android.view.View r0 = r0.inflate(r1, r2)
                androidx.appcompat.app.AlertController$RecycleListView r0 = (androidx.appcompat.app.AlertController.RecycleListView) r0
                boolean r1 = r9.f4113G
                if (r1 == 0) goto L_0x0034
                android.database.Cursor r1 = r9.f4117K
                if (r1 != 0) goto L_0x0025
                androidx.appcompat.app.AlertController$b$a r8 = new androidx.appcompat.app.AlertController$b$a
                android.content.Context r3 = r9.f4122a
                int r4 = r10.f4071M
                r5 = 16908308(0x1020014, float:2.3877285E-38)
                java.lang.CharSequence[] r6 = r9.f4143v
                r1 = r8
                r2 = r9
                r7 = r0
                r1.<init>(r3, r4, r5, r6, r7)
                goto L_0x0069
            L_0x0025:
                androidx.appcompat.app.AlertController$b$b r8 = new androidx.appcompat.app.AlertController$b$b
                android.content.Context r3 = r9.f4122a
                android.database.Cursor r4 = r9.f4117K
                r5 = 0
                r1 = r8
                r2 = r9
                r6 = r0
                r7 = r10
                r1.<init>(r3, r4, r5, r6, r7)
                goto L_0x0069
            L_0x0034:
                boolean r1 = r9.f4114H
                if (r1 == 0) goto L_0x003c
                int r1 = r10.f4072N
            L_0x003a:
                r4 = r1
                goto L_0x003f
            L_0x003c:
                int r1 = r10.f4073O
                goto L_0x003a
            L_0x003f:
                android.database.Cursor r1 = r9.f4117K
                r2 = 16908308(0x1020014, float:2.3877285E-38)
                if (r1 == 0) goto L_0x005b
                android.widget.SimpleCursorAdapter r8 = new android.widget.SimpleCursorAdapter
                android.content.Context r3 = r9.f4122a
                android.database.Cursor r5 = r9.f4117K
                java.lang.String r1 = r9.f4118L
                java.lang.String[] r6 = new java.lang.String[]{r1}
                int[] r7 = new int[]{r2}
                r2 = r8
                r2.<init>(r3, r4, r5, r6, r7)
                goto L_0x0069
            L_0x005b:
                android.widget.ListAdapter r8 = r9.f4144w
                if (r8 == 0) goto L_0x0060
                goto L_0x0069
            L_0x0060:
                androidx.appcompat.app.AlertController$d r8 = new androidx.appcompat.app.AlertController$d
                android.content.Context r1 = r9.f4122a
                java.lang.CharSequence[] r3 = r9.f4143v
                r8.<init>(r1, r4, r2, r3)
            L_0x0069:
                r10.f4066H = r8
                int r1 = r9.f4115I
                r10.f4067I = r1
                android.content.DialogInterface$OnClickListener r1 = r9.f4145x
                if (r1 == 0) goto L_0x007c
                androidx.appcompat.app.AlertController$b$c r1 = new androidx.appcompat.app.AlertController$b$c
                r1.<init>(r10)
                r0.setOnItemClickListener(r1)
                goto L_0x0088
            L_0x007c:
                android.content.DialogInterface$OnMultiChoiceClickListener r1 = r9.f4116J
                if (r1 == 0) goto L_0x0088
                androidx.appcompat.app.AlertController$b$d r1 = new androidx.appcompat.app.AlertController$b$d
                r1.<init>(r0, r10)
                r0.setOnItemClickListener(r1)
            L_0x0088:
                android.widget.AdapterView$OnItemSelectedListener r1 = r9.f4120N
                if (r1 == 0) goto L_0x008f
                r0.setOnItemSelectedListener(r1)
            L_0x008f:
                boolean r1 = r9.f4114H
                if (r1 == 0) goto L_0x0098
                r1 = 1
                r0.setChoiceMode(r1)
                goto L_0x00a0
            L_0x0098:
                boolean r1 = r9.f4113G
                if (r1 == 0) goto L_0x00a0
                r1 = 2
                r0.setChoiceMode(r1)
            L_0x00a0:
                r10.f4084g = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AlertController.b.b(androidx.appcompat.app.AlertController):void");
        }
    }

    public static final class c extends Handler {

        /* renamed from: a  reason: collision with root package name */
        public WeakReference f4160a;

        public c(DialogInterface dialogInterface) {
            this.f4160a = new WeakReference(dialogInterface);
        }

        public void handleMessage(Message message) {
            int i4 = message.what;
            if (i4 == -3 || i4 == -2 || i4 == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.f4160a.get(), message.what);
            } else if (i4 == 1) {
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    public static class d extends ArrayAdapter {
        public d(Context context, int i4, int i5, CharSequence[] charSequenceArr) {
            super(context, i4, i5, charSequenceArr);
        }

        public long getItemId(int i4) {
            return (long) i4;
        }

        public boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, f fVar, Window window) {
        this.f4078a = context;
        this.f4079b = fVar;
        this.f4080c = window;
        this.f4076R = new c(fVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, j.f9354F, C0645a.f9177k, 0);
        this.f4068J = obtainStyledAttributes.getResourceId(j.f9359G, 0);
        this.f4069K = obtainStyledAttributes.getResourceId(j.f9369I, 0);
        this.f4070L = obtainStyledAttributes.getResourceId(j.f9379K, 0);
        this.f4071M = obtainStyledAttributes.getResourceId(j.f9384L, 0);
        this.f4072N = obtainStyledAttributes.getResourceId(j.f9394N, 0);
        this.f4073O = obtainStyledAttributes.getResourceId(j.f9374J, 0);
        this.f4074P = obtainStyledAttributes.getBoolean(j.f9389M, true);
        this.f4081d = obtainStyledAttributes.getDimensionPixelSize(j.f9364H, 0);
        obtainStyledAttributes.recycle();
        fVar.d(1);
    }

    public static boolean a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    public static boolean y(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C0645a.f9176j, typedValue, true);
        return typedValue.data != 0;
    }

    public final void b(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    public int c(int i4) {
        TypedValue typedValue = new TypedValue();
        this.f4078a.getTheme().resolveAttribute(i4, typedValue, true);
        return typedValue.resourceId;
    }

    public ListView d() {
        return this.f4084g;
    }

    public void e() {
        this.f4079b.setContentView(i());
        x();
    }

    public boolean f(int i4, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f4059A;
        return nestedScrollView != null && nestedScrollView.t(keyEvent);
    }

    public boolean g(int i4, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f4059A;
        return nestedScrollView != null && nestedScrollView.t(keyEvent);
    }

    public final ViewGroup h(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    public final int i() {
        int i4 = this.f4069K;
        return i4 == 0 ? this.f4068J : this.f4075Q == 1 ? i4 : this.f4068J;
    }

    public void j(int i4, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (message == null && onClickListener != null) {
            message = this.f4076R.obtainMessage(i4, onClickListener);
        }
        if (i4 == -3) {
            this.f4101x = charSequence;
            this.f4102y = message;
            this.f4103z = drawable;
        } else if (i4 == -2) {
            this.f4097t = charSequence;
            this.f4098u = message;
            this.f4099v = drawable;
        } else if (i4 == -1) {
            this.f4093p = charSequence;
            this.f4094q = message;
            this.f4095r = drawable;
        } else {
            throw new IllegalArgumentException("Button does not exist");
        }
    }

    public void k(View view) {
        this.f4065G = view;
    }

    public void l(int i4) {
        this.f4061C = null;
        this.f4060B = i4;
        ImageView imageView = this.f4062D;
        if (imageView == null) {
            return;
        }
        if (i4 != 0) {
            imageView.setVisibility(0);
            this.f4062D.setImageResource(this.f4060B);
            return;
        }
        imageView.setVisibility(8);
    }

    public void m(Drawable drawable) {
        this.f4061C = drawable;
        this.f4060B = 0;
        ImageView imageView = this.f4062D;
        if (imageView == null) {
            return;
        }
        if (drawable != null) {
            imageView.setVisibility(0);
            this.f4062D.setImageDrawable(drawable);
            return;
        }
        imageView.setVisibility(8);
    }

    public void n(CharSequence charSequence) {
        this.f4083f = charSequence;
        TextView textView = this.f4064F;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public final void o(ViewGroup viewGroup, View view, int i4, int i5) {
        View findViewById = this.f4080c.findViewById(h.f.f9289u);
        View findViewById2 = this.f4080c.findViewById(h.f.f9288t);
        C.v0(view, i4, i5);
        if (findViewById != null) {
            viewGroup.removeView(findViewById);
        }
        if (findViewById2 != null) {
            viewGroup.removeView(findViewById2);
        }
    }

    public void p(CharSequence charSequence) {
        this.f4082e = charSequence;
        TextView textView = this.f4063E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void q(int i4) {
        this.f4085h = null;
        this.f4086i = i4;
        this.f4091n = false;
    }

    public void r(View view) {
        this.f4085h = view;
        this.f4086i = 0;
        this.f4091n = false;
    }

    public void s(View view, int i4, int i5, int i6, int i7) {
        this.f4085h = view;
        this.f4086i = 0;
        this.f4091n = true;
        this.f4087j = i4;
        this.f4088k = i5;
        this.f4089l = i6;
        this.f4090m = i7;
    }

    public final void t(ViewGroup viewGroup) {
        boolean z4;
        Button button = (Button) viewGroup.findViewById(16908313);
        this.f4092o = button;
        button.setOnClickListener(this.f4077S);
        if (!TextUtils.isEmpty(this.f4093p) || this.f4095r != null) {
            this.f4092o.setText(this.f4093p);
            Drawable drawable = this.f4095r;
            if (drawable != null) {
                int i4 = this.f4081d;
                drawable.setBounds(0, 0, i4, i4);
                this.f4092o.setCompoundDrawables(this.f4095r, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            this.f4092o.setVisibility(0);
            z4 = true;
        } else {
            this.f4092o.setVisibility(8);
            z4 = false;
        }
        Button button2 = (Button) viewGroup.findViewById(16908314);
        this.f4096s = button2;
        button2.setOnClickListener(this.f4077S);
        if (!TextUtils.isEmpty(this.f4097t) || this.f4099v != null) {
            this.f4096s.setText(this.f4097t);
            Drawable drawable2 = this.f4099v;
            if (drawable2 != null) {
                int i5 = this.f4081d;
                drawable2.setBounds(0, 0, i5, i5);
                this.f4096s.setCompoundDrawables(this.f4099v, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            this.f4096s.setVisibility(0);
            z4 |= true;
        } else {
            this.f4096s.setVisibility(8);
        }
        Button button3 = (Button) viewGroup.findViewById(16908315);
        this.f4100w = button3;
        button3.setOnClickListener(this.f4077S);
        if (!TextUtils.isEmpty(this.f4101x) || this.f4103z != null) {
            this.f4100w.setText(this.f4101x);
            Drawable drawable3 = this.f4103z;
            if (drawable3 != null) {
                int i6 = this.f4081d;
                drawable3.setBounds(0, 0, i6, i6);
                this.f4100w.setCompoundDrawables(this.f4103z, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            this.f4100w.setVisibility(0);
            z4 |= true;
        } else {
            this.f4100w.setVisibility(8);
        }
        if (y(this.f4078a)) {
            if (z4) {
                b(this.f4092o);
            } else if (z4) {
                b(this.f4096s);
            } else if (z4) {
                b(this.f4100w);
            }
        }
        if (!z4) {
            viewGroup.setVisibility(8);
        }
    }

    public final void u(ViewGroup viewGroup) {
        NestedScrollView nestedScrollView = (NestedScrollView) this.f4080c.findViewById(h.f.f9290v);
        this.f4059A = nestedScrollView;
        nestedScrollView.setFocusable(false);
        this.f4059A.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroup.findViewById(16908299);
        this.f4064F = textView;
        if (textView != null) {
            CharSequence charSequence = this.f4083f;
            if (charSequence != null) {
                textView.setText(charSequence);
                return;
            }
            textView.setVisibility(8);
            this.f4059A.removeView(this.f4064F);
            if (this.f4084g != null) {
                ViewGroup viewGroup2 = (ViewGroup) this.f4059A.getParent();
                int indexOfChild = viewGroup2.indexOfChild(this.f4059A);
                viewGroup2.removeViewAt(indexOfChild);
                viewGroup2.addView(this.f4084g, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
                return;
            }
            viewGroup.setVisibility(8);
        }
    }

    public final void v(ViewGroup viewGroup) {
        View view = this.f4085h;
        boolean z4 = false;
        if (view == null) {
            view = this.f4086i != 0 ? LayoutInflater.from(this.f4078a).inflate(this.f4086i, viewGroup, false) : null;
        }
        if (view != null) {
            z4 = true;
        }
        if (!z4 || !a(view)) {
            this.f4080c.setFlags(131072, 131072);
        }
        if (z4) {
            FrameLayout frameLayout = (FrameLayout) this.f4080c.findViewById(h.f.f9282n);
            frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
            if (this.f4091n) {
                frameLayout.setPadding(this.f4087j, this.f4088k, this.f4089l, this.f4090m);
            }
            if (this.f4084g != null) {
                ((b.a) viewGroup.getLayoutParams()).f4663a = 0.0f;
                return;
            }
            return;
        }
        viewGroup.setVisibility(8);
    }

    public final void w(ViewGroup viewGroup) {
        if (this.f4065G != null) {
            viewGroup.addView(this.f4065G, 0, new ViewGroup.LayoutParams(-1, -2));
            this.f4080c.findViewById(h.f.f9267N).setVisibility(8);
            return;
        }
        this.f4062D = (ImageView) this.f4080c.findViewById(16908294);
        if (TextUtils.isEmpty(this.f4082e) || !this.f4074P) {
            this.f4080c.findViewById(h.f.f9267N).setVisibility(8);
            this.f4062D.setVisibility(8);
            viewGroup.setVisibility(8);
            return;
        }
        TextView textView = (TextView) this.f4080c.findViewById(h.f.f9278j);
        this.f4063E = textView;
        textView.setText(this.f4082e);
        int i4 = this.f4060B;
        if (i4 != 0) {
            this.f4062D.setImageResource(i4);
            return;
        }
        Drawable drawable = this.f4061C;
        if (drawable != null) {
            this.f4062D.setImageDrawable(drawable);
            return;
        }
        this.f4063E.setPadding(this.f4062D.getPaddingLeft(), this.f4062D.getPaddingTop(), this.f4062D.getPaddingRight(), this.f4062D.getPaddingBottom());
        this.f4062D.setVisibility(8);
    }

    public final void x() {
        ListAdapter listAdapter;
        View findViewById;
        View findViewById2;
        View findViewById3 = this.f4080c.findViewById(h.f.f9287s);
        View findViewById4 = findViewById3.findViewById(h.f.f9268O);
        View findViewById5 = findViewById3.findViewById(h.f.f9281m);
        View findViewById6 = findViewById3.findViewById(h.f.f9279k);
        ViewGroup viewGroup = (ViewGroup) findViewById3.findViewById(h.f.f9283o);
        v(viewGroup);
        View findViewById7 = viewGroup.findViewById(h.f.f9268O);
        View findViewById8 = viewGroup.findViewById(h.f.f9281m);
        View findViewById9 = viewGroup.findViewById(h.f.f9279k);
        ViewGroup h4 = h(findViewById7, findViewById4);
        ViewGroup h5 = h(findViewById8, findViewById5);
        ViewGroup h6 = h(findViewById9, findViewById6);
        u(h5);
        t(h6);
        w(h4);
        char c4 = 0;
        boolean z4 = viewGroup.getVisibility() != 8;
        boolean z5 = (h4 == null || h4.getVisibility() == 8) ? false : true;
        boolean z6 = (h6 == null || h6.getVisibility() == 8) ? false : true;
        if (!(z6 || h5 == null || (findViewById2 = h5.findViewById(h.f.f9263J)) == null)) {
            findViewById2.setVisibility(0);
        }
        if (z5) {
            NestedScrollView nestedScrollView = this.f4059A;
            if (nestedScrollView != null) {
                nestedScrollView.setClipToPadding(true);
            }
            View findViewById10 = (this.f4083f == null && this.f4084g == null) ? null : h4.findViewById(h.f.f9266M);
            if (findViewById10 != null) {
                findViewById10.setVisibility(0);
            }
        } else if (!(h5 == null || (findViewById = h5.findViewById(h.f.f9264K)) == null)) {
            findViewById.setVisibility(0);
        }
        ListView listView = this.f4084g;
        if (listView instanceof RecycleListView) {
            ((RecycleListView) listView).a(z5, z6);
        }
        if (!z4) {
            View view = this.f4084g;
            if (view == null) {
                view = this.f4059A;
            }
            if (view != null) {
                if (z6) {
                    c4 = 2;
                }
                o(h5, view, z5 | c4 ? 1 : 0, 3);
            }
        }
        ListView listView2 = this.f4084g;
        if (listView2 != null && (listAdapter = this.f4066H) != null) {
            listView2.setAdapter(listAdapter);
            int i4 = this.f4067I;
            if (i4 > -1) {
                listView2.setItemChecked(i4, true);
                listView2.setSelection(i4);
            }
        }
    }
}
