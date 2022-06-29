import java.util.Locale;
import java.util.Scanner;

public class vetor11 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        char[] S = new char[N];
        double[] altura = new double[N];

        for (int i=0; i<N; i++) {
            altura[i] = sc.nextDouble();
            S[i] = sc.next().charAt(0);
        }

        double alturaMin = altura[0];
        double alturaMax = altura[0];
        double somaF = 0;
        int contF = 0;
        int contM = 0;
        for (int i=0; i<N; i++) {
            // Menor Altura
            if (altura[i] < alturaMin ) {
                alturaMin  = altura[i];
            }

            // Maior Altura
            if (altura[i] > alturaMax) {
                alturaMax = altura[i];
            }

            // Soma altura do sexo feminino + cont
            if (S[i] == 'F') {
                somaF += altura[i];
                contF++;
            }

            // cont sexo masculino
            if (S[i] == 'M') {
                contM++;
            }
        }

        // Media altura do sexo feminino
        double mediaF = 0;
        if (contF == 0) {
            System.out.println("Nao ha nenhuma mulher dentre as pessoa\n");
        } else {
            mediaF = somaF / (double) contF;
        }

        System.out.printf("Menor altura = %.2f%n", alturaMin);
        System.out.printf("Maior altura = %.2f%n", alturaMax);
        System.out.printf("Media das alturas das mulheres = %.2f%n", mediaF);
        System.out.println("Numero de homens = " + contM);

        sc.close();
    }
}
