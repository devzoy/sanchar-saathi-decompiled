package n;

import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

public abstract class i implements Window.Callback {

    /* renamed from: c  reason: collision with root package name */
    public final Window.Callback f11224c;

    public i(Window.Callback callback) {
        if (callback != null) {
            this.f11224c = callback;
            return;
        }
        throw new IllegalArgumentException("Window callback may not be null");
    }

    public final Window.Callback a() {
        return this.f11224c;
    }

    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f11224c.dispatchGenericMotionEvent(motionEvent);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f11224c.dispatchKeyEvent(keyEvent);
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return this.f11224c.dispatchKeyShortcutEvent(keyEvent);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f11224c.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f11224c.dispatchTouchEvent(motionEvent);
    }

    public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f11224c.dispatchTrackballEvent(motionEvent);
    }

    public void onActionModeFinished(ActionMode actionMode) {
        this.f11224c.onActionModeFinished(actionMode);
    }

    public void onActionModeStarted(ActionMode actionMode) {
        this.f11224c.onActionModeStarted(actionMode);
    }

    public void onAttachedToWindow() {
        this.f11224c.onAttachedToWindow();
    }

    public boolean onCreatePanelMenu(int i4, Menu menu) {
        return this.f11224c.onCreatePanelMenu(i4, menu);
    }

    public View onCreatePanelView(int i4) {
        return this.f11224c.onCreatePanelView(i4);
    }

    public void onDetachedFromWindow() {
        this.f11224c.onDetachedFromWindow();
    }

    public boolean onMenuItemSelected(int i4, MenuItem menuItem) {
        return this.f11224c.onMenuItemSelected(i4, menuItem);
    }

    public boolean onMenuOpened(int i4, Menu menu) {
        return this.f11224c.onMenuOpened(i4, menu);
    }

    public void onPanelClosed(int i4, Menu menu) {
        this.f11224c.onPanelClosed(i4, menu);
    }

    public void onPointerCaptureChanged(boolean z4) {
        this.f11224c.onPointerCaptureChanged(z4);
    }

    public boolean onPreparePanel(int i4, View view, Menu menu) {
        return this.f11224c.onPreparePanel(i4, view, menu);
    }

    public void onProvideKeyboardShortcuts(List list, Menu menu, int i4) {
        this.f11224c.onProvideKeyboardShortcuts(list, menu, i4);
    }

    public boolean onSearchRequested(SearchEvent searchEvent) {
        return this.f11224c.onSearchRequested(searchEvent);
    }

    public void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f11224c.onWindowAttributesChanged(layoutParams);
    }

    public void onWindowFocusChanged(boolean z4) {
        this.f11224c.onWindowFocusChanged(z4);
    }

    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i4) {
        return this.f11224c.onWindowStartingActionMode(callback, i4);
    }

    public boolean onSearchRequested() {
        return this.f11224c.onSearchRequested();
    }
}
