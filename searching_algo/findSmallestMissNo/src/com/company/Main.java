package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int arr[] ={0,1,3,4,5,6,7,8,9,10};
        int start = 0;
        int end = 9;
        int missing = findMissingPositiveNumber(arr,start,end);
        System.out.println("the missing value is "+missing);


    }

    /*

    Edge cases:
    1. if the first element != index , return start
    2.  if the array has no missing element found i.e start>end, end = end+1 i.e 10 //
        eg) low> high-> stopping point of Binary

    //similar  procedure to binary search
    3. calculate mid
    4. if the arr[mid] > mid then the missing val to the left
    5.  else go to the to the right.

     */

    static int findMissingPositiveNumber(int arr[],int start,int end){
        // DISPLAY THE ARRAY AT ALL TIMES
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("The start "+start+" the end val"+end);
        for(int i=start;i<(end+1); i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("\n");




        //Special case if nothing is missing 0,1,2,3,4,5,6,7,8,9 -> we return end+1 i.e 10
        if(start>end){
            System.out.println("all the values were present, so return end+1");
            return end+1;
        }

        // start value != start , 1 != 0 or as we make our array smaller, this is our base case to find missing value
        if(start !=arr[start]){
            System.out.println("the first value not match the index");
            return start;
        }

        // calculate mid
        int mid = start + (end-start)/2;
        System.out.println("the mid is "+mid+" The mid value is "+arr[mid]);


        // if the mid value> mid index then go left
        if(arr[mid]>mid){
            System.out.println("the value missing is on the left side of mid, smaller val");
            return findMissingPositiveNumber(arr,start,mid);

        }

        //else keep making it smaller and go to the right
        System.out.println("I am searching to the right");
        return findMissingPositiveNumber(arr,mid+1,end); // increment start and get new sub array
    }
}
