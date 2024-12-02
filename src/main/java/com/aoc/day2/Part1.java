package com.aoc.day2;

import com.aoc.common.Numbers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Part1 {

    public static void main(String[] args) {

        int totalSafe = 0;

        try {
            File input = new File("src/main/resources/day2/input1.txt");
            Scanner reader = new Scanner(input);
            while (reader.hasNext()) {
                String data = reader.nextLine();
                int[] split =  Arrays.stream(data.trim().split("\\s+")).mapToInt(Integer::parseInt).toArray();
                boolean isSafe = isSafe(split);

                if(isSafe){
                    totalSafe++;
                }
            }
            System.out.println(totalSafe);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static boolean isSafe(int[] split) {
        Set<Integer> safeValues = new HashSet<>(Arrays.asList(1,2,3,-1,-2,-3));

        boolean isSafe=false;
        if(Numbers.isStrictlyIncrease(split) || Numbers.isStrictlyDecrease(split)){
            isSafe=true;
            for(int i = 1; i< split.length; i++){
                //on évalue pour dire si c'est safe ou pas
                //si chaque element est plus grand de 1 ou de 2 ou de 3 que le précédent
                if (!safeValues.contains(split[i] - split[i - 1])) {
                    isSafe = false;
                    break;
                }
            }
        }
        return isSafe;
    }
}
