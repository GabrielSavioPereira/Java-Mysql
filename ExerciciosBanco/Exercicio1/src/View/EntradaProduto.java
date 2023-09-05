package View;

import Model.Produto;

import java.util.Scanner;
public class EntradaProduto {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("******* CADASTRO DE PRODUTO *******");
        Produto dados = new Produto();
        System.out.println("Digite o nome do produto: ");
        dados.setNome_prod(scan.nextLine());
        System.out.println("Digite o codigo do produto: ");
        dados.setCod_prod(scan.nextLine());
        System.out.println("Digite o preço do produto: ");
        dados.setPreco_prod(scan.nextDouble());
        System.out.println("Digite a quantiade comprada: ");
        dados.setQtde_prod(scan.nextInt());
        dados.setTotal_prod(dados.getQtde_prod()* dados.getPreco_prod());
        Produto.enviarDados(dados);
    }
}
