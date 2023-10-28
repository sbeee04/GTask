package GUVITASK.GTask1;

public class GTask1_5 {
    public void discount(double amount){

        if (amount>=500 && amount<1000) {
            System.out.println("10% Discount is Applied");
        }
        else if(amount>1000){
            System.out.println("20% Discount is Applied");
        }
        else{
            System.out.println("No Discount is Applied");
        }
    }
}
