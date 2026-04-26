import static DataStructure.ArraysDS.ArrayListDS.*;


public class  smallestNeartoRight {
     static ArrayDeque<Integer> d = new ArrayDeque<>(); // New Stack
     static ArrayList<Integer> ans = new ArrayList<>(); // New Vector

    public static ArrayList<Integer> SNTR(){

        if (arr.isEmpty()){
            System.out.println("Input Array is Empty");
        }
        else
        {
            for (int i = arr.size() - 1; i >= 0 ; i--)
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
        ArrayList<Integer> ans = smallestNeartoRight.SNTR();
        System.out.println(ans.reversed());


    }

