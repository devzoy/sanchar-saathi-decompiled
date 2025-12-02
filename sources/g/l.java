package G;

import G.i;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Set;

public abstract class l {

    /* renamed from: a  reason: collision with root package name */
    public static final Object f1207a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final Object f1208b = new Object();

    public static Bundle a(i.a aVar) {
        Bundle bundle = new Bundle();
        IconCompat d4 = aVar.d();
        bundle.putInt("icon", d4 != null ? d4.m() : 0);
        bundle.putCharSequence("title", aVar.h());
        bundle.putParcelable("actionIntent", aVar.a());
        Bundle bundle2 = aVar.c() != null ? new Bundle(aVar.c()) : new Bundle();
        bundle2.putBoolean("android.support.allowGeneratedReplies", aVar.b());
        bundle.putBundle("extras", bundle2);
        bundle.putParcelableArray("remoteInputs", c(aVar.e()));
        bundle.putBoolean("showsUserInterface", aVar.g());
        bundle.putInt("semanticAction", aVar.f());
        return bundle;
    }

    public static Bundle b(s sVar) {
        Bundle bundle = new Bundle();
        bundle.putString("resultKey", sVar.i());
        bundle.putCharSequence("label", sVar.h());
        bundle.putCharSequenceArray("choices", sVar.e());
        bundle.putBoolean("allowFreeFormInput", sVar.c());
        bundle.putBundle("extras", sVar.g());
        Set<String> d4 = sVar.d();
        if (d4 != null && !d4.isEmpty()) {
            ArrayList arrayList = new ArrayList(d4.size());
            for (String add : d4) {
                arrayList.add(add);
            }
            bundle.putStringArrayList("allowedDataTypes", arrayList);
        }
        return bundle;
    }

    public static Bundle[] c(s[] sVarArr) {
        if (sVarArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[sVarArr.length];
        for (int i4 = 0; i4 < sVarArr.length; i4++) {
            bundleArr[i4] = b(sVarArr[i4]);
        }
        return bundleArr;
    }
}
