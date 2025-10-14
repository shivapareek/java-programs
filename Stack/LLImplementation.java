package Stacks;

class Node {
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class LLImplementation {
    Node head;
    int size = 0;
    void push(int x){
        Node newNode = new Node(x);
        newNode.next = head;
        head = newNode;
        size++;
    }
    int pop(){
        if(isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }
        int top = head.data;
        head = head.next;
        size--;
        return top;
    }
    int peek(){
        return head.data;
    }
    int size(){
        return size;
    }
    void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    boolean  isEmpty(){
        if(head==null) return true;
        else return false;

    }

    public static void main(String[] args) {
        LLImplementation l = new LLImplementation();
        l.push(1);
        l.push(2);
        l.push(3);
        l.push(4);
       l.push(5);
        System.out.println( l.peek());
        System.out.println(l.size());
        l.display();
        l.pop();
        l.display();
        l.pop();
        l.display();
        System.out.println(l.size());
    }
}

