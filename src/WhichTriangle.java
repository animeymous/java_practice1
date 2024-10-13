public class WhichTriangle {
    public static void whichTriangle(int num1, int num2, int num3){
        if(num1 == num2 && num1 == num3){
            System.out.println("equilateral");
        }else if(num1 == num2 || num2 == num3 || num3 == num1){
            System.out.println("isosceles");
        }else {
            System.out.println("scalene");
        }
    }
}

/*Program to print triangle based on input*/