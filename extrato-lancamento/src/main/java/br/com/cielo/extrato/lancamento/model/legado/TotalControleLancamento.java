package br.com.cielo.extrato.lancamento.model.legado;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author Jhonatas Oliveira
 *
 */
public class TotalControleLancamento implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int quantidadeLancamentos;
	private int quantidadeRemessas;
	private BigDecimal valorLancamentos;

	/**
	 * @param quantidadeLancamentos
	 * @param quantidadeRemessas
	 * @param valorLancamentos
	 */
	public TotalControleLancamento(int quantidadeLancamentos, int quantidadeRemessas, BigDecimal valorLancamentos) {
		super();
		this.quantidadeLancamentos = quantidadeLancamentos;
		this.quantidadeRemessas = quantidadeRemessas;
		this.valorLancamentos = valorLancamentos;
	}

	/**
	 * @return the quantidadeLancamentos
	 */
	public int getQuantidadeLancamentos() {
		return quantidadeLancamentos;
	}

	/**
	 * @param quantidadeLancamentos
	 *            the quantidadeLancamentos to set
	 */
	public void setQuantidadeLancamentos(int quantidadeLancamentos) {
		this.quantidadeLancamentos = quantidadeLancamentos;
	}

	/**
	 * @return the quantidadeRemessas
	 */
	public int getQuantidadeRemessas() {
		return quantidadeRemessas;
	}

	/**
	 * @param quantidadeRemessas
	 *            the quantidadeRemessas to set
	 */
	public void setQuantidadeRemessas(int quantidadeRemessas) {
		this.quantidadeRemessas = quantidadeRemessas;
	}

	/**
	 * @return the valorLancamentos
	 */
	public BigDecimal getValorLancamentos() {
		return valorLancamentos;
	}

	/**
	 * @param valorLancamentos
	 *            the valorLancamentos to set
	 */
	public void setValorLancamentos(BigDecimal valorLancamentos) {
		this.valorLancamentos = valorLancamentos;
	}

	@Override
	public String toString() {
		return "TotalControleLancamento [quantidadeLancamentos=" + quantidadeLancamentos + ", quantidadeRemessas="
				+ quantidadeRemessas + ", valorLancamentos=" + valorLancamentos + "]";
	}

}
