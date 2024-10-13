public class StarPattern_1 {
    public static void starPattern_1 (int rows){
        for(int i = rows - 1; i >= 0; i--){
            for(int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

/*
*   *****
*   ****
*   ***
*   **
*   *
* */
