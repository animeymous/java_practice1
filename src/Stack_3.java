import java.util.Stack;

public class Stack_3 {
    public static String doubleCheckerTrouble(String A){

        //character stack to store characters
        Stack<Character> st = new Stack<>();

        //to storing stack characters together
        StringBuilder result = new StringBuilder();

        //loop to removed adjustment element from the string using stack
        for(int i = 0; i < A.length(); i++){
            Character currCharacter = A.charAt(i);

            if(st.empty()){ // if stack is empty, push element directly
                st.push(currCharacter);
            }else{
                Character topStackCharacter = st.peek(); // get top element
                if(topStackCharacter.equals(currCharacter)){  // compare it with current element
                    st.pop(); // if matched then remove it from stack
                }else{
                    st.push(currCharacter); // if not, then push it in the stack
                }
            }
        }

        //loop to store all characters from the stack in to string by concatenation
        for (Character character : st) {
            result.append(character);
        }

        return result.toString();
    }
}

/*
Ques: You have a string, denoted as A.
    To transform the string, you should perform the following operation repeatedly:
        1.Identify the first occurrence of consecutive identical pairs of characters within the string.
        2.Remove this pair of identical characters from the string.
        3.Repeat steps 1 and 2 until there are no more consecutive identical pairs of characters.
    The final result will be the transformed string.

Approach:
1. create stack of Integer and loop through string / array,
2. if stack is empty, directly push current element, if not then first verify current element exist in stack or not.
3. if yes then pop that element and move ahead, if not then push current element in stack

TC: O(N)
SC: O(N)
*/
