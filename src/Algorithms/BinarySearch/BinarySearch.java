/*
=========================================================
    Program : Binary Search Variants in Java
    Purpose : Demonstrates different implementations of
              Binary Search
              -Iterative
              -Recursive
              -Handling Duplicates
              -Built-in approach

=========================================================

Preconditions:
1) Array must be sorted before applying Binary Search.
2) For Duplicate elements:
      - Finding first occurrence
      - Finding last occurrence
      - Counting total occurrences

=========================================================
*/

import java.util.Arrays;

public class BinarySearch {



    // Iterative Binary Search
    // Time Complexity : O(log N)
    // Space Complexity: O(1)

    static int BS(int[] arr, int key, int left, int right) {
        while (left <= right) {
            int middle = (left + right) / 2;

            if (arr[middle] == key) {
                return middle;   // Key found
            } else if (key < arr[middle]) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }
        return -1;  // Key not found
    }


    // Recursive Binary Search
    // Time Complexity : O(log N)
    // Space Complexity: O(log N) (stack frames)

    static int RecursiveBS(int[] arr, int key, int left, int right) {
        if (right < left) {
            return -1;   // Base case: not found
        }

        int middle = (left + right) / 2;

        if (arr[middle] == key) {
            return middle;   // Key found
        } else if (key < arr[middle]) {
            return RecursiveBS(arr, key, left, middle - 1);
        } else {
            return RecursiveBS(arr, key, middle + 1, right);
        }
    }


    // Binary Search - Find First Occurrence of Key
    // Time Complexity : O(log N)
    // Space Complexity: O(1)

    static int DuplicateFirstOccuranceBS(int[] arr, int key) {
        int left = 0, right = arr.length - 1;
        int ans = -1;

        while (left <= right) {
            int middle = (left + right) / 2;

            if (arr[middle] == key) {
                ans = middle;       // Store index
                right = middle - 1; // Keep searching left
            } else if (key < arr[middle]) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }
        return ans;
    }


    // Binary Search - Find Last Occurrence of Key
    // Time Complexity : O(log N)
    // Space Complexity: O(1)

    static int DuplicateLastOccuranceBS(int[] arr, int key) {
        int left = 0, right = arr.length - 1;
        int ans = -1;

        while (left <= right) {
            int middle = (left + right) / 2;

            if (arr[middle] == key) {
                ans = middle;       // Store index
                left = middle + 1;  // Keep searching right
            } else if (key < arr[middle]) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }
        return ans;
    }


    // Count Occurrences of Key
    // Uses First & Last Occurrence
    // Time Complexity : O(log N)
    // Space Complexity: O(1)

    static int CountOccurance(int[] arr, int key) {
        int first = DuplicateFirstOccuranceBS(arr, key);
        int last = DuplicateLastOccuranceBS(arr, key);

        if (first == -1) {
            System.out.println("Element has single or no appearance");
            return 0;
        } else {
            return last - first + 1;
        }
    }

    // Built-in Binary Search (java.util.Arrays)
    // Time Complexity : O(log N)
    // Space Complexity: O(1)

    public static int BuiltinBS(int[] arr, int key) {
        return Arrays.binarySearch(arr, key);
    }




    // Main Method

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6, 7};
        int key = 6;
        int left = 0;
        int right = arr.length - 1;


        // Function call

        int ansIterative = BS(arr, key, left, right);
        int ansRecursive = RecursiveBS(arr, key, left, right);
        int ansBuiltin = BuiltinBS(arr, key);


        // Output result Print
        if (ansIterative == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + ansIterative);
        }

        System.out.println("Recursive Search Result: " + ansRecursive);
        System.out.println("Built-in Search Result : " + ansBuiltin);
    }
}
