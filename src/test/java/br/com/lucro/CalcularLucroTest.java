package br.com.lucro;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CalcularLucroTest {

    @Test
    @DisplayName("Obter Valor do Lucro com Sucesso CalcularLucro.obterValorDoLucro(int[] values)")
    public void obterValorDoLucroComSucessoPorArray() {
        CalcularLucro calcularLucro = new CalcularLucro();
        Integer lucro = calcularLucro.obterValorDoLucro(new int[]{1, 2, 5, 8, 6, 0,9});
        Assertions.assertEquals(lucro, 9);
    }

    @Test
    @DisplayName("Obter Valor do Lucro com Sucesso CalcularLucro.obterValorDoLucro(List<Integer> values)")
    public void obterValorDoLucroComSucessoPorList() {
        CalcularLucro calcularLucro = new CalcularLucro();
        List<Integer> values = new ArrayList<>(Arrays.asList(1, 2, 5, 8, 6));
        Integer lucro = calcularLucro.obterValorDoLucro(values);
        Assertions.assertEquals(lucro, 7);
    }

    @Test
    @DisplayName("Obter Valor do Lucro com Sucesso CalcularLucro.obterValorDoLucro(String[] values)")
    public void obterValorDoLucroComSucessoPorString() {
        CalcularLucro calcularLucro = new CalcularLucro();
        Integer lucro = calcularLucro.obterValorDoLucro("[7,1,5,3,6,4]");
        Assertions.assertEquals(lucro, 5);
    }

    @Test
    @DisplayName("Obter Valor do Lucro Zerado com Sucesso CalcularLucro.obterValorDoLucro(String[] values)")
    public void obterValorDoLucroComSucessoZerado() {
        CalcularLucro calcularLucro = new CalcularLucro();
        Integer lucro = calcularLucro.obterValorDoLucro("[7,6,5,4,3,1]");
        Assertions.assertEquals(lucro, 0);
    }
}