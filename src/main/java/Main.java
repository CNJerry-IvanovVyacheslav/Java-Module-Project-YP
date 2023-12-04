import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    static int allFriends;
    static double allCost;
    public static void main(String[] args) {

        checkYourFriends();
        result();
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
            } else {Calculate.calculate(); allFriends = howManyFriends; } // добавить цикл?

        }

    }

        public static String result() {
            double equallySum = allCost / allFriends;
            var rounding = String.format("%.2f", equallySum);
            var equallySumToInteger = Math.floor(equallySum);
            var endingOfWords = getEndingOfWords(equallySumToInteger);
            return rounding + "рубл" + endingOfWords;

        }

        public static String getEndingOfWords(double equallySumToInteger) {
        if (equallySumToInteger % 10 == 1) {
            return "ь";
        } else if (equallySumToInteger % 10 == 2 || equallySumToInteger % 10 == 3 || equallySumToInteger % 10 == 4) {
            return "я";
        } else {
            return "ей";
        }
    }




}

