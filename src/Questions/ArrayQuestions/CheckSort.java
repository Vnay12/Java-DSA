package Questions.ArrayQuestions;

import static DataStructure.ArrayListDS.*;

public class CheckSort {


    public static boolean checkSorted()
    {
        if (arr.size() <= 1)
            return true;

        for (int i = 0; i < arr.size() - 1; i++)
        {
            if (arr.get(i) > arr.get(i + 1))
            {
                return false; // found a violation
            }
        }
        return true;
    }

    public static void main(String[] args)
    {
        boolean ans;
        enterArray();
        printList();

        ans = checkSorted();
        System.out.println(ans);
    }
}
