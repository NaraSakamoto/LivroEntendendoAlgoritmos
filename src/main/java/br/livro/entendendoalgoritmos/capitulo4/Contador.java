package br.livro.entendendoalgoritmos.capitulo4;

import java.util.Arrays;

/**
 * Implementação do exercício 4.2 do livro Entendendo Algoritmos de Aditya Y. Bhargava
 */
public class Contador {

    public int contar(int[] numeros){
        if(numeros.length < 1) {
            return 0;
        }

        int[] tail = Arrays.stream(numeros).skip(1).toArray();

        return 1 + contar(tail);
    }
}
