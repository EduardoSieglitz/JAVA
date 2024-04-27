package LogicadeProgramaçao;

import java.util.Scanner;

public class MaiorValor {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int Valor1, Valor2, Valor3;
        System.out.println("Digite o primeiro valor inteiro: ");
        Valor1 = S.nextInt();
        System.out.println("Digite o segundo valor inteiro: ");
        Valor2 = S.nextInt();
        System.out.println("Digite o terceiro valor inteiro: ");
        Valor3 = S.nextInt();
        if (Valor1 > Valor2 && Valor1 > Valor3) {
            System.out.println("O primeiro valor é o maoir: " + Valor1);
        } else if(Valor2 > Valor1 && Valor2 > Valor3){
            System.out.println("O segundo valor é o maoir: " + Valor2);
        }else if(Valor3 > Valor2 && Valor3 > Valor1){
            System.out.println("O terceiro valor é o maoir: " + Valor3);
        }else if(Valor1 == Valor2 && Valor1 > Valor3){
            System.out.println("O primeiro e o segundo são os maior valores: " + Valor1);
        }else if(Valor2 == Valor3 && Valor3 > Valor1){
            System.out.println("O segundo e o terceiro são os maior valores: " + Valor2);
        }else if(Valor3 == Valor1 && Valor3 > Valor2){
            System.out.println("O primeiro e o terceiro são os maior valores: " + Valor3);
        }else{
            System.out.println("Todos os valores são iguais: " + Valor3);
        }
        S.close();
    }
}
