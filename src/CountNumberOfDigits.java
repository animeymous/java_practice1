import java.util.*;

public class CountNumberOfDigits {
    public static void countNumberOfDigits(int numOfInput){
        Scanner sc = new Scanner(System.in);

        int count = numOfInput;

        while (count > 0) {
            int digits = sc.nextInt();
            int tempDigits = digits;
            int numCount = 0;

            if (tempDigits == 0) {
                numCount++;
            } else {
                while (tempDigits > 0) {
                    numCount++;
                    tempDigits = tempDigits / 10;
                }
            }


            System.out.println(numCount);
            count--;
        }
    }
}

// Print count of digits
