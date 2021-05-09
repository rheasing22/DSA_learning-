package com.company;

public class findMaxNumber {

    public static void main(String[] args) {
	 int [] arr = { 3, 1 ,8, 2};
	 int max = arr[0];
	 int n = arr.length;

	 for(int i=1;i<n;i++){
         if (arr[i]> max) {
             max = arr[i];

         }
     }

	 System.out.println(" the max number is "+max);
    }
}
