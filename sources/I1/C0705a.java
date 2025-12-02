package i1;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import net.sqlcipher.database.SQLiteDatabase;

/* renamed from: i1.a  reason: case insensitive filesystem */
public final class C0705a {

    /* renamed from: i1.a$a  reason: collision with other inner class name */
    public interface C0170a {
        void a(boolean z4);
    }

    public void a(Context context, C0170a aVar, C0706b bVar) {
        if (context == null) {
            Log.d("permissions_handler", "Context cannot be null.");
            bVar.a("PermissionHandler.AppSettingsManager", "Android context cannot be null.");
            return;
        }
        try {
            Intent intent = new Intent();
            intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.addCategory("android.intent.category.DEFAULT");
            intent.setData(Uri.parse("package:" + context.getPackageName()));
            intent.addFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
            intent.addFlags(1073741824);
            intent.addFlags(8388608);
            context.startActivity(intent);
            aVar.a(true);
        } catch (Exception unused) {
            aVar.a(false);
        }
    }
}
