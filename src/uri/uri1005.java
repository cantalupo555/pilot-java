package uri;

import java.util.Locale;
import java.util.Scanner;

public class uri1005 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double notaA, notaB, media;
        notaA = sc.nextDouble() * 3.5;
        notaB = sc.nextDouble() * 7.5;
        media = (notaA + notaB) / 11;
        System.out.printf("MEDIA = %.5f%n", media);
        sc.close();

    }
}

// https://www.urionlinejudge.com.br/judge/problems/view/1005