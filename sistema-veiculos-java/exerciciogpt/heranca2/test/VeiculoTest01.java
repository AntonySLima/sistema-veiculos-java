package exerciciogpt.heranca2.test;

import exerciciogpt.heranca2.domain.Carro;
import exerciciogpt.heranca2.domain.Moto;
import exerciciogpt.heranca2.domain.Veiculo;

import java.util.Scanner;

public class VeiculoTest01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao, ano;
        String marca, modelo;

        do {
            System.out.println("Bem vindo ao sistema de gerenciamento de veículos!");
            System.out.println("1 - Criar um novo carro");
            System.out.println("2 - Criar uma nova moto");
            System.out.println("3 - Sair");
            System.out.println("Digite a opção desejada:");
            opcao = scanner.nextInt();
            scanner.nextLine();

            Veiculo veiculo = null;

            switch (opcao) {
                case 1:
                    veiculo = new Carro();
                    break;
                case 2:
                    veiculo = new Moto();
                    break;
                case 3:
                    System.out.println("Encerrando o sistema, obrigado por utilizar!");
                    break;
                default:
                    System.out.println("Opção inválida");
                    continue;
            }

            if (veiculo != null) {
                veiculo.leInformacoes(scanner);
                veiculo.exibeInformacoes();
            }

        } while (opcao != 3);
    }
}
