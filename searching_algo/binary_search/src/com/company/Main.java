package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int arr[] ={10,20,30,40,50,60,70,80,90,100};
        int key = 77;
        int low = 0;
        int high = arr.length - 1 ;

        //int index = binarySearchIterative(arr,low,high,key);
        int index = binarySearchRecursive(arr,low,high,key);
        System.out.println(index);
    }


    /*
    1. compare the key with the middle element
    2.if it matches -> return the index
    3.Else if the key>mid ele ->move right of mid
    4.Else Key < mid ele -> move left  of mid
    5. return -1 if you can't find it

     */

    static int binarySearchIterative(int arr[],int low,int high,int key){

        while(low<=high){

            // calculate the new middle everytime
            int mid = low + ( high - low )/2;

            if(arr[mid] == key){
                return mid;
            }

            //the key is greater than mid -> move to the right->change low
            if(arr[mid]<key){
                low = mid+1;
            }

            // if the key is smaller than mid -> the left of mid ->change the high
            else{
                high = mid-1;
            }

        }

        return -1; // ele/key nor present

    }


    static int binarySearchRecursive(int arr[],int low,int high,int key)
    {
        // base condtion
        // logic
        //recursive call


        if( low<= high)
        {
            int mid = low + (high - low)/2;

            // if the element matches the key
            if(arr[mid] == key)
                return mid;

                // if the key> middle val-> go right=> low = mid+!
            else if (arr[mid] < key){
                return binarySearchRecursive(arr,mid+1,high,key);
            }


            // if the key < middle val-> go to the left-> high = mid-1
            else{
                return binarySearchRecursive(arr,low,mid-1,key);
            }

        }

        return -1; // if element not found
    }
}
