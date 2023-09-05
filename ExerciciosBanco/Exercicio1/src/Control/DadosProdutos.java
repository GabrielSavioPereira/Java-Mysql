package Control;

import Conexao.ConexaoBanco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import Model.Produto;
import javax.swing.*;
public class DadosProdutos {
    private Connection conectar;
    public DadosProdutos(){
        this.conectar = new ConexaoBanco().getConnection();
    }
    public void cadastrarProduto(Produto dados){
        try {
            String sql = "INSERT INTO tb_produto(nome_prod,cod_prod,preco_prod,qtde_prod,total_prod) VALUES"+"(?,?,?,?,?)";
            PreparedStatement inserir = conectar.prepareStatement(sql);
            inserir.setString(1,dados.getNome_prod());
            inserir.setString(2,dados.getCod_prod());
            inserir.setDouble(3,dados.getPreco_prod());
            inserir.setInt(4,dados.getQtde_prod());
            inserir.setDouble(5,dados.getTotal_prod());
            inserir.execute();
            inserir.close();
            JOptionPane.showMessageDialog(null,"CADASTRO REALIZADO COM SUCESSO");
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"DEU ERRO"+e);
        }
    }
}
