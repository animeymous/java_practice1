public class StartPattern_3 {
    public static void startPattern_3 (int row){
        for(int i = 1; i <= row; i++){
            for(int j = 1; j <= row; j++){
                if(j == 1 || j == row){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
