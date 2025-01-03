import java.util.Stack;

public class Stack_2 {
    public static  int evaluateExpression(String [] A){
        //integer stack to store integers from string by converting them
        Stack<Integer> st = new Stack<>();

        //loop to push elements into stack and calculate when encounter operation
        for(int i = 0; i < A.length; i++){
            String currCharacter = A[i];

            //if we encounter operation then we will pop two elements, calculate and again push the result in stack
            if(
                    currCharacter.equals("/")
                    || currCharacter.equals("*")
                    || currCharacter.equals("+")
                    || currCharacter.equals("-")
            ){
                if (st.size() < 2) {
                    throw new IllegalArgumentException("Invalid Reverse Polish Notation expression.");
                }

                int element_b = st.pop();
                int element_a = st.pop();

                int evaluation = evaluate(element_a, element_b, currCharacter); //function to calculate
                st.push(evaluation); //pushing result into stack again
            }else{
                st.push(Integer.parseInt(currCharacter)); // parsing character into number before pushing new character
            }
        }

        return st.peek(); // returning the last value inside stack
    }

    // function to evaluate expression
    private static int evaluate(int first, int second, String operation){

        //performing operation based on operator
        return switch (operation) {
            case "/" -> first / second;
            case "*" -> first * second;
            case "+" -> first + second;
            case "-" -> first - second;
            default -> 0;
        };
    }
}

/*
Ques: An arithmetic expression is given by a string array A of size N. Evaluate the value of an arithmetic expression in Reverse Polish Notation.
      Valid operators are +, -, *, /. Each string may be an integer or an operator.

Note: Reverse Polish Notation is equivalent to Postfix Expression, where operators are written after their operands.

Approach:
1. create stack of Integer and loop through string / array,
2. if element is number then convert it number and push inside stack.
3. if element is operator then pop 2 elements and perform operation, then push result into the same stack again.

TC: O(N)
SC: O(N)
*/
