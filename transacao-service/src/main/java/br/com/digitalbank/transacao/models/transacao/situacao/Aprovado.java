package br.com.digitalbank.transacao.models.transacao.situacao;

import java.math.BigDecimal;

import br.com.digitalbank.transacao.models.transacao.Transacao;

public class Aprovado extends SituacaoTransacao {
	
	public BigDecimal calculaValorTarifaExtra(Transacao transacao) {
		return transacao.getValor().multiply(new BigDecimal("0.02"));
	}

	@Override
	public void finaliza(Transacao transacao) {
		transacao.setSituacao(new Finalizado());
	}
}
