package W1;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import java.util.List;

public abstract class b {
    public static void a(AnimatorSet animatorSet, List list) {
        int size = list.size();
        long j4 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            Animator animator = (Animator) list.get(i4);
            j4 = Math.max(j4, animator.getStartDelay() + animator.getDuration());
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{0, 0});
        ofInt.setDuration(j4);
        list.add(0, ofInt);
        animatorSet.playTogether(list);
    }
}
