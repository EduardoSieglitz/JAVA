package LogicadeProgramaçao;

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int Valor1, Valor2, Valor3;
        System.out.print("Digite o primeiro valor: ");
        Valor1 = S.nextInt();
        System.out.print("Digite o segundo valor: ");
        Valor2 = S.nextInt();
        System.out.print("Digite o terceiro valor: ");
        Valor3 = S.nextInt();
        int Soma = Valor1 + Valor2 + Valor3;
        if(Soma % 2 == 0){
            System.out.println(Soma + " É par");
        }else{
            System.out.println(Soma + " É impar");
        }
        S.close();
    }
}
