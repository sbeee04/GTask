package GUVITASK.GTask2;

import java.util.Scanner;

public class Product_m {
    public static void main(String[] args) {
        //Read input from user using scanner class obj
        Scanner sc = new Scanner(System.in);

        //Creation of 5 product info by 5 users
        Product_c products[] = new Product_c[5];

        int pid;double price = 0;int quantity;


        // Accept product information from the user and store it in an array
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter Product ID:");
            pid = sc.nextInt();
            System.out.println("Enter Price:");
            price = sc.nextDouble();
            System.out.println("Enter Quantity:");
            quantity = sc.nextInt();
            products[i] = new Product_c(pid, price, quantity);
        }

        // call a method to find maxprice for the producct id
        int maxprice = findMax(products);
        System.out.println("Product ID with the highest price: "+maxprice+"with price is "+price);

       //call a method to find total amount spend on all products
        double totamt = totAmt(products);
        System.out.println("Total amount spent on all products: " +totamt);


    }

    public static int findMax(Product_c[] prod) {
       int maxid = -1;
       double maxP = Double.MIN_VALUE;

       for(Product_c p:prod){
           if(p.price>maxP){
               maxP = p.price;
               maxid = p.pid;
           }
       }
       return maxid;
    }

    public static double totAmt(Product_c[] prod){
        double totPr = 0.0;
        for(Product_c p:prod){
            totPr += (p.price*p.quantity);
        }
        return totPr;
    }

}
