import java.util.HashMap;
import java.util.Stack;

public class Stack_4 {
    public static String doubleCheckerTrouble_2(String A, int k) {

        //stack to store characters
        Stack<Character> st = new Stack<>();

        //hashmap to store the unique characters and there occurrence in the string
        HashMap<Character, Integer> hm = new HashMap<>();

        //new string to store final modified string
        StringBuilder sb = new StringBuilder();

        //loop tp perform logic
        for (int i = 0; i < A.length(); i++) {

            Character currCharacter = A.charAt(i); //current character

            st.push(currCharacter); // push it in the stack

            if (hm.containsKey(currCharacter)) { // check if current character already exists in hashmap or not
                hm.put(currCharacter, hm.get(currCharacter) + 1); // if exists, increase count of character
            } else {
                hm.put(currCharacter, 1); // if not, then push character inside hashmap
            }

            if (hm.get(currCharacter) == k) { // if current character's count is equal to "k" we will remove all pairs

                Stack<Character> tempStack = new Stack<>(); // temp stack to store character apart from current

                while (!st.isEmpty()) { // filling temp stack
                    Character top = st.pop();
                    if (top != currCharacter) {
                        tempStack.push(top);
                    }
                }

                // Restore the stack without the removed character
                while (!tempStack.isEmpty()) {
                    st.push(tempStack.pop());
                }

                // Remove the character from the hashmap
                hm.remove(currCharacter);
            }
        }

        // creating new modified string after removing "K" common paris
        for(Character character: st){
            sb.append(character);
        }

        return sb.toString(); //converting string builder in string and returning it
    }
}

/*
Ques: You have a string, denoted as A.
    To transform the string, you should perform the following operation repeatedly:
        1. Identify If any character in string have occurrence "K", needs to be popped out from the string.
        2. Remove that pair of elements which have occurrence "K"
        3. Repeat steps 1 and 2 until there are no more pairs of characters size K.
    The final result will be the transformed string.

Approach:
1. create hashmap to store frequency of elements and stack of Integer to store elements and loop through string / array,
2. if stack is empty, directly push current element in stack and hashmap with count 1,
3. if not push it in stack and increase count in the hashmap for that element
4. then match count of element with the "K", if it matches then make one temporary stack
5. push unique element in temp stack and remove all from original stack, then push all element from temp to original stack
3. keep doing it until string from empty then return modified string

TC: O(N)
SC: O(N)
*/
