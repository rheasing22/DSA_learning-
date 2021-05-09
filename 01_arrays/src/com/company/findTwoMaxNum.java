package com.company;

public class findTwoMaxNum{

    public static void printTwoMaxNumbers(int[] arr){
        // take to var: max1 and max2
        //for each elemnt in an array :
        /*
         * check arr[i] (num) > max1
         * we assign max 1 to max2 as it is now the second largest element
         * -> max2 = max1
         *
         * then : max1 = arr[i]
         *
         * also check if it not greater than the first max number is
         * might be greater than the second max number
         *

         *
         * check ma
         */
        int max1= Integer.MIN_VALUE; // -infinte, largest value
        int max2 = Integer.MIN_VALUE;// second largest value

        for(int i=0;i< arr.length;i++){
            if(arr[i] > max1){
                max2 = max1;
                max1 = arr[i];
            }
            else if(arr[i] > max2){
                max2 = arr[i];
            }
        }

        System.out.println(" maximum number is "+max1);
        System.out.println("Second Max number is "+ max2);
    }

    public static void main(String[] args) {
	// write your code here
        int [] arr = { 2,5,7,3,19};
        printTwoMaxNumbers(arr);

    }
}
