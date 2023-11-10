package GUVITASK.Gtask5;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
Write a program to check whether the Strings in the List are empty or not
and print the list having non-empty strings. If the given List is: Liststrings
Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
 */
public class StringEmptyCheck {
    public static void main(String[] args) {
        //use to take the inputs from user
        Scanner sc = new Scanner(System.in);

        // Prompt user for input
        System.out.println("Enter a list of strings separated by commas:");
        String inputs = sc.nextLine();

        // Convert user input to a stream of strings
        Stream<String> streamInput = Stream.of(inputs.split(","));

        // Filter non-empty and non-blank strings using stream
        List<String> result = streamInput.filter(s -> !s.isBlank())
                .collect(Collectors.toList());

        // Print the list of non-empty and non-blank strings
        System.out.println(result);


    }

}
