public class PrintPerfectNumber {
    public static void printPerfectNumber(int num){
        int sum = 0;
        for(int i = 1; i <= num / 2; i++){
            if(num % i == 0){
                sum = sum + i;
            }
        }

        if(sum == num){
            System.out.print("YES");
        }else {
            System.out.print("NO");
        }
    }
}
