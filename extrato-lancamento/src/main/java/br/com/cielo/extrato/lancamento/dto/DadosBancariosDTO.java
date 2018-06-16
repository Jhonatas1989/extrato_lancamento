package br.com.cielo.extrato.lancamento.dto;

import java.io.Serializable;

/**
 * @author Jhonatas Oliveira
 *
 */
public class DadosBancariosDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer agencia;
	private String nomeBanco;
	private String contaCorrente;

	/**
	 * 
	 */
	public DadosBancariosDTO() {
		super();
	}

	/**
	 * @return the agencia
	 */
	public Integer getAgencia() {
		return agencia;
	}

	/**
	 * @param agencia
	 *            the agencia to set
	 */
	public void setAgencia(Integer agencia) {
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
		return "DadosBancariosDTO [agencia=" + agencia + ", nomeBanco=" + nomeBanco + ", contaCorrente=" + contaCorrente
				+ "]";
	}

}
