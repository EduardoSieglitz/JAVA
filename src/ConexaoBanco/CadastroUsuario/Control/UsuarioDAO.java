package ConexaoBanco.CadastroUsuario.Control;

import ConexaoBanco.CadastroUsuario.Conexao;
import ConexaoBanco.CadastroUsuario.Model.UsuarioDados;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
    public class UsuarioDAO {
        private Connection Conectar;

        public UsuarioDAO(){
            Conectar = new Conexao().getConectar();
        }
        public void CadastroDados(UsuarioDados dados){
            try{
                String sql = "INSERT INTO td_usuario(nome, sobrenome, email, senha) VALUES"
                        + "(?, ?, ?, ?)";
                PreparedStatement Insert = Conectar.prepareStatement(sql);
                Insert.setString(1, dados.getNome());
                Insert.setString(2, dados.getSobrenome());
                Insert.setString(3, dados.getEmail());
                Insert.setString(4, dados.getSenha());
                Insert.execute();
                Insert.close();
                JOptionPane.showMessageDialog(null, " Conectar ");
            }catch(Exception erro){
                JOptionPane.showMessageDialog(null, " Erro " + erro);
            }
        }
    }
