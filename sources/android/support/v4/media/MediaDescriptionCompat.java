package android.support.v4.media;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new a();

    /* renamed from: e  reason: collision with root package name */
    public final String f4008e;

    /* renamed from: f  reason: collision with root package name */
    public final CharSequence f4009f;

    /* renamed from: g  reason: collision with root package name */
    public final CharSequence f4010g;

    /* renamed from: h  reason: collision with root package name */
    public final CharSequence f4011h;

    /* renamed from: i  reason: collision with root package name */
    public final Bitmap f4012i;

    /* renamed from: j  reason: collision with root package name */
    public final Uri f4013j;

    /* renamed from: k  reason: collision with root package name */
    public final Bundle f4014k;

    /* renamed from: l  reason: collision with root package name */
    public final Uri f4015l;

    /* renamed from: m  reason: collision with root package name */
    public MediaDescription f4016m;

    public static class a implements Parcelable.Creator {
        /* renamed from: a */
        public MediaDescriptionCompat createFromParcel(Parcel parcel) {
            return MediaDescriptionCompat.a(MediaDescription.CREATOR.createFromParcel(parcel));
        }

        /* renamed from: b */
        public MediaDescriptionCompat[] newArray(int i4) {
            return new MediaDescriptionCompat[i4];
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public String f4017a;

        /* renamed from: b  reason: collision with root package name */
        public CharSequence f4018b;

        /* renamed from: c  reason: collision with root package name */
        public CharSequence f4019c;

        /* renamed from: d  reason: collision with root package name */
        public CharSequence f4020d;

        /* renamed from: e  reason: collision with root package name */
        public Bitmap f4021e;

        /* renamed from: f  reason: collision with root package name */
        public Uri f4022f;

        /* renamed from: g  reason: collision with root package name */
        public Bundle f4023g;

        /* renamed from: h  reason: collision with root package name */
        public Uri f4024h;

        public MediaDescriptionCompat a() {
            return new MediaDescriptionCompat(this.f4017a, this.f4018b, this.f4019c, this.f4020d, this.f4021e, this.f4022f, this.f4023g, this.f4024h);
        }

        public b b(CharSequence charSequence) {
            this.f4020d = charSequence;
            return this;
        }

        public b c(Bundle bundle) {
            this.f4023g = bundle;
            return this;
        }

        public b d(Bitmap bitmap) {
            this.f4021e = bitmap;
            return this;
        }

        public b e(Uri uri) {
            this.f4022f = uri;
            return this;
        }

        public b f(String str) {
            this.f4017a = str;
            return this;
        }

        public b g(Uri uri) {
            this.f4024h = uri;
            return this;
        }

        public b h(CharSequence charSequence) {
            this.f4019c = charSequence;
            return this;
        }

        public b i(CharSequence charSequence) {
            this.f4018b = charSequence;
            return this;
        }
    }

    public MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f4008e = str;
        this.f4009f = charSequence;
        this.f4010g = charSequence2;
        this.f4011h = charSequence3;
        this.f4012i = bitmap;
        this.f4013j = uri;
        this.f4014k = bundle;
        this.f4015l = uri2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0069  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.support.v4.media.MediaDescriptionCompat a(java.lang.Object r8) {
        /*
            r0 = 0
            if (r8 == 0) goto L_0x0076
            android.support.v4.media.MediaDescriptionCompat$b r1 = new android.support.v4.media.MediaDescriptionCompat$b
            r1.<init>()
            android.media.MediaDescription r8 = (android.media.MediaDescription) r8
            java.lang.String r2 = r8.getMediaId()
            r1.f(r2)
            java.lang.CharSequence r2 = r8.getTitle()
            r1.i(r2)
            java.lang.CharSequence r2 = r8.getSubtitle()
            r1.h(r2)
            java.lang.CharSequence r2 = r8.getDescription()
            r1.b(r2)
            android.graphics.Bitmap r2 = r8.getIconBitmap()
            r1.d(r2)
            android.net.Uri r2 = r8.getIconUri()
            r1.e(r2)
            android.os.Bundle r2 = r8.getExtras()
            java.lang.String r3 = "android.support.v4.media.description.MEDIA_URI"
            if (r2 == 0) goto L_0x0046
            android.support.v4.media.session.MediaSessionCompat.a(r2)
            android.os.Parcelable r4 = r2.getParcelable(r3)
            android.net.Uri r4 = (android.net.Uri) r4
            goto L_0x0047
        L_0x0046:
            r4 = r0
        L_0x0047:
            if (r4 == 0) goto L_0x005f
            java.lang.String r5 = "android.support.v4.media.description.NULL_BUNDLE_FLAG"
            boolean r6 = r2.containsKey(r5)
            if (r6 == 0) goto L_0x0059
            int r6 = r2.size()
            r7 = 2
            if (r6 != r7) goto L_0x0059
            goto L_0x0060
        L_0x0059:
            r2.remove(r3)
            r2.remove(r5)
        L_0x005f:
            r0 = r2
        L_0x0060:
            r1.c(r0)
            if (r4 == 0) goto L_0x0069
            r1.g(r4)
            goto L_0x0070
        L_0x0069:
            android.net.Uri r0 = r8.getMediaUri()
            r1.g(r0)
        L_0x0070:
            android.support.v4.media.MediaDescriptionCompat r0 = r1.a()
            r0.f4016m = r8
        L_0x0076:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.MediaDescriptionCompat.a(java.lang.Object):android.support.v4.media.MediaDescriptionCompat");
    }

    public Object c() {
        MediaDescription mediaDescription = this.f4016m;
        if (mediaDescription != null) {
            return mediaDescription;
        }
        MediaDescription.Builder builder = new MediaDescription.Builder();
        builder.setMediaId(this.f4008e);
        builder.setTitle(this.f4009f);
        builder.setSubtitle(this.f4010g);
        builder.setDescription(this.f4011h);
        builder.setIconBitmap(this.f4012i);
        builder.setIconUri(this.f4013j);
        builder.setExtras(this.f4014k);
        builder.setMediaUri(this.f4015l);
        MediaDescription build = builder.build();
        this.f4016m = build;
        return build;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.f4009f + ", " + this.f4010g + ", " + this.f4011h;
    }

    public void writeToParcel(Parcel parcel, int i4) {
        ((MediaDescription) c()).writeToParcel(parcel, i4);
    }
}
