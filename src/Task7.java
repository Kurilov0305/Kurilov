import java.util.Random;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Random random = new Random();
        int secretNumber = random.nextInt(9) + 1;
        Scanner scanner = new Scanner(System.in);
        int attempts = 3;

        while (attempts > 0) {
            System.out.println("Угадайте число от 1 до 9: ");
            int guess = scanner.nextInt();
            if (guess < secretNumber) {
                System.out.println("Загаданное число больше.");
            } else if (guess > secretNumber) {
                System.out.println("Загаданное число меньше.");
            } else {
                System.out.println("Поздравляю, вы угадали!");
                return;
            }
            attempts--;
        }
        System.out.println("Попытки закончились. Загаданное число было: " + secretNumber);
    }
}