package uri;

import java.util.Scanner;

public class uri1013 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a, b, c, k, t;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        k = (a + b + Math.abs(a - b)) / 2;

        t = (k + c + Math.abs(k - c)) / 2;

        System.out.println(t + " eh o maior");

        sc.close();
    }
}

// https://www.urionlinejudge.com.br/judge/problems/view/1013