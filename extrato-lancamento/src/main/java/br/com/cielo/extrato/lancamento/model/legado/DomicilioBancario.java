package br.com.cielo.extrato.lancamento.model.legado;

/**
 * @author Jhonatas Oliveira
 *
 */
public class DomicilioBancario {

	private int codigoBanco;
	private int numeroAgencia;
	private String numeroContaCorrente;

	/**
	 * @param codigoBanco
	 * @param numeroAgencia
	 * @param numeroContaCorrente
	 */
	public DomicilioBancario(int codigoBanco, int numeroAgencia, String numeroContaCorrente) {
		super();
		this.codigoBanco = codigoBanco;
		this.numeroAgencia = numeroAgencia;
		this.numeroContaCorrente = numeroContaCorrente;
	}

	/**
	 * @return the codigoBanco
	 */
	public int getCodigoBanco() {
		return codigoBanco;
	}

	/**
	 * @param codigoBanco
	 *            the codigoBanco to set
	 */
	public void setCodigoBanco(int codigoBanco) {
		this.codigoBanco = codigoBanco;
	}

	/**
	 * @return the numeroAgencia
	 */
	public int getNumeroAgencia() {
		return numeroAgencia;
	}

	/**
	 * @param numeroAgencia
	 *            the numeroAgencia to set
	 */
	public void setNumeroAgencia(int numeroAgencia) {
		this.numeroAgencia = numeroAgencia;
	}

	/**
	 * @return the numeroContaCorrente
	 */
	public String getNumeroContaCorrente() {
		return numeroContaCorrente;
	}

	/**
	 * @param numeroContaCorrente
	 *            the numeroContaCorrente to set
	 */
	public void setNumeroContaCorrente(String numeroContaCorrente) {
		this.numeroContaCorrente = numeroContaCorrente;
	}

	@Override
	public String toString() {
		return "DomicilioBancario [codigoBanco=" + codigoBanco + ", numeroAgencia=" + numeroAgencia
				+ ", numeroContaCorrente=" + numeroContaCorrente + "]";
	}

}
