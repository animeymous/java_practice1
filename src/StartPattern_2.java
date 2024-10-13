public class StartPattern_2 {
    public static void startPattern_2(int rows){
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

/*
  *
  **
  ***
  ****
  *****
*/
