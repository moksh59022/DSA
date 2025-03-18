package Brown;
import java.util.*;
class phone {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String digits = sc.nextLine();
        sc.close();

        System.out.println( combinations(digits));


    }

    public static List<String> combinations(String digits){
        List<String> ans = new ArrayList<>();
        if(digits==null || digits.length()==0){
            return ans;
        }

        HashMap<Character,String> map = new HashMap<>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");

        backtrack(digits,0,new StringBuilder(),ans,map);
        return ans;

    }

    public static void backtrack(String digits,int idx,StringBuilder combo,List<String> ans,HashMap<Character,String> map){
        if(idx == digits.length()){
            ans.add(combo.toString());
            return;
        }


        String letters = map.get(digits.charAt(idx));

        for(char letter : letters.toCharArray()){
            combo.append(letter);
            backtrack(digits,idx+1,combo,ans,map);
            combo.deleteCharAt(combo.length()-1);
        }

    }

}