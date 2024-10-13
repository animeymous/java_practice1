public class StarPattern_10 {
    public static void starPattern_10(int row){
        for(int i = 1; i <= row; i++){
            for(int j = row - i; j >= 1; j--){
                System.out.print(" ");
            }

            for(int j = 1; j <= i; j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
