package p1;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class j extends C0864e {
    public j(i iVar, C0863d dVar, long j4) {
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.order(dVar.f11659a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j5 = dVar.f11661c + (j4 * ((long) dVar.f11663e));
        this.f11668a = iVar.j(allocate, j5);
        this.f11669b = iVar.j(allocate, 4 + j5);
        this.f11670c = iVar.j(allocate, 8 + j5);
        this.f11671d = iVar.j(allocate, j5 + 20);
    }
}
