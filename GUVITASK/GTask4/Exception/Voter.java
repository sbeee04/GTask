package GUVITASK.GTask4.Exception;

/*
Q2. Create a class Voter(voterId, name, age) with parameterized constructor. The
parameterized constructor should throw a checked exception if age is less than 18.
The message of exception is "invalid age for voter*
*/
import java.util.Scanner;

public class Voter {
    int vage;
    String vid,vname;

    //throwing the Customexception in parametrized constructors
    public Voter(String vid, String vname, int vage) throws AgeNoWithinRangeException {
        this.vid = vid;
        this.vname = vname;
        this.vage = vage;

        if(vage<18){//checking the condition
            throw new AgeNoWithinRangeException("Invalid age for voter" +
                    "\nVoter must have 18 age or above to vote");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//get a input from user
        System.out.println("Enter your Voter ID Name Age ");
        int age;
        String id, name;
        id = sc.next();
        name = sc.next();
        age = sc.nextInt();

        //Trying with input and catching the error in the catch method
        try {
            Voter voter = new Voter(id,name,age);
            System.out.println("Please select your fav candiate to vote");
        }
        catch (AgeNoWithinRangeException ag){
            System.out.println(ag.getMessage());
        }
    }
}
