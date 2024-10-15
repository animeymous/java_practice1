public class TUF_channel_1 {
    // Que: Find maximum sum in constant K window (take you forward youtube chanel )

    public static void tUF_channel_1(int [] arr, int k){
        int sum = 0;
        int maximum_sum = 0;

        //calculate sum till kth element
        for(int i = 0; i < k; i++){
            sum = sum + arr[i];
        }

        maximum_sum = sum;

        System.out.println("max_sum "+ maximum_sum);

        //slide window with L and R two pointer and calculate sum then compare with previous sum
        int l = 0;
        int r = k - 1;
        while(r < arr.length - 1){
            sum = sum - arr[l];
            l++;
            r++;
            sum = sum + arr[r];

            System.out.println("sum "+ sum);
            if(sum > maximum_sum){
                maximum_sum = sum;
            }
        }

        System.out.print(maximum_sum);
    }
}
