public class LCM {
    public static void lcm(int num1, int num2){
        int count = 2;

        for(int i= 2; true; i++){
            if(i % num1 == 0 && i % num2 == 0){
                System.out.println(i);
                break;
            }
        }
    }
}

//Print LCM of a given numbers
