package Strings;

public class SubString {
    public static void main(String[] args) {
        String s = "aeeae";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j < s.length(); j++) {
                System.out.print(s.substring(i,j)+" ");
            }
            System.out.println();
        }

        String n = "abcdef";
        System.out.println(n.substring(0,6));
    }
}
