package com.pelinhangisi.consumer.helper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class lastNameHelper {
    public static String generateFirstName(){
        ArrayList<String> last_name = new ArrayList<String>(Arrays.asList(
                "Babonau",
                "Ebbrell",
                "Grimsdell",
                "Nern",
                "Mussett",
                "Gregine",
                "Orrah",
                "Bullivent",
                "Newvell",
                "Ferriman",
                "Preddy",
                "Hargie",
                "Forster",
                "Peagram",
                "Zupone",
                "Chastanet",
                "Canto",
                "Walklate",
                "Pamplin",
                "Searston",
                "Gorling",
                "Keyte",
                "Josling",
                "Kwiek",
                "McKeachie",
                "Spenley",
                "Pears",
                "Longega",
                "MacKeller",
                "Gentsch",
                "Dundon",
                "Rex",
                "Tarver",
                "Brixham",
                "Sherwell",
                "Carlesi",
                "Form",
                "Tappin",
                "Goodricke",
                "Maddicks",
                "Jaray",
                "Dimitrescu",
                "Frankcom",
                "Merwede",
                "Vernazza",
                "Droogan",
                "Pethrick",
                "Pierrepoint",
                "Casolla",
                "Wallege"
        ));
        Random random = new Random();
        int randomIndex = random.nextInt(50);
        return last_name.get(randomIndex);
    }
}
