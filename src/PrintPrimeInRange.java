public class PrintPrimeInRange {
    public static void printPrimeInRange(int range){

        for(int i = 2; i <= range; i++){
            int count = 0;
            for(int j = 2; j <= i; j++){
                if(i % j == 0){
                    count++;
                }
            }

            if(count == 1){
                System.out.print(i+" ");
            }
        }
    }
}
