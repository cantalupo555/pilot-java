import java.util.Scanner;

public class vetor9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String[] vetNome = new String[N];
        int[] vetIdade = new int[N];

        for (int i=0; i<N; i++) {
            vetNome[i] = sc.next();
            vetIdade[i] = sc.nextInt();
        }

        int idadeMaior = vetIdade[0];
        int posicao = 0;
        for (int i=0; i<N; i++) {
            if (vetIdade[i] > idadeMaior) {
                posicao = i;
            }
        }

        System.out.println("Pessoa mais velha: " + vetNome[posicao]);

        sc.close();
    }
}
