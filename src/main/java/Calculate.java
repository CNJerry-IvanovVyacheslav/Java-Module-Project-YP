// Создает список товаров и их общую стоимость
import java.util.Scanner;

public class Calculate {

    static double allCost;
    private static final Scanner scanner = new Scanner(System.in);

    // инициация товаров и расчет их общей стоимости
    public static void calculate() {

        StringBuilder productLine = new StringBuilder();
        String yourProduct;

        while (true) {
            System.out.println("Какой товар вы купили?");
            yourProduct = scanner.next();

            if (yourProduct.isEmpty()) {
                System.out.println("Товар не должен быть пустым!");
            } else if (yourProduct.trim().isEmpty()) {
                System.out.println("Товар не должен состоять только из пробелов!");
            }
            productLine.append(" \n").append(yourProduct);
            System.out.println("Товар " + yourProduct + " успешно добавлен в список!");
            System.out.println("Сколько это стоило?");

            while (!scanner.hasNextInt()) {
                scanner.next();
                System.out.println("Введена не цифра! Повторите ввод.");
            }
            double cost = scanner.nextDouble();

             while (cost < 0)  {
                 System.out.println("Введена отрицательная стоимость. Повторите еще раз.");
                 cost = scanner.nextDouble();
             }
            allCost += cost;
                System.out.println("Желаете добавить новый товар?");
                String isEnough = scanner.next();

                if (isEnough.equalsIgnoreCase("Завершить")) {
                    System.out.println("Ваш список покупок состоит из: " + productLine + ".\nОбщей стоимостью: " + allCost + " рубл" + getEndingOfWords(allCost));
                    result();
                    break;
                }
        }
    }
    // финальный расчет, сколько необходимо заплатить каждому человеку
    public static void result() {
        double equallySum = allCost / Main.allFriends;
        var equallySumToInteger = Math.floor(equallySum);
        var endingOfWords = getEndingOfWords(equallySumToInteger);
        System.out.println("Всем необходимо заплатить по " + equallySum + " рубл" + endingOfWords);
    }

    // функция для добавления правильного окончания
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
