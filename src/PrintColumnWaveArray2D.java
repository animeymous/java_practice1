import java.util.Scanner;

public class PrintColumnWaveArray2D {
    public static void printColumnWaveArray2D(){
        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        int N = sc.nextInt();

        int[][] matrix = new int[M][N];

        for(int r = 0; r < matrix.length; r++){
            for(int c = 0; c < matrix[0].length; c++){
                matrix[r][c] =  sc.nextInt();
            }
        }

        System.out.println();
        int col = 0;
        for(int c = 0; c < matrix[0].length; c++){

            if(c % 2 == 0){
                for(int r = 0; r < matrix.length; r++){
                    System.out.print(matrix[r][c]+ " ");
                }
            }else{
                for(int r = matrix.length - 1; r >= 0; r--){
                    System.out.print(matrix[r][c]+ " ");
                }
            }
//            col++;
            System.out.println();
        }
    }
}
