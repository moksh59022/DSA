package Brown;

//ques -> next greater element 1

import java.util.*;

class nge{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int[] nums1 = new int[m];
        for(int i = 0;i<m;i++){
            nums1[i] = sc.nextInt();
        }

        int n = sc.nextInt();
        int[] nums2 = new int[n];
        for(int i = 0;i<n;i++){
            nums2[i] = sc.nextInt();
        }


        int[] res = nextGreaterElement(nums1,nums2);
        for(int ele : res){
            System.out.print(ele+" ");
        }

    }

    public static int[] nextGreaterElement(int[] nums1,int[] nums2){
        int n = nums1.length;
        int[] res = new int[n];
        Stack<Integer> st = new Stack<>();
        HashMap<Integer,Integer> map = new HashMap<>();


        for(int i =0;i<nums2.length;i++){
            while(!st.isEmpty() && st.peek()<nums2[i]){
                map.put(st.pop(),nums2[i]);
            }
            st.push(nums2[i]);
        }

        for(int i : st){
            map.put(i,-1);
        }

        for(int i =0;i<n;i++){
            res[i] = map.get(nums1[i]);
        }

        return res;
    }

}
