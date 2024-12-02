package com.aoc.day2;

import com.aoc.common.Numbers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Part2 {

    public static void main(String[] args) {

        int totalSafe = 0;

        try {
            File input = new File("src/main/resources/day2/input1.txt");
            Scanner reader = new Scanner(input);
            while (reader.hasNext()) {
                String data = reader.nextLine();
                List<Integer> completeList =  Arrays.stream(data.trim().split("\\s+")).map(Integer::parseInt).toList();
                boolean isSafe = isSafe(completeList,completeList,0);

                if(isSafe){
                    totalSafe++;
                }
            }
            System.out.println(totalSafe);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static boolean isSafe(List<Integer> baseList, List<Integer> tolaredTestList, int indexRemoved) {
        Set<Integer> safeValues = new HashSet<>(Arrays.asList(1,2,3,-1,-2,-3));

        boolean isSafe=false;
        int[] values = tolaredTestList.stream().mapToInt(Integer::intValue).toArray();
        if(Numbers.isStrictlyIncrease(values) || Numbers.isStrictlyDecrease(values)){
            isSafe=true;
            for(int i = 1; i< values.length; i++){
                //on évalue pour dire si c'est safe ou pas
                //si chaque element est plus grand de 1 ou de 2 ou de 3 que le précédent
                if (!safeValues.contains(values[i] - values[i - 1])) {
                    isSafe = false;
                    break;
                }
            }
        }

        if(!isSafe){
            if(indexRemoved==baseList.size()){
                return false;
            }
            tolaredTestList=new ArrayList<>(baseList);
            tolaredTestList.remove(indexRemoved++);
            return isSafe(baseList,tolaredTestList,indexRemoved);
        }

        return isSafe;
    }
}
