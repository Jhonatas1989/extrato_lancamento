package br.com.cielo.extrato.lancamento.model;

/**
 * @author Jhonatas Oliveira
 *
 */
public class Extrato {
	private String dataLancamento;
	private String descricao;
	private long numero;
	private String situacao;
	private String dataConfirmacao;
	private DadosBancarios dadosBancarios;
	private String valorFinal;

	/**
	 * @param dataCancelamento
	 * @param descricao
	 * @param numero
	 * @param situacao
	 * @param dataConfirmacao
	 * @param dadosBancarios
	 * @param valorFinal
	 */
	public Extrato(String dataLancelamento, String descricao, long numero, String situacao, String dataConfirmacao,
			DadosBancarios dadosBancarios, String valorFinal) {
		super();
		this.dataLancamento = dataLancelamento;
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
	 * @param dataLancamento
	 *            the dataLancamento to set
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
	 * @param descricao
	 *            the descricao to set
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
	 * @param numero
	 *            the numero to set
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
	 * @param situacao
	 *            the situacao to set
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
	 * @param dataConfirmacao
	 *            the dataConfirmacao to set
	 */
	public void setDataConfirmacao(String dataConfirmacao) {
		this.dataConfirmacao = dataConfirmacao;
	}

	/**
	 * @return the dadosBancarios
	 */
	public DadosBancarios getDadosBancarios() {
		return dadosBancarios;
	}

	/**
	 * @param dadosBancarios
	 *            the dadosBancarios to set
	 */
	public void setDadosBancarios(DadosBancarios dadosBancarios) {
		this.dadosBancarios = dadosBancarios;
	}

	/**
	 * @return the valorFinal
	 */
	public String getValorFinal() {
		return valorFinal;
	}

	/**
	 * @param valorFinal
	 *            the valorFinal to set
	 */
	public void setValorFinal(String valorFinal) {
		this.valorFinal = valorFinal;
	}

	@Override
	public String toString() {
		return "Extrato [dataLancelamento=" + dataLancamento + ", descricao=" + descricao + ", numero=" + numero
				+ ", situacao=" + situacao + ", dataConfirmacao=" + dataConfirmacao + ", dadosBancarios="
				+ dadosBancarios + ", valorFinal=" + valorFinal + "]";
	}

}
