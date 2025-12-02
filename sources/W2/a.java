package W2;

import M2.b;
import io.flutter.plugins.GeneratedPluginRegistrant;

public abstract class a {
    public static void a(io.flutter.embedding.engine.a aVar) {
        try {
            GeneratedPluginRegistrant.class.getDeclaredMethod("registerWith", new Class[]{io.flutter.embedding.engine.a.class}).invoke((Object) null, new Object[]{aVar});
        } catch (Exception e4) {
            b.b("GeneratedPluginsRegister", "Tried to automatically register plugins with FlutterEngine (" + aVar + ") but could not find or invoke the GeneratedPluginRegistrant.");
            b.c("GeneratedPluginsRegister", "Received exception while registering", e4);
        }
    }
}
