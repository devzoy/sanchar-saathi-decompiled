package com.google.gson;

import java.lang.reflect.Field;
import java.util.Locale;

public enum b implements c {
    IDENTITY {
        public String b(Field field) {
            return field.getName();
        }
    },
    UPPER_CAMEL_CASE {
        public String b(Field field) {
            return b.k(field.getName());
        }
    },
    UPPER_CAMEL_CASE_WITH_SPACES {
        public String b(Field field) {
            return b.k(b.f(field.getName(), " "));
        }
    },
    LOWER_CASE_WITH_UNDERSCORES {
        public String b(Field field) {
            return b.f(field.getName(), "_").toLowerCase(Locale.ENGLISH);
        }
    },
    LOWER_CASE_WITH_DASHES {
        public String b(Field field) {
            return b.f(field.getName(), "-").toLowerCase(Locale.ENGLISH);
        }
    },
    LOWER_CASE_WITH_DOTS {
        public String b(Field field) {
            return b.f(field.getName(), ".").toLowerCase(Locale.ENGLISH);
        }
    };

    public static String f(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i4 = 0; i4 < length; i4++) {
            char charAt = str.charAt(i4);
            if (Character.isUpperCase(charAt) && sb.length() != 0) {
                sb.append(str2);
            }
            sb.append(charAt);
        }
        return sb.toString();
    }

    public static String k(String str) {
        int length = str.length() - 1;
        int i4 = 0;
        while (!Character.isLetter(str.charAt(i4)) && i4 < length) {
            i4++;
        }
        char charAt = str.charAt(i4);
        if (Character.isUpperCase(charAt)) {
            return str;
        }
        char upperCase = Character.toUpperCase(charAt);
        if (i4 == 0) {
            return upperCase + str.substring(1);
        }
        return str.substring(0, i4) + upperCase + str.substring(i4 + 1);
    }
}
