package Linked_List;
class SLL{
    Node head;
    Node tail;
    int size;
    void insertAtEnd(int val){
        Node temp = new Node(val);
        if(head==null) head=tail=temp;
        else{
            tail.next=temp;
            tail=temp;
        }
        size++;

    }
    void insertAtHead(int val){
        Node temp = new Node(val);
        if(head==null) head=tail=temp;
        else {
            temp.next=head;
            head=temp;
        }
        size++;
    }

    void insert(int idx , int val){
       if(idx==0){
           insertAtHead(val);
           return;
       }
       if (idx==size){
           insertAtEnd(val);
           return;
       }
       if (idx>size || idx<0){
           System.out.println("Invalid index");
           return;
       }


        Node temp = new Node(val);
        Node x = head;
        for (int i = 1;i<=idx-1;i++){
            x=x.next;
        }

        temp.next=x.next;
        x.next=temp;
        size++;

    }

    int get(int idx)throws Error{
        if(idx==size-1){
            return tail.val;
        }
        if(idx>size||idx<0){
            throw new Error("Invalid index");
        }
        Node temp = head;
        for (int i = 1; i <=idx; i++) {
            temp=temp.next;
        }
        return temp.val;
    }


    void set(int idx , int val)throws Error{
        if(idx == size - 1){
            tail.val=val;
        }
        if(idx>=size||idx<0){
            throw new Error("Invalid idx");
        }
        Node temp = head;
        for (int i = 0; i < idx; i++) {
            temp=temp.next;
        }
        temp.val=val;
    }

    void deleteAtHead()throws Error{
        if (head==null) throw new Error("List is Empty");
        head=head.next;
        size--;
    }


    void delete(int idx)throws Error{
        if (idx==0){
            deleteAtHead();
            return;
        }
        if(head==null)throw new Error("List is Empty");
        if(idx>=size||idx<0)throw new Error("Invalid index");
        Node temp = head;
        for (int i = 0; i < idx - 1; i++) {
            temp=temp.next;
        }
        if (temp.next==tail) tail=temp;
        temp.next=temp.next.next;
        size--;
    }

    void display(){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
   void  size(){
       System.out.println(size);
   }


}
public class Implementation {

    public static void main(String[] args) {
         SLL list = new SLL();
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);
        list.insertAtEnd(50);
        list.insertAtEnd(60);

        list.display();

        list.insertAtEnd(24);

        list.display();

        list.insertAtHead(50);
//        list.insert(-1,10000);
        list.display();
        list.size();

//        System.out.println(list.get(47));

        list.deleteAtHead();
        list.display();

        list.delete(2);

        list.display();



    }
}
