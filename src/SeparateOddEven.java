import java.util.Scanner;

public class SeparateOddEven {
    public static void separateOddEven(int test){
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < test; i++){
            int size = sc.nextInt();

            int [] arr = new int[size];

            for(int j = 0; j < arr.length; j++){
                arr[j] = sc.nextInt();
            }

            int odd = 0;
            int even  = 0;
            for(int j = 0; j < arr.length; j++){
                if(arr[j] % 2 == 0){
                    even++;
                }else{
                    odd++;
                }
            }

            System.out.println("Even : "+even);
            System.out.println("Odd : "+ odd);
        }
    }
}

/*
Ques: You are given an integer T denoting the number of test cases. For each test case, you are given an integer array A.
You have to print the odd and even elements of array A in 2 separate lines.

NOTE: Array elements should have the same relative order as in A.

Approach:
1. start loop to run given number of times(test)
2. start loop to count even and odd numbers in array
3. print them

TC: O(T*N)
SC: O(1)
*/