package p1;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class k extends C0864e {
    public k(i iVar, C0863d dVar, long j4) {
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(dVar.f11659a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j5 = dVar.f11661c + (j4 * ((long) dVar.f11663e));
        this.f11668a = iVar.j(allocate, j5);
        this.f11669b = iVar.h(allocate, 8 + j5);
        this.f11670c = iVar.h(allocate, 16 + j5);
        this.f11671d = iVar.h(allocate, j5 + 40);
    }
}
