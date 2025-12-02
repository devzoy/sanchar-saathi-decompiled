package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.Map;

public class B implements Iterator {

    /* renamed from: e  reason: collision with root package name */
    public Iterator f5029e;

    public B(Iterator it) {
        this.f5029e = it;
    }

    /* renamed from: c */
    public Map.Entry next() {
        Map.Entry entry = (Map.Entry) this.f5029e.next();
        entry.getValue();
        return entry;
    }

    public boolean hasNext() {
        return this.f5029e.hasNext();
    }

    public void remove() {
        this.f5029e.remove();
    }
}
