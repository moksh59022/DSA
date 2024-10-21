package Arrays.Questions;

public class SumOfArray {
    public static void main(String[] args) {
        int[] a = {1,33,44,55,65,66,77};
        int sum = 0;
        int product = 1;
        for(int i = 0; i < a.length; i++) {
            sum = a[i]+sum;
            product = a[i]*product;
        }
        System.out.println(sum);
        System.out.println(product);
    }
}
