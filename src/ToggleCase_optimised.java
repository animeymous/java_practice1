public class ToggleCase_optimised {
    public static void toggleCase_optimised(String str){
        char [] dummyChar = str.toCharArray();
        for(int i = 0; i < dummyChar.length; i++){
            if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
                dummyChar[i] = (char)(str.charAt(i) - 32);
            }else{
                dummyChar[i] = (char)(str.charAt(i) + 32);
            }
        }

        for(int i = 0; i < dummyChar.length; i++){
            System.out.print(dummyChar[i]);
        }
    }
}


/*Optimised code
* it will take O(N) time and O(N) space
*/
