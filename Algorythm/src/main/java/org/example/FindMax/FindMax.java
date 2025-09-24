package org.example.FindMax;

import java.lang.reflect.Array;

public class FindMax {

    public static int FindMaxInArray(int... input){
        int max = 0;
        for( int i =0; i< input.length; i++){
            if(input[i] > max){
                max = input[i];
            }

        }
        return max;
    }
}
