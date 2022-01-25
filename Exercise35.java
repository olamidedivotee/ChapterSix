package ChapterSix;

import java.security.SecureRandom;
import java.util.Scanner;

public class Exercise35 {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        Scanner scanner = new Scanner(System.in);
        boolean correct = false;

        while (!correct) {
            int number1 = 1 + random.nextInt(9);
            int number2 = 1 + random.nextInt(9);
            int product = number1 * number2;

            System.out.printf("How much is %d times %d? ", number1, number2);
            int answer = scanner.nextInt();

            if (answer != product) {
                System.out.printf("No. Please try again.%n%n");
            } else {
                System.out.printf("Very good!%n%n");

                correct = true;
            }
        }
    }
}
