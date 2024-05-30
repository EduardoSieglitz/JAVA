package Atividade02.Conexao.View;
import Atividade02.Conexao.Model.DadosSalario;

import java.util.Scanner;
public class InserirDadosSalario {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        DadosSalario Dados = new DadosSalario();
        System.out.println("Digte nome do funcionario: ");
        Dados.setNome(s.nextLine());
        System.out.println("Digite salario do funcionario: ");
        Dados.setSalario(s.nextDouble());
        System.out.println("Digite setor que o funcionario trabalha: ");
        Dados.setSetor(s.next());
        DadosSalario.EnviarCadastro(Dados);
    }
}
