package br.livro.entendendoalgoritmos;

import java.util.Arrays;
/**
 * Implementação do exercício 4.1 do livro Entendendo Algoritmos de Aditya Y. Bhargava
 */
public class Soma {

    public int somar(int[] numeros){

        if(numeros.length < 1) {
            return 0;
        }

        int[] tail = Arrays.stream(numeros).skip(1).toArray();
        return numeros[0] + somar(tail);
    }
}
