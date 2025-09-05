/*
Given a sorted array of N integers, write a program to find the index of the last occurrence of the target key. If the target is not found then return -1.

Note: Consider 0 based indexing

Examples:

Example 1:
Input: N = 7, target=13, array[] = {3,4,13,13,13,20,40}
Output: 4
Explanation: As the target value is 13 , it appears for the first time at index number 2.

Example 2:
Input: N = 7, target=60, array[] = {3,4,13,13,13,20,40}
Output: -1
Explanation: Target value 60 is not present in the array 



My Solution

1) Take N elements ( Size from user ) 
2) Take array from user
3) Take Key
4) if key == arr[i] then temp = i and i++ 
 */

import static java.lang.System.out;
import java.util.*;

public class LastOccurance {

    public static int solve(Scanner sc) {
        System.out.println("Enter the Size of an array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(0, 10);
        }
        Arrays.sort(arr);
        out.println(Arrays.toString(arr));
        System.out.println("Enter the key you want to find");
        int key = sc.nextInt();
        int temp = -1;
        for (int i = 0; i < size; i++) {
            if (key == arr[i]) {
                temp = i;
                i++;

            }

        }

        return temp;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans = solve(sc);

        if (ans == -1) {
            System.out.println("element was not found");
        } else {
            System.out.println("element was found at index" + " " + ans);
        }
    }
}


/*
Question says array is sorted already if so then 
Time Complexity : 
O(N)


If i Sort the array then:
O(N Log N)

Space Complexity: 
O(1)
*/
