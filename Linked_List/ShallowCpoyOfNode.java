package Linked_List;

public class ShallowCpoyOfNode {
    public static void main(String[] args) {
        Node a = new Node(100);
        Node temp = a;  // shallow copy
//        Node temp = new Node(a.val); //deep copy
        System.out.println(a);
        System.out.println(temp);
    }
}
