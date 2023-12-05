// Создает список товаров и их общую стоимость

import java.util.Scanner;

public class Calculate {
    static double allCost;

    private static final Scanner scanner = new Scanner(System.in);
    public static void calculate() {

        String productLine = "";
        Product product = new Product();
        String yourProduct = product.product;
        double thisCost = product.cost;
        while (true) {
            System.out.println("Какой товар вы купили?");
            yourProduct = scanner.next();
            productLine = productLine + " \n" + yourProduct;
            System.out.println("Товар " + yourProduct + " успешно добавлен в список!");

            System.out.println("Сколько это стоило?");

            double allCost = thisCost += scanner.nextDouble();

            System.out.println("Желаете добавить новый товар?");
            String isEnough = scanner.next();
            if (isEnough.equalsIgnoreCase("Завершить")) {
                System.out.println("Ваш список покупок состоит из: " + productLine + ".\nОбщей стоимостью: " + allCost + " рубл" + getEndingOfWords(allCost));
                result();
                break;
            }
        }
    }
    public static void result() {
        double equallySum = allCost / Main.allFriends;
        var equallySumToInteger = Math.floor(equallySum);
        var endingOfWords = getEndingOfWords(equallySumToInteger);
        System.out.println("Всем необходимо заплатить: " + equallySum + " рубл" + endingOfWords);

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
