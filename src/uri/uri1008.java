package uri;

import java.util.Locale;
import java.util.Scanner;

public class uri1008 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int funcionario, horas;
        double valorHora, salario;
        funcionario = sc.nextInt();
        horas = sc.nextInt();
        valorHora = sc.nextDouble();
        salario = (double) horas * valorHora;
        System.out.println("NUMBER = " + funcionario);
        System.out.printf("SALARY = U$ %.2f%n", salario);
        sc.close();

    }
}

// https://www.urionlinejudge.com.br/judge/problems/view/1008