public class StarPattern_14 {
    public static void starPattern_14(int row){
        for(int i = 0; i < row; i++){
           for(int j = 0; j < i; j++){
               System.out.print(" ");
           }
            for(int j = i; j < row; j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}

/*
* * * * *
 * * * *
  * * *
   * *
    *

TC: O(N^2)
SC: O(1)
*/