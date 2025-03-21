package Brown;
//quest -> Permutation Sequence
import java.util.*;
class Permutation{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.print(getPermutation(n,k));

    }

    public static String getPermutation(int n,int k){
        List<Integer> nums = new ArrayList<>();

        int fact = 1;
        for(int i = 1;i<=n;i++){
            fact *= i;
            nums.add(i);
        }

        k--;
        StringBuilder result = new StringBuilder();

        for(int i =0;i<n;i++){
            fact /= (n-i);
            int index = k / fact;
            result.append(nums.get(index));
            nums.remove(index);
            k%=fact;
        }

        return result.toString();


    }
}