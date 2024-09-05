import java.util.*;
import java.lang.*;

public class PrintArray2D {
    public static void printAll(){
        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        int N = sc.nextInt();

        int[][] matrix = new int[M][N];

        for(int i = 0; i < matrix.length; i++){
            for(int c = 0; c < matrix[0].length; c++){
                matrix[i][c] =  sc.nextInt();
            }
        }

        for(int i = 0; i < matrix.length; i++){
            for(int c = 0; c < matrix[0].length; c++){
                System.out.print(matrix[i][c]+ " ");
            }
            System.out.println();
        }
    };
}
