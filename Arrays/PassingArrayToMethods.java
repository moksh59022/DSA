package Arrays;

public class PassingArrayToMethods {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40};
        System.out.println(arr[0]);

        chnge(arr);
        System.out.println(arr[0]);
    }
    public static void chnge(int[] x){
        x[0] = 20;
    }
}
