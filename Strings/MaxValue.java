package Strings;

public class MaxValue {
    public static void main(String[] args) {
        String[] arr = {"121212","121212","11111111","1111111"};
//        int mx = Integer.parseInt(arr[0]);
//        for (int i = 0; i < arr.length; i++) {
//            int n = Integer.parseInt(arr[i]);
//            if(mx<n){
//             mx=n;
//            }
//        }
//        System.out.println(mx);



       String maxS = arr[0];
        for (int i = 0; i < arr.length; i++) {
            maxS = max(maxS,arr[i]);
        }
        System.out.println(maxS);
    }

    public static String max(String a , String b){
    String s = purify(a); String t = purify(b);
    if (s.length()>t.length()) return a;
    if (s.length()<t.length()) return b;
    for (int i =1;i<s.length();i++){
        if (s.charAt(i)!=t.charAt(i)){
            if (s.charAt(i)>=t.charAt(i)) return a;
            else return b;
        }
    }
    if (a.length()>=b.length()) return a;
    else return b;
    }

    public static String purify(String s){
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)!=0) return s.substring(i);

        }
        return s;

    }

}
