package p1;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class g extends C0863d {

    /* renamed from: j  reason: collision with root package name */
    public final i f11673j;

    public g(boolean z4, i iVar) {
        this.f11659a = z4;
        this.f11673j = iVar;
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.order(z4 ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        this.f11660b = iVar.g(allocate, 16);
        this.f11661c = iVar.j(allocate, 28);
        this.f11662d = iVar.j(allocate, 32);
        this.f11663e = iVar.g(allocate, 42);
        this.f11664f = iVar.g(allocate, 44);
        this.f11665g = iVar.g(allocate, 46);
        this.f11666h = iVar.g(allocate, 48);
        this.f11667i = iVar.g(allocate, 50);
    }

    public C0862c a(long j4, int i4) {
        return new C0860a(this.f11673j, this, j4, i4);
    }

    public C0864e b(long j4) {
        return new j(this.f11673j, this, j4);
    }

    public f c(int i4) {
        return new l(this.f11673j, this, i4);
    }
}
