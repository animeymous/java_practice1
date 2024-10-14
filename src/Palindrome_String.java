public class Palindrome_String {
    public static boolean palindrome_String(String str){
        char [] dummyString = str.toCharArray();
        int left = 0;
        int right = dummyString.length - 1;

        while(left <= right){

            if(dummyString[left] != dummyString[right]){
                return false;
            }

            left++;
            right--;
        }
        return true;
    }
}

/*
* Using two pointer approach here
* Time O(N) space O(N)
*/