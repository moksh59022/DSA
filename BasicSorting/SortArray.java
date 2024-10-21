package BasicSorting;

public class SortArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        boolean flag = true;
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            if(arr[i]>=arr[i+1]){
                flag = false;
                break;
            }
        }
        if(flag ==true ){
            System.out.println("sorted");
        }
        else System.out.println("unsorted");
    }



    }


