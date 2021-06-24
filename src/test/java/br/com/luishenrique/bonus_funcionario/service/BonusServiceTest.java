package br.com.luishenrique.bonus_funcionario.service;

import br.com.luishenrique.bonus_funcionario.model.Funcionario;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

public class BonusServiceTest {

    @Test
    public void bonusDeveriaZeroParaFuncionarioComSalarioMuitoAlto() {
        BonusService bonusService = new BonusService();

        BigDecimal bonus = bonusService.calcularBonus(new Funcionario(
                "Luis Henrique",
                LocalDate.now(),
                new BigDecimal("50000")
        ));

        Assertions.assertEquals(
                new BigDecimal("0.00"),
                bonus,
                "O bonus do funcionário não é 0.");
    }

    @Test
    public void bonusDeveriaDezPorCentoSalario() {
        BonusService bonusService = new BonusService();

        BigDecimal bonus = bonusService.calcularBonus(new Funcionario(
                "Luis Henrique",
                LocalDate.now(),
                new BigDecimal("1000")
        ));

        Assertions.assertEquals(
                new BigDecimal("100.00"),
                bonus,
                "O bonus do funcionário não é 10% do salário.");
    }

    @Test
    public void bonusDeveriaDarBonusDeDezPorCentoParaSalarioDeAte10000() {
        BonusService bonusService = new BonusService();

        BigDecimal bonus = bonusService.calcularBonus(new Funcionario(
                "Luis Henrique",
                LocalDate.now(),
                new BigDecimal("10000")
        ));

        Assertions.assertEquals(
                new BigDecimal("1000.00"),
                bonus,
                "O bonus para salário de 10000 tem que retornar 1000.");
    }
}
