import java.util.Scanner;

public class PrintColumnWaveArray2D {
    public static void printColumnWaveArray2D(){
        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();

        int[][] matrix = new int[M][M];

        for(int r = 0; r < matrix.length; r++){
            for(int c = 0; c < matrix[0].length; c++){
                matrix[r][c] =  sc.nextInt();
            }
        }

        System.out.println();
        int col = 0;
        for(int r = 0; r < matrix.length; r++){

            if(r % 2 == 0){
                for(int row = 0; row < matrix.length; row++){
                    System.out.print(matrix[row][col]+ " ");
                }
            }else{
                for(int row = matrix.length - 1; row >= 0; row--){
                    System.out.print(matrix[row][col]+ " ");
                }
            }
            col++;
            System.out.println();
        }
    }
}
