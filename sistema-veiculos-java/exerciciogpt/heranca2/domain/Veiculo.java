package exerciciogpt.heranca2.domain;

import java.util.Scanner;

public class Veiculo {
    private String marca;
    private String modelo;
    private int ano;

    public Veiculo() {

    }

    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public void exibeInformacoes() {
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano: " + this.ano);
    }

    public void leInformacoes(Scanner scanner) {
        System.out.println("Digite as informações do " + this.getClass().getSimpleName());
        System.out.println("Marca: ");
        this.marca = scanner.nextLine();
        System.out.println("Modelo: ");
        this.modelo = scanner.nextLine();
        System.out.println("Ano: ");
        this.ano = Integer.parseInt(scanner.nextLine());
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
