package x3;

import java.util.Random;

public abstract class a extends c {
    public int b() {
        return d().nextInt();
    }

    public int c(int i4) {
        return d().nextInt(i4);
    }

    public abstract Random d();
}
