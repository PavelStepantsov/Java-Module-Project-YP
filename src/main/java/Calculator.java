import java.util.Scanner;

public class Calculator {
    static Scanner scanner = new Scanner(System.in);
    String allProducts = " "; // список всех продуктов
    double totalCost = 0.0; // стоимости всех продуктов
    String productName = " ";// название продукта
    double productCost = 0.0;// цена продукта
    int persons = 2;// минимальное значение, чтобы метод работал
    double finalResult = 0.2f;// заплатит каждый с округлением до 2х чисел после точки
    void calculate() {
        while (true) {
            System.out.println("Введите название товара");
            productName = scanner.next();// сканируем и запоминаем ввод пользователя
            allProducts += productName + "\n"; // формируем список товаров
            System.out.println("Введите стоимость товара");
            productCost = scanner.nextDouble(); //сканируем и запоминаем ввод пользователя
            totalCost += productCost;// формируем общую сумму за все товары
            System.out.println("Товар успешно добавлен, хотите добавить еще один товар? - пишите \"да\". Если нет - напишите \"завершить\"");// выводим пользователю сообщение о дальнейших действиях
            String stop = scanner.next();
            if (stop.equalsIgnoreCase("завершить")) {
                System.out.println("Готово, больше товары добавить нельзя");
                System.out.println("Вы добавили:" + "\n" + allProducts + " на сумму: " + totalCost);
                break;
            }
        }
    }
    void vivod() {
        finalResult = totalCost / persons;
        Math.floor(finalResult);
        if (finalResult < 2) {
            System.out.println("Каждый должен заплатить по: " + finalResult + " рубль");
        } else if (finalResult >= 5) {
            System.out.println("Каждый должен заплатить по: " + finalResult + " рублей");
        } else {
            System.out.println("Каждый должен заплатить по: " + finalResult + " рубля");
        }
    }
}
