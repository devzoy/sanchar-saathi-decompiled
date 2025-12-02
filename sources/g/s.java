package G;

import android.app.RemoteInput;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class s {

    /* renamed from: a  reason: collision with root package name */
    public final String f1246a;

    /* renamed from: b  reason: collision with root package name */
    public final CharSequence f1247b;

    /* renamed from: c  reason: collision with root package name */
    public final CharSequence[] f1248c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f1249d;

    /* renamed from: e  reason: collision with root package name */
    public final int f1250e;

    /* renamed from: f  reason: collision with root package name */
    public final Bundle f1251f;

    /* renamed from: g  reason: collision with root package name */
    public final Set f1252g;

    public static class a {
        public static void a(Object obj, Intent intent, Bundle bundle) {
            RemoteInput.addResultsToIntent((RemoteInput[]) obj, intent, bundle);
        }

        public static RemoteInput b(s sVar) {
            RemoteInput.Builder addExtras = new RemoteInput.Builder(sVar.i()).setLabel(sVar.h()).setChoices(sVar.e()).setAllowFreeFormInput(sVar.c()).addExtras(sVar.g());
            Set<String> d4 = sVar.d();
            if (d4 != null) {
                for (String d5 : d4) {
                    b.d(addExtras, d5, true);
                }
            }
            if (Build.VERSION.SDK_INT >= 29) {
                c.b(addExtras, sVar.f());
            }
            return addExtras.build();
        }

        public static Bundle c(Intent intent) {
            return RemoteInput.getResultsFromIntent(intent);
        }
    }

    public static class b {
        public static void a(s sVar, Intent intent, Map<String, Uri> map) {
            RemoteInput.addDataResultToIntent(s.a(sVar), intent, map);
        }

        public static Set<String> b(Object obj) {
            return ((RemoteInput) obj).getAllowedDataTypes();
        }

        public static Map<String, Uri> c(Intent intent, String str) {
            return RemoteInput.getDataResultsFromIntent(intent, str);
        }

        public static RemoteInput.Builder d(RemoteInput.Builder builder, String str, boolean z4) {
            return builder.setAllowDataType(str, z4);
        }
    }

    public static class c {
        public static int a(Object obj) {
            return ((RemoteInput) obj).getEditChoicesBeforeSending();
        }

        public static RemoteInput.Builder b(RemoteInput.Builder builder, int i4) {
            return builder.setEditChoicesBeforeSending(i4);
        }
    }

    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final String f1253a;

        /* renamed from: b  reason: collision with root package name */
        public final Set f1254b = new HashSet();

        /* renamed from: c  reason: collision with root package name */
        public final Bundle f1255c = new Bundle();

        /* renamed from: d  reason: collision with root package name */
        public CharSequence f1256d;

        /* renamed from: e  reason: collision with root package name */
        public CharSequence[] f1257e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f1258f = true;

        /* renamed from: g  reason: collision with root package name */
        public int f1259g = 0;

        public d(String str) {
            if (str != null) {
                this.f1253a = str;
                return;
            }
            throw new IllegalArgumentException("Result key can't be null");
        }

        public s a() {
            return new s(this.f1253a, this.f1256d, this.f1257e, this.f1258f, this.f1259g, this.f1255c, this.f1254b);
        }

        public d b(String str, boolean z4) {
            if (z4) {
                this.f1254b.add(str);
            } else {
                this.f1254b.remove(str);
            }
            return this;
        }

        public d c(boolean z4) {
            this.f1258f = z4;
            return this;
        }

        public d d(CharSequence[] charSequenceArr) {
            this.f1257e = charSequenceArr;
            return this;
        }

        public d e(CharSequence charSequence) {
            this.f1256d = charSequence;
            return this;
        }
    }

    public s(String str, CharSequence charSequence, CharSequence[] charSequenceArr, boolean z4, int i4, Bundle bundle, Set set) {
        this.f1246a = str;
        this.f1247b = charSequence;
        this.f1248c = charSequenceArr;
        this.f1249d = z4;
        this.f1250e = i4;
        this.f1251f = bundle;
        this.f1252g = set;
        if (f() == 2 && !c()) {
            throw new IllegalArgumentException("setEditChoicesBeforeSending requires setAllowFreeFormInput");
        }
    }

    public static RemoteInput a(s sVar) {
        return a.b(sVar);
    }

    public static RemoteInput[] b(s[] sVarArr) {
        if (sVarArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[sVarArr.length];
        for (int i4 = 0; i4 < sVarArr.length; i4++) {
            remoteInputArr[i4] = a(sVarArr[i4]);
        }
        return remoteInputArr;
    }

    public static Bundle j(Intent intent) {
        return a.c(intent);
    }

    public boolean c() {
        return this.f1249d;
    }

    public Set d() {
        return this.f1252g;
    }

    public CharSequence[] e() {
        return this.f1248c;
    }

    public int f() {
        return this.f1250e;
    }

    public Bundle g() {
        return this.f1251f;
    }

    public CharSequence h() {
        return this.f1247b;
    }

    public String i() {
        return this.f1246a;
    }

    public boolean k() {
        return !c() && (e() == null || e().length == 0) && d() != null && !d().isEmpty();
    }
}
