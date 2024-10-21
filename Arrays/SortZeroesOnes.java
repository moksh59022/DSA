package Arrays;

public class SortZeroesOnes {
    public static void main(String[] args) {
        int[] arr = {1,0,0,1,1,1,1,1,0,0};
        int noOfZeroes = 0;
        int n = arr.length;
//        for (int i = 0; i < n; i++) {
//            if(arr[i]==0) {
//                noOfZeroes++;
//            }
//            }
//        for (int i = 0; i < n; i++) {
//            if(i<noOfZeroes){
//                arr[i]=0;
//            }
//            else{
//                arr[i] = 1;
//            }
//        }
//        for (int ele:arr){
//            System.out.print(ele+" ");
//        }
        int i = 0,j=n-1;

        while (i<j){
            if(arr[i]==0) i++;
           else if (arr[j]==1) j--;
             else   if(arr[i]==1&&arr[j]==0){
                arr[i] = 0;
                arr[j] = 1;
                i++;
                j--;
            }
        }
        for (int ele:arr){
            System.out.print(ele+" ");
        }
    }
}
