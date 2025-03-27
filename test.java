import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();

        int r2 = sc.nextInt();
        int c2 = sc.nextInt();

        if(r1!=c2) return;

        int[][] arr1 = new int[r1][c1];
        for(int i = 0;i<r1;i++){
            for (int j = 0; j < c1; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

        int[][] arr2 = new int[r2][c2];
        for(int i = 0;i<r2;i++){
            for (int j = 0; j < c2; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }



        int[][] arr3 = new int[r1][c2];

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    arr3[i][j]+=arr1[i][k]*arr2[k][j];
                }
            }
        }

        int sum = 0;
        for(int i = 0;i<r1;i++){
            for (int j = 0; j < c2; j++) {
                System.out.print(arr3[i][j]+" ");
                sum+=arr3[i][j];
            }
            System.out.println();
        }
        System.out.println(sum);
    }
}
