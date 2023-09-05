package Model;

import Control.DadosFuncionario;


public class Funcionario {
    private String nome_func;
    private String setor_func;
    private double salar_func;
    private int filhos_func;
    private double novosalar_func;
    private double aumento_func;

    public double getAumento_func() {
        return aumento_func;
    }

    public void setAumento_func(double aumento_func) {
        this.aumento_func = aumento_func;
    }

    public String getNome_func() {
        return nome_func;
    }

    public void setNome_func(String nome_func) {
        this.nome_func = nome_func;
    }

    public String getSetor_func() {
        return setor_func;
    }

    public void setSetor_func(String setor_func) {
        this.setor_func = setor_func;
    }

    public double getSalar_func() {
        return salar_func;
    }

    public void setSalar_func(double salar_func) {
        this.salar_func = salar_func;
    }

    public int getFilhos_func() {
        return filhos_func;
    }

    public void setFilhos_func(int filhos_func) {
        this.filhos_func = filhos_func;
    }

    public double getNovosalar_func() {
        return novosalar_func;
    }

    public void setNovosalar_func(double novosalar_func) {
        this.novosalar_func = novosalar_func;
    }

    public static void enviarDados(Funcionario dados) {
        DadosFuncionario enviar = new DadosFuncionario();
        enviar.cadastrarFuncionario(dados);

    }

}
