package vetMat;

import java.util.Scanner;

public class matriz4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        int[][] mat = new int[M][M];

        for (int i=0; i<M; i++) {
            for (int j=0; j<M; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        int vet[] = new int[M];
        for (int i=0; i<M; i++) {
            int soma = 0;
            for (int j=0; j<M; j++) {
                soma += mat[i][j];
            }
            vet[i] = soma;
        }

        for (int vetP : vet) {
            System.out.println(vetP);
        }

        sc.close();
    }
}
