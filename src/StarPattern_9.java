public class StarPattern_9 {
    public static void starPattern_9(int row){
        for(int i = 0; i < row; i++){
            for(int j = 1; j <= row - i; j++){
                System.out.print("*");
            }
            for(int j = 0; j < i * 2; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= row - i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

/*
     *
    * *
   * * *
  * * * *
 * * * * *

TC: O(N^2)
SC: O(1)
*/
