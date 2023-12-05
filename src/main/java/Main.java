import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    static int allFriends;

    public static void main(String[] args) {

        checkYourFriends();
        Calculate.result();
    }

    // Проверяет на сколько человек разделить счет
    public static void checkYourFriends() {
        Calculate calculate = new Calculate();
        System.out.println("На сколько человек разбить счет?");
        int howManyFriends = 0;
        while (howManyFriends <= 2) {
            howManyFriends = scanner.nextInt();
            if (howManyFriends == 1) {
                System.out.println("Нет смысла делить счет когда вы одни! Попробуйте другое число.");
            } else if (howManyFriends <= 0) {
                System.out.println("Нарушены законы физики! Прекратите! Введите реальное число людей.");
            } else {allFriends = howManyFriends; Calculate.calculate();} // добавить цикл?

        }

    }
}
