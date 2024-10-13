public class StarPattern_7 {
    public static void starPattern_7(int row){
        int count = 1;
        for(int i = row; i >= 1; i--){
            for(int j = row-count; j >= 1; j--){
                System.out.print("_");
            }
            for(int j = 1; j <= count; j++){
                System.out.print("*");
            }
            System.out.println();
            count++;
        }
    }
}
