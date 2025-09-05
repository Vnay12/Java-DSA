
/*
1) Array should be sorted 
2) if duplicate elements are there it depends on your approach 
 */
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

        if (right > left) {
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
     Space Complexity: O(1)
     */
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6, 7};
        int key = 6;
        int left = arr[0];
        int right = arr.length - 1;

        int ans = BS(arr, key, left, right);
        int ans1 = RecursiveBS(arr, key, left, right);

        if (ans == -1) {
            System.out.println("element not found");

        } else {
            System.out.println("element is at index" + ans);
        }

    }
}
