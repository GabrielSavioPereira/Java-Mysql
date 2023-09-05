package Model;

import Control.DadosProdutos;

public class Produto {
    private String nome_prod;
    private String cod_prod;
    private double preco_prod;
    private int qtde_prod;
    private double total_prod;

    public String getNome_prod() {
        return nome_prod;
    }

    public void setNome_prod(String nome_prod) {
        this.nome_prod = nome_prod;
    }

    public String getCod_prod() {
        return cod_prod;
    }

    public void setCod_prod(String cod_prod) {
        this.cod_prod = cod_prod;
    }

    public double getPreco_prod() {
        return preco_prod;
    }

    public void setPreco_prod(double preco_prod) {
        this.preco_prod = preco_prod;
    }

    public int getQtde_prod() {
        return qtde_prod;
    }

    public void setQtde_prod(int qtde_prod) {
        this.qtde_prod = qtde_prod;
    }

    public double getTotal_prod() {
        return total_prod;
    }

    public void setTotal_prod(double total_prod) {
        this.total_prod = total_prod;
    }
    public static void enviarDados(Produto dados){
        DadosProdutos enviar = new DadosProdutos();
        enviar.cadastrarProduto(dados);
    }
}
