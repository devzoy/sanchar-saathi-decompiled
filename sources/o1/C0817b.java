package o1;

import java.util.Arrays;

/* renamed from: o1.b  reason: case insensitive filesystem */
public class C0817b extends RuntimeException {
    public C0817b(String str, String[] strArr, String[] strArr2) {
        super("Could not find '" + str + "'. Looked for: " + Arrays.toString(strArr) + ", but only found: " + Arrays.toString(strArr2) + ".");
    }
}
