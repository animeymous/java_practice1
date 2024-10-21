import java.util.Arrays;

public class CheckIfArrayIsSorted {
    public static void checkIfArrayIsSorted(int [] arr){

        //This loop will check if current element is smaller than next element or not
        for(int i = 0; i < arr.length -1; i++){
            if(arr[i] <= arr[i+1]){
                continue;
            }else{
                System.out.println("Array is not sorted");
                return;
            }
        }
        System.out.println("Array is sorted");
    }
}

/*
Given an array A, check if it is sorted in non-decreasing order or not.

Approach:
1. create loop to check if current element is smaller than next element or not

TC: O(N);
SC: O(1);
*/
