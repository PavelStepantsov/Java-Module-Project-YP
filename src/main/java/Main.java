import java.util.Scanner;
public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("На скольких человек необходимо разделить счет");
        int persons = 0;
        while (true) {
            persons = scanner.nextInt();
            if (persons == 1) {
                System.out.println("Вы один и вам придется полностью оплатить счет");
            } else if (persons < 0) {
                System.out.println("Ошибка, введите корректное значение");
            }
            if (persons > 1) {
                break;
            }
        }
        Calculator calc = new Calculator();
    calc.calculate();
    calc.vivod();
    }
}














