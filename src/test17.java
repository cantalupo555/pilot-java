import java.util.Locale;
import java.util.Scanner;

public class test17 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        char resp;
        do {
            System.out.println("Digite a temperatura em Celsius:");
            double tempC = sc.nextDouble();
            System.out.println("Equivalente em Fahrenheit:");
            double tempF = (9 * tempC / 5) + 32;
            System.out.printf("%.1f%n", tempF);
            System.out.println("Deseja repetir (s/n)?");
            resp = sc.next().charAt(0);
        } while(resp == 's');

        sc.close();
    }
}
