package org.example.Palyndrome;

public class Palyndrome {

    public static boolean isPalyndrome (String input){
        if (input.isEmpty()) return false;
        StringBuilder reverse = new StringBuilder(input);
        reverse.reverse();
        if(reverse.toString().equals(input)){
            return true;
        }
        return false;
    }
}
