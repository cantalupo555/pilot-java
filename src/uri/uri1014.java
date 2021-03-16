package uri;

import java.util.Locale;
import java.util.Scanner;

public class uri1014 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        double Y = sc.nextDouble();
        double a = X / Y;
        sc.close();

        System.out.printf("%.3f km/l%n", a);
    }
}

// https://www.urionlinejudge.com.br/judge/problems/view/1014