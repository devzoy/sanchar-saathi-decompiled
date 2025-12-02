package o1;

import android.content.Context;
import java.io.File;

/* renamed from: o1.c  reason: case insensitive filesystem */
public abstract class C0818c {

    /* renamed from: o1.c$a */
    public interface a {
        void a(Context context, String[] strArr, String str, File file, C0819d dVar);
    }

    /* renamed from: o1.c$b */
    public interface b {
        String a(String str);

        String b(String str);

        void c(String str);

        String[] d();

        void e(String str);
    }

    /* renamed from: o1.c$c  reason: collision with other inner class name */
    public interface C0189c {
    }

    public static void a(Context context, String str) {
        b(context, str, (String) null, (C0189c) null);
    }

    public static void b(Context context, String str, String str2, C0189c cVar) {
        new C0819d().f(context, str, str2, cVar);
    }
}
