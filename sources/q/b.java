package Q;

import R.c;
import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;

public abstract class b implements Spannable {

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final TextPaint f2324a;

        /* renamed from: b  reason: collision with root package name */
        public final TextDirectionHeuristic f2325b;

        /* renamed from: c  reason: collision with root package name */
        public final int f2326c;

        /* renamed from: d  reason: collision with root package name */
        public final int f2327d;

        /* renamed from: e  reason: collision with root package name */
        public final PrecomputedText.Params f2328e;

        public a(PrecomputedText.Params params) {
            this.f2324a = params.getTextPaint();
            this.f2325b = params.getTextDirection();
            this.f2326c = params.getBreakStrategy();
            this.f2327d = params.getHyphenationFrequency();
            this.f2328e = Build.VERSION.SDK_INT < 29 ? null : params;
        }

        public boolean a(a aVar) {
            if (this.f2326c == aVar.b() && this.f2327d == aVar.c() && this.f2324a.getTextSize() == aVar.e().getTextSize() && this.f2324a.getTextScaleX() == aVar.e().getTextScaleX() && this.f2324a.getTextSkewX() == aVar.e().getTextSkewX() && this.f2324a.getLetterSpacing() == aVar.e().getLetterSpacing() && TextUtils.equals(this.f2324a.getFontFeatureSettings(), aVar.e().getFontFeatureSettings()) && this.f2324a.getFlags() == aVar.e().getFlags() && this.f2324a.getTextLocales().equals(aVar.e().getTextLocales())) {
                return this.f2324a.getTypeface() == null ? aVar.e().getTypeface() == null : this.f2324a.getTypeface().equals(aVar.e().getTypeface());
            }
            return false;
        }

        public int b() {
            return this.f2326c;
        }

        public int c() {
            return this.f2327d;
        }

        public TextDirectionHeuristic d() {
            return this.f2325b;
        }

        public TextPaint e() {
            return this.f2324a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (!a(aVar)) {
                return false;
            }
            return this.f2325b == aVar.d();
        }

        public int hashCode() {
            return c.b(Float.valueOf(this.f2324a.getTextSize()), Float.valueOf(this.f2324a.getTextScaleX()), Float.valueOf(this.f2324a.getTextSkewX()), Float.valueOf(this.f2324a.getLetterSpacing()), Integer.valueOf(this.f2324a.getFlags()), this.f2324a.getTextLocales(), this.f2324a.getTypeface(), Boolean.valueOf(this.f2324a.isElegantTextHeight()), this.f2325b, Integer.valueOf(this.f2326c), Integer.valueOf(this.f2327d));
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("{");
            sb.append("textSize=" + this.f2324a.getTextSize());
            sb.append(", textScaleX=" + this.f2324a.getTextScaleX());
            sb.append(", textSkewX=" + this.f2324a.getTextSkewX());
            sb.append(", letterSpacing=" + this.f2324a.getLetterSpacing());
            sb.append(", elegantTextHeight=" + this.f2324a.isElegantTextHeight());
            sb.append(", textLocale=" + this.f2324a.getTextLocales());
            sb.append(", typeface=" + this.f2324a.getTypeface());
            sb.append(", variationSettings=" + this.f2324a.getFontVariationSettings());
            sb.append(", textDir=" + this.f2325b);
            sb.append(", breakStrategy=" + this.f2326c);
            sb.append(", hyphenationFrequency=" + this.f2327d);
            sb.append("}");
            return sb.toString();
        }
    }
}
