package org.example.FrequencyOfCharacters;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfCharacters {
    public static String FrequencyChar(String input) {
        LinkedHashMap<Character, Integer> result = new LinkedHashMap<>();
        for (char c : input.toLowerCase().toCharArray()) {
            result.put(c, result.getOrDefault(c, 0) + 1);
        }
        int max = 0;
        char key = ' ';
        for (Map.Entry<Character, Integer> entry : result.entrySet()) {

            if (entry.getValue() > max) {
                max = entry.getValue();
                key = entry.getKey();
            }

        }
        return "Frequency of character : " + result + "\n"
                + "Most char frequency: " + "key : " + key + " , value: " + max;


    }
}
