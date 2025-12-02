package p;

import Y.c;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import h.C0645a;
import h.f;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.WeakHashMap;

public class a0 extends c implements View.OnClickListener {

    /* renamed from: A  reason: collision with root package name */
    public int f11484A = -1;

    /* renamed from: n  reason: collision with root package name */
    public final SearchView f11485n;

    /* renamed from: o  reason: collision with root package name */
    public final SearchableInfo f11486o;

    /* renamed from: p  reason: collision with root package name */
    public final Context f11487p;

    /* renamed from: q  reason: collision with root package name */
    public final WeakHashMap f11488q;

    /* renamed from: r  reason: collision with root package name */
    public final int f11489r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f11490s = false;

    /* renamed from: t  reason: collision with root package name */
    public int f11491t = 1;

    /* renamed from: u  reason: collision with root package name */
    public ColorStateList f11492u;

    /* renamed from: v  reason: collision with root package name */
    public int f11493v = -1;

    /* renamed from: w  reason: collision with root package name */
    public int f11494w = -1;

    /* renamed from: x  reason: collision with root package name */
    public int f11495x = -1;

    /* renamed from: y  reason: collision with root package name */
    public int f11496y = -1;

    /* renamed from: z  reason: collision with root package name */
    public int f11497z = -1;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final TextView f11498a;

        /* renamed from: b  reason: collision with root package name */
        public final TextView f11499b;

        /* renamed from: c  reason: collision with root package name */
        public final ImageView f11500c;

        /* renamed from: d  reason: collision with root package name */
        public final ImageView f11501d;

        /* renamed from: e  reason: collision with root package name */
        public final ImageView f11502e;

        public a(View view) {
            this.f11498a = (TextView) view.findViewById(16908308);
            this.f11499b = (TextView) view.findViewById(16908309);
            this.f11500c = (ImageView) view.findViewById(16908295);
            this.f11501d = (ImageView) view.findViewById(16908296);
            this.f11502e = (ImageView) view.findViewById(f.f9285q);
        }
    }

    public a0(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), (Cursor) null, true);
        this.f11485n = searchView;
        this.f11486o = searchableInfo;
        this.f11489r = searchView.getSuggestionCommitIconResId();
        this.f11487p = context;
        this.f11488q = weakHashMap;
    }

    public static String o(Cursor cursor, String str) {
        return w(cursor, cursor.getColumnIndex(str));
    }

    public static String w(Cursor cursor, int i4) {
        if (i4 == -1) {
            return null;
        }
        try {
            return cursor.getString(i4);
        } catch (Exception e4) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e4);
            return null;
        }
    }

    public final void A(String str, Drawable drawable) {
        if (drawable != null) {
            this.f11488q.put(str, drawable.getConstantState());
        }
    }

    public final void B(Cursor cursor) {
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    public void a(Cursor cursor) {
        if (this.f11490s) {
            Log.w("SuggestionsAdapter", "Tried to change cursor after adapter was closed.");
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        try {
            super.a(cursor);
            if (cursor != null) {
                this.f11493v = cursor.getColumnIndex("suggest_text_1");
                this.f11494w = cursor.getColumnIndex("suggest_text_2");
                this.f11495x = cursor.getColumnIndex("suggest_text_2_url");
                this.f11496y = cursor.getColumnIndex("suggest_icon_1");
                this.f11497z = cursor.getColumnIndex("suggest_icon_2");
                this.f11484A = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e4) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e4);
        }
    }

    public CharSequence c(Cursor cursor) {
        String o4;
        String o5;
        if (cursor == null) {
            return null;
        }
        String o6 = o(cursor, "suggest_intent_query");
        if (o6 != null) {
            return o6;
        }
        if (this.f11486o.shouldRewriteQueryFromData() && (o5 = o(cursor, "suggest_intent_data")) != null) {
            return o5;
        }
        if (!this.f11486o.shouldRewriteQueryFromText() || (o4 = o(cursor, "suggest_text_1")) == null) {
            return null;
        }
        return o4;
    }

    public Cursor d(CharSequence charSequence) {
        String charSequence2 = charSequence == null ? "" : charSequence.toString();
        if (this.f11485n.getVisibility() == 0 && this.f11485n.getWindowVisibility() == 0) {
            try {
                Cursor v4 = v(this.f11486o, charSequence2, 50);
                if (v4 != null) {
                    v4.getCount();
                    return v4;
                }
            } catch (RuntimeException e4) {
                Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e4);
            }
        }
        return null;
    }

    public void e(View view, Context context, Cursor cursor) {
        a aVar = (a) view.getTag();
        int i4 = this.f11484A;
        int i5 = i4 != -1 ? cursor.getInt(i4) : 0;
        if (aVar.f11498a != null) {
            z(aVar.f11498a, w(cursor, this.f11493v));
        }
        if (aVar.f11499b != null) {
            String w4 = w(cursor, this.f11495x);
            CharSequence l4 = w4 != null ? l(w4) : w(cursor, this.f11494w);
            if (TextUtils.isEmpty(l4)) {
                TextView textView = aVar.f11498a;
                if (textView != null) {
                    textView.setSingleLine(false);
                    aVar.f11498a.setMaxLines(2);
                }
            } else {
                TextView textView2 = aVar.f11498a;
                if (textView2 != null) {
                    textView2.setSingleLine(true);
                    aVar.f11498a.setMaxLines(1);
                }
            }
            z(aVar.f11499b, l4);
        }
        ImageView imageView = aVar.f11500c;
        if (imageView != null) {
            y(imageView, t(cursor), 4);
        }
        ImageView imageView2 = aVar.f11501d;
        if (imageView2 != null) {
            y(imageView2, u(cursor), 8);
        }
        int i6 = this.f11491t;
        if (i6 == 2 || (i6 == 1 && (i5 & 1) != 0)) {
            aVar.f11502e.setVisibility(0);
            aVar.f11502e.setTag(aVar.f11498a.getText());
            aVar.f11502e.setOnClickListener(this);
            return;
        }
        aVar.f11502e.setVisibility(8);
    }

    public View getDropDownView(int i4, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i4, view, viewGroup);
        } catch (RuntimeException e4) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e4);
            View g4 = g(this.f3711f, this.f3710e, viewGroup);
            if (g4 != null) {
                ((a) g4.getTag()).f11498a.setText(e4.toString());
            }
            return g4;
        }
    }

    public View getView(int i4, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i4, view, viewGroup);
        } catch (RuntimeException e4) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e4);
            View h4 = h(this.f3711f, this.f3710e, viewGroup);
            if (h4 != null) {
                ((a) h4.getTag()).f11498a.setText(e4.toString());
            }
            return h4;
        }
    }

    public View h(Context context, Cursor cursor, ViewGroup viewGroup) {
        View h4 = super.h(context, cursor, viewGroup);
        h4.setTag(new a(h4));
        ((ImageView) h4.findViewById(f.f9285q)).setImageResource(this.f11489r);
        return h4;
    }

    public boolean hasStableIds() {
        return false;
    }

    public final Drawable k(String str) {
        Drawable.ConstantState constantState = (Drawable.ConstantState) this.f11488q.get(str);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    public final CharSequence l(CharSequence charSequence) {
        if (this.f11492u == null) {
            TypedValue typedValue = new TypedValue();
            this.f3711f.getTheme().resolveAttribute(C0645a.f9164I, typedValue, true);
            this.f11492u = this.f3711f.getResources().getColorStateList(typedValue.resourceId);
        }
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new TextAppearanceSpan((String) null, 0, 0, this.f11492u, (ColorStateList) null), 0, charSequence.length(), 33);
        return spannableString;
    }

    public final Drawable m(ComponentName componentName) {
        PackageManager packageManager = this.f3711f.getPackageManager();
        try {
            ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, 128);
            int iconResource = activityInfo.getIconResource();
            if (iconResource == 0) {
                return null;
            }
            Drawable drawable = packageManager.getDrawable(componentName.getPackageName(), iconResource, activityInfo.applicationInfo);
            if (drawable != null) {
                return drawable;
            }
            Log.w("SuggestionsAdapter", "Invalid icon resource " + iconResource + " for " + componentName.flattenToShortString());
            return null;
        } catch (PackageManager.NameNotFoundException e4) {
            Log.w("SuggestionsAdapter", e4.toString());
            return null;
        }
    }

    public final Drawable n(ComponentName componentName) {
        String flattenToShortString = componentName.flattenToShortString();
        Drawable.ConstantState constantState = null;
        if (this.f11488q.containsKey(flattenToShortString)) {
            Drawable.ConstantState constantState2 = (Drawable.ConstantState) this.f11488q.get(flattenToShortString);
            if (constantState2 == null) {
                return null;
            }
            return constantState2.newDrawable(this.f11487p.getResources());
        }
        Drawable m4 = m(componentName);
        if (m4 != null) {
            constantState = m4.getConstantState();
        }
        this.f11488q.put(flattenToShortString, constantState);
        return m4;
    }

    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        B(b());
    }

    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        B(b());
    }

    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f11485n.U((CharSequence) tag);
        }
    }

    public final Drawable p() {
        Drawable n4 = n(this.f11486o.getSearchActivity());
        return n4 != null ? n4 : this.f3711f.getPackageManager().getDefaultActivityIcon();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:8|9|10) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
        throw new java.io.FileNotFoundException("Resource does not exist: " + r7);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0018 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.drawable.Drawable q(android.net.Uri r7) {
        /*
            r6 = this;
            java.lang.String r0 = "Error closing icon stream for "
            java.lang.String r1 = "SuggestionsAdapter"
            r2 = 0
            java.lang.String r3 = r7.getScheme()     // Catch:{ FileNotFoundException -> 0x0016 }
            java.lang.String r4 = "android.resource"
            boolean r3 = r4.equals(r3)     // Catch:{ FileNotFoundException -> 0x0016 }
            if (r3 == 0) goto L_0x002f
            android.graphics.drawable.Drawable r7 = r6.r(r7)     // Catch:{ NotFoundException -> 0x0018 }
            return r7
        L_0x0016:
            r0 = move-exception
            goto L_0x0087
        L_0x0018:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException     // Catch:{ FileNotFoundException -> 0x0016 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0016 }
            r3.<init>()     // Catch:{ FileNotFoundException -> 0x0016 }
            java.lang.String r4 = "Resource does not exist: "
            r3.append(r4)     // Catch:{ FileNotFoundException -> 0x0016 }
            r3.append(r7)     // Catch:{ FileNotFoundException -> 0x0016 }
            java.lang.String r3 = r3.toString()     // Catch:{ FileNotFoundException -> 0x0016 }
            r0.<init>(r3)     // Catch:{ FileNotFoundException -> 0x0016 }
            throw r0     // Catch:{ FileNotFoundException -> 0x0016 }
        L_0x002f:
            android.content.Context r3 = r6.f11487p     // Catch:{ FileNotFoundException -> 0x0016 }
            android.content.ContentResolver r3 = r3.getContentResolver()     // Catch:{ FileNotFoundException -> 0x0016 }
            java.io.InputStream r3 = r3.openInputStream(r7)     // Catch:{ FileNotFoundException -> 0x0016 }
            if (r3 == 0) goto L_0x0070
            android.graphics.drawable.Drawable r4 = android.graphics.drawable.Drawable.createFromStream(r3, r2)     // Catch:{ all -> 0x0057 }
            r3.close()     // Catch:{ IOException -> 0x0043 }
            goto L_0x0056
        L_0x0043:
            r3 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0016 }
            r5.<init>()     // Catch:{ FileNotFoundException -> 0x0016 }
            r5.append(r0)     // Catch:{ FileNotFoundException -> 0x0016 }
            r5.append(r7)     // Catch:{ FileNotFoundException -> 0x0016 }
            java.lang.String r0 = r5.toString()     // Catch:{ FileNotFoundException -> 0x0016 }
            android.util.Log.e(r1, r0, r3)     // Catch:{ FileNotFoundException -> 0x0016 }
        L_0x0056:
            return r4
        L_0x0057:
            r4 = move-exception
            r3.close()     // Catch:{ IOException -> 0x005c }
            goto L_0x006f
        L_0x005c:
            r3 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0016 }
            r5.<init>()     // Catch:{ FileNotFoundException -> 0x0016 }
            r5.append(r0)     // Catch:{ FileNotFoundException -> 0x0016 }
            r5.append(r7)     // Catch:{ FileNotFoundException -> 0x0016 }
            java.lang.String r0 = r5.toString()     // Catch:{ FileNotFoundException -> 0x0016 }
            android.util.Log.e(r1, r0, r3)     // Catch:{ FileNotFoundException -> 0x0016 }
        L_0x006f:
            throw r4     // Catch:{ FileNotFoundException -> 0x0016 }
        L_0x0070:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException     // Catch:{ FileNotFoundException -> 0x0016 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0016 }
            r3.<init>()     // Catch:{ FileNotFoundException -> 0x0016 }
            java.lang.String r4 = "Failed to open "
            r3.append(r4)     // Catch:{ FileNotFoundException -> 0x0016 }
            r3.append(r7)     // Catch:{ FileNotFoundException -> 0x0016 }
            java.lang.String r3 = r3.toString()     // Catch:{ FileNotFoundException -> 0x0016 }
            r0.<init>(r3)     // Catch:{ FileNotFoundException -> 0x0016 }
            throw r0     // Catch:{ FileNotFoundException -> 0x0016 }
        L_0x0087:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Icon not found: "
            r3.append(r4)
            r3.append(r7)
            java.lang.String r7 = ", "
            r3.append(r7)
            java.lang.String r7 = r0.getMessage()
            r3.append(r7)
            java.lang.String r7 = r3.toString()
            android.util.Log.w(r1, r7)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p.a0.q(android.net.Uri):android.graphics.drawable.Drawable");
    }

    public Drawable r(Uri uri) {
        int i4;
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            try {
                Resources resourcesForApplication = this.f3711f.getPackageManager().getResourcesForApplication(authority);
                List<String> pathSegments = uri.getPathSegments();
                if (pathSegments != null) {
                    int size = pathSegments.size();
                    if (size == 1) {
                        try {
                            i4 = Integer.parseInt(pathSegments.get(0));
                        } catch (NumberFormatException unused) {
                            throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                        }
                    } else if (size == 2) {
                        i4 = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
                    } else {
                        throw new FileNotFoundException("More than two path segments: " + uri);
                    }
                    if (i4 != 0) {
                        return resourcesForApplication.getDrawable(i4);
                    }
                    throw new FileNotFoundException("No resource found for: " + uri);
                }
                throw new FileNotFoundException("No path: " + uri);
            } catch (PackageManager.NameNotFoundException unused2) {
                throw new FileNotFoundException("No package found for authority: " + uri);
            }
        } else {
            throw new FileNotFoundException("No authority: " + uri);
        }
    }

    public final Drawable s(String str) {
        if (str == null || str.isEmpty() || "0".equals(str)) {
            return null;
        }
        try {
            int parseInt = Integer.parseInt(str);
            String str2 = "android.resource://" + this.f11487p.getPackageName() + "/" + parseInt;
            Drawable k4 = k(str2);
            if (k4 != null) {
                return k4;
            }
            Drawable d4 = H.a.d(this.f11487p, parseInt);
            A(str2, d4);
            return d4;
        } catch (NumberFormatException unused) {
            Drawable k5 = k(str);
            if (k5 != null) {
                return k5;
            }
            Drawable q4 = q(Uri.parse(str));
            A(str, q4);
            return q4;
        } catch (Resources.NotFoundException unused2) {
            Log.w("SuggestionsAdapter", "Icon resource not found: " + str);
            return null;
        }
    }

    public final Drawable t(Cursor cursor) {
        int i4 = this.f11496y;
        if (i4 == -1) {
            return null;
        }
        Drawable s4 = s(cursor.getString(i4));
        return s4 != null ? s4 : p();
    }

    public final Drawable u(Cursor cursor) {
        int i4 = this.f11497z;
        if (i4 == -1) {
            return null;
        }
        return s(cursor.getString(i4));
    }

    public Cursor v(SearchableInfo searchableInfo, String str, int i4) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder fragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        if (i4 > 0) {
            fragment.appendQueryParameter("limit", String.valueOf(i4));
        }
        return this.f3711f.getContentResolver().query(fragment.build(), (String[]) null, suggestSelection, strArr2, (String) null);
    }

    public void x(int i4) {
        this.f11491t = i4;
    }

    public final void y(ImageView imageView, Drawable drawable, int i4) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i4);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    public final void z(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
    }
}
