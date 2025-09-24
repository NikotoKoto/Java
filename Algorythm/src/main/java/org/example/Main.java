package org.example;

import org.example.AnagramCheck.AnagramCheck;
import org.example.FindMax.FindMax;
import org.example.Fizzbuzz.FizzBuzz;
import org.example.FrequencyOfCharacters.FrequencyOfCharacters;
import org.example.Palyndrome.Palyndrome;
import org.example.StringReverse.stringReverse;
import org.example.TwoSum.TwoSum;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
   //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text

       System.out.println(stringReverse.reverse("hello"));
       System.out.println(FizzBuzz.FizzBuzzFunction(3));
       System.out.println(FindMax.FindMaxInArray(3, 7, 2, 9, 5));
       System.out.println(Palyndrome.isPalyndrome("kayak"));
       System.out.println(FrequencyOfCharacters.FrequencyChar("banana"));
       System.out.println(FrequencyOfCharacters.FrequencyChar("banana"));
       System.out.println(Arrays.toString(TwoSum.twoNumbers(new int[]{3,5,4,6,2}, 9)));
       System.out.println(AnagramCheck.isAnagram("java","spring"));
        }
    }
