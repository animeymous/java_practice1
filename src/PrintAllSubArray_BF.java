public class PrintAllSubArray_BF {
    public static void printAllSubArray_BF(int [] arr){

        //fix starting point
        for(int start = 0; start < arr.length; start++){

            //fix ending point
            for(int end = start; end < arr.length; end++){

                //print from starting to ending
                for(int i = start; i <= end; i++){
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}

/*
Ques: Print all sub arrays for array

Approach: brute force
1. fix starting point
2. fix ending point
3. print from starting to ending

TC: O(N^3)
SC: O(1)
*/