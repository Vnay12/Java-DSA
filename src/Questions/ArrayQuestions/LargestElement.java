
/*
http://takeuforward.org/data-structure/find-the-largest-element-in-an-array/

Example 1:
Input: arr[] = {2,5,1,3,0};
Output: 5
Explanation: 5 is the largest element in the array.

Example2:
Input: arr[] = {8,10,5,7,9};
Output: 10
Explanation: 10 is the largest element in the array.
 */

package Questions.ArrayQuestions;


import java.util.Collections;
import static DataStructure.ArrayListDS.*;


public class LargestElement {


    public static int maxElement()
    {
        int max = Integer.MIN_VALUE;
        for (Integer element : arr)
        {
            if (element > max)
            {
                max = element;
            }
        }
        return max;
    }
    /*
    Approach:Naive Approach using For Loop
    Time Complexity: O(N)
    Space Complexity: O(1)
    */

    public static int maxElement2()
    {
        int max = Collections.max(arr);
        return max;
    }
    /*
    Approach:Using Collection inbuilt max function
    Time Complexity: O(N)
    Space Complexity: O(1)
    */


    public static void main(String[] args)
    {

        int ans;
        enterArray();
        printList();

        ans = maxElement();
        System.out.println(ans);

        ans = maxElement2();
        System.out.println(ans);


    }

}
