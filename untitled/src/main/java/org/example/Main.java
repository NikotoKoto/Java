package org.example;



public class Main {
    public static void main(String[] args) {
System.out.println(isPalyndrome("kayak"));
    }
        public static boolean isPalyndrome (String s){
            String reverse = "";

            for (int i = s.length() - 1; i >= 0; i--) {
                reverse += s.charAt(i);
            }
            return reverse.equals(s);

    }
}