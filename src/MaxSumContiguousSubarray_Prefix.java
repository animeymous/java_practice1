public class MaxSumContiguousSubarray_Prefix {
    public static void maxSumContiguousSubarray_Prefix(int [] arr){

        //variable to hold maximum sum
        int maximum_sum = Integer.MIN_VALUE;

        //create new prefix sum array with same size as given array
        int [] prefix = new int[arr.length];

        //initialize its 1st index
        prefix[0] = arr[0];

        //fill all remaining length
        for(int i = 1; i < arr.length; i++){
            prefix[i] = prefix[i - 1] + arr[i];
        }

        //loop to set starting point
        for(int start = 0; start < arr.length; start++){

            //loop to set ending point
            for(int end = start; end < arr.length; end++){

                //variable to store sum of sub array
                int sum = 0;

                if(start == 0){
                    sum = prefix[end]; // when start is 0, to get correct sum we do prefix[end]
                }else{
                    sum = prefix[end] - prefix[start - 1]; // formula to calculate
                }

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

Approach: prefix method
1. make variable to hold max sum, and set start and ending point
2. loop through from start and ending point
3. calculate sum with prefix formula from prefix array
3. update maximum sum variable if sub array sum is greater

TC: O(N^2)
SC: O(N)
*/