package br.livro.entendendoalgoritmos;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SomaTest {

    @Test
    public void deveRetornarZeroPqArrayEhVazio(){
        Soma soma = new Soma();

        int resultado = soma.somar(new int[0]);

        Assertions.assertEquals(0, resultado);
    }

    @Test
    public void deveSomarDoisNumerosCorretamente(){
        Soma soma = new Soma();

        int resultado = soma.somar(new int[]{1, 2});

        Assertions.assertEquals(3, resultado);
    }

    @Test
    public void deveSomarMaisNumerosCorretamente(){
        Soma soma = new Soma();

        int resultado = soma.somar(new int[]{2, 4, 6});

        Assertions.assertEquals(12, resultado);
    }

    @Test
    public void deveRetornarOProprioNumero(){
        Soma soma = new Soma();

        int resultado = soma.somar(new int[]{2});

        Assertions.assertEquals(2, resultado);
    }
}
