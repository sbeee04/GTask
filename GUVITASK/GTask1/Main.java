package GUVITASK.GTask1;



import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Read input from user using scanner class obj
        Scanner sc = new Scanner(System.in);
        //create a input to get a user decision to choose a pgm
        int choice;
        do{
            System.out.println("\n1.Basic Loop Pgm\n2.Positive or Negative Number" +
                    "\n3.Reverse a Number\n4.Smallest number among three numbers" +
                    "\n5.Purchase Discount Pgm\n6.Pattern Printing\n7.Exit");
            System.out.print("Enter your Task number ");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    GTask1_1 t1 = new GTask1_1();
                    System.out.println("Basic Loop Pgm");
                    int a,b;
                    System.out.print("Enter the starting number ");
                    a = sc.nextInt();
                    System.out.print("Enter the ending number ");
                    b = sc.nextInt();
                    t1.loop(a,b);
                    break;

                case 2:
                    GTask1_2 t2 = new GTask1_2();
                    System.out.println("Positive or Negative Number");
                    System.out.print("Enter the number ");
                    long num = sc.nextInt();
                    System.out.println(t2.find(num));

                    break;

                case 3:
                    GTask1_3 t3 = new GTask1_3();
                    System.out.println("Reverse a Number");
                    System.out.print("Enter the number ");
                    long number = sc.nextInt();
                    System.out.println("Reversed format "+t3.reversDigits(number));
                    break;

                case 4:
                    GTask1_4 t4 = new GTask1_4();
                    System.out.println("Smallest number among three numbers");
                    System.out.print("Enter the 1st number ");
                    int one = sc.nextInt();
                    System.out.print("Enter the 2nd number ");
                    int two = sc.nextInt();
                    System.out.print("Enter the 3rd number ");
                    int three = sc.nextInt();
                    System.out.println("The smallest number is "+t4.findbig(one,two,three));
                    break;

                case 5:
                    GTask1_5 t5 = new GTask1_5();
                    System.out.println("Purchase Discount Pgm");
                    System.out.print("Enter your purchase amount ");
                    double amt = sc.nextInt();
                    t5.discount(amt);
                    break;

                case 6:
                    GTask1_6 t6 = new GTask1_6();
                    System.out.println("Pattern Printing");
                    System.out.print("Enter the number ");
                    int n = sc.nextInt();
                    t6.pattern(n);
                    break;


            }
        }
        while(choice!=7);

    }
}
