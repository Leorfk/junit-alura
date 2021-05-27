package br.com.alura.tdd.service;

import br.com.alura.tdd.modelo.Funcionario;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import java.time.LocalDate;

public class BonusServiceTest {
    BonusService bonusService = new BonusService();

    @Test
    public void deveVerificarRegraDeBonusParaMerreca(){
        Funcionario funcionario = new Funcionario(
                "Toma",
                LocalDate.now(),
                new BigDecimal("2500.00"));
        BigDecimal bonus = bonusService.calcularBonus(funcionario);
        assertEquals(new BigDecimal("250.00"), bonus);
    }

    @Test
    public void deveVerificarRegraDeBonusZerado(){
        Funcionario funcionario = new Funcionario(
                "Toma",
                LocalDate.now(),
                new BigDecimal("25000.00"));
        BigDecimal bonus = bonusService.calcularBonus(funcionario);

        assertEquals(new BigDecimal("0.00"), bonus);
    }

    @Test
    public void deveGerarBonusPara10k(){
        Funcionario funcionario = new Funcionario(
                "Toma",
                LocalDate.now(),
                new BigDecimal("10000.00"));
        BigDecimal bonus = bonusService.calcularBonus(funcionario);

        assertEquals(new BigDecimal("1000.00"), bonus);
    }
}
