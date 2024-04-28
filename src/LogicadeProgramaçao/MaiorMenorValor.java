package LogicadeProgramaçao;

import java.util.Scanner;

public class MaiorMenorValor {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        double Numero, Maior = 0.0, Menor = 999999999;
        String Continuar = "S";
        while (Continuar.equals("S")) {
            System.out.println("Digite um numero inteiro: ");
            Numero = S.nextInt();
            if (Numero > Maior) {
                Maior = Numero;
            }
            if (Numero < Menor) {
                Menor = Numero;
            }
            System.out.println("Quer continuar:(S/N) ");
            Continuar = S.next();
        }
        System.out.println("O maior numero digitado é: " + Maior);
        System.out.println("O menor numero digitado é: " + Menor);
    }
}
