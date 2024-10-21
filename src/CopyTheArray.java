public class CopyTheArray {
    public static void copyTheArray(int [] arr, int B){
        //Create new array with same size as given array
        int [] copyArray = new int [arr.length];

        //Copy all elements one by one from given array to new array and add B into it
        for(int i = 0; i < arr.length; i++){
            copyArray[i] = arr[i] + B;
        }

        System.out.println("original array");
        for (int j : arr) {
            System.out.print(j + " ");
        }

        System.out.println();
        System.out.println("copied array");

        for (int j : copyArray) {
            System.out.print(j + " ");
        }
    }
}

/*Y
Ques: you are given a constant array A and an integer B.
You are required to return another array where outArr[i] = A[i] + B.

Approach:
1. Create new array with same size as given array
2. Copy all elements one by one from given array to new array and add B into it

TC: O(N);
SC: O(N);
*/