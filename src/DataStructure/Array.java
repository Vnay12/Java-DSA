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


Note: Because this static array is messy and has lots or restriction while deleting n all its better to use
" ArrayList " - which is dynamic Array.


 */


package DataStructure;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    static Scanner sc = new Scanner(System.in);


    public static void enterArray(int[] arr, int size)
    {
        System.out.println("Enter Array Elements:");
        for (int i = 0; i < size; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array:");
        System.out.println(Arrays.toString(arr));

    }
    /*
    Approach:Initializing Array from user
    Time Complexity: O(N)
    Space Complexity: O(1)
    */

    public static void printArray(int[] arr)
    {
        System.out.println(Arrays.toString(arr));
    }
    /*
    Approach:Printing Array
    Time Complexity: O(N)
    Space Complexity: O(1)
    */

    public static int[] insertAtBegin(int[] arr, int size, int element)
    {
        System.out.println("Array before insertion:");
        printArray(arr);

        int[] newarr = new int[size + 1];

        // Inserting new element at the beginning and increment in size
        newarr[0] = element;

        // Shifting all the elements to the right
        for (int i = 0; i < size; i++)
        {
            newarr[i + 1] = arr[i];
        }

        System.out.println("Array After Insert at Begin");
        printArray(newarr);

        return newarr;
    }
    /*
    Approach:Insert At Begin
    Time Complexity: O(N)
    Space Complexity: O(N)
    */

    public static int[] insertAtEnd(int[] arr, int size, int element)
    {
        System.out.println("Array before insertion:");
        printArray(arr);

        int[] newarr = new int[size + 1];
        // Inserting new element at the beginning and increment in size
        newarr[size] = element;

        // Copying all the elements in new array
        for (int i = 0; i < size; i++)
        {
            newarr[i] = arr[i];
        }

        System.out.println("Array After Insert at End");
        printArray(newarr);

        return newarr;

    }
    /*
    Approach:Insert At End
    Time Complexity: O(N)
    Space Complexity: O(N)
    */


    // This is to insert element at given position and then shift remaining elements to right
    public static int[] insertAtIndex(int[] arr, int size, int position, int element)
    {
        System.out.println("Array before insertion:");
        printArray(arr);

        if (position < 0 || position > size)
        {
            return arr;
        }

        int[] newarr = new int[size + 1];
        for (int i = 0; i < position; i++)
        {
            newarr[i] = arr[i];
        }

        newarr[position] = element;

        for (int i = position; i < size; i++)
        {
            newarr[i + 1] = arr[i];

        }

        System.out.println("Array after inserting element: " + element + " at index: " + position);
        printArray(newarr);


        return newarr;
    }
    /*
    Approach:Insert At Given Index
    Time Complexity: O(N)
    Space Complexity: O(N)
    */

    public static int[] deleteAtBegin(int[] arr, int size)
    {

        if( size ==0) return arr;

        System.out.println("Array before Delete:");
        printArray(arr);

        for (int i = 1; i < size-1; i++)
        {
            arr[i - 1] = arr[i];

        }

        System.out.println("Array After Deleting first Element");
        printArray(arr);
        return arr;
    }
    /*
    Approach:Delete at Beginning
    Time Complexity: O(N)
    Space Complexity: O(1)
    */

    public static int[] deleteAtEnd(int[] arr, int size)
    {
        System.out.println("Array before Delete at End:");
        printArray(arr);

        size = size - 1;

        System.out.println("Array before Delete at End:");
        printArray(arr);


        return arr ;
    }


    public static void main(String[] args)
    {

        System.out.println("Enter the Size of an Array");
        int size = sc.nextInt();
        int[] arr = new int[size];

        enterArray(arr, size);

        System.out.println();
        arr = insertAtBegin(arr, size, 10);
        size++;

        System.out.println();
        arr = insertAtEnd(arr, size, 50);
        size++;

        System.out.println();
        arr = insertAtIndex(arr, size, 5, 10);
        size++;

        System.out.println();
        arr = deleteAtBegin(arr, size);
        size--;


        System.out.println();
        arr = deleteAtEnd(arr, size);





        sc.close();
    }


}
