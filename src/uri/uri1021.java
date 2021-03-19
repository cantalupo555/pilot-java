package uri;

import java.util.Locale;
import java.util.Scanner;

public class uri1021 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double valorInformado = sc.nextDouble();
        sc.close();
        int valor;

        System.out.println("NOTAS:");
        valor = (int) valorInformado / 100;
        System.out.println( valor + " nota(s) de R$ 100.00" );
        valorInformado = valorInformado % 100;

        valor = (int) valorInformado / 50;
        System.out.println( valor + " nota(s) de R$ 50.00" );
        valorInformado = valorInformado % 50;

        valor = (int) valorInformado / 20;
        System.out.println( valor + " nota(s) de R$ 20.00" );
        valorInformado = valorInformado % 20;

        valor = (int) valorInformado / 10;
        System.out.println( valor + " nota(s) de R$ 10.00" );
        valorInformado = valorInformado % 10;

        valor = (int) valorInformado / 5;
        System.out.println( valor + " nota(s) de R$ 5.00" );
        valorInformado = valorInformado % 5;

        valor = (int) valorInformado / 2;
        System.out.println( valor + " nota(s) de R$ 2.00" );
        valorInformado = valorInformado % 2;

        System.out.println("MOEDAS:");
        valorInformado = valorInformado * 100;
        valor = (int) valorInformado / 100;
        System.out.println( valor + " moeda(s) de R$ 1.00" );
        valorInformado = valorInformado % 100;

        valor = (int) valorInformado / 50;
        System.out.println( valor + " moeda(s) de R$ 0.50" );
        valorInformado = valorInformado % 50;

        valor = (int) valorInformado / 25;
        System.out.println( valor + " moeda(s) de R$ 0.25" );
        valorInformado = valorInformado % 25;

        valor = (int) valorInformado / 10;
        System.out.println( valor + " moeda(s) de R$ 0.10" );
        valorInformado = valorInformado % 10;

        valor = (int) valorInformado / 5;
        System.out.println( valor + " moeda(s) de R$ 0.05" );
        valorInformado = valorInformado % 5;

        valor = (int) valorInformado;
        System.out.println( valor + " moeda(s) de R$ 0.01" );
    }
}

// https://www.urionlinejudge.com.br/judge/problems/view/1021