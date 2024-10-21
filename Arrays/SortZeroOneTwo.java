package Arrays;

public class SortZeroOneTwo {
    public static void main(String[] args) {
        int[] arr = {1,2,1,2,1,2,0,0,0,0,0};
        int n = arr.length;
        int no0 = 0 , no1=0;
//        for (int i = 0; i < n; i++) {
//            if(arr[i]==0) no0++;
//            if(arr[i]==1) no1++;
//
//        }
//        for (int i = 0; i < n; i++) {
//            if (i<no0) arr[i]=0;
//            else if(i<no0+no1) arr[i]=1;
//            else arr[i]=2;
//        }
//        for(int ele:arr){
//            System.out.print(ele+" ");
//        }

        // dutch flag algo
        int mid = 0, hi = n-1, lo = 0;
        while (mid<=hi){
            if(arr[mid]==0){
                int temp = arr[mid];
                arr[mid] = arr[lo];
                arr[lo] = temp;
                lo++; mid++;
            }
            else if (arr[mid]==1) {
                mid++;

            }
            else {// arr[mid]==2;
                int temp = arr[mid];
                arr[mid] = arr[hi];
                arr[hi]=temp;
                hi--;
            }
        }
        for (int ele:arr){
            System.out.print(ele+" ");
        }
    }
}
