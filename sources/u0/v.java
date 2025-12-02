package u0;

import v3.l;

public final class v {

    /* renamed from: a  reason: collision with root package name */
    public static final v f12273a = new v();

    public static final String a(String str) {
        l.e(str, "hash");
        return "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + str + "')";
    }
}
