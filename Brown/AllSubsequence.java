package Brown;
// print all subsequence of a string using backtracking

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class AllSubsequence {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();

        List<String> ans = new ArrayList<>();
        backtrack(str,0,"",ans);
        Collections.sort(ans);

        for(String ele : ans){
            System.out.println(ele);
        }

    }

    public static void backtrack(String str,int idx,String current,List<String> ans){

        if(idx==str.length()){
            if(!current.isEmpty()){
                ans.add(current);
            }
            return;
        }


        backtrack(str,idx+1,current+str.charAt(idx),ans);
        backtrack(str,idx+1,current,ans);


    }

}
