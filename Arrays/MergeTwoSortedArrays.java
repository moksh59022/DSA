package Arrays;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr = {11,33,42,62};
        int[] arr2 = {26,54,69,81,94};

        int a = arr.length,b=arr2.length;

        int[] c = new int[a+b];
        int i = 0,k=0,j=0;

        //Merging
        while (i<arr.length && j<arr2.length) {
            if (arr[i] <= arr2[j]) {
                c[k] = arr[i];
                i++;
            } else {
                c[k] = arr2[j];
                j++;
            }
            k++;
        }
            // now take element from arr2 only
            if(i==arr.length){
                while (j<arr2.length){
                    c[k]=arr2[j];
                    j++;k++;

                }
            }

            // now take element from arr only
            if(j==arr2.length){
                while (i<arr.length){
                    c[k] = arr[i];
                    i++;
                    k++;
                }
            }

        for (int ele:c){
            System.out.print(ele+" ");
        }



    }
}
