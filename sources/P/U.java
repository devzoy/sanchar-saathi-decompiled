package p;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.Transition;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.ListMenuItemView;
import androidx.appcompat.view.menu.d;
import androidx.appcompat.view.menu.e;
import java.lang.reflect.Method;

public class U extends Q implements S {

    /* renamed from: L  reason: collision with root package name */
    public static Method f11448L;

    /* renamed from: K  reason: collision with root package name */
    public S f11449K;

    public static class a extends L {

        /* renamed from: q  reason: collision with root package name */
        public final int f11450q;

        /* renamed from: r  reason: collision with root package name */
        public final int f11451r;

        /* renamed from: s  reason: collision with root package name */
        public S f11452s;

        /* renamed from: t  reason: collision with root package name */
        public MenuItem f11453t;

        public a(Context context, boolean z4) {
            super(context, z4);
            if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
                this.f11450q = 21;
                this.f11451r = 22;
                return;
            }
            this.f11450q = 22;
            this.f11451r = 21;
        }

        public /* bridge */ /* synthetic */ int d(int i4, int i5, int i6, int i7, int i8) {
            return super.d(i4, i5, i6, i7, i8);
        }

        public /* bridge */ /* synthetic */ boolean e(MotionEvent motionEvent, int i4) {
            return super.e(motionEvent, i4);
        }

        public /* bridge */ /* synthetic */ boolean hasFocus() {
            return super.hasFocus();
        }

        public /* bridge */ /* synthetic */ boolean hasWindowFocus() {
            return super.hasWindowFocus();
        }

        public /* bridge */ /* synthetic */ boolean isFocused() {
            return super.isFocused();
        }

        public /* bridge */ /* synthetic */ boolean isInTouchMode() {
            return super.isInTouchMode();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0035, code lost:
            r2 = (r2 = pointToPosition((int) r5.getX(), (int) r5.getY())) - r1;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onHoverEvent(android.view.MotionEvent r5) {
            /*
                r4 = this;
                p.S r0 = r4.f11452s
                if (r0 == 0) goto L_0x005c
                android.widget.ListAdapter r0 = r4.getAdapter()
                boolean r1 = r0 instanceof android.widget.HeaderViewListAdapter
                if (r1 == 0) goto L_0x0019
                android.widget.HeaderViewListAdapter r0 = (android.widget.HeaderViewListAdapter) r0
                int r1 = r0.getHeadersCount()
                android.widget.ListAdapter r0 = r0.getWrappedAdapter()
                androidx.appcompat.view.menu.d r0 = (androidx.appcompat.view.menu.d) r0
                goto L_0x001c
            L_0x0019:
                androidx.appcompat.view.menu.d r0 = (androidx.appcompat.view.menu.d) r0
                r1 = 0
            L_0x001c:
                int r2 = r5.getAction()
                r3 = 10
                if (r2 == r3) goto L_0x0043
                float r2 = r5.getX()
                int r2 = (int) r2
                float r3 = r5.getY()
                int r3 = (int) r3
                int r2 = r4.pointToPosition(r2, r3)
                r3 = -1
                if (r2 == r3) goto L_0x0043
                int r2 = r2 - r1
                if (r2 < 0) goto L_0x0043
                int r1 = r0.getCount()
                if (r2 >= r1) goto L_0x0043
                androidx.appcompat.view.menu.g r1 = r0.getItem(r2)
                goto L_0x0044
            L_0x0043:
                r1 = 0
            L_0x0044:
                android.view.MenuItem r2 = r4.f11453t
                if (r2 == r1) goto L_0x005c
                androidx.appcompat.view.menu.e r0 = r0.b()
                if (r2 == 0) goto L_0x0053
                p.S r3 = r4.f11452s
                r3.e(r0, r2)
            L_0x0053:
                r4.f11453t = r1
                if (r1 == 0) goto L_0x005c
                p.S r2 = r4.f11452s
                r2.d(r0, r1)
            L_0x005c:
                boolean r5 = super.onHoverEvent(r5)
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: p.U.a.onHoverEvent(android.view.MotionEvent):boolean");
        }

        public boolean onKeyDown(int i4, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i4 == this.f11450q) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            } else if (listMenuItemView == null || i4 != this.f11451r) {
                return super.onKeyDown(i4, keyEvent);
            } else {
                setSelection(-1);
                ((d) getAdapter()).b().e(false);
                return true;
            }
        }

        public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
            return super.onTouchEvent(motionEvent);
        }

        public void setHoverListener(S s4) {
            this.f11452s = s4;
        }

        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f11448L = PopupWindow.class.getDeclaredMethod("setTouchModal", new Class[]{Boolean.TYPE});
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public U(Context context, AttributeSet attributeSet, int i4, int i5) {
        super(context, attributeSet, i4, i5);
    }

    public void R(Object obj) {
        this.f11416H.setEnterTransition((Transition) obj);
    }

    public void S(Object obj) {
        this.f11416H.setExitTransition((Transition) obj);
    }

    public void T(S s4) {
        this.f11449K = s4;
    }

    public void U(boolean z4) {
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f11448L;
            if (method != null) {
                try {
                    method.invoke(this.f11416H, new Object[]{Boolean.valueOf(z4)});
                } catch (Exception unused) {
                    Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                }
            }
        } else {
            this.f11416H.setTouchModal(z4);
        }
    }

    public void d(e eVar, MenuItem menuItem) {
        S s4 = this.f11449K;
        if (s4 != null) {
            s4.d(eVar, menuItem);
        }
    }

    public void e(e eVar, MenuItem menuItem) {
        S s4 = this.f11449K;
        if (s4 != null) {
            s4.e(eVar, menuItem);
        }
    }

    public L s(Context context, boolean z4) {
        a aVar = new a(context, z4);
        aVar.setHoverListener(this);
        return aVar;
    }
}
