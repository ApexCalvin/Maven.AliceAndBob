/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Scanner;
public class Main {

    public static void main(String[] args ){

        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter your name: ");

        String name = userInput.nextLine();

        System.out.println("Your name is: " + name);

        name = name.toLowerCase();

        if (name.equals("alice") || name.equals("bob")) {
            System.out.println("Hello there!");
        }
        else {
            System.out.println("Good-bye");
        }

        /*
        Objective:
        Write a program which prompts the user to input his/her name.
        The program should greet users whose names are 'Alice' and 'Bob'.

        Instructions:
        Understand how to get input from user
        Create conditional to check against Alice and Bob
        Print greeting to screen if Alice or Bob are true

        */
    }
}
