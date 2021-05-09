package com.company;

public class Main {
    /*
    1. Linear search : You are given an array and you need to the find the element is present or not
    2. number of comparisons made
     */

    public static void main(String[] args) {
	// write your code here
        int[] arr = {19,2,29,76,83,3,7,54,27};
        linearSearch(arr,7);
    }

    public static void linearSearch(int arr[],int element){
        /**
         * logic : we use a for loop to go through the entire list and then check with each if it
         * is the element , while we do what we use a count var to keep track of the comparisions made
         *
         * input : arr
         * key : element
         * output: the number of comparisions
         */

        int comparisons= 0; // count var to keep track
        for(int i=0;i<arr.length;i++){
            comparisons++;
            if(arr[i]==element){
                System.out.println("the elemnt is found and the count is "+comparisons);


            }
        }
    }
}
