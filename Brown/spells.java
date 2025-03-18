package Brown;

import java.util.*;
public class spells{
    public static void main(String[] args){

        int[] arr1 = {5,1,3};
        int[] arr2 = {1,2,3,4,5};
        int success = 7;

        int[] ans = isSuccess(arr1, arr2,success);
        System.out.println(Arrays.toString(ans));


    }

    public static int[] isSuccess(int[] spells,int[] potions,int success){
        int n = spells.length;
        Arrays.sort(potions);

        for(int i= 0;i<n;i++){
            int t =(int) Math.ceil(success/(double)spells[i]);
            int ind = search(potions,t);
            if(ind!=-1){
                spells[i] = potions.length - ind;
            }else{
                spells[i] = 0;
            }

        }
        return spells;

    }
    public static int search(int[] arr,int t){
        int n = arr.length;
        int lo = 0,hi = n-1;

        int res = -1;

        while(lo<=hi){
            int mid = lo +(hi-lo)/2;

            if(arr[mid]>=t){
                res =  mid;
                hi = mid - 1;
            }else{
                lo = mid + 1;
            }

        }

        return res;


    }
}
