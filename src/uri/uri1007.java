package uri;

import java.util.Scanner;

public class uri1007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A, B, C, D, r;
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();
        r = (A * B) - (C * D);
        System.out.println("DIFERENCA = " + r);

    }
}

// https://www.urionlinejudge.com.br/judge/problems/view/1007