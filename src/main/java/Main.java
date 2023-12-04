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
        System.out.println("На сколько человек разбить счет?");
        int howManyFriends = 0;
        while (howManyFriends <= 2) {
            howManyFriends = scanner.nextInt();
            if (howManyFriends == 1) {
                System.out.println("Нет смысла делить счет когда вы одни! Попробуйте другое число.");
            } else if (howManyFriends <= 0) {
                System.out.println("Нарушены законы физики! Прекратите! Введите реальное число людей.");
            } else {calculate(); allFriends = howManyFriends; } // добавить цикл?

        }

    }

  public static void calculate() {  // Создает список товаров и их общую стоимость
      double cost = 0.00;
      String productLine = "";

          while (true) {
              System.out.println("Какой товар вы купили?");

              String product = scanner.next();
              productLine = productLine + " \n" + product;
              System.out.println("Товар " + product + " успешно добавлен в список!");

              System.out.println("Сколько это стоило?");
              cost = cost + scanner.nextDouble();

              System.out.println("Желаете добавить новый товар?");
              String isEnough = scanner.next();
              if (isEnough.equalsIgnoreCase("Завершить")) {
                  System.out.println("Ваш список покупок состоит из: " + productLine + ".\nОбщей стоимостью: " + cost + " рублей.");
                  allCost = cost;
                  break;
              }
          }

  }
        public static void result() {
            double equallySum = allCost / allFriends;
            double equallySumInt = Math.floor(equallySum);
            String rub = " рубль.";
            String rubs = " рублей.";


        /*   if (equallySum %= 1) {System.out.println("Сумма, которую должен заплатить каждый = " + equallySum + " рубль.");
             } else { System.out.println("Сумма, которую должен заплатить каждый = " + equallySum + " рублей.");} */

        }






}