package com.company;

public class Main {

    public static int findIndex(int arr[], int num){
        int index;
        for ( int i=0;i<arr.length;i++){
            if (num == arr[i]){
                return i;
            }

        }

     return -1;
    }

    public static void main(String[] args) {
    // declare and initialize in separate steps

        int [] arr1;           // Declare
        arr1 = new int [5];  // initialize

        for( int i=0;i<arr1.length;i++ ){
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
    //----------------------------------------------------------
        
	// Declare int array and initialize array
        int [] arr = new int[5];
        for( int i=0;i<arr.length;i++ ){
            System.out.print(arr[i]+" ");
        }
        System.out.println();


    //----------------------------------------------------------
        // intalize without new keyword

        int intialArray[] = {1,2,3,4,5};
        for( int i=0;i<intialArray.length;i++ ){
            System.out.print(intialArray[i]+" ");
        }
        System.out.println();

    //-------------------------------------------------------------

        int [] arrDelete = {9,6,5,1,3,10,2,4,7,8};
        // delete 5 from the array
        int n = arrDelete.length;

        // search for 5 using linear search
        int num = 5;
        int index;

        index = findIndex(arrDelete,num);

        // loop to remove 5
        for( int i=index;i<n-1;i++){
            arrDelete[i] = arrDelete[i+1];

        }

        // print array without 5
        for ( int i=0;i<arrDelete.length;i++){
            System.out.print(arrDelete[i]+" ");
        }

        System.out.println("");


    // ------------------DELETE ELEMENT 40 ----------------------------
        int [] a = {10,20,30,40,50,60};
        int size = a.length;
        int ele = 40;
        index = -1; // if no element is found -> index is -1

        for(int i=0;i<size;i++){
            if(ele == a[i]){
                index = i;
                break;
            }

        }

        if (index == -1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("element found at index "+index);
        }

        // code to remove
        for(int i =index+1; i<size ; i++){
            a[i-1] = a[i];

        }

        //we can make the length of the array smaller or
        size = size-1;

        // or  a [n-1] = -1 // assign -ve value to end

        // print array
        for(int i=0;i<size;i++){
           System.out.print(a[i]+" ");
            }

        System.out.println("");

//----------------------------insertion at pos -----------------------------

       int newArray[] = {10,20,30,40,50,60,0};
        // check if there is space
          // if there is space
        int pos =4;
        index = pos-1; // means index is 3

        int len = newArray.length-1;
        for(int i = len-1;i>=index;i--){

            newArray[i+1] = newArray[i];
        }

       newArray[index] = 100;

        // print array
        for(int i=0;i<len;i++){
            System.out.print(newArray[i]+" ");
        }










    }
}
