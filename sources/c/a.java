package C;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.c;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public final ConstraintLayout f257a;

    /* renamed from: b  reason: collision with root package name */
    public int f258b = -1;

    /* renamed from: c  reason: collision with root package name */
    public int f259c = -1;

    /* renamed from: d  reason: collision with root package name */
    public SparseArray f260d = new SparseArray();

    /* renamed from: e  reason: collision with root package name */
    public SparseArray f261e = new SparseArray();

    /* renamed from: C.a$a  reason: collision with other inner class name */
    public static class C0002a {

        /* renamed from: a  reason: collision with root package name */
        public int f262a;

        /* renamed from: b  reason: collision with root package name */
        public ArrayList f263b = new ArrayList();

        /* renamed from: c  reason: collision with root package name */
        public int f264c = -1;

        /* renamed from: d  reason: collision with root package name */
        public c f265d;

        public C0002a(Context context, XmlPullParser xmlPullParser) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), d.q4);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = obtainStyledAttributes.getIndex(i4);
                if (index == d.r4) {
                    this.f262a = obtainStyledAttributes.getResourceId(index, this.f262a);
                } else if (index == d.s4) {
                    this.f264c = obtainStyledAttributes.getResourceId(index, this.f264c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f264c);
                    context.getResources().getResourceName(this.f264c);
                    if ("layout".equals(resourceTypeName)) {
                        c cVar = new c();
                        this.f265d = cVar;
                        cVar.f(context, this.f264c);
                    }
                }
            }
            obtainStyledAttributes.recycle();
        }

        public void a(b bVar) {
            this.f263b.add(bVar);
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public float f266a = Float.NaN;

        /* renamed from: b  reason: collision with root package name */
        public float f267b = Float.NaN;

        /* renamed from: c  reason: collision with root package name */
        public float f268c = Float.NaN;

        /* renamed from: d  reason: collision with root package name */
        public float f269d = Float.NaN;

        /* renamed from: e  reason: collision with root package name */
        public int f270e = -1;

        /* renamed from: f  reason: collision with root package name */
        public c f271f;

        public b(Context context, XmlPullParser xmlPullParser) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), d.M4);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = obtainStyledAttributes.getIndex(i4);
                if (index == d.N4) {
                    this.f270e = obtainStyledAttributes.getResourceId(index, this.f270e);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f270e);
                    context.getResources().getResourceName(this.f270e);
                    if ("layout".equals(resourceTypeName)) {
                        c cVar = new c();
                        this.f271f = cVar;
                        cVar.f(context, this.f270e);
                    }
                } else if (index == d.O4) {
                    this.f269d = obtainStyledAttributes.getDimension(index, this.f269d);
                } else if (index == d.P4) {
                    this.f267b = obtainStyledAttributes.getDimension(index, this.f267b);
                } else if (index == d.Q4) {
                    this.f268c = obtainStyledAttributes.getDimension(index, this.f268c);
                } else if (index == d.R4) {
                    this.f266a = obtainStyledAttributes.getDimension(index, this.f266a);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public a(Context context, ConstraintLayout constraintLayout, int i4) {
        this.f257a = constraintLayout;
        a(context, i4);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.content.Context r8, int r9) {
        /*
            r7 = this;
            android.content.res.Resources r0 = r8.getResources()
            android.content.res.XmlResourceParser r9 = r0.getXml(r9)
            int r0 = r9.getEventType()     // Catch:{ XmlPullParserException -> 0x0032, IOException -> 0x002f }
            r1 = 0
        L_0x000d:
            r2 = 1
            if (r0 == r2) goto L_0x00ab
            if (r0 == 0) goto L_0x009b
            r3 = 2
            if (r0 == r3) goto L_0x0017
            goto L_0x009e
        L_0x0017:
            java.lang.String r0 = r9.getName()     // Catch:{ XmlPullParserException -> 0x0032, IOException -> 0x002f }
            int r4 = r0.hashCode()     // Catch:{ XmlPullParserException -> 0x0032, IOException -> 0x002f }
            r5 = 4
            r6 = 3
            switch(r4) {
                case -1349929691: goto L_0x0053;
                case 80204913: goto L_0x0049;
                case 1382829617: goto L_0x003f;
                case 1657696882: goto L_0x0035;
                case 1901439077: goto L_0x0025;
                default: goto L_0x0024;
            }     // Catch:{ XmlPullParserException -> 0x0032, IOException -> 0x002f }
        L_0x0024:
            goto L_0x005d
        L_0x0025:
            java.lang.String r4 = "Variant"
            boolean r4 = r0.equals(r4)     // Catch:{ XmlPullParserException -> 0x0032, IOException -> 0x002f }
            if (r4 == 0) goto L_0x005d
            r4 = r6
            goto L_0x005e
        L_0x002f:
            r8 = move-exception
            goto L_0x00a4
        L_0x0032:
            r8 = move-exception
            goto L_0x00a8
        L_0x0035:
            java.lang.String r4 = "layoutDescription"
            boolean r4 = r0.equals(r4)     // Catch:{ XmlPullParserException -> 0x0032, IOException -> 0x002f }
            if (r4 == 0) goto L_0x005d
            r4 = 0
            goto L_0x005e
        L_0x003f:
            java.lang.String r4 = "StateSet"
            boolean r4 = r0.equals(r4)     // Catch:{ XmlPullParserException -> 0x0032, IOException -> 0x002f }
            if (r4 == 0) goto L_0x005d
            r4 = r2
            goto L_0x005e
        L_0x0049:
            java.lang.String r4 = "State"
            boolean r4 = r0.equals(r4)     // Catch:{ XmlPullParserException -> 0x0032, IOException -> 0x002f }
            if (r4 == 0) goto L_0x005d
            r4 = r3
            goto L_0x005e
        L_0x0053:
            java.lang.String r4 = "ConstraintSet"
            boolean r4 = r0.equals(r4)     // Catch:{ XmlPullParserException -> 0x0032, IOException -> 0x002f }
            if (r4 == 0) goto L_0x005d
            r4 = r5
            goto L_0x005e
        L_0x005d:
            r4 = -1
        L_0x005e:
            if (r4 == 0) goto L_0x009e
            if (r4 == r2) goto L_0x009e
            if (r4 == r3) goto L_0x008e
            if (r4 == r6) goto L_0x0083
            if (r4 == r5) goto L_0x007f
            java.lang.String r2 = "ConstraintLayoutStates"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0032, IOException -> 0x002f }
            r3.<init>()     // Catch:{ XmlPullParserException -> 0x0032, IOException -> 0x002f }
            java.lang.String r4 = "unknown tag "
            r3.append(r4)     // Catch:{ XmlPullParserException -> 0x0032, IOException -> 0x002f }
            r3.append(r0)     // Catch:{ XmlPullParserException -> 0x0032, IOException -> 0x002f }
            java.lang.String r0 = r3.toString()     // Catch:{ XmlPullParserException -> 0x0032, IOException -> 0x002f }
            android.util.Log.v(r2, r0)     // Catch:{ XmlPullParserException -> 0x0032, IOException -> 0x002f }
            goto L_0x009e
        L_0x007f:
            r7.b(r8, r9)     // Catch:{ XmlPullParserException -> 0x0032, IOException -> 0x002f }
            goto L_0x009e
        L_0x0083:
            C.a$b r0 = new C.a$b     // Catch:{ XmlPullParserException -> 0x0032, IOException -> 0x002f }
            r0.<init>(r8, r9)     // Catch:{ XmlPullParserException -> 0x0032, IOException -> 0x002f }
            if (r1 == 0) goto L_0x009e
            r1.a(r0)     // Catch:{ XmlPullParserException -> 0x0032, IOException -> 0x002f }
            goto L_0x009e
        L_0x008e:
            C.a$a r1 = new C.a$a     // Catch:{ XmlPullParserException -> 0x0032, IOException -> 0x002f }
            r1.<init>(r8, r9)     // Catch:{ XmlPullParserException -> 0x0032, IOException -> 0x002f }
            android.util.SparseArray r0 = r7.f260d     // Catch:{ XmlPullParserException -> 0x0032, IOException -> 0x002f }
            int r2 = r1.f262a     // Catch:{ XmlPullParserException -> 0x0032, IOException -> 0x002f }
            r0.put(r2, r1)     // Catch:{ XmlPullParserException -> 0x0032, IOException -> 0x002f }
            goto L_0x009e
        L_0x009b:
            r9.getName()     // Catch:{ XmlPullParserException -> 0x0032, IOException -> 0x002f }
        L_0x009e:
            int r0 = r9.next()     // Catch:{ XmlPullParserException -> 0x0032, IOException -> 0x002f }
            goto L_0x000d
        L_0x00a4:
            r8.printStackTrace()
            goto L_0x00ab
        L_0x00a8:
            r8.printStackTrace()
        L_0x00ab:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: C.a.a(android.content.Context, int):void");
    }

    public final void b(Context context, XmlPullParser xmlPullParser) {
        int i4;
        c cVar = new c();
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i5 = 0; i5 < attributeCount; i5++) {
            if ("id".equals(xmlPullParser.getAttributeName(i5))) {
                String attributeValue = xmlPullParser.getAttributeValue(i5);
                if (attributeValue.contains("/")) {
                    i4 = context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName());
                } else {
                    i4 = -1;
                }
                if (i4 == -1) {
                    if (attributeValue.length() > 1) {
                        i4 = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                cVar.m(context, xmlPullParser);
                this.f261e.put(i4, cVar);
                return;
            }
        }
    }

    public void c(b bVar) {
    }
}
