/*
Given an array arr. Your task is to find the minimum and maximum elements in the array.

Note: Return a Pair that contains two elements the first one will be a minimum element and the second will be a maximum.

Input: arr[] = [3, 2, 1, 56, 10000, 167]
Output: 1 10000
Explanation: minimum and maximum elements of array are 1 and 10000.


Input: arr[] = [1, 345, 234, 21, 56789]
Output: 1 56789
Explanation: minimum and maximum element of array are 1 and 56789.

 */

package Questions.LinearSearch;

import java.util.Arrays;
import java.util.Random;

public class MinMax {

    public static int[] solve(int[] arr) {                             // This is using if condition
        int min = arr[0], max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }

        }
        return new int[]{min, max};
    }

    public static int[] solve2(int[] arr) {                        // This is using Math.min and Math.max function
        int min = arr[0], max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            min = Math.min(min, arr[i]);
            max = Math.max(max, arr[i]);

        }
        return new int[]{min, max};
    }

    public static void main(String[] args) {
        int[] a;

        Random random = new Random();
        a = new int[6];
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(0, 100);
        }
        System.out.println(Arrays.toString(a));

        int[] result = solve(a);        // Calling if condition method
        int[] result2 = solve2(a);     // Calling Math function method

        System.out.println(result[0] + " " + result[1]);
        System.out.println(result2[0] + " " + result2[1]);

    }


}
/*
 Approach: Using Linear Search Algorithm
 Time Complexity: O(N)
 Space Complexity: O(1)
 */
