package Control;

import BancoDados.ConexaoBanco;
import Model.Funcionario;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class DadosFuncionario {
    private Connection conectar;
    public DadosFuncionario(){
        this.conectar = new ConexaoBanco().getConnection();
    } public void cadastrarFuncionario(Funcionario dados) {
        try {
            String sql = "INSERT INTO tb_funcionario(nome_func, setor_func, salar_func, filhos_func, novosalar_func) VALUES" + "(?,?,?,?,?)";
            PreparedStatement inserir = conectar.prepareStatement(sql);
            inserir.setString(1, dados.getNome_func());
            inserir.setString(2, dados.getSetor_func());
            inserir.setDouble(3, dados.getSalar_func());
            inserir.setInt(4, dados.getFilhos_func());
            inserir.setDouble(5, dados.getNovosalar_func());
            inserir.execute();
            inserir.close();
            JOptionPane.showMessageDialog(null, "CADASTRO REALIZADO COM SUCESSO ");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "DEU ERRO " + e);
        }
    }
}
