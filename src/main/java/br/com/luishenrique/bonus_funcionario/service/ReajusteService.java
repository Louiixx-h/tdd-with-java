package br.com.luishenrique.bonus_funcionario.service;

import br.com.luishenrique.bonus_funcionario.model.Desempenho;
import br.com.luishenrique.bonus_funcionario.model.Funcionario;

import java.math.BigDecimal;

public class ReajusteService {

    public void concederReajuste(Funcionario funcionario, Desempenho desempenho) {
        BigDecimal novoSalario = funcionario.getSalario().multiply(desempenho.percentualReajuste());
        funcionario.setReajusteSalario(novoSalario);
    }
}
