package Pep.Trees;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTree {
    public static class Node{
        int data;
        Node left;
        Node right;

        Node(int data,Node left,Node right){
            this.data=data;
            this.left=left;
            this.right=right;
        }
    }
    public static class Pair{
        Node node;
        int state;
        Pair(Node node,int state){
            this.node=node;
            this.state=state;
        }
    }
    public static void display(Node node){
        if(node==null) return;
        String str = "";
        str += node.left == null ? "." : node.left.data+"";
        str += " <- " + node.data + " -> ";
        str += node.right == null ? "." : node.right.data+"";
        System.out.println(str);

        display(node.left);
        display(node.right);

    }

    public static int size(Node node){
        if (node==null) return 0;

        int ls = size(node.left);
        int rs = size(node.right);

        return ls+rs+1;
    }

    public static int sum(Node node){
        if (node==null) return 0;
        int lsm = sum(node.left);
        int rsm = sum(node.right);

        return lsm+rsm+node.data;
    }

    public static int max(Node node){
        if (node==null) return Integer.MIN_VALUE ;
        int lm = max(node.left);
        int rm = max(node.right);
        int tm = Math.max(node.data,Math.min(lm,rm));
        return tm;
    }
    public static int height(Node node){
        if (node==null) return -1;

        int lh = height(node.left);
        int rh = height(node.right);

        int th = Math.max(lh,rh)+1;
        return th;
    }

    public static void levelOrder(Node node){
        Queue<Node> pq = new ArrayDeque<>();

        pq.add(node);

        while (pq.size()>0){
            int count = pq.size();
            for (int i = 0; i < count; i++) {
                node = pq.remove();
                System.out.print(node.data+" ");

                if (node.left!=null){
                    pq.add(node.left);
                }
                if (node.right!=null){
                    pq.add(node.right);
                }
            }
            System.out.println();
        }
    }

    public static void iterativePrePosIn(Node node){
        Stack<Pair> st = new Stack<>();
        Pair rtp = new Pair(node,1);
        st.push(rtp);
        String pre = "";
        String post = "";
        String in = "";
        while (st.size()>0){
            Pair top = st.peek();
            if (top.state == 1){
               pre += top.node.data + " ";
               top.state++;

               if (top.node.left != null){
                   Pair lp = new Pair(top.node.left,1);
                   st.push(lp);
               }
            }
            else if (top.state==2){
                in += top.node.data + " ";
                top.state++;

                if (top.node.right != null){
                    Pair rp = new Pair(top.node.right,1);
                    st.push(rp);
                }
            }
            else {
                post += top.node.data;
                st.pop();
            }
        }
    }
    static ArrayList<Integer> path;
    public static boolean find(Node node,int data){
        if (node==null) return false;
        if (node.data==data){
            path.add(node.data);
            return true;
        }

        boolean filc = find(node.left,data);
        if (filc){
            path.add(node.data);
            return true;
        }

        boolean firc = find(node.right,data);
        if (firc){
            path.add(node.data);
            return true;
        }

        return false;
    }
    public static void printKLevelsDown(Node node,int k){
        if (node==null || k<0) return;
        if (k==0) System.out.println(node.data);

        printKLevelsDown(node.left,k-1);
        printKLevelsDown(node.right,k-1);
    }

    public static void main(String[] args) {
        Integer[] arr = {50,25,12,null,null,37,30,null,null,null,75,62,null,70,null,null,87,null,null};

        Node root = new Node(arr[0],null,null);
        Pair rtp = new Pair(root,1);

        Stack<Pair> st =new Stack<>();
        st.push(rtp);

        int idx = 0;

        while (st.size() > 0){
            Pair top = st.peek();
            if(top.state==1){
                idx++;
                if (arr[idx]!=null){
                    Node ln = new Node(arr[idx],null,null);
                    top.node.left = ln;

                    Pair lp = new Pair(ln,1);
                    st.push(lp);
                }
                else {
                    top.node.left = null;
                }
                top.state++;
            } else if (top.state == 2) {
                idx++;
                if (arr[idx]!=null){
                    Node rn = new Node(arr[idx],null,null);
                    top.node.right = rn;

                    Pair rp = new Pair(rn,1);
                    st.push(rp);
                }
                else {
                    top.node.left = null;
                }
                top.state++;
            }else {
                st.pop();
            }
        }
        display(root);
    }
}
