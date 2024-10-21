import java.util.Scanner;

public class SearchElement {
    public static void searchElement(int test, int size, int B){
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < test; i++){
            System.out.println("Pass array of "+size);

            //Create array of given size
            int [] arr = new int [size];

            //Initialise array
            for(int j = 0; j < size; j++){
                arr[j] = sc.nextInt();
            }

            //Find element
            boolean found = false;
            for(int k = 0; k < arr.length; k++){
                if(arr[k] == B){
                    found = true;
                    break;

                }
            }

            if(found){
                System.out.println("Element found");
            }else{
                System.out.println("Element not found");
            }
        }

        sc.close();
    }
}

/*
You are given an integer T (number of test cases). You are given array A and an integer B for each test case.
You have to tell whether B is present in array A or not.

Approach:
1. Start loop from 0 to till number of given test cases
2. Create array and initialise its value taking input from user
3. start loop and find element

TC: O(Test * Size) = O(N^2);
SC: O(N);
*/