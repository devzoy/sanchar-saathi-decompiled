package t3;

import A3.b;
import v3.d;
import v3.l;
import v3.x;

public abstract class a {
    public static final Class a(b bVar) {
        l.e(bVar, "<this>");
        Class d4 = ((d) bVar).d();
        l.c(d4, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return d4;
    }

    public static final Class b(b bVar) {
        l.e(bVar, "<this>");
        Class d4 = ((d) bVar).d();
        if (!d4.isPrimitive()) {
            l.c(d4, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
            return d4;
        }
        String name = d4.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    d4 = Double.class;
                    break;
                }
                break;
            case 104431:
                if (name.equals("int")) {
                    d4 = Integer.class;
                    break;
                }
                break;
            case 3039496:
                if (name.equals("byte")) {
                    d4 = Byte.class;
                    break;
                }
                break;
            case 3052374:
                if (name.equals("char")) {
                    d4 = Character.class;
                    break;
                }
                break;
            case 3327612:
                if (name.equals("long")) {
                    d4 = Long.class;
                    break;
                }
                break;
            case 3625364:
                if (name.equals("void")) {
                    d4 = Void.class;
                    break;
                }
                break;
            case 64711720:
                if (name.equals("boolean")) {
                    d4 = Boolean.class;
                    break;
                }
                break;
            case 97526364:
                if (name.equals("float")) {
                    d4 = Float.class;
                    break;
                }
                break;
            case 109413500:
                if (name.equals("short")) {
                    d4 = Short.class;
                    break;
                }
                break;
        }
        l.c(d4, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
        return d4;
    }

    public static final b c(Class cls) {
        l.e(cls, "<this>");
        return x.b(cls);
    }
}
