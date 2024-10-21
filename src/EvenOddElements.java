import java.util.Scanner;

public class EvenOddElements {
    public static void evenOddElements (int test){
        Scanner sc = new Scanner(System.in);

        //loop to run program for test number of times
        for(int i = 0; i < test; i++){
            int size = sc.nextInt();

            int [] arr = new int[size];

            for(int j = 0; j < arr.length; j++){
                arr[j] = sc.nextInt();
            }
            int even = 0;
            int odd = 0;

            //loop to check even and odd in array
            for(int j = 0; j < arr.length; j++){
                if(arr[j] % 2 == 0){
                    even++;
                }else{
                    odd++;
                }
            }

            //to avoid printing negative difference
            if(even > odd){
                System.out.println("Even : "+even);
                System.out.println("Odd : "+ odd);
                System.out.println(even - odd);
            }else{
                System.out.println("Odd : "+ odd);
                System.out.println("Even : "+even);
                System.out.println(odd - even);
            }
        }
    }
}

/*
Ques: You are given T(number of test cases) integer arrays. For each array A,
you have to find the value of absolute difference between the counts of even and odd elements in the array.

Approach:
1. start loop to run given number of times(test)
2. start loop to count even and odd numbers in array

TC: O(T*N)
SC: O(1)
*/