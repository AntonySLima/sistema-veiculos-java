package exerciciogpt.heranca2.domain;

import java.util.Scanner;

public class Carro extends Veiculo {
    private int quantidadePortas;

    public Carro() {
        super();
    }

    public Carro(String marca, String modelo, int ano, int quantidadePortas) {
        super(marca, modelo, ano);
        this.quantidadePortas = quantidadePortas;
    }

    @Override
    public void exibeInformacoes() {
        super.exibeInformacoes();
        System.out.println("Quantidade de portas: " + this.quantidadePortas);
    }

    @Override
    public void leInformacoes(Scanner scanner) {
        super.leInformacoes(scanner);
        System.out.println("Quantidade de portas: ");
        this.quantidadePortas = scanner.nextInt();
    }
}
