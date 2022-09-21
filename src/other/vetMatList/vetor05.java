package other.vetMatList;

import java.util.Scanner;

public class vetor05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] vet = new int[N];

        for (int i=0; i<N; i++) {
            vet[i] = sc.nextInt();
        }

        int quantidade = 0;
        for (int vetC : vet) {
            if (vetC % 2 == 0) {
                System.out.print(vetC + " ");
                quantidade = quantidade + 1;
            }
        }
        System.out.println("\n" + quantidade);

        sc.close();
    }
}
