import java.util.Scanner;

public class SumOfDigits {
    public static void sumOfDigits(int numOfInput){
        Scanner sc = new Scanner(System.in);

        int count = numOfInput;

        while (count > 0){
            int digits = sc.nextInt();
            int tempDigits = digits;
            int sum = 0;


            while(tempDigits > 0){
                int temp = tempDigits % 10;
                sum = sum + temp;
                tempDigits = tempDigits / 10;
            }


            System.out.println(sum);
            count--;
        }
    }
}

// Program to Print sum of digits
