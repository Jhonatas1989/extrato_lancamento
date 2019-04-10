package br.com.cielo.extrato.lancamento.model.legado;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author Jhonatas Oliveira
 *
 */
public class ListaControleLancamento implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private LancamentoContaCorrente lancamentoContaCorrenteCliente;
	private String dataEfetivaLancamento;
	private String dataLancamentoContaCorrenteCliente;
	private long numeroEvento;
	private String descricaoGrupoPagamento;
	private int codigoIdentificadorUnico;
	private String nomeBanco;
	private int quantidadeLancamentoRemessa;
	private long numeroRaizCNPJ;
	private String numeroSufixoCNPJ;
	private BigDecimal valorLancamentoRemessa;
	private long dateLancamentoContaCorrenteCliente;
	private long dateEfetivaLancamento;

	/**
	 * @param lancamentoContaCorrenteCliente
	 * @param dataEfetivaLancamento
	 * @param dataLancamentoContaCorrenteCliente
	 * @param numeroEvento
	 * @param descricaoGrupoPagamento
	 * @param codigoIdentificadorUnico
	 * @param nomeBanco
	 * @param quantidadeLancamentoRemessa
	 * @param numeroRaizCNPJ
	 * @param numeroSufixoCNPJ
	 * @param valorLancamentoRemessa
	 * @param dateLancamentoContaCorrenteCliente
	 * @param dateEfetivaLancamento
	 */
	public ListaControleLancamento(LancamentoContaCorrente lancamentoContaCorrenteCliente, String dataEfetivaLancamento,
			String dataLancamentoContaCorrenteCliente, long numeroEvento, String descricaoGrupoPagamento,
			int codigoIdentificadorUnico, String nomeBanco, int quantidadeLancamentoRemessa, long numeroRaizCNPJ,
			String numeroSufixoCNPJ, BigDecimal valorLancamentoRemessa, long dateLancamentoContaCorrenteCliente,
			long dateEfetivaLancamento) {
		super();
		this.lancamentoContaCorrenteCliente = lancamentoContaCorrenteCliente;
		this.dataEfetivaLancamento = dataEfetivaLancamento;
		this.dataLancamentoContaCorrenteCliente = dataLancamentoContaCorrenteCliente;
		this.numeroEvento = numeroEvento;
		this.descricaoGrupoPagamento = descricaoGrupoPagamento;
		this.codigoIdentificadorUnico = codigoIdentificadorUnico;
		this.nomeBanco = nomeBanco;
		this.quantidadeLancamentoRemessa = quantidadeLancamentoRemessa;
		this.numeroRaizCNPJ = numeroRaizCNPJ;
		this.numeroSufixoCNPJ = numeroSufixoCNPJ;
		this.valorLancamentoRemessa = valorLancamentoRemessa;
		this.dateLancamentoContaCorrenteCliente = dateLancamentoContaCorrenteCliente;
		this.dateEfetivaLancamento = dateEfetivaLancamento;
	}

	/**
	 * @return the lancamentoContaCorrenteCliente
	 */
	public LancamentoContaCorrente getLancamentoContaCorrenteCliente() {
		return lancamentoContaCorrenteCliente;
	}

	/**
	 * @param lancamentoContaCorrenteCliente the lancamentoContaCorrenteCliente to
	 *                                       set
	 */
	public void setLancamentoContaCorrenteCliente(LancamentoContaCorrente lancamentoContaCorrenteCliente) {
		this.lancamentoContaCorrenteCliente = lancamentoContaCorrenteCliente;
	}

	/**
	 * @return the dataEfetivaLancamento
	 */
	public String getDataEfetivaLancamento() {
		return dataEfetivaLancamento;
	}

	/**
	 * @param dataEfetivaLancamento the dataEfetivaLancamento to set
	 */
	public void setDataEfetivaLancamento(String dataEfetivaLancamento) {
		this.dataEfetivaLancamento = dataEfetivaLancamento;
	}

	/**
	 * @return the dataLancamentoContaCorrenteCliente
	 */
	public String getDataLancamentoContaCorrenteCliente() {
		return dataLancamentoContaCorrenteCliente;
	}

	/**
	 * @param dataLancamentoContaCorrenteCliente the
	 *                                           dataLancamentoContaCorrenteCliente
	 *                                           to set
	 */
	public void setDataLancamentoContaCorrenteCliente(String dataLancamentoContaCorrenteCliente) {
		this.dataLancamentoContaCorrenteCliente = dataLancamentoContaCorrenteCliente;
	}

	/**
	 * @return the numeroEvento
	 */
	public long getNumeroEvento() {
		return numeroEvento;
	}

	/**
	 * @param numeroEvento the numeroEvento to set
	 */
	public void setNumeroEvento(long numeroEvento) {
		this.numeroEvento = numeroEvento;
	}

	/**
	 * @return the descricaoGrupoPagamento
	 */
	public String getDescricaoGrupoPagamento() {
		return descricaoGrupoPagamento;
	}

	/**
	 * @param descricaoGrupoPagamento the descricaoGrupoPagamento to set
	 */
	public void setDescricaoGrupoPagamento(String descricaoGrupoPagamento) {
		this.descricaoGrupoPagamento = descricaoGrupoPagamento;
	}

	/**
	 * @return the codigoIdentificadorUnico
	 */
	public int getCodigoIdentificadorUnico() {
		return codigoIdentificadorUnico;
	}

	/**
	 * @param codigoIdentificadorUnico the codigoIdentificadorUnico to set
	 */
	public void setCodigoIdentificadorUnico(int codigoIdentificadorUnico) {
		this.codigoIdentificadorUnico = codigoIdentificadorUnico;
	}

	/**
	 * @return the nomeBanco
	 */
	public String getNomeBanco() {
		return nomeBanco;
	}

	/**
	 * @param nomeBanco the nomeBanco to set
	 */
	public void setNomeBanco(String nomeBanco) {
		this.nomeBanco = nomeBanco;
	}

	/**
	 * @return the quantidadeLancamentoRemessa
	 */
	public int getQuantidadeLancamentoRemessa() {
		return quantidadeLancamentoRemessa;
	}

	/**
	 * @param quantidadeLancamentoRemessa the quantidadeLancamentoRemessa to set
	 */
	public void setQuantidadeLancamentoRemessa(int quantidadeLancamentoRemessa) {
		this.quantidadeLancamentoRemessa = quantidadeLancamentoRemessa;
	}

	/**
	 * @return the numeroRaizCNPJ
	 */
	public long getNumeroRaizCNPJ() {
		return numeroRaizCNPJ;
	}

	/**
	 * @param numeroRaizCNPJ the numeroRaizCNPJ to set
	 */
	public void setNumeroRaizCNPJ(long numeroRaizCNPJ) {
		this.numeroRaizCNPJ = numeroRaizCNPJ;
	}

	/**
	 * @return the numeroSufixoCNPJ
	 */
	public String getNumeroSufixoCNPJ() {
		return numeroSufixoCNPJ;
	}

	/**
	 * @param numeroSufixoCNPJ the numeroSufixoCNPJ to set
	 */
	public void setNumeroSufixoCNPJ(String numeroSufixoCNPJ) {
		this.numeroSufixoCNPJ = numeroSufixoCNPJ;
	}

	/**
	 * @return the valorLancamentoRemessa
	 */
	public BigDecimal getValorLancamentoRemessa() {
		return valorLancamentoRemessa;
	}

	/**
	 * @param valorLancamentoRemessa the valorLancamentoRemessa to set
	 */
	public void setValorLancamentoRemessa(BigDecimal valorLancamentoRemessa) {
		this.valorLancamentoRemessa = valorLancamentoRemessa;
	}

	/**
	 * @return the dateLancamentoContaCorrenteCliente
	 */
	public long getDateLancamentoContaCorrenteCliente() {
		return dateLancamentoContaCorrenteCliente;
	}

	/**
	 * @param dateLancamentoContaCorrenteCliente the
	 *                                           dateLancamentoContaCorrenteCliente
	 *                                           to set
	 */
	public void setDateLancamentoContaCorrenteCliente(long dateLancamentoContaCorrenteCliente) {
		this.dateLancamentoContaCorrenteCliente = dateLancamentoContaCorrenteCliente;
	}

	/**
	 * @return the dateEfetivaLancamento
	 */
	public long getDateEfetivaLancamento() {
		return dateEfetivaLancamento;
	}

	/**
	 * @param dateEfetivaLancamento the dateEfetivaLancamento to set
	 */
	public void setDateEfetivaLancamento(long dateEfetivaLancamento) {
		this.dateEfetivaLancamento = dateEfetivaLancamento;
	}

	@Override
	public String toString() {
		return "ControleLancamento [lancamentoContaCorrenteCliente=" + lancamentoContaCorrenteCliente
				+ ", dataEfetivaLancamento=" + dataEfetivaLancamento + ", dataLancamentoContaCorrenteCliente="
				+ dataLancamentoContaCorrenteCliente + ", numeroEvento=" + numeroEvento + ", descricaoGrupoPagamento="
				+ descricaoGrupoPagamento + ", codigoIdentificadorUnico=" + codigoIdentificadorUnico + ", nomeBanco="
				+ nomeBanco + ", quantidadeLancamentoRemessa=" + quantidadeLancamentoRemessa + ", numeroRaizCNPJ="
				+ numeroRaizCNPJ + ", numeroSufixoCNPJ=" + numeroSufixoCNPJ + ", valorLancamentoRemessa="
				+ valorLancamentoRemessa + ", dateLancamentoContaCorrenteCliente=" + dateLancamentoContaCorrenteCliente
				+ ", dateEfetivaLancamento=" + dateEfetivaLancamento + "]";
	}

}
