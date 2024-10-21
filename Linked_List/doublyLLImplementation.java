package Linked_List;
class dNode{
    int val;
    dNode next;
    dNode prev;
    dNode(int val){
        this.val= val;
    }
}
class DLL {
    dNode head;
    dNode tail;
    int size;

    void display() {
        dNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();

    }
    void insertEnd(int val){
        dNode temp = new dNode(val);
        if (size==0) head=tail=temp;
      else {
            tail.next = temp;
            temp.prev = tail;
            tail = temp;
        }
      size++;
    }
    void insertHead(int val){
        dNode temp = new dNode(val);
        if (size==0) head=tail=temp;
        temp.next=head;
        head.prev=temp;
        head=temp;

        size++;
    }
    void insert(int idx,int val){
        if(idx==0) {
            insertHead(val);
            return;
        }
        if(idx==size){
            insertEnd(val);
            return;
        }
        if(idx<0||idx>size){
            System.out.println("invalid index");
            return;
        }
        dNode temp = new dNode(val);
        dNode x = head;
        for (int i = 0; i < idx - 1; i++) {
            x=x.next;
        }
        dNode y = x.next;
        x.next=temp;
        temp.prev=x;
        temp.next=y;
        y.prev=temp;
        size++;

    }
    void deleteHead() throws Error{
        if (head==null) throw new Error("Empty Linked List");
        head=head.next;
        head.prev=null;
        size--;
    }
    void deleteTail() throws Error{
        if(head==null) throw new Error("Empty Linked List");
        tail = tail.prev;
        tail.prev=null;
        size--;

    }
    void delete(int idx , int val) throws Error{
        if(head==null) throw new Error("Linked list Empty");
        if(idx==0) {
            deleteHead();
            return;
        }
        if (idx==size-1) {
            deleteTail();
            return;
        }
        if (idx<0||idx>size) {
            throw new Error("Invalid index");
        }
        dNode temp = head;
        for (int i = 1; i <= idx-1; i++) {
              temp=temp.next;
        }
        temp.next=temp.next.next;
        temp=temp.next;
        temp.prev=temp.prev.prev;
        size--;

    }
}

public class doublyLLImplementation {
    public static void print(dNode head){
        dNode temp = head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void printReverse(dNode tail){
        dNode temp = tail;
        while (temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.prev;
        }

        System.out.println();
    }
    public static void printRandom(dNode node){
        dNode temp = node;
        while (temp.prev!=null){
            temp=temp.prev;
        }
        print(temp);
    }
    public static void main(String[] args) {
        dNode a = new dNode(10);
        dNode b = new dNode(20);
        dNode c = new dNode(30);
        dNode d = new dNode(40);
        a.next=b; b.prev=a;
        b.next=c; c.prev=b;
        c.next=d; d.prev=c;
        print(a);
        printReverse(d);
        printRandom(c);


        DLL list = new DLL();
        list.display();
        list.insertEnd(10);
        list.insertEnd(20);
        list.insertEnd(30);
        list.insertEnd(40);
        list.display();
        list.insertEnd(50);
        list.display();
        list.insertHead(55);
        list.display();
        System.out.println(list.size);
        list.insert(2,411);
        list.display();
        list.deleteHead();
        list.display();
        list.deleteTail();
        list.display();




    }
}
