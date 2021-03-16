package uri;

import java.util.Locale;
import java.util.Scanner;

public class uri1006 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double notaA, notaB, notaC, media;
        notaA = sc.nextDouble() * 2;
        notaB = sc.nextDouble() * 3;
        notaC = sc.nextDouble() * 5;
        media = (notaA + notaB + notaC) / 10;
        System.out.printf("MEDIA = %.1f%n", media);
        sc.close();

    }
}

// https://www.urionlinejudge.com.br/judge/problems/view/1006