package br.com.luishenrique.bonus_funcionario.service;

import br.com.luishenrique.bonus_funcionario.model.Desempenho;
import br.com.luishenrique.bonus_funcionario.model.Funcionario;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ReajustServiceTest {

    @Test
    public void reajusteDeveSer3PorCentoQuandoODsempenhoForADesejar() {
        ReajusteService reajusteService = new ReajusteService();
        Funcionario funcionario = new Funcionario(
                "Luis Henrique",
                LocalDate.now(),
                new BigDecimal("1000.00"));

        reajusteService.concederReajuste(funcionario, Desempenho.A_DESEJAR);

        Assertions.assertEquals(
                new BigDecimal("1030.00"),
                funcionario.getSalario(),
                "O reajuste não foi de 3%.");
    }

    @Test
    public void reajusteDeveSer10PorCentoQuandoODsempenhoForBom() {
        ReajusteService reajusteService = new ReajusteService();
        Funcionario funcionario = new Funcionario(
                "Luis Henrique",
                LocalDate.now(),
                new BigDecimal("1000.00"));

        reajusteService.concederReajuste(funcionario, Desempenho.BOM);

        Assertions.assertEquals(
                new BigDecimal("1100.00"),
                funcionario.getSalario(),
                "O reajuste não foi de 10%.");
    }

    @Test
    public void reajusteDeveSer20PorCentoQuandoODsempenhoForOtimo() {
        ReajusteService reajusteService = new ReajusteService();
        Funcionario funcionario = new Funcionario(
                "Luis Henrique",
                LocalDate.now(),
                new BigDecimal("1000.00"));

        reajusteService.concederReajuste(funcionario, Desempenho.OTIMO);

        Assertions.assertEquals(
                new BigDecimal("1200.00"),
                funcionario.getSalario(),
                "O reajuste não foi de 20%.");
    }
}
