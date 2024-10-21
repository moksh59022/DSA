package Arrays.Questions;

public class MaxNo {
    public static void main(String[] args) {
        int[] arr = {1,9,-99,-77,8687};
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
//           if (arr[i]>max){
//             max=arr[i];
//           }
            max = Math.max(max,arr[i]);
        }

        int smx = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {

               if (arr[i]>smx && arr[i]!=max ) smx = arr[i];
//            if(arr[i]!=max){
//                smx = Math.max(smx,arr[i]);
//            }
        }
        System.out.println(smx);

        System.out.println(max);
    }
}
