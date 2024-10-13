public class PrintPattern_2 {
    public static void printPattern_2(int row){
        for(int i = 1; i <= row; i++){
            for(int j = i; j <= row; j++){
                System.out.print(j+" ");
            }

            System.out.println();
        }
    }
}
