public class PrintPrimeInRange_2 {
    public static void printPrimeInRange_2(int range){
        for(int i = 1; i <= range; i++){
            int count = 0;
            for(int j = 1; j * j <= i; j++){
                if(i % j == 0){
                    if(j == i / j){
                        count++;
                    }else {
                        count += 2;
                    }
                }
            }

            if(count == 2){
                System.out.print(i+" ");
            }
        }
    }
}
