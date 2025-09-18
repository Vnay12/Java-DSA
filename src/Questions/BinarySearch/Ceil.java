/*
GFG - Ciel in a sorted array

Given a sorted array arr[] and an integer x, find the index (0-based) of the smallest element in arr[] that is greater than or equal to x. This element is called the ceil of x. If such an element does not exist, return -1.

Note: In case of multiple occurrences of ceil of x, return the index of the first occurrence.

Examples

Input: arr[] = [1, 2, 8, 10, 11, 12, 19], x = 5
Output: 2
Explanation: Smallest number greater than 5 is 8, whose index is 2.

Input: arr[] = [1, 2, 8, 10, 11, 12, 19], x = 20
Output: -1
Explanation: No element greater than 20 is found. So output is -1.

Input: arr[] = [1, 1, 2, 8, 10, 11, 12, 19], x = 0
Output: 0
Explanation: Smallest number greater than 0 is 1, whose indices are 0 and 1. The index of the first occurrence is 0.

Constraints:
1 ≤ arr.size() ≤ 106
1 ≤ arr[i] ≤ 106
0 ≤ x ≤ arr[n-1]


 */

package Questions.BinarySearch;

public class Ceil {

    static int findCeil(int[] arr, int key) {
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

        if (left == arr.length) {
            return -1;
        } else if (left == right) {
            return right;
        } else {
            return left;
        }

    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 4, 4, 4, 4, 10};
        int key = 4;
        int ans = findCeil(arr, key);
        System.out.println(ans);
    }


}
