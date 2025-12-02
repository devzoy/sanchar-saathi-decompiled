package com.dexterous.flutterlocalnotifications.models;

import android.graphics.Color;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class NotificationAction implements Serializable {
    private static final String ALLOW_GENERATED_REPLIES = "allowGeneratedReplies";
    private static final String CANCEL_NOTIFICATION = "cancelNotification";
    private static final String CONTEXTUAL = "contextual";
    private static final String ICON = "icon";
    private static final String ICON_SOURCE = "iconBitmapSource";
    private static final String ID = "id";
    private static final String INPUTS = "inputs";
    private static final String SHOWS_USER_INTERFACE = "showsUserInterface";
    private static final String TITLE = "title";
    private static final String TITLE_COLOR_ALPHA = "titleColorAlpha";
    private static final String TITLE_COLOR_BLUE = "titleColorBlue";
    private static final String TITLE_COLOR_GREEN = "titleColorGreen";
    private static final String TITLE_COLOR_RED = "titleColorRed";
    public final List<a> actionInputs = new ArrayList();
    public final Boolean allowGeneratedReplies;
    public final Boolean cancelNotification;
    public final Boolean contextual;
    public final String icon;
    public final IconSource iconSource;
    public final String id;
    public final Boolean showsUserInterface;
    public final String title;
    public final Integer titleColor;

    public static class a implements Serializable {

        /* renamed from: e  reason: collision with root package name */
        public final List f6616e;

        /* renamed from: f  reason: collision with root package name */
        public final Boolean f6617f;

        /* renamed from: g  reason: collision with root package name */
        public final String f6618g;

        /* renamed from: h  reason: collision with root package name */
        public final List f6619h;

        public a(List list, Boolean bool, String str, List list2) {
            this.f6616e = list;
            this.f6617f = bool;
            this.f6618g = str;
            this.f6619h = list2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            List list = this.f6616e;
            if (list == null ? aVar.f6616e != null : !list.equals(aVar.f6616e)) {
                return false;
            }
            Boolean bool = this.f6617f;
            if (bool == null ? aVar.f6617f != null : !bool.equals(aVar.f6617f)) {
                return false;
            }
            String str = this.f6618g;
            if (str == null ? aVar.f6618g != null : !str.equals(aVar.f6618g)) {
                return false;
            }
            List list2 = this.f6619h;
            return list2 != null ? list2.equals(aVar.f6619h) : aVar.f6619h == null;
        }

        public int hashCode() {
            List list = this.f6616e;
            int i4 = 0;
            int hashCode = (list != null ? list.hashCode() : 0) * 31;
            Boolean bool = this.f6617f;
            int hashCode2 = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
            String str = this.f6618g;
            int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
            List list2 = this.f6619h;
            if (list2 != null) {
                i4 = list2.hashCode();
            }
            return hashCode3 + i4;
        }
    }

    public NotificationAction(Map<String, Object> map) {
        List<Map> list;
        this.id = (String) map.get(ID);
        this.cancelNotification = (Boolean) map.get(CANCEL_NOTIFICATION);
        this.title = (String) map.get(TITLE);
        Integer num = (Integer) map.get(TITLE_COLOR_ALPHA);
        Integer num2 = (Integer) map.get(TITLE_COLOR_RED);
        Integer num3 = (Integer) map.get(TITLE_COLOR_GREEN);
        Integer num4 = (Integer) map.get(TITLE_COLOR_BLUE);
        if (num == null || num2 == null || num3 == null || num4 == null) {
            this.titleColor = null;
        } else {
            this.titleColor = Integer.valueOf(Color.argb(num.intValue(), num2.intValue(), num3.intValue(), num4.intValue()));
        }
        this.icon = (String) map.get(ICON);
        this.contextual = (Boolean) map.get(CONTEXTUAL);
        this.showsUserInterface = (Boolean) map.get(SHOWS_USER_INTERFACE);
        this.allowGeneratedReplies = (Boolean) map.get(ALLOW_GENERATED_REPLIES);
        Integer num5 = (Integer) map.get(ICON_SOURCE);
        if (num5 != null) {
            this.iconSource = IconSource.values()[num5.intValue()];
        } else {
            this.iconSource = null;
        }
        if (map.get(INPUTS) != null && (list = (List) map.get(INPUTS)) != null) {
            for (Map map2 : list) {
                Class<String> cls = String.class;
                this.actionInputs.add(new a(castList(cls, (Collection) map2.get("choices")), (Boolean) map2.get("allowFreeFormInput"), (String) map2.get("label"), castList(cls, (Collection) map2.get("allowedMimeTypes"))));
            }
        }
    }

    public static <T> List<T> castList(Class<? extends T> cls, Collection<?> collection) {
        if (collection == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(collection.size());
        for (Object cast : collection) {
            try {
                arrayList.add(cls.cast(cast));
            } catch (ClassCastException unused) {
            }
        }
        return arrayList;
    }
}
