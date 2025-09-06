# **Java Behind the scene**

                   javoc
Code (.java file ) -----> Bytecode -----> Exe Code
                    O/P             JVM


.java file  --->  javac  --->  .class file
- javac is the Java compiler. It converts human-readable high-level code into platform-independent bytecode.

JVM:
- Loads the .class file.
- Performs bytecode verification (security & correctness checks).
- Interprets bytecode line-by-line initially.
- Monitors which parts of the code run frequently ("hot spots").

JIT (Just-In-Time compiler):
- Part of the JVM's Execution Engine.
- Compiles hot code sections into native machine code at runtime.
- Boosts performance by running these sections directly on the CPU.


NOTE: Every other will compile code's output to exe code for performance but its magic of java due to which it is platform independent
Write Once Run anywhere ]



// Java Syntax

public class (file name) {
    public static void main(String[] args) {
        
    }
}




// Data Type

Fixed Sized irrespective of compiler/platform
byte --> 1 bytes / 8 bits
short --> 2 bytes / 16 bits
int --> 4 bytes / 32 bits
long  --> 8 bytes / 64 bits 

float --> 4 bytes / 32 bits 
double --> 8 bytes / 32 bits ( by default )

char --> 2 bytes / 16 bit ( its a unsigned char and supports Unicode unlike any other language )

Note: Java does not support unsigned so its first block will be MSB ]







//Java All Package import 

import java.io.*;  
import java.util.*;   // Mainly used 








// Taking input and Showing Output

Scanning

Scanner sc = new Scanner(system.in)
String name = sc.nextLine();
int x = sc.nextInt();
float x = sc.nextFloat();
double x = sc.nextDouble();


Note: Scanner is inside the class util 

Printing 

System.out.print(" ")
System.out.println(" ")






// Variable

1) Instance Variable : Vaiable that are declared in class outside any method 
   
2) Local Variable : Within the block ( Function ) or method  Note: Even Main is a function 
   
3) Static Variable : Also known as class variable. They are declared using static variable within the class outside the method or function vlock 







// Class 

class (Class name){

    // declare instance varibale 

    type var1;
    type var2;

    // declare methods

    type method(){

    }
}


Define: 

(Class name ) (Object name ) = new ( Class name ) 

 






 // Access Modifiers in Java ( OOPS )









// Functions & Methods 

Functions are block of code and when it is written inside a class it is called Method


In java everything is call by value 
when we pass the value in the function, copy of the reference variable is passed which will create another varible which is pointing to same object and change in the formal variable wont cause change in the actual variable 


For Primitive Datatype


class test {

    public static void change(int n) {
        n = 1999;
    }

    public static void main(String[] args) {
        int x = 10;
        change(x);
        System.out.println(x);
    }
}



Note: For primitive Datatype value itself is copy and another object of value is created 

       
x -->      10
       2000 20004

n -->      10
       4000 40004


Another value is created and change in the formal parameter wont change the actual parameter 




For Object Type

class test {

    public static void change(int[] n) {
        n[0] = 1999;
    }

    public static void main(String[] args) {
        int x[] = {10,2,3,4,5};
        change(x);
        System.out.println(x);
    }
}


Note: For object reference, copy of reference variable which has address of its object is made 

x ----> 10       2      3     .....
        2000    2004    2008

Because for array name of the variable is a constant pointer to its 1st object hence just x will have the value 2000
passing value x to method means giving address to first pointer 

n----> 2000

now n is also pointing to array object, here change in the formal parameter can change the actual parameter 





Variable Arguments in method 

If we don't know how many arguments to be passed we can do this by 

Class test{
    static void fun(int ...v){    // by ... we can pass multiple arguments, Internally it uses array.

    }
    
    public static void main(String[] args){

    }

}




Function Overloading 

Note: same function name but different arguments are called function overloading 

public static fun(int a, int b){

}

public static fun(String b, int c){

}




// Arrays


Syntax

1) For primitive
 
int[] arr = new int[5];

or

int[] arr = {, , , };

2) For Objects 

String[] str = new String[4];


Note: For Primitive Datatype, array will be continuous but for objects, object reference are stored in continuous but object itself can be stored in anywhere coz in java heap is not continous 

arr ----> 2      4     5      6
         2000  2004  2012   2016

str ----> str[0]  str[1]   str[2]  str[3]   // This is stored continuous but object can be stored anywhere 
           2000    4000    9000     1000




To print 


1) For loop

for(int i =0; i<arr.length; i++){
    sout(arr[i]);
}


2) For each

for(int nums : arr ){
    sout(nums);
}


3) toString

sout(Arrays.toString(arr))




// 2D Array 

Initialization 

int[][] arr;
arr = new int[1][2];


TO Print

1) To get the size of row 
   
   arr.length;

2) To get the size of column 


   arr[0].length;   

3) To Print

for(int i = 0; i < arr.length; i++ ){
    for(int j =0; j< arr[0].length; j++){
        sout(arr[i][j]);
    }
}


or 

for(int i = 0; i < arr.length; i++ ){
    for(int j =0; j< arr[i].length; j++){
        sout(arr[i][j]);
    }
}


Note: Why 2nd method because if the 2d array is jagged like this 

int[][] arr = {
    {1, 2, 3},
    {4, 5},
    {6, 7, 8, 9}
};

then arr[0].length will always be 3 hence its better with 2 method 


or 

sout(Arrays.deeptoString(arr));

Note: Best one line way to print 



// Algorithm 


𝗟𝗶𝗻𝗲𝗮𝗿 𝗦𝗲𝗮𝗿𝗰𝗵

1) first we have to take array input 
2) get the key element from the user 
3) Iterat thru array if key == arr[element ] then return 1 or return 0
4) coming to main scope if ans is 1 then print element is present or else 



Code:
 
import java.util.*;

public class LS {

    public static int Linearsearch(int[] arr, int key, int size) {
        for (int i = 0; i < size; i++) {
            if (key == arr[i]) {
                return i;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int x;
        try {
            System.out.println("Enter the key");
            x = sc.nextInt();
            System.out.println("Enter the array");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println(Arrays.toString(arr));
            int ans = Linearsearch(arr, x, arr.length);

            if (ans == -1) {
                System.out.println("Element was not found");
            } else {
                System.out.println("Element was found at index " + ans);
            }

        } finally {
            sc.close();
        }

    }
}


𝗕𝗶𝗻𝗮𝗿𝘆 𝗦𝗲𝗮𝗿𝗰𝗵


/*
1) Array should be sorted 
2) if duplicate elements are there it depends on your approach 
 */

import java.util.Arrays;

public class BinarySearch {

    static int BS(int[] arr, int key, int left, int right) {              // This is iterative Methood 
        while (left <= right) {
            int middle = (left + right) / 2;
            if (arr[middle] == key) {
                return middle;
            } else if (key < arr[middle]) {
                right = middle - 1;

            } else {
                left = middle + 1;
            }

        }
        return -1;
    }

    /*
    Approach: Binary Search
     Time Complexity: O(Log N)
     Space Complexity: O(1)
     */

    static int RecursiveBS(int[] arr, int key, int left, int right) {     // This is Recursive Method 
        int middle = (left + right) / 2;

        if (right < left) {
            return -1;
        }

        if (arr[middle] == key) {
            return middle;
        } else if (key < arr[middle]) {
            return RecursiveBS(arr, key, left, middle - 1);

        } else {
            return RecursiveBS(arr, key, middle + 1, right);
        }

    }

    /*
    Approach: Recursive Binary Search
     Time Complexity: O(Log N)
     Space Complexity: O(Log N)
     */


    public static int BuiltinBS(int[] arr, int key) {
        return Arrays.binarySearch(arr, key);

    }

    /*
     Approach: Builtin Binary Search ( same as ordinary Binary search )
     Time Complexity: O(Log N)
     Space Complexity: O(1)
     */

     
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6, 7};
        int key = 6;
        int left = 0;
        int right = arr.length - 1;

        int ans = BS(arr, key, left, right);
        int ans2 = BuiltinBS(arr, key);
        int ans1 = RecursiveBS(arr, key, left, right);

        if (ans == -1) {
            System.out.println("element not found");

        } else {
            System.out.println("element is at index" + ans);
        }

    }
}




// EXTRA


Random Number Fill

java.util.Random
random.nextInt(starting, ending)


Sorting 

java.utils.Arrays
Arrays.sort(array_name)


Math.min & Math.max

Math.min(int1, int2) // Provide 2 int/double/long
Math.max(int1, int2) // Provide 2 int/double/long

can use it with arrays as well 


Math.min(temp_varible, arr[i]) // 
Math.max(temp_variable, arr[i]) // 



