package conditionals;

public class ProfitLoss {
    public static void main(String[] args) {
        int sp = 50;
        int cp = 40;
        if(sp-cp>0) {
            System.out.println("profit is : "+ (sp-cp));
        if(sp - cp == 0) {
            System.out.println("no profit");
        }

        }else System.out.println("loss");


    }
}

