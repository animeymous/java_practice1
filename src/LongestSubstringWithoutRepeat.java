import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeat {
    public static int longestSubstringWithoutRepeat(String A){

        //Hashset to store unique elements
        Set<Character> hs = new HashSet<Character>();

        int answer = 0; //will store length of longest string
        int start = 0;  //set it to 0 so that we can remove element from left till duplicate element

        //we will start from left till end of the string
        for(int end = 0; end < A.length(); end++){

            //if element in HashSet then remove from left till its brother/duplicate gets removed
            while(hs.contains(A.charAt(end))){
                hs.remove(A.charAt(start));
                start++;
            }

            //add new element
            hs.add(A.charAt(end));

            //compare length
            answer = Math.max(answer, hs.size());
        }

        return answer;
    }
}

/*
* Ques: Determine the "GOOD"ness of a given string A, where the "GOOD"ness is defined by the length of the longest substring
* that contains no repeating characters. The greater the length of this unique-character substring,
* the higher the "GOOD"ness of the string.
* Your task is to return an integer representing the "GOOD"ness of string A.
* Note: The solution should be achieved in O(N) time complexity, where N is the length of the string.
*
* Approach:
* 1: start from 0th element, move towards right side
* 2: add element in HashSet one by one, till you find duplicate element
* 3: Remove element from left till you remove that duplicate element
* 4: increase answer by 1 in every unique element
*
* TC: O(N)
* SC: O(N)
* */