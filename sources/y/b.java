package Y;

import android.database.Cursor;
import android.widget.Filter;

public class b extends Filter {

    /* renamed from: a  reason: collision with root package name */
    public a f3718a;

    public interface a {
        void a(Cursor cursor);

        Cursor b();

        CharSequence c(Cursor cursor);

        Cursor d(CharSequence charSequence);
    }

    public b(a aVar) {
        this.f3718a = aVar;
    }

    public CharSequence convertResultToString(Object obj) {
        return this.f3718a.c((Cursor) obj);
    }

    public Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor d4 = this.f3718a.d(charSequence);
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (d4 != null) {
            filterResults.count = d4.getCount();
            filterResults.values = d4;
        } else {
            filterResults.count = 0;
            filterResults.values = null;
        }
        return filterResults;
    }

    public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        Cursor b4 = this.f3718a.b();
        Object obj = filterResults.values;
        if (obj != null && obj != b4) {
            this.f3718a.a((Cursor) obj);
        }
    }
}
