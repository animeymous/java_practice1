import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DistinctNumbersInWindow {
    public static ArrayList<Integer> distinctNumbersInWindow(int [] A, int B){
        ArrayList<Integer> al = new ArrayList<>(); // ArrayList to store elements dynamically

        //edge case
        if(B > A.length){
            return al;
        }

        //HashMap for storing frequency of elements
        Map<Integer, Integer> hm = new HashMap<>();

        int distinctNum = 0; // count of unique/distinct elements in window

        //loop to count first B element's frequency
        for(int i = 0; i < B; i++){
            if(hm.containsKey(A[i])){
                int value = hm.get(A[i]);
                value++;
                hm.put(A[i], value);
            }else{
                hm.put(A[i], 1);
                distinctNum++;
            }
        }

        al.add(distinctNum); // added first B window distinct element's count

        //loop to count distinct elements in next B windows
        for(int i = B; i < A.length; i++){
            int previous = A[i - B];  // element which needs to be removed
            int next = A[i];  // element needs to be added in next window

            //remove previous(first element of window) element
            if(hm.containsKey(previous)){
                int value = hm.get(previous);
                if(hm.get(previous) == 1){
                    hm.remove(previous);  // remove element
                    distinctNum--;
                }else{
                    hm.put(previous, value - 1); // decrease frequency if element is already there
                }
            }

            //add next element of the next window
            if(hm.containsKey(next)){
                int value = hm.get(next);

                hm.put(next, value + 1);  // increase frequency if element is already there
            }else{
                hm.put(next, 1); // add distinct element
                distinctNum++;
            }

            al.add(distinctNum);
        }

        return al;
    }
}

/*
 * Ques: You are given an array of N integers, A1, A2 ,..., AN and an integer B. Return the of count of distinct
 * numbers in all windows of size B.
 * Formally, return an array of size N-B+1 where i'th element in this array contains number of distinct elements in sequence Ai,
 * Ai+1 ,..., Ai+B-1.
 * NOTE: if B > N, return an empty array.
 *
 * Example:  A = [1, 2, 1, 3, 4, 3], B = 3
 *
 * Approach: Hashing
 * 1: Use HashMap for this approach, store first distinct elements in HashMap and distinct element count in array
 * 2: In next loop, remove previous element from window and add next element in the window.
 * 3: count distinct in each window and add it in array
 *
 * TC: O(N)
 * SC: O(N)
 * */