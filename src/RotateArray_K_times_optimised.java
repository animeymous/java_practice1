public class RotateArray_K_times_optimised {

    // function to reverse array from given range
    public static int[] reveredArray(int [] arr, int i, int j){
        for(; i < j; i++){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j--;
        }
        return arr;
    }

    public static void rotateArray_K_times_optimised(int [] arr, int k){

        //1st : reverse whole array
        int [] reversedArray = reveredArray(arr, 0, arr.length-1);

        System.out.println("1st: reversed array");
        for (int j : reversedArray) {
            System.out.print(j + " ");
        }

        System.out.println();

        //2nd : reverse till Kth from 0
        int [] reverse_K = reveredArray(reversedArray, 0, k);
        System.out.println("2ns: reversed 0 to K-1");
        for (int j : reverse_K) {
            System.out.print(j + " ");
        }

        //3rd: reverse till last from Kth
        int [] reverseN_K = reveredArray(reverse_K, k, arr.length-1);

        System.out.println();
        System.out.println("1st: reversed k to N-1");
        for (int j : reverseN_K) {
            System.out.print(j + " ");
        }
    }
}

//Time complexity :O(N)
//space " : O(1)
//approach:
//1st : reverse whole array
//2nd : reverse till Kth from 0
//3rd: reverse till last from Kth