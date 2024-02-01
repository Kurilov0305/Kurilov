import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество блюд: ");
        int numDishes = scanner.nextInt();
        System.out.print("Введите количество жидкости для мытья посуды: ");
        double dishwashingLiquid = scanner.nextDouble();

        for (int i = 1; i <= numDishes; i++) {
            if (dishwashingLiquid >= 0.5) {
                dishwashingLiquid -= 0.5;
                System.out.println("Блюдо " + i + " промытое. Оставшееся средство для мытья посуды: " + dishwashingLiquid);
            } else {
                System.out.println("Недостаточно жидкости для мытья посуды, чтобы вымыть другую посуду.");
                break;
            }
        }
    }
}