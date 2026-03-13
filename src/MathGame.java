import java.util.Random;
import java.util.Scanner;

// This is a simple math game for grade 3-5
// @Author Enter your name

public class MathGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random ();

        //Welcome Screen where student enters name

        System.out.println("╔══════════════════════════════════╗");
        System.out.println("║       WELCOME TO MATH GAME       ║");
        System.out.println("║      For Grade 3-5 Students      ║");
        System.out.println("╚══════════════════════════════════╝");
        System.out.println();

        System.out.println("Welcome to the MathGame 🥳");
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.print("Enter your class: ");
        int grade = input.nextInt();

        System.out.println("Good luck, " + name + "! Let's begin!");
        System.out.println("──────────────────────────────────");
        System.out.println();


        int count = 0; // Tracks the correct answers

        for (int i = 0; i < 10; i++) {
            int x = rand.nextInt(12) + 1;
            int y = rand.nextInt(12) + 1;
            System.out.printf("Question %d: What is %2d + %2d?%n", i + 1, x, y);
            System.out.print("Answer: ");

            int response = input.nextInt(); //Detects student responses
            int correct = x + y; //Calculate the correct answer

            if (response == correct) {
                System.out.println("Well done! That is correct answer.");
                count++;
            } else {
                System.out.println("Oops! That is wrong answer. The correct answer was " + correct);
            }
        }

        //Final message to print
        System.out.println("----------------");
        System.out.println("Thank you " + name + " for attending the Quiz.");
        System.out.println("Your score is " + count + " out of 10. ");

        if(count >= 8) {
            System.out.println("✨✨You are amazing!");
        }
        else {
            System.out.println("Keep practicing, you can do it again!");
        }
        System.out.println("Have a lovely day ahead!");
        System.out.print("-----------------");

        input.close();
    }
}