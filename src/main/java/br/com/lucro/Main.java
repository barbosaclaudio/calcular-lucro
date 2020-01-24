package br.com.lucro;

public class Main {

    public static void main(String[] args) {
        CalcularLucro calcularLucro = new CalcularLucro();
        System.out.println(calcularLucro.obterValorDoLucro(args[0]));
    }

}