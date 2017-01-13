package org.fxapps.repasse.model;

public enum TipoAgregacao {

	AREA("Área", "AREA"), SUB_FUNCAO("Sub Função", "SUB_FUNCAO"), ACAO("Ação", "ACAO"), PROGRAMA("Programa", "PROGRAMA"), FAVORECIDO("Favorecido", "FAVORECIDO");

	private String nome;
	private String chave;
	
	private TipoAgregacao(String nome, String chave) {
		this.nome = nome;
		this.chave = chave;
	}
	
	public String getChave() {
		return chave;
	}

	@Override
	public String toString() {
		return this.nome;
	}
	
}
