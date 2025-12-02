package o3;

import i3.C0726c;
import i3.C0735l;
import java.io.Serializable;
import v3.l;

/* renamed from: o3.c  reason: case insensitive filesystem */
public final class C0825c extends C0726c implements C0823a, Serializable {

    /* renamed from: f  reason: collision with root package name */
    public final Enum[] f11335f;

    public C0825c(Enum[] enumArr) {
        l.e(enumArr, "entries");
        this.f11335f = enumArr;
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        return v((Enum) obj);
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        return x((Enum) obj);
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        return y((Enum) obj);
    }

    public int t() {
        return this.f11335f.length;
    }

    public boolean v(Enum enumR) {
        l.e(enumR, "element");
        return ((Enum) C0735l.r(this.f11335f, enumR.ordinal())) == enumR;
    }

    /* renamed from: w */
    public Enum get(int i4) {
        C0726c.f10289e.a(i4, this.f11335f.length);
        return this.f11335f[i4];
    }

    public int x(Enum enumR) {
        l.e(enumR, "element");
        int ordinal = enumR.ordinal();
        if (((Enum) C0735l.r(this.f11335f, ordinal)) == enumR) {
            return ordinal;
        }
        return -1;
    }

    public int y(Enum enumR) {
        l.e(enumR, "element");
        return indexOf(enumR);
    }
}
