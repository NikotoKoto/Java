package org.example.AnagramCheck;

import java.util.HashMap;

public class AnagramCheck {

    public static boolean isAnagram(String input,String input2){
        HashMap <Character,Integer> res1 = new HashMap<>();
        HashMap <Character,Integer> res2 = new HashMap<>();

        for(char c : input.toCharArray()){
            res1.put(c,res1.getOrDefault(c,0)+1);
        }
        for(char c : input2.toCharArray()){
            res2.put(c,res2.getOrDefault(c,0)+1);
        }
        if(res1.equals(res2)){
            return true;
        }
        return false;
    }

}
