import java.util.Scanner;

public class PrintMaxOfEveryRowArray2D {
    public static void printMaxOfEveryRowArray2D(){
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
            int max = Integer.MIN_VALUE;
            for (int c = 0; c < matrix[0].length; c++){
                if(matrix[r][c] > max){
                    max = matrix[r][c];
                }
            }

            System.out.print(max+" ");
        }
    }
}
