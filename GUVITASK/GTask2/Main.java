package GUVITASK.GTask2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Employee Name: ");
        String ename = sc.nextLine();

        System.out.print("Enter the Employee Age: ");
        int e_age = sc.nextInt();

        System.out.print("Enter the Employee ID: ");
        int eid = sc.nextInt();

        System.out.print("Enter the salary: ");
        double e_sal = sc.nextDouble();

        Employee employee = new Employee(ename,e_age,eid,e_sal);
        employee.displayEmployeeInfo();



    }
}
