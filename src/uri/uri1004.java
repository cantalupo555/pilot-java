package uri;

import java.util.Scanner;

public class uri1004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, PROD;

        a = sc.nextInt();
        b = sc.nextInt();
        PROD = a * b;

        System.out.println("PROD = " + PROD);
        sc.close();
    }
}

// https://www.urionlinejudge.com.br/judge/problems/view/1004