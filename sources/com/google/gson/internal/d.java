package com.google.gson.internal;

public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    public static final int f8523a = a();

    public static int a() {
        return d(System.getProperty("java.version"));
    }

    public static int b(String str) {
        try {
            StringBuilder sb = new StringBuilder();
            for (int i4 = 0; i4 < str.length(); i4++) {
                char charAt = str.charAt(i4);
                if (!Character.isDigit(charAt)) {
                    break;
                }
                sb.append(charAt);
            }
            return Integer.parseInt(sb.toString());
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public static int c() {
        return f8523a;
    }

    public static int d(String str) {
        int f4 = f(str);
        if (f4 == -1) {
            f4 = b(str);
        }
        if (f4 == -1) {
            return 6;
        }
        return f4;
    }

    public static boolean e() {
        return f8523a >= 9;
    }

    public static int f(String str) {
        try {
            String[] split = str.split("[._]");
            int parseInt = Integer.parseInt(split[0]);
            return (parseInt != 1 || split.length <= 1) ? parseInt : Integer.parseInt(split[1]);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }
}
