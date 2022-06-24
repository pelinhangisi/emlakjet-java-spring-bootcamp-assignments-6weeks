package com.pelinhangisi.consumer.helper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class firstNameHelper {

    public static String generateFirstName(){
        ArrayList<String> first_name = new ArrayList<String>(Arrays.asList(
                "Leanora",
                "Darbie",
                "Hillel",
                "Kathy",
                "Madelaine",
                "Arleen",
                "Nada",
                "Isabelita",
                "Oberon",
                "Karole",
                "Sig",
                "Ashleigh",
                "Robinet",
                "Allx",
                "Lilias",
                "Rogers",
                "Phillip",
                "Edie",
                "Truman",
                "Briano",
                "Torry",
                "Gianna",
                "Daniela",
                "Jackie",
                "Benjie",
                "Natasha",
                "Binky",
                "Gordy",
                "Elisha",
                "Saunders",
                "Louisa",
                "Nye",
                "Tabby",
                "Salomon",
                "Sybille",
                "Aubry",
                "Thomasa",
                "Mil",
                "Trip",
                "Tressa",
                "Leonerd",
                "Karmen",
                "Arel",
                "Benedetto",
                "Anny",
                "Rupert",
                "Ingunna",
                "Guy",
                "Vikki",
                "Matias"));
        Random random = new Random();
        int randomIndex = random.nextInt(50);
        return first_name.get(randomIndex);
    }
}
