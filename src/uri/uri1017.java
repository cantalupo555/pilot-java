package uri;

import java.util.Locale;
import java.util.Scanner;

public class uri1017 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int tempo = sc.nextInt();
        int velocidade = sc.nextInt();
        sc.close();
        int distancia = tempo * velocidade;
        double consumoLitros = (double)distancia / 12.0;

        System.out.printf("%.3f%n", consumoLitros);
    }
}

// https://www.urionlinejudge.com.br/judge/problems/view/1017