/*
This is Stack DataStructure
It is a linear DS that Last In First OUT Principle

Real World Example
1) Website ( Previous Button or Forward Button )
2) Undo Button
3) Call Logs or Message Logs are stored in Stack
4) Recursion
5) Parentheses Checking etc

Stack can be implemented in 2 DS
1) Fixed Size Stack
- Static Array

2) Dynamic Size Stack
- LinkedList
- ArrayList / Vector

Common Operations on Stack
1) Push
2) Pop
3) Top
4) isEmpty
5) Size
 */

package DataStructure.Stacks;


public class StacksDS {


    // Implementing Stacks using static Array ( Fixed Size )
    static class ArrayStack {
        public int[] arr;
        // 'maxCapacity' now holds the fixed, usable size of the array allocated.
        // It prevents the stack from growing beyond its allocated memory.
        public int maxCapacity;

        // 'top' is the index of the element at the top of the stack.
        public int top;

        // The constructor establishes the fixed size of the stack.
        public ArrayStack(int size)
        {
            // For a Fixed Size Stack, we must decide the final array length up front.
            // We use the input 'size' to determine the actual max capacity.
            if (size <= 10)
            {
                arr = new int[10]; // Allocate space for 10
                this.maxCapacity = 10;
            } else
            {
                arr = new int[20]; // Allocate space for 20
                this.maxCapacity = 20;
            }
            this.top = -1; // Stack is initially empty
        }

        public int size()
        {
            // The number of elements currently in the stack.
            return top + 1;
        }

        public boolean isFull()
        {
            // Corrected: Checks if 'top' has reached the last valid index of the allocated array.
            return top == this.maxCapacity - 1;
        }

        public boolean isEmpty()
        {
            // Corrected: Checks if the stack is empty.
            return top == -1;
        }


        public void push(int x)
        {
            if (isFull())
            {
                throw new RuntimeException("Stack Overflow: Cannot push element " + x);
            }
            top++;
            arr[top] = x;
        }

        public int pop()
        {
            // Fixed: Check if the stack is empty first.
            if (isEmpty())
            {
                throw new RuntimeException("Stack Underflow: Cannot pop from empty stack");
            }

            // FIX 1: Retrieve the value at the current top index first (LIFO).
            int value = arr[top];

            // FIX 2: Then, logically remove the element by decrementing the top pointer.
            top--;

            return value;
        }


        public int peek()
        {
            // Fixed: Check if the stack is empty first.
            if (isEmpty())
            {
                throw new RuntimeException("Stack is empty: Cannot peek");

            }
            // Peek only returns the value without changing 'top'.
            return arr[top];
        }


        public void printStack()
        {
            System.out.println("\n--- Stack Contents (Bottom to Top) ---");
            if (isEmpty()) {
                System.out.println("Stack is empty.");
                return;
            }
            for (int i = 0; i <= top; i++)
            {
                System.out.println(arr[i]);
            }
            System.out.println("------------------------------------");
        }

    }


    public static void main(String[] args)
    {
        // Creates a stack with a max capacity of 10
        ArrayStack stack = new ArrayStack(15);

        System.out.println("Max Capacity: " + stack.maxCapacity);
        System.out.println("1. Pushing 4, 5, 6, 7...");
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);

        System.out.println("2. Current Top (Peek): " + stack.peek()); // Should be 7

        System.out.println("3. Popping one element (should be 7)...");
        int poppedValue = stack.pop();
        System.out.println("   Popped value: " + poppedValue);

        System.out.println("4. Current Top after pop: " + stack.peek()); // Should be 6

        stack.printStack();

    }

}
