package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int arr[]={1,2,3,4,4,4,5,6,6,7};
        int len = arr.length;
        int key = 4;
        int count = countOccurrences(arr, len, key);
        System.out.println("the count is "+count);



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
                return mid; // return middle index

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

    static int countOccurrences(int arr[], int len, int key)
    {

        int ind = binarySearchRecursive(arr,0,len-1,key);
        // If element is not present
        if (ind == -1)
            return 0;

        // Count elements on left side.
        int count = 1;
        int left = ind - 1;
        while (left >= 0 && arr[left] == key){
            count++;
            left--;

        }


        // Count elements on right side.
        int right = ind + 1;
        while (right < len && arr[right] == key){
            count++;
            right++;

        }


        return count;
    }
}
