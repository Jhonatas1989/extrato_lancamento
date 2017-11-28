package br.com.cielo.extrato.lancamento.model;

/**
 * @author Jhonatas Oliveira
 *
 */
public class DadosBancarios {

	private String agencia;
	private String nomeBanco;
	private String contaCorrente;

	/**
	 * @param agencia
	 * @param nomeBanco
	 * @param contaCorrente
	 */
	public DadosBancarios(String agencia, String nomeBanco, String contaCorrente) {
		super();
		this.agencia = agencia;
		this.nomeBanco = nomeBanco;
		this.contaCorrente = contaCorrente;
	}

	/**
	 * @return the agencia
	 */
	public String getAgencia() {
		return agencia;
	}

	/**
	 * @param agencia
	 *            the agencia to set
	 */
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	/**
	 * @return the nomeBanco
	 */
	public String getNomeBanco() {
		return nomeBanco;
	}

	/**
	 * @param nomeBanco
	 *            the nomeBanco to set
	 */
	public void setNomeBanco(String nomeBanco) {
		this.nomeBanco = nomeBanco;
	}

	/**
	 * @return the contaCorrente
	 */
	public String getContaCorrente() {
		return contaCorrente;
	}

	/**
	 * @param contaCorrente
	 *            the contaCorrente to set
	 */
	public void setContaCorrente(String contaCorrente) {
		this.contaCorrente = contaCorrente;
	}

	@Override
	public String toString() {
		return "DadosBancarios [agencia=" + agencia + ", nomeBanco=" + nomeBanco + ", contaCorrente=" + contaCorrente
				+ "]";
	}

}
