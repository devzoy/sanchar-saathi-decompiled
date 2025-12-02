package com.dexterous.flutterlocalnotifications.models;

import java.io.Serializable;

public class PersonDetails implements Serializable {
    public Boolean bot;
    public Object icon;
    public IconSource iconBitmapSource;
    public Boolean important;
    public String key;
    public String name;
    public String uri;

    public PersonDetails(Boolean bool, Object obj, IconSource iconSource, Boolean bool2, String str, String str2, String str3) {
        this.bot = bool;
        this.icon = obj;
        this.iconBitmapSource = iconSource;
        this.important = bool2;
        this.key = str;
        this.name = str2;
        this.uri = str3;
    }
}
