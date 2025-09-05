
/*
1) Array should be sorted 
2) if duplicate elements are there it depends on your approach 
 */
import java.util.Arrays;

public class BinarySearch {

    static int BS(int[] arr, int key, int left, int right) {              // This is iterative Methood 
        while (left <= right) {
            int middle = (left + right) / 2;
            if (arr[middle] == key) {
                return middle;
            } else if (key < arr[middle]) {
                right = middle - 1;

            } else {
                left = middle + 1;
            }

        }
        return -1;
    }

    /*
    Approach: Binary Search
     Time Complexity: O(Log N)
     Space Complexity: O(1)
     */
    static int RecursiveBS(int[] arr, int key, int left, int right) {     // This is Recursive Method 
        int middle = (left + right) / 2;

        if (right < left) {
            return -1;
        }

        if (arr[middle] == key) {
            return middle;
        } else if (key < arr[middle]) {
            return RecursiveBS(arr, key, left, middle - 1);

        } else {
            return RecursiveBS(arr, key, middle + 1, right);
        }

    }

    /*
    Approach: Recursive Binary Search
     Time Complexity: O(Log N)
     Space Complexity: O(Log N)
     */
    static int DuplicateFirstOccuranceBS(int[] arr, int key) {              // This is Binary Search when Duplicates are present we have to find first and last occurance
        int left = 0;
        int right = arr.length - 1;
        int ans = -1;
        while (left <= right) {
            int middle = (left + right) / 2;
            if (arr[middle] == key) {
                ans = middle;
                right = middle - 1;
            } else if (key < arr[middle]) {
                right = middle - 1;

            } else {
                left = middle + 1;
            }

        }
        return ans;
    }

    static int DuplicateLastOccuranceBS(int[] arr, int key) {              // This is Binary Search when Duplicates are present we have to find first and last occurance
        int left = 0;
        int right = arr.length - 1;
        int ans = -1;
        while (left <= right) {
            int middle = (left + right) / 2;
            if (arr[middle] == key) {
                ans = middle;
                left = middle + 1;
            } else if (key < arr[middle]) {
                right = middle - 1;

            } else {
                left = middle + 1;
            }

        }
        return ans;
    }

    static int Countoccurance(int[] arr, int key) {                                   // This is to count the occurance 
        int first = DuplicateFirstOccuranceBS(arr, key);
        int last = DuplicateLastOccuranceBS(arr, key);
        if (first == -1) {
            System.out.println("element has single appearance");
            return 0;
        } else {
            return last - first + 1;
        }

    }

    /*
     Approach:Binary Serch with Duplicate and need to find first and last occurance
     Time Complexity: O(Log N)
     Space Complexity: O(1)
     */
    public static int BuiltinBS(int[] arr, int key) {
        return Arrays.binarySearch(arr, key);

    }

    /*
     Approach: Builtin Binary Search ( same as ordinary Binary search )
     Time Complexity: O(Log N)
     Space Complexity: O(1)
     */
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6, 7};
        int key = 6;
        int left = 0;
        int right = arr.length - 1;

        int ans = BS(arr, key, left, right);
        int ans2 = BuiltinBS(arr, key);
        int ans1 = RecursiveBS(arr, key, left, right);

        if (ans == -1) {
            System.out.println("element not found");

        } else {
            System.out.println("element is at index" + ans);
        }

    }
}
