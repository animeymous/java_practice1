public class RotateArray_K_times {
    public static void rotateArray_K_times(int arr[], int k){
        while(k > 0){
            int lastElement = arr[arr.length - 1];

            for(int i = arr.length - 2; i >= 0 ; i--){
                arr[i+1] = arr[i];
            }
            arr[0] = lastElement;
            k--;
        }

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}

//Time complexity : O(N*K)
//Space " : O(1)
//Approach: brute force