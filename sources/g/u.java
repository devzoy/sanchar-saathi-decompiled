package G;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import net.sqlcipher.database.SQLiteDatabase;

public final class u implements Iterable {

    /* renamed from: e  reason: collision with root package name */
    public final ArrayList f1260e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    public final Context f1261f;

    public interface a {
        Intent q();
    }

    public u(Context context) {
        this.f1261f = context;
    }

    public static u v(Context context) {
        return new u(context);
    }

    public Iterator iterator() {
        return this.f1260e.iterator();
    }

    public u s(Intent intent) {
        this.f1260e.add(intent);
        return this;
    }

    public u t(Activity activity) {
        Intent q4 = activity instanceof a ? ((a) activity).q() : null;
        if (q4 == null) {
            q4 = g.a(activity);
        }
        if (q4 != null) {
            ComponentName component = q4.getComponent();
            if (component == null) {
                component = q4.resolveActivity(this.f1261f.getPackageManager());
            }
            u(component);
            s(q4);
        }
        return this;
    }

    public u u(ComponentName componentName) {
        int size = this.f1260e.size();
        try {
            Intent b4 = g.b(this.f1261f, componentName);
            while (b4 != null) {
                this.f1260e.add(size, b4);
                b4 = g.b(this.f1261f, b4.getComponent());
            }
            return this;
        } catch (PackageManager.NameNotFoundException e4) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e4);
        }
    }

    public void w() {
        x((Bundle) null);
    }

    public void x(Bundle bundle) {
        if (!this.f1260e.isEmpty()) {
            Intent[] intentArr = (Intent[]) this.f1260e.toArray(new Intent[0]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            if (!H.a.k(this.f1261f, intentArr, bundle)) {
                Intent intent = new Intent(intentArr[intentArr.length - 1]);
                intent.addFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
                this.f1261f.startActivity(intent);
                return;
            }
            return;
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
    }
}
