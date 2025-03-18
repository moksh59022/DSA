package Arrays;

public class Kadane {
    public static void main(String[] args) {
        int[] arr = {1,-3,4,-2,0,8};
        int max = Integer.MIN_VALUE,sum=0;
        for(int i = 0;i<arr.length;i++){
            sum+=arr[i];
            if(sum>max) max=sum;
            if(sum<0) sum=0;
        }
        System.out.println(max);
    }
}
