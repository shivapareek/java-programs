package LinkedList;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class SinglyLinkedList {
    Node head;

    public void insertAtBeginning(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void insertAtEnd(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next!=null){
            current = current.next;
        }
        current.next = newNode;
    }

    public void insertAtPosition(int data,int pos){
        Node newNode = new Node(data);

        if(pos == 1){
            insertAtBeginning(data);
            return;
        }
        Node current = head;
        for (int i = 1; i < pos-1 && current!=null ; i++) {
            current = current.next;
        }
        if (current == null){
            System.out.println("Position out of Bounds");
            return;
        }
        newNode.next = current.next;
        current.next = newNode;

    }

    public void deleteAtBeginning(){
        if (head == null){
            System.out.println("List is Empty");
            return;
        }
        head = head.next;
    }
    public void deleteAtEnd(){
        if (head == null){
            System.out.println("List is Empty");
            return;
        }
        if(head.next == null){
            head = null;
            return;
        }
        Node current = head;
        while (current.next.next!=null){
            current = current.next;
        }
        current.next = null;
    }

    public void deleteAtPosition(int pos){
        if (head == null){
            System.out.println("List is Empty");
            return;
        }
        if(pos == 1){
            head = head.next;
            return;
        }
        Node current = head;
        for (int i = 1; i < pos-1 && current!=null; i++) {
            current = current.next;
        }
        if(current == null || current.next == null){
            System.out.println("Position out of Bounds");
            return;
        }
        current.next = current.next.next;
    }
    public void printdata(){
        Node current = head;
        while (current!=null){
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println("null");
    }
    public int search(int key){
        if (head == null){
            System.out.println("List is Empty");
            return -1;
        }
        Node current = head;
        int pos =1;
        while (current!= null){
            if(key == current.data){
                return pos;
            }
            current = current.next;
            pos++;
        }
        return -1;
    }
    public int length(){
        Node current = head;
        int count=0;
        while (current!= null){
            current = current.next;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        System.out.println(list.length());
        list.insertAtBeginning(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(50);
        list.insertAtPosition(40,3);

        list.printdata();
        System.out.println(list.length());

        list.deleteAtBeginning();
        list.deleteAtEnd();
        list.deleteAtPosition(1);
        list.printdata();
        System.out.println(list.length());

        System.out.println(list.search(20));


    }
}
