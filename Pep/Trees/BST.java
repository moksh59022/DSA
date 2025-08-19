package Pep.Trees;

public class BST {
    public static class Node{
        int data;
        Node left;
        Node right;

        Node(int data, Node left,Node right){
            this.data=data;
            this.left=left;
            this.right=right;
        }
    }
    public static void display(BinaryTree.Node node){
        if(node==null) return;
        String str = "";
        str += node.left == null ? "." : node.left.data+"";
        str += " <- " + node.data + " -> ";
        str += node.right == null ? "." : node.right.data+"";
        System.out.println(str);

        display(node.left);
        display(node.right);

    }

    private static Node construct(int[] arr, int lo, int hi) {
        if (lo>hi) return null;

        int mid = (lo+hi)/2;
        int data = arr[mid];
        Node lc = construct(arr,lo,mid-1);
        Node rc = construct(arr,mid+1,hi);
        Node node = new Node(data,lc,rc);
        return node;
    }
    private static Node add(Node node,int data){
        if(node==null){
            return new Node(data,null,null);
        }
        if(data>node.data){
            node.right = add(node.right,data);
        } else if (node.data > data) {
            node.left=add(node.left,data);
        }
        else {

        }
        return node;
    }
    private static int max(Node node){
        if (node.right!=null){
            return max(node.right);
        }else {
            return node.data;
        }

    }
    private static Node remove(Node node,int data){
        if (node==null){
            return null;
        }
        if (data > node.data){
            node.right = remove(node.right,data);
        }
        else if (data < node.data){
            node.left = remove(node.left,data);
        }
        else {
            // work

            if (node.left != null && node.right != null){
                int lmax = max(node.left);
                node.data = lmax;
                node.left = remove(node.left,lmax);
                return node;
            }
            else if (node.left != null){
                return node.left;
            }
            else if (node.right != null){
                return node.right;
            }
            else {
                return null;
            }
        }
        return node;
    }
    static int sum = 0;
    private static void rwsol(Node node){
        if (node==null) return;
        rwsol(node.right);
        int od = node.data;
        node.data = sum;
        sum += od;
        rwsol(node.left);

    }
    public static boolean find(Node node,int data){
        if (node==null) return false;
        if(data>node.data) return find(node.right,data);
        else if (data < node.data) return find(node.left,data);
        else return true;
    }
    public static void travelAndPrint(Node root,Node node,int tar){
        if (node==null) return;
        travelAndPrint(root,node.left,tar);
        int comp = tar - node.data;
        if (node.data < comp) {
            if (find(root, comp)) {
                System.out.println(node.data + " " + comp);
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {12,25,37,50,62,75,87};
        Node root = construct(arr,0,arr.length-1);
    }

}
