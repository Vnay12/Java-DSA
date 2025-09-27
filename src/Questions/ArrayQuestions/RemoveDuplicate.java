package Questions.ArrayQuestions;

import java.util.Arrays;
import  java.util.LinkedHashSet;
import java.util.Scanner;


public class RemoveDuplicate {


    public static void main(String[] args)
    {
        int[] arr = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++)
        {
            int ans = sc.nextInt();
            arr[i] = ans;
        }
        System.out.println(Arrays.toString(arr));
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int i = 0; i < arr.length; i++)
        {
            set.add(arr[i]);
        }
        System.out.println(set);
        for( int i = 0; i < arr.length; i++){
            arr[i] = set[i];
        }

        int k = set.size();
        System.out.println(k);

     }
}
