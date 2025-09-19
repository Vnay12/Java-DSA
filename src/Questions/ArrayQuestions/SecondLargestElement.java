/*

https://takeuforward.org/data-structure/find-second-smallest-and-second-largest-element-in-an-array/

Example 1:
Input: [1,2,4,7,7,5]
Output: Second Smallest : 2
	Second Largest : 5
Explanation: The elements are as follows 1,2,3,5,7,7 and hence second largest of these is 5 and second smallest is 2

Example 2:
Input: [1]
Output: Second Smallest : -1
	Second Largest : -1
Explanation: Since there is only one element in the array, it is the largest and smallest element present in the array. There is no second largest or second smallest element present.

 */

package Questions.ArrayQuestions;

import static DataStructure.ArrayListDS.*;

public class SecondLargestElement {

    public static int secondLargestElement()
    {
        int max = arr.getFirst();
        int secondmax = Integer.MIN_VALUE;

        for (Integer element : arr)
        {
            if (element > max)
            {
                secondmax = max;
                max = element;
            } else if (element > secondmax && element != max)
            {
                secondmax = element;
            }

        }
        return secondmax;
    }
    /*
    Approach:Finding Second Largest using For Loop
    Time Complexity: O(N)
    Space Complexity: O(1)
    */

    public static int secondSmallestElement()
    {
        int min = arr.getFirst();
        int secondmin = Integer.MAX_VALUE;

        for (Integer element : arr)
        {
            if (element < min)
            {
                secondmin = min;
                min = element;
            } else if (element < secondmin && element != min)
            {
                secondmin = element;
            }

        }
        return secondmin;
    }
    /*
    Approach:Finding Second Smallest using for loop
    Time Complexity: O(N)
    Space Complexity: O(1)
    */


    public static void main(String[] args)
    {
        int ans;
        int ans2;
        enterArray();
        printList();

        ans = secondLargestElement();
        System.out.println(ans);

        ans2 = secondSmallestElement();
        System.out.println(ans2);
    }
}
