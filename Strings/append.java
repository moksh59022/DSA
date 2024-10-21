package Strings;

public class append {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("Moksh");
        s.append(" Sharma");
        System.out.println(s);
        char[] ch = {'a','b','h','l'};
        s.append(ch);
        System.out.println(s);
        int[] i = {1,2,55,78};
        s.append(i);
        System.out.println(s);

    }
}
