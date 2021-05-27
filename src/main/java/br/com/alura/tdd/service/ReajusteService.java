package br.com.alura.tdd.service;

import br.com.alura.tdd.enums.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;

import java.math.BigDecimal;

public class ReajusteService {
    public void concederReajuste(Funcionario funcionario, Desempenho desempenho){
        BigDecimal reajuste = null;
                switch (desempenho){
            case RUIM:
                reajuste = funcionario.getSalario().multiply(new BigDecimal("0.03"));
                funcionario.reajustar(reajuste);
                break;
            case BOM:
                reajuste = funcionario.getSalario().multiply(new BigDecimal("0.10"));
                funcionario.reajustar(reajuste);
                break;
            case REPETACULAR:
                reajuste = funcionario.getSalario().multiply(new BigDecimal("0.20"));
                funcionario.reajustar(reajuste);
                break;
        }
    }
}
