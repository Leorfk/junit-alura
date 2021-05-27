package br.com.alura.tdd.service;

import br.com.alura.tdd.enums.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReajusteServiceTest {

    @Test
    public void reajusteSalarioTresPorCento(){
        ReajusteService reajusteService = new ReajusteService();
        Funcionario funcionario = new Funcionario("xap", LocalDate.now(), new BigDecimal("1000"));
        reajusteService.concederReajuste(funcionario, Desempenho.RUIM);
        assertEquals(new BigDecimal("1030.00"), funcionario.getSalario());
    }

    @Test
    public void reajusteSalarioDezPorCento(){
        ReajusteService reajusteService = new ReajusteService();
        Funcionario funcionario = new Funcionario("xap", LocalDate.now(), new BigDecimal("1000"));
        reajusteService.concederReajuste(funcionario, Desempenho.BOM);
        assertEquals(new BigDecimal("1100.00"), funcionario.getSalario());
    }

    @Test
    public void reajusteSalarioVintePorCento(){
        ReajusteService reajusteService = new ReajusteService();
        Funcionario funcionario = new Funcionario("xap", LocalDate.now(), new BigDecimal("1000"));
        reajusteService.concederReajuste(funcionario, Desempenho.REPETACULAR);
        assertEquals(new BigDecimal("1200.00"), funcionario.getSalario());
    }
}
