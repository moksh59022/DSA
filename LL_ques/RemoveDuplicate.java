package LL_ques;

import java.util.Scanner;

class Node{
    Node next;
    int data;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class RemoveDuplicate {
    public static Node removeD(Node head){
        Node temp1 = head;
        Node temp2 = head.next;

        while (temp2!=null){
            if (temp1.data==temp2.data){
                temp2=temp2.next;
            }
            else {
                temp1.next=temp2;
                temp1=temp2;
                temp2=temp2.next;
            }
        }
        temp1.next=null;
        return head;
    }
    public static void print(Node head){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node head = null;
        Node temp = null;

        for (int i = 0; i < n; i++) {
            int data = sc.nextInt();
            Node newNode = new Node(data);

            if(head==null){
                head=newNode;
                temp=head;
            }
            else {
                temp.next=newNode;
                temp=newNode;
            }
        }
        removeD(head);
        print(head);
    }
}
