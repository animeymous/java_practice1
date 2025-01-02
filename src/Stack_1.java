import java.util.Stack;

public class Stack_1 {
    public static int balanceParanthesis(String A){
        Stack<Character> st = new Stack<>();

        for(int i = 0; i < A.length(); i++){
            Character currCharacter = A.charAt(i);
            if(currCharacter == '[' || currCharacter == '(' ||currCharacter == '{'){
                st.push(A.charAt(i));
            }else{
                Character popedCharacter = st.peek();

                if(
                        (popedCharacter == '[' && currCharacter == ']')
                        || (popedCharacter == '{' && currCharacter == '}')
                        || (popedCharacter == '(' && currCharacter == ')')
                ){
                    st.pop();
                }else{
                    return 0;
                }
            }
        }
        return 1;
    }
}

/*
Ques: Given an expression string A, examine whether the pairs and the orders of “{“,”}”, ”(“,”)”, ”[“,”]” are correct in A.
Refer to the examples for more clarity.

Approach:
1. create character stack and push OPEN brackets in it.
2. when encounter close bracket then compare it with the peek element in the stack
3. if peek element (open bracket) is matched with the same current element(close bracket) then pop it from stack and move
4. else return 0 if any current (close bracket) does not match with peek (open) bracket

TC: O(N)
SC: O(N)
*/