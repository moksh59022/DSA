package Linked_List;
class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;

    }
}
public class ListNode {
    public static void print(Node head){
        while (head!=null){
            System.out.println(head.val);
            head=head.next;
        }
    }
    public static void displayREC(Node head){
        if(head==null) return;
        System.out.println(head.val);
        displayREC(head.next);
    }
    public static void main(String[] args) {
        Node a = new Node(10);
//        System.out.println(a);
//        System.out.println(a.val);
//        System.out.println(a.next);

        Node b = new Node(50);
//        System.out.println(b);
//        System.out.println(b.val);

//        a.next=b;
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(a.next);
//        System.out.println(b.next);
        Node c = new Node(60);
        Node d = new Node(30);
        Node e = new Node(70);

          a.next=b; // 10->20
          b.next=c; //10->20->30
          c.next=d;  // 10->20->30->40
          d.next=e;  // 10->20->30->40->50
//        System.out.println(a.val);
//        System.out.println(a.next.val);
//        System.out.println(a.next.next.val);
//        System.out.println(a.next.next.next.val);
//        System.out.println(a.next.next.next.next.val);

//        Node temp = a;
//        temp=temp.next;
//        System.out.println(temp.val);
         print(a);
         displayREC(a);
    }
}
