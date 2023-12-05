// Создает список товаров и их общую стоимость

import java.util.Scanner;

public class Calculate {
    static double allCost;

    private static final Scanner scanner = new Scanner(System.in);
    // инициация товаров и расчет их общей стоимости
    public static void calculate() {

        String productLine = "";
        String yourProduct;

        while (true) {
            System.out.println("Какой товар вы купили?");

            yourProduct = scanner.next();
            productLine = productLine + " \n" + yourProduct;
            System.out.println("Товар " + yourProduct + " успешно добавлен в список!");

            System.out.println("Сколько это стоило?");
            if (!scanner.hasNextInt()) {
                System.out.println("Введена не цифра! повторите ввод.");
            }
                System.out.println("Введена отрицательная стоимость. Повторите еще раз.");

                allCost += scanner.nextDouble();

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
