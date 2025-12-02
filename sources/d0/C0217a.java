package D0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: D0.a  reason: case insensitive filesystem */
public abstract class C0217a {
    public static void a(Animator animator, AnimatorListenerAdapter animatorListenerAdapter) {
        animator.addPauseListener(animatorListenerAdapter);
    }

    public static void b(Animator animator) {
        animator.pause();
    }

    public static void c(Animator animator) {
        animator.resume();
    }
}
