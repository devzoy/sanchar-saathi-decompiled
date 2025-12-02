package p2;

import p2.C0873d;

/* renamed from: p2.A  reason: case insensitive filesystem */
public final class C0865A extends C0873d.a {

    /* renamed from: a  reason: collision with root package name */
    public int f11677a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f11678b;

    /* renamed from: c  reason: collision with root package name */
    public byte f11679c;

    public final C0873d a() {
        if (this.f11679c == 3) {
            return new C0867C(this.f11677a, this.f11678b, (C0866B) null);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f11679c & 1) == 0) {
            sb.append(" appUpdateType");
        }
        if ((this.f11679c & 2) == 0) {
            sb.append(" allowAssetPackDeletion");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final C0873d.a b(boolean z4) {
        this.f11678b = z4;
        this.f11679c = (byte) (this.f11679c | 2);
        return this;
    }

    public final C0873d.a c(int i4) {
        this.f11677a = i4;
        this.f11679c = (byte) (this.f11679c | 1);
        return this;
    }
}
