⁡⁣⁣⁢// Java ⁡⁣⁣⁢Behind the scene⁡

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


[⁡⁢⁣⁢NOTE⁡: Every other will compile code's output to exe code for performance but its magic of java due to which it is platform independant
Write Once Run anywhere ]




⁡⁣⁣⁢// Java Syntax⁡

public class (file name) {
    public static void main(String[] args) {
        
    }
}




⁡⁣⁣⁢// Data Type⁡

Fixed Sized irrespective of compiler/pltform
byte --> 1 bytes / 8 bits
short --> 2 bytes / 16 bits
int --> 4 bytes / 32 bits
long  --> 8 bytes / 64 bits 

float --> 4 bytes / 32 bits 
double --> 8 bytes / 32 bits ( by default )

char --> 2 bytes / 16 bit ( its a unsigned char and supports unicode unlike any other language )

[⁡⁢⁣⁢Note⁡: Java does not support unsigned so its first block will be MSB ]





⁡⁣⁣⁢// Class ⁡

class (Class name){

    // declare instance varibale 

    type var1;
    type var2;

    // declare methods

    type method(){

    }
}


⁡⁣⁢⁣Define: ⁡

(Class name ) (Object name ) = new ( Class name ) 

 
