package Brown;

import java.util.*;
class SubsequenceIncreasing{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.print(subsequence(arr));
    }

    public static List<List<Integer>> subsequence(int[] arr){

        Set<List<Integer>> result = new HashSet<>();
        populateResult(arr,0,result,new ArrayList<>());
        return new ArrayList<>(result);
    }

    public static void populateResult(int[] arr,int index,Set<List<Integer>> result , ArrayList<Integer> curSeq){

        if(index==arr.length){
            if(curSeq.size()>=2){
                result.add(curSeq);
            }
            return;
        }


        // option 1 : add it to subseq only if arr[index] is non - decreasing

        if(curSeq.isEmpty() || curSeq.get(curSeq.size() - 1) <= arr[index]){
            curSeq.add(arr[index]);
            populateResult(arr,index+1,result,curSeq);
            curSeq.remove(curSeq.size() - 1);
        }


        // option 2 : skip

        populateResult(arr,index+1,result,curSeq);


    }

}