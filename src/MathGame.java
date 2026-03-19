import java.util.Random;
import java.util.Scanner;
import static java.lang.reflect.Array.getInt;

// This is a simple math game for grade 3-5
// @Author Enter your name

public class MathGame {

    // Safe number reader - keeps asking until a number is typed
    public static int getInt(Scanner input, String message) {
        System.out.print(message);
        while (!input.hasNextInt()) {
            input.next();                    // throw away the bad input
            System.out.print("Numbers only! " + message);
        }
        return input.nextInt();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random ();

        //Welcome Screen where student enters name

        System.out.println("╔══════════════════════════════════╗");
        System.out.println("║       WELCOME TO MATH GAME       ║");
        System.out.println("║      For Grade 3-5 Students      ║");
        System.out.println("╚══════════════════════════════════╝");
        System.out.println();

        //Get name
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        //Get Grade
        int grade;
        do {
            grade = getInt(input, "Enter your grade (3, 4 or 5): ");
            if (grade != 3 && grade != 4 && grade != 5) {
                System.out.println("Invalid! Please enter 3, 4 or 5 only.");
            }
        } while (grade != 3 && grade != 4 && grade != 5);

        System.out.println("Good luck, " + name + "! Let's begin!");
        System.out.println("──────────────────────────────────");
        System.out.println();

        int count = 0; // Tracks the correct answers

        for (int i = 0; i < 10; i++) {
            int x = rand.nextInt(-1,101);
            int y = rand.nextInt(-1,101);

            // ODD questions (1, 3, 5, 7, 9) = ADDITION
            if (i % 2 == 0) {
                System.out.printf("Question %d: What is %2d + %2d?%n", i + 1, x, y);
                int response = getInt(input, "Answer: "); //Detects student responses
                int correct = x + y; //Calculate the correct answer

                if (response == correct) {
                    System.out.println("Well done! That is correct answer.");
                    count++;
                } else {
                    System.out.println("Oops! That is wrong answer. The correct answer was " + correct);
                }
            }

            // EVEN questions (2, 4, 6, 8, 10) = SUBTRACTION
            else {
                System.out.printf("Question %d: What is %2d - %2d?%n", i + 1, x, y);
                int response = getInt(input, "Answer: ");
//                System.out.print("Answer: ");
//                int response = input.nextInt(); //Detects student responses
                int correct = x - y; //Calculate the correct answer

                if (response == correct) {
                    System.out.println("Well done! That is correct answer.");
                    count++;
                } else {
                    System.out.println("Oops! That is wrong answer. The correct answer was " + correct);
                }
            }
        }
        input.close();

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


    }
}