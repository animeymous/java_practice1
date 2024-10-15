public class TUF_channel_4 {
    public static void tUF_channel_4 (int [] arr, int k){
        //Que: Longest sub-array with sum <= K

        int left = 0;
        int right = 0;
        int maximum_length = 0;
        int sum = 0;

        while(right < arr.length){
            sum = sum + arr[right];

            if(sum <= k){
                maximum_length = Math.max(maximum_length, right - left + 1); // we will only increase if we get sub-array length bigger than previous one
            }else{
                left++; // now we are just resetting left positing since till now whatever length is, that's the biggest
            }

            right++;
        }

        System.out.print("Maximum length of sub-array <= k is: "+maximum_length);
    }
}

/*
Approach 3: Best approach till now, we have just removed SHRINKING part, now we are just EXPANDING right side
            and keeping max length same if we get sub-array greater , then we shift left side till we get new max
Time : O(N)
Space: O(1)
*/
