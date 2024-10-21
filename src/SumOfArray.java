public class SumOfArray {
    public static void sumOfArray(int [] arr){
        int sum = 0;

        for(int item : arr){
            sum += item;
        }

        System.out.println("Sum of given array : "+sum);
    }
}
