/*
This is singly Linked List Code and Basics Operations:

1) Creating Node and Linked List

2) Traverse and Print Values
    a) Iterative - (printLinkedList)
    b) Recursive

3) Insertion:
    a) At Start
    b) At End
    c) At Specific Position
        - After Key Value
        - Before Key Value

4) Delete:
    a) At Start
    b) At End
    c) At Specific Position
        - Before Key Value
        - After Key Value
    d) Delete Duplicates

5) Search
    a) Find Nth Node from End
    b) Find Middle node ( Tortoise & Hare Algorithm )

6) Reserve
    a) Iterative
    b) Recursive

8) Find Palindrome

9) Find Length of Linked List

 */


package DataStructure;


public class LinkedList {

    // User Defined class for Linked List
    static class Node {

        int value;
        Node next;

        // Constructor
        Node(int value)
        {
            this.value = value;
            this.next = null;

        }

    }


    static void printLinkedList(Node head)
    {
        Node P = head;
        while (P != null)
        {
            System.out.print(P.value + " ---> ");
            P = P.next;
        }
        System.out.print("END");
    }
    /*

    Approach: This is Iterative Method
    Time Complexity: O(N)
    Space Complexity: O(1)

     */

    // Recursive Method is Left//

    static Node insertAtBegin(Node head, int value)
    {
        Node curr = new Node(value);
        if (head == null)
        {
            return curr;
        } else
        {
            curr.next = head;
        }
        return curr;
    }
    /*
    Approach: Insert At Beginning
    Time Complexity: O(1)
    Space Complexity: O(1)

    Bound Checks:
    1) if Linked List is empty -> We did if condition check

    */


    static Node insertAtEnd(Node head, int value){
        Node curr = new Node(value);
        Node P = head;
        if (head==null){
            return curr;
        }
        else
        {
            while (P.next != null)
            {
                P = P.next;
            }
            P.next = curr;
            return head;
        }
    }
    /*
    Approach: Insert at END
    Time Complexity: O(N)
    Space Complexity: O(1)

    Bound Check :
    1) If List is Empty --> we have if condition to manage that

    Note:
    1) We can use Tail Pointer which will help us to Insert with O(1) Time Complexity
        Tail Pointer are useful for 'End' Operations - Insert at end, Delete at end.
    */

    

    public static void main(String[] args)
    {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        System.out.println("Original Linked List Before any Changes");
        printLinkedList(head);

        System.out.println();
        System.out.println("Linked List After Inserting Node at start");
        head = insertAtBegin(head, 5);
        printLinkedList(head);

        System.out.println();
        System.out.println("Linked List After Inserting Node at end");
        head = insertAtEnd(head, 55);
        printLinkedList(head);

    }

}
