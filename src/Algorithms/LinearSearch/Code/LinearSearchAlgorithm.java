
/*
1) first we have to take array input 
2) get the key element from the user 
3) Iterat thru array if key == arr[element ] then return 1 or return 0
4) coming to main scope if ans is 1 then print element is present or else no
 */
import java.util.*;

public class LinearSearchAlgorithm {

    public static int Linearsearch(int[] arr, int key, int size) {
        for (int i = 0; i < size; i++) {
            if (key == arr[i]) {
                return i;
            }

        }
        return -1;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int x;
        try {
            System.out.println("Enter the key");
            x = sc.nextInt();
            System.out.println("Enter the array");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println(Arrays.toString(arr));
            int ans = Linearsearch(arr, x, arr.length);

            if (ans == -1) {
                System.out.println("Element was not found");
            } else {
                System.out.println("Element was found at index " + ans);
            }

        } finally {
            sc.close();
        }

    }
}
