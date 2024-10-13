import java.util.*;
public class PrintFirstAndLastNumber {
    public static void printFirstAndLastNumber(int numOfInput){

        Scanner sc = new Scanner(System.in);

        int count = numOfInput;

        while (count > 0) {
            int digits = sc.nextInt();
            int tempDigits = digits;
            int tempDigits1 = digits;

            int firstDigit = 0;
            int lastDigit = tempDigits % 10;
            int numCount = 0;
            while (tempDigits > 0) {
                numCount++;
                tempDigits = tempDigits / 10;
            }

            while (numCount >= 1) {
                if (numCount == 1) {
                    firstDigit = tempDigits1;
                }

                tempDigits1 = tempDigits1 / 10;
                numCount--;
            }

            System.out.println(firstDigit + " " + lastDigit);
            count--;
        }
    }
}
