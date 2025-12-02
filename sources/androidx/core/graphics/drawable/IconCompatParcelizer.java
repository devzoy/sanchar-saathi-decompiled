package androidx.core.graphics.drawable;

import F0.a;
import android.content.res.ColorStateList;
import android.os.Parcelable;

public class IconCompatParcelizer {
    public static IconCompat read(a aVar) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f4971a = aVar.p(iconCompat.f4971a, 1);
        iconCompat.f4973c = aVar.j(iconCompat.f4973c, 2);
        iconCompat.f4974d = aVar.r(iconCompat.f4974d, 3);
        iconCompat.f4975e = aVar.p(iconCompat.f4975e, 4);
        iconCompat.f4976f = aVar.p(iconCompat.f4976f, 5);
        iconCompat.f4977g = (ColorStateList) aVar.r(iconCompat.f4977g, 6);
        iconCompat.f4979i = aVar.t(iconCompat.f4979i, 7);
        iconCompat.f4980j = aVar.t(iconCompat.f4980j, 8);
        iconCompat.r();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, a aVar) {
        aVar.x(true, true);
        iconCompat.s(aVar.f());
        int i4 = iconCompat.f4971a;
        if (-1 != i4) {
            aVar.F(i4, 1);
        }
        byte[] bArr = iconCompat.f4973c;
        if (bArr != null) {
            aVar.B(bArr, 2);
        }
        Parcelable parcelable = iconCompat.f4974d;
        if (parcelable != null) {
            aVar.H(parcelable, 3);
        }
        int i5 = iconCompat.f4975e;
        if (i5 != 0) {
            aVar.F(i5, 4);
        }
        int i6 = iconCompat.f4976f;
        if (i6 != 0) {
            aVar.F(i6, 5);
        }
        ColorStateList colorStateList = iconCompat.f4977g;
        if (colorStateList != null) {
            aVar.H(colorStateList, 6);
        }
        String str = iconCompat.f4979i;
        if (str != null) {
            aVar.J(str, 7);
        }
        String str2 = iconCompat.f4980j;
        if (str2 != null) {
            aVar.J(str2, 8);
        }
    }
}
