package uri;

import java.util.Locale;
import java.util.Scanner;

public class uri1009 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String funcionario = sc.next();
        double salarioFixo = sc.nextDouble();
        double vendas = sc.nextDouble();
        double salarioFinal = ((vendas * 15) / 100) + salarioFixo;
        System.out.printf("TOTAL = R$ %.2f%n", salarioFinal);
        sc.close();

    }
}

// https://www.urionlinejudge.com.br/judge/problems/view/1009