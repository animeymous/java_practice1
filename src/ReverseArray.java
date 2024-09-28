public class ReverseArray {
    public static void reverseArray(int arr[]){
        int j = arr.length - 1;

        for(int i = 0; i < arr.length; i++){
            if(i < j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j--;
            }
        }

        for(int k = 0; k < arr.length; k++){
            System.out.print(arr[k] + " ");
        }
    }
}
