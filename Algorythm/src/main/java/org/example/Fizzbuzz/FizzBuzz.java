package org.example.Fizzbuzz;

public class FizzBuzz {

    public static StringBuilder FizzBuzzFunction(int input){
        StringBuilder result = new StringBuilder();
        if(input %3 == 0){
            result.append("Fizz \n");
        }
        if(input%5==0){
            result.append("Buzz \n");
        }
        if(input%3==0 && input%5==0){
            result.append("FizzBuzz \n");
        }

        return result;
    }
}
