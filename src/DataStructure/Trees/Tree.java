/*
This is Tree Code with Operations:

1) Implementing Tree Using LinkedList ( Creating Structure and Tree )
2) Counting Leaf Node, Total Node, Internal Node
3) Counting Height of the Tree

 */

package DataStructure.Trees;

public class Tree {

    static public class Node {

        Node left;
        int val;
        Node right;


        // Constructor for Tree
        Node(int value)
        {
            this.left = null;
            this.val = value;
            this.right = null;
        }


    }

    // Counting Leaf Nodes in Tree Using Recursion
    static public int LeafNodes(Node p)
    {
        if (p == null)
            return 0;
        if (p.right == null && p.left == null)
            return 1;
        else
            return (LeafNodes(p.left) + LeafNodes(p.right));


    }
    /*
    Approach:Counting Leaf Node using Recursion
    Time Complexity: O(n)
    Space Complexity: O(n)
    */


    // Counting Internal Nodes in Tree using Recursion
    static public int InternalNodes(Node p)
    {
        if (p == null)
            return 0;
        if (p.right == null && p.left == null)
            return 0;
        else
            return (1 + InternalNodes(p.left) + InternalNodes(p.right));
    }
    /*
    Approach:Counting Internal Node using Recursion
    Time Complexity: O(n)
    Space Complexity: O(n)
    */


    // Counting Total Nodes in Tree using Recursion
    static public int TotalNodes(Node p)
    {
        if (p == null)
            return 0;
        if (p.right == null && p.left == null)
            return 1;
        else
            return (1 + TotalNodes(p.left) + TotalNodes(p.right));
    }
    /*
    Approach:Counting Total Node using Recursion
    Time Complexity: O(n)
    Space Complexity: O(n)
    */

    // Max Function

    static public int max(int a, int b)
    {
        if (a > b)
            return a;
        else
            return b;
    }

    // Counting Height of Tree using Recursion
    static public int Height(Node p)
    {
        if (p == null)
            return 0;
        if (p.right == null && p.left == null)
            return 1;
        else
            return (1 + max(Height(p.left), Height(p.right)));
    }
    /*
    Approach:Counting Height of Tree using Recursion
    Time Complexity: O(n)
    Space Complexity: O(n)
    */


    public static void main(String[] args)
    {
        Node Root = new Node(15);
        Node first = new Node(20);
        Node second = new Node(30);
        Node third = new Node(40);
        Node fourth = new Node(60);
        Node five = new Node(70);
        Node six = new Node(80);

        Root.left = first;
        Root.right = second;
        first.left = third;
        first.right = fourth;
        second.left = five;
        second.right = six;

        // we can do like this also

        six.left = new Node(120);
        six.right = new Node(150);


        int ans = LeafNodes(Root);
        System.out.println(ans);

        int ans2 = InternalNodes(Root);
        System.out.println(ans2);

        int ans3 = TotalNodes(Root);
        System.out.println(ans3);

        int ans4 = Height(Root);
        System.out.println(ans4);
    }
}
