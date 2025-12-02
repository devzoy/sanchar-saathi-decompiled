package x2;

import java.util.HashMap;
import java.util.Map;

/* renamed from: x2.a  reason: case insensitive filesystem */
public abstract class C1003a {

    /* renamed from: a  reason: collision with root package name */
    public static final Map f12702a;

    /* renamed from: b  reason: collision with root package name */
    public static final Map f12703b;

    static {
        HashMap hashMap = new HashMap();
        f12702a = hashMap;
        HashMap hashMap2 = new HashMap();
        f12703b = hashMap2;
        hashMap.put(-1, "The Play Store app is either not installed or not the official version.");
        hashMap.put(-2, "Call first requestReviewFlow to get the ReviewInfo.");
        hashMap.put(-100, "Retry with an exponential backoff. Consider filing a bug if fails consistently.");
        hashMap2.put(-1, "PLAY_STORE_NOT_FOUND");
        hashMap2.put(-2, "INVALID_REQUEST");
        hashMap2.put(-100, "INTERNAL_ERROR");
    }

    public static String a(int i4) {
        Map map = f12702a;
        Integer valueOf = Integer.valueOf(i4);
        if (!map.containsKey(valueOf)) {
            return "";
        }
        return ((String) map.get(valueOf)) + " (https://developer.android.com/reference/com/google/android/play/core/review/model/ReviewErrorCode.html#" + ((String) f12703b.get(valueOf)) + ")";
    }
}
