import java.util.Arrays;

public class NobleInteger {
    public static void nobleInteger(int [] arr){

        Arrays.sort(arr);
        if(arr[arr.length - 1] == 0){
            System.out.println("1");
        };
        for(int i = 0; i < arr.length - 1; i++){
            if(arr[i] == (arr.length - (i + 1)) && i+1 < arr.length && arr[i]<arr[i+1]){
                System.out.println("1");
                return;
            }
        }

        System.out.println("-1");
    }
}



/*
Question: Given an integer array A, find if an integer p exists in the array such that the number of integers greater than p in the array equals p.

Approach:
1. sort array so that we can know from every index how many elements are greater than that
2. check is after sorting last element is 0 or not, this tell us till N-1 elements are all NEGATIVE or not
3. formula to check noble integer: arr[i] == (arr.length - (i + 1))

TC: O(N)
SC: O(1)
*/
