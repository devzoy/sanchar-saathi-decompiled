package com.google.android.gms.internal.clearcut;

public abstract class N {

    /* renamed from: a  reason: collision with root package name */
    public static final Class f6853a = a();

    public static Class a() {
        try {
            return Class.forName("com.google.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static O b() {
        Class cls = f6853a;
        if (cls != null) {
            try {
                return (O) cls.getDeclaredMethod("getEmptyRegistry", (Class[]) null).invoke((Object) null, (Object[]) null);
            } catch (Exception unused) {
            }
        }
        return O.f6858c;
    }
}
