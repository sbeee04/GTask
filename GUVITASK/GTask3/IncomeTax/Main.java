package GUVITASK.GTask3.IncomeTax;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int eid,pid;
        String e_name;
        double e_sal,p_price,p_qua;
        System.out.println("Enter Employee id, Name, Salary");
        eid = sc.nextInt();
        e_name = sc.next();
        e_sal = sc.nextDouble();
        Taxable tobj1 = new Employee(eid,e_name,e_sal);
        tobj1.calcTax();

        System.out.println("");
        System.out.println("=============================================");
        System.out.println("");

        System.out.println("Enter Product id, Product Price, Product Quantity");
        pid = sc.nextInt();
        p_price = sc.nextDouble();
        p_qua = sc.nextDouble();
        Taxable tobj2 = new Product(pid,p_price,p_qua);
        tobj2.calcTax();
        }



}
