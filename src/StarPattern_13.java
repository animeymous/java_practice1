public class StarPattern_13 {
    public static void starPattern_13(int row){
        int count = 2;
        for(int i = 1; i <= row * 2; i++){

            if(i < (row * 2) / 2){
                for(int j = 1; j <= i; j++){
                    System.out.print("*");
                }
                System.out.println();
            }else if(i == (row * 2) / 2){
                for(int j = 1; j <= row; j++){
                    System.out.print("*");
                }
                System.out.println();
            }else{
                for(int j = i - count; j >= 1; j--){
                    System.out.print("*");
                }
                count += 2;
                System.out.println();
            }
        }
    }
}

/*
*
**
***
****
*****
******
*******
*******
******
*****
****
***
**
*

TC: O(N^2)
SC: O(1)
*/