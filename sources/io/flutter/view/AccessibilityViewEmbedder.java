package io.flutter.view;

import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.accessibility.AccessibilityRecord;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

class AccessibilityViewEmbedder {
    private static final String TAG = "AccessibilityBridge";
    private final Map<View, Rect> embeddedViewToDisplayBounds;
    private final SparseArray<c> flutterIdToOrigin = new SparseArray<>();
    private int nextFlutterId;
    private final Map<c, Integer> originToFlutterId;
    private final b reflectionAccessors = new b();
    private final View rootAccessibilityView;

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final Method f10612a;

        /* renamed from: b  reason: collision with root package name */
        public final Method f10613b;

        /* renamed from: c  reason: collision with root package name */
        public final Method f10614c;

        /* renamed from: d  reason: collision with root package name */
        public final Method f10615d;

        /* renamed from: e  reason: collision with root package name */
        public final Field f10616e;

        /* renamed from: f  reason: collision with root package name */
        public final Method f10617f;

        public static int j(long j4) {
            return (int) (j4 >> 32);
        }

        public static boolean k(long j4, int i4) {
            return (j4 & (1 << i4)) != 0;
        }

        public static Long l(AccessibilityNodeInfo accessibilityNodeInfo) {
            AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(accessibilityNodeInfo);
            Parcel obtain2 = Parcel.obtain();
            obtain2.setDataPosition(0);
            obtain.writeToParcel(obtain2, 0);
            obtain2.setDataPosition(0);
            long readLong = obtain2.readLong();
            if (k(readLong, 0)) {
                obtain2.readInt();
            }
            if (k(readLong, 1)) {
                obtain2.readLong();
            }
            if (k(readLong, 2)) {
                obtain2.readInt();
            }
            Long valueOf = k(readLong, 3) ? Long.valueOf(obtain2.readLong()) : null;
            obtain2.recycle();
            return valueOf;
        }

        public final Long f(AccessibilityNodeInfo accessibilityNodeInfo, int i4) {
            Method method = this.f10615d;
            if (method == null && (this.f10616e == null || this.f10617f == null)) {
                return null;
            }
            if (method != null) {
                try {
                    return (Long) method.invoke(accessibilityNodeInfo, new Object[]{Integer.valueOf(i4)});
                } catch (IllegalAccessException e4) {
                    M2.b.h(AccessibilityViewEmbedder.TAG, "Failed to access getChildId method.", e4);
                    return null;
                } catch (InvocationTargetException e5) {
                    M2.b.h(AccessibilityViewEmbedder.TAG, "The getChildId method threw an exception when invoked.", e5);
                    return null;
                }
            } else {
                try {
                    Long l4 = (Long) this.f10617f.invoke(this.f10616e.get(accessibilityNodeInfo), new Object[]{Integer.valueOf(i4)});
                    l4.longValue();
                    return l4;
                } catch (IllegalAccessException e6) {
                    M2.b.h(AccessibilityViewEmbedder.TAG, "Failed to access longArrayGetIndex method or the childNodeId field.", e6);
                    return null;
                } catch (ArrayIndexOutOfBoundsException | InvocationTargetException e7) {
                    M2.b.h(AccessibilityViewEmbedder.TAG, "The longArrayGetIndex method threw an exception when invoked.", e7);
                    return null;
                }
            }
        }

        public final Long g(AccessibilityNodeInfo accessibilityNodeInfo) {
            Method method = this.f10613b;
            if (method != null) {
                try {
                    Long l4 = (Long) method.invoke(accessibilityNodeInfo, (Object[]) null);
                    l4.longValue();
                    return l4;
                } catch (IllegalAccessException e4) {
                    M2.b.h(AccessibilityViewEmbedder.TAG, "Failed to access getParentNodeId method.", e4);
                } catch (InvocationTargetException e5) {
                    M2.b.h(AccessibilityViewEmbedder.TAG, "The getParentNodeId method threw an exception when invoked.", e5);
                }
            }
            return l(accessibilityNodeInfo);
        }

        public final Long h(AccessibilityRecord accessibilityRecord) {
            Method method = this.f10614c;
            if (method == null) {
                return null;
            }
            try {
                return (Long) method.invoke(accessibilityRecord, (Object[]) null);
            } catch (IllegalAccessException e4) {
                M2.b.h(AccessibilityViewEmbedder.TAG, "Failed to access the getRecordSourceNodeId method.", e4);
                return null;
            } catch (InvocationTargetException e5) {
                M2.b.h(AccessibilityViewEmbedder.TAG, "The getRecordSourceNodeId method threw an exception when invoked.", e5);
                return null;
            }
        }

        public final Long i(AccessibilityNodeInfo accessibilityNodeInfo) {
            Method method = this.f10612a;
            if (method == null) {
                return null;
            }
            try {
                return (Long) method.invoke(accessibilityNodeInfo, (Object[]) null);
            } catch (IllegalAccessException e4) {
                M2.b.h(AccessibilityViewEmbedder.TAG, "Failed to access getSourceNodeId method.", e4);
                return null;
            } catch (InvocationTargetException e5) {
                M2.b.h(AccessibilityViewEmbedder.TAG, "The getSourceNodeId method threw an exception when invoked.", e5);
                return null;
            }
        }

        public b() {
            Method method;
            Method method2;
            Method method3;
            Field field;
            Class<AccessibilityNodeInfo> cls = AccessibilityNodeInfo.class;
            try {
                method = cls.getMethod("getSourceNodeId", (Class[]) null);
            } catch (NoSuchMethodException unused) {
                M2.b.g(AccessibilityViewEmbedder.TAG, "can't invoke AccessibilityNodeInfo#getSourceNodeId with reflection");
                method = null;
            }
            try {
                method2 = AccessibilityRecord.class.getMethod("getSourceNodeId", (Class[]) null);
            } catch (NoSuchMethodException unused2) {
                M2.b.g(AccessibilityViewEmbedder.TAG, "can't invoke AccessibiiltyRecord#getSourceNodeId with reflection");
                method2 = null;
            }
            try {
                field = cls.getDeclaredField("mChildNodeIds");
                field.setAccessible(true);
                method3 = Class.forName("android.util.LongArray").getMethod("get", new Class[]{Integer.TYPE});
            } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException | NullPointerException unused3) {
                M2.b.g(AccessibilityViewEmbedder.TAG, "can't access childNodeIdsField with reflection");
                field = null;
                method3 = null;
            }
            this.f10612a = method;
            this.f10613b = null;
            this.f10614c = method2;
            this.f10615d = null;
            this.f10616e = field;
            this.f10617f = method3;
        }
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final View f10618a;

        /* renamed from: b  reason: collision with root package name */
        public final int f10619b;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f10619b == cVar.f10619b && this.f10618a.equals(cVar.f10618a);
        }

        public int hashCode() {
            return ((this.f10618a.hashCode() + 31) * 31) + this.f10619b;
        }

        public c(View view, int i4) {
            this.f10618a = view;
            this.f10619b = i4;
        }
    }

    public AccessibilityViewEmbedder(View view, int i4) {
        this.rootAccessibilityView = view;
        this.nextFlutterId = i4;
        this.originToFlutterId = new HashMap();
        this.embeddedViewToDisplayBounds = new HashMap();
    }

    private void addChildrenToFlutterNode(AccessibilityNodeInfo accessibilityNodeInfo, View view, AccessibilityNodeInfo accessibilityNodeInfo2) {
        int i4;
        for (int i5 = 0; i5 < accessibilityNodeInfo.getChildCount(); i5++) {
            Long d4 = this.reflectionAccessors.f(accessibilityNodeInfo, i5);
            if (d4 != null) {
                int b4 = b.j(d4.longValue());
                c cVar = new c(view, b4);
                if (this.originToFlutterId.containsKey(cVar)) {
                    i4 = this.originToFlutterId.get(cVar).intValue();
                } else {
                    int i6 = this.nextFlutterId;
                    this.nextFlutterId = i6 + 1;
                    cacheVirtualIdMappings(view, b4, i6);
                    i4 = i6;
                }
                accessibilityNodeInfo2.addChild(this.rootAccessibilityView, i4);
            }
        }
    }

    private void cacheVirtualIdMappings(View view, int i4, int i5) {
        c cVar = new c(view, i4);
        this.originToFlutterId.put(cVar, Integer.valueOf(i5));
        this.flutterIdToOrigin.put(i5, cVar);
    }

    private AccessibilityNodeInfo convertToFlutterNode(AccessibilityNodeInfo accessibilityNodeInfo, int i4, View view) {
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(this.rootAccessibilityView, i4);
        obtain.setPackageName(this.rootAccessibilityView.getContext().getPackageName());
        obtain.setSource(this.rootAccessibilityView, i4);
        obtain.setClassName(accessibilityNodeInfo.getClassName());
        copyAccessibilityFields(accessibilityNodeInfo, obtain);
        setFlutterNodesTranslateBounds(accessibilityNodeInfo, this.embeddedViewToDisplayBounds.get(view), obtain);
        addChildrenToFlutterNode(accessibilityNodeInfo, view, obtain);
        setFlutterNodeParent(accessibilityNodeInfo, view, obtain);
        return obtain;
    }

    private void copyAccessibilityFields(AccessibilityNodeInfo accessibilityNodeInfo, AccessibilityNodeInfo accessibilityNodeInfo2) {
        accessibilityNodeInfo2.setAccessibilityFocused(accessibilityNodeInfo.isAccessibilityFocused());
        accessibilityNodeInfo2.setCheckable(accessibilityNodeInfo.isCheckable());
        accessibilityNodeInfo2.setChecked(accessibilityNodeInfo.isChecked());
        accessibilityNodeInfo2.setContentDescription(accessibilityNodeInfo.getContentDescription());
        accessibilityNodeInfo2.setEnabled(accessibilityNodeInfo.isEnabled());
        accessibilityNodeInfo2.setClickable(accessibilityNodeInfo.isClickable());
        accessibilityNodeInfo2.setFocusable(accessibilityNodeInfo.isFocusable());
        accessibilityNodeInfo2.setFocused(accessibilityNodeInfo.isFocused());
        accessibilityNodeInfo2.setLongClickable(accessibilityNodeInfo.isLongClickable());
        accessibilityNodeInfo2.setMovementGranularities(accessibilityNodeInfo.getMovementGranularities());
        accessibilityNodeInfo2.setPassword(accessibilityNodeInfo.isPassword());
        accessibilityNodeInfo2.setScrollable(accessibilityNodeInfo.isScrollable());
        accessibilityNodeInfo2.setSelected(accessibilityNodeInfo.isSelected());
        accessibilityNodeInfo2.setText(accessibilityNodeInfo.getText());
        accessibilityNodeInfo2.setVisibleToUser(accessibilityNodeInfo.isVisibleToUser());
        accessibilityNodeInfo2.setEditable(accessibilityNodeInfo.isEditable());
        accessibilityNodeInfo2.setCanOpenPopup(accessibilityNodeInfo.canOpenPopup());
        accessibilityNodeInfo2.setCollectionInfo(accessibilityNodeInfo.getCollectionInfo());
        accessibilityNodeInfo2.setCollectionItemInfo(accessibilityNodeInfo.getCollectionItemInfo());
        accessibilityNodeInfo2.setContentInvalid(accessibilityNodeInfo.isContentInvalid());
        accessibilityNodeInfo2.setDismissable(accessibilityNodeInfo.isDismissable());
        accessibilityNodeInfo2.setInputType(accessibilityNodeInfo.getInputType());
        accessibilityNodeInfo2.setLiveRegion(accessibilityNodeInfo.getLiveRegion());
        accessibilityNodeInfo2.setMultiLine(accessibilityNodeInfo.isMultiLine());
        accessibilityNodeInfo2.setRangeInfo(accessibilityNodeInfo.getRangeInfo());
        accessibilityNodeInfo2.setError(accessibilityNodeInfo.getError());
        accessibilityNodeInfo2.setMaxTextLength(accessibilityNodeInfo.getMaxTextLength());
        accessibilityNodeInfo2.setContextClickable(accessibilityNodeInfo.isContextClickable());
        accessibilityNodeInfo2.setDrawingOrder(accessibilityNodeInfo.getDrawingOrder());
        accessibilityNodeInfo2.setImportantForAccessibility(accessibilityNodeInfo.isImportantForAccessibility());
        accessibilityNodeInfo2.setAvailableExtraData(accessibilityNodeInfo.getAvailableExtraData());
        accessibilityNodeInfo2.setHintText(accessibilityNodeInfo.getHintText());
        accessibilityNodeInfo2.setShowingHintText(accessibilityNodeInfo.isShowingHintText());
    }

    private void setFlutterNodeParent(AccessibilityNodeInfo accessibilityNodeInfo, View view, AccessibilityNodeInfo accessibilityNodeInfo2) {
        Long c4 = this.reflectionAccessors.g(accessibilityNodeInfo);
        if (c4 != null) {
            Integer num = this.originToFlutterId.get(new c(view, b.j(c4.longValue())));
            if (num != null) {
                accessibilityNodeInfo2.setParent(this.rootAccessibilityView, num.intValue());
            }
        }
    }

    private void setFlutterNodesTranslateBounds(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect, AccessibilityNodeInfo accessibilityNodeInfo2) {
        Rect rect2 = new Rect();
        accessibilityNodeInfo.getBoundsInParent(rect2);
        accessibilityNodeInfo2.setBoundsInParent(rect2);
        Rect rect3 = new Rect();
        accessibilityNodeInfo.getBoundsInScreen(rect3);
        rect3.offset(rect.left, rect.top);
        accessibilityNodeInfo2.setBoundsInScreen(rect3);
    }

    public AccessibilityNodeInfo createAccessibilityNodeInfo(int i4) {
        AccessibilityNodeInfo createAccessibilityNodeInfo;
        c cVar = this.flutterIdToOrigin.get(i4);
        if (cVar == null || !this.embeddedViewToDisplayBounds.containsKey(cVar.f10618a) || cVar.f10618a.getAccessibilityNodeProvider() == null || (createAccessibilityNodeInfo = cVar.f10618a.getAccessibilityNodeProvider().createAccessibilityNodeInfo(cVar.f10619b)) == null) {
            return null;
        }
        return convertToFlutterNode(createAccessibilityNodeInfo, i4, cVar.f10618a);
    }

    public Integer getRecordFlutterId(View view, AccessibilityRecord accessibilityRecord) {
        Long e4 = this.reflectionAccessors.h(accessibilityRecord);
        if (e4 == null) {
            return null;
        }
        return this.originToFlutterId.get(new c(view, b.j(e4.longValue())));
    }

    public AccessibilityNodeInfo getRootNode(View view, int i4, Rect rect) {
        AccessibilityNodeInfo createAccessibilityNodeInfo = view.createAccessibilityNodeInfo();
        Long a4 = this.reflectionAccessors.i(createAccessibilityNodeInfo);
        if (a4 == null) {
            return null;
        }
        this.embeddedViewToDisplayBounds.put(view, rect);
        cacheVirtualIdMappings(view, b.j(a4.longValue()), i4);
        return convertToFlutterNode(createAccessibilityNodeInfo, i4, view);
    }

    public boolean onAccessibilityHoverEvent(int i4, MotionEvent motionEvent) {
        MotionEvent motionEvent2 = motionEvent;
        c cVar = this.flutterIdToOrigin.get(i4);
        if (cVar == null) {
            return false;
        }
        Rect rect = this.embeddedViewToDisplayBounds.get(cVar.f10618a);
        int pointerCount = motionEvent.getPointerCount();
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i5 = 0; i5 < motionEvent.getPointerCount(); i5++) {
            MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
            pointerPropertiesArr[i5] = pointerProperties;
            motionEvent2.getPointerProperties(i5, pointerProperties);
            MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
            motionEvent2.getPointerCoords(i5, pointerCoords);
            MotionEvent.PointerCoords pointerCoords2 = new MotionEvent.PointerCoords(pointerCoords);
            pointerCoordsArr[i5] = pointerCoords2;
            pointerCoords2.x -= (float) rect.left;
            pointerCoords2.y -= (float) rect.top;
        }
        return cVar.f10618a.dispatchGenericMotionEvent(MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), motionEvent.getAction(), motionEvent.getPointerCount(), pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags()));
    }

    public boolean performAction(int i4, int i5, Bundle bundle) {
        AccessibilityNodeProvider accessibilityNodeProvider;
        c cVar = this.flutterIdToOrigin.get(i4);
        if (cVar == null || (accessibilityNodeProvider = cVar.f10618a.getAccessibilityNodeProvider()) == null) {
            return false;
        }
        return accessibilityNodeProvider.performAction(cVar.f10619b, i5, bundle);
    }

    public View platformViewOfNode(int i4) {
        c cVar = this.flutterIdToOrigin.get(i4);
        if (cVar == null) {
            return null;
        }
        return cVar.f10618a;
    }

    public boolean requestSendAccessibilityEvent(View view, View view2, AccessibilityEvent accessibilityEvent) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(accessibilityEvent);
        Long e4 = this.reflectionAccessors.h(accessibilityEvent);
        if (e4 == null) {
            return false;
        }
        int b4 = b.j(e4.longValue());
        Integer num = this.originToFlutterId.get(new c(view, b4));
        if (num == null) {
            int i4 = this.nextFlutterId;
            this.nextFlutterId = i4 + 1;
            Integer valueOf = Integer.valueOf(i4);
            cacheVirtualIdMappings(view, b4, i4);
            num = valueOf;
        }
        obtain.setSource(this.rootAccessibilityView, num.intValue());
        obtain.setClassName(accessibilityEvent.getClassName());
        obtain.setPackageName(accessibilityEvent.getPackageName());
        for (int i5 = 0; i5 < obtain.getRecordCount(); i5++) {
            AccessibilityRecord record = obtain.getRecord(i5);
            Long e5 = this.reflectionAccessors.h(record);
            if (e5 == null) {
                return false;
            }
            c cVar = new c(view, b.j(e5.longValue()));
            if (!this.originToFlutterId.containsKey(cVar)) {
                return false;
            }
            record.setSource(this.rootAccessibilityView, this.originToFlutterId.get(cVar).intValue());
        }
        return this.rootAccessibilityView.getParent().requestSendAccessibilityEvent(view2, obtain);
    }
}
