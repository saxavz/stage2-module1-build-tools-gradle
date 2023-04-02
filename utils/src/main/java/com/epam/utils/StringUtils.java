package com.epam.utils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        return Long.parseLong(str) > 0l;
    }
}
