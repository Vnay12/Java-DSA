package DataStructure.Stacks;

import java.util.ArrayDeque;
import java.util.Deque;

public class StackDeque {

    public static void main(String[] args)
    {
        Deque<Integer> dq = new ArrayDeque<>();
        dq.add(5);
        dq.add(6);
        System.out.println(dq.size());
        System.out.println(dq);



    }
}
