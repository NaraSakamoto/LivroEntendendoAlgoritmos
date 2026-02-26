package br.livro.entendendoalgoritmos.capitulo4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ContadorTest {

    @Test
    public void deveRetornarZeroPqArrayEhVazio(){
        Contador contador = new Contador();

        int resultado = contador.contar(new int[0]);

        Assertions.assertEquals(0, resultado);
    }

    @Test
    public void deveContarDoisNumerosCorretamente(){
        Contador contador = new Contador();

        int resultado = contador.contar(new int[]{1, 2});

        Assertions.assertEquals(2, resultado);
    }

    @Test
    public void deveContarMaisNumerosCorretamente(){
        Contador contador = new Contador();

        int resultado = contador.contar(new int[]{2, 4, 6});

        Assertions.assertEquals(3, resultado);
    }

    @Test
    public void deveContarUm(){
        Contador contador = new Contador();

        int resultado = contador.contar(new int[]{2});

        Assertions.assertEquals(1, resultado);
    }
}
