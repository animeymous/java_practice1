import java.util.Scanner;

public class PrintSumOfArray2DRowWise {
    public static void printSumOfArray2D(){
        Scanner sc  = new Scanner(System.in);

        int M = sc.nextInt();
        int N = sc.nextInt();

        int[][] matrix = new int[M][N];

        for(int r = 0; r < matrix.length; r++){
            for(int c = 0; c < matrix[0].length; c++){
                matrix[r][c] = sc.nextInt();
            }
        }

        for(int r = 0; r < matrix.length; r++){
            int sum = 0;
            for(int c = 0; c < matrix[0].length; c++){
                sum = sum + matrix[r][c];
            }
            System.out.print(sum+" ");
        }
    }
}
