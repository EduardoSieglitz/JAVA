package Atividade02.Conexao.Model;

import Atividade02.Conexao.Control.SalarioDAO;

public class DadosSalario {
    private String Nome, setor;
    private double salario, SalarioAumento, salarioLiquido, Desconto;

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }
    public double getSalarioLiquido(){
        if(SalarioAumento <= 2500){
        salarioLiquido = SalarioAumento;
        }else if(SalarioAumento <= 3000){
            salarioLiquido = SalarioAumento - (SalarioAumento * 1.5)/100;
        }else if(SalarioAumento <= 4000){
            salarioLiquido = SalarioAumento - (SalarioAumento * 2)/100;
        }else if(SalarioAumento > 4000){
            salarioLiquido = SalarioAumento - (SalarioAumento * 2.5)/100;
        }
        return salarioLiquido;
    }
    public double getsalarioAumento(){
        if(setor.equals("A")){
            SalarioAumento = salario + (salario * 3)/100;
        }else if(setor.equals("B")){
            SalarioAumento = salario + (salario * 4)/100;
        }else if(setor.equals("C")){
            SalarioAumento = salario + (salario * 5)/100;
        }else{
            SalarioAumento = salario + (salario * 6)/100;
        }
        return SalarioAumento;
    }
    public double getDeconto(){
        Desconto = SalarioAumento - salarioLiquido;
        return Desconto;
    }
    public static void EnviarCadastro(DadosSalario dados){
        SalarioDAO Enviar = new SalarioDAO();
        Enviar.CadastroDados(dados);
    }
}
