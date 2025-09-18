/*

Leetcode - 24 Swape Nodes in pair

https://leetcode.com/problems/swap-nodes-in-pairs/description/?envType=problem-list-v2&envId=linked-list

Given a linked list, swap every two adjacent nodes and return its head. You must solve the problem without modifying the values in the list's nodes (i.e., only nodes themselves may be changed.)



Example 1:

Input: head = [1,2,3,4]

Output: [2,1,4,3]


Example 2:

Input: head = []

Output: []


Example 3:

Input: head = [1]

Output: [1]


Example 4:

Input: head = [1,2,3]

Output: [2,1,3]



Constraints:

The number of nodes in the list is in the range [0, 100].
0 <= Node.val <= 100

 */

package Questions.LinkedListQuestions;
import static DataStructure.LinkedList.*;

public class SwapNodesPairs{
    public static Node SwapNode(Node head){
        if(head == null ) return null;
        if(head.next == null) return head;
        if(head.next != null){
        Node curr = head;
        Node fast = head.next;
            while (fast.next != null){
                Node curr2 = fast.next;
                curr.next = curr2;
                fast.next = curr;
                curr = curr2;
                fast = curr2.next;

            }

        }


        return head;

    }

    public static void main(String[] args)
    {
        Node head = new Node(10);
    }

}
