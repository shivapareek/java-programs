package LinkedList;

class DNode{
    DNode prev;
    DNode next;
    int data;
    DNode(int data){
        this.prev = null;
        this.next = null;
        this.data = data;
    }
}
public class DoublyLinkedList {
        DNode head;
        public void display(){
            DNode temp = head;
            while (temp!=null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        public void displayback(){
            if (head == null) return;
            DNode temp = head;
            while (temp.next!=null){
                temp = temp.next;
            }
            while (temp != null){
                System.out.print(temp.data + " ");
                temp = temp.prev;
            }
            System.out.println();

        }
    public void insertatStart(int data){
        DNode newNode = new DNode(data);
        if(head==null){
            head = newNode;
        }else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void insertatend(int data){
            DNode temp = head;
        if (head == null) {
            insertatStart(data);
            return;
        }
            while (temp.next!=null){
                temp = temp.next;
            }
            DNode newNode = new DNode(data);
            temp.next = newNode;
            newNode.prev = temp;
    }

    public void insertAtPos(int pos,int data){
            DNode temp = head;
            if (pos == 1 ){
                insertatStart(data);
                return;
            }
        for (int i = 1; i < pos-1; i++) {
            temp = temp.next;
        }
        DNode r = temp.next;
        DNode a = new DNode(data);
        temp.next = a;
        a.prev = temp;
        a.next = r;
        r.prev = a;

    }
    public void deleteatstart(){
        if (head == null) return;
        if (head.next == null) {
            head = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }
    public void deleteatend(){
        if (head == null) return;
        if (head.next == null) {
            head = null;
            return;
        }
            DNode temp = head;
            while (temp.next.next!=null){
                temp = temp.next;
            }
            temp.next = null;
    }
    public void deleteatpos(int pos){
        if (head == null) return;
        if (pos == 1) {
            deleteatstart();
            return;
        }
            DNode temp = head;
        for (int i = 1; i < pos-1; i++) {
            temp = temp.next;
        }
        if (temp == null || temp.next == null) return; // invalid pos
        temp.next = temp.next.next;
        if (temp.next != null) {
            temp.next.prev = temp;
        }
    }
    public int search(int key){
            DNode temp = head;
            int i=1;
            while (temp!=null){
                if(temp.data == key){
                    return i;
                }
                temp = temp.next;
                i++;
            }
            return -1;
    }
    public static void main(String[] args) {
        DoublyLinkedList dl = new DoublyLinkedList();
        dl.insertatStart(30);
        dl.insertatStart(20);
        dl.insertatStart(10);
        dl.insertatend(40);
        dl.insertAtPos(3,25);
        dl.display();
        dl.deleteatstart();
        dl.display();
        dl.deleteatend();
        dl.display();
        dl.deleteatpos(2);
        dl.display();
        dl.displayback();
        int val = dl.search(20);
        System.out.println(val);



    }

}
