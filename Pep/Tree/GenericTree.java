package Pep.Tree;

import java.util.*;

public class GenericTree{

    public static class GenericTree2 implements Iterable<Integer> {
        GenericTree.Node root;

        GenericTree2(GenericTree.Node root) {
            this.root = root;
        }

        public Iterator<Integer> iterator() {
            Iterator<Integer> obj = new GTPreorderIterator(root);
            return obj;
        }
    }

    public static class GTPreorderIterator implements Iterator<Integer> {
        Integer nval;
        Stack<Pairs> st;
        public GTPreorderIterator(Node root) {
             st = new Stack<>();
             st.push(new Pairs(root,-1));
             next();
        }

        @Override
        public boolean hasNext() {
            if(nval==null) return false;
            else return true;
        }

        @Override
        public Integer next() {
            Integer fr = nval;
            // moves nval forward , if not possible sets it to null
            nval = null;
            while (st.size() > 0) {
                Pairs top = st.peek();
                if (top.state == -1) {
                    nval = top.node.data;
                    top.state++;
                    break;
                } else if (top.state >= 0 && top.state < top.node.children.size()) {
                    Pairs cp = new Pairs(top.node.children.get(top.state), -1);
                    st.push(cp);
                    top.state++;
                } else {
                    st.pop();
                }
            }

            return fr;
        }
    }
    static class Node {
        int data;
        ArrayList<Node> children = new ArrayList<>();
        Node(){}
        Node(int data){
            this.data = data;
        }

    }

    public static void display(Node root) {
        String str = root.data + " -> ";

        for (Node child : root.children) {
            str += child.data + ", ";
        }
        str += ".";
        System.out.println(str);

        for (Node child : root.children) {
            display(child);
        }
    }
    public static int size(Node root){
        int s = 0;

        for(Node child : root.children){
            s+=size(child);
        }
        return s+1;
    }
    public static int size2(Node root) {
        int s = 0;
        int childCount = 0;
        for (Node child : root.children) {
            childCount++;
            s++;               // count immediate children
        }
        for (Node child : root.children) {
            s += size(child);  // add sizes of subtrees
        }
        return s - childCount + 1;  // subtract immediate children once, add root node
    }

    public static int max(Node root){
        int max = Integer.MIN_VALUE;

        for(Node child : root.children){
            int cm = max(child);
            max = Math.max(max,cm);
        }
        max = Math.max(root.data,max);

        return max;
    }
    public static int height(Node root){
        int hmax = -1;
        for(Node child : root.children){
            int ch = height(child);
            hmax = Math.max(hmax,ch);

        }
        hmax++;
        return hmax;
    }
    public static void traversal(Node root){
        System.out.println("Node pre "+root.data);
        for (Node child : root.children){
            System.out.println("Edge pre "+root.data+"--"+child.data);
            traversal(child);
            System.out.println("Edge post"+root.data+" -- "+child.data);
        }
        System.out.println("Node post"+root.data);
    }
    public static void levelOrder(Node root){
        Queue<Node> q = new ArrayDeque<>();

        q.add(root);
        while (q.size()>0){
            root = q.poll();
            System.out.print(root.data+" ");
            for (Node child : root.children){
                q.add(child);
            }

        }
        System.out.println(".");

    }
    public static void levelOrderLineWise(Node root){
        Queue<Node> mq = new ArrayDeque<>();
        mq.add(root);

        Queue<Node> cq = new ArrayDeque<>();
        while(mq.size()>0){
            root = mq.remove();
            System.out.print(root.data+" ");

            for(Node child : root.children){
                cq.add(child);
            }
            if(mq.size()==0){
                mq = cq;
                cq = new ArrayDeque<>();
                System.out.println();
            }
        }
    }
    public static void levelOrderLineWise2(Node root){
        Queue<Node> mq = new ArrayDeque<>();
        mq.add(root);
        mq.add(new Node(-1));

        while(mq.size()>0){
            root = mq.remove();
            if(root.data != -1){
                System.out.print(root.data+" ");
                for(Node child : root.children){
                    mq.add(child);
                }
            }
            else {
                if(mq.size()>0){
                    mq.add(new Node(-1));
                    System.out.println();
                }
            }

        }
        System.out.println();

    }
    public static void levelOrderLineWise3(Node root){
        Queue<Node> mq = new ArrayDeque<>();
        mq.add(root);

        while(mq.size()>0){
            int cicl = mq.size();

            for (int i = 0; i < cicl; i++) {
                root = mq.remove();
                System.out.print(root.data + " ");

                for (Node child : root.children) {
                    mq.add(child);
                }
            }
            System.out.println();
        }
    }
    public static class Pair{
        Node node;
        int level;

        Pair(Node node,int level){
            this.node=node;
            this.level=level;
        }
    }

    public static void levelOrderLineWise4(Node root){
        Queue<Pair> mq = new ArrayDeque<>();
        Pair p = new Pair(root,1);
        mq.add(p);
        int level = 1;

        while (mq.size()>0){
            Pair a = mq.remove();
            if(a.level>level){
                level = a.level;
                System.out.println();
            }
            System.out.print(a.node.data+" ");
            for (Node child : a.node.children){
                Pair n = new Pair(child,a.level+1);
                mq.add(n);
            }
        }
    }
    public static void levelOrderZigZag(Node root){
        Stack<Node> ms = new Stack<>();
        ms.push(root);

        Stack<Node> cs = new Stack<>();
        int level = 1;
        while(ms.size()>0){
            root = ms.pop();
            System.out.print(root.data+" ");

            if(level%2==1){
                for (int i = 0; i < root.children.size(); i++) {
                    Node child = root.children.get(i);
                    cs.push(child);
                }
            }else {
                for (int i = root.children.size()-1; i >=0; i--) {
                    Node child = root.children.get(i);
                    cs.push(child);
                }
            }

            if(ms.size()==0){
                ms = cs;
                cs = new Stack<>();
                level++;
                System.out.println();
            }
        }
    }

    public static void mirror(Node root){
        for(Node child : root.children){
            mirror(child);
        }
        Collections.reverse(root.children);
    }

    public static void removeLeaf(Node root){
        for(int i = root.children.size()-1;i>=0;i--){
            Node child = root.children.get(i);
            if(child.children.size()==0){
                root.children.remove(child);
            }
        }

        for(Node child : root.children){
            removeLeaf(child);
        }
    }

    public static void linearize(Node root){
        for(Node child : root.children){
            linearize(child);
        }
        while (root.children.size()>1){
            Node lc = root.children.remove(root.children.size()-1);
            Node sl = root.children.get(root.children.size()-1);
            Node slt = getTail(sl);
            slt.children.add(lc);

        }
    }
    public static ArrayList<Integer> nodeToRootPath(Node root,int val){
        if(root.data==val){
            ArrayList<Integer> list  = new ArrayList<>();
            list.add(root.data);
            return list;
        }

        for (Node child : root.children){
            ArrayList<Integer> ptc = nodeToRootPath(child,val);
            if (ptc.size()>0){
                ptc.add(child.data);
                return ptc;
            }
        }
        return new ArrayList<>();
    }

    public static boolean find(Node root,int val){
        if(root.data==val) return true;

        for(Node child : root.children){
            boolean fic = find(child,val);
            if(fic) return true;
        }
        return false;
    }
    private static Node getTail(Node node){
        while (node.children.size()==1){
            node = node.children.get(0);
        }
        return node;
    }

    public static int lca(Node node ,int d1,int d2){
        ArrayList<Integer> p1 = new ArrayList<>();
        ArrayList<Integer> p2 = new ArrayList<>();

        int i = p1.size()-1;
        int j = p2.size()-1;

        while (i>=0 && j>=0 && p1.get(i)==p2.get(j)){
            i--;j--;
        }

        i++;
        j++;
        return p1.get(i);
    }
    public static int distBtwNodes(Node node ,int d1,int d2){
        ArrayList<Integer> p1 = new ArrayList<>();
        ArrayList<Integer> p2 = new ArrayList<>();

        int i = p1.size()-1;
        int j = p2.size()-1;

        while (i>=0 && j>=0 && p1.get(i)==p2.get(j)){
            i--;j--;
        }

        i++;j++;
        return i+j;
    }

    public static boolean areSimilar(Node a,Node b){
        if(a.children.size()!=b.children.size()) return false;

        for (int i = 0; i < a.children.size(); i++) {
            Node c1 = a.children.get(i);
            Node c2 = b.children.get(i);
            if (areSimilar(c1,c2)==false) return false;
        }
        return true;
    }
    public static boolean areMirror(Node a,Node b){
        if(a.children.size()!=b.children.size()) return false;

        for (int i = 0; i < a.children.size(); i++) {
            int j = a.children.size()-1-i;
            Node c1 = a.children.get(i);
            Node c2 = b.children.get(j);
            if (!areMirror(c1,c2)) return false;
        }
        return true;
    }

    public static boolean IsSymmetric(Node node){
        return areMirror(node,node);
    }

    static Node predecessor;
    static Node successor;
    static int state;

    public static void PredecessorAndSuccessor(Node node ,int data){
        if (state==0){
            if (node.data==data){
                state = 1;
            }
            else {
                predecessor = node;
            }
        }
        else {
            successor=node;
            state=2;
        }

        for (Node child : node.children){
            PredecessorAndSuccessor(child,data);
        }
    }

    static int ceil;
    static int floor;
    private static void ceilAndFloor(Node node,int data){
        if(node.data>data){
           if (node.data<ceil){
               ceil = node.data;
           }
        }
        if(node.data<data){
            if (node.data>floor){
                floor = node.data;
            }
        }
        for (Node child : node.children){
            ceilAndFloor(child,data);
        }
    }

    public static int kthLargest(Node node,int k){
        floor = Integer.MIN_VALUE;
        int factor = Integer.MAX_VALUE;
        for (int i = 0; i < k; i++) {
            ceilAndFloor(node,factor);
            factor = floor;
            floor = Integer.MIN_VALUE;
        }
        return factor;
    }
    static int msn = 0;
    static int ms = Integer.MIN_VALUE;

    public static int retSumAndCalculateMSST(Node node){
        int sum = 0;

        for (Node child : node.children)
        {
            int csum = retSumAndCalculateMSST(child);
            sum += csum;
        }

        sum += node.data;

        if (sum > ms){
            msn = node.data;
            ms = sum;
        }
        return sum;
    }

    static int dia = 0;
    public static int calculateDiaReturnHeight(Node node){
        int dch = -1;
        int sdch = -1;

        for (Node child : node.children){
            int ch = calculateDiaReturnHeight(child);
            if (ch > dch){
                sdch = dch;
                dch = ch;
            }
            else if(ch > sdch){
                sdch = ch;
            }
        }
        int cand = dch + sdch + 2;
        if(cand > dia){
            dia = cand;
        }
        return dch;
    }
    static class Pairs{
        Node node;
        int state;
        Pairs(Node node,int state){
            this.node=node;
            this.state=state;
        }
    }
    public static void IterativePreAndPostOrder(Node node){
        Stack<Pairs> st = new Stack<>();
        st.push(new Pairs(node,-1));
        String pre = "";
        String post = "";

        while (st.size() > 0){
            Pairs top = st.peek();
            if (top.state == -1){
                pre += top.node.data+" ";
                top.state++;
            } else if (top.state == top.node.children.size()) {
                post += top.node.data;
                st.pop();
            }
            else {
                Pairs cp = new Pairs(top.node.children.get(top.state),-1);
                st.push(cp);

                top.state++;
            }
        }
        System.out.println(pre);
        System.out.println(post);

    }
    public static void main(String[] args) {
        int[] arr = {
                10,
                20, 50, -1, 60, -1, -1,
                30, 70, -1, 80, 110, -1, 120, -1, -1, 90, -1, -1,
                40, 100, -1, -1, -1
        };

        Node root = null;
        Stack<Node> st = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == -1) {
                st.pop();
            } else {
                Node t = new Node();
                t.data = arr[i];

                if (!st.isEmpty()) {
                    st.peek().children.add(t);
                } else {
                    root = t;
                }

                st.push(t);
            }
        }

        // Optional: Add a print to verify tree construction
        System.out.println("Tree constructed with root: " + root.data);
//        display(root);
//        System.out.println(size(root));
//        System.out.println(max(root));
//        System.out.println(height(root));
//        traversal(root);
//        levelOrder(root);
        levelOrderLineWise(root);
        System.out.println();
        levelOrderLineWise2(root);

        System.out.println();
        levelOrderLineWise3(root);
        System.out.println();
        levelOrderLineWise4(root);
//        levelOrderZigZag(root);
//        Node a = new Node();
//        System.out.println(a.data);
        System.out.println();
        System.out.println();
//        mirror(root);
//        display(root);
//        System.out.println();
//        System.out.println();
//        removeLeaf(root);
//        display(root);
//
//        GenericTree2 gt = new GenericTree2(root);
//        for (int val : gt){
//            System.out.println(val);
//        }
//
//
//        Iterator<Integer> gti = gt.iterator();
//        while (gti.hasNext()==true){
//            System.out.println(gti.next());
//        }
    }
}
