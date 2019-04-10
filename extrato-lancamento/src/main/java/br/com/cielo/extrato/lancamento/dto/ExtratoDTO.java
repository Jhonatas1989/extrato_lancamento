package br.com.cielo.extrato.lancamento.dto;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author Jhonatas Oliveira
 *
 */
public class ExtratoDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String dataLancamento;
	private String descricao;
	private long numero;
	private String situacao;
	private String dataConfirmacao;
	private DadosBancariosDTO dadosBancarios;
	private BigDecimal valorFinal;

	/**
	 * 
	 */
	public ExtratoDTO() {
		super();
	}

	/**
	 * @param dataLancamento
	 * @param descricao
	 * @param numero
	 * @param situacao
	 * @param dataConfirmacao
	 * @param dadosBancarios
	 * @param valorFinal
	 */
	public ExtratoDTO(String dataLancamento, String descricao, long numero, String situacao, String dataConfirmacao,
			DadosBancariosDTO dadosBancarios, BigDecimal valorFinal) {
		super();
		this.dataLancamento = dataLancamento;
		this.descricao = descricao;
		this.numero = numero;
		this.situacao = situacao;
		this.dataConfirmacao = dataConfirmacao;
		this.dadosBancarios = dadosBancarios;
		this.valorFinal = valorFinal;
	}

	/**
	 * @return the dataLancamento
	 */
	public String getDataLancamento() {
		return dataLancamento;
	}

	/**
	 * @param dataLancamento the dataLancamento to set
	 */
	public void setDataLancamento(String dataLancamento) {
		this.dataLancamento = dataLancamento;
	}

	/**
	 * @return the descricao
	 */
	public String getDescricao() {
		return descricao;
	}

	/**
	 * @param descricao the descricao to set
	 */
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	/**
	 * @return the numero
	 */
	public long getNumero() {
		return numero;
	}

	/**
	 * @param numero the numero to set
	 */
	public void setNumero(long numero) {
		this.numero = numero;
	}

	/**
	 * @return the situacao
	 */
	public String getSituacao() {
		return situacao;
	}

	/**
	 * @param situacao the situacao to set
	 */
	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	/**
	 * @return the dataConfirmacao
	 */
	public String getDataConfirmacao() {
		return dataConfirmacao;
	}

	/**
	 * @param dataConfirmacao the dataConfirmacao to set
	 */
	public void setDataConfirmacao(String dataConfirmacao) {
		this.dataConfirmacao = dataConfirmacao;
	}

	/**
	 * @return the dadosBancarios
	 */
	public DadosBancariosDTO getDadosBancarios() {
		return dadosBancarios;
	}

	/**
	 * @param dadosBancarios the dadosBancarios to set
	 */
	public void setDadosBancarios(DadosBancariosDTO dadosBancarios) {
		this.dadosBancarios = dadosBancarios;
	}

	/**
	 * @return the valorFinal
	 */
	public BigDecimal getValorFinal() {
		return valorFinal;
	}

	/**
	 * @param valorFinal the valorFinal to set
	 */
	public void setValorFinal(BigDecimal valorFinal) {
		this.valorFinal = valorFinal;
	}

	@Override
	public String toString() {
		return "ExtratoDTO [dataLancamento=" + dataLancamento + ", descricao=" + descricao + ", numero=" + numero
				+ ", situacao=" + situacao + ", dataConfirmacao=" + dataConfirmacao + ", dadosBancarios="
				+ dadosBancarios + ", valorFinal=" + valorFinal + "]";
	}

}
