package y3;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import v3.l;

public final class a extends x3.a {
    public Random d() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        l.d(current, "current(...)");
        return current;
    }
}
