package LogicadeProgramaçao;

import java.util.Scanner;

public class Operaçoes {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        double Numero1, Numero2; int Escolha;
        System.out.print("Digite o primeiro valor: ");
        Numero1 = S.nextInt();
        System.out.print("Digite o segundo valor: ");
        Numero2 = S.nextInt();
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.print("Escolha uma das opições: ");
        Escolha = S.nextInt();
        switch(Escolha){
            case 1:
                Soma(Numero1, Numero2);
                break;
            case 2:
                Subtraçao(Numero1, Numero2);
                break;
            case 3:
                Multiplicaçao(Numero1, Numero2);
                break;
            case 4:
                Divisao(Numero1, Numero2);
            default:
                System.out.println("Escolha uma das opições");
        }
        S.close();
    }
    public static void Soma(double Num1, double Num2){
        double Soma = Num1 + Num2;
        System.out.println("Soma: " + Soma);
    }
    public static void Subtraçao(double Num1, double Num2){
        double Subtracao = Num1 - Num2;
        System.out.println("Subtraçao: " + Subtracao);
    }
    public static void Multiplicaçao(double Num1, double Num2){
        double Multiplicaao = Num1 * Num2;
        System.out.println("Multiplicaçao: " + Multiplicaao);

    }
    public static void Divisao(double Num1, double Num2){
        double Divisao = Num1 / Num2;
        System.out.println("Divisão: " + Divisao);

    }
}
