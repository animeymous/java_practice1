public class StarPattern_11 {
    public static void starPattern_11(int row){
        int count = 0;
        for(int i = 0; i < row; i++){
            for(int j = 0; j < count; j++){
                System.out.print("_");
            }
            count++;
            for(int j = 0; j < row - i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

/*
*****
_****
__***
___**
____*

TC: O(N^2)
SC: O(1)
*/