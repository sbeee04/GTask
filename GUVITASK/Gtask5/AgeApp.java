package GUVITASK.Gtask5;

/*
Rajesh has been given a task to create an app which takes the user'sbirthdate as input
 and calculates their age , you have to help him to build
 this app using the java.time.LocalDate class.
 Input:Enter your birthdate (yyyy-mm-dd): 1990-05-15
 Output:Your age is: 33 years, 4 months, and 13 days.
 */
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AgeApp {

    public static String CalcAge(LocalDate dob){
        //Used to find the curr date
        LocalDate curr = LocalDate.now();

        //check if the given input is in past
        //or the given date's month value b/w 1 and 12 and day value b/w 1 and 31.
        if(dob.isAfter(curr) || dob.getYear()<1900 || dob.getMonthValue()>12 || dob.getDayOfMonth()>31){
            throw new IllegalArgumentException("Invalid date. Please enter a valid date in the yyyy-MM-dd format.");
        }

        //compare and get the year month days details using Period
        else if ((curr != null) && (dob != null)) {
                return String.valueOf((Period.between(dob, curr).getYears()) + "Years," +
                        (Period.between(dob, curr).getMonths()) + "Months," +
                        (Period.between(dob, curr).getDays()) + "Days.");
            }

        return null;
    }

    public static void main(String[] args) {
        // Create a Scanner object to get user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your DOB in YYYY-MM-DD format: ");
        //User date pf birth
        String DOB = sc.nextLine();

        // call the method in try and catch the error if present in
        // catch method for efficient coding

        try {
            // Parse the user's input into a LocalDate object
            LocalDate dob = LocalDate.parse(DOB);
            System.out.println("Your Age is: "+CalcAge(dob));
        }
         catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
