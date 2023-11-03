package GUVITASK.GTask4.Collections;

import java.util.HashMap;
import java.util.Scanner;

public class Student{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//get a input from user
        int ch,grade;
        String name;
        //creation of HashMap with string key and integer values
        HashMap<String,Integer> shp = new HashMap<>();

        //while loop for decide anything from menu by user
        while(true){
            System.out.println("Menu:");
            System.out.println("1. Add a Student");
            System.out.println("2. Remove a Student");
            System.out.println("3. Display a Students grade details");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            ch = sc.nextInt();

            // switch mechanism used to add remove search display the hashmap with user decisions
            switch (ch){
                //add student in hashmap
                case 1:
                    System.out.print("Enter the Student name: ");
                    name = sc.next();
                    System.out.print("Enter the Student grade: ");
                    grade = sc.nextInt();
                    shp.put(name,grade);
                    System.out.println(name+" was added with grade of "+grade);
                    break;
                //remove studem from the hashmap
                case 2:
                    System.out.print("Enter the Student name to remove: ");
                    name = sc.next();
                    if(shp.containsKey(name)){
                        shp.remove(name);
                        System.out.println(name+" was removed");
                    }
                    else{
                        System.out.println(name+" was not found/already removed");
                    }
                    break;
                //search the student in the hashmap by name
                case 3:
                    System.out.println("Enter the Student name to display with their grade");
                    name = sc.next();
                    if(shp.containsKey(name)){
                        int dispgrad = shp.get(name);
                        System.out.println(name+"'s grade is "+dispgrad);
                    }
                    else{
                        System.out.println(name+" was not found/already removed");
                    }
                    break;

                // exit from the program
                case 4:
                    break;

                // indicates the user to enter the right input
                default:
                    System.out.println("Please choose the one available in the menu");
                    break;
            }

        }
    }
}