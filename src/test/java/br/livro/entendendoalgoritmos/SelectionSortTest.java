package br.livro.entendendoalgoritmos;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class SelectionSortTest {

    @Test
    @DisplayName("Deve ordenar uma lista desordenada comum")
    void deveOrdenarListaComum() {
        List<Integer> entrada = new ArrayList<>(Arrays.asList(5, 3, 6, 2, 10));
        List<Integer> esperado = Arrays.asList(2, 3, 5, 6, 10);

        List<Integer> resultado = SelectionSort.ordenacaoPorSelecao(entrada);

        assertEquals(esperado, resultado, "A lista deveria estar em ordem crescente");
    }

    @Test
    @DisplayName("Deve lidar corretamente com uma lista vazia")
    void deveLidarComListaVazia() {
        List<Integer> entrada = new ArrayList<>();
        List<Integer> resultado = SelectionSort.ordenacaoPorSelecao(entrada);

        assertTrue(resultado.isEmpty(), "A lista resultante também deve estar vazia");
    }

    @Test
    @DisplayName("Deve ordenar uma lista que já está ordenada")
    void deveLidarComListaJaOrdenada() {
        List<Integer> entrada = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> esperado = Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> resultado = SelectionSort.ordenacaoPorSelecao(entrada);

        assertEquals(esperado, resultado);
    }

    @Test
    @DisplayName("Deve ordenar corretamente uma lista com números duplicados")
    void deveLidarComDuplicados() {
        List<Integer> entrada = new ArrayList<>(Arrays.asList(3, 1, 2, 1));
        List<Integer> esperado = Arrays.asList(1, 1, 2, 3);

        List<Integer> resultado = SelectionSort.ordenacaoPorSelecao(entrada);

        assertEquals(esperado, resultado);
    }

    @Test
    @DisplayName("Deve ordenar uma lista em ordem inversa")
    void deveOrdenarListaInversa() {
        List<Integer> entrada = new ArrayList<>(Arrays.asList(5, 4, 3, 2, 1));
        List<Integer> esperado = Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> resultado = SelectionSort.ordenacaoPorSelecao(entrada);

        assertEquals(esperado, resultado);
    }
}