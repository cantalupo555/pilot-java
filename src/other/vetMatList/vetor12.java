package other.vetMatList;

import other.vetMatList.entities.averagePrice;

import java.util.Locale;
import java.util.Scanner;

public class vetor12 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        averagePrice[] vect = new averagePrice[N];

        for (int i=0; i<vect.length; i++) {
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            vect[i] = new averagePrice(name, price);
        }

        double sum = 0;
        for (int i=0; i<vect.length; i++) {
            sum += vect[i].getPrice();
        }

        double average = sum / vect.length;
        System.out.printf("AVERAGE PRICE = %.2f%n", average);

        sc.close();
    }
}
