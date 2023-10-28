package GUVITASK.GTask2;

import java.util.Scanner;

public class Person {
   static int age = 18;
    String name;

    Person(String name){
        this.name = name;
        this.age = age;
    }

    public void display(){
        System.out.println("Your Name is "+name);
        System.out.println("Your Age "+age);
    }

    public static void main(String[] args) {

        //Read input from user using scanner class obj
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Person Name: ");
        String Name = sc.nextLine();
        //person obj creation
        Person pobj = new Person(Name);
        pobj.display();


    }
}
