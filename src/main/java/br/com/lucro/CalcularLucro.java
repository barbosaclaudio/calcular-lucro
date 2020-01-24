package br.com.lucro;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class CalcularLucro {

    public Integer obterValorDoLucro(int[] values) {
        return this.verificarLucro(values);
    }

    public Integer obterValorDoLucro(List<Integer> values) {
        int[] array = values.stream().mapToInt(Integer::valueOf).toArray();
        return this.verificarLucro(array);
    }

    public Integer obterValorDoLucro(String values) {
        String[] valoresDiarios = values.replace("[", "").replace("]", "").split(",");
        int[] array = Arrays.stream(valoresDiarios).mapToInt(Integer::valueOf).toArray();
        return this.verificarLucro(array);
    }

    private Integer verificarLucro(int[] array) {
        int max = Arrays.stream(array).max().getAsInt();
        int min = Arrays.stream(array).min().getAsInt();

        int indexMax = obterArrayAPartirDoIndex(array, max);
        int indexMin = obterArrayAPartirDoIndex(array, min);

        if (array.length != (indexMin + 1)) {
            if (indexMax < indexMin) {
                int[] arrayAux = criarArrayAuxiliar(array, indexMin, array.length);
                return verificarLucro(arrayAux);
            }
            return max - min;
        } else if (array[array.length - 1] == min) {
            int[] arrayAux = this.criarArrayAuxiliar(array, 0, (array.length - 1));
            if(arrayAux.length == 0) {
                return 0;
            }
            return verificarLucro(arrayAux);
        }
        return 0;
    }


    private int[] criarArrayAuxiliar(int[] array, int indexOrigem, int indexFinal) {
        return IntStream.range(indexOrigem, indexFinal)
                .map(i -> array[i])
                .toArray();
    }

    private int obterArrayAPartirDoIndex(int[] array, int max) {
        return IntStream.range(0, array.length)
                .filter(i -> max == array[i])
                .findFirst()
                .orElse(-1);
    }

}