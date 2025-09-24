package exerciciogpt.heranca2.domain;

import java.util.Scanner;

public class Moto extends Veiculo{
    private boolean temCarenagem;

    public Moto() {
        super();
    }

    public Moto(String marca, String modelo, int ano, boolean temCarenagem) {
        super(marca, modelo, ano);
        this.temCarenagem = temCarenagem;
    }

    @Override
    public void exibeInformacoes() {
        super.exibeInformacoes();
        System.out.println("Tem carenagem?: " + this.temCarenagem);
    }

    @Override
    public void leInformacoes(Scanner scanner) {
        super.leInformacoes(scanner);
        System.out.println("Tem carenagem?: " + (this.temCarenagem ? "Sim" : "Não"));
        this.temCarenagem = scanner.nextBoolean();
    }
}
