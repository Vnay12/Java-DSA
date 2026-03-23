package DataStructure.Temp;

public class stackds {
    static class Stack {
        int[] arr;
        int maxcapacity;
        int top;

        public Stack(int cap)
        {
            this.maxcapacity = cap;
            arr = new int[cap];
            top = -1;

        }

        void push(int key)
        {
            if (top == maxcapacity - 1)
            {
                System.out.println("Stack Overflow !! key cannot be pushed");
            } else
            {
                top++;
                arr[top] = key;
            }
        }

        void pop(){
            if(top == -1 ){
                System.out.println("Stack Underflow");
            }
            else
            {
                top --;
            }
        }

        int peek(){
            if(top == -1){
                System.out.println("Stack is empty");
                return -1;
            }

            return  arr[top];
        }
    }

        public static void main(String[] args)
        {
            Stack mystack = new Stack(5);
            mystack.push(4);
            int ans = mystack.peek();
            System.out.println(ans);

        }
    }
