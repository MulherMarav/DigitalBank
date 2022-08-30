package br.com.digitalbank.conta.models.movimentacao;

import com.fasterxml.jackson.annotation.JsonValue;

public enum TipoMovimentacao {
	
	ANUAL("Anual", 12),
	
	MENSAL("Mensal", 1);
	
	private String descricao;
	
	private Integer tempo;

	TipoMovimentacao(String descricao, Integer tempo) {
		this.descricao = descricao;
		this.tempo = tempo;
	}

	@JsonValue
	public String getDescricao() {
		return descricao;
	}
	
	public Integer getTempo() {
		return tempo;
	}
}
