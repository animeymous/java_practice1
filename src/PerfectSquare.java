public class PerfectSquare {
    public static void perfectSquare(int numb){

        int num = 1;
        int square = 0;

        while(square < numb){
            square = num * num;
            if(square > numb){ // have to break loop when square comes bigger than given number
                break;
            }

            System.out.print(square + " "); // Print the perfect square
            num++; // Increment the integer
        }
    }
}

/*Program to print perfect squares below given number */