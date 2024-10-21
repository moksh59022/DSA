package BasicSorting;

public class InsertionSort {

        public static void print(int arr[]){
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]+" ");
            }

        }
        public static void swap(int arr[],int i,int j ){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        public static void main(String[] args) {
            int[] arr = {10,20,55,-1,5,-4};
            int n = arr.length;
            print(arr);
            System.out.println();

            // insertion sort
//            for (int i = 1; i < n; i++) {  // n-1 passes
//
//                for (int j = i; j >=1; j--) {
//
//                    if (arr[j] < arr[j-1]) {
//                        swap(arr,j,j-1);
//
//                    }
//                    else break;
//                }
//
//
//
//            }
//            print(arr);

               // insertion sort

            for(int i = 0; i < n; i++) {
                int j = i;
                while (j>=1 && arr[j]<=arr[j-1] ){
                  swap(arr,j,j-1);
                  j--;
                }
            }
             print(arr);


    }
}
