public class NegativeIntegers {
    public static void negativeIntegers (int [] arr){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < 0){
                System.out.print(arr[i] + " ");
            }
        }
    }
}

/*
Ques: Write a program to print all negative numbers from input array A of size N.
Take integer N and N elements of the array as input from user.

Approach:
1. start loop till last element and check every element if they are below 0 or not

TC: O(N)
SC: O(1)
*/