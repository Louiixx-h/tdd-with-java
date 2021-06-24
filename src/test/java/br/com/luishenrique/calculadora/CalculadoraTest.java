package br.com.luishenrique.calculadora;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    private Calculadora calculadora;

    @Test
    public void deveSomar() {
        calculadora = new Calculadora();
        Double valor = calculadora.somar(5.0, 5.0);
        Assertions.assertEquals(10.0, valor, "Os valores não são iguais.");
    }
}
