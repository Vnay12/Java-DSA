/*
This is Array Data Structure Fundamentals and Operations like:
1) Creating Array from User
2) Print Array
3) Insertion
    - At Start
    - At End
    - At Given Index
4) Delete
    - At Start
    - At End
    - At Index
    - Duplicate ( First, Last and All Occurrence )
5) Searching
    - Linear Search
    - Binary Search
6) Sorting



 */


package DataStructure;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.LinkedHashSet;
import java.util.Scanner;


public class ArrayListDS {
    public static Scanner sc = new Scanner(System.in);
    public static ArrayList<Integer> arr = new ArrayList<>();

    // Enter Array from user
    public static void enterArray()
    {
        while (sc.hasNextInt())
        {
            try
            {
                int number = sc.nextInt();
                arr.add(number);
            } catch (InputMismatchException e)
            {
                break;
            }
        }
    }
    /*
    Approach:Enter the elements
    Time Complexity: O(N)
    Space Complexity: O(1)
    */


    public static void printList()
    {


        //------- This is using for-each method --------//

//        for (Integer i : arr)
//        {
//            System.out.println(i);
//        }


        // -----This is using toString()-------------//

        System.out.println(arr.toString());


    }
    /*
    Approach:Printing Array
    Time Complexity: O(N)
    Space Complexity: O(1)
    */

    public static void insertAtBegin(int element)
    {
        arr.addFirst(element);
    }
    /*
    Approach:Insert AT Beginning
    Time Complexity: O(N)
    Space Complexity: O(1)
    */

    public static void insertAtEnd(int element)
    {
        arr.addLast(element);
    }
    /*
    Approach:Insert At Last
    Time Complexity: O(1)
    Space Complexity: O(1)
    */

    public static void insertAtPosition(int position, int element)
    {
        arr.add(position, element);
    }
    /*
    Approach:insert at Position
    Time Complexity: O(N)
    Space Complexity: O(1)
    */

    public static void deleteAtBegin()
    {
        arr.removeFirst();
    }
    /*
    Approach: Delete At Begin
    Time Complexity: O(N)
    Space Complexity: O(1)
    */

    public static void deleteAtEnd()
    {
        arr.removeLast();
    }
    /*
    Approach: Delete At End
    Time Complexity: O(1)
    Space Complexity: O(1)
    */


    public static void deleteAtIndex(int position)
    {
        arr.remove(position);
    }
    /*
    Approach: Delete At Index
    Time Complexity: O(N)
    Space Complexity: O(1)
    */

    public static void deleteDuplicate()
    {
        ArrayList<Integer> newarr = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++)
        {
            if (!newarr.contains(arr.get(i)))
            {
                newarr.add(arr.get(i));

            }

        }
        arr.clear();

        arr = newarr;



    }
    /*
    Approach:Deleting Duplicate using New Array
    Time Complexity: O(N^2) // .contains method uses N time in worst case
    Space Complexity: O(N)
    */


    public static void deleteDuplicate2(){
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        set.addAll(arr);
        arr.clear();
        arr.addAll(set);
    }
    /*
    Approach:Removing Duplicates using Linked Hash Set ( Why LinkedHashSet - it Maintains Order )
    Time Complexity: O(N)
    Space Complexity: O(N)
    */


    public static void main(String[] args)
    {

        // User Entered Array
        enterArray();
        // Printing Array
        printList();

        insertAtBegin(4);
        printList();

        insertAtEnd(10);
        printList();

        insertAtPosition(4, 11);
        printList();

        deleteAtBegin();
        printList();

        deleteAtEnd();
        printList();

        deleteAtIndex(5);
        printList();

        deleteDuplicate();
        printList();

        sc.close();
    }

}
