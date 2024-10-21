package BinarySearch;

public class bs {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
         int  n = arr.length;
         int i = 0,j=n-1;
         int target = -1;
         boolean flag = false;
         while (i<=j){
             int mid = (i+j)/2;
             if (arr[mid]<target){
                 i=mid+1;
             } else if (arr[mid] > target) {
                 j=mid-1;
             } else if (arr[mid] == target) {
                 flag=true;
                 break;
             }
         }
         if(flag==true) System.out.println("element present");
         else System.out.println("not present");
    }
}
