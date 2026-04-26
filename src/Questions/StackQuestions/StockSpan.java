package Questions.StackQuestions;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class StockSpan {

public static class pair {
    int value;
    int index;

    pair(int value, int index){
        this.value = value;
        this.index = index;
    }
}

    static ArrayList<Integer> stockSpan(int[] arr){
        ArrayDeque<Integer> d = new ArrayDeque<>();
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i <= arr.length - 1 ; i++)
        {
                while (!d.isEmpty() && arr[i] <= d.peek()){
                    d.pop();
                }
                if (d.isEmpty()){
                    ans.add(-1);
                }
                else{
                    ans.add(d.peek());
                }

        }


        return ans;
    }


    static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.println("enter the size of array");
        size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));

    }
}
