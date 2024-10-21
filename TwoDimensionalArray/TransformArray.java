package TwoDimensionalArray;

public class TransformArray {
    public static void print(int[] arr){
        for (int i = 0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {177,29,16,5,88,99,7};
        int n = arr.length;
          print(arr);
        System.out.println();
          int x = 0;
        for (int i = 0; i <n; i++) {
            int min = Integer.MAX_VALUE;
            int mindx = -1;
            for (int j = 0; j < n; j++) {
                 if(arr[j]<min && arr[j]>0){
                     min = arr[j];
                     mindx = j;
                 }

            }
            arr[mindx] = x;
            x--;
        }
        // for each loop cannot modify element
//        for (int ele : arr){
//            ele *=-1;
//        }
//        print(arr);

        for (int i = 0; i < n; i++) {
            arr[i]*=-1;
        }

        print(arr);
    }
}
