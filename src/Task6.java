import java.util.Calendar;

public class Task6 {
    public static void main(String[] args) {
        int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);

        if (hour < 4) {
            System.out.println("Доброй ночи!");
        } else if (hour < 12) {
            System.out.println("Доброе утро!");
        } else if (hour < 18) {
            System.out.println("Добрый день!");
        } else if (hour < 23) {
            System.out.println("Добрый вечер!");
        } else {
            System.out.println("Доброй ночи!");
        }
    }
}