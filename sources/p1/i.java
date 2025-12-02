package p1;

import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class i implements Closeable {

    /* renamed from: e  reason: collision with root package name */
    public final int f11675e = 1179403647;

    /* renamed from: f  reason: collision with root package name */
    public final FileChannel f11676f;

    public i(File file) {
        if (file == null || !file.exists()) {
            throw new IllegalArgumentException("File is null or does not exist");
        }
        this.f11676f = new FileInputStream(file).getChannel();
    }

    public final long b(C0863d dVar, long j4, long j5) {
        for (long j6 = 0; j6 < j4; j6++) {
            C0864e b4 = dVar.b(j6);
            if (b4.f11668a == 1) {
                long j7 = b4.f11670c;
                if (j7 <= j5 && j5 <= b4.f11671d + j7) {
                    return (j5 - j7) + b4.f11669b;
                }
            }
        }
        throw new IllegalStateException("Could not map vma to file offset!");
    }

    public C0863d c() {
        this.f11676f.position(0);
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        if (j(allocate, 0) == 1179403647) {
            short f4 = f(allocate, 4);
            boolean z4 = f(allocate, 5) == 2;
            if (f4 == 1) {
                return new g(z4, this);
            }
            if (f4 == 2) {
                return new h(z4, this);
            }
            throw new IllegalStateException("Invalid class type!");
        }
        throw new IllegalArgumentException("Invalid ELF Magic!");
    }

    public void close() {
        this.f11676f.close();
    }

    public List d() {
        long j4;
        this.f11676f.position(0);
        ArrayList arrayList = new ArrayList();
        C0863d c4 = c();
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(c4.f11659a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j5 = (long) c4.f11664f;
        int i4 = 0;
        if (j5 == 65535) {
            j5 = c4.c(0).f11672a;
        }
        long j6 = 0;
        while (true) {
            if (j6 >= j5) {
                j4 = 0;
                break;
            }
            C0864e b4 = c4.b(j6);
            if (b4.f11668a == 2) {
                j4 = b4.f11669b;
                break;
            }
            j6++;
        }
        if (j4 == 0) {
            return Collections.unmodifiableList(arrayList);
        }
        ArrayList<Long> arrayList2 = new ArrayList<>();
        long j7 = 0;
        while (true) {
            C0862c a4 = c4.a(j4, i4);
            long j8 = a4.f11657a;
            if (j8 == 1) {
                arrayList2.add(Long.valueOf(a4.f11658b));
            } else if (j8 == 5) {
                j7 = a4.f11658b;
            }
            i4++;
            if (a4.f11657a == 0) {
                break;
            }
        }
        if (j7 != 0) {
            long b5 = b(c4, j5, j7);
            for (Long longValue : arrayList2) {
                arrayList.add(i(allocate, longValue.longValue() + b5));
            }
            return arrayList;
        }
        throw new IllegalStateException("String table offset not found!");
    }

    public void e(ByteBuffer byteBuffer, long j4, int i4) {
        byteBuffer.position(0);
        byteBuffer.limit(i4);
        long j5 = 0;
        while (j5 < ((long) i4)) {
            int read = this.f11676f.read(byteBuffer, j4 + j5);
            if (read != -1) {
                j5 += (long) read;
            } else {
                throw new EOFException();
            }
        }
        byteBuffer.position(0);
    }

    public short f(ByteBuffer byteBuffer, long j4) {
        e(byteBuffer, j4, 1);
        return (short) (byteBuffer.get() & 255);
    }

    public int g(ByteBuffer byteBuffer, long j4) {
        e(byteBuffer, j4, 2);
        return byteBuffer.getShort() & 65535;
    }

    public long h(ByteBuffer byteBuffer, long j4) {
        e(byteBuffer, j4, 8);
        return byteBuffer.getLong();
    }

    public String i(ByteBuffer byteBuffer, long j4) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            long j5 = 1 + j4;
            short f4 = f(byteBuffer, j4);
            if (f4 == 0) {
                return sb.toString();
            }
            sb.append((char) f4);
            j4 = j5;
        }
    }

    public long j(ByteBuffer byteBuffer, long j4) {
        e(byteBuffer, j4, 4);
        return ((long) byteBuffer.getInt()) & 4294967295L;
    }
}
