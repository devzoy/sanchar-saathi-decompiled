package p1;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: p1.b  reason: case insensitive filesystem */
public class C0861b extends C0862c {
    public C0861b(i iVar, C0863d dVar, long j4, int i4) {
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(dVar.f11659a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j5 = j4 + ((long) (i4 * 16));
        this.f11657a = iVar.h(allocate, j5);
        this.f11658b = iVar.h(allocate, j5 + 8);
    }
}
