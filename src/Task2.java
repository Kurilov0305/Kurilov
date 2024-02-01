import java.util.Scanner;

public class Task2
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите сумму сбережений: ");
        double savings = scanner.nextDouble();
        double targetAmount = 1000000.0;
        double interestRate = 0.10;
        int years = 0;

        while (savings < targetAmount) {
            savings += savings * interestRate;
            years++;
        }

        System.out.println("Через " + years + " лет на счету будет " + targetAmount + " рублей");
    }
}
