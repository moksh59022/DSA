package Strings;

public class DeleteAndInsert {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("Moksh");
        s.deleteCharAt(2);
        s.insert(2,'j');
        System.out.println(s);

    }
}
