public class SumOfArray {
    public static void sumOfArray(int [] arr){
        //Variable to store final sum of elements
        int sum = 0;

        //Adding sum of elements one by one
        for(int item : arr){
            sum += item;
        }

        System.out.println("Sum of given array : "+sum);
    }
}


/*
Write a program to print sum of elements of the input array A of size N.

Approach:
1. Create variable to store final sum of elements
2. In any loop add sum of elements one by one

TC: O(N);
SC: O(1);
*/