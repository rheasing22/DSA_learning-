package com.company;


/**
 * this is a brute force method -> time complexity is O(n^2)
 * Better methods are sorting and hashing/ deictonaries in python
 */
public class Main {

    public static int firstRepeating(int[] arr) {
        // write your code here
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return arr[i];
                }
            }
        }

        return -1; // if no repeating element is found

    }


    public static void main(String[] args) {
        int[] arr = {2,3, 5, 7, 9};
        int result = firstRepeating(arr);
        if (result == -1) {
            System.out.println("NO repeating number found ");
        } else {

            System.out.println("repeating number found " + result);
        }
    }

}
