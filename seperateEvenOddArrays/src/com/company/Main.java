package com.company;

public class Main {

    /**
     * the time complexity is O(n) + O(n) = o(n)
     * @param arr
     */

    public static void evenOddArrys(int [] arr){


        // first we are calculating the size required for the 2 arrays -> O(n)
        int evenSize = 0;
        int oddSize = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0)
                evenSize++;
            else
                oddSize++;
        }
        // odd and even arrays with size
        int[] even = new int[evenSize];
        int[] odd = new int[oddSize];


        // even numbers are div by 2 and odd are not
        // use two variables to increase to keep adding elements into the array -> o(n)
        int j =0;
        int k =0;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]%2==0)
                even[j++]=arr[i];
            else
                odd[k++]=arr[i];

        }
    }



    public static void main(String[] args) {
	// write your code here
    }
}
