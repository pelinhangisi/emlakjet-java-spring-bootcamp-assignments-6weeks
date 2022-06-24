package com.pelinhangisi.consumer.helper;

public class emailGeneratorHelper {
    public static String generateEmail(String firstName, String lastName) {
        String email = (firstName + "." + lastName + "@test.com").toLowerCase();
        return email;
    }
}
