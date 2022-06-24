package com.pelinhangisi.consumer.helper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class descriptionHelper {
    public static String generateDescription() {
        ArrayList<String> description = new ArrayList<String>(Arrays.asList(
                "İhtiyaçtan satılık",
                "Asansörlü",
                "Kombili",
                "Fiber Altyapılı",
                "Acun Emlak",
                "Kalite bizim işimiz",
                "Akıllı Ev Sistemi",
                "Yerden Isıtma"));
        Random random = new Random();
        int randomIndex = random.nextInt(description.size());
        String descriptionText = description.get(randomIndex);
        return descriptionText;

    }
}
