import java.util.Scanner;

public class PrintEveryColumnMaxArray2D {
    public static void printEveryColumnMaxArray2D(){
        Scanner sc  = new Scanner(System.in);

        int M = sc.nextInt();
        int N = sc.nextInt();

        int[][] matrix = new int[M][N];

        for(int r = 0; r < matrix.length; r++){
            for(int c = 0; c < matrix[0].length; c++){
                matrix[r][c] = sc.nextInt();
            }
        }

        for(int c = 0; c < matrix[0].length; c++){
            int max = Integer.MIN_VALUE;
            for (int r = 0; r < matrix.length; r++){
                if(matrix[r][c] > max){
                    max = matrix[r][c];
                }
            }

            System.out.print(max+" ");
        }
    }
}
