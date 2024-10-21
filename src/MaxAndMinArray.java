public class MaxAndMinArray {
    public static void maxAndMinArray(int [] arr){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }else if(arr[i] < min){
                min = arr[i];
            }
        }

        System.out.print("Max : "+max+" Min : "+min);
    }
}


/*Take input an array A of size N and write a program to print maximum and minimum elements of the input.
The only line of the input would contain a single integer N that represents the length of the array followed
by the N elements of the input array A.

Approach:
1. Create two variable, Max and Min and assign them Integer.MIN_VALUE and Integer.MAX_VALUE
    it will ensure that value does not get affected by 0
2. Start loop and check every element whether they are Max or Min and update variables accordingly

TC: O(N);
SC: O(1)
*/