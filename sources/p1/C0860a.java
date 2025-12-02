package p1;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: p1.a  reason: case insensitive filesystem */
public class C0860a extends C0862c {
    public C0860a(i iVar, C0863d dVar, long j4, int i4) {
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.order(dVar.f11659a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j5 = j4 + ((long) (i4 * 8));
        this.f11657a = iVar.j(allocate, j5);
        this.f11658b = iVar.j(allocate, j5 + 4);
    }
}
