package uri;

import java.util.Scanner;

public class uri1020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int idadeDias = sc.nextInt();
        sc.close();
        int anos = idadeDias / 365;
        int restoAnos = idadeDias % 365;
        int meses = restoAnos / 30;
        int dias = restoAnos % 30;

        System.out.println( anos + " ano(s)" );
        System.out.println( meses + " mes(es)" );
        System.out.println( dias + " dia(s)" );
    }
}

// https://www.urionlinejudge.com.br/judge/problems/view/1020