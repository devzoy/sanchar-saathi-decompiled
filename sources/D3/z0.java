package D3;

public abstract class z0 extends F {
    public abstract z0 N();

    public final String O() {
        z0 z0Var;
        z0 c4 = V.c();
        if (this == c4) {
            return "Dispatchers.Main";
        }
        try {
            z0Var = c4.N();
        } catch (UnsupportedOperationException unused) {
            z0Var = null;
        }
        if (this == z0Var) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }
}
