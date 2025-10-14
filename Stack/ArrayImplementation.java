package Stacks;

public class ArrayImplementation {
    static class Stack{
        int[] arr = new int[5];
        int top = 0;

        void push(int x){
            if(isFull()) {
                System.out.println("Stack is full");
                return;
            }
            arr[top] = x;
            top++;
        }
        void display(){
            for (int i = 0; i < top; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
        void pop(){
            if(isEmpty()){
                System.out.println("Stack is Empty");
                return;
            }
            arr[top-1] = 0;
            top--;
        }

        void peek(){
            if(isEmpty()){
                System.out.println("Stack is Empty");
                return;
            }
            System.out.println(arr[top-1]);
        }
        int size(){
            return top;
        }
        boolean isEmpty(){
            if(top == 0 ) return true;
            else return false;

        }
        boolean isFull(){
            if(top == arr.length) return true;
            else return false;
        }
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.peek();
        System.out.println(s.size());
        s.display();
        s.pop();
        s.display();
        s.pop();
        s.display();
        System.out.println(s.size());



    }
}
