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
        - Sorted List ( Hashset Method )
        - Sorted List Optimised ( Two pointer Method )
        - Unsorted List ( Naive approach nested Loop )
        - Unsorted List ( Hashset Method )

5) Search
    a) Find the length of Linked List
    b) Find Nth Node from End
    c) Find Middle node ( Tortoise & Hare Algorithm )

6) Reserve
    a) Iterative
    b) Recursive

8) Find Palindrome

 */


package DataStructure;


import java.util.HashSet;

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


    static Node insertAtEnd(Node head, int value)
    {
        Node curr = new Node(value);
        Node P = head;
        if (head == null)
        {
            return curr;
        } else
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

    public static Node insertBeforeKey(Node head, int value, int key)
    {
        Node newNode = new Node(value);
        Node p = head;

        // Case 1: Handles insertion into an empty list
        if (head == null)
        {
            System.out.println("Linked List is empty");
            return null;
        }
        // Handle insertion when the key is the head node
        if (head.value == key)
        {
            newNode.next = head;
            return newNode;
        }
        // Traverse until the next node is null ( end of list ) or the next node's value is key
        while (p.next != null && p.next.value != key)
        {
            p = p.next;
        }
        // to Evaluate which while condition was satisfied
        if (p.next == null)
        {
            System.out.println(" Key Node was not found ");
        } else
        {
            newNode.next = p.next;
            p.next = newNode;
        }


        return head;
    }
    /*
    Approach: Inserting Node Before Key Value
    Time Complexity: O(N)
    Space Complexity: O(1)

    Bound Checks:
    1) Empty List
    2) If the first node itself is the key
    3) Traverse the whole list until the end of list, or we found the key

    Note:
    1) Write the main logic first ( while loop ) and then check bounds

    */

    public static Node insertAfterKey(Node head, int value, int key)
    {
        Node newNode = new Node(value);
        Node p = head;

        // Case 1: Handles insertion into an empty list
        if (head == null)
        {
            System.out.println("Linked List is empty");
            return null;
        }

        // Traverse until the next node is null ( end of list ) or the next node's value is key
        while (p != null && p.value != key)
        {
            p = p.next;
        }
        // to Evaluate which while condition was satisfied
        if (p == null)
        {
            System.out.println(" Key Node was not found ");
        } else
        {
            newNode.next = p.next;
            p.next = newNode;
        }
        return head;
    }
    /*
    Approach:Inserting Node after key value
    Time Complexity: O(N)
    Space Complexity: O(1)

    Bound Checks:
    1) Empty List
    2) Traverse the whole list until the end of list, or we found the key

    Note:
    1) Write the main logic first ( while loop ) and then check bounds

    */

    public static Node deleteAtBegin(Node head)
    {

        if (head == null)
        {
            System.out.println("Linked List is empty");
            return null;
        } else if (head.next == null)
        {
            head = null;

        } else
        {
            head = head.next;
        }

        return head;
    }
    /*
    Approach:Delete at Begin
    Time Complexity: O(1)
    Space Complexity: O(1)

    Bound checks:
    1) If List is empty
    2) If only 1 node present
    */


    public static Node deleteAtEnd(Node head)
    {
        Node p = head;
        if (head == null)
        {
            System.out.println("Linked List is empty");
            return null;
        } else if (head.next == null)
        {
            head = null;

        } else
        {
            while (p.next.next != null)
            {
                p = p.next;
            }
            p.next = null;

        }

        return head;
    }
    /*
    Approach:Delete Node At End
    Time Complexity: O(N)
    Space Complexity: O(1)

    Bound Check:
    1) If List is empty
    2) If only 1 node present
    */

    public static Node deleteBeforeKey(Node head, int key)  // This is left
    {
        Node T = null;
        Node P = head;

        if (P == null || P.next == null)
        {
            System.out.println("Linked List is empty");
            return head;
        } else
        {
            T = head.next;
        }
        // This is for bound check of 1st node
        if (P.value == key)
        {
            System.out.println("This is the first node of linked list");
            return head;
        } else
        {

            while (T != null && T.value != key)
            {
                T = T.next;
                P = P.next;
            }
            if (T == null)
            {
                System.out.println("Element was not found and exit");
                return head;
            } else
            {
                P.next = T.next;
            }
        }

        return head;
    }

    // This is removing Duplicate from sorted list using Hashset
    public static Node deleteDuplicatesSortedList(Node head)
    {
        if (head == null || head.next == null)
        {
            return head;

        }

        HashSet<Integer> set = new HashSet<>();
        set.add(head.value);
        Node curr = head.next;
        Node prev = head;


        while (curr != null)
        {
            if (set.contains(curr.value))
            {
                prev.next = curr.next;
            } else
            {
                set.add(curr.value);
                prev = curr;
            }
            curr = curr.next;
        }

        return head;
    }
    /*
    Approach:Deleting Duplicates and keeping first occurrence - Hashset Method
    Time Complexity: O(N)
    Space Complexity: O(N)


    */


    // This is removing duplicate from sorted list and keeping first occurrence
    public static Node deleteDuplicatesSortedListOptimised(Node head)
    {
        if (head == null || head.next == null)
        {
            return head;
        }
        Node prev = head;
        Node curr = head.next;
        while (curr != null)
        {
            if (curr.value == prev.value)
            {
                prev.next = curr.next;

            } else
            {
                prev = curr;
            }
            curr = curr.next;
        }

        return head;
    }
    /*
    Approach:Removing Duplicate from Sorted list Optimised - Two Pointer Approach
    Time Complexity: O(N)
    Space Complexity: O(1)
    */


    //This is Removing Duplicate and keeping First Occurrence But Larger Time Complexity
    public static Node deleteDuplicateUnsortedList(Node head)
    {
        Node curr = head;
        while (curr != null)
        {
            Node t = curr;
            while (t.next != null)
            {

                if (t.next.value == curr.value)
                {
                    t.next = t.next.next;
                } else
                {
                    t = t.next;
                }
            }
            curr = curr.next;
        }
        return head;
    }
    /*
    Approach: Delete Duplicate Unsorted - Nested For Loop
    Time Complexity: O(N^2)
    Space Complexity: O(1)
    */

    // This is Remove Duplicate and Keeping First Occurrence Optimised
    public static Node deleteDuplicateUnsortedListOptimised(Node head)
    {
        Node curr = null;
        Node prev = null;
        if (head == null || head.next == null)
        {
            return head;
        }
        HashSet<Integer> set = new HashSet<>();
        set.add(head.value);
        curr = head.next;
        prev = head;


        while (curr != null)
        {
            if (set.contains(curr.value))
            {
                // duplicate -> remove curr, prev stays the same
                prev.next = curr.next;
                curr = curr.next;
            } else
            {
                // unique -> keep curr, add to set and advance prev
                set.add(curr.value);
                prev = curr;
                curr = curr.next;
            }
        }


        return head;
    }
    /*
    Approach:Delete Duplicates in Unsorted Linked List Using HashSet
    Time Complexity: O(N)
    Space Complexity: O(N)

    Note: We use Hashset hence it will have extra space
    Note: If memory is the issue, and we want it in constant time then sort the linked list and then remove duplicates
    TC: O(N logN)
    SC: O(1)
    */


    // Finding the middle Node of linked list ( iterative Method )
    public static int middleLinkedListIterative(Node head){
        Node temp = head;
        Node ans = head;
        int count =0;
        while (temp != null){
            count += 1;
            temp = temp.next;

        }
        int middle = (count / 2 );
       for (int i =0; i<middle; i++){
           ans = ans.next;
       }
        return ans.value;
    }
    /*
    Approach:Finding Middle Node of LinkedList - Iterative Method
    Time Complexity: O(N)
    Space Complexity: O(1)
    */


    // Finding the middle element of linked List ( Tortoise - Hare Method )
    public static int middleLinkedList(Node head){
        if (head == null || head.next == null || head.next.next == null){
            return 0;
        }

        Node curr = head;
        Node fast = head.next.next;
        while (fast != null)
        {
            curr = curr.next;
            fast = fast.next.next;
        }

        return curr.value;
    }

    // This is reversing the linked list using iterative method
    public static Node reverseLinkedList(Node head)
    {
        if (head == null || head.next == null)
        {
            return head;
        }

        Node curr = head;
        Node prev = null;
        Node front = head.next;

        while (front != null)
        {
            curr.next = prev;
            prev = curr;
            curr = front;
            front = front.next;
        }
        curr.next = prev;


        return curr;
    }
    /*
    Approach:Reversing the LinkedList - Iterative Method
    Time Complexity: O(N)
    Space Complexity: O(1)
    */


    public static void reverseLinkedListRecursive(Node head){
        if(head == null ){

            return ;
        }
        reverseLinkedListRecursive(head.next);
        System.out.println(head.value);

    }



    public static void main(String[] args)
    {
        int key = 20;
        int answer ;
        Node head = new Node(10);

        // Creating Simple Linked List
        head.next = new Node(40);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        head.next.next.next.next.next = new Node(60);
        head.next.next.next.next.next = new Node(50);

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

        System.out.println();
        System.out.println("Linked List After Inserting Node Before " + key);
        head = insertBeforeKey(head, 55, key);
        printLinkedList(head);

        System.out.println();
        System.out.println("Linked List After Inserting Node After " + key);
        head = insertAfterKey(head, 99, key);
        printLinkedList(head);

        System.out.println();
        System.out.println("Linked List After Delete At begin");
        head = deleteAtBegin(head);
        printLinkedList(head);

        System.out.println();
        System.out.println("Linked List After Delete At End");
        head = deleteAtEnd(head);
        printLinkedList(head);

        System.out.println();
        System.out.println();
        printLinkedList(head);
        System.out.println("Linked List After Deleting Duplicate from Sorted List");
        head = deleteDuplicatesSortedList(head);
        printLinkedList(head);

        System.out.println();
        System.out.println();
        printLinkedList(head);
        System.out.println("Linked List After Deleting Duplicate from Sorted List Optimised");
        head = deleteDuplicatesSortedListOptimised(head);
        printLinkedList(head);

        System.out.println();
        System.out.println();
        printLinkedList(head);
        System.out.println();
        System.out.println("Linked List After Deleting Duplicate from Unosorted List");
        head = deleteDuplicateUnsortedList(head);
        printLinkedList(head);

        System.out.println();
        System.out.println();
        printLinkedList(head);
        System.out.println();
        System.out.println("Linked List After Deleting Duplicate from Unosorted List Optimised");
        head = deleteDuplicateUnsortedListOptimised(head);
        printLinkedList(head);

        System.out.println();
        System.out.println();
        printLinkedList(head);
        System.out.println();
        System.out.println("Linked List After Reversing Using Iterative Method");
        head = reverseLinkedList(head);
        printLinkedList(head);

        System.out.println();
        System.out.println();
        printLinkedList(head);
        System.out.println();
        System.out.println("Finding middle element using iterative method");
        answer = middleLinkedListIterative(head);
        System.out.println(answer);

    }

}
