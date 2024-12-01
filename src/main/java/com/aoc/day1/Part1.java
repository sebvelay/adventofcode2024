package com.aoc.day1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Part1 {

    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        try{
            File input = new File("src/main/resources/day1/input1");
            Scanner reader = new Scanner(input);
            while(reader.hasNext()){
                String data = reader.nextLine();
                String[] split = data.trim().split("\\s+");
                list1.add(Integer.parseInt(split[0]));
                list2.add(Integer.parseInt(split[1]));
            }

            //ordonner les listes
            list1.sort(Integer::compareTo);
            list2.sort(Integer::compareTo);

            int totalDistance = 0;
            //calcule la distance
            for(int i=0;i<list1.size();i++){
                totalDistance += Math.abs(list1.get(i)-list2.get(i));
            }

            System.out.println(totalDistance);


        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }



    }
}
