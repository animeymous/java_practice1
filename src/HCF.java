public class HCF {
    public static void hcf(int num1, int num2){
        int hcf = 0;

        for(int i = 2; i <= num2; i++){
            if(num1 % i == 0 && num2 % i == 0){
                hcf = i;
            }
        }

        System.out.println(hcf);
    }
}
