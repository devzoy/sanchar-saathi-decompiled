package g2;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public CharSequence f9130a;

    /* renamed from: b  reason: collision with root package name */
    public final TextPaint f9131b;

    /* renamed from: c  reason: collision with root package name */
    public final int f9132c;

    /* renamed from: d  reason: collision with root package name */
    public int f9133d = 0;

    /* renamed from: e  reason: collision with root package name */
    public int f9134e;

    /* renamed from: f  reason: collision with root package name */
    public Layout.Alignment f9135f;

    /* renamed from: g  reason: collision with root package name */
    public int f9136g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f9137h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f9138i;

    /* renamed from: j  reason: collision with root package name */
    public TextUtils.TruncateAt f9139j;

    public static class a extends Exception {
    }

    public f(CharSequence charSequence, TextPaint textPaint, int i4) {
        this.f9130a = charSequence;
        this.f9131b = textPaint;
        this.f9132c = i4;
        this.f9134e = charSequence.length();
        this.f9135f = Layout.Alignment.ALIGN_NORMAL;
        this.f9136g = Integer.MAX_VALUE;
        this.f9137h = true;
        this.f9139j = null;
    }

    public static f b(CharSequence charSequence, TextPaint textPaint, int i4) {
        return new f(charSequence, textPaint, i4);
    }

    public StaticLayout a() {
        if (this.f9130a == null) {
            this.f9130a = "";
        }
        int max = Math.max(0, this.f9132c);
        CharSequence charSequence = this.f9130a;
        if (this.f9136g == 1) {
            charSequence = TextUtils.ellipsize(charSequence, this.f9131b, (float) max, this.f9139j);
        }
        int min = Math.min(charSequence.length(), this.f9134e);
        this.f9134e = min;
        if (this.f9138i) {
            this.f9135f = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, this.f9133d, min, this.f9131b, max);
        obtain.setAlignment(this.f9135f);
        obtain.setIncludePad(this.f9137h);
        obtain.setTextDirection(this.f9138i ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f9139j;
        if (truncateAt != null) {
            obtain.setEllipsize(truncateAt);
        }
        obtain.setMaxLines(this.f9136g);
        return obtain.build();
    }

    public f c(Layout.Alignment alignment) {
        this.f9135f = alignment;
        return this;
    }

    public f d(TextUtils.TruncateAt truncateAt) {
        this.f9139j = truncateAt;
        return this;
    }

    public f e(boolean z4) {
        this.f9137h = z4;
        return this;
    }

    public f f(boolean z4) {
        this.f9138i = z4;
        return this;
    }

    public f g(int i4) {
        this.f9136g = i4;
        return this;
    }
}
