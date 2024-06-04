package ConexaoBanco.CadastroUsuario.View;
import ConexaoBanco.CadastroUsuario.Model.UsuarioDados;

import java.util.Scanner;
public class Login {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        UsuarioDados Function = new UsuarioDados();
        System.out.print("Digite seu Nome: ");
        Function.setNome(S.next());
        System.out.print("Digite seu Sobrenome: ");
        Function.setSobrenome(S.next());
        System.out.print("Digite seu Email: ");
        Function.setEmail(S.next());
        System.out.print("Digite sua Senha: ");
        Function.setSenha(S.next());
        System.out.println("Verificando informações");
        System.out.println("Nome: " + Function.getNome() + "\nSobrenome: " + Function.getSobrenome() +
                "\nEmail: " + Function.getEmail() + "\nSenha: " + Function.getSenha());
        UsuarioDados.EnviarCadastro(Function);
    }
}
