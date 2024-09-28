public class ReversePartOfArray {
    public static void reversePartOfArray(int arr[], int i , int j){

        for(i = i; i < j; i++){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j--;
        }

        for(int k = 0; k < arr.length; k++){
            System.out.print(arr[k]+ " ");
        }
    }
}

//Time complexity: O(N)
//Space complexity: O(1)
