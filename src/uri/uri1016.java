package uri;

import java.util.Scanner;

public class uri1016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tempoDistancia = sc.nextInt() * 2;
        sc.close();
        System.out.println(tempoDistancia + " minutos");
    }
}

/*Dois carros (X e Y) partem em uma mesma direção. O carro X sai com velocidade constante de 60 Km/h e o carro Y sai com velocidade constante de 90 Km/h.
Em uma hora (60 minutos) o carro Y consegue se distanciar 30 quilômetros do carro X, ou seja, consegue se afastar um quilômetro a cada 2 minutos.
Leia a distância (em Km) e calcule quanto tempo leva (em minutos) para o carro Y tomar essa distância do outro carro.

Entrada
O arquivo de entrada contém um número inteiro.

Saída
Imprima o tempo necessário seguido da mensagem "minutos".

https://www.urionlinejudge.com.br/judge/problems/view/1016 */