package br.com.cielo.extrato.lancamento.model.legado;

import java.util.List;

/**
 * @author Jhonatas Oliveira
 *
 */
public class LancamentoLegado {
	private List<ListaControleLancamento> listaControleLancamento;
	private TotalControleLancamento totalControleLancamento;
	private int indice;
	private int tamanhoPagina;
	private int totalElements;

	/**
	 * @param listaControleLancamento
	 * @param totalControleLancamento
	 * @param indice
	 * @param tamanhoPagina
	 * @param totalElements
	 */
	public LancamentoLegado(List<ListaControleLancamento> listaControleLancamento,
			TotalControleLancamento totalControleLancamento, int indice, int tamanhoPagina, int totalElements) {
		super();
		this.listaControleLancamento = listaControleLancamento;
		this.totalControleLancamento = totalControleLancamento;
		this.indice = indice;
		this.tamanhoPagina = tamanhoPagina;
		this.totalElements = totalElements;
	}

	/**
	 * @return the listaControleLancamento
	 */
	public List<ListaControleLancamento> getListaControleLancamento() {
		return listaControleLancamento;
	}

	/**
	 * @param listaControleLancamento
	 *            the listaControleLancamento to set
	 */
	public void setListaControleLancamento(List<ListaControleLancamento> listaControleLancamento) {
		this.listaControleLancamento = listaControleLancamento;
	}

	/**
	 * @return the totalControleLancamento
	 */
	public TotalControleLancamento getTotalControleLancamento() {
		return totalControleLancamento;
	}

	/**
	 * @param totalControleLancamento
	 *            the totalControleLancamento to set
	 */
	public void setTotalControleLancamento(TotalControleLancamento totalControleLancamento) {
		this.totalControleLancamento = totalControleLancamento;
	}

	/**
	 * @return the indice
	 */
	public int getIndice() {
		return indice;
	}

	/**
	 * @param indice
	 *            the indice to set
	 */
	public void setIndice(int indice) {
		this.indice = indice;
	}

	/**
	 * @return the tamanhoPagina
	 */
	public int getTamanhoPagina() {
		return tamanhoPagina;
	}

	/**
	 * @param tamanhoPagina
	 *            the tamanhoPagina to set
	 */
	public void setTamanhoPagina(int tamanhoPagina) {
		this.tamanhoPagina = tamanhoPagina;
	}

	/**
	 * @return the totalElements
	 */
	public int getTotalElements() {
		return totalElements;
	}

	/**
	 * @param totalElements
	 *            the totalElements to set
	 */
	public void setTotalElements(int totalElements) {
		this.totalElements = totalElements;
	}

	@Override
	public String toString() {
		return "Lancamento [listaControleLancamento=" + listaControleLancamento + ", totalControleLancamento="
				+ totalControleLancamento + ", indice=" + indice + ", tamanhoPagina=" + tamanhoPagina
				+ ", totalElements=" + totalElements + "]";
	}

}
