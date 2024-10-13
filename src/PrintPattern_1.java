public class PrintPattern_1 {
    public static void printPattern_1(int row){
        for(int i = 1; i <= row; i++){
            for(int j = 1; j <= i; j++){
                if(j % 2 != 0){
                    System.out.print(j+"");
                }else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}
