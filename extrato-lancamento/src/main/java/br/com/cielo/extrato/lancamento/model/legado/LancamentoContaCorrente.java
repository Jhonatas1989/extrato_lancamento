package br.com.cielo.extrato.lancamento.model.legado;

import java.io.Serializable;
import java.util.List;

/**
 * @author Jhonatas Oliveira
 *
 */
@SuppressWarnings("rawtypes")
public class LancamentoContaCorrente implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private long numeroRemessaBanco;
	private String nomeSituacaoRemessa;
	private DomicilioBancario dadosDomicilioBancario;
	private String nomeTipoOperacao;
	private List dadosAnaliticoLancamentoFinanceiroCliente;

	public LancamentoContaCorrente(long numeroRemessaBanco, String nomeSituacaoRemessa,
			DomicilioBancario dadosDomicilioBancario, String nomeTipoOperacao,
			List dadosAnaliticoLancamentoFinanceiroCliente) {
		super();
		this.numeroRemessaBanco = numeroRemessaBanco;
		this.nomeSituacaoRemessa = nomeSituacaoRemessa;
		this.dadosDomicilioBancario = dadosDomicilioBancario;
		this.nomeTipoOperacao = nomeTipoOperacao;
		this.dadosAnaliticoLancamentoFinanceiroCliente = dadosAnaliticoLancamentoFinanceiroCliente;
	}

	/**
	 * @return the numeroRemessaBanco
	 */
	public long getNumeroRemessaBanco() {
		return numeroRemessaBanco;
	}

	/**
	 * @param numeroRemessaBanco
	 *            the numeroRemessaBanco to set
	 */
	public void setNumeroRemessaBanco(long numeroRemessaBanco) {
		this.numeroRemessaBanco = numeroRemessaBanco;
	}

	/**
	 * @return the nomeSituacaoRemessa
	 */
	public String getNomeSituacaoRemessa() {
		return nomeSituacaoRemessa;
	}

	/**
	 * @param nomeSituacaoRemessa
	 *            the nomeSituacaoRemessa to set
	 */
	public void setNomeSituacaoRemessa(String nomeSituacaoRemessa) {
		this.nomeSituacaoRemessa = nomeSituacaoRemessa;
	}

	/**
	 * @return the dadosDomicilioBancario
	 */
	public DomicilioBancario getDadosDomicilioBancario() {
		return dadosDomicilioBancario;
	}

	/**
	 * @param dadosDomicilioBancario
	 *            the dadosDomicilioBancario to set
	 */
	public void setDadosDomicilioBancario(DomicilioBancario dadosDomicilioBancario) {
		this.dadosDomicilioBancario = dadosDomicilioBancario;
	}

	/**
	 * @return the nomeTipoOperacao
	 */
	public String getNomeTipoOperacao() {
		return nomeTipoOperacao;
	}

	/**
	 * @param nomeTipoOperacao
	 *            the nomeTipoOperacao to set
	 */
	public void setNomeTipoOperacao(String nomeTipoOperacao) {
		this.nomeTipoOperacao = nomeTipoOperacao;
	}

	/**
	 * @return the dadosAnaliticoLancamentoFinanceiroCliente
	 */
	public List getDadosAnaliticoLancamentoFinanceiroCliente() {
		return dadosAnaliticoLancamentoFinanceiroCliente;
	}

	/**
	 * @param dadosAnaliticoLancamentoFinanceiroCliente
	 *            the dadosAnaliticoLancamentoFinanceiroCliente to set
	 */
	public void setDadosAnaliticoLancamentoFinanceiroCliente(List dadosAnaliticoLancamentoFinanceiroCliente) {
		this.dadosAnaliticoLancamentoFinanceiroCliente = dadosAnaliticoLancamentoFinanceiroCliente;
	}

	@Override
	public String toString() {
		return "LancamentoContaCorrente [numeroRemessaBanco=" + numeroRemessaBanco + ", nomeSituacaoRemessa="
				+ nomeSituacaoRemessa + ", dadosDomicilioBancario=" + dadosDomicilioBancario + ", nomeTipoOperacao="
				+ nomeTipoOperacao + ", dadosAnaliticoLancamentoFinanceiroCliente="
				+ dadosAnaliticoLancamentoFinanceiroCliente + "]";
	}

}
