import static DataStructure.ArraysDS.ArrayListDS.*;


public class  smallestNeartoLeft {
    static ArrayDeque<Integer> d = new ArrayDeque<>(); // New Stack
    static ArrayList<Integer> ans = new ArrayList<>(); // New Vector

    public static ArrayList<Integer> SNTL(){

        if (arr.isEmpty()){
            System.out.println("Input Array is Empty");
        }
        else
        {
            for (int i = 0; i <= arr.size() - 1 ; i++)
            {
                while (!d.isEmpty() && arr.get(i) <= d.peek()){
                    d.pop();
                }
                if (d.isEmpty()){
                    ans.add(-1);
                }
                else {
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
    ArrayList<Integer> ans = smallestNeartoLeft.SNTL();
    System.out.println(ans.reversed());


}

