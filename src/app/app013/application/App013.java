package app.app013.application;

import app.app013.entities.ImportedProduct;
import app.app013.entities.Product;
import app.app013.entities.UsedProduct;

import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class App013 {
    public static void main(String []args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Lista
        List<Product> list = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int N = sc.nextInt();

        // Adicionando dados
        for (int i=0; i<N; i++) {
            System.out.println("Product #" + (i+1) + " data:");

            // Tipo do produto
            System.out.print("Common, used or imported (c/u/i)? ");
            char resp = sc.next().charAt(0);

            // Comum
            if (resp == 'c') {
                sc.nextLine();
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Price: ");
                Double price = sc.nextDouble();

                list.add(new Product(name, price));
            }
            // Importado
            else if (resp == 'i') {
                sc.nextLine();
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Price: ");
                Double price = sc.nextDouble();
                System.out.print("Customs fee: ");
                Double customsFee = sc.nextDouble();

                list.add(new ImportedProduct(name, price, customsFee));
            }
            // Usado
            else if (resp == 'u') {
                sc.nextLine();
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Price: ");
                Double price = sc.nextDouble();
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                Date manufactureDate = new SimpleDateFormat("dd/MM/yyyy").parse(sc.next());

                list.add(new UsedProduct(name, price, manufactureDate));
            }
        }

        // Acessar lista
        System.out.println("\nPRICE TAGS:");
        for (Product print : list) {
            System.out.println(print.priceTag());
        }

        sc.close();
    }
}
