package com.company;

public class BubbleSort {


    public static void bubbleSort(int arr[]){
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }

    }

    public static void printAfterNiterations(int []arr,int iterations){
        int n = arr.length;
        int count =0;
        for (int i = 0; i < n-1; i++)
        {
            count++;
            for (int j = 0; j < n - i - 1; j++)
            {
                if (arr[j] > arr[j + 1])
                {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

            if(count == iterations){
                break;
            }
        }

    }

    public static void printIndexOfOriginal(int [] arr){
        // copy the original array to a new array
        int [] newArray = new int [arr.length];
        for(int i=0;i<arr.length;i++){
            newArray[i] = arr[i];
        }

        // bubble sort
        bubbleSort(arr);

        //get the orignal indices by comparing the sorted array with the newArray ( hold the orignal indices)
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i] == newArray[j]){
                    System.out.println(j);
                }
            }

        }

    }

    public static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
	// write your code here

        //int arr[] = {3,1,8,7,2,9};
        int arr[] = {20,40,30,10};
        printIndexOfOriginal(arr);
        //printAfterNiterations(arr,2);
        System.out.println("Sorted array");
        printArray(arr);
    }
}
