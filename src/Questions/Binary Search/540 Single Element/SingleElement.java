/*
Leetcode - 540 - Single ELement in a sorted array ( MEDIUM )

You are given a sorted array consisting of only integers where every element appears exactly twice, except for one element which appears exactly once.

Return the single element that appears only once.

Your solution must run in O(log n) time and O(1) space.

 

Example 1:

Input: nums = [1,1,2,3,3,4,4,8,8]
Output: 2
Example 2:

Input: nums = [3,3,7,7,10,11,11]
Output: 10
 

Constraints:

1 <= nums.length <= 105
0 <= nums[i] <= 105
 */

public class SingleElement {

    public static int solve(int[] arr, int left, int right) {

        return 0;
    }

    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 4, 4, 5, 5, 6, 6};
        int left = 0;
        int right = arr.length - 1;

        solve(arr, left, right);
    }
}
