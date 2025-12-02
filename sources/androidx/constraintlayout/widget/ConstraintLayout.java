package androidx.constraintlayout.widget;

import A.d;
import A.e;
import A.f;
import A.g;
import B.b;
import Q0.i;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import net.sqlcipher.IBulkCursor;
import net.sqlcipher.database.SQLiteDatabase;

public class ConstraintLayout extends ViewGroup {

    /* renamed from: c  reason: collision with root package name */
    public SparseArray f4692c = new SparseArray();

    /* renamed from: d  reason: collision with root package name */
    public ArrayList f4693d = new ArrayList(4);

    /* renamed from: e  reason: collision with root package name */
    public f f4694e = new f();

    /* renamed from: f  reason: collision with root package name */
    public int f4695f = 0;

    /* renamed from: g  reason: collision with root package name */
    public int f4696g = 0;

    /* renamed from: h  reason: collision with root package name */
    public int f4697h = Integer.MAX_VALUE;

    /* renamed from: i  reason: collision with root package name */
    public int f4698i = Integer.MAX_VALUE;

    /* renamed from: j  reason: collision with root package name */
    public boolean f4699j = true;

    /* renamed from: k  reason: collision with root package name */
    public int f4700k = 263;

    /* renamed from: l  reason: collision with root package name */
    public c f4701l = null;

    /* renamed from: m  reason: collision with root package name */
    public C.a f4702m = null;

    /* renamed from: n  reason: collision with root package name */
    public int f4703n = -1;

    /* renamed from: o  reason: collision with root package name */
    public HashMap f4704o = new HashMap();

    /* renamed from: p  reason: collision with root package name */
    public int f4705p = -1;

    /* renamed from: q  reason: collision with root package name */
    public int f4706q = -1;

    /* renamed from: r  reason: collision with root package name */
    public int f4707r = -1;

    /* renamed from: s  reason: collision with root package name */
    public int f4708s = -1;

    /* renamed from: t  reason: collision with root package name */
    public int f4709t = 0;

    /* renamed from: u  reason: collision with root package name */
    public int f4710u = 0;

    /* renamed from: v  reason: collision with root package name */
    public SparseArray f4711v = new SparseArray();

    /* renamed from: w  reason: collision with root package name */
    public c f4712w = new c(this);

    /* renamed from: x  reason: collision with root package name */
    public int f4713x = 0;

    /* renamed from: y  reason: collision with root package name */
    public int f4714y = 0;

    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f4715a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                A.e$b[] r0 = A.e.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f4715a = r0
                A.e$b r1 = A.e.b.FIXED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f4715a     // Catch:{ NoSuchFieldError -> 0x001d }
                A.e$b r1 = A.e.b.WRAP_CONTENT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f4715a     // Catch:{ NoSuchFieldError -> 0x0028 }
                A.e$b r1 = A.e.b.MATCH_PARENT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f4715a     // Catch:{ NoSuchFieldError -> 0x0033 }
                A.e$b r1 = A.e.b.MATCH_CONSTRAINT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.a.<clinit>():void");
        }
    }

    public class c implements b.C0001b {

        /* renamed from: a  reason: collision with root package name */
        public ConstraintLayout f4784a;

        /* renamed from: b  reason: collision with root package name */
        public int f4785b;

        /* renamed from: c  reason: collision with root package name */
        public int f4786c;

        /* renamed from: d  reason: collision with root package name */
        public int f4787d;

        /* renamed from: e  reason: collision with root package name */
        public int f4788e;

        /* renamed from: f  reason: collision with root package name */
        public int f4789f;

        /* renamed from: g  reason: collision with root package name */
        public int f4790g;

        public c(ConstraintLayout constraintLayout) {
            this.f4784a = constraintLayout;
        }

        public final void a() {
            int childCount = this.f4784a.getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                this.f4784a.getChildAt(i4);
            }
            int size = this.f4784a.f4693d.size();
            if (size > 0) {
                for (int i5 = 0; i5 < size; i5++) {
                    ((b) this.f4784a.f4693d.get(i5)).h(this.f4784a);
                }
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v10, resolved type: int[]} */
        /* JADX WARNING: type inference failed for: r16v1 */
        /* JADX WARNING: type inference failed for: r16v2 */
        /* JADX WARNING: type inference failed for: r16v3 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:105:0x0191  */
        /* JADX WARNING: Removed duplicated region for block: B:106:0x019c  */
        /* JADX WARNING: Removed duplicated region for block: B:108:0x01a8  */
        /* JADX WARNING: Removed duplicated region for block: B:109:0x01b2  */
        /* JADX WARNING: Removed duplicated region for block: B:112:0x01bf  */
        /* JADX WARNING: Removed duplicated region for block: B:113:0x01c4  */
        /* JADX WARNING: Removed duplicated region for block: B:116:0x01c9  */
        /* JADX WARNING: Removed duplicated region for block: B:119:0x01d1  */
        /* JADX WARNING: Removed duplicated region for block: B:120:0x01d6  */
        /* JADX WARNING: Removed duplicated region for block: B:123:0x01db  */
        /* JADX WARNING: Removed duplicated region for block: B:126:0x01e3 A[ADDED_TO_REGION] */
        /* JADX WARNING: Removed duplicated region for block: B:132:0x01fa A[ADDED_TO_REGION] */
        /* JADX WARNING: Removed duplicated region for block: B:137:0x0206  */
        /* JADX WARNING: Removed duplicated region for block: B:139:0x020c  */
        /* JADX WARNING: Removed duplicated region for block: B:142:0x0222  */
        /* JADX WARNING: Removed duplicated region for block: B:143:0x0224  */
        /* JADX WARNING: Removed duplicated region for block: B:148:0x022f  */
        /* JADX WARNING: Removed duplicated region for block: B:149:0x0232  */
        /* JADX WARNING: Removed duplicated region for block: B:152:0x0239  */
        /* JADX WARNING: Removed duplicated region for block: B:153:0x023b  */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x00b8  */
        /* JADX WARNING: Removed duplicated region for block: B:64:0x011d  */
        /* JADX WARNING: Removed duplicated region for block: B:67:0x012c  */
        /* JADX WARNING: Removed duplicated region for block: B:68:0x012e  */
        /* JADX WARNING: Removed duplicated region for block: B:70:0x0131  */
        /* JADX WARNING: Removed duplicated region for block: B:71:0x0133  */
        /* JADX WARNING: Removed duplicated region for block: B:76:0x013d  */
        /* JADX WARNING: Removed duplicated region for block: B:77:0x013f  */
        /* JADX WARNING: Removed duplicated region for block: B:81:0x0147  */
        /* JADX WARNING: Removed duplicated region for block: B:82:0x0149  */
        /* JADX WARNING: Removed duplicated region for block: B:87:0x0153  */
        /* JADX WARNING: Removed duplicated region for block: B:88:0x0155  */
        /* JADX WARNING: Removed duplicated region for block: B:92:0x015e  */
        /* JADX WARNING: Removed duplicated region for block: B:93:0x0160  */
        /* JADX WARNING: Removed duplicated region for block: B:96:0x016b A[ADDED_TO_REGION] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(A.e r20, B.b.a r21) {
            /*
                r19 = this;
                r0 = r19
                r1 = r20
                r2 = r21
                if (r1 != 0) goto L_0x0009
                return
            L_0x0009:
                int r3 = r20.M()
                r4 = 8
                r5 = 0
                if (r3 != r4) goto L_0x001f
                boolean r3 = r20.U()
                if (r3 != 0) goto L_0x001f
                r2.f172e = r5
                r2.f173f = r5
                r2.f174g = r5
                return
            L_0x001f:
                A.e$b r3 = r2.f168a
                A.e$b r4 = r2.f169b
                int r6 = r2.f170c
                int r7 = r2.f171d
                int r8 = r0.f4785b
                int r9 = r0.f4786c
                int r8 = r8 + r9
                int r9 = r0.f4787d
                java.lang.Object r10 = r20.o()
                android.view.View r10 = (android.view.View) r10
                int[] r11 = androidx.constraintlayout.widget.ConstraintLayout.a.f4715a
                int r12 = r3.ordinal()
                r12 = r11[r12]
                r13 = 4
                r15 = 3
                r5 = 2
                r14 = 1
                if (r12 == r14) goto L_0x00a4
                if (r12 == r5) goto L_0x0098
                if (r12 == r15) goto L_0x0087
                if (r12 == r13) goto L_0x004c
                r6 = 0
            L_0x0049:
                r9 = 0
                goto L_0x00b0
            L_0x004c:
                int r6 = r0.f4789f
                r12 = -2
                int r6 = android.view.ViewGroup.getChildMeasureSpec(r6, r9, r12)
                int r9 = r1.f92l
                if (r9 != r14) goto L_0x0059
                r9 = r14
                goto L_0x005a
            L_0x0059:
                r9 = 0
            L_0x005a:
                int[] r12 = r1.f84h
                r16 = 0
                r12[r5] = r16
                boolean r13 = r2.f177j
                if (r13 == 0) goto L_0x0085
                if (r9 == 0) goto L_0x0075
                r13 = r12[r15]
                if (r13 == 0) goto L_0x0075
                r12 = r12[r16]
                int r13 = r20.N()
                if (r12 != r13) goto L_0x0073
                goto L_0x0075
            L_0x0073:
                r12 = r14
                goto L_0x0076
            L_0x0075:
                r12 = 0
            L_0x0076:
                if (r9 == 0) goto L_0x007a
                if (r12 == 0) goto L_0x0085
            L_0x007a:
                int r6 = r20.N()
                r9 = 1073741824(0x40000000, float:2.0)
                int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r9)
                goto L_0x0049
            L_0x0085:
                r9 = r14
                goto L_0x00b0
            L_0x0087:
                int r6 = r0.f4789f
                int r12 = r20.x()
                int r9 = r9 + r12
                r12 = -1
                int r6 = android.view.ViewGroup.getChildMeasureSpec(r6, r9, r12)
                int[] r9 = r1.f84h
                r9[r5] = r12
                goto L_0x0049
            L_0x0098:
                int r6 = r0.f4789f
                r12 = -2
                int r6 = android.view.ViewGroup.getChildMeasureSpec(r6, r9, r12)
                int[] r9 = r1.f84h
                r9[r5] = r12
                goto L_0x0085
            L_0x00a4:
                r9 = 1073741824(0x40000000, float:2.0)
                int r12 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r9)
                int[] r9 = r1.f84h
                r9[r5] = r6
                r6 = r12
                goto L_0x0049
            L_0x00b0:
                int r12 = r4.ordinal()
                r11 = r11[r12]
                if (r11 == r14) goto L_0x011d
                if (r11 == r5) goto L_0x0111
                if (r11 == r15) goto L_0x0100
                r7 = 4
                if (r11 == r7) goto L_0x00c3
                r7 = 0
                r11 = 0
                goto L_0x0128
            L_0x00c3:
                int r7 = r0.f4790g
                r11 = -2
                int r7 = android.view.ViewGroup.getChildMeasureSpec(r7, r8, r11)
                int r8 = r1.f94m
                if (r8 != r14) goto L_0x00d0
                r8 = r14
                goto L_0x00d1
            L_0x00d0:
                r8 = 0
            L_0x00d1:
                int[] r11 = r1.f84h
                r12 = 0
                r11[r15] = r12
                boolean r12 = r2.f177j
                if (r12 == 0) goto L_0x00fd
                if (r8 == 0) goto L_0x00eb
                r12 = r11[r5]
                if (r12 == 0) goto L_0x00eb
                r11 = r11[r14]
                int r12 = r20.t()
                if (r11 != r12) goto L_0x00e9
                goto L_0x00eb
            L_0x00e9:
                r11 = r14
                goto L_0x00ec
            L_0x00eb:
                r11 = 0
            L_0x00ec:
                if (r8 == 0) goto L_0x00f0
                if (r11 == 0) goto L_0x00fd
            L_0x00f0:
                int r7 = r20.t()
                r8 = 1073741824(0x40000000, float:2.0)
                int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r8)
            L_0x00fa:
                r11 = r7
            L_0x00fb:
                r7 = 0
                goto L_0x0128
            L_0x00fd:
                r11 = r7
                r7 = r14
                goto L_0x0128
            L_0x0100:
                int r7 = r0.f4790g
                int r11 = r20.L()
                int r8 = r8 + r11
                r11 = -1
                int r7 = android.view.ViewGroup.getChildMeasureSpec(r7, r8, r11)
                int[] r8 = r1.f84h
                r8[r15] = r11
                goto L_0x00fa
            L_0x0111:
                int r7 = r0.f4790g
                r11 = -2
                int r7 = android.view.ViewGroup.getChildMeasureSpec(r7, r8, r11)
                int[] r8 = r1.f84h
                r8[r15] = r11
                goto L_0x00fd
            L_0x011d:
                r8 = 1073741824(0x40000000, float:2.0)
                int r11 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r8)
                int[] r8 = r1.f84h
                r8[r15] = r7
                goto L_0x00fb
            L_0x0128:
                A.e$b r8 = A.e.b.MATCH_CONSTRAINT
                if (r3 != r8) goto L_0x012e
                r12 = r14
                goto L_0x012f
            L_0x012e:
                r12 = 0
            L_0x012f:
                if (r4 != r8) goto L_0x0133
                r8 = r14
                goto L_0x0134
            L_0x0133:
                r8 = 0
            L_0x0134:
                A.e$b r13 = A.e.b.MATCH_PARENT
                if (r4 == r13) goto L_0x013f
                A.e$b r15 = A.e.b.FIXED
                if (r4 != r15) goto L_0x013d
                goto L_0x013f
            L_0x013d:
                r4 = 0
                goto L_0x0140
            L_0x013f:
                r4 = r14
            L_0x0140:
                if (r3 == r13) goto L_0x0149
                A.e$b r13 = A.e.b.FIXED
                if (r3 != r13) goto L_0x0147
                goto L_0x0149
            L_0x0147:
                r3 = 0
                goto L_0x014a
            L_0x0149:
                r3 = r14
            L_0x014a:
                r13 = 0
                if (r12 == 0) goto L_0x0155
                float r15 = r1.f60Q
                int r15 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
                if (r15 <= 0) goto L_0x0155
                r15 = r14
                goto L_0x0156
            L_0x0155:
                r15 = 0
            L_0x0156:
                if (r8 == 0) goto L_0x0160
                float r14 = r1.f60Q
                int r13 = (r14 > r13 ? 1 : (r14 == r13 ? 0 : -1))
                if (r13 <= 0) goto L_0x0160
                r13 = 1
                goto L_0x0161
            L_0x0160:
                r13 = 0
            L_0x0161:
                android.view.ViewGroup$LayoutParams r14 = r10.getLayoutParams()
                androidx.constraintlayout.widget.ConstraintLayout$b r14 = (androidx.constraintlayout.widget.ConstraintLayout.b) r14
                boolean r5 = r2.f177j
                if (r5 != 0) goto L_0x0180
                if (r12 == 0) goto L_0x0180
                int r5 = r1.f92l
                if (r5 != 0) goto L_0x0180
                if (r8 == 0) goto L_0x0180
                int r5 = r1.f94m
                if (r5 == 0) goto L_0x0178
                goto L_0x0180
            L_0x0178:
                r0 = 0
                r3 = 0
                r4 = 0
                r5 = -1
                r16 = 0
                goto L_0x0220
            L_0x0180:
                r10.measure(r6, r11)
                int r5 = r10.getMeasuredWidth()
                int r8 = r10.getMeasuredHeight()
                int r12 = r10.getBaseline()
                if (r9 == 0) goto L_0x019c
                int[] r9 = r1.f84h
                r16 = 0
                r9[r16] = r5
                r18 = 2
                r9[r18] = r8
                goto L_0x01a6
            L_0x019c:
                r16 = 0
                r18 = 2
                int[] r9 = r1.f84h
                r9[r16] = r16
                r9[r18] = r16
            L_0x01a6:
                if (r7 == 0) goto L_0x01b2
                int[] r7 = r1.f84h
                r9 = 1
                r7[r9] = r8
                r17 = 3
                r7[r17] = r5
                goto L_0x01bb
            L_0x01b2:
                r9 = 1
                r17 = 3
                int[] r7 = r1.f84h
                r7[r9] = r16
                r7[r17] = r16
            L_0x01bb:
                int r7 = r1.f98o
                if (r7 <= 0) goto L_0x01c4
                int r7 = java.lang.Math.max(r7, r5)
                goto L_0x01c5
            L_0x01c4:
                r7 = r5
            L_0x01c5:
                int r9 = r1.f100p
                if (r9 <= 0) goto L_0x01cd
                int r7 = java.lang.Math.min(r9, r7)
            L_0x01cd:
                int r9 = r1.f104r
                if (r9 <= 0) goto L_0x01d6
                int r9 = java.lang.Math.max(r9, r8)
                goto L_0x01d7
            L_0x01d6:
                r9 = r8
            L_0x01d7:
                int r0 = r1.f106s
                if (r0 <= 0) goto L_0x01df
                int r9 = java.lang.Math.min(r0, r9)
            L_0x01df:
                r0 = 1056964608(0x3f000000, float:0.5)
                if (r15 == 0) goto L_0x01ed
                if (r4 == 0) goto L_0x01ed
                float r3 = r1.f60Q
                float r4 = (float) r9
                float r4 = r4 * r3
                float r4 = r4 + r0
                int r0 = (int) r4
                r7 = r0
                goto L_0x01f8
            L_0x01ed:
                if (r13 == 0) goto L_0x01f8
                if (r3 == 0) goto L_0x01f8
                float r3 = r1.f60Q
                float r4 = (float) r7
                float r4 = r4 / r3
                float r4 = r4 + r0
                int r0 = (int) r4
                r9 = r0
            L_0x01f8:
                if (r5 != r7) goto L_0x0202
                if (r8 == r9) goto L_0x01fd
                goto L_0x0202
            L_0x01fd:
                r0 = r7
                r3 = r9
                r4 = r12
            L_0x0200:
                r5 = -1
                goto L_0x0220
            L_0x0202:
                r0 = 1073741824(0x40000000, float:2.0)
                if (r5 == r7) goto L_0x020a
                int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r0)
            L_0x020a:
                if (r8 == r9) goto L_0x0210
                int r11 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r0)
            L_0x0210:
                r10.measure(r6, r11)
                int r0 = r10.getMeasuredWidth()
                int r3 = r10.getMeasuredHeight()
                int r4 = r10.getBaseline()
                goto L_0x0200
            L_0x0220:
                if (r4 == r5) goto L_0x0224
                r5 = 1
                goto L_0x0226
            L_0x0224:
                r5 = r16
            L_0x0226:
                int r6 = r2.f170c
                if (r0 != r6) goto L_0x0232
                int r6 = r2.f171d
                if (r3 == r6) goto L_0x022f
                goto L_0x0232
            L_0x022f:
                r6 = r16
                goto L_0x0233
            L_0x0232:
                r6 = 1
            L_0x0233:
                r2.f176i = r6
                boolean r6 = r14.f4740Y
                if (r6 == 0) goto L_0x023b
                r9 = 1
                goto L_0x023c
            L_0x023b:
                r9 = r5
            L_0x023c:
                if (r9 == 0) goto L_0x024a
                r5 = -1
                if (r4 == r5) goto L_0x024a
                int r1 = r20.l()
                if (r1 == r4) goto L_0x024a
                r1 = 1
                r2.f176i = r1
            L_0x024a:
                r2.f172e = r0
                r2.f173f = r3
                r2.f175h = r9
                r2.f174g = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.c.b(A.e, B.b$a):void");
        }

        public void c(int i4, int i5, int i6, int i7, int i8, int i9) {
            this.f4785b = i6;
            this.f4786c = i7;
            this.f4787d = i8;
            this.f4788e = i9;
            this.f4789f = i4;
            this.f4790g = i5;
        }
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        j(attributeSet, 0, 0);
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingLeft()) + Math.max(0, getPaddingRight());
        int max2 = Math.max(0, getPaddingStart()) + Math.max(0, getPaddingEnd());
        return max2 > 0 ? max2 : max;
    }

    public void addView(View view, int i4, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i4, layoutParams);
    }

    public void c(boolean z4, View view, e eVar, b bVar, SparseArray sparseArray) {
        int i4;
        float f4;
        e eVar2;
        e eVar3;
        e eVar4;
        e eVar5;
        View view2 = view;
        e eVar6 = eVar;
        b bVar2 = bVar;
        SparseArray sparseArray2 = sparseArray;
        bVar.a();
        bVar2.f4771o0 = false;
        eVar6.z0(view.getVisibility());
        if (bVar2.f4745b0) {
            eVar6.m0(true);
            eVar6.z0(8);
        }
        eVar6.Z(view2);
        if (view2 instanceof b) {
            ((b) view2).f(eVar6, this.f4694e.V0());
        }
        if (bVar2.f4741Z) {
            g gVar = (g) eVar6;
            int i5 = bVar2.f4763k0;
            int i6 = bVar2.f4765l0;
            float f5 = bVar2.f4767m0;
            if (f5 != -1.0f) {
                gVar.M0(f5);
            } else if (i5 != -1) {
                gVar.K0(i5);
            } else if (i6 != -1) {
                gVar.L0(i6);
            }
        } else {
            int i7 = bVar2.f4749d0;
            int i8 = bVar2.f4751e0;
            int i9 = bVar2.f4753f0;
            int i10 = bVar2.f4755g0;
            int i11 = bVar2.f4757h0;
            int i12 = bVar2.f4759i0;
            float f6 = bVar2.f4761j0;
            int i13 = bVar2.f4766m;
            if (i13 != -1) {
                e eVar7 = (e) sparseArray2.get(i13);
                if (eVar7 != null) {
                    eVar6.i(eVar7, bVar2.f4770o, bVar2.f4768n);
                }
            } else {
                if (i7 != -1) {
                    e eVar8 = (e) sparseArray2.get(i7);
                    if (eVar8 != null) {
                        d.b bVar3 = d.b.LEFT;
                        f4 = f6;
                        eVar.R(bVar3, eVar8, bVar3, bVar2.leftMargin, i11);
                    } else {
                        f4 = f6;
                    }
                } else {
                    f4 = f6;
                    if (!(i8 == -1 || (eVar5 = (e) sparseArray2.get(i8)) == null)) {
                        eVar.R(d.b.LEFT, eVar5, d.b.RIGHT, bVar2.leftMargin, i11);
                    }
                }
                if (i9 != -1) {
                    e eVar9 = (e) sparseArray2.get(i9);
                    if (eVar9 != null) {
                        eVar.R(d.b.RIGHT, eVar9, d.b.LEFT, bVar2.rightMargin, i12);
                    }
                } else if (!(i10 == -1 || (eVar4 = (e) sparseArray2.get(i10)) == null)) {
                    d.b bVar4 = d.b.RIGHT;
                    eVar.R(bVar4, eVar4, bVar4, bVar2.rightMargin, i12);
                }
                int i14 = bVar2.f4756h;
                if (i14 != -1) {
                    e eVar10 = (e) sparseArray2.get(i14);
                    if (eVar10 != null) {
                        d.b bVar5 = d.b.TOP;
                        eVar.R(bVar5, eVar10, bVar5, bVar2.topMargin, bVar2.f4777u);
                    }
                } else {
                    int i15 = bVar2.f4758i;
                    if (!(i15 == -1 || (eVar3 = (e) sparseArray2.get(i15)) == null)) {
                        eVar.R(d.b.TOP, eVar3, d.b.BOTTOM, bVar2.topMargin, bVar2.f4777u);
                    }
                }
                int i16 = bVar2.f4760j;
                if (i16 != -1) {
                    e eVar11 = (e) sparseArray2.get(i16);
                    if (eVar11 != null) {
                        eVar.R(d.b.BOTTOM, eVar11, d.b.TOP, bVar2.bottomMargin, bVar2.f4779w);
                    }
                } else {
                    int i17 = bVar2.f4762k;
                    if (!(i17 == -1 || (eVar2 = (e) sparseArray2.get(i17)) == null)) {
                        d.b bVar6 = d.b.BOTTOM;
                        eVar.R(bVar6, eVar2, bVar6, bVar2.bottomMargin, bVar2.f4779w);
                    }
                }
                int i18 = bVar2.f4764l;
                if (i18 != -1) {
                    View view3 = (View) this.f4692c.get(i18);
                    e eVar12 = (e) sparseArray2.get(bVar2.f4764l);
                    if (!(eVar12 == null || view3 == null || !(view3.getLayoutParams() instanceof b))) {
                        b bVar7 = (b) view3.getLayoutParams();
                        bVar2.f4740Y = true;
                        bVar7.f4740Y = true;
                        d.b bVar8 = d.b.BASELINE;
                        eVar6.k(bVar8).a(eVar12.k(bVar8), 0, -1, true);
                        eVar6.d0(true);
                        bVar7.f4769n0.d0(true);
                        eVar6.k(d.b.TOP).k();
                        eVar6.k(d.b.BOTTOM).k();
                    }
                }
                float f7 = f4;
                if (f7 >= 0.0f) {
                    eVar6.f0(f7);
                }
                float f8 = bVar2.f4716A;
                if (f8 >= 0.0f) {
                    eVar6.t0(f8);
                }
            }
            if (z4 && !((i4 = bVar2.f4732Q) == -1 && bVar2.f4733R == -1)) {
                eVar6.r0(i4, bVar2.f4733R);
            }
            if (bVar2.f4738W) {
                eVar6.i0(e.b.FIXED);
                eVar6.A0(bVar2.width);
                if (bVar2.width == -2) {
                    eVar6.i0(e.b.WRAP_CONTENT);
                }
            } else if (bVar2.width == -1) {
                if (bVar2.f4735T) {
                    eVar6.i0(e.b.MATCH_CONSTRAINT);
                } else {
                    eVar6.i0(e.b.MATCH_PARENT);
                }
                eVar6.k(d.b.LEFT).f29e = bVar2.leftMargin;
                eVar6.k(d.b.RIGHT).f29e = bVar2.rightMargin;
            } else {
                eVar6.i0(e.b.MATCH_CONSTRAINT);
                eVar6.A0(0);
            }
            if (bVar2.f4739X) {
                eVar6.w0(e.b.FIXED);
                eVar6.e0(bVar2.height);
                if (bVar2.height == -2) {
                    eVar6.w0(e.b.WRAP_CONTENT);
                }
            } else if (bVar2.height == -1) {
                if (bVar2.f4736U) {
                    eVar6.w0(e.b.MATCH_CONSTRAINT);
                } else {
                    eVar6.w0(e.b.MATCH_PARENT);
                }
                eVar6.k(d.b.TOP).f29e = bVar2.topMargin;
                eVar6.k(d.b.BOTTOM).f29e = bVar2.bottomMargin;
            } else {
                eVar6.w0(e.b.MATCH_CONSTRAINT);
                eVar6.e0(0);
            }
            eVar6.b0(bVar2.f4717B);
            eVar6.k0(bVar2.f4720E);
            eVar6.y0(bVar2.f4721F);
            eVar6.g0(bVar2.f4722G);
            eVar6.u0(bVar2.f4723H);
            eVar6.j0(bVar2.f4724I, bVar2.f4726K, bVar2.f4728M, bVar2.f4730O);
            eVar6.x0(bVar2.f4725J, bVar2.f4727L, bVar2.f4729N, bVar2.f4731P);
        }
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof b;
    }

    /* renamed from: d */
    public b generateDefaultLayoutParams() {
        return new b(-2, -2);
    }

    public void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.f4693d;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i4 = 0; i4 < size; i4++) {
                ((b) this.f4693d.get(i4)).i(this);
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            int childCount = getChildCount();
            float width = (float) getWidth();
            float height = (float) getHeight();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                if (!(childAt.getVisibility() == 8 || (tag = childAt.getTag()) == null || !(tag instanceof String))) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i6 = (int) ((((float) parseInt) / 1080.0f) * width);
                        int i7 = (int) ((((float) parseInt2) / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f4 = (float) i6;
                        float f5 = (float) i7;
                        float f6 = (float) (i6 + ((int) ((((float) parseInt3) / 1080.0f) * width)));
                        Canvas canvas2 = canvas;
                        float f7 = f5;
                        float f8 = f5;
                        float f9 = f6;
                        float f10 = f4;
                        Paint paint2 = paint;
                        canvas2.drawLine(f4, f7, f9, f8, paint);
                        float parseInt4 = (float) (i7 + ((int) ((((float) Integer.parseInt(split[3])) / 1920.0f) * height)));
                        float f11 = f6;
                        float f12 = parseInt4;
                        canvas2.drawLine(f11, f8, f9, f12, paint);
                        float f13 = parseInt4;
                        float f14 = f10;
                        canvas2.drawLine(f11, f13, f14, f12, paint);
                        float f15 = f10;
                        canvas2.drawLine(f15, f13, f14, f8, paint);
                        paint.setColor(-16711936);
                        float f16 = f6;
                        Paint paint3 = paint;
                        canvas2.drawLine(f15, f8, f16, parseInt4, paint);
                        canvas2.drawLine(f15, parseInt4, f16, f8, paint);
                    }
                }
            }
        }
    }

    /* renamed from: e */
    public b generateLayoutParams(AttributeSet attributeSet) {
        return new b(getContext(), attributeSet);
    }

    public Object f(int i4, Object obj) {
        if (i4 != 0 || !(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        HashMap hashMap = this.f4704o;
        if (hashMap == null || !hashMap.containsKey(str)) {
            return null;
        }
        return this.f4704o.get(str);
    }

    public void forceLayout() {
        l();
        super.forceLayout();
    }

    public final e g(int i4) {
        if (i4 == 0) {
            return this.f4694e;
        }
        View view = (View) this.f4692c.get(i4);
        if (view == null && (view = findViewById(i4)) != null && view != this && view.getParent() == this) {
            onViewAdded(view);
        }
        if (view == this) {
            return this.f4694e;
        }
        if (view == null) {
            return null;
        }
        return ((b) view.getLayoutParams()).f4769n0;
    }

    public int getMaxHeight() {
        return this.f4698i;
    }

    public int getMaxWidth() {
        return this.f4697h;
    }

    public int getMinHeight() {
        return this.f4696g;
    }

    public int getMinWidth() {
        return this.f4695f;
    }

    public int getOptimizationLevel() {
        return this.f4694e.R0();
    }

    public View h(int i4) {
        return (View) this.f4692c.get(i4);
    }

    public final e i(View view) {
        if (view == this) {
            return this.f4694e;
        }
        if (view == null) {
            return null;
        }
        return ((b) view.getLayoutParams()).f4769n0;
    }

    public final void j(AttributeSet attributeSet, int i4, int i5) {
        this.f4694e.Z(this);
        this.f4694e.a1(this.f4712w);
        this.f4692c.put(getId(), this);
        this.f4701l = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C.d.f395a1, i4, i5);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i6 = 0; i6 < indexCount; i6++) {
                int index = obtainStyledAttributes.getIndex(i6);
                if (index == C.d.f415e1) {
                    this.f4695f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f4695f);
                } else if (index == C.d.f420f1) {
                    this.f4696g = obtainStyledAttributes.getDimensionPixelOffset(index, this.f4696g);
                } else if (index == C.d.f405c1) {
                    this.f4697h = obtainStyledAttributes.getDimensionPixelOffset(index, this.f4697h);
                } else if (index == C.d.f410d1) {
                    this.f4698i = obtainStyledAttributes.getDimensionPixelOffset(index, this.f4698i);
                } else if (index == C.d.f446k2) {
                    this.f4700k = obtainStyledAttributes.getInt(index, this.f4700k);
                } else if (index == C.d.f450l1) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            m(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f4702m = null;
                        }
                    }
                } else if (index == C.d.f440j1) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        c cVar = new c();
                        this.f4701l = cVar;
                        cVar.l(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f4701l = null;
                    }
                    this.f4703n = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f4694e.b1(this.f4700k);
    }

    public boolean k() {
        return (getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection();
    }

    public final void l() {
        this.f4699j = true;
        this.f4705p = -1;
        this.f4706q = -1;
        this.f4707r = -1;
        this.f4708s = -1;
        this.f4709t = 0;
        this.f4710u = 0;
    }

    public void m(int i4) {
        this.f4702m = new C.a(getContext(), this, i4);
    }

    public void n(int i4, int i5, int i6, int i7, boolean z4, boolean z5) {
        c cVar = this.f4712w;
        int i8 = cVar.f4788e;
        int resolveSizeAndState = View.resolveSizeAndState(i6 + cVar.f4787d, i4, 0);
        int min = Math.min(this.f4697h, resolveSizeAndState & 16777215);
        int min2 = Math.min(this.f4698i, View.resolveSizeAndState(i7 + i8, i5, 0) & 16777215);
        if (z4) {
            min |= 16777216;
        }
        if (z5) {
            min2 |= 16777216;
        }
        setMeasuredDimension(min, min2);
        this.f4705p = min;
        this.f4706q = min2;
    }

    public void o(f fVar, int i4, int i5, int i6) {
        int mode = View.MeasureSpec.getMode(i5);
        int size = View.MeasureSpec.getSize(i5);
        int mode2 = View.MeasureSpec.getMode(i6);
        int size2 = View.MeasureSpec.getSize(i6);
        int max = Math.max(0, getPaddingTop());
        int max2 = Math.max(0, getPaddingBottom());
        int i7 = max + max2;
        int paddingWidth = getPaddingWidth();
        this.f4712w.c(i5, i6, max, max2, paddingWidth, i7);
        int max3 = Math.max(0, getPaddingStart());
        int max4 = Math.max(0, getPaddingEnd());
        int max5 = (max3 > 0 || max4 > 0) ? k() ? max4 : max3 : Math.max(0, getPaddingLeft());
        int i8 = size - paddingWidth;
        int i9 = size2 - i7;
        r(fVar, mode, i8, mode2, i9);
        fVar.X0(i4, mode, i8, mode2, i9, this.f4705p, this.f4706q, max5, max);
    }

    public void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            b bVar = (b) childAt.getLayoutParams();
            e eVar = bVar.f4769n0;
            if ((childAt.getVisibility() != 8 || bVar.f4741Z || bVar.f4743a0 || bVar.f4747c0 || isInEditMode) && !bVar.f4745b0) {
                int O4 = eVar.O();
                int P4 = eVar.P();
                childAt.layout(O4, P4, eVar.N() + O4, eVar.t() + P4);
            }
        }
        int size = this.f4693d.size();
        if (size > 0) {
            for (int i9 = 0; i9 < size; i9++) {
                ((b) this.f4693d.get(i9)).g(this);
            }
        }
    }

    public void onMeasure(int i4, int i5) {
        this.f4713x = i4;
        this.f4714y = i5;
        this.f4694e.c1(k());
        if (this.f4699j) {
            this.f4699j = false;
            if (s()) {
                this.f4694e.e1();
            }
        }
        o(this.f4694e, this.f4700k, i4, i5);
        n(i4, i5, this.f4694e.N(), this.f4694e.t(), this.f4694e.W0(), this.f4694e.U0());
    }

    public void onViewAdded(View view) {
        super.onViewAdded(view);
        e i4 = i(view);
        if ((view instanceof Guideline) && !(i4 instanceof g)) {
            b bVar = (b) view.getLayoutParams();
            g gVar = new g();
            bVar.f4769n0 = gVar;
            bVar.f4741Z = true;
            gVar.N0(bVar.f4734S);
        }
        if (view instanceof b) {
            b bVar2 = (b) view;
            bVar2.k();
            ((b) view.getLayoutParams()).f4743a0 = true;
            if (!this.f4693d.contains(bVar2)) {
                this.f4693d.add(bVar2);
            }
        }
        this.f4692c.put(view.getId(), view);
        this.f4699j = true;
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f4692c.remove(view.getId());
        this.f4694e.H0(i(view));
        this.f4693d.remove(view);
        this.f4699j = true;
    }

    public final void p() {
        boolean isInEditMode = isInEditMode();
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            e i5 = i(getChildAt(i4));
            if (i5 != null) {
                i5.W();
            }
        }
        if (isInEditMode) {
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = getChildAt(i6);
                try {
                    String resourceName = getResources().getResourceName(childAt.getId());
                    q(0, resourceName, Integer.valueOf(childAt.getId()));
                    int indexOf = resourceName.indexOf(47);
                    if (indexOf != -1) {
                        resourceName = resourceName.substring(indexOf + 1);
                    }
                    g(childAt.getId()).a0(resourceName);
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
        if (this.f4703n != -1) {
            for (int i7 = 0; i7 < childCount; i7++) {
                getChildAt(i7).getId();
            }
        }
        c cVar = this.f4701l;
        if (cVar != null) {
            cVar.d(this, true);
        }
        this.f4694e.I0();
        int size = this.f4693d.size();
        if (size > 0) {
            for (int i8 = 0; i8 < size; i8++) {
                ((b) this.f4693d.get(i8)).j(this);
            }
        }
        for (int i9 = 0; i9 < childCount; i9++) {
            getChildAt(i9);
        }
        this.f4711v.clear();
        this.f4711v.put(0, this.f4694e);
        this.f4711v.put(getId(), this.f4694e);
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt2 = getChildAt(i10);
            this.f4711v.put(childAt2.getId(), i(childAt2));
        }
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt3 = getChildAt(i11);
            e i12 = i(childAt3);
            if (i12 != null) {
                this.f4694e.a(i12);
                c(isInEditMode, childAt3, i12, (b) childAt3.getLayoutParams(), this.f4711v);
            }
        }
    }

    public void q(int i4, Object obj, Object obj2) {
        if (i4 == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.f4704o == null) {
                this.f4704o = new HashMap();
            }
            String str = (String) obj;
            int indexOf = str.indexOf("/");
            if (indexOf != -1) {
                str = str.substring(indexOf + 1);
            }
            Integer num = (Integer) obj2;
            num.intValue();
            this.f4704o.put(str, num);
        }
    }

    public void r(f fVar, int i4, int i5, int i6, int i7) {
        e.b bVar;
        c cVar = this.f4712w;
        int i8 = cVar.f4788e;
        int i9 = cVar.f4787d;
        e.b bVar2 = e.b.FIXED;
        int childCount = getChildCount();
        if (i4 != Integer.MIN_VALUE) {
            if (i4 == 0) {
                bVar = e.b.WRAP_CONTENT;
                if (childCount == 0) {
                    i5 = Math.max(0, this.f4695f);
                }
            } else if (i4 != 1073741824) {
                bVar = bVar2;
            } else {
                i5 = Math.min(this.f4697h - i9, i5);
                bVar = bVar2;
            }
            i5 = 0;
        } else {
            bVar = e.b.WRAP_CONTENT;
            if (childCount == 0) {
                i5 = Math.max(0, this.f4695f);
            }
        }
        if (i6 != Integer.MIN_VALUE) {
            if (i6 == 0) {
                bVar2 = e.b.WRAP_CONTENT;
                if (childCount == 0) {
                    i7 = Math.max(0, this.f4696g);
                }
            } else if (i6 == 1073741824) {
                i7 = Math.min(this.f4698i - i8, i7);
            }
            i7 = 0;
        } else {
            bVar2 = e.b.WRAP_CONTENT;
            if (childCount == 0) {
                i7 = Math.max(0, this.f4696g);
            }
        }
        if (!(i5 == fVar.N() && i7 == fVar.t())) {
            fVar.T0();
        }
        fVar.B0(0);
        fVar.C0(0);
        fVar.o0(this.f4697h - i9);
        fVar.n0(this.f4698i - i8);
        fVar.q0(0);
        fVar.p0(0);
        fVar.i0(bVar);
        fVar.A0(i5);
        fVar.w0(bVar2);
        fVar.e0(i7);
        fVar.q0(this.f4695f - i9);
        fVar.p0(this.f4696g - i8);
    }

    public void removeView(View view) {
        super.removeView(view);
    }

    public void requestLayout() {
        l();
        super.requestLayout();
    }

    public final boolean s() {
        int childCount = getChildCount();
        boolean z4 = false;
        int i4 = 0;
        while (true) {
            if (i4 >= childCount) {
                break;
            } else if (getChildAt(i4).isLayoutRequested()) {
                z4 = true;
                break;
            } else {
                i4++;
            }
        }
        if (z4) {
            p();
        }
        return z4;
    }

    public void setConstraintSet(c cVar) {
        this.f4701l = cVar;
    }

    public void setId(int i4) {
        this.f4692c.remove(getId());
        super.setId(i4);
        this.f4692c.put(getId(), this);
    }

    public void setMaxHeight(int i4) {
        if (i4 != this.f4698i) {
            this.f4698i = i4;
            requestLayout();
        }
    }

    public void setMaxWidth(int i4) {
        if (i4 != this.f4697h) {
            this.f4697h = i4;
            requestLayout();
        }
    }

    public void setMinHeight(int i4) {
        if (i4 != this.f4696g) {
            this.f4696g = i4;
            requestLayout();
        }
    }

    public void setMinWidth(int i4) {
        if (i4 != this.f4695f) {
            this.f4695f = i4;
            requestLayout();
        }
    }

    public void setOnConstraintsChanged(C.b bVar) {
        C.a aVar = this.f4702m;
        if (aVar != null) {
            aVar.c(bVar);
        }
    }

    public void setOptimizationLevel(int i4) {
        this.f4700k = i4;
        this.f4694e.b1(i4);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new b(layoutParams);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        j(attributeSet, i4, 0);
    }

    public static class b extends ViewGroup.MarginLayoutParams {

        /* renamed from: A  reason: collision with root package name */
        public float f4716A = 0.5f;

        /* renamed from: B  reason: collision with root package name */
        public String f4717B = null;

        /* renamed from: C  reason: collision with root package name */
        public float f4718C = 0.0f;

        /* renamed from: D  reason: collision with root package name */
        public int f4719D = 1;

        /* renamed from: E  reason: collision with root package name */
        public float f4720E = -1.0f;

        /* renamed from: F  reason: collision with root package name */
        public float f4721F = -1.0f;

        /* renamed from: G  reason: collision with root package name */
        public int f4722G = 0;

        /* renamed from: H  reason: collision with root package name */
        public int f4723H = 0;

        /* renamed from: I  reason: collision with root package name */
        public int f4724I = 0;

        /* renamed from: J  reason: collision with root package name */
        public int f4725J = 0;

        /* renamed from: K  reason: collision with root package name */
        public int f4726K = 0;

        /* renamed from: L  reason: collision with root package name */
        public int f4727L = 0;

        /* renamed from: M  reason: collision with root package name */
        public int f4728M = 0;

        /* renamed from: N  reason: collision with root package name */
        public int f4729N = 0;

        /* renamed from: O  reason: collision with root package name */
        public float f4730O = 1.0f;

        /* renamed from: P  reason: collision with root package name */
        public float f4731P = 1.0f;

        /* renamed from: Q  reason: collision with root package name */
        public int f4732Q = -1;

        /* renamed from: R  reason: collision with root package name */
        public int f4733R = -1;

        /* renamed from: S  reason: collision with root package name */
        public int f4734S = -1;

        /* renamed from: T  reason: collision with root package name */
        public boolean f4735T = false;

        /* renamed from: U  reason: collision with root package name */
        public boolean f4736U = false;

        /* renamed from: V  reason: collision with root package name */
        public String f4737V = null;

        /* renamed from: W  reason: collision with root package name */
        public boolean f4738W = true;

        /* renamed from: X  reason: collision with root package name */
        public boolean f4739X = true;

        /* renamed from: Y  reason: collision with root package name */
        public boolean f4740Y = false;

        /* renamed from: Z  reason: collision with root package name */
        public boolean f4741Z = false;

        /* renamed from: a  reason: collision with root package name */
        public int f4742a = -1;

        /* renamed from: a0  reason: collision with root package name */
        public boolean f4743a0 = false;

        /* renamed from: b  reason: collision with root package name */
        public int f4744b = -1;

        /* renamed from: b0  reason: collision with root package name */
        public boolean f4745b0 = false;

        /* renamed from: c  reason: collision with root package name */
        public float f4746c = -1.0f;

        /* renamed from: c0  reason: collision with root package name */
        public boolean f4747c0 = false;

        /* renamed from: d  reason: collision with root package name */
        public int f4748d = -1;

        /* renamed from: d0  reason: collision with root package name */
        public int f4749d0 = -1;

        /* renamed from: e  reason: collision with root package name */
        public int f4750e = -1;

        /* renamed from: e0  reason: collision with root package name */
        public int f4751e0 = -1;

        /* renamed from: f  reason: collision with root package name */
        public int f4752f = -1;

        /* renamed from: f0  reason: collision with root package name */
        public int f4753f0 = -1;

        /* renamed from: g  reason: collision with root package name */
        public int f4754g = -1;

        /* renamed from: g0  reason: collision with root package name */
        public int f4755g0 = -1;

        /* renamed from: h  reason: collision with root package name */
        public int f4756h = -1;

        /* renamed from: h0  reason: collision with root package name */
        public int f4757h0 = -1;

        /* renamed from: i  reason: collision with root package name */
        public int f4758i = -1;

        /* renamed from: i0  reason: collision with root package name */
        public int f4759i0 = -1;

        /* renamed from: j  reason: collision with root package name */
        public int f4760j = -1;

        /* renamed from: j0  reason: collision with root package name */
        public float f4761j0 = 0.5f;

        /* renamed from: k  reason: collision with root package name */
        public int f4762k = -1;

        /* renamed from: k0  reason: collision with root package name */
        public int f4763k0;

        /* renamed from: l  reason: collision with root package name */
        public int f4764l = -1;

        /* renamed from: l0  reason: collision with root package name */
        public int f4765l0;

        /* renamed from: m  reason: collision with root package name */
        public int f4766m = -1;

        /* renamed from: m0  reason: collision with root package name */
        public float f4767m0;

        /* renamed from: n  reason: collision with root package name */
        public int f4768n = 0;

        /* renamed from: n0  reason: collision with root package name */
        public e f4769n0 = new e();

        /* renamed from: o  reason: collision with root package name */
        public float f4770o = 0.0f;

        /* renamed from: o0  reason: collision with root package name */
        public boolean f4771o0 = false;

        /* renamed from: p  reason: collision with root package name */
        public int f4772p = -1;

        /* renamed from: q  reason: collision with root package name */
        public int f4773q = -1;

        /* renamed from: r  reason: collision with root package name */
        public int f4774r = -1;

        /* renamed from: s  reason: collision with root package name */
        public int f4775s = -1;

        /* renamed from: t  reason: collision with root package name */
        public int f4776t = -1;

        /* renamed from: u  reason: collision with root package name */
        public int f4777u = -1;

        /* renamed from: v  reason: collision with root package name */
        public int f4778v = -1;

        /* renamed from: w  reason: collision with root package name */
        public int f4779w = -1;

        /* renamed from: x  reason: collision with root package name */
        public int f4780x = -1;

        /* renamed from: y  reason: collision with root package name */
        public int f4781y = -1;

        /* renamed from: z  reason: collision with root package name */
        public float f4782z = 0.5f;

        public static class a {

            /* renamed from: a  reason: collision with root package name */
            public static final SparseIntArray f4783a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f4783a = sparseIntArray;
                sparseIntArray.append(C.d.f324K1, 8);
                sparseIntArray.append(C.d.f329L1, 9);
                sparseIntArray.append(C.d.f339N1, 10);
                sparseIntArray.append(C.d.f344O1, 11);
                sparseIntArray.append(C.d.f371U1, 12);
                sparseIntArray.append(C.d.f367T1, 13);
                sparseIntArray.append(C.d.f485s1, 14);
                sparseIntArray.append(C.d.f480r1, 15);
                sparseIntArray.append(C.d.f470p1, 16);
                sparseIntArray.append(C.d.f490t1, 2);
                sparseIntArray.append(C.d.f500v1, 3);
                sparseIntArray.append(C.d.f495u1, 4);
                sparseIntArray.append(C.d.f406c2, 49);
                sparseIntArray.append(C.d.f411d2, 50);
                sparseIntArray.append(C.d.f520z1, 5);
                sparseIntArray.append(C.d.f274A1, 6);
                sparseIntArray.append(C.d.f279B1, 7);
                sparseIntArray.append(C.d.f400b1, 1);
                sparseIntArray.append(C.d.f349P1, 17);
                sparseIntArray.append(C.d.f354Q1, 18);
                sparseIntArray.append(C.d.f515y1, 19);
                sparseIntArray.append(C.d.f510x1, 20);
                sparseIntArray.append(C.d.f426g2, 21);
                sparseIntArray.append(C.d.f441j2, 22);
                sparseIntArray.append(C.d.f431h2, 23);
                sparseIntArray.append(C.d.f416e2, 24);
                sparseIntArray.append(C.d.f436i2, 25);
                sparseIntArray.append(C.d.f421f2, 26);
                sparseIntArray.append(C.d.f304G1, 29);
                sparseIntArray.append(C.d.f375V1, 30);
                sparseIntArray.append(C.d.f505w1, 44);
                sparseIntArray.append(C.d.f314I1, 45);
                sparseIntArray.append(C.d.f383X1, 46);
                sparseIntArray.append(C.d.f309H1, 47);
                sparseIntArray.append(C.d.f379W1, 48);
                sparseIntArray.append(C.d.f460n1, 27);
                sparseIntArray.append(C.d.f455m1, 28);
                sparseIntArray.append(C.d.f387Y1, 31);
                sparseIntArray.append(C.d.f284C1, 32);
                sparseIntArray.append(C.d.f396a2, 33);
                sparseIntArray.append(C.d.f391Z1, 34);
                sparseIntArray.append(C.d.f401b2, 35);
                sparseIntArray.append(C.d.f294E1, 36);
                sparseIntArray.append(C.d.f289D1, 37);
                sparseIntArray.append(C.d.f299F1, 38);
                sparseIntArray.append(C.d.f319J1, 39);
                sparseIntArray.append(C.d.f363S1, 40);
                sparseIntArray.append(C.d.f334M1, 41);
                sparseIntArray.append(C.d.f475q1, 42);
                sparseIntArray.append(C.d.f465o1, 43);
                sparseIntArray.append(C.d.f359R1, 51);
            }
        }

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            int i4;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C.d.f395a1);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i5 = 0; i5 < indexCount; i5++) {
                int index = obtainStyledAttributes.getIndex(i5);
                int i6 = a.f4783a.get(index);
                switch (i6) {
                    case 1:
                        this.f4734S = obtainStyledAttributes.getInt(index, this.f4734S);
                        break;
                    case 2:
                        int resourceId = obtainStyledAttributes.getResourceId(index, this.f4766m);
                        this.f4766m = resourceId;
                        if (resourceId != -1) {
                            break;
                        } else {
                            this.f4766m = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 3:
                        this.f4768n = obtainStyledAttributes.getDimensionPixelSize(index, this.f4768n);
                        break;
                    case 4:
                        float f4 = obtainStyledAttributes.getFloat(index, this.f4770o) % 360.0f;
                        this.f4770o = f4;
                        if (f4 >= 0.0f) {
                            break;
                        } else {
                            this.f4770o = (360.0f - f4) % 360.0f;
                            break;
                        }
                    case 5:
                        this.f4742a = obtainStyledAttributes.getDimensionPixelOffset(index, this.f4742a);
                        break;
                    case 6:
                        this.f4744b = obtainStyledAttributes.getDimensionPixelOffset(index, this.f4744b);
                        break;
                    case 7:
                        this.f4746c = obtainStyledAttributes.getFloat(index, this.f4746c);
                        break;
                    case 8:
                        int resourceId2 = obtainStyledAttributes.getResourceId(index, this.f4748d);
                        this.f4748d = resourceId2;
                        if (resourceId2 != -1) {
                            break;
                        } else {
                            this.f4748d = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case IBulkCursor.WANTS_ON_MOVE_TRANSACTION /*9*/:
                        int resourceId3 = obtainStyledAttributes.getResourceId(index, this.f4750e);
                        this.f4750e = resourceId3;
                        if (resourceId3 != -1) {
                            break;
                        } else {
                            this.f4750e = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case IBulkCursor.GET_EXTRAS_TRANSACTION /*10*/:
                        int resourceId4 = obtainStyledAttributes.getResourceId(index, this.f4752f);
                        this.f4752f = resourceId4;
                        if (resourceId4 != -1) {
                            break;
                        } else {
                            this.f4752f = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case IBulkCursor.RESPOND_TRANSACTION /*11*/:
                        int resourceId5 = obtainStyledAttributes.getResourceId(index, this.f4754g);
                        this.f4754g = resourceId5;
                        if (resourceId5 != -1) {
                            break;
                        } else {
                            this.f4754g = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case IBulkCursor.CLOSE_TRANSACTION /*12*/:
                        int resourceId6 = obtainStyledAttributes.getResourceId(index, this.f4756h);
                        this.f4756h = resourceId6;
                        if (resourceId6 != -1) {
                            break;
                        } else {
                            this.f4756h = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 13:
                        int resourceId7 = obtainStyledAttributes.getResourceId(index, this.f4758i);
                        this.f4758i = resourceId7;
                        if (resourceId7 != -1) {
                            break;
                        } else {
                            this.f4758i = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 14:
                        int resourceId8 = obtainStyledAttributes.getResourceId(index, this.f4760j);
                        this.f4760j = resourceId8;
                        if (resourceId8 != -1) {
                            break;
                        } else {
                            this.f4760j = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 15:
                        int resourceId9 = obtainStyledAttributes.getResourceId(index, this.f4762k);
                        this.f4762k = resourceId9;
                        if (resourceId9 != -1) {
                            break;
                        } else {
                            this.f4762k = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case SQLiteDatabase.NO_LOCALIZED_COLLATORS /*16*/:
                        int resourceId10 = obtainStyledAttributes.getResourceId(index, this.f4764l);
                        this.f4764l = resourceId10;
                        if (resourceId10 != -1) {
                            break;
                        } else {
                            this.f4764l = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 17:
                        int resourceId11 = obtainStyledAttributes.getResourceId(index, this.f4772p);
                        this.f4772p = resourceId11;
                        if (resourceId11 != -1) {
                            break;
                        } else {
                            this.f4772p = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 18:
                        int resourceId12 = obtainStyledAttributes.getResourceId(index, this.f4773q);
                        this.f4773q = resourceId12;
                        if (resourceId12 != -1) {
                            break;
                        } else {
                            this.f4773q = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 19:
                        int resourceId13 = obtainStyledAttributes.getResourceId(index, this.f4774r);
                        this.f4774r = resourceId13;
                        if (resourceId13 != -1) {
                            break;
                        } else {
                            this.f4774r = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case i.f2380c:
                        int resourceId14 = obtainStyledAttributes.getResourceId(index, this.f4775s);
                        this.f4775s = resourceId14;
                        if (resourceId14 != -1) {
                            break;
                        } else {
                            this.f4775s = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 21:
                        this.f4776t = obtainStyledAttributes.getDimensionPixelSize(index, this.f4776t);
                        break;
                    case 22:
                        this.f4777u = obtainStyledAttributes.getDimensionPixelSize(index, this.f4777u);
                        break;
                    case 23:
                        this.f4778v = obtainStyledAttributes.getDimensionPixelSize(index, this.f4778v);
                        break;
                    case 24:
                        this.f4779w = obtainStyledAttributes.getDimensionPixelSize(index, this.f4779w);
                        break;
                    case 25:
                        this.f4780x = obtainStyledAttributes.getDimensionPixelSize(index, this.f4780x);
                        break;
                    case 26:
                        this.f4781y = obtainStyledAttributes.getDimensionPixelSize(index, this.f4781y);
                        break;
                    case 27:
                        this.f4735T = obtainStyledAttributes.getBoolean(index, this.f4735T);
                        break;
                    case 28:
                        this.f4736U = obtainStyledAttributes.getBoolean(index, this.f4736U);
                        break;
                    case 29:
                        this.f4782z = obtainStyledAttributes.getFloat(index, this.f4782z);
                        break;
                    case 30:
                        this.f4716A = obtainStyledAttributes.getFloat(index, this.f4716A);
                        break;
                    case 31:
                        int i7 = obtainStyledAttributes.getInt(index, 0);
                        this.f4724I = i7;
                        if (i7 != 1) {
                            break;
                        } else {
                            Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                            break;
                        }
                    case 32:
                        int i8 = obtainStyledAttributes.getInt(index, 0);
                        this.f4725J = i8;
                        if (i8 != 1) {
                            break;
                        } else {
                            Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                            break;
                        }
                    case 33:
                        try {
                            this.f4726K = obtainStyledAttributes.getDimensionPixelSize(index, this.f4726K);
                            break;
                        } catch (Exception unused) {
                            if (obtainStyledAttributes.getInt(index, this.f4726K) != -2) {
                                break;
                            } else {
                                this.f4726K = -2;
                                break;
                            }
                        }
                    case 34:
                        try {
                            this.f4728M = obtainStyledAttributes.getDimensionPixelSize(index, this.f4728M);
                            break;
                        } catch (Exception unused2) {
                            if (obtainStyledAttributes.getInt(index, this.f4728M) != -2) {
                                break;
                            } else {
                                this.f4728M = -2;
                                break;
                            }
                        }
                    case 35:
                        this.f4730O = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.f4730O));
                        this.f4724I = 2;
                        break;
                    case 36:
                        try {
                            this.f4727L = obtainStyledAttributes.getDimensionPixelSize(index, this.f4727L);
                            break;
                        } catch (Exception unused3) {
                            if (obtainStyledAttributes.getInt(index, this.f4727L) != -2) {
                                break;
                            } else {
                                this.f4727L = -2;
                                break;
                            }
                        }
                    case 37:
                        try {
                            this.f4729N = obtainStyledAttributes.getDimensionPixelSize(index, this.f4729N);
                            break;
                        } catch (Exception unused4) {
                            if (obtainStyledAttributes.getInt(index, this.f4729N) != -2) {
                                break;
                            } else {
                                this.f4729N = -2;
                                break;
                            }
                        }
                    case 38:
                        this.f4731P = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.f4731P));
                        this.f4725J = 2;
                        break;
                    default:
                        switch (i6) {
                            case 44:
                                String string = obtainStyledAttributes.getString(index);
                                this.f4717B = string;
                                this.f4718C = Float.NaN;
                                this.f4719D = -1;
                                if (string == null) {
                                    break;
                                } else {
                                    int length = string.length();
                                    int indexOf = this.f4717B.indexOf(44);
                                    if (indexOf <= 0 || indexOf >= length - 1) {
                                        i4 = 0;
                                    } else {
                                        String substring = this.f4717B.substring(0, indexOf);
                                        if (substring.equalsIgnoreCase("W")) {
                                            this.f4719D = 0;
                                        } else if (substring.equalsIgnoreCase("H")) {
                                            this.f4719D = 1;
                                        }
                                        i4 = indexOf + 1;
                                    }
                                    int indexOf2 = this.f4717B.indexOf(58);
                                    if (indexOf2 >= 0 && indexOf2 < length - 1) {
                                        String substring2 = this.f4717B.substring(i4, indexOf2);
                                        String substring3 = this.f4717B.substring(indexOf2 + 1);
                                        if (substring2.length() > 0 && substring3.length() > 0) {
                                            try {
                                                float parseFloat = Float.parseFloat(substring2);
                                                float parseFloat2 = Float.parseFloat(substring3);
                                                if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                                                    if (this.f4719D != 1) {
                                                        this.f4718C = Math.abs(parseFloat / parseFloat2);
                                                        break;
                                                    } else {
                                                        this.f4718C = Math.abs(parseFloat2 / parseFloat);
                                                        break;
                                                    }
                                                }
                                            } catch (NumberFormatException unused5) {
                                                break;
                                            }
                                        }
                                    } else {
                                        String substring4 = this.f4717B.substring(i4);
                                        if (substring4.length() <= 0) {
                                            break;
                                        } else {
                                            this.f4718C = Float.parseFloat(substring4);
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 45:
                                this.f4720E = obtainStyledAttributes.getFloat(index, this.f4720E);
                                break;
                            case 46:
                                this.f4721F = obtainStyledAttributes.getFloat(index, this.f4721F);
                                break;
                            case 47:
                                this.f4722G = obtainStyledAttributes.getInt(index, 0);
                                break;
                            case 48:
                                this.f4723H = obtainStyledAttributes.getInt(index, 0);
                                break;
                            case 49:
                                this.f4732Q = obtainStyledAttributes.getDimensionPixelOffset(index, this.f4732Q);
                                break;
                            case 50:
                                this.f4733R = obtainStyledAttributes.getDimensionPixelOffset(index, this.f4733R);
                                break;
                            case 51:
                                this.f4737V = obtainStyledAttributes.getString(index);
                                break;
                        }
                }
            }
            obtainStyledAttributes.recycle();
            a();
        }

        public void a() {
            this.f4741Z = false;
            this.f4738W = true;
            this.f4739X = true;
            int i4 = this.width;
            if (i4 == -2 && this.f4735T) {
                this.f4738W = false;
                if (this.f4724I == 0) {
                    this.f4724I = 1;
                }
            }
            int i5 = this.height;
            if (i5 == -2 && this.f4736U) {
                this.f4739X = false;
                if (this.f4725J == 0) {
                    this.f4725J = 1;
                }
            }
            if (i4 == 0 || i4 == -1) {
                this.f4738W = false;
                if (i4 == 0 && this.f4724I == 1) {
                    this.width = -2;
                    this.f4735T = true;
                }
            }
            if (i5 == 0 || i5 == -1) {
                this.f4739X = false;
                if (i5 == 0 && this.f4725J == 1) {
                    this.height = -2;
                    this.f4736U = true;
                }
            }
            if (this.f4746c != -1.0f || this.f4742a != -1 || this.f4744b != -1) {
                this.f4741Z = true;
                this.f4738W = true;
                this.f4739X = true;
                if (!(this.f4769n0 instanceof g)) {
                    this.f4769n0 = new g();
                }
                ((g) this.f4769n0).N0(this.f4734S);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x0048  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x004f  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0056  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x005c  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0062  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x0074  */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x007c  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void resolveLayoutDirection(int r10) {
            /*
                r9 = this;
                int r0 = r9.leftMargin
                int r1 = r9.rightMargin
                super.resolveLayoutDirection(r10)
                int r10 = r9.getLayoutDirection()
                r2 = 0
                r3 = 1
                if (r3 != r10) goto L_0x0011
                r10 = r3
                goto L_0x0012
            L_0x0011:
                r10 = r2
            L_0x0012:
                r4 = -1
                r9.f4753f0 = r4
                r9.f4755g0 = r4
                r9.f4749d0 = r4
                r9.f4751e0 = r4
                int r5 = r9.f4776t
                r9.f4757h0 = r5
                int r5 = r9.f4778v
                r9.f4759i0 = r5
                float r5 = r9.f4782z
                r9.f4761j0 = r5
                int r6 = r9.f4742a
                r9.f4763k0 = r6
                int r7 = r9.f4744b
                r9.f4765l0 = r7
                float r8 = r9.f4746c
                r9.f4767m0 = r8
                if (r10 == 0) goto L_0x008e
                int r10 = r9.f4772p
                if (r10 == r4) goto L_0x003d
                r9.f4753f0 = r10
            L_0x003b:
                r2 = r3
                goto L_0x0044
            L_0x003d:
                int r10 = r9.f4773q
                if (r10 == r4) goto L_0x0044
                r9.f4755g0 = r10
                goto L_0x003b
            L_0x0044:
                int r10 = r9.f4774r
                if (r10 == r4) goto L_0x004b
                r9.f4751e0 = r10
                r2 = r3
            L_0x004b:
                int r10 = r9.f4775s
                if (r10 == r4) goto L_0x0052
                r9.f4749d0 = r10
                r2 = r3
            L_0x0052:
                int r10 = r9.f4780x
                if (r10 == r4) goto L_0x0058
                r9.f4759i0 = r10
            L_0x0058:
                int r10 = r9.f4781y
                if (r10 == r4) goto L_0x005e
                r9.f4757h0 = r10
            L_0x005e:
                r10 = 1065353216(0x3f800000, float:1.0)
                if (r2 == 0) goto L_0x0066
                float r2 = r10 - r5
                r9.f4761j0 = r2
            L_0x0066:
                boolean r2 = r9.f4741Z
                if (r2 == 0) goto L_0x00b2
                int r2 = r9.f4734S
                if (r2 != r3) goto L_0x00b2
                r2 = -1082130432(0xffffffffbf800000, float:-1.0)
                int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
                if (r3 == 0) goto L_0x007c
                float r10 = r10 - r8
                r9.f4767m0 = r10
                r9.f4763k0 = r4
                r9.f4765l0 = r4
                goto L_0x00b2
            L_0x007c:
                if (r6 == r4) goto L_0x0085
                r9.f4765l0 = r6
                r9.f4763k0 = r4
                r9.f4767m0 = r2
                goto L_0x00b2
            L_0x0085:
                if (r7 == r4) goto L_0x00b2
                r9.f4763k0 = r7
                r9.f4765l0 = r4
                r9.f4767m0 = r2
                goto L_0x00b2
            L_0x008e:
                int r10 = r9.f4772p
                if (r10 == r4) goto L_0x0094
                r9.f4751e0 = r10
            L_0x0094:
                int r10 = r9.f4773q
                if (r10 == r4) goto L_0x009a
                r9.f4749d0 = r10
            L_0x009a:
                int r10 = r9.f4774r
                if (r10 == r4) goto L_0x00a0
                r9.f4753f0 = r10
            L_0x00a0:
                int r10 = r9.f4775s
                if (r10 == r4) goto L_0x00a6
                r9.f4755g0 = r10
            L_0x00a6:
                int r10 = r9.f4780x
                if (r10 == r4) goto L_0x00ac
                r9.f4757h0 = r10
            L_0x00ac:
                int r10 = r9.f4781y
                if (r10 == r4) goto L_0x00b2
                r9.f4759i0 = r10
            L_0x00b2:
                int r10 = r9.f4774r
                if (r10 != r4) goto L_0x00fc
                int r10 = r9.f4775s
                if (r10 != r4) goto L_0x00fc
                int r10 = r9.f4773q
                if (r10 != r4) goto L_0x00fc
                int r10 = r9.f4772p
                if (r10 != r4) goto L_0x00fc
                int r10 = r9.f4752f
                if (r10 == r4) goto L_0x00d1
                r9.f4753f0 = r10
                int r10 = r9.rightMargin
                if (r10 > 0) goto L_0x00df
                if (r1 <= 0) goto L_0x00df
                r9.rightMargin = r1
                goto L_0x00df
            L_0x00d1:
                int r10 = r9.f4754g
                if (r10 == r4) goto L_0x00df
                r9.f4755g0 = r10
                int r10 = r9.rightMargin
                if (r10 > 0) goto L_0x00df
                if (r1 <= 0) goto L_0x00df
                r9.rightMargin = r1
            L_0x00df:
                int r10 = r9.f4748d
                if (r10 == r4) goto L_0x00ee
                r9.f4749d0 = r10
                int r10 = r9.leftMargin
                if (r10 > 0) goto L_0x00fc
                if (r0 <= 0) goto L_0x00fc
                r9.leftMargin = r0
                goto L_0x00fc
            L_0x00ee:
                int r10 = r9.f4750e
                if (r10 == r4) goto L_0x00fc
                r9.f4751e0 = r10
                int r10 = r9.leftMargin
                if (r10 > 0) goto L_0x00fc
                if (r0 <= 0) goto L_0x00fc
                r9.leftMargin = r0
            L_0x00fc:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.b.resolveLayoutDirection(int):void");
        }

        public b(int i4, int i5) {
            super(i4, i5);
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }
}
