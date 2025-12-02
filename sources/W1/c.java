package W1;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import v.g;

public class c {

    /* renamed from: a  reason: collision with root package name */
    public final g f3401a = new g();

    /* renamed from: b  reason: collision with root package name */
    public final g f3402b = new g();

    public static void a(c cVar, Animator animator) {
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            cVar.e(objectAnimator.getPropertyName(), objectAnimator.getValues());
            cVar.f(objectAnimator.getPropertyName(), d.a(objectAnimator));
            return;
        }
        throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
    }

    public static c b(Context context, TypedArray typedArray, int i4) {
        int resourceId;
        if (!typedArray.hasValue(i4) || (resourceId = typedArray.getResourceId(i4, 0)) == 0) {
            return null;
        }
        return c(context, resourceId);
    }

    public static c c(Context context, int i4) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i4);
            if (loadAnimator instanceof AnimatorSet) {
                return d(((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(loadAnimator);
            return d(arrayList);
        } catch (Exception e4) {
            Log.w("MotionSpec", "Can't load animation resource ID #0x" + Integer.toHexString(i4), e4);
            return null;
        }
    }

    public static c d(List list) {
        c cVar = new c();
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            a(cVar, (Animator) list.get(i4));
        }
        return cVar;
    }

    public void e(String str, PropertyValuesHolder[] propertyValuesHolderArr) {
        this.f3402b.put(str, propertyValuesHolderArr);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        return this.f3401a.equals(((c) obj).f3401a);
    }

    public void f(String str, d dVar) {
        this.f3401a.put(str, dVar);
    }

    public int hashCode() {
        return this.f3401a.hashCode();
    }

    public String toString() {
        return 10 + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f3401a + "}\n";
    }
}
