package GUVITASK.Gtask5;

/*
You are a teacher in school.In your class there are 10 students ,
you have decided to give special gifts to those students whose names start with "A".
you are asked to separate those students with the help of a javaprogram.
Requirement:
Use List interface to store the student name
Use a lambda expression and the Stream API to filter the students
 */

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StudentGifts {
    public static void main(String[] args) {
        //use to take the inputs from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Strength of the class: ");
        int strength = sc.nextInt();
        List<String> names = new ArrayList<>();

       //create and add the student in the names list
        for(int i=1;i<=strength;i++){
            System.out.print("Enter student name #" + i + ": ");
            String name = sc.next();
            names.add(name);
        }

        //Print the student name details
        System.out.println("The students in the class: "+names);


        // Use a lambda expression and Stream API
        // to filter students with names starting with "A"
        List<String> studentsWithNamesStartingWithA = names.stream()
                .map(String::toUpperCase)
                .filter(n->n.startsWith("A"))
                .collect(Collectors.toList());


        // Print the students with names starting with "A"
        System.out.println("Students with names starting with 'A':");
        studentsWithNamesStartingWithA.forEach(System.out::println);




    }
}
