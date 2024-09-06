import java.util.Scanner;

public class PrintRowWaveArray2D {
    public static void printRowWaveArray2D(){
        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        int N = sc.nextInt();

        int[][] matrix = new int[M][N];

        for(int r = 0; r < matrix.length; r++){
            for(int c = 0; c < matrix[0].length; c++){
                matrix[r][c] = sc.nextInt();
            }
        }

        System.out.println();

        for(int r = 0; r < matrix.length; r++){
            if(r % 2 == 0){
                for(int c = 0; c < matrix[0].length; c++){
                    System.out.print(matrix[r][c]+" ");
                }
            }else {
                for(int c = matrix[0].length - 1; c >= 0; c--){
                    System.out.print(matrix[r][c]+" ");
                }
            }
            System.out.println();
        }
    }
}
