package app.app002.application;

import app.app002.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class App002 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product data:");
        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Price: ");
        double price = sc.nextDouble();

        System.out.print("Quantity in stock: ");
        int quantity = sc.nextInt();

        // Instanciar objeto
        Product product = new Product(name, price, quantity);

        System.out.println("\nProduct data: " + product + "\n");

        // Adicionando produto
        System.out.print("Enter the number of products to be added in stock: ");
        quantity = sc.nextInt();
        product.addProducts(quantity);
        System.out.println("\nUpdated data: " + product + "\n");

        // Removendo produto
        System.out.print("Enter the number of products to be removed from stock: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);
        System.out.println("\nUpdated data: " + product + "\n");

        sc.close();
    }
}
