package uri;

import java.util.Scanner;

public class uri1003 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a, b, s;

        a = sc.nextInt();
        b = sc.nextInt();
        s = a + b;

        System.out.println("SOMA = " + s);
        sc.close();

    }
}

// https://www.urionlinejudge.com.br/judge/problems/view/1003