/**
 * Implementation of a Stack data structure using an ArrayList.
 * The stack follows the Last-In, First-Out (LIFO) principle.
 */
package DataStructure.Stacks;

import java.util.ArrayList;
import java.util.EmptyStackException; // Recommended for standard stack behavior

public class ArrayListStack {

    // The ArrayList holds the stack elements.
    // The end of the list (highest index) is considered the 'top' of the stack.
    private ArrayList<Integer> arr;

    /**
     * Constructor to initialize the stack.
     */
    public ArrayListStack() {
        this.arr = new ArrayList<>();
    }

    // --- Core Stack Operations ---

    /**
     * Adds an element to the top of the stack (end of the list).
     * Time Complexity: O(1) (Amortized)
     * @param x The integer to be pushed onto the stack.
     */
    public void push(int x) {
        arr.add(x);
    }

    /**
     * Removes and returns the element at the top of the stack (end of the list).
     * Time Complexity: O(1)
     * @return The integer popped from the stack.
     * @throws EmptyStackException if the stack is empty.
     */
    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        // In modern Java (21+), arr.removeLast() is the cleanest way.
        // For older versions, use: arr.remove(arr.size() - 1);
        return arr.removeLast();
    }

    /**
     * Returns the element at the top of the stack without removing it.
     * Time Complexity: O(1)
     * @return The integer at the top of the stack.
     * @throws EmptyStackException if the stack is empty.
     */
    public int peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return arr.get(arr.size() - 1);
    }

    // --- Utility Operations ---

    /**
     * Checks if the stack is empty.
     * Time Complexity: O(1)
     * @return true if the stack contains no elements, false otherwise.
     */
    public boolean isEmpty() {
        return arr.isEmpty();
    }

    /**
     * Returns the number of elements in the stack.
     * Time Complexity: O(1)
     * @return The size of the stack.
     */
    public int size() {
        return arr.size();
    }

    /**
     * Prints the contents of the stack from bottom to top.
     * Time Complexity: O(n)
     */
    public void printStack() {
        System.out.println("Stack (Bottom -> Top): " + arr.toString());
    }

    // --- Main Method for Demonstration ---

    public static void main(String[] args) {
        // Instantiate the stack object (OOP format)
        ArrayListStack stack = new ArrayListStack();

        System.out.println("Is stack empty? " + stack.isEmpty()); // Output: true

        System.out.println("\n--- Pushing elements ---");
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.printStack();

        System.out.println("Is stack empty? " + stack.isEmpty()); // Output: false
        System.out.println("Stack size: " + stack.size());        // Output: 4

        System.out.println("\n--- Peeking ---");
        System.out.println("Top element (peek): " + stack.peek()); // Output: 7
        stack.printStack(); // Stack remains unchanged

        System.out.println("\n--- Popping elements ---");
        System.out.println("Popped: " + stack.pop()); // Output: 7
        stack.printStack(); // Stack: [4, 5, 6]

        System.out.println("Popped: " + stack.pop()); // Output: 6
        stack.printStack(); // Stack: [4, 5]

        // Uncomment the following lines to test the EmptyStackException:
        // System.out.println("Popped: " + stack.pop());
        // System.out.println("Popped: " + stack.pop());
        // System.out.println("Popped: " + stack.pop()); // Throws EmptyStackException
    }
}