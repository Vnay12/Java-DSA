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

package DataStructure;

// Implementing Stacks using static Array ( Fixed Size )
class ArrayStack {
    public int[] arr;
    public int capacity;
    public int top;

    public ArrayStack(int cap)
    {
        this.capacity = cap;
        arr = new int[capacity];
        this.top = -1;
    }

    public void push(int x)
    {
        if (isFull())
        {
            throw new RuntimeException("Stack Overflow");
        }
        top++;
        arr[top] = x;
    }

    public int pop()
    {
        if (isEmpty())
        {
            throw new RuntimeException("Stack Underflow");
        }
        top--;
        return arr[top];

    }


    public int peek()
    {
        if (isEmpty())
        {
            throw new RuntimeException("Stack is empty");

        }
        return arr[top];
    }

    public int size()
    {
        return top + 1;
    }

    public boolean isFull()
    {
        return top == capacity - 1;
    }

    public boolean isEmpty()
    {
        return top == -1;
    }

}

public class StacksDS {


    public static void main(String[] args)
    {
        ArrayStack stack = new ArrayStack();
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.pop();

    }

}
