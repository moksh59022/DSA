package Arrays.Questions;

import java.util.Scanner;

public class RemoveSubString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        String res = "";
//        int i = 0;
//       while (i<n.length()){

        for (int i = 0; i < n.length(); i++) {


            if (n.charAt(i) == 'b') {
                i++;
            } else if (i + 1 < n.length() && n.charAt(i) == 'a' && n.charAt(i + 1) == 'c') {
                i += 2;
            } else {
                res += n.charAt(i);
                i++;
            }
          }
        System.out.println(res);
        }
    }

