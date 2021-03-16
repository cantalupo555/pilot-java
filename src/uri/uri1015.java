package uri;

import java.util.Locale;
import java.util.Scanner;

public class uri1015 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        sc.close();

        double distancia = Math.sqrt(Math.pow((x2 - x1), 2.0) + Math.pow((y2 - y1), 2.0));

        System.out.printf("%.4f%n", distancia);
    }
}

// https://www.urionlinejudge.com.br/judge/problems/view/1015