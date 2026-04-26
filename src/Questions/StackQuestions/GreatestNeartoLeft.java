/*
This Code is for Greatest Near to Left Question
LC :
Questions:
    1) We have given an array : 1 3 0 2
    2) we have to find the greatest element to arr[i]
    3) for 1 -> -1, 3 -> -1, 0 -> 3, 2 -> 3
    4) O/P : -1, -1, 3, 3

Pattern recognition:
    1) If there is an array, and we get n^2 TC in our Brute approach and J loop is dependent on I then we use monotonic stack

Implementation:
    1) We will traverse array from left to right. why ? if we want to pop out / see the left element, it should be present at the top of stack ( LIFO )
    2) On i'th element, we have to pushback all the right elements and on reaching end -1
    3) if stack[top] is greater than arr[i] then store it in o/p array
    4) if stack[top] is less than arr[i] then pop out

 */


import java.util.ArrayDeque;
import java.util.ArrayList;

import static DataStructure.ArraysDS.ArrayListDS.*;

public static class greatestNeartoLeft {

    static ArrayDeque<Integer> d = new ArrayDeque<>(); // New Stack
    static ArrayList<Integer> ans = new ArrayList<>(); // New Vector

    public static ArrayList<Integer> GNTL()
    {
        if (arr.isEmpty())
        {
            System.err.println("Input Array is empty");
        } else
        {
            for (int i = 0; i <= arr.size() - 1; i++)
            {


                while (!d.isEmpty() && arr.get(i) >= d.peek())
                {
                    d.pop();
                }
                if (d.isEmpty())
                {
                    ans.add(-1);
                } else
                {
                    // The top of the stack is now the nearest greater element
                    ans.add(d.peek());
                }

                d.push(arr.get(i));
            }
        }
        return ans;
    }
}

static void main(String[] args)
{
    enterArray();
    printList();
    ArrayList<Integer> ans = greatestNeartoLeft.GNTL();
    System.out.println(ans);
}

