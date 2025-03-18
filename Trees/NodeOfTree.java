package Trees;

class Node{
    int val;
    Node left;
    Node right;

    Node(int val){
        this.val=val;
    }
}
public class NodeOfTree {
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(41);
        Node c = new Node(3);
        Node d = new Node(2);
        Node e = new Node(6);
        Node f = new Node(5);

        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.right = f;

        Node g = new Node(10);
        Node h = new Node(20);
        c.left = g;e.right=h;

//        a.left = null;

        display(a);

        System.out.println();
        System.out.println(sum(a));
        System.out.println(max(a));
        System.out.println(min(a));
        System.out.println(size(a));
        System.out.println(level(a));

//        e.val=90;
//        a.left.right.val=55;
//        System.out.println(e.val);
//        System.out.println(a.left.right.val);


    }
    private static int sum(Node root){
        if (root==null) return 0;
        return root.val+sum(root.left)+sum(root.right);
    }
    private static int size(Node root){
        if (root==null) return 0;
        return 1+size(root.left)+size(root.right);
    }
    private static int level(Node root){
        if (root==null) return 0;
        return 1+Math.max(level(root.left),level(root.right));
    }
    private static int max(Node root){
        if (root==null) return Integer.MIN_VALUE;
        return Math.max(root.val,Math.max(max(root.left),max(root.right)));
    }
    private static int min(Node root){
        if (root==null) return Integer.MAX_VALUE;
        return Math.min(root.val,Math.min(min(root.left),min(root.right)));
    }


    private static void display(Node root){
        if (root==null){
            return;
        }
        System.out.print(root.val+" ");
        display(root.left);  // left subtree
        display(root.right); // Right subtree
    }
}
