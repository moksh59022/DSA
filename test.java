public class test {
    public static void main(String[] args) {
       int[] arr = {2,3,6,3,8,3,2,6,2,4};
        System.out.println(firstIdx(arr,0,3));

        int[] ans = allIdx(arr,0,3,0);
        for (int ele : ans) System.out.print(ele+" ");
    }
    public static int firstIdx(int[] arr,int idx,int data){
        if(idx == arr.length) return -1;
        int a = firstIdx(arr,idx+1,data);
        if(arr[idx]==data) return idx;
        else return a;
    }

    public static int[] allIdx(int[] arr,int idx,int t,int s){

        if(idx==arr.length) return new int[s];

        if(arr[idx]==t){

          int[] carr = allIdx(arr,idx+1,t,s+1);
          carr[s] = idx;
          return carr;
        }else {
            int[] carr = allIdx(arr,idx+1,t,s);
            return carr;
        }
    }
}
