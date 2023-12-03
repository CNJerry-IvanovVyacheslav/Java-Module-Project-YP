import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        checkYourFriends();
    }

    // Проверяет на сколько человек разделить счет
    public static void checkYourFriends() {
        System.out.println("На сколько человек разбить счет?");
        int howManyFriends = 0;
        while (howManyFriends <= 2) {
            howManyFriends = scanner.nextInt();
            if (howManyFriends == 1) {
                System.out.println("Нет смысла делить счет когда вы одни! Попробуйте другое число.");
            } else if (howManyFriends <= 0) {
                System.out.println("Нарушены законы физики! Прекратите! Введите реальное число людей.");
            } else { calculate(); }
        }
    }

    // Создает список товаров и их общую стоимость
    public static void calculate() {
        double cost = 0.00;
        while (scanner.hasNext()) {
            System.out.println("Какой товар вы купили?");
            String product = scanner.next();
            if (product.equalsIgnoreCase("Завершить")) {
                break;
            }
            System.out.println("Сколько это стоило?");
            cost = cost + scanner.nextDouble();
        }

    }





}