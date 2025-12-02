package W;

import android.os.Bundle;
import android.view.inputmethod.EditorInfo;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final String[] f3386a = new String[0];

    public static void a(EditorInfo editorInfo, String[] strArr) {
        editorInfo.contentMimeTypes = strArr;
    }

    public static void b(EditorInfo editorInfo, boolean z4) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", z4);
    }
}
