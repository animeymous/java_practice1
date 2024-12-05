public class BinarySearch_3 {
    public static int binarySearch_3(int [] sortedArr, int k){
        int ans = -1;
        int left = 0;
        int right = sortedArr.length - 1;

        //loop to search kth last occurrence
        while(left <= right){
            int mid = (right + left) / 2;

            if(sortedArr[mid] == k ){
                ans = mid ; //update answer with latest inx of the kth
                left = mid + 1; //we have to find last occurrence for than we will search in right side by adjusting left pointer

            } else if (sortedArr[mid] < k) {
                left = mid + 1; // update left idx

            }else{
                right = mid - 1; // update right idx
            }
        }

        return ans;
    }
}

/*
 * Ques: All emails in your mailbox sorted chronologically, can you find last email that you received in Kth year?
 * BF: Linear search
 * 1. traverse whole array
 * 2. check every element if sortedArr[i] == 'k' or not // example 2020
 * 3. then update answer with latest idx of Kth value
 * 3. return index if found element or -1 if not
 * TC: O(N)
 * SC: O(1)
 *
 * optimised: Binary Search
 * 1. set left and right indexes to decide range where to search for 'k'
 * 2. loop until left becomes greater than right
 * 3. check for conditions with if else (check logic in code) and update ans with index
 * TC: O(logN)
 * SC: O(1)
 */
