package GUVITASK.GTask2;

import java.util.Scanner;

public class Account {
    public long accountNumber;
    public double balance;
    Account(){
        balance = 0.0;
    }
    Account(long accountNumber,double balance){
       this.accountNumber = accountNumber;
       this.balance = balance;
    }
    public void deposit(double amount) {
        if(amount>0) {
            balance+=amount;
            System.out.println(amount +"rs.deposited.");
        }
        else {
            System.out.println("Invalid amount.Deposit failed.");
        }
    }

    //withdraw
    public void withdraw(double amount) {
        //logic to impleement
        if(amount>0&& balance>=amount) {
            balance-=amount;
            System.out.println(amount+"rs.withdrawan.");
        }
        else {
            System.out.println("Insufficient balance or invalid amount.Withdrawan failed...");
        }
    }
    public void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Acc num: ");
        long acno = sc.nextLong();
        Account acobj = new Account(acno,500.0);
        acobj.displayBalance();

        double amt1,amt2;
        System.out.print("Enter the amount to deposit: ");
        amt1 = sc.nextDouble();
        acobj.deposit(amt1);
        acobj.displayBalance();

        System.out.print("Enter the amount to Withdrawn: ");
        amt2 = sc.nextDouble();
        acobj.withdraw(amt2);
        acobj.displayBalance();




    }
}

