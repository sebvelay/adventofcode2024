package com.aoc.common;

public class Numbers {

    public static boolean isStrictlyIncrease(int[] numbers){
        for(int i=1;i<numbers.length;i++){
            if(numbers[i]<=numbers[i-1]){
                return false;
            }
        }
        return true;
    }

    public static boolean isStrictlyDecrease(int[] numbers){
        for(int i=1;i<numbers.length;i++){
            if(numbers[i]>=numbers[i-1]){
                return false;
            }
        }
        return true;
    }



}
