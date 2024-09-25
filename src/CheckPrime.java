public class CheckPrime {
    public static int countFactor(int num){
        int factor = 0;

        for(int i = 1; i * i <= num; i++){
            if(num % i == 0){
                if(i == num / i){
                    factor++;
                }else {
                    factor += 2;
                }
            }
        }
        return factor;

    };

    public static boolean checkPrime(int num){
        boolean prime = false;

        if(countFactor(num) > 2){
            return false;
        }else{
            return true;
        }
    }
}
