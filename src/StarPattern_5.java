public class StarPattern_5 {
    public static void starPattern_5(int row, int star){
        for(int i = 1; i <= row; i++){
            for(int j = 0; j < star; j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
