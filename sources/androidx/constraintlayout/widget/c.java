package androidx.constraintlayout.widget;

import Q0.i;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import net.sqlcipher.IBulkCursor;
import net.sqlcipher.database.SQLiteDatabase;
import org.xmlpull.v1.XmlPullParserException;
import x.C0994a;
import y.C1004a;

public class c {

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f4816d = {0, 4, 8};

    /* renamed from: e  reason: collision with root package name */
    public static SparseIntArray f4817e;

    /* renamed from: a  reason: collision with root package name */
    public HashMap f4818a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public boolean f4819b = true;

    /* renamed from: c  reason: collision with root package name */
    public HashMap f4820c = new HashMap();

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f4821a;

        /* renamed from: b  reason: collision with root package name */
        public final d f4822b = new d();

        /* renamed from: c  reason: collision with root package name */
        public final C0087c f4823c = new C0087c();

        /* renamed from: d  reason: collision with root package name */
        public final b f4824d = new b();

        /* renamed from: e  reason: collision with root package name */
        public final e f4825e = new e();

        /* renamed from: f  reason: collision with root package name */
        public HashMap f4826f = new HashMap();

        public void b(ConstraintLayout.b bVar) {
            b bVar2 = this.f4824d;
            bVar.f4748d = bVar2.f4868h;
            bVar.f4750e = bVar2.f4870i;
            bVar.f4752f = bVar2.f4872j;
            bVar.f4754g = bVar2.f4874k;
            bVar.f4756h = bVar2.f4875l;
            bVar.f4758i = bVar2.f4876m;
            bVar.f4760j = bVar2.f4877n;
            bVar.f4762k = bVar2.f4878o;
            bVar.f4764l = bVar2.f4879p;
            bVar.f4772p = bVar2.f4880q;
            bVar.f4773q = bVar2.f4881r;
            bVar.f4774r = bVar2.f4882s;
            bVar.f4775s = bVar2.f4883t;
            bVar.leftMargin = bVar2.f4831D;
            bVar.rightMargin = bVar2.f4832E;
            bVar.topMargin = bVar2.f4833F;
            bVar.bottomMargin = bVar2.f4834G;
            bVar.f4780x = bVar2.f4842O;
            bVar.f4781y = bVar2.f4841N;
            bVar.f4777u = bVar2.f4838K;
            bVar.f4779w = bVar2.f4840M;
            bVar.f4782z = bVar2.f4884u;
            bVar.f4716A = bVar2.f4885v;
            bVar.f4766m = bVar2.f4887x;
            bVar.f4768n = bVar2.f4888y;
            bVar.f4770o = bVar2.f4889z;
            bVar.f4717B = bVar2.f4886w;
            bVar.f4732Q = bVar2.f4828A;
            bVar.f4733R = bVar2.f4829B;
            bVar.f4721F = bVar2.f4843P;
            bVar.f4720E = bVar2.f4844Q;
            bVar.f4723H = bVar2.f4846S;
            bVar.f4722G = bVar2.f4845R;
            bVar.f4735T = bVar2.f4869h0;
            bVar.f4736U = bVar2.f4871i0;
            bVar.f4724I = bVar2.f4847T;
            bVar.f4725J = bVar2.f4848U;
            bVar.f4728M = bVar2.f4849V;
            bVar.f4729N = bVar2.f4850W;
            bVar.f4726K = bVar2.f4851X;
            bVar.f4727L = bVar2.f4852Y;
            bVar.f4730O = bVar2.f4853Z;
            bVar.f4731P = bVar2.f4855a0;
            bVar.f4734S = bVar2.f4830C;
            bVar.f4746c = bVar2.f4866g;
            bVar.f4742a = bVar2.f4862e;
            bVar.f4744b = bVar2.f4864f;
            bVar.width = bVar2.f4858c;
            bVar.height = bVar2.f4860d;
            String str = bVar2.f4867g0;
            if (str != null) {
                bVar.f4737V = str;
            }
            bVar.setMarginStart(bVar2.f4836I);
            bVar.setMarginEnd(this.f4824d.f4835H);
            bVar.a();
        }

        /* renamed from: c */
        public a clone() {
            a aVar = new a();
            aVar.f4824d.a(this.f4824d);
            aVar.f4823c.a(this.f4823c);
            aVar.f4822b.a(this.f4822b);
            aVar.f4825e.a(this.f4825e);
            aVar.f4821a = this.f4821a;
            return aVar;
        }

        public final void d(int i4, ConstraintLayout.b bVar) {
            this.f4821a = i4;
            b bVar2 = this.f4824d;
            bVar2.f4868h = bVar.f4748d;
            bVar2.f4870i = bVar.f4750e;
            bVar2.f4872j = bVar.f4752f;
            bVar2.f4874k = bVar.f4754g;
            bVar2.f4875l = bVar.f4756h;
            bVar2.f4876m = bVar.f4758i;
            bVar2.f4877n = bVar.f4760j;
            bVar2.f4878o = bVar.f4762k;
            bVar2.f4879p = bVar.f4764l;
            bVar2.f4880q = bVar.f4772p;
            bVar2.f4881r = bVar.f4773q;
            bVar2.f4882s = bVar.f4774r;
            bVar2.f4883t = bVar.f4775s;
            bVar2.f4884u = bVar.f4782z;
            bVar2.f4885v = bVar.f4716A;
            bVar2.f4886w = bVar.f4717B;
            bVar2.f4887x = bVar.f4766m;
            bVar2.f4888y = bVar.f4768n;
            bVar2.f4889z = bVar.f4770o;
            bVar2.f4828A = bVar.f4732Q;
            bVar2.f4829B = bVar.f4733R;
            bVar2.f4830C = bVar.f4734S;
            bVar2.f4866g = bVar.f4746c;
            bVar2.f4862e = bVar.f4742a;
            bVar2.f4864f = bVar.f4744b;
            bVar2.f4858c = bVar.width;
            bVar2.f4860d = bVar.height;
            bVar2.f4831D = bVar.leftMargin;
            bVar2.f4832E = bVar.rightMargin;
            bVar2.f4833F = bVar.topMargin;
            bVar2.f4834G = bVar.bottomMargin;
            bVar2.f4843P = bVar.f4721F;
            bVar2.f4844Q = bVar.f4720E;
            bVar2.f4846S = bVar.f4723H;
            bVar2.f4845R = bVar.f4722G;
            bVar2.f4869h0 = bVar.f4735T;
            bVar2.f4871i0 = bVar.f4736U;
            bVar2.f4847T = bVar.f4724I;
            bVar2.f4848U = bVar.f4725J;
            bVar2.f4849V = bVar.f4728M;
            bVar2.f4850W = bVar.f4729N;
            bVar2.f4851X = bVar.f4726K;
            bVar2.f4852Y = bVar.f4727L;
            bVar2.f4853Z = bVar.f4730O;
            bVar2.f4855a0 = bVar.f4731P;
            bVar2.f4867g0 = bVar.f4737V;
            bVar2.f4838K = bVar.f4777u;
            bVar2.f4840M = bVar.f4779w;
            bVar2.f4837J = bVar.f4776t;
            bVar2.f4839L = bVar.f4778v;
            bVar2.f4842O = bVar.f4780x;
            bVar2.f4841N = bVar.f4781y;
            bVar2.f4835H = bVar.getMarginEnd();
            this.f4824d.f4836I = bVar.getMarginStart();
        }
    }

    public static class b {

        /* renamed from: k0  reason: collision with root package name */
        public static SparseIntArray f4827k0;

        /* renamed from: A  reason: collision with root package name */
        public int f4828A = -1;

        /* renamed from: B  reason: collision with root package name */
        public int f4829B = -1;

        /* renamed from: C  reason: collision with root package name */
        public int f4830C = -1;

        /* renamed from: D  reason: collision with root package name */
        public int f4831D = -1;

        /* renamed from: E  reason: collision with root package name */
        public int f4832E = -1;

        /* renamed from: F  reason: collision with root package name */
        public int f4833F = -1;

        /* renamed from: G  reason: collision with root package name */
        public int f4834G = -1;

        /* renamed from: H  reason: collision with root package name */
        public int f4835H = -1;

        /* renamed from: I  reason: collision with root package name */
        public int f4836I = -1;

        /* renamed from: J  reason: collision with root package name */
        public int f4837J = -1;

        /* renamed from: K  reason: collision with root package name */
        public int f4838K = -1;

        /* renamed from: L  reason: collision with root package name */
        public int f4839L = -1;

        /* renamed from: M  reason: collision with root package name */
        public int f4840M = -1;

        /* renamed from: N  reason: collision with root package name */
        public int f4841N = -1;

        /* renamed from: O  reason: collision with root package name */
        public int f4842O = -1;

        /* renamed from: P  reason: collision with root package name */
        public float f4843P = -1.0f;

        /* renamed from: Q  reason: collision with root package name */
        public float f4844Q = -1.0f;

        /* renamed from: R  reason: collision with root package name */
        public int f4845R = 0;

        /* renamed from: S  reason: collision with root package name */
        public int f4846S = 0;

        /* renamed from: T  reason: collision with root package name */
        public int f4847T = 0;

        /* renamed from: U  reason: collision with root package name */
        public int f4848U = 0;

        /* renamed from: V  reason: collision with root package name */
        public int f4849V = -1;

        /* renamed from: W  reason: collision with root package name */
        public int f4850W = -1;

        /* renamed from: X  reason: collision with root package name */
        public int f4851X = -1;

        /* renamed from: Y  reason: collision with root package name */
        public int f4852Y = -1;

        /* renamed from: Z  reason: collision with root package name */
        public float f4853Z = 1.0f;

        /* renamed from: a  reason: collision with root package name */
        public boolean f4854a = false;

        /* renamed from: a0  reason: collision with root package name */
        public float f4855a0 = 1.0f;

        /* renamed from: b  reason: collision with root package name */
        public boolean f4856b = false;

        /* renamed from: b0  reason: collision with root package name */
        public int f4857b0 = -1;

        /* renamed from: c  reason: collision with root package name */
        public int f4858c;

        /* renamed from: c0  reason: collision with root package name */
        public int f4859c0 = 0;

        /* renamed from: d  reason: collision with root package name */
        public int f4860d;

        /* renamed from: d0  reason: collision with root package name */
        public int f4861d0 = -1;

        /* renamed from: e  reason: collision with root package name */
        public int f4862e = -1;

        /* renamed from: e0  reason: collision with root package name */
        public int[] f4863e0;

        /* renamed from: f  reason: collision with root package name */
        public int f4864f = -1;

        /* renamed from: f0  reason: collision with root package name */
        public String f4865f0;

        /* renamed from: g  reason: collision with root package name */
        public float f4866g = -1.0f;

        /* renamed from: g0  reason: collision with root package name */
        public String f4867g0;

        /* renamed from: h  reason: collision with root package name */
        public int f4868h = -1;

        /* renamed from: h0  reason: collision with root package name */
        public boolean f4869h0 = false;

        /* renamed from: i  reason: collision with root package name */
        public int f4870i = -1;

        /* renamed from: i0  reason: collision with root package name */
        public boolean f4871i0 = false;

        /* renamed from: j  reason: collision with root package name */
        public int f4872j = -1;

        /* renamed from: j0  reason: collision with root package name */
        public boolean f4873j0 = true;

        /* renamed from: k  reason: collision with root package name */
        public int f4874k = -1;

        /* renamed from: l  reason: collision with root package name */
        public int f4875l = -1;

        /* renamed from: m  reason: collision with root package name */
        public int f4876m = -1;

        /* renamed from: n  reason: collision with root package name */
        public int f4877n = -1;

        /* renamed from: o  reason: collision with root package name */
        public int f4878o = -1;

        /* renamed from: p  reason: collision with root package name */
        public int f4879p = -1;

        /* renamed from: q  reason: collision with root package name */
        public int f4880q = -1;

        /* renamed from: r  reason: collision with root package name */
        public int f4881r = -1;

        /* renamed from: s  reason: collision with root package name */
        public int f4882s = -1;

        /* renamed from: t  reason: collision with root package name */
        public int f4883t = -1;

        /* renamed from: u  reason: collision with root package name */
        public float f4884u = 0.5f;

        /* renamed from: v  reason: collision with root package name */
        public float f4885v = 0.5f;

        /* renamed from: w  reason: collision with root package name */
        public String f4886w = null;

        /* renamed from: x  reason: collision with root package name */
        public int f4887x = -1;

        /* renamed from: y  reason: collision with root package name */
        public int f4888y = 0;

        /* renamed from: z  reason: collision with root package name */
        public float f4889z = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f4827k0 = sparseIntArray;
            sparseIntArray.append(C.d.f477q3, 24);
            f4827k0.append(C.d.f482r3, 25);
            f4827k0.append(C.d.f492t3, 28);
            f4827k0.append(C.d.f497u3, 29);
            f4827k0.append(C.d.f522z3, 35);
            f4827k0.append(C.d.f517y3, 34);
            f4827k0.append(C.d.f402b3, 4);
            f4827k0.append(C.d.f397a3, 3);
            f4827k0.append(C.d.f388Y2, 1);
            f4827k0.append(C.d.f296E3, 6);
            f4827k0.append(C.d.f301F3, 7);
            f4827k0.append(C.d.f437i3, 17);
            f4827k0.append(C.d.f442j3, 18);
            f4827k0.append(C.d.f447k3, 19);
            f4827k0.append(C.d.f320J2, 26);
            f4827k0.append(C.d.f502v3, 31);
            f4827k0.append(C.d.f507w3, 32);
            f4827k0.append(C.d.f432h3, 10);
            f4827k0.append(C.d.f427g3, 9);
            f4827k0.append(C.d.f316I3, 13);
            f4827k0.append(C.d.f331L3, 16);
            f4827k0.append(C.d.f321J3, 14);
            f4827k0.append(C.d.f306G3, 11);
            f4827k0.append(C.d.f326K3, 15);
            f4827k0.append(C.d.f311H3, 12);
            f4827k0.append(C.d.f286C3, 38);
            f4827k0.append(C.d.f467o3, 37);
            f4827k0.append(C.d.f462n3, 39);
            f4827k0.append(C.d.f281B3, 40);
            f4827k0.append(C.d.f457m3, 20);
            f4827k0.append(C.d.f276A3, 36);
            f4827k0.append(C.d.f422f3, 5);
            f4827k0.append(C.d.f472p3, 76);
            f4827k0.append(C.d.f512x3, 76);
            f4827k0.append(C.d.f487s3, 76);
            f4827k0.append(C.d.f392Z2, 76);
            f4827k0.append(C.d.f384X2, 76);
            f4827k0.append(C.d.f335M2, 23);
            f4827k0.append(C.d.f345O2, 27);
            f4827k0.append(C.d.f355Q2, 30);
            f4827k0.append(C.d.f360R2, 8);
            f4827k0.append(C.d.f340N2, 33);
            f4827k0.append(C.d.f350P2, 2);
            f4827k0.append(C.d.f325K2, 22);
            f4827k0.append(C.d.f330L2, 21);
            f4827k0.append(C.d.f407c3, 61);
            f4827k0.append(C.d.f417e3, 62);
            f4827k0.append(C.d.f412d3, 63);
            f4827k0.append(C.d.f291D3, 69);
            f4827k0.append(C.d.f452l3, 70);
            f4827k0.append(C.d.f376V2, 71);
            f4827k0.append(C.d.f368T2, 72);
            f4827k0.append(C.d.f372U2, 73);
            f4827k0.append(C.d.f380W2, 74);
            f4827k0.append(C.d.f364S2, 75);
        }

        public void a(b bVar) {
            this.f4854a = bVar.f4854a;
            this.f4858c = bVar.f4858c;
            this.f4856b = bVar.f4856b;
            this.f4860d = bVar.f4860d;
            this.f4862e = bVar.f4862e;
            this.f4864f = bVar.f4864f;
            this.f4866g = bVar.f4866g;
            this.f4868h = bVar.f4868h;
            this.f4870i = bVar.f4870i;
            this.f4872j = bVar.f4872j;
            this.f4874k = bVar.f4874k;
            this.f4875l = bVar.f4875l;
            this.f4876m = bVar.f4876m;
            this.f4877n = bVar.f4877n;
            this.f4878o = bVar.f4878o;
            this.f4879p = bVar.f4879p;
            this.f4880q = bVar.f4880q;
            this.f4881r = bVar.f4881r;
            this.f4882s = bVar.f4882s;
            this.f4883t = bVar.f4883t;
            this.f4884u = bVar.f4884u;
            this.f4885v = bVar.f4885v;
            this.f4886w = bVar.f4886w;
            this.f4887x = bVar.f4887x;
            this.f4888y = bVar.f4888y;
            this.f4889z = bVar.f4889z;
            this.f4828A = bVar.f4828A;
            this.f4829B = bVar.f4829B;
            this.f4830C = bVar.f4830C;
            this.f4831D = bVar.f4831D;
            this.f4832E = bVar.f4832E;
            this.f4833F = bVar.f4833F;
            this.f4834G = bVar.f4834G;
            this.f4835H = bVar.f4835H;
            this.f4836I = bVar.f4836I;
            this.f4837J = bVar.f4837J;
            this.f4838K = bVar.f4838K;
            this.f4839L = bVar.f4839L;
            this.f4840M = bVar.f4840M;
            this.f4841N = bVar.f4841N;
            this.f4842O = bVar.f4842O;
            this.f4843P = bVar.f4843P;
            this.f4844Q = bVar.f4844Q;
            this.f4845R = bVar.f4845R;
            this.f4846S = bVar.f4846S;
            this.f4847T = bVar.f4847T;
            this.f4848U = bVar.f4848U;
            this.f4849V = bVar.f4849V;
            this.f4850W = bVar.f4850W;
            this.f4851X = bVar.f4851X;
            this.f4852Y = bVar.f4852Y;
            this.f4853Z = bVar.f4853Z;
            this.f4855a0 = bVar.f4855a0;
            this.f4857b0 = bVar.f4857b0;
            this.f4859c0 = bVar.f4859c0;
            this.f4861d0 = bVar.f4861d0;
            this.f4867g0 = bVar.f4867g0;
            int[] iArr = bVar.f4863e0;
            if (iArr != null) {
                this.f4863e0 = Arrays.copyOf(iArr, iArr.length);
            } else {
                this.f4863e0 = null;
            }
            this.f4865f0 = bVar.f4865f0;
            this.f4869h0 = bVar.f4869h0;
            this.f4871i0 = bVar.f4871i0;
            this.f4873j0 = bVar.f4873j0;
        }

        public void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C.d.f315I2);
            this.f4856b = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = obtainStyledAttributes.getIndex(i4);
                int i5 = f4827k0.get(index);
                if (i5 == 80) {
                    this.f4869h0 = obtainStyledAttributes.getBoolean(index, this.f4869h0);
                } else if (i5 != 81) {
                    switch (i5) {
                        case 1:
                            this.f4879p = c.n(obtainStyledAttributes, index, this.f4879p);
                            break;
                        case 2:
                            this.f4834G = obtainStyledAttributes.getDimensionPixelSize(index, this.f4834G);
                            break;
                        case 3:
                            this.f4878o = c.n(obtainStyledAttributes, index, this.f4878o);
                            break;
                        case 4:
                            this.f4877n = c.n(obtainStyledAttributes, index, this.f4877n);
                            break;
                        case 5:
                            this.f4886w = obtainStyledAttributes.getString(index);
                            break;
                        case 6:
                            this.f4828A = obtainStyledAttributes.getDimensionPixelOffset(index, this.f4828A);
                            break;
                        case 7:
                            this.f4829B = obtainStyledAttributes.getDimensionPixelOffset(index, this.f4829B);
                            break;
                        case 8:
                            this.f4835H = obtainStyledAttributes.getDimensionPixelSize(index, this.f4835H);
                            break;
                        case IBulkCursor.WANTS_ON_MOVE_TRANSACTION /*9*/:
                            this.f4883t = c.n(obtainStyledAttributes, index, this.f4883t);
                            break;
                        case IBulkCursor.GET_EXTRAS_TRANSACTION /*10*/:
                            this.f4882s = c.n(obtainStyledAttributes, index, this.f4882s);
                            break;
                        case IBulkCursor.RESPOND_TRANSACTION /*11*/:
                            this.f4840M = obtainStyledAttributes.getDimensionPixelSize(index, this.f4840M);
                            break;
                        case IBulkCursor.CLOSE_TRANSACTION /*12*/:
                            this.f4841N = obtainStyledAttributes.getDimensionPixelSize(index, this.f4841N);
                            break;
                        case 13:
                            this.f4837J = obtainStyledAttributes.getDimensionPixelSize(index, this.f4837J);
                            break;
                        case 14:
                            this.f4839L = obtainStyledAttributes.getDimensionPixelSize(index, this.f4839L);
                            break;
                        case 15:
                            this.f4842O = obtainStyledAttributes.getDimensionPixelSize(index, this.f4842O);
                            break;
                        case SQLiteDatabase.NO_LOCALIZED_COLLATORS /*16*/:
                            this.f4838K = obtainStyledAttributes.getDimensionPixelSize(index, this.f4838K);
                            break;
                        case 17:
                            this.f4862e = obtainStyledAttributes.getDimensionPixelOffset(index, this.f4862e);
                            break;
                        case 18:
                            this.f4864f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f4864f);
                            break;
                        case 19:
                            this.f4866g = obtainStyledAttributes.getFloat(index, this.f4866g);
                            break;
                        case i.f2380c:
                            this.f4884u = obtainStyledAttributes.getFloat(index, this.f4884u);
                            break;
                        case 21:
                            this.f4860d = obtainStyledAttributes.getLayoutDimension(index, this.f4860d);
                            break;
                        case 22:
                            this.f4858c = obtainStyledAttributes.getLayoutDimension(index, this.f4858c);
                            break;
                        case 23:
                            this.f4831D = obtainStyledAttributes.getDimensionPixelSize(index, this.f4831D);
                            break;
                        case 24:
                            this.f4868h = c.n(obtainStyledAttributes, index, this.f4868h);
                            break;
                        case 25:
                            this.f4870i = c.n(obtainStyledAttributes, index, this.f4870i);
                            break;
                        case 26:
                            this.f4830C = obtainStyledAttributes.getInt(index, this.f4830C);
                            break;
                        case 27:
                            this.f4832E = obtainStyledAttributes.getDimensionPixelSize(index, this.f4832E);
                            break;
                        case 28:
                            this.f4872j = c.n(obtainStyledAttributes, index, this.f4872j);
                            break;
                        case 29:
                            this.f4874k = c.n(obtainStyledAttributes, index, this.f4874k);
                            break;
                        case 30:
                            this.f4836I = obtainStyledAttributes.getDimensionPixelSize(index, this.f4836I);
                            break;
                        case 31:
                            this.f4880q = c.n(obtainStyledAttributes, index, this.f4880q);
                            break;
                        case 32:
                            this.f4881r = c.n(obtainStyledAttributes, index, this.f4881r);
                            break;
                        case 33:
                            this.f4833F = obtainStyledAttributes.getDimensionPixelSize(index, this.f4833F);
                            break;
                        case 34:
                            this.f4876m = c.n(obtainStyledAttributes, index, this.f4876m);
                            break;
                        case 35:
                            this.f4875l = c.n(obtainStyledAttributes, index, this.f4875l);
                            break;
                        case 36:
                            this.f4885v = obtainStyledAttributes.getFloat(index, this.f4885v);
                            break;
                        case 37:
                            this.f4844Q = obtainStyledAttributes.getFloat(index, this.f4844Q);
                            break;
                        case 38:
                            this.f4843P = obtainStyledAttributes.getFloat(index, this.f4843P);
                            break;
                        case 39:
                            this.f4845R = obtainStyledAttributes.getInt(index, this.f4845R);
                            break;
                        case 40:
                            this.f4846S = obtainStyledAttributes.getInt(index, this.f4846S);
                            break;
                        default:
                            switch (i5) {
                                case 54:
                                    this.f4847T = obtainStyledAttributes.getInt(index, this.f4847T);
                                    break;
                                case 55:
                                    this.f4848U = obtainStyledAttributes.getInt(index, this.f4848U);
                                    break;
                                case 56:
                                    this.f4849V = obtainStyledAttributes.getDimensionPixelSize(index, this.f4849V);
                                    break;
                                case 57:
                                    this.f4850W = obtainStyledAttributes.getDimensionPixelSize(index, this.f4850W);
                                    break;
                                case 58:
                                    this.f4851X = obtainStyledAttributes.getDimensionPixelSize(index, this.f4851X);
                                    break;
                                case 59:
                                    this.f4852Y = obtainStyledAttributes.getDimensionPixelSize(index, this.f4852Y);
                                    break;
                                default:
                                    switch (i5) {
                                        case 61:
                                            this.f4887x = c.n(obtainStyledAttributes, index, this.f4887x);
                                            break;
                                        case 62:
                                            this.f4888y = obtainStyledAttributes.getDimensionPixelSize(index, this.f4888y);
                                            break;
                                        case 63:
                                            this.f4889z = obtainStyledAttributes.getFloat(index, this.f4889z);
                                            break;
                                        default:
                                            switch (i5) {
                                                case 69:
                                                    this.f4853Z = obtainStyledAttributes.getFloat(index, 1.0f);
                                                    break;
                                                case 70:
                                                    this.f4855a0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                                    break;
                                                case 71:
                                                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                                    break;
                                                case 72:
                                                    this.f4857b0 = obtainStyledAttributes.getInt(index, this.f4857b0);
                                                    break;
                                                case 73:
                                                    this.f4859c0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f4859c0);
                                                    break;
                                                case 74:
                                                    this.f4865f0 = obtainStyledAttributes.getString(index);
                                                    break;
                                                case 75:
                                                    this.f4873j0 = obtainStyledAttributes.getBoolean(index, this.f4873j0);
                                                    break;
                                                case 76:
                                                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + f4827k0.get(index));
                                                    break;
                                                case 77:
                                                    this.f4867g0 = obtainStyledAttributes.getString(index);
                                                    break;
                                                default:
                                                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f4827k0.get(index));
                                                    break;
                                            }
                                    }
                            }
                    }
                } else {
                    this.f4871i0 = obtainStyledAttributes.getBoolean(index, this.f4871i0);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.constraintlayout.widget.c$c  reason: collision with other inner class name */
    public static class C0087c {

        /* renamed from: h  reason: collision with root package name */
        public static SparseIntArray f4890h;

        /* renamed from: a  reason: collision with root package name */
        public boolean f4891a = false;

        /* renamed from: b  reason: collision with root package name */
        public int f4892b = -1;

        /* renamed from: c  reason: collision with root package name */
        public String f4893c = null;

        /* renamed from: d  reason: collision with root package name */
        public int f4894d = -1;

        /* renamed from: e  reason: collision with root package name */
        public int f4895e = 0;

        /* renamed from: f  reason: collision with root package name */
        public float f4896f = Float.NaN;

        /* renamed from: g  reason: collision with root package name */
        public float f4897g = Float.NaN;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f4890h = sparseIntArray;
            sparseIntArray.append(C.d.W3, 1);
            f4890h.append(C.d.Y3, 2);
            f4890h.append(C.d.Z3, 3);
            f4890h.append(C.d.V3, 4);
            f4890h.append(C.d.U3, 5);
            f4890h.append(C.d.X3, 6);
        }

        public void a(C0087c cVar) {
            this.f4891a = cVar.f4891a;
            this.f4892b = cVar.f4892b;
            this.f4893c = cVar.f4893c;
            this.f4894d = cVar.f4894d;
            this.f4895e = cVar.f4895e;
            this.f4897g = cVar.f4897g;
            this.f4896f = cVar.f4896f;
        }

        public void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C.d.T3);
            this.f4891a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = obtainStyledAttributes.getIndex(i4);
                switch (f4890h.get(index)) {
                    case 1:
                        this.f4897g = obtainStyledAttributes.getFloat(index, this.f4897g);
                        break;
                    case 2:
                        this.f4894d = obtainStyledAttributes.getInt(index, this.f4894d);
                        break;
                    case 3:
                        if (obtainStyledAttributes.peekValue(index).type != 3) {
                            this.f4893c = C0994a.f12686c[obtainStyledAttributes.getInteger(index, 0)];
                            break;
                        } else {
                            this.f4893c = obtainStyledAttributes.getString(index);
                            break;
                        }
                    case 4:
                        this.f4895e = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.f4892b = c.n(obtainStyledAttributes, index, this.f4892b);
                        break;
                    case 6:
                        this.f4896f = obtainStyledAttributes.getFloat(index, this.f4896f);
                        break;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public boolean f4898a = false;

        /* renamed from: b  reason: collision with root package name */
        public int f4899b = 0;

        /* renamed from: c  reason: collision with root package name */
        public int f4900c = 0;

        /* renamed from: d  reason: collision with root package name */
        public float f4901d = 1.0f;

        /* renamed from: e  reason: collision with root package name */
        public float f4902e = Float.NaN;

        public void a(d dVar) {
            this.f4898a = dVar.f4898a;
            this.f4899b = dVar.f4899b;
            this.f4901d = dVar.f4901d;
            this.f4902e = dVar.f4902e;
            this.f4900c = dVar.f4900c;
        }

        public void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C.d.i4);
            this.f4898a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = obtainStyledAttributes.getIndex(i4);
                if (index == C.d.k4) {
                    this.f4901d = obtainStyledAttributes.getFloat(index, this.f4901d);
                } else if (index == C.d.j4) {
                    this.f4899b = obtainStyledAttributes.getInt(index, this.f4899b);
                    this.f4899b = c.f4816d[this.f4899b];
                } else if (index == C.d.m4) {
                    this.f4900c = obtainStyledAttributes.getInt(index, this.f4900c);
                } else if (index == C.d.l4) {
                    this.f4902e = obtainStyledAttributes.getFloat(index, this.f4902e);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public static class e {

        /* renamed from: n  reason: collision with root package name */
        public static SparseIntArray f4903n;

        /* renamed from: a  reason: collision with root package name */
        public boolean f4904a = false;

        /* renamed from: b  reason: collision with root package name */
        public float f4905b = 0.0f;

        /* renamed from: c  reason: collision with root package name */
        public float f4906c = 0.0f;

        /* renamed from: d  reason: collision with root package name */
        public float f4907d = 0.0f;

        /* renamed from: e  reason: collision with root package name */
        public float f4908e = 1.0f;

        /* renamed from: f  reason: collision with root package name */
        public float f4909f = 1.0f;

        /* renamed from: g  reason: collision with root package name */
        public float f4910g = Float.NaN;

        /* renamed from: h  reason: collision with root package name */
        public float f4911h = Float.NaN;

        /* renamed from: i  reason: collision with root package name */
        public float f4912i = 0.0f;

        /* renamed from: j  reason: collision with root package name */
        public float f4913j = 0.0f;

        /* renamed from: k  reason: collision with root package name */
        public float f4914k = 0.0f;

        /* renamed from: l  reason: collision with root package name */
        public boolean f4915l = false;

        /* renamed from: m  reason: collision with root package name */
        public float f4916m = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f4903n = sparseIntArray;
            sparseIntArray.append(C.d.G4, 1);
            f4903n.append(C.d.H4, 2);
            f4903n.append(C.d.I4, 3);
            f4903n.append(C.d.E4, 4);
            f4903n.append(C.d.F4, 5);
            f4903n.append(C.d.A4, 6);
            f4903n.append(C.d.B4, 7);
            f4903n.append(C.d.C4, 8);
            f4903n.append(C.d.D4, 9);
            f4903n.append(C.d.J4, 10);
            f4903n.append(C.d.K4, 11);
        }

        public void a(e eVar) {
            this.f4904a = eVar.f4904a;
            this.f4905b = eVar.f4905b;
            this.f4906c = eVar.f4906c;
            this.f4907d = eVar.f4907d;
            this.f4908e = eVar.f4908e;
            this.f4909f = eVar.f4909f;
            this.f4910g = eVar.f4910g;
            this.f4911h = eVar.f4911h;
            this.f4912i = eVar.f4912i;
            this.f4913j = eVar.f4913j;
            this.f4914k = eVar.f4914k;
            this.f4915l = eVar.f4915l;
            this.f4916m = eVar.f4916m;
        }

        public void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C.d.z4);
            this.f4904a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = obtainStyledAttributes.getIndex(i4);
                switch (f4903n.get(index)) {
                    case 1:
                        this.f4905b = obtainStyledAttributes.getFloat(index, this.f4905b);
                        break;
                    case 2:
                        this.f4906c = obtainStyledAttributes.getFloat(index, this.f4906c);
                        break;
                    case 3:
                        this.f4907d = obtainStyledAttributes.getFloat(index, this.f4907d);
                        break;
                    case 4:
                        this.f4908e = obtainStyledAttributes.getFloat(index, this.f4908e);
                        break;
                    case 5:
                        this.f4909f = obtainStyledAttributes.getFloat(index, this.f4909f);
                        break;
                    case 6:
                        this.f4910g = obtainStyledAttributes.getDimension(index, this.f4910g);
                        break;
                    case 7:
                        this.f4911h = obtainStyledAttributes.getDimension(index, this.f4911h);
                        break;
                    case 8:
                        this.f4912i = obtainStyledAttributes.getDimension(index, this.f4912i);
                        break;
                    case IBulkCursor.WANTS_ON_MOVE_TRANSACTION /*9*/:
                        this.f4913j = obtainStyledAttributes.getDimension(index, this.f4913j);
                        break;
                    case IBulkCursor.GET_EXTRAS_TRANSACTION /*10*/:
                        this.f4914k = obtainStyledAttributes.getDimension(index, this.f4914k);
                        break;
                    case IBulkCursor.RESPOND_TRANSACTION /*11*/:
                        this.f4915l = true;
                        this.f4916m = obtainStyledAttributes.getDimension(index, this.f4916m);
                        break;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f4817e = sparseIntArray;
        sparseIntArray.append(C.d.f494u0, 25);
        f4817e.append(C.d.f499v0, 26);
        f4817e.append(C.d.f509x0, 29);
        f4817e.append(C.d.f514y0, 30);
        f4817e.append(C.d.f293E0, 36);
        f4817e.append(C.d.f288D0, 35);
        f4817e.append(C.d.f404c0, 4);
        f4817e.append(C.d.f399b0, 3);
        f4817e.append(C.d.f389Z, 1);
        f4817e.append(C.d.f333M0, 6);
        f4817e.append(C.d.f338N0, 7);
        f4817e.append(C.d.f439j0, 17);
        f4817e.append(C.d.f444k0, 18);
        f4817e.append(C.d.f449l0, 19);
        f4817e.append(C.d.f483s, 27);
        f4817e.append(C.d.f519z0, 32);
        f4817e.append(C.d.f273A0, 33);
        f4817e.append(C.d.f434i0, 10);
        f4817e.append(C.d.f429h0, 9);
        f4817e.append(C.d.f353Q0, 13);
        f4817e.append(C.d.f366T0, 16);
        f4817e.append(C.d.f358R0, 14);
        f4817e.append(C.d.f343O0, 11);
        f4817e.append(C.d.f362S0, 15);
        f4817e.append(C.d.f348P0, 12);
        f4817e.append(C.d.f308H0, 40);
        f4817e.append(C.d.f484s0, 39);
        f4817e.append(C.d.f479r0, 41);
        f4817e.append(C.d.f303G0, 42);
        f4817e.append(C.d.f474q0, 20);
        f4817e.append(C.d.f298F0, 37);
        f4817e.append(C.d.f424g0, 5);
        f4817e.append(C.d.f489t0, 82);
        f4817e.append(C.d.f283C0, 82);
        f4817e.append(C.d.f504w0, 82);
        f4817e.append(C.d.f394a0, 82);
        f4817e.append(C.d.f385Y, 82);
        f4817e.append(C.d.f508x, 24);
        f4817e.append(C.d.f518z, 28);
        f4817e.append(C.d.f327L, 31);
        f4817e.append(C.d.f332M, 8);
        f4817e.append(C.d.f513y, 34);
        f4817e.append(C.d.f272A, 2);
        f4817e.append(C.d.f498v, 23);
        f4817e.append(C.d.f503w, 21);
        f4817e.append(C.d.f493u, 22);
        f4817e.append(C.d.f277B, 43);
        f4817e.append(C.d.f342O, 44);
        f4817e.append(C.d.f317J, 45);
        f4817e.append(C.d.f322K, 46);
        f4817e.append(C.d.f312I, 60);
        f4817e.append(C.d.f302G, 47);
        f4817e.append(C.d.f307H, 48);
        f4817e.append(C.d.f282C, 49);
        f4817e.append(C.d.f287D, 50);
        f4817e.append(C.d.f292E, 51);
        f4817e.append(C.d.f297F, 52);
        f4817e.append(C.d.f337N, 53);
        f4817e.append(C.d.f313I0, 54);
        f4817e.append(C.d.f454m0, 55);
        f4817e.append(C.d.f318J0, 56);
        f4817e.append(C.d.f459n0, 57);
        f4817e.append(C.d.f323K0, 58);
        f4817e.append(C.d.f464o0, 59);
        f4817e.append(C.d.f409d0, 61);
        f4817e.append(C.d.f419f0, 62);
        f4817e.append(C.d.f414e0, 63);
        f4817e.append(C.d.f347P, 64);
        f4817e.append(C.d.f382X0, 65);
        f4817e.append(C.d.f373V, 66);
        f4817e.append(C.d.f386Y0, 67);
        f4817e.append(C.d.f374V0, 79);
        f4817e.append(C.d.f488t, 38);
        f4817e.append(C.d.f370U0, 68);
        f4817e.append(C.d.f328L0, 69);
        f4817e.append(C.d.f469p0, 70);
        f4817e.append(C.d.f365T, 71);
        f4817e.append(C.d.f357R, 72);
        f4817e.append(C.d.f361S, 73);
        f4817e.append(C.d.f369U, 74);
        f4817e.append(C.d.f352Q, 75);
        f4817e.append(C.d.f378W0, 76);
        f4817e.append(C.d.f278B0, 77);
        f4817e.append(C.d.f390Z0, 78);
        f4817e.append(C.d.f381X, 80);
        f4817e.append(C.d.f377W, 81);
    }

    public static int n(TypedArray typedArray, int i4, int i5) {
        int resourceId = typedArray.getResourceId(i4, i5);
        return resourceId == -1 ? typedArray.getInt(i4, -1) : resourceId;
    }

    public void c(ConstraintLayout constraintLayout) {
        d(constraintLayout, true);
        constraintLayout.setConstraintSet((c) null);
        constraintLayout.requestLayout();
    }

    public void d(ConstraintLayout constraintLayout, boolean z4) {
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(this.f4820c.keySet());
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = constraintLayout.getChildAt(i4);
            int id = childAt.getId();
            if (!this.f4820c.containsKey(Integer.valueOf(id))) {
                Log.w("ConstraintSet", "id unknown " + C1004a.a(childAt));
            } else if (this.f4819b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            } else if (id != -1) {
                if (this.f4820c.containsKey(Integer.valueOf(id))) {
                    hashSet.remove(Integer.valueOf(id));
                    a aVar = (a) this.f4820c.get(Integer.valueOf(id));
                    if (childAt instanceof Barrier) {
                        aVar.f4824d.f4861d0 = 1;
                    }
                    int i5 = aVar.f4824d.f4861d0;
                    if (i5 != -1 && i5 == 1) {
                        Barrier barrier = (Barrier) childAt;
                        barrier.setId(id);
                        barrier.setType(aVar.f4824d.f4857b0);
                        barrier.setMargin(aVar.f4824d.f4859c0);
                        barrier.setAllowsGoneWidget(aVar.f4824d.f4873j0);
                        b bVar = aVar.f4824d;
                        int[] iArr = bVar.f4863e0;
                        if (iArr != null) {
                            barrier.setReferencedIds(iArr);
                        } else {
                            String str = bVar.f4865f0;
                            if (str != null) {
                                bVar.f4863e0 = i(barrier, str);
                                barrier.setReferencedIds(aVar.f4824d.f4863e0);
                            }
                        }
                    }
                    ConstraintLayout.b bVar2 = (ConstraintLayout.b) childAt.getLayoutParams();
                    bVar2.a();
                    aVar.b(bVar2);
                    if (z4) {
                        a.c(childAt, aVar.f4826f);
                    }
                    childAt.setLayoutParams(bVar2);
                    d dVar = aVar.f4822b;
                    if (dVar.f4900c == 0) {
                        childAt.setVisibility(dVar.f4899b);
                    }
                    childAt.setAlpha(aVar.f4822b.f4901d);
                    childAt.setRotation(aVar.f4825e.f4905b);
                    childAt.setRotationX(aVar.f4825e.f4906c);
                    childAt.setRotationY(aVar.f4825e.f4907d);
                    childAt.setScaleX(aVar.f4825e.f4908e);
                    childAt.setScaleY(aVar.f4825e.f4909f);
                    if (!Float.isNaN(aVar.f4825e.f4910g)) {
                        childAt.setPivotX(aVar.f4825e.f4910g);
                    }
                    if (!Float.isNaN(aVar.f4825e.f4911h)) {
                        childAt.setPivotY(aVar.f4825e.f4911h);
                    }
                    childAt.setTranslationX(aVar.f4825e.f4912i);
                    childAt.setTranslationY(aVar.f4825e.f4913j);
                    childAt.setTranslationZ(aVar.f4825e.f4914k);
                    e eVar = aVar.f4825e;
                    if (eVar.f4915l) {
                        childAt.setElevation(eVar.f4916m);
                    }
                } else {
                    Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id);
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            a aVar2 = (a) this.f4820c.get(num);
            int i6 = aVar2.f4824d.f4861d0;
            if (i6 != -1 && i6 == 1) {
                Barrier barrier2 = new Barrier(constraintLayout.getContext());
                barrier2.setId(num.intValue());
                b bVar3 = aVar2.f4824d;
                int[] iArr2 = bVar3.f4863e0;
                if (iArr2 != null) {
                    barrier2.setReferencedIds(iArr2);
                } else {
                    String str2 = bVar3.f4865f0;
                    if (str2 != null) {
                        bVar3.f4863e0 = i(barrier2, str2);
                        barrier2.setReferencedIds(aVar2.f4824d.f4863e0);
                    }
                }
                barrier2.setType(aVar2.f4824d.f4857b0);
                barrier2.setMargin(aVar2.f4824d.f4859c0);
                ConstraintLayout.b d4 = constraintLayout.generateDefaultLayoutParams();
                barrier2.k();
                aVar2.b(d4);
                constraintLayout.addView(barrier2, d4);
            }
            if (aVar2.f4824d.f4854a) {
                Guideline guideline = new Guideline(constraintLayout.getContext());
                guideline.setId(num.intValue());
                ConstraintLayout.b d5 = constraintLayout.generateDefaultLayoutParams();
                aVar2.b(d5);
                constraintLayout.addView(guideline, d5);
            }
        }
    }

    public void e(int i4, int i5) {
        if (this.f4820c.containsKey(Integer.valueOf(i4))) {
            a aVar = (a) this.f4820c.get(Integer.valueOf(i4));
            switch (i5) {
                case 1:
                    b bVar = aVar.f4824d;
                    bVar.f4870i = -1;
                    bVar.f4868h = -1;
                    bVar.f4831D = -1;
                    bVar.f4837J = -1;
                    return;
                case 2:
                    b bVar2 = aVar.f4824d;
                    bVar2.f4874k = -1;
                    bVar2.f4872j = -1;
                    bVar2.f4832E = -1;
                    bVar2.f4839L = -1;
                    return;
                case 3:
                    b bVar3 = aVar.f4824d;
                    bVar3.f4876m = -1;
                    bVar3.f4875l = -1;
                    bVar3.f4833F = -1;
                    bVar3.f4838K = -1;
                    return;
                case 4:
                    b bVar4 = aVar.f4824d;
                    bVar4.f4877n = -1;
                    bVar4.f4878o = -1;
                    bVar4.f4834G = -1;
                    bVar4.f4840M = -1;
                    return;
                case 5:
                    aVar.f4824d.f4879p = -1;
                    return;
                case 6:
                    b bVar5 = aVar.f4824d;
                    bVar5.f4880q = -1;
                    bVar5.f4881r = -1;
                    bVar5.f4836I = -1;
                    bVar5.f4842O = -1;
                    return;
                case 7:
                    b bVar6 = aVar.f4824d;
                    bVar6.f4882s = -1;
                    bVar6.f4883t = -1;
                    bVar6.f4835H = -1;
                    bVar6.f4841N = -1;
                    return;
                default:
                    throw new IllegalArgumentException("unknown constraint");
            }
        }
    }

    public void f(Context context, int i4) {
        g((ConstraintLayout) LayoutInflater.from(context).inflate(i4, (ViewGroup) null));
    }

    public void g(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        this.f4820c.clear();
        int i4 = 0;
        while (i4 < childCount) {
            View childAt = constraintLayout.getChildAt(i4);
            ConstraintLayout.b bVar = (ConstraintLayout.b) childAt.getLayoutParams();
            int id = childAt.getId();
            if (!this.f4819b || id != -1) {
                if (!this.f4820c.containsKey(Integer.valueOf(id))) {
                    this.f4820c.put(Integer.valueOf(id), new a());
                }
                a aVar = (a) this.f4820c.get(Integer.valueOf(id));
                aVar.f4826f = a.a(this.f4818a, childAt);
                aVar.d(id, bVar);
                aVar.f4822b.f4899b = childAt.getVisibility();
                aVar.f4822b.f4901d = childAt.getAlpha();
                aVar.f4825e.f4905b = childAt.getRotation();
                aVar.f4825e.f4906c = childAt.getRotationX();
                aVar.f4825e.f4907d = childAt.getRotationY();
                aVar.f4825e.f4908e = childAt.getScaleX();
                aVar.f4825e.f4909f = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (!(((double) pivotX) == 0.0d && ((double) pivotY) == 0.0d)) {
                    e eVar = aVar.f4825e;
                    eVar.f4910g = pivotX;
                    eVar.f4911h = pivotY;
                }
                aVar.f4825e.f4912i = childAt.getTranslationX();
                aVar.f4825e.f4913j = childAt.getTranslationY();
                aVar.f4825e.f4914k = childAt.getTranslationZ();
                e eVar2 = aVar.f4825e;
                if (eVar2.f4915l) {
                    eVar2.f4916m = childAt.getElevation();
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    aVar.f4824d.f4873j0 = barrier.l();
                    aVar.f4824d.f4863e0 = barrier.getReferencedIds();
                    aVar.f4824d.f4857b0 = barrier.getType();
                    aVar.f4824d.f4859c0 = barrier.getMargin();
                }
                i4++;
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
    }

    public void h(int i4, int i5, int i6, float f4) {
        b bVar = k(i4).f4824d;
        bVar.f4887x = i5;
        bVar.f4888y = i6;
        bVar.f4889z = f4;
    }

    public final int[] i(View view, String str) {
        int i4;
        Object f4;
        String[] split = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[split.length];
        int i5 = 0;
        int i6 = 0;
        while (i5 < split.length) {
            String trim = split[i5].trim();
            try {
                i4 = C.c.class.getField(trim).getInt((Object) null);
            } catch (Exception unused) {
                i4 = 0;
            }
            if (i4 == 0) {
                i4 = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i4 == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (f4 = ((ConstraintLayout) view.getParent()).f(0, trim)) != null && (f4 instanceof Integer)) {
                i4 = ((Integer) f4).intValue();
            }
            iArr[i6] = i4;
            i5++;
            i6++;
        }
        return i6 != split.length ? Arrays.copyOf(iArr, i6) : iArr;
    }

    public final a j(Context context, AttributeSet attributeSet) {
        a aVar = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C.d.f478r);
        o(context, aVar, obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        return aVar;
    }

    public final a k(int i4) {
        if (!this.f4820c.containsKey(Integer.valueOf(i4))) {
            this.f4820c.put(Integer.valueOf(i4), new a());
        }
        return (a) this.f4820c.get(Integer.valueOf(i4));
    }

    public void l(Context context, int i4) {
        XmlResourceParser xml = context.getResources().getXml(i4);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    a j4 = j(context, Xml.asAttributeSet(xml));
                    if (name.equalsIgnoreCase("Guideline")) {
                        j4.f4824d.f4854a = true;
                    }
                    this.f4820c.put(Integer.valueOf(j4.f4821a), j4);
                }
            }
        } catch (XmlPullParserException e4) {
            e4.printStackTrace();
        } catch (IOException e5) {
            e5.printStackTrace();
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x017d, code lost:
        continue;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m(android.content.Context r9, org.xmlpull.v1.XmlPullParser r10) {
        /*
            r8 = this;
            int r0 = r10.getEventType()     // Catch:{ XmlPullParserException -> 0x0039, IOException -> 0x0036 }
            r1 = 0
            r2 = r1
        L_0x0006:
            r3 = 1
            if (r0 == r3) goto L_0x018a
            if (r0 == 0) goto L_0x017a
            java.lang.String r4 = "Constraint"
            r5 = 3
            r6 = 2
            if (r0 == r6) goto L_0x003c
            if (r0 == r5) goto L_0x0015
            goto L_0x017d
        L_0x0015:
            java.lang.String r0 = r10.getName()     // Catch:{ XmlPullParserException -> 0x0039, IOException -> 0x0036 }
            java.lang.String r3 = "ConstraintSet"
            boolean r3 = r3.equals(r0)     // Catch:{ XmlPullParserException -> 0x0039, IOException -> 0x0036 }
            if (r3 == 0) goto L_0x0022
            return
        L_0x0022:
            boolean r0 = r0.equalsIgnoreCase(r4)     // Catch:{ XmlPullParserException -> 0x0039, IOException -> 0x0036 }
            if (r0 == 0) goto L_0x017d
            java.util.HashMap r0 = r8.f4820c     // Catch:{ XmlPullParserException -> 0x0039, IOException -> 0x0036 }
            int r3 = r2.f4821a     // Catch:{ XmlPullParserException -> 0x0039, IOException -> 0x0036 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ XmlPullParserException -> 0x0039, IOException -> 0x0036 }
            r0.put(r3, r2)     // Catch:{ XmlPullParserException -> 0x0039, IOException -> 0x0036 }
            r2 = r1
            goto L_0x017d
        L_0x0036:
            r9 = move-exception
            goto L_0x0183
        L_0x0039:
            r9 = move-exception
            goto L_0x0187
        L_0x003c:
            java.lang.String r0 = r10.getName()     // Catch:{ XmlPullParserException -> 0x0039, IOException -> 0x0036 }
            int r7 = r0.hashCode()     // Catch:{ XmlPullParserException -> 0x0039, IOException -> 0x0036 }
            switch(r7) {
                case -2025855158: goto L_0x008b;
                case -1984451626: goto L_0x0081;
                case -1269513683: goto L_0x0078;
                case -1238332596: goto L_0x006e;
                case -71750448: goto L_0x0064;
                case 1331510167: goto L_0x005a;
                case 1791837707: goto L_0x0050;
                case 1803088381: goto L_0x0048;
                default: goto L_0x0047;
            }     // Catch:{ XmlPullParserException -> 0x0039, IOException -> 0x0036 }
        L_0x0047:
            goto L_0x0095
        L_0x0048:
            boolean r0 = r0.equals(r4)     // Catch:{ XmlPullParserException -> 0x0039, IOException -> 0x0036 }
            if (r0 == 0) goto L_0x0095
            r5 = 0
            goto L_0x0096
        L_0x0050:
            java.lang.String r4 = "CustomAttribute"
            boolean r0 = r0.equals(r4)     // Catch:{ XmlPullParserException -> 0x0039, IOException -> 0x0036 }
            if (r0 == 0) goto L_0x0095
            r5 = 7
            goto L_0x0096
        L_0x005a:
            java.lang.String r4 = "Barrier"
            boolean r0 = r0.equals(r4)     // Catch:{ XmlPullParserException -> 0x0039, IOException -> 0x0036 }
            if (r0 == 0) goto L_0x0095
            r5 = r6
            goto L_0x0096
        L_0x0064:
            java.lang.String r4 = "Guideline"
            boolean r0 = r0.equals(r4)     // Catch:{ XmlPullParserException -> 0x0039, IOException -> 0x0036 }
            if (r0 == 0) goto L_0x0095
            r5 = r3
            goto L_0x0096
        L_0x006e:
            java.lang.String r4 = "Transform"
            boolean r0 = r0.equals(r4)     // Catch:{ XmlPullParserException -> 0x0039, IOException -> 0x0036 }
            if (r0 == 0) goto L_0x0095
            r5 = 4
            goto L_0x0096
        L_0x0078:
            java.lang.String r4 = "PropertySet"
            boolean r0 = r0.equals(r4)     // Catch:{ XmlPullParserException -> 0x0039, IOException -> 0x0036 }
            if (r0 == 0) goto L_0x0095
            goto L_0x0096
        L_0x0081:
            java.lang.String r4 = "Motion"
            boolean r0 = r0.equals(r4)     // Catch:{ XmlPullParserException -> 0x0039, IOException -> 0x0036 }
            if (r0 == 0) goto L_0x0095
            r5 = 6
            goto L_0x0096
        L_0x008b:
            java.lang.String r4 = "Layout"
            boolean r0 = r0.equals(r4)     // Catch:{ XmlPullParserException -> 0x0039, IOException -> 0x0036 }
            if (r0 == 0) goto L_0x0095
            r5 = 5
            goto L_0x0096
        L_0x0095:
            r5 = -1
        L_0x0096:
            java.lang.String r0 = "XML parser error must be within a Constraint "
            switch(r5) {
                case 0: goto L_0x0171;
                case 1: goto L_0x0162;
                case 2: goto L_0x0155;
                case 3: goto L_0x0130;
                case 4: goto L_0x010b;
                case 5: goto L_0x00e5;
                case 6: goto L_0x00bf;
                case 7: goto L_0x009d;
                default: goto L_0x009b;
            }
        L_0x009b:
            goto L_0x017d
        L_0x009d:
            if (r2 == 0) goto L_0x00a6
            java.util.HashMap r0 = r2.f4826f     // Catch:{ XmlPullParserException -> 0x0039, IOException -> 0x0036 }
            androidx.constraintlayout.widget.a.b(r9, r10, r0)     // Catch:{ XmlPullParserException -> 0x0039, IOException -> 0x0036 }
            goto L_0x017d
        L_0x00a6:
            java.lang.RuntimeException r9 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x0039, IOException -> 0x0036 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0039, IOException -> 0x0036 }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x0039, IOException -> 0x0036 }
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x0039, IOException -> 0x0036 }
            int r10 = r10.getLineNumber()     // Catch:{ XmlPullParserException -> 0x0039, IOException -> 0x0036 }
            r1.append(r10)     // Catch:{ XmlPullParserException -> 0x0039, IOException -> 0x0036 }
            java.lang.String r10 = r1.toString()     // Catch:{ XmlPullParserException -> 0x0039, IOException -> 0x0036 }
            r9.<init>(r10)     // Catch:{ XmlPullParserException -> 0x0039, IOException -> 0x0036 }
            throw r9     // Catch:{ XmlPullParserException -> 0x0039, IOException -> 0x0036 }
        L_0x00bf:
            if (r2 == 0) goto L_0x00cc
            androidx.constraintlayout.widget.c$c r0 = r2.f4823c     // Catch:{ XmlPullParserException -> 0x0039, IOException -> 0x0036 }
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r10)     // Catch:{ XmlPullParserException -> 0x0039, IOException -> 0x0036 }
            r0.b(r9, r3)     // Catch:{ XmlPullParserException -> 0x0039, IOException -> 0x0036 }
            goto L_0x017d
        L_0x00cc:
            java.lang.RuntimeException r9 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x0039, IOException -> 0x0036 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0039, IOException -> 0x0036 }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x0039, IOException -> 0x0036 }
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x0039, IOException -> 0x0036 }
            int r10 = r10.getLineNumber()     // Catch:{ XmlPullParserException -> 0x0039, IOException -> 0x0036 }
            r1.append(r10)     // Catch:{ XmlPullParserException -> 0x0039, IOException -> 0x0036 }
            java.lang.String r10 = r1.toString()     // Catch:{ XmlPullParserException -> 0x0039, IOException -> 0x0036 }
            r9.<init>(r10)     // Catch:{ XmlPullParserException -> 0x0039, IOException -> 0x0036 }
            throw r9     // Catch:{ XmlPullParserException -> 0x0039, IOException -> 0x0036 }
        L_0x00e5:
            if (r2 == 0) goto L_0x00f2
            androidx.constraintlayout.widget.c$b r0 = r2.f4824d     // Catch:{ XmlPullParserException -> 0x0039, IOException -> 0x0036 }
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r10)     // Catch:{ XmlPullParserException -> 0x0039, IOException -> 0x0036 }
            r0.b(r9, r3)     // Catch:{ XmlPullParserException -> 0x0039, IOException -> 0x0036 }
            goto L_0x017d
        L_0x00f2:
            java.lang.RuntimeException r9 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x0039, IOException -> 0x0036 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0039, IOException -> 0x0036 }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x0039, IOException -> 0x0036 }
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x0039, IOException -> 0x0036 }
            int r10 = r10.getLineNumber()     // Catch:{ XmlPullParserException -> 0x0039, IOException -> 0x0036 }
            r1.append(r10)     // Catch:{ XmlPullParserException -> 0x0039, IOException -> 0x0036 }
            java.lang.String r10 = r1.toString()     // Catch:{ XmlPullParserException -> 0x0039, IOException -> 0x0036 }
            r9.<init>(r10)     // Catch:{ XmlPullParserException -> 0x0039, IOException -> 0x0036 }
            throw r9     // Catch:{ XmlPullParserException -> 0x0039, IOException -> 0x0036 }
        L_0x010b:
            if (r2 == 0) goto L_0x0117
            androidx.constraintlayout.widget.c$e r0 = r2.f4825e     // Catch:{ XmlPullParserException -> 0x0039, IOException -> 0x0036 }
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r10)     // Catch:{ XmlPullParserException -> 0x0039, IOException -> 0x0036 }
            r0.b(r9, r3)     // Catch:{ XmlPullParserException -> 0x0039, IOException -> 0x0036 }
            goto L_0x017d
        L_0x0117:
            java.lang.RuntimeException r9 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x0039, IOException -> 0x0036 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0039, IOException -> 0x0036 }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x0039, IOException -> 0x0036 }
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x0039, IOException -> 0x0036 }
            int r10 = r10.getLineNumber()     // Catch:{ XmlPullParserException -> 0x0039, IOException -> 0x0036 }
            r1.append(r10)     // Catch:{ XmlPullParserException -> 0x0039, IOException -> 0x0036 }
            java.lang.String r10 = r1.toString()     // Catch:{ XmlPullParserException -> 0x0039, IOException -> 0x0036 }
            r9.<init>(r10)     // Catch:{ XmlPullParserException -> 0x0039, IOException -> 0x0036 }
            throw r9     // Catch:{ XmlPullParserException -> 0x0039, IOException -> 0x0036 }
        L_0x0130:
            if (r2 == 0) goto L_0x013c
            androidx.constraintlayout.widget.c$d r0 = r2.f4822b     // Catch:{ XmlPullParserException -> 0x0039, IOException -> 0x0036 }
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r10)     // Catch:{ XmlPullParserException -> 0x0039, IOException -> 0x0036 }
            r0.b(r9, r3)     // Catch:{ XmlPullParserException -> 0x0039, IOException -> 0x0036 }
            goto L_0x017d
        L_0x013c:
            java.lang.RuntimeException r9 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x0039, IOException -> 0x0036 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0039, IOException -> 0x0036 }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x0039, IOException -> 0x0036 }
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x0039, IOException -> 0x0036 }
            int r10 = r10.getLineNumber()     // Catch:{ XmlPullParserException -> 0x0039, IOException -> 0x0036 }
            r1.append(r10)     // Catch:{ XmlPullParserException -> 0x0039, IOException -> 0x0036 }
            java.lang.String r10 = r1.toString()     // Catch:{ XmlPullParserException -> 0x0039, IOException -> 0x0036 }
            r9.<init>(r10)     // Catch:{ XmlPullParserException -> 0x0039, IOException -> 0x0036 }
            throw r9     // Catch:{ XmlPullParserException -> 0x0039, IOException -> 0x0036 }
        L_0x0155:
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r10)     // Catch:{ XmlPullParserException -> 0x0039, IOException -> 0x0036 }
            androidx.constraintlayout.widget.c$a r2 = r8.j(r9, r0)     // Catch:{ XmlPullParserException -> 0x0039, IOException -> 0x0036 }
            androidx.constraintlayout.widget.c$b r0 = r2.f4824d     // Catch:{ XmlPullParserException -> 0x0039, IOException -> 0x0036 }
            r0.f4861d0 = r3     // Catch:{ XmlPullParserException -> 0x0039, IOException -> 0x0036 }
            goto L_0x017d
        L_0x0162:
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r10)     // Catch:{ XmlPullParserException -> 0x0039, IOException -> 0x0036 }
            androidx.constraintlayout.widget.c$a r2 = r8.j(r9, r0)     // Catch:{ XmlPullParserException -> 0x0039, IOException -> 0x0036 }
            androidx.constraintlayout.widget.c$b r0 = r2.f4824d     // Catch:{ XmlPullParserException -> 0x0039, IOException -> 0x0036 }
            r0.f4854a = r3     // Catch:{ XmlPullParserException -> 0x0039, IOException -> 0x0036 }
            r0.f4856b = r3     // Catch:{ XmlPullParserException -> 0x0039, IOException -> 0x0036 }
            goto L_0x017d
        L_0x0171:
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r10)     // Catch:{ XmlPullParserException -> 0x0039, IOException -> 0x0036 }
            androidx.constraintlayout.widget.c$a r2 = r8.j(r9, r0)     // Catch:{ XmlPullParserException -> 0x0039, IOException -> 0x0036 }
            goto L_0x017d
        L_0x017a:
            r10.getName()     // Catch:{ XmlPullParserException -> 0x0039, IOException -> 0x0036 }
        L_0x017d:
            int r0 = r10.next()     // Catch:{ XmlPullParserException -> 0x0039, IOException -> 0x0036 }
            goto L_0x0006
        L_0x0183:
            r9.printStackTrace()
            goto L_0x018a
        L_0x0187:
            r9.printStackTrace()
        L_0x018a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.c.m(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }

    public final void o(Context context, a aVar, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        for (int i4 = 0; i4 < indexCount; i4++) {
            int index = typedArray.getIndex(i4);
            if (!(index == C.d.f488t || C.d.f327L == index || C.d.f332M == index)) {
                aVar.f4823c.f4891a = true;
                aVar.f4824d.f4856b = true;
                aVar.f4822b.f4898a = true;
                aVar.f4825e.f4904a = true;
            }
            switch (f4817e.get(index)) {
                case 1:
                    b bVar = aVar.f4824d;
                    bVar.f4879p = n(typedArray, index, bVar.f4879p);
                    break;
                case 2:
                    b bVar2 = aVar.f4824d;
                    bVar2.f4834G = typedArray.getDimensionPixelSize(index, bVar2.f4834G);
                    break;
                case 3:
                    b bVar3 = aVar.f4824d;
                    bVar3.f4878o = n(typedArray, index, bVar3.f4878o);
                    break;
                case 4:
                    b bVar4 = aVar.f4824d;
                    bVar4.f4877n = n(typedArray, index, bVar4.f4877n);
                    break;
                case 5:
                    aVar.f4824d.f4886w = typedArray.getString(index);
                    break;
                case 6:
                    b bVar5 = aVar.f4824d;
                    bVar5.f4828A = typedArray.getDimensionPixelOffset(index, bVar5.f4828A);
                    break;
                case 7:
                    b bVar6 = aVar.f4824d;
                    bVar6.f4829B = typedArray.getDimensionPixelOffset(index, bVar6.f4829B);
                    break;
                case 8:
                    b bVar7 = aVar.f4824d;
                    bVar7.f4835H = typedArray.getDimensionPixelSize(index, bVar7.f4835H);
                    break;
                case IBulkCursor.WANTS_ON_MOVE_TRANSACTION /*9*/:
                    b bVar8 = aVar.f4824d;
                    bVar8.f4883t = n(typedArray, index, bVar8.f4883t);
                    break;
                case IBulkCursor.GET_EXTRAS_TRANSACTION /*10*/:
                    b bVar9 = aVar.f4824d;
                    bVar9.f4882s = n(typedArray, index, bVar9.f4882s);
                    break;
                case IBulkCursor.RESPOND_TRANSACTION /*11*/:
                    b bVar10 = aVar.f4824d;
                    bVar10.f4840M = typedArray.getDimensionPixelSize(index, bVar10.f4840M);
                    break;
                case IBulkCursor.CLOSE_TRANSACTION /*12*/:
                    b bVar11 = aVar.f4824d;
                    bVar11.f4841N = typedArray.getDimensionPixelSize(index, bVar11.f4841N);
                    break;
                case 13:
                    b bVar12 = aVar.f4824d;
                    bVar12.f4837J = typedArray.getDimensionPixelSize(index, bVar12.f4837J);
                    break;
                case 14:
                    b bVar13 = aVar.f4824d;
                    bVar13.f4839L = typedArray.getDimensionPixelSize(index, bVar13.f4839L);
                    break;
                case 15:
                    b bVar14 = aVar.f4824d;
                    bVar14.f4842O = typedArray.getDimensionPixelSize(index, bVar14.f4842O);
                    break;
                case SQLiteDatabase.NO_LOCALIZED_COLLATORS /*16*/:
                    b bVar15 = aVar.f4824d;
                    bVar15.f4838K = typedArray.getDimensionPixelSize(index, bVar15.f4838K);
                    break;
                case 17:
                    b bVar16 = aVar.f4824d;
                    bVar16.f4862e = typedArray.getDimensionPixelOffset(index, bVar16.f4862e);
                    break;
                case 18:
                    b bVar17 = aVar.f4824d;
                    bVar17.f4864f = typedArray.getDimensionPixelOffset(index, bVar17.f4864f);
                    break;
                case 19:
                    b bVar18 = aVar.f4824d;
                    bVar18.f4866g = typedArray.getFloat(index, bVar18.f4866g);
                    break;
                case i.f2380c:
                    b bVar19 = aVar.f4824d;
                    bVar19.f4884u = typedArray.getFloat(index, bVar19.f4884u);
                    break;
                case 21:
                    b bVar20 = aVar.f4824d;
                    bVar20.f4860d = typedArray.getLayoutDimension(index, bVar20.f4860d);
                    break;
                case 22:
                    d dVar = aVar.f4822b;
                    dVar.f4899b = typedArray.getInt(index, dVar.f4899b);
                    d dVar2 = aVar.f4822b;
                    dVar2.f4899b = f4816d[dVar2.f4899b];
                    break;
                case 23:
                    b bVar21 = aVar.f4824d;
                    bVar21.f4858c = typedArray.getLayoutDimension(index, bVar21.f4858c);
                    break;
                case 24:
                    b bVar22 = aVar.f4824d;
                    bVar22.f4831D = typedArray.getDimensionPixelSize(index, bVar22.f4831D);
                    break;
                case 25:
                    b bVar23 = aVar.f4824d;
                    bVar23.f4868h = n(typedArray, index, bVar23.f4868h);
                    break;
                case 26:
                    b bVar24 = aVar.f4824d;
                    bVar24.f4870i = n(typedArray, index, bVar24.f4870i);
                    break;
                case 27:
                    b bVar25 = aVar.f4824d;
                    bVar25.f4830C = typedArray.getInt(index, bVar25.f4830C);
                    break;
                case 28:
                    b bVar26 = aVar.f4824d;
                    bVar26.f4832E = typedArray.getDimensionPixelSize(index, bVar26.f4832E);
                    break;
                case 29:
                    b bVar27 = aVar.f4824d;
                    bVar27.f4872j = n(typedArray, index, bVar27.f4872j);
                    break;
                case 30:
                    b bVar28 = aVar.f4824d;
                    bVar28.f4874k = n(typedArray, index, bVar28.f4874k);
                    break;
                case 31:
                    b bVar29 = aVar.f4824d;
                    bVar29.f4836I = typedArray.getDimensionPixelSize(index, bVar29.f4836I);
                    break;
                case 32:
                    b bVar30 = aVar.f4824d;
                    bVar30.f4880q = n(typedArray, index, bVar30.f4880q);
                    break;
                case 33:
                    b bVar31 = aVar.f4824d;
                    bVar31.f4881r = n(typedArray, index, bVar31.f4881r);
                    break;
                case 34:
                    b bVar32 = aVar.f4824d;
                    bVar32.f4833F = typedArray.getDimensionPixelSize(index, bVar32.f4833F);
                    break;
                case 35:
                    b bVar33 = aVar.f4824d;
                    bVar33.f4876m = n(typedArray, index, bVar33.f4876m);
                    break;
                case 36:
                    b bVar34 = aVar.f4824d;
                    bVar34.f4875l = n(typedArray, index, bVar34.f4875l);
                    break;
                case 37:
                    b bVar35 = aVar.f4824d;
                    bVar35.f4885v = typedArray.getFloat(index, bVar35.f4885v);
                    break;
                case 38:
                    aVar.f4821a = typedArray.getResourceId(index, aVar.f4821a);
                    break;
                case 39:
                    b bVar36 = aVar.f4824d;
                    bVar36.f4844Q = typedArray.getFloat(index, bVar36.f4844Q);
                    break;
                case 40:
                    b bVar37 = aVar.f4824d;
                    bVar37.f4843P = typedArray.getFloat(index, bVar37.f4843P);
                    break;
                case 41:
                    b bVar38 = aVar.f4824d;
                    bVar38.f4845R = typedArray.getInt(index, bVar38.f4845R);
                    break;
                case 42:
                    b bVar39 = aVar.f4824d;
                    bVar39.f4846S = typedArray.getInt(index, bVar39.f4846S);
                    break;
                case 43:
                    d dVar3 = aVar.f4822b;
                    dVar3.f4901d = typedArray.getFloat(index, dVar3.f4901d);
                    break;
                case 44:
                    e eVar = aVar.f4825e;
                    eVar.f4915l = true;
                    eVar.f4916m = typedArray.getDimension(index, eVar.f4916m);
                    break;
                case 45:
                    e eVar2 = aVar.f4825e;
                    eVar2.f4906c = typedArray.getFloat(index, eVar2.f4906c);
                    break;
                case 46:
                    e eVar3 = aVar.f4825e;
                    eVar3.f4907d = typedArray.getFloat(index, eVar3.f4907d);
                    break;
                case 47:
                    e eVar4 = aVar.f4825e;
                    eVar4.f4908e = typedArray.getFloat(index, eVar4.f4908e);
                    break;
                case 48:
                    e eVar5 = aVar.f4825e;
                    eVar5.f4909f = typedArray.getFloat(index, eVar5.f4909f);
                    break;
                case 49:
                    e eVar6 = aVar.f4825e;
                    eVar6.f4910g = typedArray.getDimension(index, eVar6.f4910g);
                    break;
                case 50:
                    e eVar7 = aVar.f4825e;
                    eVar7.f4911h = typedArray.getDimension(index, eVar7.f4911h);
                    break;
                case 51:
                    e eVar8 = aVar.f4825e;
                    eVar8.f4912i = typedArray.getDimension(index, eVar8.f4912i);
                    break;
                case 52:
                    e eVar9 = aVar.f4825e;
                    eVar9.f4913j = typedArray.getDimension(index, eVar9.f4913j);
                    break;
                case 53:
                    e eVar10 = aVar.f4825e;
                    eVar10.f4914k = typedArray.getDimension(index, eVar10.f4914k);
                    break;
                case 54:
                    b bVar40 = aVar.f4824d;
                    bVar40.f4847T = typedArray.getInt(index, bVar40.f4847T);
                    break;
                case 55:
                    b bVar41 = aVar.f4824d;
                    bVar41.f4848U = typedArray.getInt(index, bVar41.f4848U);
                    break;
                case 56:
                    b bVar42 = aVar.f4824d;
                    bVar42.f4849V = typedArray.getDimensionPixelSize(index, bVar42.f4849V);
                    break;
                case 57:
                    b bVar43 = aVar.f4824d;
                    bVar43.f4850W = typedArray.getDimensionPixelSize(index, bVar43.f4850W);
                    break;
                case 58:
                    b bVar44 = aVar.f4824d;
                    bVar44.f4851X = typedArray.getDimensionPixelSize(index, bVar44.f4851X);
                    break;
                case 59:
                    b bVar45 = aVar.f4824d;
                    bVar45.f4852Y = typedArray.getDimensionPixelSize(index, bVar45.f4852Y);
                    break;
                case 60:
                    e eVar11 = aVar.f4825e;
                    eVar11.f4905b = typedArray.getFloat(index, eVar11.f4905b);
                    break;
                case 61:
                    b bVar46 = aVar.f4824d;
                    bVar46.f4887x = n(typedArray, index, bVar46.f4887x);
                    break;
                case 62:
                    b bVar47 = aVar.f4824d;
                    bVar47.f4888y = typedArray.getDimensionPixelSize(index, bVar47.f4888y);
                    break;
                case 63:
                    b bVar48 = aVar.f4824d;
                    bVar48.f4889z = typedArray.getFloat(index, bVar48.f4889z);
                    break;
                case 64:
                    C0087c cVar = aVar.f4823c;
                    cVar.f4892b = n(typedArray, index, cVar.f4892b);
                    break;
                case 65:
                    if (typedArray.peekValue(index).type != 3) {
                        aVar.f4823c.f4893c = C0994a.f12686c[typedArray.getInteger(index, 0)];
                        break;
                    } else {
                        aVar.f4823c.f4893c = typedArray.getString(index);
                        break;
                    }
                case 66:
                    aVar.f4823c.f4895e = typedArray.getInt(index, 0);
                    break;
                case 67:
                    C0087c cVar2 = aVar.f4823c;
                    cVar2.f4897g = typedArray.getFloat(index, cVar2.f4897g);
                    break;
                case 68:
                    d dVar4 = aVar.f4822b;
                    dVar4.f4902e = typedArray.getFloat(index, dVar4.f4902e);
                    break;
                case 69:
                    aVar.f4824d.f4853Z = typedArray.getFloat(index, 1.0f);
                    break;
                case 70:
                    aVar.f4824d.f4855a0 = typedArray.getFloat(index, 1.0f);
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    b bVar49 = aVar.f4824d;
                    bVar49.f4857b0 = typedArray.getInt(index, bVar49.f4857b0);
                    break;
                case 73:
                    b bVar50 = aVar.f4824d;
                    bVar50.f4859c0 = typedArray.getDimensionPixelSize(index, bVar50.f4859c0);
                    break;
                case 74:
                    aVar.f4824d.f4865f0 = typedArray.getString(index);
                    break;
                case 75:
                    b bVar51 = aVar.f4824d;
                    bVar51.f4873j0 = typedArray.getBoolean(index, bVar51.f4873j0);
                    break;
                case 76:
                    C0087c cVar3 = aVar.f4823c;
                    cVar3.f4894d = typedArray.getInt(index, cVar3.f4894d);
                    break;
                case 77:
                    aVar.f4824d.f4867g0 = typedArray.getString(index);
                    break;
                case 78:
                    d dVar5 = aVar.f4822b;
                    dVar5.f4900c = typedArray.getInt(index, dVar5.f4900c);
                    break;
                case 79:
                    C0087c cVar4 = aVar.f4823c;
                    cVar4.f4896f = typedArray.getFloat(index, cVar4.f4896f);
                    break;
                case 80:
                    b bVar52 = aVar.f4824d;
                    bVar52.f4869h0 = typedArray.getBoolean(index, bVar52.f4869h0);
                    break;
                case 81:
                    b bVar53 = aVar.f4824d;
                    bVar53.f4871i0 = typedArray.getBoolean(index, bVar53.f4871i0);
                    break;
                case 82:
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + f4817e.get(index));
                    break;
                default:
                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f4817e.get(index));
                    break;
            }
        }
    }
}
