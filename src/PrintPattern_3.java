public class PrintPattern_3 {
    public static void printPattern_3(int row){
        int count = 1;
        for(int i = row; i >= 1; i--){
            for(int j = i -1; j >= 1; j--){
                System.out.print("0"+" ");
            }

            int rowValue = i;
            for(int j = 0; j < count; j++){
                System.out.print(rowValue+" ");
                rowValue = rowValue + i;
            }

            count += 2;

            for(int j = i -1; j >= 1; j--){
                System.out.print("0"+" ");
            }

            System.out.println();
        }
    }
}

/*
0 0 0 0 5 0 0 0 0
0 0 0 4 8 12 0 0 0
0 0 3 6 9 12 15 0 0
0 2 4 6 8 10 12 14 0
1 2 3 4 5 6 7 8 9

TC: O(N^2)
SC: O(1)
*/