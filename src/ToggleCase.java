public class ToggleCase {
    public static void toggleCase(String str){
        String dummyStr = "";

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
                dummyStr += (char)(str.charAt(i) - 32);
            }else{
                dummyStr += (char)(str.charAt(i) + 32);
            }
        }

        System.out.print(dummyStr);
    }
}

/*Unoptimised code
* It will take O(N2) time and O(N) space
*/
