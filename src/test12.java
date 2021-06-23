import java.util.Locale;
import java.util.Scanner;

public class test12 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double preco = 50.0;
        System.out.println("Quantos minutos foram utilizados?");
        int minutos = sc.nextInt();

            if (minutos > 60) {
                int minutosE = (minutos - 60) * 2;
                double precoE = (double) minutosE + preco;
                System.out.printf("Valor a pagar: %.2f%n", precoE);
            }
            else {
                System.out.printf("Valor a pagar: %.2f%n", preco);
            }
        sc.close();
    }
}