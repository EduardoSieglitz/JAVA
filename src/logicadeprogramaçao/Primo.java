package LogicadeProgramaçao;

import java.util.Scanner;

public class Primo {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int Valor1, Valor2, Valor3, Quantidade = 0, Soma;
        System.out.print("Digite o primeiro valor: ");
        Valor1 = S.nextInt();
        System.out.print("Digite o segundo valor: ");
        Valor2 = S.nextInt();
        System.out.print("Digite o terceiro valor: ");
        Valor3 = S.nextInt();
        Soma = Valor1 + Valor2 + Valor3;
        for(int i = 1; i <= Soma; i++){
           if(Soma % i == 0){
           Quantidade++;
           }
        }
        ValidarPrimo(Quantidade);
        S.close();
    }
    public static void ValidarPrimo(int primo){
        if(primo == 2){
            System.out.print("É primo");
        }else{
            System.out.print("Não é primo");
        }

    }
}
