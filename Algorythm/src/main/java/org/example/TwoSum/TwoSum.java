package org.example.TwoSum;

import java.util.HashMap;

public class TwoSum {
    public static int[] twoNumbers(int[] input, int target){
       HashMap <Integer, Integer> map = new HashMap<>();
       for( int i = 0 ; i< input.length; i++){
           int complement = target - input[i];
           if(map.containsKey(complement) ){
           return new int[]{map.get(complement),i};
           }
              map.put(input[i], i);

       }
       return new int[]{};
    }
}
