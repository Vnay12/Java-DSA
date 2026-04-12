/*
This Code is for Greatest Near to Right Question
LC : 496 - https://leetcode.com/problems/next-greater-element-i/description/
Questions:
    1) We have given an array : 1 3 0 2
    2) we have to find the greatest element to arr[i]
    3) for 1 -> 3, 3 -> -1, 0 -> 2, 2 -> -1
    4) O/P : 3, -1, 2, -1

Pattern recognition:
    1) If there is an array, and we get n^2 TC in our Brute approach and J loop is dependent on I then we use stack

Implementation:
    1) We will traverse array from right to left. why ? if we want to pop out / see the right element, it should be present at the top of stack ( LIFO )
    2) On i'th element, we have to pushback all the right elements and on reaching end -1
    3) if stack[top] is greater than arr[i] then store it in o/p array
    4) if stack[top] is less than arr[i] then pop out

 */


package Questions.StackQuestions;


import java.util.ArrayDeque;
import java.util.ArrayList;


import static DataStructure.ArraysDS.ArrayListDS.*;

public class GreatestNearToRight {
    static ArrayDeque<Integer> d = new ArrayDeque<>();
    static ArrayList<Integer> ans = new ArrayList<>();

    public static void GNTR()
    {
        for (int i = arr.size()-1; i >0 ; i--)
        {
            if(d.isEmpty()){
                ans.addLast(-1);
            }
        }
    }

    public static void main(String[] args)
    {
        enterArray();
        printList();
        System.out.println(arr.size());


    }

}
