package p1;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class h extends C0863d {

    /* renamed from: j  reason: collision with root package name */
    public final i f11674j;

    public h(boolean z4, i iVar) {
        this.f11659a = z4;
        this.f11674j = iVar;
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(z4 ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        this.f11660b = iVar.g(allocate, 16);
        this.f11661c = iVar.h(allocate, 32);
        this.f11662d = iVar.h(allocate, 40);
        this.f11663e = iVar.g(allocate, 54);
        this.f11664f = iVar.g(allocate, 56);
        this.f11665g = iVar.g(allocate, 58);
        this.f11666h = iVar.g(allocate, 60);
        this.f11667i = iVar.g(allocate, 62);
    }

    public C0862c a(long j4, int i4) {
        return new C0861b(this.f11674j, this, j4, i4);
    }

    public C0864e b(long j4) {
        return new k(this.f11674j, this, j4);
    }

    public f c(int i4) {
        return new m(this.f11674j, this, i4);
    }
}
