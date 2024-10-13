public class StarPattern_6 {
    public static void starPattern_6(int row){
        for(int i = 1; i <= row; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
