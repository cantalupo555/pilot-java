import java.util.Locale;
public class test3 {
    public static void main(String[] args) {
        System.out.print("Hello Word");
        System.out.println("Good Morning");
        System.out.print("Thank you\n");

        int a = 100;
        System.out.println(a);

        float b = (float) 20.1876557573;
        System.out.println(b);

        Locale.setDefault(Locale.US);
        double c = 20.1876557573;
        System.out.println(c);
        System.out.printf("%.2f%n", c);
        System.out.printf("%.4f\n", c);
        System.out.println("Resultado = " + c + " metros");
        System.out.printf("Resultado = %.2f metros\n\n", c);

        String nome = "Jonh";
        int idade = 26;
        double salario = 3450.38;
        System.out.printf("%s tem %d anos e recebe R$%.2f de remuneração", nome, idade, salario);
    }
}
