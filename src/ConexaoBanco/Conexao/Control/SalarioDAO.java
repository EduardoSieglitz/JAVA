package Atividade02.Conexao.Control;

import Atividade02.Conexao.ConexaoBanco;
import Atividade02.Conexao.Model.DadosSalario;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class SalarioDAO {
    private Connection Conectar;
    public SalarioDAO(){
        Conectar = new ConexaoBanco().getConectar();
    }
    public void CadastroDados(DadosSalario dados){
        try{
            String sql = "INSERT INTO td_salario(nome, salario, setor, salarioaumento, salarioliquido , desconto) VALUES"
                    + "(?, ?, ?, ?, ?, ?)";
            PreparedStatement Insert = Conectar.prepareStatement(sql);
            Insert.setString(1, dados.getNome());
            Insert.setDouble(2, dados.getSalario());
            Insert.setString(3, dados.getSetor());
            Insert.setDouble(4, dados.getsalarioAumento());
            Insert.setDouble(5, dados.getSalarioLiquido());
            Insert.setDouble(6, dados.getDeconto());
            Insert.execute();
            Insert.close();
            JOptionPane.showMessageDialog(null, " Conectar ");
        }catch(Exception erro){
            JOptionPane.showMessageDialog(null, " Erro " + erro);
        }
    }
}
