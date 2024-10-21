package Arrays;

import java.util.Arrays;

public class BuiltInMethod {
    public static void main(String[] args) {
        int[] arr = {10,200,60,750,99,87};
        for (int x:arr){
            System.out.print(x+" ");
        }
        System.out.println();
        Arrays.sort(arr);
        for (int x : arr){
            System.out.print(x+" ");
        }
    }
}
