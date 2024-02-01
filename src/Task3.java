import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int[] expenses = new int[7];
        Random random = new Random();

        for (int i = 0; i < expenses.length; i++) {
            expenses[i] = random.nextInt(1000);
        }

        System.out.println("Расходы за неделю:");
        for (int expense : expenses) {
            System.out.println(expense);
        }

        int totalExpenses = 0;
        for (int expense : expenses) {
            totalExpenses += expense;
        }
        System.out.println("Общие расходы за неделю: " + totalExpenses);
    }
}
