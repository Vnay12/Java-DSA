/*
Problem
You are given an array A of length N.  You take an array B of length N such that B[i] = 0 for each 1 <= i <= N. You can apply the following operation on B any number of times:

Choose (N - 1) distinct indices and add 1 to each of those indices.
Task

Find the number of operations required to convert array B into array A by applying the given operation. Print -1 if it is impossible to do so.

Function description

Complete the function solve() provided in the editor. This function takes the following two parameters and returns the required answer:

N: Represents the length of array A.
A: Represents the array A.
Input format

Note: This is the input format that you must use to provide custom input (available above the Compile and Test button).

The first line contains T, denoting the number of test cases. T also specifies the number of times you have to run the solve function on a different set of inputs.
For each test case:
The first line contains N, denoting the size of array A.
The second line contains N space-separated integers A[1], A[2], ....., A[N], denoting the elements of  array A.
Output format
For each test case, print the number of operations required to convert array B into array A by applying the given operation or -1 if it is impossible to do so.

Constraints

1 <= T <= 10^4
2 <= N <= 10^5
0 <= Ai <= 10^9

Sum of N over all test cases doen not exceed 2.10^5

input 

2
3
3 1 0
2
0 2


output 

-1
2


 */

 /*

arr1[5]

arr2[5]

arr2[i] = 0 
for ( 1 <= i <= 5)
i = 1 2 3 4 5 




 */
public class MakeAnArray {

    public static void main(String[] args) {

    }
}
