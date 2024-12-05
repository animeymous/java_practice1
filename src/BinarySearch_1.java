public class BinarySearch_1 {
    public static int binarySearch_1(int [] sortedArr, int k){

        // set left and right indexes to decide range where to search for 'k'
        int left = 0; // first index
        int right = sortedArr.length - 1; // last index

        //loop until left becomes greater than right
        while(left <= right){

            int middle_index = right + left / 2;

            if(sortedArr[middle_index] == k ){
                return middle_index; // return idx if mid element is 'k'

            } else if (sortedArr[middle_index] < k) {
                left = middle_index + 1; // update left idx

            }else{
                right = middle_index - 1; // update right idx
            }
        }
        return -1; // return -1 if element does not found
    }
}

/*
* Ques: Given a sorted array of integers, find element 'k' is present or not, return index of 'k' or -1 if not present.
* BF: Linear search
* 1. traverse whole array
* 2. check every element if sortedArr[curr] == k or not
* 3. return index if found element or -1 if not
* TC: O(N)
* SC: O(1)
*
* optimised: Binary Search
* 1. set left and right indexes to decide range where to search for 'k'
* 2. loop until left becomes greater than right
* 3. check for conditions with if else (check logic in code)
* TC: O(logN)
* SC: O(1)
*/