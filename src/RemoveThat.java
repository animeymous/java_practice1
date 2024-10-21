public class RemoveThat {
    public static void removeThat(int [] arr, int index){

        if(arr.length != 0 && arr.length > index - 1){
            System.out.println("Original Array");
            for(int i : arr){
                System.out.print(i + " ");
            }
            System.out.println();

            //loop to index - 1 and then start replacing value from next element at right side of array
            for(int i = 0; i < arr.length - 1; i++){
                if(i < index - 1){
                    continue;
                }else{
                    arr[i] = arr[i+ 1];
                }
            }
            System.out.println("After removing index");
            for(int i : arr){
                System.out.print(i + " ");
            }
        }else{
            System.out.println("Array is either empty or index does not exist");
        }
    }
}

/*
Given an array A, check if it is sorted in non-decreasing order or not.

Approach:
1. check if array is empty or not
2. check if index exist or not
2. loop to index - 1 and then start replacing value from next element at right side of array

TC: O(N);
SC: O(1);
*/