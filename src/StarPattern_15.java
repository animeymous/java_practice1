public class StarPattern_15 {
    public static void starPattern_15(int row){

        for(int i = row; i >= 1; i--){
            if(i == row || i == 1){
                for(int j = 0; j < row; j++){
                    System.out.print("*");
                }
            }else{
                for(int j = 0; j < row; j++){
                    if(j == 0 || j == row-1){
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
******
*   *
*  *
* *
**
*

TC: O(N^2)
SC: O(1)
*/