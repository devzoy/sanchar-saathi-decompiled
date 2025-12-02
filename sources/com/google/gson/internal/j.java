package com.google.gson.internal;

import java.lang.reflect.Type;

public abstract class j {
    public static boolean a(Type type) {
        return (type instanceof Class) && ((Class) type).isPrimitive();
    }
}
