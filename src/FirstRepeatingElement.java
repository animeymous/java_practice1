import java.util.HashMap;
import java.util.Map;

public class FirstRepeatingElement {
    public static int firstRepeatingElement(int [] arr){

        //Map to store frequency of the elements
        Map<Integer, Integer> hm = new HashMap<>();

        //loop to find frequency of elements
        for(int i = 0; i < arr.length; i++){
            if(hm.containsKey(arr[i])){
                int value = hm.get(arr[i]);
                value++;
                hm.put(arr[i], value);
            }else {
                hm.put(arr[i], 1);
            }
        }

        //find first element in array which have frequency > 1
        for(int i = 0; i < arr.length; i++){
            if(hm.get(arr[i]) > 1){
                return arr[i];
            }
        }

        return -1;
    }
}

/*
 * Ques: Given an integer array A of size N, find the first repeating element in it.
 * We need to find the element that occurs more than once and whose index of the first occurrence is the smallest.
 * If there is no repeating element, return -1.

 * Approach:
 * 1: Find frequency of elements, put in HashMap
 * 2: find first element in array which have frequency > 1
 *
 * TC: O(N)
 * SC: O(N)
 * */