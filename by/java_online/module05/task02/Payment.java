package by.java_online.module05.task02;

import java.util.ArrayList;
import java.util.List;

public class Payment {
    private int paymentNumber;
    private List<Product> products;
    private double totalCost;

    private class Product {
        private String productName;
        private double productCost;
        private int numberOfProduct;

        public Product() {
            productName = "";
            productCost = 0;
            numberOfProduct = 0;
        }

        public Product(String productName, double productCost, int numberOfProduct) {
            this.productName = productName;
            this.productCost = productCost;
            this.numberOfProduct = numberOfProduct;
        }

        public String getProductName() {
            return productName;
        }

        public double getProductCost() {
            return productCost;
        }

        public int getNumberOfProduct() {
            return numberOfProduct;
        }
    }

    public Payment(int paymentNumber ) {
        this.paymentNumber = paymentNumber;
        products = new ArrayList<>();
        totalCost = 0;
    }

    public void addProduct(String productName, double productCost, int numberOfProduct) {
        products.add(new Product(productName, productCost, numberOfProduct));
        totalCost += productCost * numberOfProduct;
    }


    public void printInfoAboutPayment() {
        System.out.println("Payment number " + paymentNumber);
        System.out.println("-------------------------------");

        for (Product product : products) {
            double cost;
            cost = product.getProductCost() + product.getNumberOfProduct();

            System.out.println(product.getProductName() + ": " + product.getProductCost() + " * " +
                               product.getNumberOfProduct() + " = " + cost);
        }

        System.out.println("-------------------------------");
        System.out.printf("totalCost: %.2f", totalCost);
    }
}