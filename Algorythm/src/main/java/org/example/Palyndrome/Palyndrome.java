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


    public static boolean isPalyndrome(int input) {
        int n = input;
        int index;
        int reversed = 0;
        while (n > 0) {
            index = n % 10;
            reversed = 10 * reversed + index;
            n /= 10;
        }
        return input == reversed;
    }
}
