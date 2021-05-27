package br.com.alura.tdd.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraServiceTest {

    CalculadoraService calculadoraService = new CalculadoraService();
    @Test
    public void calculadoraSomaDoisNumeros(){
        int toma = calculadoraService.somar(7,8);
        assertEquals(15,toma);
    }

    @Test
    public void calculadoraSubtraiDoisNumeros(){
        int mama = calculadoraService.subtrair(7,7);
        assertEquals(0,mama);
    }
}
