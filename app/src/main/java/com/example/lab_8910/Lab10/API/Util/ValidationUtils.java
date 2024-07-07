package com.example.lab_8910.Lab10.API.Util;

public class ValidationUtils {
    public static boolean isValidEmail(String email) {
        return android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches();
    }

}
