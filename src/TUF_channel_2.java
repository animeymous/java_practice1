public class TUF_channel_2 {
    public static void tUF_channel_2 (int [] arr, int k){
        //Que: Longest sub-array with sum <= K

        //calculate all sub-array sum one by one
        int maximum_length = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            int sum = 0;
            for(int j = i; j < arr.length; j++){
                sum = sum + arr[j];

                if(sum <= k){
                    maximum_length = Math.max(maximum_length, j - i + 1);
                }else {
                    break;
                }
            }
        }

        System.out.print("Maximum length of sub-array <= k is: "+maximum_length);
    }
}
/*
Approach 1: Brute Force
Time : O(N2)
Space: O(1)
*/
