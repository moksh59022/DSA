package BinarySearch;

public class UpperBound {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,6,8,9};
        int  n = arr.length;
        int target = 10;
        int i = 0,j=n-1;
        int ub =  n;

        while (i<=j){
            int mid = i +(j-i)/2;
            if (arr[mid]>target){
                ub = Math.min(mid, ub);
                j=mid-1;
            }
            else i=mid+1;
        }
        System.out.println(ub);
    }

}
