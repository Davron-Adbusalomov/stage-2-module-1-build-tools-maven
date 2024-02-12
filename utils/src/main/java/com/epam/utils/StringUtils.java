package com.epam.utils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        try {
            double num = Double.parseDouble(str);
            return num > 0;
        } catch (NumberFormatException e) {
            // Handle the case where parsing fails (e.g., non-numeric input)
            return false;
        }
    }
}
