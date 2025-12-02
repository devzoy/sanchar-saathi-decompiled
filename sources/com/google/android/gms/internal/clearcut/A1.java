package com.google.android.gms.internal.clearcut;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public abstract class A1 {
    public static String a(C0479y1 y1Var) {
        if (y1Var == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        try {
            b((String) null, y1Var, new StringBuffer(), stringBuffer);
            return stringBuffer.toString();
        } catch (IllegalAccessException e4) {
            String valueOf = String.valueOf(e4.getMessage());
            return valueOf.length() != 0 ? "Error printing proto: ".concat(valueOf) : new String("Error printing proto: ");
        } catch (InvocationTargetException e5) {
            String valueOf2 = String.valueOf(e5.getMessage());
            return valueOf2.length() != 0 ? "Error printing proto: ".concat(valueOf2) : new String("Error printing proto: ");
        }
    }

    public static void b(String str, Object obj, StringBuffer stringBuffer, StringBuffer stringBuffer2) {
        if (obj != null) {
            int i4 = 0;
            if (obj instanceof C0479y1) {
                int length = stringBuffer.length();
                if (str != null) {
                    stringBuffer2.append(stringBuffer);
                    stringBuffer2.append(c(str));
                    stringBuffer2.append(" <\n");
                    stringBuffer.append("  ");
                }
                Class<?> cls = obj.getClass();
                for (Field field : cls.getFields()) {
                    int modifiers = field.getModifiers();
                    String name = field.getName();
                    if (!"cachedSize".equals(name) && (modifiers & 1) == 1 && (modifiers & 8) != 8 && !name.startsWith("_") && !name.endsWith("_")) {
                        Class<?> type = field.getType();
                        Object obj2 = field.get(obj);
                        if (!type.isArray() || type.getComponentType() == Byte.TYPE) {
                            b(name, obj2, stringBuffer, stringBuffer2);
                        } else {
                            int length2 = obj2 == null ? 0 : Array.getLength(obj2);
                            for (int i5 = 0; i5 < length2; i5++) {
                                b(name, Array.get(obj2, i5), stringBuffer, stringBuffer2);
                            }
                        }
                    }
                }
                Method[] methods = cls.getMethods();
                int length3 = methods.length;
                while (i4 < length3) {
                    String name2 = methods[i4].getName();
                    if (name2.startsWith("set")) {
                        String substring = name2.substring(3);
                        try {
                            String valueOf = String.valueOf(substring);
                            if (((Boolean) cls.getMethod(valueOf.length() != 0 ? "has".concat(valueOf) : new String("has"), (Class[]) null).invoke(obj, (Object[]) null)).booleanValue()) {
                                String valueOf2 = String.valueOf(substring);
                                b(substring, cls.getMethod(valueOf2.length() != 0 ? "get".concat(valueOf2) : new String("get"), (Class[]) null).invoke(obj, (Object[]) null), stringBuffer, stringBuffer2);
                            }
                        } catch (NoSuchMethodException unused) {
                        }
                    }
                    i4++;
                }
                if (str != null) {
                    stringBuffer.setLength(length);
                    stringBuffer2.append(stringBuffer);
                    stringBuffer2.append(">\n");
                    return;
                }
                return;
            }
            String c4 = c(str);
            stringBuffer2.append(stringBuffer);
            stringBuffer2.append(c4);
            stringBuffer2.append(": ");
            if (obj instanceof String) {
                String str2 = (String) obj;
                if (!str2.startsWith("http") && str2.length() > 200) {
                    str2 = String.valueOf(str2.substring(0, 200)).concat("[...]");
                }
                int length4 = str2.length();
                StringBuilder sb = new StringBuilder(length4);
                while (i4 < length4) {
                    char charAt = str2.charAt(i4);
                    if (charAt < ' ' || charAt > '~' || charAt == '\"' || charAt == '\'') {
                        sb.append(String.format("\\u%04x", new Object[]{Integer.valueOf(charAt)}));
                    } else {
                        sb.append(charAt);
                    }
                    i4++;
                }
                String sb2 = sb.toString();
                stringBuffer2.append("\"");
                stringBuffer2.append(sb2);
                stringBuffer2.append("\"");
            } else if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                stringBuffer2.append('\"');
                while (i4 < bArr.length) {
                    byte b4 = bArr[i4] & 255;
                    if (b4 == 92 || b4 == 34) {
                        stringBuffer2.append('\\');
                    } else if (b4 < 32 || b4 >= Byte.MAX_VALUE) {
                        stringBuffer2.append(String.format("\\%03o", new Object[]{Integer.valueOf(b4)}));
                        i4++;
                    }
                    stringBuffer2.append((char) b4);
                    i4++;
                }
                stringBuffer2.append('\"');
            } else {
                stringBuffer2.append(obj);
            }
            stringBuffer2.append("\n");
        }
    }

    public static String c(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i4 = 0; i4 < str.length(); i4++) {
            char charAt = str.charAt(i4);
            if (i4 != 0) {
                if (Character.isUpperCase(charAt)) {
                    stringBuffer.append('_');
                }
                stringBuffer.append(charAt);
            }
            charAt = Character.toLowerCase(charAt);
            stringBuffer.append(charAt);
        }
        return stringBuffer.toString();
    }
}
