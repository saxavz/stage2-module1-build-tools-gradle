package com.epam.utils;

import java.lang.*;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        return Long.parseLong(str) > 0l;
    }
}
