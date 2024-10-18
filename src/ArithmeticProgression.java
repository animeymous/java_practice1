import java.util.Arrays;

public class ArithmeticProgression {
    public static int arithmeticProgression(int [] arr){
        //sort array so that we can have elements in specific order,
        Arrays.sort(arr);

        //find difference first 2 elements: int AP = arr[1] - arr[0];
        int AP = arr[1] - arr[0];

        //now match every elements have same gap or not
        for(int i = 2; i < arr.length; i++){
            if(AP != arr[i] - arr[i-1]){
                return 0;
            }
        }

        return 1;
    }
}

/*
Question: Given an integer array A of size N. Return 1 if the array can be arranged to form an arithmetic progression, otherwise return 0.
A sequence of numbers is called an arithmetic progression if the difference between any two consecutive elements is the same.

Approach:
1. sort array so that we can have elements in specific order,
2. find difference first 2 elements: int AP = arr[1] - arr[0];
3. now match every elements have same gap or not

TC: O(N);
SC: O(1);
*/