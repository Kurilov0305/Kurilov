import java.util.Scanner;

public class Practicheskai1 {
    public static void main(String[] args) {
        double[] expenses = new double[30];
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Меню:");
            System.out.println("1 – Ввести расходы за определенный день");
            System.out.println("2 – Траты за месяц");
            System.out.println("3 – Самая большая сумма расхода за месяц");
            System.out.println("0 – Выход");
            int choice = scanner.nextInt();

            if (choice == 0) {
                System.out.println("До свидания!");
                break;
            } else if (choice == 1) {
                System.out.println("Введите день (от 1 до 30):");
                int day = scanner.nextInt();
                System.out.println("Введите сумму трат за этот день:");
                double amount = scanner.nextDouble();

                if (expenses[day - 1] > 0) {
                    System.out.println("На этот день уже указана сумма: "  + expenses[day - 1] + " руб. Заменить? (y/n)");
                    String replace = scanner.next();
                    if (replace.equalsIgnoreCase("y")) {
                        expenses[day - 1] = amount;
                    }

                } else {
                    expenses[day - 1] = amount;
                }
            } else if (choice == 2) {
                for (int i = 0; i < expenses.length; i++) {
                    if (expenses[i] > 0) {
                        System.out.println((i + 1) + " день – " + expenses[i] + " руб");
                    }
                }
            } else if (choice == 3) {
                double maxExpense = 0;
                int maxDay = 0;
                for (int i = 0; i < expenses.length; i++) {
                    if (expenses[i] > maxExpense) {
                        maxExpense = expenses[i];
                        maxDay = i + 1;
                    }
                }
                System.out.println("Самая большая сумма расхода за месяц: " + maxDay + " день – " + maxExpense + " руб");
            }
        }
    }
}

