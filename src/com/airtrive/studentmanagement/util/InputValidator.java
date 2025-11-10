package com.airtrive.studentmanagement.util;

public class InputValidator {
    public static boolean isValidEmail(String email) {
        return email != null && email.contains("@");
    }
}
