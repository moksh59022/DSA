package BasicSorting;

public class BubbleSort {
    public static void print(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,7,5,5,6,9};
        int n = arr.length;
        for (int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
//        for (int x = 0; x < n; x++) {
//            for (int i = 0; i < n - 1; i++) {
//                if (arr[i] >= arr[i + 1]) {
//                    int temp = arr[i];
//                    arr[i] = arr[i + 1];
//                    arr[i + 1] = temp;
//
//                }
//            }
//
//        }
//        print(arr);

        // Bubble Sort 2
//        for (int x = 0; x < n-1; x++) {
//            for (int i = 0; i < n - 1 -x; i++) {
//                if (arr[i] >= arr[i + 1]) {
//                    int temp = arr[i];
//                    arr[i] = arr[i + 1];
//                    arr[i + 1] = temp;
//
//                }
//            }
//
//        }
//        print(arr);


        // bubble sort optimized
        for (int x = 0; x < n-1; x++) {
            boolean flag = true;
            for (int i = 0; i < n -1-x; i++) {
                if (arr[i] >= arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    flag = false;

                }
            }
            if(flag==true){
                break;
            }

        }
        print(arr);
    }
}
