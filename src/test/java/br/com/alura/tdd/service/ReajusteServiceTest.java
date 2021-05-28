package br.com.alura.tdd.service;

import br.com.alura.tdd.enums.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReajusteServiceTest {

    private ReajusteService reajusteService = new ReajusteService();
    private Funcionario funcionario = new Funcionario("xap", LocalDate.now(), new BigDecimal("1000"));

    @BeforeEach
    public void comecar(){
        this.reajusteService = new ReajusteService();
        this.funcionario = new Funcionario("xap", LocalDate.now(), new BigDecimal("1000"));
    }

    @Test
    public void reajusteSalarioTresPorCento(){
        reajusteService.concederReajuste(funcionario, Desempenho.RUIM);
        assertEquals(new BigDecimal("1030.00"), funcionario.getSalario());
    }

    @Test
    public void reajusteSalarioDezPorCento(){
        reajusteService.concederReajuste(funcionario, Desempenho.BOM);
        assertEquals(new BigDecimal("1100.00"), funcionario.getSalario());
    }

    @Test
    public void reajusteSalarioVintePorCento(){
        reajusteService.concederReajuste(funcionario, Desempenho.REPETACULAR);
        assertEquals(new BigDecimal("1200.00"), funcionario.getSalario());
    }
}
