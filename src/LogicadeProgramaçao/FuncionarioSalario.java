package LogicadeProgramaçao;

import java.util.Scanner;

public class FuncionarioSalario {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        double Salario, TotalSalario = 0.0;
        int QuantidadeFuncionario = 0;
        String Confirma = "";
        boolean Continuar = true;
        while(Continuar){
            System.out.println("Salario do funcionario: ");
            Salario = S.nextDouble();
            TotalSalario += Salario;
            QuantidadeFuncionario++;
            System.out.println("Quer continuar: ");
            Confirma = S.next();
            if(Confirma.equals("N")){
                Continuar = false;
            }
        }
        System.out.println("Total Salario dos funcionarios: " + TotalSalario);
        System.out.println("Quantidade total de funcionarios: " + QuantidadeFuncionario);
    }
}
