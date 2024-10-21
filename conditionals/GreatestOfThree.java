package conditionals;

public class GreatestOfThree {
    public static void main(String[] args) {
     int a = 4,b=5,c=7;
        int max  = a < b ? b < c ? a : b : c < b ? c : b;
        System.out.println("value of max is : "+max);
//        int MAX = Math.max(4,6,);

    }
}
