public class MaxSumContiguousSubarray_Carry_Forward {
    public static void maxSumContiguousSubarray_Carry_Forward(int [] arr){

        //variable to hold maximum sum
        int maximum_sum = Integer.MIN_VALUE;

        //loop to set starting point
        for(int start = 0; start < arr.length; start++){

            //variable to store sum of sub array
            int sum = 0;

            //loop to set ending point
            for(int end = start; end < arr.length; end++){
                sum = sum + arr[end]; // carry forward technique

                if(sum > maximum_sum){
                    maximum_sum = sum;
                }
            }
        }

        System.out.println("maximum sum: "+maximum_sum);
    }
}
/*
Ques: Find the maximum sum of contiguous non-empty subarray within an array A of length N.

Approach: carry forward technique
1. make variable to hold max sum, and set start and ending point
2. loop through from start and ending point
3. calculate sum with carry forward
3. update maximum sum variable if sub array sum is greater

TC: O(N^2)
SC: O(1)
*/