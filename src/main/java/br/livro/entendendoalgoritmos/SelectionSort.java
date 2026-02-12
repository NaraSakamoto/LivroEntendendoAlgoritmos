package br.livro.entendendoalgoritmos;

import java.util.ArrayList;
import java.util.List;

/**
 * Implementação do pseudo-código apresentado na pág. 54 do livro Entendendo Algoritmos de Aditya Y. Bhargava
 */
public class SelectionSort {

    private static int buscarMenor(List<Integer> arr) {
        int menor = arr.get(0);
        int menorIndice = 0;

        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) < menor) {
                menor = arr.get(i);
                menorIndice = i;
            }
        }
        return menorIndice;
    }

    public static List<Integer> ordenacaoPorSelecao(List<Integer> arr) {
        List<Integer> novoArr = new ArrayList<>(arr.size());

        int tamanhoOriginal = arr.size();

        for (int i = 0; i < tamanhoOriginal; i++) {
            int menorIndice = buscarMenor(arr);
            novoArr.add(arr.remove(menorIndice));
        }

        return novoArr;
    }
}
