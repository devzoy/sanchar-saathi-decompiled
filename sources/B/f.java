package B;

import java.util.ArrayList;
import java.util.List;

public class f implements d {

    /* renamed from: a  reason: collision with root package name */
    public d f189a = null;

    /* renamed from: b  reason: collision with root package name */
    public boolean f190b = false;

    /* renamed from: c  reason: collision with root package name */
    public boolean f191c = false;

    /* renamed from: d  reason: collision with root package name */
    public m f192d;

    /* renamed from: e  reason: collision with root package name */
    public a f193e = a.UNKNOWN;

    /* renamed from: f  reason: collision with root package name */
    public int f194f;

    /* renamed from: g  reason: collision with root package name */
    public int f195g;

    /* renamed from: h  reason: collision with root package name */
    public int f196h = 1;

    /* renamed from: i  reason: collision with root package name */
    public g f197i = null;

    /* renamed from: j  reason: collision with root package name */
    public boolean f198j = false;

    /* renamed from: k  reason: collision with root package name */
    public List f199k = new ArrayList();

    /* renamed from: l  reason: collision with root package name */
    public List f200l = new ArrayList();

    public enum a {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE
    }

    public f(m mVar) {
        this.f192d = mVar;
    }

    public void a(d dVar) {
        for (f fVar : this.f200l) {
            if (!fVar.f198j) {
                return;
            }
        }
        this.f191c = true;
        d dVar2 = this.f189a;
        if (dVar2 != null) {
            dVar2.a(this);
        }
        if (this.f190b) {
            this.f192d.a(this);
            return;
        }
        f fVar2 = null;
        int i4 = 0;
        for (f fVar3 : this.f200l) {
            if (!(fVar3 instanceof g)) {
                i4++;
                fVar2 = fVar3;
            }
        }
        if (fVar2 != null && i4 == 1 && fVar2.f198j) {
            g gVar = this.f197i;
            if (gVar != null) {
                if (gVar.f198j) {
                    this.f194f = this.f196h * gVar.f195g;
                } else {
                    return;
                }
            }
            d(fVar2.f195g + this.f194f);
        }
        d dVar3 = this.f189a;
        if (dVar3 != null) {
            dVar3.a(this);
        }
    }

    public void b(d dVar) {
        this.f199k.add(dVar);
        if (this.f198j) {
            dVar.a(dVar);
        }
    }

    public void c() {
        this.f200l.clear();
        this.f199k.clear();
        this.f198j = false;
        this.f195g = 0;
        this.f191c = false;
        this.f190b = false;
    }

    public void d(int i4) {
        if (!this.f198j) {
            this.f198j = true;
            this.f195g = i4;
            for (d dVar : this.f199k) {
                dVar.a(dVar);
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f192d.f225b.p());
        sb.append(":");
        sb.append(this.f193e);
        sb.append("(");
        sb.append(this.f198j ? Integer.valueOf(this.f195g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f200l.size());
        sb.append(":d=");
        sb.append(this.f199k.size());
        sb.append(">");
        return sb.toString();
    }
}
