package GUVITASK.GTask4.Exception;

/*
Q3. day exception Store position and name from give of user proper 
weekdays and message in print an if day array user name. 
enter (starting day Handle from index array "Sunday" 
outside index at range 0 index). (0-6)
*/
import java.util.Scanner;

public class Week {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//get a input from user
        String week[] = {"Sunday","Monday","Tuesday","Wednesday",
                "Thrusday","Friday","Saturday"};

        int ch;
        //Trying with input and catching the error in the catch method
        try{
            System.out.println("Enter your Weekdays index starts from 0-6");
            ch = sc.nextInt();
            //printing the day with some messages.....
            switch (ch){
                case 0:
                    System.out.println( week[0]+", Funday....");
                    break;

                case 1:
                    System.out.println(week[1]+", Get Ready Guys....:(");
                    break;
                case 2:
                    System.out.println(week[2]+", Face it");
                    break;
                case 3:
                    System.out.println(week[3]+", Keep Running....!");
                    break;
                case 4:
                    System.out.println(week[4]+", Keep Calm....");
                    break;

                case 5:
                    System.out.println(week[5]+", Prepare for the weekend");
                    break;

                case 6:
                    System.out.println(week[6]+", Enjoy the weekend");
                    break;
                default:
                    throw new ArrayIndexOutOfBoundsException("Please choose the right input");

            }

        }
        catch (ArrayIndexOutOfBoundsException are){
            System.out.println("ArrayIndexOutofBound"+
                    "\nWeek days starts from 0 to 6");

        }
    }
}

