package androidx.core.graphics.drawable;

import R.g;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.nio.charset.Charset;

public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: k  reason: collision with root package name */
    public static final PorterDuff.Mode f4970k = PorterDuff.Mode.SRC_IN;

    /* renamed from: a  reason: collision with root package name */
    public int f4971a;

    /* renamed from: b  reason: collision with root package name */
    public Object f4972b;

    /* renamed from: c  reason: collision with root package name */
    public byte[] f4973c;

    /* renamed from: d  reason: collision with root package name */
    public Parcelable f4974d;

    /* renamed from: e  reason: collision with root package name */
    public int f4975e;

    /* renamed from: f  reason: collision with root package name */
    public int f4976f;

    /* renamed from: g  reason: collision with root package name */
    public ColorStateList f4977g;

    /* renamed from: h  reason: collision with root package name */
    public PorterDuff.Mode f4978h;

    /* renamed from: i  reason: collision with root package name */
    public String f4979i;

    /* renamed from: j  reason: collision with root package name */
    public String f4980j;

    public static class a {
        public static IconCompat a(Object obj) {
            g.c(obj);
            int d4 = d(obj);
            if (d4 == 2) {
                return IconCompat.k((Resources) null, c(obj), b(obj));
            }
            if (d4 == 4) {
                return IconCompat.g(e(obj));
            }
            if (d4 == 6) {
                return IconCompat.d(e(obj));
            }
            IconCompat iconCompat = new IconCompat(-1);
            iconCompat.f4972b = obj;
            return iconCompat;
        }

        public static int b(Object obj) {
            return c.a(obj);
        }

        public static String c(Object obj) {
            return c.b(obj);
        }

        public static int d(Object obj) {
            return c.c(obj);
        }

        public static Uri e(Object obj) {
            return c.d(obj);
        }

        public static Drawable f(Icon icon, Context context) {
            return icon.loadDrawable(context);
        }

        public static Icon g(IconCompat iconCompat, Context context) {
            Icon icon;
            switch (iconCompat.f4971a) {
                case -1:
                    return (Icon) iconCompat.f4972b;
                case 1:
                    icon = Icon.createWithBitmap((Bitmap) iconCompat.f4972b);
                    break;
                case 2:
                    icon = Icon.createWithResource(iconCompat.n(), iconCompat.f4975e);
                    break;
                case 3:
                    icon = Icon.createWithData((byte[]) iconCompat.f4972b, iconCompat.f4975e, iconCompat.f4976f);
                    break;
                case 4:
                    icon = Icon.createWithContentUri((String) iconCompat.f4972b);
                    break;
                case 5:
                    icon = b.b((Bitmap) iconCompat.f4972b);
                    break;
                case 6:
                    if (Build.VERSION.SDK_INT >= 30) {
                        icon = d.a(iconCompat.p());
                        break;
                    } else if (context != null) {
                        InputStream q4 = iconCompat.q(context);
                        if (q4 != null) {
                            icon = b.b(BitmapFactory.decodeStream(q4));
                            break;
                        } else {
                            throw new IllegalStateException("Cannot load adaptive icon from uri: " + iconCompat.p());
                        }
                    } else {
                        throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + iconCompat.p());
                    }
                default:
                    throw new IllegalArgumentException("Unknown type");
            }
            ColorStateList colorStateList = iconCompat.f4977g;
            if (colorStateList != null) {
                icon.setTintList(colorStateList);
            }
            PorterDuff.Mode mode = iconCompat.f4978h;
            if (mode != IconCompat.f4970k) {
                icon.setTintMode(mode);
            }
            return icon;
        }
    }

    public static class b {
        public static Drawable a(Drawable drawable, Drawable drawable2) {
            return new AdaptiveIconDrawable(drawable, drawable2);
        }

        public static Icon b(Bitmap bitmap) {
            return Icon.createWithAdaptiveBitmap(bitmap);
        }
    }

    public static class c {
        public static int a(Object obj) {
            return ((Icon) obj).getResId();
        }

        public static String b(Object obj) {
            return ((Icon) obj).getResPackage();
        }

        public static int c(Object obj) {
            return ((Icon) obj).getType();
        }

        public static Uri d(Object obj) {
            return ((Icon) obj).getUri();
        }
    }

    public static class d {
        public static Icon a(Uri uri) {
            return Icon.createWithAdaptiveBitmapContentUri(uri);
        }
    }

    public IconCompat() {
        this.f4971a = -1;
        this.f4973c = null;
        this.f4974d = null;
        this.f4975e = 0;
        this.f4976f = 0;
        this.f4977g = null;
        this.f4978h = f4970k;
        this.f4979i = null;
    }

    public static IconCompat a(Bundle bundle) {
        int i4 = bundle.getInt("type");
        IconCompat iconCompat = new IconCompat(i4);
        iconCompat.f4975e = bundle.getInt("int1");
        iconCompat.f4976f = bundle.getInt("int2");
        iconCompat.f4980j = bundle.getString("string1");
        if (bundle.containsKey("tint_list")) {
            iconCompat.f4977g = (ColorStateList) bundle.getParcelable("tint_list");
        }
        if (bundle.containsKey("tint_mode")) {
            iconCompat.f4978h = PorterDuff.Mode.valueOf(bundle.getString("tint_mode"));
        }
        switch (i4) {
            case -1:
            case 1:
            case 5:
                iconCompat.f4972b = bundle.getParcelable("obj");
                break;
            case 2:
            case 4:
            case 6:
                iconCompat.f4972b = bundle.getString("obj");
                break;
            case 3:
                iconCompat.f4972b = bundle.getByteArray("obj");
                break;
            default:
                Log.w("IconCompat", "Unknown type " + i4);
                return null;
        }
        return iconCompat;
    }

    public static IconCompat b(Icon icon) {
        return a.a(icon);
    }

    public static Bitmap c(Bitmap bitmap, boolean z4) {
        int min = (int) (((float) Math.min(bitmap.getWidth(), bitmap.getHeight())) * 0.6666667f);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f4 = (float) min;
        float f5 = 0.5f * f4;
        float f6 = 0.9166667f * f5;
        if (z4) {
            float f7 = 0.010416667f * f4;
            paint.setColor(0);
            paint.setShadowLayer(f7, 0.0f, f4 * 0.020833334f, 1023410176);
            canvas.drawCircle(f5, f5, f6, paint);
            paint.setShadowLayer(f7, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f5, f5, f6, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate(((float) (-(bitmap.getWidth() - min))) / 2.0f, ((float) (-(bitmap.getHeight() - min))) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f5, f5, f6, paint);
        canvas.setBitmap((Bitmap) null);
        return createBitmap;
    }

    public static IconCompat d(Uri uri) {
        R.c.c(uri);
        return e(uri.toString());
    }

    public static IconCompat e(String str) {
        R.c.c(str);
        IconCompat iconCompat = new IconCompat(6);
        iconCompat.f4972b = str;
        return iconCompat;
    }

    public static IconCompat f(Bitmap bitmap) {
        R.c.c(bitmap);
        IconCompat iconCompat = new IconCompat(1);
        iconCompat.f4972b = bitmap;
        return iconCompat;
    }

    public static IconCompat g(Uri uri) {
        R.c.c(uri);
        return h(uri.toString());
    }

    public static IconCompat h(String str) {
        R.c.c(str);
        IconCompat iconCompat = new IconCompat(4);
        iconCompat.f4972b = str;
        return iconCompat;
    }

    public static IconCompat i(byte[] bArr, int i4, int i5) {
        R.c.c(bArr);
        IconCompat iconCompat = new IconCompat(3);
        iconCompat.f4972b = bArr;
        iconCompat.f4975e = i4;
        iconCompat.f4976f = i5;
        return iconCompat;
    }

    public static IconCompat j(Context context, int i4) {
        R.c.c(context);
        return k(context.getResources(), context.getPackageName(), i4);
    }

    public static IconCompat k(Resources resources, String str, int i4) {
        R.c.c(str);
        if (i4 != 0) {
            IconCompat iconCompat = new IconCompat(2);
            iconCompat.f4975e = i4;
            if (resources != null) {
                try {
                    iconCompat.f4972b = resources.getResourceName(i4);
                } catch (Resources.NotFoundException unused) {
                    throw new IllegalArgumentException("Icon resource cannot be found");
                }
            } else {
                iconCompat.f4972b = str;
            }
            iconCompat.f4980j = str;
            return iconCompat;
        }
        throw new IllegalArgumentException("Drawable resource ID must not be 0");
    }

    public static String w(int i4) {
        switch (i4) {
            case 1:
                return "BITMAP";
            case 2:
                return "RESOURCE";
            case 3:
                return "DATA";
            case 4:
                return "URI";
            case 5:
                return "BITMAP_MASKABLE";
            case 6:
                return "URI_MASKABLE";
            default:
                return "UNKNOWN";
        }
    }

    public Bitmap l() {
        int i4 = this.f4971a;
        if (i4 == -1) {
            Object obj = this.f4972b;
            if (obj instanceof Bitmap) {
                return (Bitmap) obj;
            }
            return null;
        } else if (i4 == 1) {
            return (Bitmap) this.f4972b;
        } else {
            if (i4 == 5) {
                return c((Bitmap) this.f4972b, true);
            }
            throw new IllegalStateException("called getBitmap() on " + this);
        }
    }

    public int m() {
        int i4 = this.f4971a;
        if (i4 == -1) {
            return a.b(this.f4972b);
        }
        if (i4 == 2) {
            return this.f4975e;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    public String n() {
        int i4 = this.f4971a;
        if (i4 == -1) {
            return a.c(this.f4972b);
        }
        if (i4 == 2) {
            String str = this.f4980j;
            return (str == null || TextUtils.isEmpty(str)) ? ((String) this.f4972b).split(":", -1)[0] : this.f4980j;
        }
        throw new IllegalStateException("called getResPackage() on " + this);
    }

    public int o() {
        int i4 = this.f4971a;
        return i4 == -1 ? a.d(this.f4972b) : i4;
    }

    public Uri p() {
        int i4 = this.f4971a;
        if (i4 == -1) {
            return a.e(this.f4972b);
        }
        if (i4 == 4 || i4 == 6) {
            return Uri.parse((String) this.f4972b);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    public InputStream q(Context context) {
        Uri p4 = p();
        String scheme = p4.getScheme();
        if ("content".equals(scheme) || "file".equals(scheme)) {
            try {
                return context.getContentResolver().openInputStream(p4);
            } catch (Exception e4) {
                Log.w("IconCompat", "Unable to load image from URI: " + p4, e4);
                return null;
            }
        } else {
            try {
                return new FileInputStream(new File((String) this.f4972b));
            } catch (FileNotFoundException e5) {
                Log.w("IconCompat", "Unable to load image from path: " + p4, e5);
                return null;
            }
        }
    }

    public void r() {
        this.f4978h = PorterDuff.Mode.valueOf(this.f4979i);
        switch (this.f4971a) {
            case -1:
                Parcelable parcelable = this.f4974d;
                if (parcelable != null) {
                    this.f4972b = parcelable;
                    return;
                }
                throw new IllegalArgumentException("Invalid icon");
            case 1:
            case 5:
                Parcelable parcelable2 = this.f4974d;
                if (parcelable2 != null) {
                    this.f4972b = parcelable2;
                    return;
                }
                byte[] bArr = this.f4973c;
                this.f4972b = bArr;
                this.f4971a = 3;
                this.f4975e = 0;
                this.f4976f = bArr.length;
                return;
            case 2:
            case 4:
            case 6:
                String str = new String(this.f4973c, Charset.forName("UTF-16"));
                this.f4972b = str;
                if (this.f4971a == 2 && this.f4980j == null) {
                    this.f4980j = str.split(":", -1)[0];
                    return;
                }
                return;
            case 3:
                this.f4972b = this.f4973c;
                return;
            default:
                return;
        }
    }

    public void s(boolean z4) {
        this.f4979i = this.f4978h.name();
        switch (this.f4971a) {
            case -1:
                if (!z4) {
                    this.f4974d = (Parcelable) this.f4972b;
                    return;
                }
                throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
            case 1:
            case 5:
                if (z4) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    ((Bitmap) this.f4972b).compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                    this.f4973c = byteArrayOutputStream.toByteArray();
                    return;
                }
                this.f4974d = (Parcelable) this.f4972b;
                return;
            case 2:
                this.f4973c = ((String) this.f4972b).getBytes(Charset.forName("UTF-16"));
                return;
            case 3:
                this.f4973c = (byte[]) this.f4972b;
                return;
            case 4:
            case 6:
                this.f4973c = this.f4972b.toString().getBytes(Charset.forName("UTF-16"));
                return;
            default:
                return;
        }
    }

    public Bundle t() {
        Bundle bundle = new Bundle();
        switch (this.f4971a) {
            case -1:
                bundle.putParcelable("obj", (Parcelable) this.f4972b);
                break;
            case 1:
            case 5:
                bundle.putParcelable("obj", (Bitmap) this.f4972b);
                break;
            case 2:
            case 4:
            case 6:
                bundle.putString("obj", (String) this.f4972b);
                break;
            case 3:
                bundle.putByteArray("obj", (byte[]) this.f4972b);
                break;
            default:
                throw new IllegalArgumentException("Invalid icon");
        }
        bundle.putInt("type", this.f4971a);
        bundle.putInt("int1", this.f4975e);
        bundle.putInt("int2", this.f4976f);
        bundle.putString("string1", this.f4980j);
        ColorStateList colorStateList = this.f4977g;
        if (colorStateList != null) {
            bundle.putParcelable("tint_list", colorStateList);
        }
        PorterDuff.Mode mode = this.f4978h;
        if (mode != f4970k) {
            bundle.putString("tint_mode", mode.name());
        }
        return bundle;
    }

    public String toString() {
        if (this.f4971a == -1) {
            return String.valueOf(this.f4972b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        sb.append(w(this.f4971a));
        switch (this.f4971a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f4972b).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f4972b).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f4980j);
                sb.append(" id=");
                sb.append(String.format("0x%08x", new Object[]{Integer.valueOf(m())}));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f4975e);
                if (this.f4976f != 0) {
                    sb.append(" off=");
                    sb.append(this.f4976f);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f4972b);
                break;
        }
        if (this.f4977g != null) {
            sb.append(" tint=");
            sb.append(this.f4977g);
        }
        if (this.f4978h != f4970k) {
            sb.append(" mode=");
            sb.append(this.f4978h);
        }
        sb.append(")");
        return sb.toString();
    }

    public Icon u() {
        return v((Context) null);
    }

    public Icon v(Context context) {
        return a.g(this, context);
    }

    public IconCompat(int i4) {
        this.f4973c = null;
        this.f4974d = null;
        this.f4975e = 0;
        this.f4976f = 0;
        this.f4977g = null;
        this.f4978h = f4970k;
        this.f4979i = null;
        this.f4971a = i4;
    }
}
