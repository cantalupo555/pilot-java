package other.test;

import java.util.Scanner;
import java.util.Locale;

public class test14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int idade = sc.nextInt();
        int soma = 0;
        int count = 0;

        if(idade < 0) {
            System.out.println("impossivel calcular");
        } else {
            while(idade >= 0){
                soma = soma + idade;
                count = count + 1;
                idade = sc.nextInt();
            }

            double media = (double) soma / count;
            System.out.printf("%.2f%n", media);
        }



    }
}
