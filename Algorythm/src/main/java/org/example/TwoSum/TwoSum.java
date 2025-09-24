package org.example.TwoSum;

import java.util.HashMap;

public class TwoSum {
    public static int[] twoNumbers(int[] input, int target){
        int[] tab;
        for(int i = 0 ; i< input.length; i++){

            for(int j =0 ; j< input.length; j++){
                if(j != i && (input[j] + input[i] == target)){
                   return new int[]{i,j};
                }
            }


        }
            return new int[]{};
    }
}
