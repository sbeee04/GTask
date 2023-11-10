package GUVITASK.Gtask5;

/*

Write a program using map( method,to convert a list of Strings into
Uppercase.If the g given List i is: Stream names Stream.ofC" "aBc"," "d",' "ef");

*/

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMapUppercase {
    public static void main(String[] args) {
        //use to take the inputs from user
        Scanner sc = new Scanner(System.in);

        // Prompt user for input
        System.out.println("Enter a list of strings separated by commas:");
        String inputs = sc.nextLine();

        // Convert user input to a stream of strings
        Stream<String> namestream = Stream.of(inputs.split(","));

        // Convert to uppercase using map
        List<String> result =  namestream.map(String::trim)
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        //Print the result
        System.out.println("Uppercase List: " + result);

    }
}



