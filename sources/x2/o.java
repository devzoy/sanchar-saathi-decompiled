package X2;

import Y2.j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class o {

    /* renamed from: a  reason: collision with root package name */
    public final Y2.j f3529a;

    /* renamed from: b  reason: collision with root package name */
    public h f3530b;

    /* renamed from: c  reason: collision with root package name */
    public final j.c f3531c;

    public class a implements j.c {
        public a() {
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* JADX WARNING: Can't wrap try/catch for region: R(2:67|68) */
        /* JADX WARNING: Code restructure failed: missing block: B:68:?, code lost:
            r7.b("error", "No such clipboard content format: " + r6, (java.lang.Object) null);
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:67:0x012a */
        /* JADX WARNING: Removed duplicated region for block: B:72:0x014b A[Catch:{ JSONException -> 0x003f }] */
        /* JADX WARNING: Removed duplicated region for block: B:73:0x0158 A[Catch:{ JSONException -> 0x003f }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onMethodCall(Y2.i r6, Y2.j.d r7) {
            /*
                r5 = this;
                java.lang.String r0 = "error"
                X2.o r1 = X2.o.this
                X2.o$h r1 = r1.f3530b
                if (r1 != 0) goto L_0x000b
                return
            L_0x000b:
                java.lang.String r1 = r6.f3766a
                java.lang.Object r6 = r6.f3767b
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Received '"
                r2.append(r3)
                r2.append(r1)
                java.lang.String r3 = "' message."
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                java.lang.String r3 = "PlatformChannel"
                M2.b.f(r3, r2)
                r2 = 0
                int r3 = r1.hashCode()     // Catch:{ JSONException -> 0x003f }
                switch(r3) {
                    case -1501580720: goto L_0x00ce;
                    case -931781241: goto L_0x00c3;
                    case -766342101: goto L_0x00b8;
                    case -720677196: goto L_0x00ad;
                    case -577225884: goto L_0x00a3;
                    case -548468504: goto L_0x0099;
                    case -247230243: goto L_0x008f;
                    case -215273374: goto L_0x0085;
                    case 241845679: goto L_0x007b;
                    case 875995648: goto L_0x0070;
                    case 1128339786: goto L_0x0065;
                    case 1390477857: goto L_0x0059;
                    case 1514180520: goto L_0x004d;
                    case 1674312266: goto L_0x0042;
                    case 2119655719: goto L_0x0034;
                    default: goto L_0x0032;
                }     // Catch:{ JSONException -> 0x003f }
            L_0x0032:
                goto L_0x00d9
            L_0x0034:
                java.lang.String r3 = "SystemChrome.setPreferredOrientations"
                boolean r1 = r1.equals(r3)     // Catch:{ JSONException -> 0x003f }
                if (r1 == 0) goto L_0x00d9
                r1 = 2
                goto L_0x00da
            L_0x003f:
                r6 = move-exception
                goto L_0x0279
            L_0x0042:
                java.lang.String r3 = "SystemChrome.setEnabledSystemUIOverlays"
                boolean r1 = r1.equals(r3)     // Catch:{ JSONException -> 0x003f }
                if (r1 == 0) goto L_0x00d9
                r1 = 4
                goto L_0x00da
            L_0x004d:
                java.lang.String r3 = "Clipboard.getData"
                boolean r1 = r1.equals(r3)     // Catch:{ JSONException -> 0x003f }
                if (r1 == 0) goto L_0x00d9
                r1 = 11
                goto L_0x00da
            L_0x0059:
                java.lang.String r3 = "SystemChrome.setSystemUIOverlayStyle"
                boolean r1 = r1.equals(r3)     // Catch:{ JSONException -> 0x003f }
                if (r1 == 0) goto L_0x00d9
                r1 = 8
                goto L_0x00da
            L_0x0065:
                java.lang.String r3 = "SystemChrome.setEnabledSystemUIMode"
                boolean r1 = r1.equals(r3)     // Catch:{ JSONException -> 0x003f }
                if (r1 == 0) goto L_0x00d9
                r1 = 5
                goto L_0x00da
            L_0x0070:
                java.lang.String r3 = "Clipboard.hasStrings"
                boolean r1 = r1.equals(r3)     // Catch:{ JSONException -> 0x003f }
                if (r1 == 0) goto L_0x00d9
                r1 = 13
                goto L_0x00da
            L_0x007b:
                java.lang.String r3 = "SystemChrome.restoreSystemUIOverlays"
                boolean r1 = r1.equals(r3)     // Catch:{ JSONException -> 0x003f }
                if (r1 == 0) goto L_0x00d9
                r1 = 7
                goto L_0x00da
            L_0x0085:
                java.lang.String r3 = "SystemSound.play"
                boolean r1 = r1.equals(r3)     // Catch:{ JSONException -> 0x003f }
                if (r1 == 0) goto L_0x00d9
                r1 = 0
                goto L_0x00da
            L_0x008f:
                java.lang.String r3 = "HapticFeedback.vibrate"
                boolean r1 = r1.equals(r3)     // Catch:{ JSONException -> 0x003f }
                if (r1 == 0) goto L_0x00d9
                r1 = 1
                goto L_0x00da
            L_0x0099:
                java.lang.String r3 = "SystemChrome.setApplicationSwitcherDescription"
                boolean r1 = r1.equals(r3)     // Catch:{ JSONException -> 0x003f }
                if (r1 == 0) goto L_0x00d9
                r1 = 3
                goto L_0x00da
            L_0x00a3:
                java.lang.String r3 = "SystemChrome.setSystemUIChangeListener"
                boolean r1 = r1.equals(r3)     // Catch:{ JSONException -> 0x003f }
                if (r1 == 0) goto L_0x00d9
                r1 = 6
                goto L_0x00da
            L_0x00ad:
                java.lang.String r3 = "Clipboard.setData"
                boolean r1 = r1.equals(r3)     // Catch:{ JSONException -> 0x003f }
                if (r1 == 0) goto L_0x00d9
                r1 = 12
                goto L_0x00da
            L_0x00b8:
                java.lang.String r3 = "SystemNavigator.pop"
                boolean r1 = r1.equals(r3)     // Catch:{ JSONException -> 0x003f }
                if (r1 == 0) goto L_0x00d9
                r1 = 10
                goto L_0x00da
            L_0x00c3:
                java.lang.String r3 = "Share.invoke"
                boolean r1 = r1.equals(r3)     // Catch:{ JSONException -> 0x003f }
                if (r1 == 0) goto L_0x00d9
                r1 = 14
                goto L_0x00da
            L_0x00ce:
                java.lang.String r3 = "SystemNavigator.setFrameworkHandlesBack"
                boolean r1 = r1.equals(r3)     // Catch:{ JSONException -> 0x003f }
                if (r1 == 0) goto L_0x00d9
                r1 = 9
                goto L_0x00da
            L_0x00d9:
                r1 = -1
            L_0x00da:
                java.lang.String r3 = "text"
                switch(r1) {
                    case 0: goto L_0x025d;
                    case 1: goto L_0x0241;
                    case 2: goto L_0x0221;
                    case 3: goto L_0x0201;
                    case 4: goto L_0x01df;
                    case 5: goto L_0x01bd;
                    case 6: goto L_0x01af;
                    case 7: goto L_0x01a1;
                    case 8: goto L_0x017f;
                    case 9: goto L_0x016b;
                    case 10: goto L_0x015d;
                    case 11: goto L_0x0121;
                    case 12: goto L_0x010d;
                    case 13: goto L_0x00f4;
                    case 14: goto L_0x00e4;
                    default: goto L_0x00df;
                }
            L_0x00df:
                r7.c()     // Catch:{ JSONException -> 0x003f }
                goto L_0x0291
            L_0x00e4:
                java.lang.String r6 = (java.lang.String) r6     // Catch:{ JSONException -> 0x003f }
                X2.o r1 = X2.o.this     // Catch:{ JSONException -> 0x003f }
                X2.o$h r1 = r1.f3530b     // Catch:{ JSONException -> 0x003f }
                r1.s(r6)     // Catch:{ JSONException -> 0x003f }
                r7.a(r2)     // Catch:{ JSONException -> 0x003f }
                goto L_0x0291
            L_0x00f4:
                X2.o r6 = X2.o.this     // Catch:{ JSONException -> 0x003f }
                X2.o$h r6 = r6.f3530b     // Catch:{ JSONException -> 0x003f }
                boolean r6 = r6.t()     // Catch:{ JSONException -> 0x003f }
                org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x003f }
                r1.<init>()     // Catch:{ JSONException -> 0x003f }
                java.lang.String r3 = "value"
                r1.put(r3, r6)     // Catch:{ JSONException -> 0x003f }
                r7.a(r1)     // Catch:{ JSONException -> 0x003f }
                goto L_0x0291
            L_0x010d:
                org.json.JSONObject r6 = (org.json.JSONObject) r6     // Catch:{ JSONException -> 0x003f }
                java.lang.String r6 = r6.getString(r3)     // Catch:{ JSONException -> 0x003f }
                X2.o r1 = X2.o.this     // Catch:{ JSONException -> 0x003f }
                X2.o$h r1 = r1.f3530b     // Catch:{ JSONException -> 0x003f }
                r1.p(r6)     // Catch:{ JSONException -> 0x003f }
                r7.a(r2)     // Catch:{ JSONException -> 0x003f }
                goto L_0x0291
            L_0x0121:
                java.lang.String r6 = (java.lang.String) r6     // Catch:{ JSONException -> 0x003f }
                if (r6 == 0) goto L_0x013e
                X2.o$e r6 = X2.o.e.f(r6)     // Catch:{ NoSuchFieldException -> 0x012a }
                goto L_0x013f
            L_0x012a:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x003f }
                r1.<init>()     // Catch:{ JSONException -> 0x003f }
                java.lang.String r4 = "No such clipboard content format: "
                r1.append(r4)     // Catch:{ JSONException -> 0x003f }
                r1.append(r6)     // Catch:{ JSONException -> 0x003f }
                java.lang.String r6 = r1.toString()     // Catch:{ JSONException -> 0x003f }
                r7.b(r0, r6, r2)     // Catch:{ JSONException -> 0x003f }
            L_0x013e:
                r6 = r2
            L_0x013f:
                X2.o r1 = X2.o.this     // Catch:{ JSONException -> 0x003f }
                X2.o$h r1 = r1.f3530b     // Catch:{ JSONException -> 0x003f }
                java.lang.CharSequence r6 = r1.i(r6)     // Catch:{ JSONException -> 0x003f }
                if (r6 == 0) goto L_0x0158
                org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x003f }
                r1.<init>()     // Catch:{ JSONException -> 0x003f }
                r1.put(r3, r6)     // Catch:{ JSONException -> 0x003f }
                r7.a(r1)     // Catch:{ JSONException -> 0x003f }
                goto L_0x0291
            L_0x0158:
                r7.a(r2)     // Catch:{ JSONException -> 0x003f }
                goto L_0x0291
            L_0x015d:
                X2.o r6 = X2.o.this     // Catch:{ JSONException -> 0x003f }
                X2.o$h r6 = r6.f3530b     // Catch:{ JSONException -> 0x003f }
                r6.c()     // Catch:{ JSONException -> 0x003f }
                r7.a(r2)     // Catch:{ JSONException -> 0x003f }
                goto L_0x0291
            L_0x016b:
                java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch:{ JSONException -> 0x003f }
                boolean r6 = r6.booleanValue()     // Catch:{ JSONException -> 0x003f }
                X2.o r1 = X2.o.this     // Catch:{ JSONException -> 0x003f }
                X2.o$h r1 = r1.f3530b     // Catch:{ JSONException -> 0x003f }
                r1.h(r6)     // Catch:{ JSONException -> 0x003f }
                r7.a(r2)     // Catch:{ JSONException -> 0x003f }
                goto L_0x0291
            L_0x017f:
                X2.o r1 = X2.o.this     // Catch:{ JSONException -> 0x0197, NoSuchFieldException -> 0x0195 }
                org.json.JSONObject r6 = (org.json.JSONObject) r6     // Catch:{ JSONException -> 0x0197, NoSuchFieldException -> 0x0195 }
                X2.o$j r6 = r1.i(r6)     // Catch:{ JSONException -> 0x0197, NoSuchFieldException -> 0x0195 }
                X2.o r1 = X2.o.this     // Catch:{ JSONException -> 0x0197, NoSuchFieldException -> 0x0195 }
                X2.o$h r1 = r1.f3530b     // Catch:{ JSONException -> 0x0197, NoSuchFieldException -> 0x0195 }
                r1.q(r6)     // Catch:{ JSONException -> 0x0197, NoSuchFieldException -> 0x0195 }
                r7.a(r2)     // Catch:{ JSONException -> 0x0197, NoSuchFieldException -> 0x0195 }
                goto L_0x0291
            L_0x0195:
                r6 = move-exception
                goto L_0x0198
            L_0x0197:
                r6 = move-exception
            L_0x0198:
                java.lang.String r6 = r6.getMessage()     // Catch:{ JSONException -> 0x003f }
                r7.b(r0, r6, r2)     // Catch:{ JSONException -> 0x003f }
                goto L_0x0291
            L_0x01a1:
                X2.o r6 = X2.o.this     // Catch:{ JSONException -> 0x003f }
                X2.o$h r6 = r6.f3530b     // Catch:{ JSONException -> 0x003f }
                r6.o()     // Catch:{ JSONException -> 0x003f }
                r7.a(r2)     // Catch:{ JSONException -> 0x003f }
                goto L_0x0291
            L_0x01af:
                X2.o r6 = X2.o.this     // Catch:{ JSONException -> 0x003f }
                X2.o$h r6 = r6.f3530b     // Catch:{ JSONException -> 0x003f }
                r6.m()     // Catch:{ JSONException -> 0x003f }
                r7.a(r2)     // Catch:{ JSONException -> 0x003f }
                goto L_0x0291
            L_0x01bd:
                X2.o r1 = X2.o.this     // Catch:{ JSONException -> 0x01d5, NoSuchFieldException -> 0x01d3 }
                java.lang.String r6 = (java.lang.String) r6     // Catch:{ JSONException -> 0x01d5, NoSuchFieldException -> 0x01d3 }
                X2.o$k r6 = r1.j(r6)     // Catch:{ JSONException -> 0x01d5, NoSuchFieldException -> 0x01d3 }
                X2.o r1 = X2.o.this     // Catch:{ JSONException -> 0x01d5, NoSuchFieldException -> 0x01d3 }
                X2.o$h r1 = r1.f3530b     // Catch:{ JSONException -> 0x01d5, NoSuchFieldException -> 0x01d3 }
                r1.u(r6)     // Catch:{ JSONException -> 0x01d5, NoSuchFieldException -> 0x01d3 }
                r7.a(r2)     // Catch:{ JSONException -> 0x01d5, NoSuchFieldException -> 0x01d3 }
                goto L_0x0291
            L_0x01d3:
                r6 = move-exception
                goto L_0x01d6
            L_0x01d5:
                r6 = move-exception
            L_0x01d6:
                java.lang.String r6 = r6.getMessage()     // Catch:{ JSONException -> 0x003f }
                r7.b(r0, r6, r2)     // Catch:{ JSONException -> 0x003f }
                goto L_0x0291
            L_0x01df:
                X2.o r1 = X2.o.this     // Catch:{ JSONException -> 0x01f7, NoSuchFieldException -> 0x01f5 }
                org.json.JSONArray r6 = (org.json.JSONArray) r6     // Catch:{ JSONException -> 0x01f7, NoSuchFieldException -> 0x01f5 }
                java.util.List r6 = r1.k(r6)     // Catch:{ JSONException -> 0x01f7, NoSuchFieldException -> 0x01f5 }
                X2.o r1 = X2.o.this     // Catch:{ JSONException -> 0x01f7, NoSuchFieldException -> 0x01f5 }
                X2.o$h r1 = r1.f3530b     // Catch:{ JSONException -> 0x01f7, NoSuchFieldException -> 0x01f5 }
                r1.k(r6)     // Catch:{ JSONException -> 0x01f7, NoSuchFieldException -> 0x01f5 }
                r7.a(r2)     // Catch:{ JSONException -> 0x01f7, NoSuchFieldException -> 0x01f5 }
                goto L_0x0291
            L_0x01f5:
                r6 = move-exception
                goto L_0x01f8
            L_0x01f7:
                r6 = move-exception
            L_0x01f8:
                java.lang.String r6 = r6.getMessage()     // Catch:{ JSONException -> 0x003f }
                r7.b(r0, r6, r2)     // Catch:{ JSONException -> 0x003f }
                goto L_0x0291
            L_0x0201:
                X2.o r1 = X2.o.this     // Catch:{ JSONException -> 0x0217 }
                org.json.JSONObject r6 = (org.json.JSONObject) r6     // Catch:{ JSONException -> 0x0217 }
                X2.o$c r6 = r1.g(r6)     // Catch:{ JSONException -> 0x0217 }
                X2.o r1 = X2.o.this     // Catch:{ JSONException -> 0x0217 }
                X2.o$h r1 = r1.f3530b     // Catch:{ JSONException -> 0x0217 }
                r1.j(r6)     // Catch:{ JSONException -> 0x0217 }
                r7.a(r2)     // Catch:{ JSONException -> 0x0217 }
                goto L_0x0291
            L_0x0217:
                r6 = move-exception
                java.lang.String r6 = r6.getMessage()     // Catch:{ JSONException -> 0x003f }
                r7.b(r0, r6, r2)     // Catch:{ JSONException -> 0x003f }
                goto L_0x0291
            L_0x0221:
                X2.o r1 = X2.o.this     // Catch:{ JSONException -> 0x0238, NoSuchFieldException -> 0x0236 }
                org.json.JSONArray r6 = (org.json.JSONArray) r6     // Catch:{ JSONException -> 0x0238, NoSuchFieldException -> 0x0236 }
                int r6 = r1.h(r6)     // Catch:{ JSONException -> 0x0238, NoSuchFieldException -> 0x0236 }
                X2.o r1 = X2.o.this     // Catch:{ JSONException -> 0x0238, NoSuchFieldException -> 0x0236 }
                X2.o$h r1 = r1.f3530b     // Catch:{ JSONException -> 0x0238, NoSuchFieldException -> 0x0236 }
                r1.r(r6)     // Catch:{ JSONException -> 0x0238, NoSuchFieldException -> 0x0236 }
                r7.a(r2)     // Catch:{ JSONException -> 0x0238, NoSuchFieldException -> 0x0236 }
                goto L_0x0291
            L_0x0236:
                r6 = move-exception
                goto L_0x0239
            L_0x0238:
                r6 = move-exception
            L_0x0239:
                java.lang.String r6 = r6.getMessage()     // Catch:{ JSONException -> 0x003f }
                r7.b(r0, r6, r2)     // Catch:{ JSONException -> 0x003f }
                goto L_0x0291
            L_0x0241:
                java.lang.String r6 = (java.lang.String) r6     // Catch:{ NoSuchFieldException -> 0x0254 }
                X2.o$g r6 = X2.o.g.f(r6)     // Catch:{ NoSuchFieldException -> 0x0254 }
                X2.o r1 = X2.o.this     // Catch:{ NoSuchFieldException -> 0x0254 }
                X2.o$h r1 = r1.f3530b     // Catch:{ NoSuchFieldException -> 0x0254 }
                r1.l(r6)     // Catch:{ NoSuchFieldException -> 0x0254 }
                r7.a(r2)     // Catch:{ NoSuchFieldException -> 0x0254 }
                goto L_0x0291
            L_0x0254:
                r6 = move-exception
                java.lang.String r6 = r6.getMessage()     // Catch:{ JSONException -> 0x003f }
                r7.b(r0, r6, r2)     // Catch:{ JSONException -> 0x003f }
                goto L_0x0291
            L_0x025d:
                java.lang.String r6 = (java.lang.String) r6     // Catch:{ NoSuchFieldException -> 0x0270 }
                X2.o$i r6 = X2.o.i.f(r6)     // Catch:{ NoSuchFieldException -> 0x0270 }
                X2.o r1 = X2.o.this     // Catch:{ NoSuchFieldException -> 0x0270 }
                X2.o$h r1 = r1.f3530b     // Catch:{ NoSuchFieldException -> 0x0270 }
                r1.n(r6)     // Catch:{ NoSuchFieldException -> 0x0270 }
                r7.a(r2)     // Catch:{ NoSuchFieldException -> 0x0270 }
                goto L_0x0291
            L_0x0270:
                r6 = move-exception
                java.lang.String r6 = r6.getMessage()     // Catch:{ JSONException -> 0x003f }
                r7.b(r0, r6, r2)     // Catch:{ JSONException -> 0x003f }
                goto L_0x0291
            L_0x0279:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r3 = "JSON error: "
                r1.append(r3)
                java.lang.String r6 = r6.getMessage()
                r1.append(r6)
                java.lang.String r6 = r1.toString()
                r7.b(r0, r6, r2)
            L_0x0291:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: X2.o.a.onMethodCall(Y2.i, Y2.j$d):void");
        }
    }

    public static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f3533a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f3534b;

        /* renamed from: c  reason: collision with root package name */
        public static final /* synthetic */ int[] f3535c;

        /* JADX WARNING: Can't wrap try/catch for region: R(23:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|20|21|23|24|25|26|27|28|29|30|32) */
        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|20|21|23|24|25|26|27|28|29|30|32) */
        /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x005f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0069 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0073 */
        static {
            /*
                X2.o$k[] r0 = X2.o.k.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f3535c = r0
                r1 = 1
                X2.o$k r2 = X2.o.k.LEAN_BACK     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f3535c     // Catch:{ NoSuchFieldError -> 0x001d }
                X2.o$k r3 = X2.o.k.IMMERSIVE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f3535c     // Catch:{ NoSuchFieldError -> 0x0028 }
                X2.o$k r4 = X2.o.k.IMMERSIVE_STICKY     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f3535c     // Catch:{ NoSuchFieldError -> 0x0033 }
                X2.o$k r5 = X2.o.k.EDGE_TO_EDGE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                X2.o$l[] r4 = X2.o.l.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f3534b = r4
                X2.o$l r5 = X2.o.l.TOP_OVERLAYS     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                int[] r4 = f3534b     // Catch:{ NoSuchFieldError -> 0x004e }
                X2.o$l r5 = X2.o.l.BOTTOM_OVERLAYS     // Catch:{ NoSuchFieldError -> 0x004e }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r4[r5] = r0     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                X2.o$f[] r4 = X2.o.f.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f3533a = r4
                X2.o$f r5 = X2.o.f.PORTRAIT_UP     // Catch:{ NoSuchFieldError -> 0x005f }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x005f }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x005f }
            L_0x005f:
                int[] r1 = f3533a     // Catch:{ NoSuchFieldError -> 0x0069 }
                X2.o$f r4 = X2.o.f.PORTRAIT_DOWN     // Catch:{ NoSuchFieldError -> 0x0069 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0069 }
                r1[r4] = r0     // Catch:{ NoSuchFieldError -> 0x0069 }
            L_0x0069:
                int[] r0 = f3533a     // Catch:{ NoSuchFieldError -> 0x0073 }
                X2.o$f r1 = X2.o.f.LANDSCAPE_LEFT     // Catch:{ NoSuchFieldError -> 0x0073 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0073 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0073 }
            L_0x0073:
                int[] r0 = f3533a     // Catch:{ NoSuchFieldError -> 0x007d }
                X2.o$f r1 = X2.o.f.LANDSCAPE_RIGHT     // Catch:{ NoSuchFieldError -> 0x007d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x007d }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x007d }
            L_0x007d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: X2.o.b.<clinit>():void");
        }
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final int f3536a;

        /* renamed from: b  reason: collision with root package name */
        public final String f3537b;

        public c(int i4, String str) {
            this.f3536a = i4;
            this.f3537b = str;
        }
    }

    public enum d {
        LIGHT("Brightness.light"),
        DARK("Brightness.dark");
        

        /* renamed from: e  reason: collision with root package name */
        public String f3541e;

        /* access modifiers changed from: public */
        d(String str) {
            this.f3541e = str;
        }

        public static d f(String str) {
            for (d dVar : values()) {
                if (dVar.f3541e.equals(str)) {
                    return dVar;
                }
            }
            throw new NoSuchFieldException("No such Brightness: " + str);
        }
    }

    public enum e {
        PLAIN_TEXT("text/plain");
        

        /* renamed from: e  reason: collision with root package name */
        public String f3544e;

        /* access modifiers changed from: public */
        e(String str) {
            this.f3544e = str;
        }

        public static e f(String str) {
            for (e eVar : values()) {
                if (eVar.f3544e.equals(str)) {
                    return eVar;
                }
            }
            throw new NoSuchFieldException("No such ClipboardContentFormat: " + str);
        }
    }

    public enum f {
        PORTRAIT_UP("DeviceOrientation.portraitUp"),
        PORTRAIT_DOWN("DeviceOrientation.portraitDown"),
        LANDSCAPE_LEFT("DeviceOrientation.landscapeLeft"),
        LANDSCAPE_RIGHT("DeviceOrientation.landscapeRight");
        

        /* renamed from: e  reason: collision with root package name */
        public String f3550e;

        /* access modifiers changed from: public */
        f(String str) {
            this.f3550e = str;
        }

        public static f f(String str) {
            for (f fVar : values()) {
                if (fVar.f3550e.equals(str)) {
                    return fVar;
                }
            }
            throw new NoSuchFieldException("No such DeviceOrientation: " + str);
        }
    }

    public enum g {
        STANDARD((String) null),
        LIGHT_IMPACT("HapticFeedbackType.lightImpact"),
        MEDIUM_IMPACT("HapticFeedbackType.mediumImpact"),
        HEAVY_IMPACT("HapticFeedbackType.heavyImpact"),
        SELECTION_CLICK("HapticFeedbackType.selectionClick");
        

        /* renamed from: e  reason: collision with root package name */
        public final String f3557e;

        /* access modifiers changed from: public */
        g(String str) {
            this.f3557e = str;
        }

        public static g f(String str) {
            for (g gVar : values()) {
                String str2 = gVar.f3557e;
                if ((str2 == null && str == null) || (str2 != null && str2.equals(str))) {
                    return gVar;
                }
            }
            throw new NoSuchFieldException("No such HapticFeedbackType: " + str);
        }
    }

    public interface h {
        void c();

        void h(boolean z4);

        CharSequence i(e eVar);

        void j(c cVar);

        void k(List list);

        void l(g gVar);

        void m();

        void n(i iVar);

        void o();

        void p(String str);

        void q(j jVar);

        void r(int i4);

        void s(String str);

        boolean t();

        void u(k kVar);
    }

    public enum i {
        CLICK("SystemSoundType.click"),
        ALERT("SystemSoundType.alert");
        

        /* renamed from: e  reason: collision with root package name */
        public final String f3561e;

        /* access modifiers changed from: public */
        i(String str) {
            this.f3561e = str;
        }

        public static i f(String str) {
            for (i iVar : values()) {
                if (iVar.f3561e.equals(str)) {
                    return iVar;
                }
            }
            throw new NoSuchFieldException("No such SoundType: " + str);
        }
    }

    public static class j {

        /* renamed from: a  reason: collision with root package name */
        public final Integer f3562a;

        /* renamed from: b  reason: collision with root package name */
        public final d f3563b;

        /* renamed from: c  reason: collision with root package name */
        public final Boolean f3564c;

        /* renamed from: d  reason: collision with root package name */
        public final Integer f3565d;

        /* renamed from: e  reason: collision with root package name */
        public final d f3566e;

        /* renamed from: f  reason: collision with root package name */
        public final Integer f3567f;

        /* renamed from: g  reason: collision with root package name */
        public final Boolean f3568g;

        public j(Integer num, d dVar, Boolean bool, Integer num2, d dVar2, Integer num3, Boolean bool2) {
            this.f3562a = num;
            this.f3563b = dVar;
            this.f3564c = bool;
            this.f3565d = num2;
            this.f3566e = dVar2;
            this.f3567f = num3;
            this.f3568g = bool2;
        }
    }

    public enum k {
        LEAN_BACK("SystemUiMode.leanBack"),
        IMMERSIVE("SystemUiMode.immersive"),
        IMMERSIVE_STICKY("SystemUiMode.immersiveSticky"),
        EDGE_TO_EDGE("SystemUiMode.edgeToEdge");
        

        /* renamed from: e  reason: collision with root package name */
        public String f3574e;

        /* access modifiers changed from: public */
        k(String str) {
            this.f3574e = str;
        }

        public static k f(String str) {
            for (k kVar : values()) {
                if (kVar.f3574e.equals(str)) {
                    return kVar;
                }
            }
            throw new NoSuchFieldException("No such SystemUiMode: " + str);
        }
    }

    public enum l {
        TOP_OVERLAYS("SystemUiOverlay.top"),
        BOTTOM_OVERLAYS("SystemUiOverlay.bottom");
        

        /* renamed from: e  reason: collision with root package name */
        public String f3578e;

        /* access modifiers changed from: public */
        l(String str) {
            this.f3578e = str;
        }

        public static l f(String str) {
            for (l lVar : values()) {
                if (lVar.f3578e.equals(str)) {
                    return lVar;
                }
            }
            throw new NoSuchFieldException("No such SystemUiOverlay: " + str);
        }
    }

    public o(P2.a aVar) {
        a aVar2 = new a();
        this.f3531c = aVar2;
        Y2.j jVar = new Y2.j(aVar, "flutter/platform", Y2.f.f3765a);
        this.f3529a = jVar;
        jVar.e(aVar2);
    }

    public final c g(JSONObject jSONObject) {
        int i4 = jSONObject.getInt("primaryColor");
        if (i4 != 0) {
            i4 |= -16777216;
        }
        return new c(i4, jSONObject.getString("label"));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0056, code lost:
        return 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int h(org.json.JSONArray r10) {
        /*
            r9 = this;
            r0 = 0
            r1 = r0
            r2 = r1
            r3 = r2
        L_0x0004:
            int r4 = r10.length()
            r5 = 4
            r6 = 2
            r7 = 1
            if (r1 >= r4) goto L_0x0038
            java.lang.String r4 = r10.getString(r1)
            X2.o$f r4 = X2.o.f.f(r4)
            int[] r8 = X2.o.b.f3533a
            int r4 = r4.ordinal()
            r4 = r8[r4]
            if (r4 == r7) goto L_0x0030
            if (r4 == r6) goto L_0x002d
            r6 = 3
            if (r4 == r6) goto L_0x002a
            if (r4 == r5) goto L_0x0027
            goto L_0x0032
        L_0x0027:
            r2 = r2 | 8
            goto L_0x0032
        L_0x002a:
            r2 = r2 | 2
            goto L_0x0032
        L_0x002d:
            r2 = r2 | 4
            goto L_0x0032
        L_0x0030:
            r2 = r2 | 1
        L_0x0032:
            if (r3 != 0) goto L_0x0035
            r3 = r2
        L_0x0035:
            int r1 = r1 + 1
            goto L_0x0004
        L_0x0038:
            if (r2 == 0) goto L_0x0057
            r10 = 9
            r1 = 8
            switch(r2) {
                case 2: goto L_0x0056;
                case 3: goto L_0x004d;
                case 4: goto L_0x004c;
                case 5: goto L_0x004a;
                case 6: goto L_0x004d;
                case 7: goto L_0x004d;
                case 8: goto L_0x0049;
                case 9: goto L_0x004d;
                case 10: goto L_0x0046;
                case 11: goto L_0x0045;
                case 12: goto L_0x004d;
                case 13: goto L_0x004d;
                case 14: goto L_0x004d;
                case 15: goto L_0x0042;
                default: goto L_0x0041;
            }
        L_0x0041:
            goto L_0x0053
        L_0x0042:
            r10 = 13
            return r10
        L_0x0045:
            return r6
        L_0x0046:
            r10 = 11
            return r10
        L_0x0049:
            return r1
        L_0x004a:
            r10 = 12
        L_0x004c:
            return r10
        L_0x004d:
            if (r3 == r6) goto L_0x0056
            if (r3 == r5) goto L_0x0055
            if (r3 == r1) goto L_0x0054
        L_0x0053:
            return r7
        L_0x0054:
            return r1
        L_0x0055:
            return r10
        L_0x0056:
            return r0
        L_0x0057:
            r10 = -1
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X2.o.h(org.json.JSONArray):int");
    }

    public final j i(JSONObject jSONObject) {
        Boolean bool = null;
        Integer valueOf = !jSONObject.isNull("statusBarColor") ? Integer.valueOf(jSONObject.getInt("statusBarColor")) : null;
        d f4 = !jSONObject.isNull("statusBarIconBrightness") ? d.f(jSONObject.getString("statusBarIconBrightness")) : null;
        Boolean valueOf2 = !jSONObject.isNull("systemStatusBarContrastEnforced") ? Boolean.valueOf(jSONObject.getBoolean("systemStatusBarContrastEnforced")) : null;
        Integer valueOf3 = !jSONObject.isNull("systemNavigationBarColor") ? Integer.valueOf(jSONObject.getInt("systemNavigationBarColor")) : null;
        d f5 = !jSONObject.isNull("systemNavigationBarIconBrightness") ? d.f(jSONObject.getString("systemNavigationBarIconBrightness")) : null;
        Integer valueOf4 = !jSONObject.isNull("systemNavigationBarDividerColor") ? Integer.valueOf(jSONObject.getInt("systemNavigationBarDividerColor")) : null;
        if (!jSONObject.isNull("systemNavigationBarContrastEnforced")) {
            bool = Boolean.valueOf(jSONObject.getBoolean("systemNavigationBarContrastEnforced"));
        }
        return new j(valueOf, f4, valueOf2, valueOf3, f5, valueOf4, bool);
    }

    public final k j(String str) {
        int i4 = b.f3535c[k.f(str).ordinal()];
        return i4 != 1 ? i4 != 2 ? i4 != 3 ? i4 != 4 ? k.EDGE_TO_EDGE : k.EDGE_TO_EDGE : k.IMMERSIVE_STICKY : k.IMMERSIVE : k.LEAN_BACK;
    }

    public final List k(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < jSONArray.length(); i4++) {
            int i5 = b.f3534b[l.f(jSONArray.getString(i4)).ordinal()];
            if (i5 == 1) {
                arrayList.add(l.TOP_OVERLAYS);
            } else if (i5 == 2) {
                arrayList.add(l.BOTTOM_OVERLAYS);
            }
        }
        return arrayList;
    }

    public void l(h hVar) {
        this.f3530b = hVar;
    }

    public void m(boolean z4) {
        M2.b.f("PlatformChannel", "Sending 'systemUIChange' message.");
        this.f3529a.c("SystemChrome.systemUIChange", Arrays.asList(new Boolean[]{Boolean.valueOf(z4)}));
    }
}
