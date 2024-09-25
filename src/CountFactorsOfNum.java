public class CountFactorsOfNum {
    public static int countFactorsOfNum(int num){
        int count = 0;

        for(int i = 1; i * i <= num; i++){
            if(num % i == 0){
                if(i == num/i){
                    count++;
                }else{
                    count = count + 2;
                }
            }
        }

        return count;
    }
}
