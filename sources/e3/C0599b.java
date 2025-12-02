package e3;

import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import v3.l;

/* renamed from: e3.b  reason: case insensitive filesystem */
public final class C0599b implements G {
    public String a(List list) {
        l.e(list, "list");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(list);
        objectOutputStream.flush();
        String encodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
        l.d(encodeToString, "encodeToString(...)");
        return encodeToString;
    }

    public List b(String str) {
        l.e(str, "listString");
        Object readObject = new L(new ByteArrayInputStream(Base64.decode(str, 0))).readObject();
        l.c(readObject, "null cannot be cast to non-null type kotlin.collections.List<*>");
        ArrayList arrayList = new ArrayList();
        for (Object next : (List) readObject) {
            if (next instanceof String) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }
}
