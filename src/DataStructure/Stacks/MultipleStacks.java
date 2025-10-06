/*
This Code contains implementation of multiple stack in single array
if array of size N = 10
stacks M = 3
N/M = X ( Number of elements per stack )

Note: If M is factor of N then it's easy to equally divide the stack but if it's not then we have to manage last manually

Real Life Example : It is used in multitasking in OS


__ __ __ | __ __ __ | __ __ __ |



 */

package DataStructure.Stacks;

import java.util.Scanner;

public class MultipleStacks {
    static Scanner sc = new Scanner(System.in);


    public static void push(int[] arr, int size, int number){
        int top0 = -1;

    }

    public static void stackArray(int size, int[] arr)
    {

        for (int i = 0; i < size; i++)
        {
            int x = sc.nextInt();
            arr[i] = x;
        }

        for (int i = 0; i < size; i++)
        {
            System.out.print(arr[i]);
        }

        System.out.println();

    }


    public static void main(String[] args)
    {
        int size;
        System.out.println("Enter the size of array");
        size = sc.nextInt();
        int[] arr = new int[size];

        stackArray(size, arr);
        stackArray(size, arr);

    }
}
