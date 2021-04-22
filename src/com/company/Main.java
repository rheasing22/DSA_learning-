package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static String highAndLow(String numbers){
        //take the string of numbers convert to arrayslist and find maximum

        //create an array list
        ArrayList<Integer> integerList = new ArrayList<Integer>();

        //split the string based on space into a string array
        String str[] = numbers.split(" ");

        //add each value to the array list to use collections max and min

        for(int i=0;i< str.length;i++){
            integerList.add(Integer.valueOf(str[i]));

        }

        //find the min and max
        String result =Collections.max(integerList)+" "+Collections.min(integerList);
        return result ;

    }

    public static void main(String[] args) {
	// write your code here
        String list = "1 2 3 4 5";
        // create an array
        System.out.println(highAndLow(list));



    }
}
