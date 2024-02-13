import java.util.Scanner;

public class zadanie_12_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Зарплата: ");
        double salary = scanner.nextDouble();

        System.out.print("Затраты на транспорт: ");
        double transportExpenses = scanner.nextDouble();

        System.out.print("Затраты на еду: ");
        double foodExpenses = scanner.nextDouble();

        System.out.print("Сумма возможных сбережений: ");
        double savings = scanner.nextDouble();

        double totalExpenses = transportExpenses + foodExpenses;
        double surplusOrDeficit = salary - totalExpenses;

        if (surplusOrDeficit > 0) {
            System.out.println("Излишек средств: " + surplusOrDeficit);
            System.out.println("Разместите пожалуйста излишки на сберегательный счет(рекомендация).");
        } else if (surplusOrDeficit < 0) {
            System.out.println("Недостаточно средств: " + Math.abs(surplusOrDeficit));
            System.out.println( "Пересмотрите свои затраты и возможно планирование более эффективного бюджета(рекомендация).");
        } else {
            System.out.println("Расходы совпадают с зарплатой!");
            System.out.println("Планируйте свои траты денег так, чтобы расходы соответствовали вашему уровню дохода,пожалуйста! :)");
        }
    }
}
