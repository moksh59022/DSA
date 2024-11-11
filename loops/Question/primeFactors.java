package loops.Question;

public class primeFactors {
    public static void main(String[] args) {
        int n = 14545245;

        for (int div = 2; div*div<=n; div++) {
            while (n%div==0){
                n=n/div;
                System.out.print(div+" ");
            }
        }
        if (n!=1){
            System.out.println(n);
        }
    }
}
