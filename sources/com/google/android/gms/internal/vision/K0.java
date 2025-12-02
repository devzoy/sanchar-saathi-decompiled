package com.google.android.gms.internal.vision;

import android.support.v4.media.session.b;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class K0 {

    /* renamed from: a  reason: collision with root package name */
    public static final Logger f7304a = Logger.getLogger(C0551v0.class.getName());

    /* renamed from: b  reason: collision with root package name */
    public static String f7305b = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";

    public static A0 a(Class cls) {
        String str;
        Class<K0> cls2 = K0.class;
        ClassLoader classLoader = cls2.getClassLoader();
        if (cls.equals(A0.class)) {
            str = f7305b;
        } else if (!cls.getPackage().equals(cls2.getPackage())) {
            throw new IllegalArgumentException(cls.getName());
        } else {
            str = String.format("%s.BlazeGenerated%sLoader", new Object[]{cls.getPackage().getName(), cls.getSimpleName()});
        }
        try {
            b.a(Class.forName(str, true, classLoader).getConstructor((Class[]) null).newInstance((Object[]) null));
            throw null;
        } catch (NoSuchMethodException e4) {
            throw new IllegalStateException(e4);
        } catch (InstantiationException e5) {
            throw new IllegalStateException(e5);
        } catch (IllegalAccessException e6) {
            throw new IllegalStateException(e6);
        } catch (InvocationTargetException e7) {
            throw new IllegalStateException(e7);
        } catch (ClassNotFoundException unused) {
            Iterator<S> it = ServiceLoader.load(cls2, classLoader).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    b.a(it.next());
                    throw null;
                } catch (ServiceConfigurationError e8) {
                    ServiceConfigurationError serviceConfigurationError = e8;
                    Logger logger = f7304a;
                    Level level = Level.SEVERE;
                    String simpleName = cls.getSimpleName();
                    logger.logp(level, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", simpleName.length() != 0 ? "Unable to load ".concat(simpleName) : new String("Unable to load "), serviceConfigurationError);
                }
            }
            if (arrayList.size() == 1) {
                return (A0) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (A0) cls.getMethod("combine", new Class[]{Collection.class}).invoke((Object) null, new Object[]{arrayList});
            } catch (NoSuchMethodException e9) {
                throw new IllegalStateException(e9);
            } catch (IllegalAccessException e10) {
                throw new IllegalStateException(e10);
            } catch (InvocationTargetException e11) {
                throw new IllegalStateException(e11);
            }
        }
    }
}
