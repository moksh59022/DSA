package Strings;

public class UpdateEvenPosition {
    public static void main(String[] args) {
        String s  = "Moksh Sharma";
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            if (i%2==0){
               ans +='A';
            }
            else ans += s.charAt(i);

        }
        System.out.print(ans);
    }
}
