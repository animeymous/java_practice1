import java.nio.file.StandardWatchEventKinds;
import java.util.Stack;

public class Stack_5 {
    public static int passingGame(int A, int B, int [] C){

        //stack to store elements
        Stack<Integer> st = new Stack<>();

        //push the id of the player who have football first
        st.push(B);

        //loop to push footballer's id in the stack and remove it if they pass it to other
        for (int j : C) {
            if (j == 0 && !st.empty()) {
                st.pop();
            } else {
                st.push(j);
            }
        }
        return st.peek();
    }
}

/*
Ques: There is a football event going on in your city. In this event, you are given A passes and players having ids between 1 and 106.
      Initially, some player with a given id had the ball in his possession.
      You have to make a program to display the id of the player who possessed the ball after exactly A passes.

      There are two kinds of passes:
      1) ID
      2) 0

      For the first kind of pass, the player in possession of the ball passes the ball "forward" to the player with id = ID.
      For the second kind of pass, the player in possession of the ball passes the ball back to the player who had forwarded the ball to him.
      In the second kind of pass "0" just means Back Pass.
      Return the ID of the player who currently possesses the ball.

Approach:
1. create stack of Integer and loop through string / array,
2. push the id of the player who have holding ball first, then loop through the array
3. push one by one id of the player and remove/pop it if encounter 0 = means back to previous player

TC: O(N)
SC: O(N)
*/