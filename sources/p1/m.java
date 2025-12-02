package p1;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class m extends f {
    public m(i iVar, C0863d dVar, int i4) {
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(dVar.f11659a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        this.f11672a = iVar.j(allocate, dVar.f11662d + ((long) (i4 * dVar.f11665g)) + 44);
    }
}
