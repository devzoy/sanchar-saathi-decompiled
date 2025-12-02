package T;

import android.view.View;
import android.view.accessibility.AccessibilityRecord;

public abstract class o {
    public static void a(AccessibilityRecord accessibilityRecord, int i4) {
        accessibilityRecord.setMaxScrollX(i4);
    }

    public static void b(AccessibilityRecord accessibilityRecord, int i4) {
        accessibilityRecord.setMaxScrollY(i4);
    }

    public static void c(AccessibilityRecord accessibilityRecord, View view, int i4) {
        accessibilityRecord.setSource(view, i4);
    }
}
