package D1;

import android.os.StrictMode;

public abstract class l {
    public static StrictMode.VmPolicy a() {
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        if (g.g()) {
            StrictMode.setVmPolicy(k.a(new StrictMode.VmPolicy.Builder(vmPolicy)).build());
        }
        return vmPolicy;
    }
}
