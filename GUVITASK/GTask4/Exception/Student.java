package GUVITASK.GTask4.Exception;

/*
    Q1. Ramesh is developing a student management system for a university. In thissystem, you have a Student 
    class to represent student information. You are askedto help Ramesh to handle exception 
    which can be occurred into programaccording to following Scenarios:
class Student with attributes roll no, name, age and course. Initialize valuesthrough parameterized constructor.
    If the age of the student is not between 15 and 21 then generate a user-defined exception "AgeNotWithinRangeException"
    If a name contains numbers or special symbols, raise exception"NameNotValidException". Define the two exception classes.
    */

import java.util.Scanner;

public class Student {
    String sname,scourse;//instance variable
    int sage;
    long srollno;

    //throwing both the Customexception in parametrized constructors
    public Student(long srollno,String sname,int sage,String scourse ) throws AgeNoWithinRangeException, NameNotValidException {
        this.srollno = srollno;
        this.sname = sname;
        this.sage = sage;
        this.scourse = scourse;

        if(sage<15 || sage>21){ //checking the rule
            throw new AgeNoWithinRangeException("Age should be b/w 15 and 21," +
                    "\nOtherwise you are not eligible to collect the book");
        }
        if(sname.matches(".*\\d.*")||!sname.matches("^[a-zA-Z]*$")){ //checking the rule
            throw new NameNotValidException("Name should not contain numbers or special characters"+
                    "\nOtherwise you are not eligible to collect the book");
        }


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//get a input from user
        System.out.println("Enter your rollno, name, age, course you want ");
        String name,course;
        int age;
        long rollno;
        rollno = sc.nextLong();
        name = sc.next();
        age = sc.nextInt();
        course = sc.next();

        //Trying with input and catching the error in the catch method
        try{
            Student std = new Student(rollno,name,age,course);
            System.out.println("The book is available, Please collect");
        }
        catch (AgeNoWithinRangeException | NameNotValidException ag) {
            System.out.println(ag.getMessage());
        }


    }
}
