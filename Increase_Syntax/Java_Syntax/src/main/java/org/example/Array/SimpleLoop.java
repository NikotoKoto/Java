package org.example.Array;

public class SimpleLoop {

        public static int max (int[] input){
            if(input == null || input.length == 0) return 0;

            int max = 0;
            for(int i = 0; i<input.length; i++){
                if(input[i]> max ){
                    max = input[i];
                }
            }
            return max;
        }


        public static int[] filterEven_twoPass(int[]a){
            int count = 0;
            int[] result= new int[count];
            int j = 0;
            for(int i : a){
                if(i%2 == 0){
                    result[j++] = i;
                }
            }
            return result;
        }
}
