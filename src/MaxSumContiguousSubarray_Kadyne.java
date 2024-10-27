public class MaxSumContiguousSubarray_Kadyne {
    public static void maxSumContiguousSubarray_Kadyne(int [] arr){

        //variable to hold maximum sum
        int maximum_sum = Integer.MIN_VALUE;

        if(arr.length == 1){
            maximum_sum = arr[0];
            System.out.println("maximum sum: "+maximum_sum);
        }else{
            int sum = 0;

            //loop to set starting point
            for(int i = 0; i < arr.length; i++){
                sum = sum + arr[i];

                if(sum < 0){
                    sum = 0;
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

Approach: kadyne Algo
1. make variable to hold max sum
2. check length, if its one then return 0th element as sum
3. if length is more, then maintain 2 variable, sum and maxsum
4. sum will continue to add elements till it become less than zero to find maximum length of sub array
5. while adding, if sum > maxsum then update maxsum, if sum < 0, then update sum = 0 to start new sub array sum

TC: O(N)
SC: O(1)
*/