package ConexaoBanco.CadastroUsuario.Model;
import ConexaoBanco.CadastroUsuario.Control.UsuarioDAO;

public class UsuarioDados {
    private String Nome, Sobrenome, Email, Senha;

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getSobrenome() {
        return Sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        Sobrenome = sobrenome;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String senha) {
        Senha = senha;
    }

    public static void EnviarCadastro(UsuarioDados dados){
        UsuarioDAO Enviar = new UsuarioDAO();
        Enviar.CadastroDados(dados);
    }
}
