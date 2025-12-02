package com.dexterous.flutterlocalnotifications.utils;

public class StringUtils {
    public static Boolean isNullOrEmpty(String str) {
        return Boolean.valueOf(str == null || str.isEmpty());
    }
}
