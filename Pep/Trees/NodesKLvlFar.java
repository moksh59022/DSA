package Pep.Trees;

import java.util.ArrayList;

public class NodesKLvlFar {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data,Node left,Node right){
            this.data=data;
            this.left = left;
            this.right = right;

        }
    }
    static ArrayList<Node> path;
    public static boolean find(Node node,int data){
        if (node==null) return false;
        if (node.data==data) return true;

        boolean filc = find(node.left,data);
        if (filc){
            path.add(node);
            return true;
        }
        boolean firc = find(node.right,data);
        if (firc){
            path.add(node);
            return true;
        }
        return false;
    }

    public static void printKLevelDown(Node node,int k,Node blocker){
        if (node==null || k<0 || node==blocker){
            return;
        }
        if (k==0){
            System.out.println(node.data);
        }
        printKLevelDown(node.left,k-1,blocker);
        printKLevelDown(node.right,k-1,blocker);
    }

    public static void printKNodesFar(Node node,int data,int k){
        path = new ArrayList<>();
        find(node,data);

        for (int i = 0; i < path.size(); i++) {
            printKLevelDown(path.get(i),k-i,i == 0 ? null : path.get(i-1));
        }
    }
    public static Node createLeftCloneTree(Node node){
        if (node==null){
            return null;
        }
        Node lcr = createLeftCloneTree(node.left);
        Node rcr = createLeftCloneTree(node.right);

        Node nn = new Node(node.data,lcr,null);
        node.left=nn;
        node.right=rcr;
        return nn;
    }
    public static void pathToLeafFromRoot(Node node,String path,int sum,int lo,int hi){
        if (node==null) return;
        if (node.left==null && node.right==null){
            sum += node.data;
            if (sum>=lo && sum<=hi){
                System.out.println(path+node.data);
            }
            return;
        }
        pathToLeafFromRoot(node.left,path+node.data+" ",sum+node.data,lo,hi);
        pathToLeafFromRoot(node.right,path+node.data+" ",sum+node.data,lo,hi);

    }
    public static void main(String[] args) {

    }
}
