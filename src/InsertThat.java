public class InsertThat {
    public static void insertThat(int [] arr, int element, int index){

        //Create new array size of given array + 1 to store new value while retaining old values
        int [] newArr = new int [arr.length + 1];

        //Assign given array values to new array by shifting all elements one index at right side
        // to make given index vacant for given value
        for(int i = arr.length - 1; i >= 0; i--){
            if(i > index -1){
                newArr[i+1] = arr[i];
            }else{
                newArr[i] = arr[i];
            }
        }

        //Add new value to given index directly
        newArr[index] = element;

        //It will print original given array
        System.out.println("original array");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        //It will print new array
        System.out.println("new array");
        for(int i = 0; i < newArr.length; i++){
            System.out.print(newArr[i] + " ");
        }
    }
}

/*
Write a program to input N numbers array, a number X and a number Y from user and insert an element Y in it at specified position X.
X is based on 1-based indexing

Note: When an element is inserted at position X, all elements that were already present at position >= X,
gets shifted to one position right, not replaced.

Approach:
1. Create new array size of given array + 1 to store new value while retaining old values
2. Assign given array values to new array by shifting all elements one index at right side,
    to make given index vacant for given value
3. Add new value to given index directly

TC: O(N)
SC: O(N)
*/