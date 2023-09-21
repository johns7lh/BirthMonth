import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //A program that asks the user to enter their birth month (integer 1 – 12 inclusive). If the
        //user enters a value in range, the program echoes the input (“Your birth month is: N”) If
        //the value is not in the range it outputs an error msg (“You entered an incorrect month
        //value: N”). Here N should be the value they entered.

        //num birthMonth
        //
        //		Output "Enter the number of your birth month"
        //		Input birthMonth
        //
        //		If birthMonth >=1 AND <=12 then
        //			Output "Your birthMonth is: " +birthMonth
        //		else
        //			Output "That number is not a month, so I couldn't find your month."
        int birthMonth = 0; //[1-12]
        String trash = " ";
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number [1-12] of your birth month");
        if (in.hasNextInt()) {
            birthMonth = (in.nextInt());
            in.nextLine();
            if (birthMonth >= 1 && birthMonth <= 12) {
                System.out.println("Your birthMonth is: " + birthMonth);
            } else {
                System.out.println("That number is not a month, so I couldn't find your month.");


            }
        }

    }
}
