public class StarPattern_12 {
    public static void starPattern_12(int row){
        for(int i = 0; i < row; i++){
            if (i == 0 || i == row - 1) {
                for(int j = 0; j<row; j++){
                    System.out.print("*");
                }
            }else{
                for(int j = 0; j < row; j++){
                    if(j == 0 || j == row - 1){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
            }

            System.out.println();
        }
    }
}
/*
*****
*   *
*   *
*   *
*****

TC: O(N^2)
SC: O(1)
*/