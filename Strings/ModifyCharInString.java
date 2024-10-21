package Strings;

public class ModifyCharInString {
    public static void main(String[] args) {
        String s = "Moksh";
        s = s.substring(0,2)+'Y'+s.substring(3);
        System.out.println(s);
    }
}
