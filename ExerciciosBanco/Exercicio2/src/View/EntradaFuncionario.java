package View;

import Model.Funcionario;

import java.util.Scanner;

public class EntradaFuncionario {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("***** DADOS FUNCIONARIOS *****");
        Funcionario dados = new Funcionario();
        System.out.println("Digite o nome do funcionario: ");
        dados.setNome_func(scan.nextLine());
        System.out.println("Digite o setor do funcionario: ");
        dados.setSetor_func(scan.nextLine());
        System.out.println("Digite salário do funcionario: ");
        dados.setSalar_func(scan.nextDouble());
        System.out.println("Digite o numero de filhos do funcionario: ");
        dados.setFilhos_func(scan.nextInt());
        dados.setAumento_func((dados.getSalar_func()*5)/100);
        dados.setNovosalar_func(dados.getAumento_func() + dados.getSalar_func());

        Funcionario.enviarDados(dados);


    }
}
