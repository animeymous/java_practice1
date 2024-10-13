public class ElectricityBill {
    public static void electricityBill(double n){
        if(n >= 250){
            double total = (50 * 0.5) + (100 * 0.75) + (100 * 1.20) + (n - 250) * 1.50;
            double percentage = (total / 100) * 20;
            System.out.println((int)(total + percentage));
        }else if(n >= 200 && n < 250){
            double total = (50 * 0.5) + (100 * 0.75) + (n - 150) * 1.20;
            double percentage = (total / 100) * 20;
            System.out.println((int)(total + percentage));
        }
        else if(n > 150 && n <= 200){
            double total = (50 * 0.5) +  (100 * 0.75) + (n - 150) * 1.20;
            double percentage = (total / 100) * 20;
            System.out.println((int)(total + percentage));
        }else if(n > 100 && n <= 150){
            double total = (50 * 0.5) +  (100 * 0.75) + (n - 150) * 1.20;
            double percentage = (total / 100) * 20;
            System.out.println((int)(total + percentage));
        }else if(n > 50 && n <= 100){
            double total = (50 * 0.5) + (n - 50) * 0.75;
            double percentage = (total / 100) * 20;
            System.out.println((int)(total + percentage));
        }else if(n <= 50){
            double total = n * 0.5;
            double percentage = (total / 100) * 20;
            System.out.println((int)(total + percentage));
        }
    }
}

/*
Instructions are give on Electricity biil that :
2. For next 100 units Rs. 0.75/unit.
3. For next 100 units Rs. 1.20/unit.
4. For above 250 units Rs. 1.50/unit.
5. An additional surcharge of 20% is added to the bill.
NOTE: As the electricity bill can have any real value (floating point), you have to tell the Integral value of the bill. For eg. Integral value of 2.91 is 2.
 */