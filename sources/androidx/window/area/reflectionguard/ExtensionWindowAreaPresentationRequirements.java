package androidx.window.area.reflectionguard;

import android.content.Context;
import android.view.View;

public interface ExtensionWindowAreaPresentationRequirements {
    Context getPresentationContext();

    void setPresentationView(View view);
}
