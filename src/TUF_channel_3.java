public class TUF_channel_3 {
    public static void tUF_channel_3(int [] arr, int k){
        //Que: Longest sub-array with sum <= K

        int left = 0;
        int right = 0;
        int maximum_length = 0;
        int sum = 0;

        // Using two pointer and sliding window algorithm
        // basically we are doing SHRINKING AND EXPANDING window
        while(right < arr.length){

            sum = sum + arr[right];

            while(sum > k){                 // if sum > k then we are SHRINKING left side window
                sum = sum - arr[left];
                left++;
            }

            if(sum <= k){                   // if sum > k then we are EXPANDING left side window
                maximum_length = Math.max(maximum_length, right - left + 1);
            }
            right++;
        }

        System.out.print("Maximum length of sub-array <= k is: "+maximum_length);
    }
}

/*
Approach 2: Better approach in terms of iterations
Time : O(N)
Space: O(1)

why O(N) ?  because look at right variable it will move till at the end of array only means N times only,
            and left variable is also moving till end of array only means again N only,
            so it looks like O(N^2) but iterations happening O(N + N) times only which O(N)
*/