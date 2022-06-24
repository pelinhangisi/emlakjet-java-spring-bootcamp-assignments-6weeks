package com.pelinhangisi.consumer.helper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class titleHelper {
    public static String generateTitle(){
        ArrayList<String> title1 = new ArrayList<String>(Arrays.asList("satılık", "kiralık", "proje"));
        ArrayList<String> title2 = new ArrayList<String>(Arrays.asList("ev", "araba", "arsa", "villa"));
        Random random = new Random();
        int title1RandomIndex = random.nextInt(title1.size());
        int title2RandomIndex = random.nextInt(title2.size());
        String title = title1.get(title1RandomIndex)+ " " + title2.get(title2RandomIndex);
        return title;
}
}