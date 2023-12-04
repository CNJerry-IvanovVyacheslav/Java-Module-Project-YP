// Создает список товаров и их общую стоимость

import java.util.Scanner;

public class Calculate {
    private static final Scanner scanner = new Scanner(System.in);
    public static void calculate() {

        String productLine = "";
        Product product = new Product();

        while (true) {
            System.out.println("Какой товар вы купили?");
            //String yourProduct = product.product;
            product.product = scanner.nextLine();

            productLine = productLine + " \n" + product.product;
            System.out.println("Товар " + product.product + " успешно добавлен в список!");

            System.out.println("Сколько это стоило?");
            //double thisCost = Product.cost;
            double allCost = Product.cost + scanner.nextDouble();

            System.out.println("Желаете добавить новый товар?");
            String isEnough = scanner.next();
            if (isEnough.equalsIgnoreCase("Завершить")) {
                System.out.println("Ваш список покупок состоит из: " + productLine + ".\nОбщей стоимостью: " + allCost + " рублей.");
                break;
            }
        }
    }
}
