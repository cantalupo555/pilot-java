package uri;

import java.util.Locale;
import java.util.Scanner;

public class uri1010 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codigo1, unidade1, codigo2, unidade2;
        double preco1, subtotal1, preco2, subtotal2, total;

        codigo1 = sc.nextInt();
        unidade1 = sc.nextInt();
        preco1 = sc.nextDouble();
        subtotal1 = preco1 * (double)unidade1;

        codigo2 = sc.nextInt();
        unidade2 = sc.nextInt();
        preco2 = sc.nextDouble();
        subtotal2 = preco2 * (double)unidade2;

        total = subtotal1 + subtotal2;

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
        sc.close();
    }
}

// https://www.urionlinejudge.com.br/judge/problems/view/1010