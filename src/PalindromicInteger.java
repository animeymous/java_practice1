public class PalindromicInteger {
    public static void palindromicInteger(int num){
        int tempNumber = num;
        int sum = 0;

        while(tempNumber > 0){
            int temp = tempNumber % 10;
            sum = (sum * 10) + temp;

            tempNumber = tempNumber / 10;
        }

        if(sum == num){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
