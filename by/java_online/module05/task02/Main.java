/*
 * Создать класс Payment с внутренним классом, с помощью объектов
 * которого можно сформировать покупку из нескольких товаров.
 */

package by.java_online.module05.task02;

public class Main {
    public static void main(String[] args) {
        Payment payment = new Payment(1425);

        payment.addProduct("Bread", 0.88, 2);
        payment.addProduct("Milk", 2.11, 1);
        payment.addProduct("Butter", 3.79, 1);
        payment.addProduct("Tea", 3.75, 1);
        payment.addProduct("Sugar", 1.50, 1);
        payment.addProduct("Yogurt", 1.22, 5);

        payment.printInfoAboutPayment();
    }
}