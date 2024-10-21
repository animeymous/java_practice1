public class FrequencyOfXInArray {
    public static void frequencyOfXInArray(int [] arr, int X){
        //Variable to count frequency;
        int frequency = 0;

        //Function to check frequency of X
        for(int element: arr){
            if(element == X){
                frequency++;
            }
        }

        System.out.println("Frequeny of "+X+" is : "+frequency);
    }
}

/*
Ques: Given an integer array A. Find and return the frequency of number B in array A.

Approach:
1. Create variable to count frequency
2. Start loop to check frequency of X

TC: O(N);
SC: O(1);
*/