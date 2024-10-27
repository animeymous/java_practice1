public class MaxSumContiguousSubarray {
    public static void maxSumContiguousSubarray(int [] arr){

        //variable to hold maximum sum
        int maximum_sum = Integer.MIN_VALUE;

        //loop to set starting point
        for(int start = 0; start < arr.length; start++){

            //loop to set ending point
            for(int end = start; end < arr.length; end++){
                //variable to hold sum of sub array from start to end
                int sum = 0;

                //loop to iterate from start to end and add all integer in sum
                for(int i = start; i <= end; i++){
                    sum += arr[i];
                }

                //compare sum of sub array with maximum sub array sum
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

Approach: brute force
1. make variable to hold max sum, and set start and ending point
2. loop through from start and ending point and add sum into variable
3. update if sub array sum is greater than max sub array sum

TC: O(N^3)
SC: O(1)
*/