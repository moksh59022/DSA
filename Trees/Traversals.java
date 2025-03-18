package Trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Traversals {
    public static class Pair{
        Node node;
        int level;
        Pair(Node node ,int level){
            this.node=node;
            this.level=level;
        }

    }
    static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);

        a.left=b;a.right=c;
        b.left=d;b.right=e;
        c.left=f;c.right=g;

        preorder(a);
        System.out.println();
        inorder(a);
        System.out.println();
        postorder(a);
        System.out.println();
        levelOrder(a);
        System.out.println("Enter n : ");
//         n = sc.nextInt();
        nThLevel(a,0,2);
        System.out.println();

        for (int x = 0; x < 3; x++) {
            nThLevel(a,0,x);
            System.out.println();
        }

    }
    private static void nThLevel(Node root,int level,int lvl){
        if (root==null) return;
        if (level==n) System.out.print(root.val+" ");
        nThLevel(root.left,level+1,lvl);  // left subtree
        nThLevel(root.right,level+1,lvl); // Right subtree
    }


    private static void levelOrder(Node root){
        int prevlevel = 0;
        Queue<Pair> q = new LinkedList<>();
        if (root!=null) q.add(new Pair(root,0));
        while (q.size()>0){
            Pair front = q.remove();
            Node temp = front.node;
            int lvl = front.level;
            if (lvl!=prevlevel){
                System.out.println();
                prevlevel++;
            }
            System.out.print(temp.val+" ");
            if (temp.left!=null)q.add(new Pair(temp.left,lvl+1));
            if (temp.right!=null)q.add(new Pair(temp.right,lvl+1));
        }
        System.out.println();
    }
    private static void preorder(Node root){
        if (root==null) return;
        System.out.print(root.val+" ");
        preorder(root.left);  // left subtree
        preorder(root.right); // Right subtree
    }

    private static void inorder(Node root){
        if (root==null) return;
        inorder(root.left);  // left subtree
        System.out.print(root.val+" ");
        inorder(root.right); // Right subtree
    }
    private static void postorder(Node root){
        if (root==null) return;
        postorder(root.left);  // left subtree
        postorder(root.right); // Right subtree
        System.out.print(root.val+" ");

    }
}
