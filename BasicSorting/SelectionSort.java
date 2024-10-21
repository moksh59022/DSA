package BasicSorting;

public class SelectionSort {
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

        // selection sort
        for (int i = 0; i < n-1; i++) {
            int mindx = -1;
            int min = Integer.MAX_VALUE;
            for (int j = i; j <n; j++) {

                if (arr[j] < min) {
                    min = arr[j];
                    mindx = j;
                }
            }
           // swap arr[i] and arr[mindx]
        swap(arr,i,mindx);

        }
        print(arr);

    }
}
